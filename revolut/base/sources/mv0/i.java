package mv0;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import androidx.media3.exoplayer.ExoPlayer;
import b9.w2;
import ix0.h1;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import skm.q;
import skm.r;

/* JADX INFO: loaded from: classes19.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SurfaceTexture f209075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExoPlayer f209076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FloatBuffer f209077c;
    public w2 d;
    public f e;
    public volatile Surface f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final HandlerThread f209078g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Handler f209079h;

    public i(SurfaceTexture onScreenSurfaceTexture, ExoPlayer player) {
        Intrinsics.checkNotNullParameter(onScreenSurfaceTexture, "onScreenSurfaceTexture");
        Intrinsics.checkNotNullParameter(player, "player");
        this.f209075a = onScreenSurfaceTexture;
        this.f209076b = player;
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(80).order(ByteOrder.nativeOrder()).asFloatBuffer();
        floatBufferAsFloatBuffer.put(a.f209069a).position(0);
        Intrinsics.checkNotNullExpressionValue(floatBufferAsFloatBuffer, "apply(...)");
        this.f209077c = floatBufferAsFloatBuffer;
        HandlerThread handlerThread = new HandlerThread(a0.d.n("TransparentVideoEngine Worker #", j.f209080b.incrementAndGet()));
        handlerThread.start();
        this.f209078g = handlerThread;
        this.f209079h = new Handler(handlerThread.getLooper(), new j4.d(this, 1));
    }

    public final void a(Message message) {
        w2 w2Var = this.d;
        if (w2Var != null) {
            EGL10 egl10 = (EGL10) w2Var.f13500c;
            EGLDisplay eGLDisplay = (EGLDisplay) w2Var.d;
            EGLSurface eGLSurface = (EGLSurface) w2Var.f13501g;
            EGLSurface eGLSurface2 = EGL10.EGL_NO_SURFACE;
            if (eGLSurface != eGLSurface2) {
                egl10.eglMakeCurrent(eGLDisplay, eGLSurface2, eGLSurface2, EGL10.EGL_NO_CONTEXT);
                egl10.eglDestroySurface(eGLDisplay, (EGLSurface) w2Var.f13501g);
            }
            egl10.eglDestroyContext(eGLDisplay, (EGLContext) w2Var.f);
            egl10.eglTerminate(eGLDisplay);
        }
        this.d = null;
        Object obj2 = message.obj;
        q qVar = (q) (obj2 instanceof q ? obj2 : null);
        if (qVar != null) {
            ((r) qVar).U(Unit.f186387a);
        }
        this.f209078g.quit();
    }

    public final void b() {
        f program;
        w2 w2Var = this.d;
        if (w2Var == null || (program = this.e) == null) {
            return;
        }
        SurfaceTexture surfaceTexture = program.d;
        Intrinsics.checkNotNullParameter(program, "program");
        surfaceTexture.updateTexImage();
        a.a("updateTexture");
        Intrinsics.checkNotNullParameter(program, "program");
        float[] fArr = a.f209070b;
        surfaceTexture.getTransformMatrix(fArr);
        GLES20.glUniformMatrix4fv(program.f209073c, 1, false, fArr, 0);
        a.a("updateTransformMatrix");
        int i = program.f209071a;
        FloatBuffer verticesBuffer = this.f209077c;
        Intrinsics.checkNotNullParameter(verticesBuffer, "verticesBuffer");
        verticesBuffer.position(0);
        GLES20.glVertexAttribPointer(i, 3, 5126, false, 20, (Buffer) verticesBuffer);
        GLES20.glEnableVertexAttribArray(i);
        a.a("setVertexPositions");
        int i2 = program.f209072b;
        Intrinsics.checkNotNullParameter(verticesBuffer, "verticesBuffer");
        verticesBuffer.position(3);
        GLES20.glVertexAttribPointer(i2, 2, 5126, false, 20, (Buffer) verticesBuffer);
        GLES20.glEnableVertexAttribArray(i2);
        a.a("setVertexPositions");
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glFinish();
        a.a("draw");
        ((EGL10) w2Var.f13500c).eglSwapBuffers((EGLDisplay) w2Var.d, (EGLSurface) w2Var.f13501g);
    }

    public final void c(Message message) {
        if (this.d != null) {
            return;
        }
        this.d = new w2(this.f209075a);
        GLES20.glViewport(0, 0, message.arg1, message.arg2);
        f.Companion.getClass();
        int iGlCreateProgram = GLES20.glCreateProgram();
        if (iGlCreateProgram == 0) {
            throw new RuntimeException("Unable to create program");
        }
        int iB = e.b(35633, "\n    uniform mat4 surfaceTransformMatrix;\n    attribute vec4 positionInSurface;\n    attribute vec4 positionInTexture;\n    varying vec2 rgbTextureCoordinates;\n    varying vec2 alphaTextureCoordinates;\n\n    void main() {\n      gl_Position = positionInSurface;\n\n      float rgbYOrigin = 0.5;\n      float alphaYOrigin = 0.0;\n      float channelScale = 2.0;\n\n      float rgbY = positionInTexture.y / channelScale + rgbYOrigin;\n      float alphaY = positionInTexture.y / channelScale + alphaYOrigin;\n\n      vec4 positionInRgbTexture = vec4(positionInTexture.x, rgbY, positionInTexture.zw);\n      vec4 positionInAlphaTexture = vec4(positionInTexture.x, alphaY, positionInTexture.zw);\n\n      rgbTextureCoordinates = (surfaceTransformMatrix * positionInRgbTexture).xy;\n      alphaTextureCoordinates = (surfaceTransformMatrix * positionInAlphaTexture).xy;\n    }\n");
        int iB2 = e.b(35632, "\n    #extension GL_OES_EGL_image_external : require\n    precision mediump float;\n    uniform samplerExternalOES texture;\n    varying vec2 rgbTextureCoordinates;\n    varying vec2 alphaTextureCoordinates;\n\n    void main() {\n      vec4 rgbSource = texture2D(texture, rgbTextureCoordinates);\n      float alphaSource = texture2D(texture, alphaTextureCoordinates).g;\n\n      gl_FragColor = vec4(rgbSource.rgb * alphaSource, alphaSource);\n    }\n");
        int[] iArr = new int[1];
        GLES20.glAttachShader(iGlCreateProgram, iB);
        GLES20.glAttachShader(iGlCreateProgram, iB2);
        GLES20.glLinkProgram(iGlCreateProgram);
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        GLES20.glDeleteShader(iB);
        GLES20.glDeleteShader(iB2);
        if (iArr[0] != 1) {
            String str = "Could not link program: \n" + GLES20.glGetProgramInfoLog(iGlCreateProgram);
            GLES20.glDeleteProgram(iGlCreateProgram);
            throw new RuntimeException(str);
        }
        a.a("createProgram");
        int iA = e.a("positionInSurface", iGlCreateProgram, b.f);
        int iA2 = e.a("positionInTexture", iGlCreateProgram, c.f);
        int iA3 = e.a("surfaceTransformMatrix", iGlCreateProgram, d.f);
        int[] iArr2 = new int[1];
        GLES20.glGenTextures(1, iArr2, 0);
        int iN = kotlin.collections.d.N(iArr2);
        GLES20.glBindTexture(36197, iN);
        GLES20.glTexParameterf(36197, 10241, 9729.0f);
        GLES20.glTexParameterf(36197, 10240, 9729.0f);
        a.a("createTexture");
        SurfaceTexture surfaceTexture = new SurfaceTexture(iN);
        this.e = new f(iGlCreateProgram, iA, iA2, iA3, surfaceTexture);
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: mv0.h
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                this.f209074a.f209079h.sendEmptyMessage(2);
            }
        });
        Surface surface = new Surface(surfaceTexture);
        this.f = surface;
        GLES20.glUseProgram(iGlCreateProgram);
        h1.b(new k0.b(this, surface, 12));
    }
}
