package com.fourthline.vision.internal;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import com.fourthline.vision.internal.camera.view.glutils.GLDrawer2D;
import com.fourthline.vision.internal.z;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class n0 implements GLSurfaceView.Renderer, SurfaceTexture.OnFrameAvailableListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference f36587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SurfaceTexture f36588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f36589c;
    private GLDrawer2D d;
    private final float[] e;
    private final float[] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private v6 f36590g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile boolean f36591h;
    private boolean i;

    public n0(@NotNull z parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.f36587a = new WeakReference(parent);
        this.f36589c = -1;
        this.e = new float[16];
        float[] fArr = new float[16];
        this.f = fArr;
        this.i = true;
        Matrix.setIdentityM(fArr, 0);
    }

    private final void checkOesEglExtension() {
        String strGlGetString = GLES20.glGetString(7939);
        Intrinsics.h(strGlGetString);
        if (!kotlin.text.d0.J(strGlGetString, "OES_EGL_image_external", false)) {
            throw new RuntimeException("This system does not support OES_EGL_image_external.");
        }
    }

    private final void createDrawer() {
        GLDrawer2D gLDrawer2D = new GLDrawer2D();
        gLDrawer2D.setMatrix(this.f, 0);
        this.d = gLDrawer2D;
    }

    private final void createSurfaceTexture() {
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f36589c);
        surfaceTexture.setOnFrameAvailableListener(this);
        this.f36588b = surfaceTexture;
    }

    private final void createTextureId() {
        this.f36589c = GLDrawer2D.initTex();
    }

    private final void drawPreview() {
        GLDrawer2D gLDrawer2D = this.d;
        if (gLDrawer2D != null) {
            gLDrawer2D.draw(this.f36589c, this.e);
        }
    }

    private final void notifyNewFrameAvailableAt30Fps() {
        boolean z = this.i;
        this.i = !z;
        if (z) {
            return;
        }
        synchronized (this) {
            v6 v6Var = this.f36590g;
            if (v6Var != null) {
                v6Var.frameAvailableSoon(this.f36589c, this.e, this.f);
                Unit unit = Unit.f186387a;
            }
        }
    }

    private final void releaseDrawer() {
        GLDrawer2D gLDrawer2D = this.d;
        if (gLDrawer2D != null) {
            gLDrawer2D.release();
        }
        this.d = null;
    }

    private final void releaseSurfaceTexture() {
        getSurfaceTexture().release();
    }

    private final void resetFrame() {
        GLES20.glClear(16384);
    }

    private final void resetFrameToYellow() {
        GLES20.glClearColor(1.0f, 1.0f, BitmapDescriptorFactory.HUE_RED, 1.0f);
    }

    private final void resetTextureId() {
        GLDrawer2D.deleteTex(this.f36589c);
    }

    private final void tryNotifySurfaceCreated() {
        z zVar = (z) this.f36587a.get();
        if (zVar != null) {
            zVar.post(new bh(zVar, 0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void tryNotifySurfaceCreated$lambda$0$0(z zVar) {
        z.a aVar;
        WeakReference<z.a> listener = zVar.getListener();
        if (listener == null || (aVar = listener.get()) == null) {
            return;
        }
        aVar.onSurfaceCreated(zVar.getSurfaceTexture());
    }

    private final void tryNotifySurfaceDestroyed() {
        WeakReference<z.a> listener;
        z.a aVar;
        z zVar = (z) this.f36587a.get();
        if (zVar == null || (listener = zVar.getListener()) == null || (aVar = listener.get()) == null) {
            return;
        }
        aVar.onSurfaceDestroyed();
    }

    private final void updateTextureIfNecessary() {
        if (this.f36591h) {
            this.f36591h = false;
            SurfaceTexture surfaceTexture = getSurfaceTexture();
            if (surfaceTexture != null) {
                surfaceTexture.updateTexImage();
                surfaceTexture.getTransformMatrix(this.e);
            }
        }
    }

    private final void updateViewport() {
        z zVar = (z) this.f36587a.get();
        if (zVar != null) {
            GLES20.glViewport(0, 0, zVar.getWidth(), zVar.getHeight());
            resetFrame();
            Matrix.setIdentityM(this.f, 0);
            GLDrawer2D gLDrawer2D = this.d;
            if (gLDrawer2D != null) {
                gLDrawer2D.setMatrix(this.f, 0);
            }
        }
    }

    @NotNull
    public final SurfaceTexture getSurfaceTexture() {
        SurfaceTexture surfaceTexture = this.f36588b;
        if (surfaceTexture != null) {
            return surfaceTexture;
        }
        Intrinsics.r("surfaceTexture");
        throw null;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(@NotNull GL10 unused) {
        Intrinsics.checkNotNullParameter(unused, "unused");
        resetFrame();
        updateTextureIfNecessary();
        drawPreview();
        notifyNewFrameAvailableAt30Fps();
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(@NotNull SurfaceTexture st4) {
        Intrinsics.checkNotNullParameter(st4, "st");
        this.f36591h = true;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(@NotNull GL10 unused, int i, int i2) {
        Intrinsics.checkNotNullParameter(unused, "unused");
        updateViewport();
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(@NotNull GL10 unused, @NotNull EGLConfig config) {
        Intrinsics.checkNotNullParameter(unused, "unused");
        Intrinsics.checkNotNullParameter(config, "config");
        checkOesEglExtension();
        createTextureId();
        createSurfaceTexture();
        resetFrameToYellow();
        createDrawer();
        tryNotifySurfaceCreated();
    }

    public final void onSurfaceDestroyed() {
        releaseDrawer();
        releaseSurfaceTexture();
        resetTextureId();
        tryNotifySurfaceDestroyed();
        this.f36591h = false;
    }

    public final void setFrameListener(v6 v6Var) {
        this.f36590g = v6Var;
    }
}
