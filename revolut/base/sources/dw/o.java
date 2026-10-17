package dw;

import android.opengl.GLES20;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
public final class o {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final float[] f118199l = {-1.0f, 1.0f, BitmapDescriptorFactory.HUE_RED, -1.0f, -1.0f, BitmapDescriptorFactory.HUE_RED, 1.0f, -1.0f, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f, BitmapDescriptorFactory.HUE_RED};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final float[] f118200m = {BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f118201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f118202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FloatBuffer f118203c;
    public final FloatBuffer d;
    public final ShortBuffer e;
    public final short[] f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f118204g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f118205h = -1;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final m f118206j;
    public final m k;

    public o(int i, int i2) {
        this.f118201a = i;
        this.f118202b = i2;
        short[] sArr = {0, 1, 2, 0, 2, 3};
        this.f = sArr;
        this.f118204g = i;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(48);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        Intrinsics.checkNotNullExpressionValue(floatBufferAsFloatBuffer, "asFloatBuffer(...)");
        this.f118203c = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(f118199l);
        floatBufferAsFloatBuffer.position(0);
        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer2 = byteBufferAllocateDirect2.asFloatBuffer();
        Intrinsics.checkNotNullExpressionValue(floatBufferAsFloatBuffer2, "asFloatBuffer(...)");
        this.d = floatBufferAsFloatBuffer2;
        floatBufferAsFloatBuffer2.put(f118200m);
        floatBufferAsFloatBuffer2.position(0);
        ByteBuffer byteBufferAllocateDirect3 = ByteBuffer.allocateDirect(12);
        byteBufferAllocateDirect3.order(ByteOrder.nativeOrder());
        ShortBuffer shortBufferAsShortBuffer = byteBufferAllocateDirect3.asShortBuffer();
        Intrinsics.checkNotNullExpressionValue(shortBufferAsShortBuffer, "asShortBuffer(...)");
        this.e = shortBufferAsShortBuffer;
        shortBufferAsShortBuffer.put(sArr);
        shortBufferAsShortBuffer.position(0);
        this.i = GLES20.glGetUniformLocation(i2, "u_AnimationFraction");
        this.f118206j = new m(GLES20.glGetUniformLocation(i2, "u_TextMatrix"), GLES20.glGetAttribLocation(i2, "a_Position"), GLES20.glGetAttribLocation(i2, "a_TextCoord"));
        this.k = new m(GLES20.glGetUniformLocation(i, "u_TextMatrix"), GLES20.glGetAttribLocation(i, "a_Position"), GLES20.glGetAttribLocation(i, "a_TextCoord"));
    }

    public final void a(float[] surfaceTransform) {
        m mVar;
        Intrinsics.checkNotNullParameter(surfaceTransform, "surfaceTransform");
        GLES20.glUseProgram(this.f118204g);
        int i = this.f118204g;
        int i2 = this.f118201a;
        int i3 = this.f118202b;
        if (i == i2) {
            mVar = this.k;
        } else {
            if (i != i3) {
                throw new IllegalStateException("Unknown program is bound");
            }
            mVar = this.f118206j;
        }
        int i5 = mVar.f118196a;
        int i6 = mVar.f118197b;
        int i21 = mVar.f118198c;
        if (i == i3) {
            GLES20.glUniform1f(this.i, kotlin.ranges.f.f((System.currentTimeMillis() - this.f118205h) / 1000.0f, BitmapDescriptorFactory.HUE_RED, 1.0f));
        }
        GLES20.glUniformMatrix4fv(i5, 1, false, surfaceTransform, 0);
        GLES20.glEnableVertexAttribArray(i6);
        GLES20.glVertexAttribPointer(i6, 3, 5126, false, 12, (Buffer) this.f118203c);
        GLES20.glEnableVertexAttribArray(i21);
        GLES20.glVertexAttribPointer(i21, 2, 5126, false, 8, (Buffer) this.d);
        GLES20.glDrawElements(4, this.f.length, 5123, this.e);
        GLES20.glDisableVertexAttribArray(i6);
        GLES20.glDisableVertexAttribArray(i21);
    }
}
