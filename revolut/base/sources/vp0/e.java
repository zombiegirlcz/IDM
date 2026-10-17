package vp0;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.os.Handler;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import h30.l;
import ix0.h1;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import javax.microedition.khronos.egl.EGL;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.h0;

/* JADX INFO: loaded from: classes19.dex */
public final class e extends tp0.b {

    @NotNull
    public static final d Companion = new d();
    public final k f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SurfaceTexture f291018g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final js0.b f291019h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f291020j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f291021l = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ArrayList f291022m = new ArrayList();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final f f291023n = new f();
    public final g o = new g();

    public e(k kVar, SurfaceTexture surfaceTexture, js0.b bVar, int i, int i2) {
        this.f = kVar;
        this.f291018g = surfaceTexture;
        this.f291019h = bVar;
        this.i = i;
        this.f291020j = i2;
    }

    @Override // tp0.b
    public final void a(Exception e) {
        Intrinsics.checkNotNullParameter(e, "e");
        jo0.i.f176843a.getClass();
        Intrinsics.checkNotNullParameter(e, "e");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
        jo0.i.f176845c = true;
    }

    @Override // tp0.b
    public final void d() {
        f fVar = this.f291023n;
        fVar.getClass();
        SurfaceTexture surfaceTexture = this.f291018g;
        Intrinsics.checkNotNullParameter(surfaceTexture, "surfaceTexture");
        EGL egl2 = EGLContext.getEGL();
        Intrinsics.i(egl2, "null cannot be cast to non-null type javax.microedition.khronos.egl.EGL10");
        EGL10 egl10 = (EGL10) egl2;
        fVar.f291024a = egl10;
        EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(0);
        fVar.f291025b = eGLDisplayEglGetDisplay;
        if (eGLDisplayEglGetDisplay == EGL10.EGL_NO_DISPLAY) {
            throw new IllegalStateException("failed eglGetDisplay: EGL_NO_DISPLAY");
        }
        if (!egl10.eglInitialize(eGLDisplayEglGetDisplay, new int[2])) {
            throw new IllegalStateException("failed eglInitialize");
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!egl10.eglChooseConfig(fVar.f291025b, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 64, 12344}, eGLConfigArr, 1, new int[1])) {
            throw new IllegalStateException("Failed eglChooseConfig");
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        fVar.f291026c = eGLConfig;
        EGLContext eGLContextEglCreateContext = egl10.eglCreateContext(fVar.f291025b, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{12440, 3, 12344});
        fVar.e = eGLContextEglCreateContext;
        if (eGLContextEglCreateContext == null) {
            throw new IllegalStateException("Failed eglCreateContext");
        }
        EGLSurface eGLSurfaceEglCreateWindowSurface = egl10.eglCreateWindowSurface(fVar.f291025b, fVar.f291026c, surfaceTexture, null);
        fVar.d = eGLSurfaceEglCreateWindowSurface;
        if (eGLSurfaceEglCreateWindowSurface == null) {
            throw new IllegalStateException("Failed eglCreateWindowSurface");
        }
        if (!egl10.eglMakeCurrent(fVar.f291025b, eGLSurfaceEglCreateWindowSurface, eGLSurfaceEglCreateWindowSurface, fVar.e)) {
            throw new IllegalStateException("Failed eglMakeCurrent");
        }
        g gVar = this.o;
        gVar.getClass();
        int iGlCreateShader = GLES20.glCreateShader(35633);
        int iGlCreateShader2 = GLES20.glCreateShader(35632);
        if (iGlCreateShader == 0 || iGlCreateShader2 == 0) {
            String str = iGlCreateShader == 0 ? " vertexShader" : null;
            if (str == null) {
                str = "";
            }
            String str2 = iGlCreateShader2 == 0 ? " fragmentShader" : null;
            throw new IllegalStateException(p.a.p("failed to create shader:", str, str2 != null ? str2 : "").toString());
        }
        GLES20.glShaderSource(iGlCreateShader, "#version 300 es\nprecision highp float;\n\nuniform float animationDuration;\nuniform float deltaTime;\nuniform float initialise;\nuniform float seed;\nuniform float time;\nuniform mat3 matrix;\nuniform vec2 surfaceSize;\nuniform vec2 viewSize;\nuniform vec3 gridDimens;\nuniform vec3 spread;\n\nlayout(location = 0) in vec2 inSrcUV;\nlayout(location = 1) in vec2 inPosition;\nlayout(location = 2) in vec2 inVelocity;\nlayout(location = 3) in float inRemainingLifetime;\n\nout vec2 outSrcUV;\nout vec2 outPosition;\nout vec2 outVelocity;\nout float outRemainingLifetime;\n\nout vec2 srcUVCenter;\nout vec2 srcUVSize;\nout float alpha;\n\n#define MIN_SPEED_FACTOR 0.3 \n#define MAX_ADDITIONAL_SPEED_FACTOR 0.5 \n\nfloat rand(vec2 v) {\n   return fract(sin(dot(v,vec2(12.333, 42.4242+seed*.42)))*4242.4242);\n}\n\nvoid main() {\n  vec2 srcUV = inSrcUV;\n  vec2 position = inPosition;\n  vec2 velocity = inVelocity;\n  float remainingLifetime = inRemainingLifetime;\n  if (initialise > 0.) {\n    float id = float(gl_VertexID);\n    srcUV = vec2(\n        mod(id, gridDimens.x),\n        floor(id / gridDimens.x)\n    ) / gridDimens.xy;\n    float particleSpeedFactor = MIN_SPEED_FACTOR + srcUV.x * MAX_ADDITIONAL_SPEED_FACTOR; \n    position = (matrix * vec3(srcUV + .5 / gridDimens.xy, 1.)).xy; // position is center of 'grid cell'\n    if (rand(srcUV) < 0.1) { // particle will move\n       float totalLifetime = animationDuration / particleSpeedFactor;\n       remainingLifetime = totalLifetime;\n\n       float maxX = spread.x * srcUV.x;\n       float minX = -spread.x - (1. - srcUV.x) * spread.x;\n       float maxY = spread.z;\n       float minY = (spread.y + spread.x * srcUV.x) * -1.;\n       float randomX = minX + (maxX - minX) * rand(srcUV * 12456.);\n       float randomY = minY + (maxY - minY) * rand(srcUV * 64321.); \n       vec2 move = vec2(randomX, randomY);\n       velocity = move / totalLifetime;\n    } else { // particle will 'fade out' in place\n       velocity = vec2(0., 0.);\n       remainingLifetime = 0.;\n    }\n  }\n\n  float particleActivated = max(0., min(0.001, time - srcUV.x * animationDuration)) / 0.001;\n  position += velocity * deltaTime * particleActivated;     \n  remainingLifetime = max(0., remainingLifetime - deltaTime * particleActivated);\n\n  outSrcUV = srcUV;\n  outPosition = position;\n  outVelocity = velocity;\n  outRemainingLifetime = remainingLifetime;\n  // update fragment shader input\n  if (velocity.x == 0.) {  \n     alpha = 1. - max(0., min(time - srcUV.x * animationDuration, 0.2)) / 0.2;\n  } else {\n    float particleSpeedFactor = MIN_SPEED_FACTOR + srcUV.x * MAX_ADDITIONAL_SPEED_FACTOR;\n    float totalLifetime = animationDuration / particleSpeedFactor; \n    alpha = remainingLifetime / totalLifetime;\n  }\n  gl_PointSize = gridDimens.z + 1.;\n  position.y = surfaceSize.y - position.y;\n  gl_Position = vec4(position / surfaceSize * 2. - vec2(1.), 0., 1.);\n  srcUVCenter = srcUV;\n  srcUVSize = vec2(gridDimens.z + 1.) / viewSize.xy;\n}\n// " + System.nanoTime());
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 1) {
            String strGlGetShaderInfoLog = GLES20.glGetShaderInfoLog(iGlCreateShader);
            GLES20.glDeleteShader(iGlCreateShader);
            throw new IllegalStateException(l.r("Failed to compile vertexShader: ", strGlGetShaderInfoLog));
        }
        GLES20.glShaderSource(iGlCreateShader2, "#version 300 es\nprecision highp float;\n\nuniform sampler2D src;\n\nin vec2 srcUVCenter;\nin vec2 srcUVSize;\nin float alpha;\n\nout vec4 fragColor;\n\nvoid main() {\n   if (alpha <= 0.0) discard;\n   fragColor = texture(src, srcUVCenter + gl_PointCoord * srcUVSize).rgba * alpha;\n}\n// " + System.nanoTime());
        GLES20.glCompileShader(iGlCreateShader2);
        GLES20.glGetShaderiv(iGlCreateShader2, 35713, iArr, 0);
        if (iArr[0] != 1) {
            String strGlGetShaderInfoLog2 = GLES20.glGetShaderInfoLog(iGlCreateShader2);
            GLES20.glDeleteShader(iGlCreateShader2);
            throw new IllegalStateException(l.r("Failed to compile fragmentShader: ", strGlGetShaderInfoLog2));
        }
        int iGlCreateProgram = GLES20.glCreateProgram();
        gVar.f291027a = iGlCreateProgram;
        if (iGlCreateProgram == 0) {
            throw new IllegalStateException("Failed to create program");
        }
        GLES20.glAttachShader(iGlCreateProgram, iGlCreateShader);
        GLES20.glAttachShader(gVar.f291027a, iGlCreateShader2);
        GLES30.glTransformFeedbackVaryings(gVar.f291027a, new String[]{"outSrcUV", "outPosition", "outVelocity", "outRemainingLifetime"}, 35980);
        GLES20.glLinkProgram(gVar.f291027a);
        GLES20.glGetProgramiv(gVar.f291027a, 35714, iArr, 0);
        if (iArr[0] != 1) {
            throw new IllegalStateException(l.r("Failed to link program: ", GLES20.glGetProgramInfoLog(gVar.f291027a)));
        }
        gVar.f291028b = GLES20.glGetUniformLocation(gVar.f291027a, "deltaTime");
        gVar.f291029c = GLES20.glGetUniformLocation(gVar.f291027a, "gridDimens");
        gVar.d = GLES20.glGetUniformLocation(gVar.f291027a, "matrix");
        gVar.e = GLES20.glGetUniformLocation(gVar.f291027a, "rectPos");
        gVar.f = GLES20.glGetUniformLocation(gVar.f291027a, "initialise");
        gVar.f291030g = GLES20.glGetUniformLocation(gVar.f291027a, "seed");
        gVar.f291031h = GLES20.glGetUniformLocation(gVar.f291027a, "surfaceSize");
        gVar.i = GLES20.glGetUniformLocation(gVar.f291027a, "src");
        gVar.f291032j = GLES20.glGetUniformLocation(gVar.f291027a, "time");
        gVar.k = GLES20.glGetUniformLocation(gVar.f291027a, "viewSize");
        gVar.f291033l = GLES20.glGetUniformLocation(gVar.f291027a, "animationDuration");
        gVar.f291034m = GLES20.glGetUniformLocation(gVar.f291027a, "spread");
        int i = this.i;
        int i2 = this.f291020j;
        GLES20.glViewport(0, 0, i, i2);
        GLES20.glEnable(3042);
        GLES20.glBlendFunc(770, 771);
        GLES20.glClearColor(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        GLES20.glUseProgram(gVar.f291027a);
        GLES20.glUniform2f(gVar.f291031h, i, i2);
    }

    public final void f(View view, h parameters, js0.b onViewBecomeInvisibleCallback, js0.b onFinishCallback) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(onViewBecomeInvisibleCallback, "onViewBecomeInvisibleCallback");
        Intrinsics.checkNotNullParameter(onFinishCallback, "onFinishCallback");
        if (this.f273250a.get()) {
            view.setVisibility(4);
            h1.f(onFinishCallback);
            return;
        }
        c cVar = new c(this.f, view, parameters, this.o, onViewBecomeInvisibleCallback, onFinishCallback);
        this.f273251b = true;
        this.d.await();
        Handler handler = this.f273252c;
        if (handler != null ? handler.sendMessage(handler.obtainMessage(0, cVar)) : false) {
            return;
        }
        cVar.a();
    }
}
