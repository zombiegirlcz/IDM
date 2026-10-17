package com.revolut.camerakit.vision_framework.common;

import com.revolut.camerakit.vision_framework.generated.ImageFormat;
import com.revolut.camerakit.vision_framework.generated.VisionImage;
import e10.p;
import e10.q;
import e10.r;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Le10/r;", "Lcom/revolut/camerakit/vision_framework/generated/VisionImage;", "toFrameworkImage", "(Le10/r;)Lcom/revolut/camerakit/vision_framework/generated/VisionImage;", "Ljava/nio/ByteBuffer;", "buffer", "", "getByteArrayFromBuffer", "(Ljava/nio/ByteBuffer;)[B", "camera_kit_vision_framework_impl_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class VisionImageMapperKt {
    @NotNull
    public static final byte[] getByteArrayFromBuffer(@NotNull ByteBuffer buffer) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        if (buffer.hasArray()) {
            byte[] bArrArray = buffer.array();
            Intrinsics.h(bArrArray);
            return bArrArray;
        }
        ByteBuffer byteBufferDuplicate = buffer.duplicate();
        byteBufferDuplicate.rewind();
        byte[] bArr = new byte[byteBufferDuplicate.remaining()];
        byteBufferDuplicate.get(bArr);
        return bArr;
    }

    @NotNull
    public static final VisionImage toFrameworkImage(@NotNull r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        if (rVar instanceof p) {
            return new VisionImage(getByteArrayFromBuffer(((p) rVar).f121833a), ImageFormat.JPEG, 0, 0);
        }
        if (!(rVar instanceof q)) {
            throw new NoWhenBranchMatchedException();
        }
        q qVar = (q) rVar;
        return new VisionImage(getByteArrayFromBuffer(qVar.f121834a), ImageFormat.RGBA8888, qVar.f121835b, qVar.f121836c);
    }
}
