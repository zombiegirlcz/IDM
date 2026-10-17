package gm0;

import com.google.common.primitives.UnsignedBytes;
import java.nio.ByteBuffer;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tl0.a f144752a;

    public p(tl0.a base64Wrapper) {
        Intrinsics.checkNotNullParameter(base64Wrapper, "base64Wrapper");
        this.f144752a = base64Wrapper;
    }

    public static ByteBuffer a(ByteBuffer byteBuffer, int i) {
        tim.c.INSTANCE.getClass();
        tim.a aVar = tim.c.f271589b;
        aVar.getClass();
        byte[] array = new byte[i];
        Intrinsics.checkNotNullParameter(array, "array");
        aVar.h().nextBytes(array);
        ByteBuffer byteBufferPut = byteBuffer.put(array);
        Intrinsics.checkNotNullExpressionValue(byteBufferPut, "put(...)");
        return byteBufferPut;
    }

    public static ByteBuffer b(ByteBuffer byteBuffer, int i, UUID uuid) {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(32);
        Intrinsics.h(byteBufferAllocate);
        a(byteBufferAllocate, 8);
        Intrinsics.checkNotNullParameter(uuid, "<this>");
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[16]);
        byteBufferWrap.putLong(uuid.getMostSignificantBits());
        byteBufferWrap.putLong(uuid.getLeastSignificantBits());
        byte[] bArrArray = byteBufferWrap.array();
        Intrinsics.checkNotNullExpressionValue(bArrArray, "array(...)");
        byteBufferAllocate.put(bArrArray);
        a(byteBufferAllocate, 8);
        byte[] bArrArray2 = byteBufferAllocate.array();
        Intrinsics.checkNotNullExpressionValue(bArrArray2, "array(...)");
        byte[] with = rd0.e.f(i);
        Intrinsics.checkNotNullParameter(bArrArray2, "<this>");
        Intrinsics.checkNotNullParameter(with, "with");
        if (with.length != 0) {
            byte[] bArr = new byte[bArrArray2.length];
            int length = bArrArray2.length;
            for (int i2 = 0; i2 < length; i2++) {
                bArr[i2] = (byte) (with[bArrArray2.length <= with.length ? i2 : i2 % with.length] ^ (bArrArray2[i2] & UnsignedBytes.MAX_VALUE));
            }
            bArrArray2 = bArr;
        }
        ByteBuffer byteBufferPut = byteBuffer.put(bArrArray2);
        Intrinsics.checkNotNullExpressionValue(byteBufferPut, "put(...)");
        return byteBufferPut;
    }
}
