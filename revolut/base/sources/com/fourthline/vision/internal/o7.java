package com.fourthline.vision.internal;

import android.media.Image;
import android.util.Size;
import com.fourthline.vision.document.DocumentScannerStepWarning;
import com.fourthline.vision.internal.ra;
import com.google.common.primitives.UnsignedBytes;
import java.nio.ByteBuffer;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;
import yhm.s;

/* JADX INFO: loaded from: classes23.dex */
public final class o7 implements x1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f36620c = new a(null);
    public static final int d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Size f36621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final oa f36622b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public o7(@NotNull Size imageSize, @NotNull oa detectionAreaProvider) {
        Intrinsics.checkNotNullParameter(imageSize, "imageSize");
        Intrinsics.checkNotNullParameter(detectionAreaProvider, "detectionAreaProvider");
        this.f36621a = imageSize;
        this.f36622b = detectionAreaProvider;
    }

    private final boolean isPixelWithinDetectionArea(int i, Size size, fa faVar) {
        int height = i / size.getHeight();
        int height2 = i % size.getHeight();
        return height < faVar.getBottom() && height > faVar.getTop() && height2 > faVar.getLeft() && height2 < faVar.getRight();
    }

    @Override // com.fourthline.vision.internal.x1
    public /* bridge */ /* synthetic */ Object consume(Object obj2, Continuation continuation) {
        return consume((Image) obj2, (Continuation<? super Unit>) continuation);
    }

    public Object consume(@NotNull Image image, @NotNull Continuation<? super Unit> continuation) {
        Image.Plane[] planes = image.getPlanes();
        Intrinsics.checkNotNullExpressionValue(planes, "getPlanes(...)");
        if (planes.length == 0) {
            return Unit.f186387a;
        }
        fa faVarContentDetectionArea = this.f36622b.contentDetectionArea();
        int i = 0;
        ByteBuffer buffer = image.getPlanes()[0].getBuffer();
        int iPosition = buffer.position();
        int i2 = CertificateBody.profileType;
        while (true) {
            i += 1000;
            try {
                if (buffer.limit() <= i) {
                    break;
                }
                if (isPixelWithinDetectionArea(i, this.f36621a, faVarContentDetectionArea)) {
                    byte b4 = buffer.get(i);
                    s.Companion companion = yhm.s.INSTANCE;
                    i2 = (i2 + (b4 & UnsignedBytes.MAX_VALUE)) / 2;
                }
            } catch (Throwable th10) {
                buffer.position(iPosition);
                throw th10;
            }
        }
        if (i2 < 63) {
            throw new ra.g(zhm.u.c(DocumentScannerStepWarning.DOCUMENT_TOO_DARK), null, 2, null);
        }
        buffer.position(iPosition);
        return Unit.f186387a;
    }
}
