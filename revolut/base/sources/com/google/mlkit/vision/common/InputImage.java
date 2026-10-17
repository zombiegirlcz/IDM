package com.google.mlkit.vision.common;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.Image;
import android.os.SystemClock;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_vision_common.zzms;
import com.google.android.gms.internal.mlkit_vision_common.zzmu;
import fn2.c;
import java.nio.ByteBuffer;
import yh5.b;

/* JADX INFO: loaded from: classes17.dex */
public final class InputImage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Bitmap f49666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile ByteBuffer f49667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile c f49668c;
    public final int d;
    public final int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f49669g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Matrix f49670h;

    public InputImage(Bitmap bitmap, int i) {
        this.f49666a = (Bitmap) Preconditions.checkNotNull(bitmap);
        this.d = bitmap.getWidth();
        this.e = bitmap.getHeight();
        n(i);
        this.f = i;
        this.f49669g = -1;
        this.f49670h = null;
    }

    public static InputImage a(Bitmap bitmap, int i) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        InputImage inputImage = new InputImage(bitmap, i);
        zzmu.zza(zzms.zzb("vision-common"), -1, 1, jElapsedRealtime, bitmap.getHeight(), bitmap.getWidth(), bitmap.getAllocationByteCount(), i);
        return inputImage;
    }

    public static InputImage b(int i, int i2, int i3, byte[] bArr) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        InputImage inputImage = new InputImage(ByteBuffer.wrap((byte[]) Preconditions.checkNotNull(bArr)), i, i2, i3);
        zzmu.zza(zzms.zzb("vision-common"), 17, 2, jElapsedRealtime, i2, i, bArr.length, i3);
        return inputImage;
    }

    public static InputImage c(ByteBuffer byteBuffer, int i, int i2, int i3) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        InputImage inputImage = new InputImage(byteBuffer, i, i2, i3);
        zzmu.zza(zzms.zzb("vision-common"), 17, 3, jElapsedRealtime, i2, i, byteBuffer.limit(), i3);
        return inputImage;
    }

    public static InputImage d(Image image, int i, Matrix matrix) {
        Preconditions.checkArgument(image.getFormat() == 35, "Only YUV_420_888 is supported now");
        return o(image, i, matrix);
    }

    public static void n(int i) {
        boolean z = true;
        if (i != 0 && i != 90 && i != 180 && i != 270) {
            z = false;
        }
        Preconditions.checkArgument(z, "Invalid rotation. Only 0, 90, 180, 270 are supported currently.");
    }

    public static InputImage o(Image image, int i, Matrix matrix) {
        Image image2;
        int i2;
        int iLimit;
        InputImage inputImage;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Preconditions.checkNotNull(image, "Please provide a valid image");
        n(i);
        Preconditions.checkArgument(image.getFormat() == 256 || image.getFormat() == 35, "Only JPEG and YUV_420_888 are supported now");
        Image.Plane[] planes = image.getPlanes();
        if (image.getFormat() == 256) {
            iLimit = image.getPlanes()[0].getBuffer().limit();
            Preconditions.checkArgument(image.getFormat() == 256, "Only JPEG is supported now");
            Image.Plane[] planes2 = image.getPlanes();
            if (planes2 == null || planes2.length != 1) {
                throw new IllegalArgumentException("Unexpected image format, JPEG should have exactly 1 image plane");
            }
            ByteBuffer buffer = planes2[0].getBuffer();
            buffer.rewind();
            int iRemaining = buffer.remaining();
            byte[] bArr = new byte[iRemaining];
            buffer.get(bArr);
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, iRemaining);
            image2 = image;
            i2 = i;
            inputImage = new InputImage(b.X(i, bitmapDecodeByteArray.getWidth(), bitmapDecodeByteArray.getHeight(), bitmapDecodeByteArray), 0);
        } else {
            for (Image.Plane plane : planes) {
                if (plane.getBuffer() != null) {
                    plane.getBuffer().rewind();
                }
            }
            image2 = image;
            InputImage inputImage2 = new InputImage(image2, image.getWidth(), image.getHeight(), i, matrix);
            i2 = i;
            iLimit = (image2.getPlanes()[0].getBuffer().limit() * 3) / 2;
            inputImage = inputImage2;
        }
        zzmu.zza(zzms.zzb("vision-common"), image2.getFormat(), 5, jElapsedRealtime, image2.getHeight(), image2.getWidth(), iLimit, i2);
        return inputImage;
    }

    public final Bitmap e() {
        return this.f49666a;
    }

    public final ByteBuffer f() {
        return this.f49667b;
    }

    public final Matrix g() {
        return this.f49670h;
    }

    public final int h() {
        return this.f49669g;
    }

    public final int i() {
        return this.e;
    }

    public final Image j() {
        if (this.f49668c == null) {
            return null;
        }
        return (Image) this.f49668c.f136517b;
    }

    public final Image.Plane[] k() {
        if (this.f49668c == null) {
            return null;
        }
        return ((Image) this.f49668c.f136517b).getPlanes();
    }

    public final int l() {
        return this.f;
    }

    public final int m() {
        return this.d;
    }

    public InputImage(Image image, int i, int i2, int i3, Matrix matrix) {
        Preconditions.checkNotNull(image);
        this.f49668c = new c(image, 15);
        this.d = i;
        this.e = i2;
        n(i3);
        this.f = i3;
        this.f49669g = 35;
        this.f49670h = matrix;
    }

    public InputImage(ByteBuffer byteBuffer, int i, int i2, int i3) {
        Preconditions.checkArgument(true);
        this.f49667b = (ByteBuffer) Preconditions.checkNotNull(byteBuffer);
        Preconditions.checkArgument(byteBuffer.limit() > i * i2, "Image dimension, ByteBuffer size and format don't match. Please check if the ByteBuffer is in the decalred format.");
        byteBuffer.rewind();
        this.d = i;
        this.e = i2;
        n(i3);
        this.f = i3;
        this.f49669g = 17;
        this.f49670h = null;
    }
}
