package up0;

import android.opengl.GLES20;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f281757a;

    public static int a(int i, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        if (iGlCreateShader == 0) {
            throw new IllegalStateException("Unable to create particle shader");
        }
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] == 1) {
            return iGlCreateShader;
        }
        String strGlGetShaderInfoLog = GLES20.glGetShaderInfoLog(iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        throw new IllegalStateException(h30.l.r("Unable to compile particle shader: ", strGlGetShaderInfoLog));
    }

    public static int c(int i, int i2) {
        int iGlCreateProgram = GLES20.glCreateProgram();
        if (iGlCreateProgram == 0) {
            throw new IllegalStateException("Unable to create particle OpenGL program");
        }
        GLES20.glAttachShader(iGlCreateProgram, i);
        GLES20.glAttachShader(iGlCreateProgram, i2);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        if (iArr[0] == 1) {
            return iGlCreateProgram;
        }
        String strGlGetProgramInfoLog = GLES20.glGetProgramInfoLog(iGlCreateProgram);
        GLES20.glDeleteProgram(iGlCreateProgram);
        throw new IllegalStateException(h30.l.r("Unable to link particle OpenGL program: ", strGlGetProgramInfoLog));
    }

    public final int b(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        int i = this.f281757a;
        if (i == 0) {
            throw new IllegalStateException("Particle OpenGL program is not initialized");
        }
        int iGlGetUniformLocation = GLES20.glGetUniformLocation(i, name);
        if (iGlGetUniformLocation >= 0) {
            return iGlGetUniformLocation;
        }
        throw new IllegalStateException("Unable to resolve particle shader uniform ".concat(name).toString());
    }
}
