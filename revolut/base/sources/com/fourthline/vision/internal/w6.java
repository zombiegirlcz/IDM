package com.fourthline.vision.internal;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.media.Image;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.common.primitives.UnsignedBytes;
import com.google.mlkit.vision.common.InputImage;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class w6 implements e8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f37046a;

    public static final class a implements f9 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InputImage f37047a;

        public a(Image image, w6 w6Var) {
            InputImage inputImageO = InputImage.o(image, w6Var.f37046a, null);
            Intrinsics.checkNotNullExpressionValue(inputImageO, "fromMediaImage(...)");
            this.f37047a = inputImageO;
        }

        @Override // com.fourthline.vision.internal.f9
        public InputImage getImage() {
            return this.f37047a;
        }
    }

    public static final class b implements f9 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InputImage f37048a;

        public b(Bitmap bitmap, w6 w6Var) {
            InputImage inputImageA = InputImage.a(bitmap, w6Var.f37046a);
            Intrinsics.checkNotNullExpressionValue(inputImageA, "fromBitmap(...)");
            this.f37048a = inputImageA;
        }

        @Override // com.fourthline.vision.internal.f9
        public InputImage getImage() {
            return this.f37048a;
        }
    }

    public static final class c implements f9 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InputImage f37049a;

        public c(w6 w6Var, byte[] bArr, fa faVar) {
            InputImage inputImageA = InputImage.a(w6Var.convertYUVtoGrayscaleBitmap(bArr, faVar.width(), faVar.height()), w6Var.f37046a);
            Intrinsics.checkNotNullExpressionValue(inputImageA, "fromBitmap(...)");
            this.f37049a = inputImageA;
        }

        @Override // com.fourthline.vision.internal.f9
        public InputImage getImage() {
            return this.f37049a;
        }
    }

    public w6(int i) {
        this.f37046a = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap convertYUVtoGrayscaleBitmap(byte[] bArr, int i, int i2) {
        int[] iArr = new int[bArr.length];
        int length = bArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            iArr[i3] = ((bArr[i3] & UnsignedBytes.MAX_VALUE) * 65793) | (-16777216);
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr, i, i2, Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
        return bitmapCreateBitmap;
    }

    private final fa mapToImageCoords(fa faVar, int i) {
        Matrix matrix = new Matrix();
        matrix.setRotate(-this.f37046a, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        int i2 = this.f37046a;
        matrix.postTranslate(BitmapDescriptorFactory.HUE_RED, (i2 == 90 || i2 == 270) ? i : 0.0f);
        RectF rectF = new RectF();
        matrix.mapRect(rectF, ga.toRectF(faVar));
        return ga.toRectangle(rectF);
    }

    @Override // com.fourthline.vision.internal.e8
    @NotNull
    public f9 toMlKitFrame(@NotNull Image image) {
        Intrinsics.checkNotNullParameter(image, "image");
        return new a(image, this);
    }

    @Override // com.fourthline.vision.internal.e8
    @NotNull
    public f9 toMlKitFrame(@NotNull Bitmap image) {
        Intrinsics.checkNotNullParameter(image, "image");
        return new b(image, this);
    }

    @Override // com.fourthline.vision.internal.e8
    @NotNull
    public f9 toMlKitFrame(@NotNull Image image, int i, int i2, @NotNull fa processingArea) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(processingArea, "processingArea");
        fa faVarMapToImageCoords = mapToImageCoords(processingArea, i2);
        Image.Plane[] planes = image.getPlanes();
        Intrinsics.checkNotNullExpressionValue(planes, "getPlanes(...)");
        int rowStride = planes[0].getRowStride();
        ByteBuffer buffer = planes[0].getBuffer();
        buffer.rewind();
        byte[] bArr = new byte[faVarMapToImageCoords.width() * faVarMapToImageCoords.height()];
        int top = faVarMapToImageCoords.getTop() * rowStride;
        int iHeight = faVarMapToImageCoords.height();
        for (int i3 = 0; i3 < iHeight; i3++) {
            int left = (i3 * rowStride) + top + faVarMapToImageCoords.getLeft();
            if (left < 0 || left > buffer.capacity()) {
                break;
            }
            buffer.position(left);
            buffer.get(bArr, faVarMapToImageCoords.width() * i3, faVarMapToImageCoords.width());
        }
        return new c(this, bArr, faVarMapToImageCoords);
    }
}
