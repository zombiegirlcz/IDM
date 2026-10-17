package mv0;

import android.opengl.GLES20;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes19.dex */
public final class e {
    private e() {
    }

    public static int a(String str, int i, Function2 function2) {
        int iIntValue = ((Number) function2.invoke(Integer.valueOf(i), str)).intValue();
        a.a("createHandle ".concat(str));
        if (iIntValue != -1) {
            return iIntValue;
        }
        throw new RuntimeException(function2 + " failed for " + str);
    }

    public static int b(int i, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        if (iGlCreateShader == 0) {
            a.a("loadShader");
            throw new RuntimeException("Unable to load shader");
        }
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        a.a("getCompileStatus");
        if (kotlin.collections.d.N(iArr) != 0) {
            a.a("loadShader");
            return iGlCreateShader;
        }
        GLES20.glDeleteShader(iGlCreateShader);
        a.a("loadShader");
        throw new RuntimeException("Unable to load shader");
    }
}
