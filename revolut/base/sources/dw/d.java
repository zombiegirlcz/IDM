package dw;

import android.opengl.GLES20;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class d {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FloatBuffer f118170a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final FloatBuffer f118171b;

        static {
            FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
            floatBufferAsFloatBuffer.put(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});
            floatBufferAsFloatBuffer.position(0);
            Intrinsics.checkNotNullExpressionValue(floatBufferAsFloatBuffer, "apply(...)");
            f118170a = floatBufferAsFloatBuffer;
            FloatBuffer floatBufferAsFloatBuffer2 = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
            floatBufferAsFloatBuffer2.put(new float[]{BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f, 1.0f, BitmapDescriptorFactory.HUE_RED});
            floatBufferAsFloatBuffer2.position(0);
            Intrinsics.checkNotNullExpressionValue(floatBufferAsFloatBuffer2, "apply(...)");
            f118171b = floatBufferAsFloatBuffer2;
        }

        private a() {
        }
    }

    private d() {
    }

    public static int a(int i, int i2) {
        int iGlCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(iGlCreateProgram, i);
        GLES20.glAttachShader(iGlCreateProgram, i2);
        GLES20.glLinkProgram(iGlCreateProgram);
        return iGlCreateProgram;
    }

    public static int b(int i, String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        int iGlCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(iGlCreateShader, code);
        GLES20.glCompileShader(iGlCreateShader);
        return iGlCreateShader;
    }
}
