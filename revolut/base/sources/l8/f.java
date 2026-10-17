package l8;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes16.dex */
public final class f implements c8.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f192730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f192731b;

    public f(int i) {
        this.f192730a = i;
        switch (i) {
            case 1:
                this.f192731b = new f(2);
                break;
            case 2:
                this.f192731b = new qy5.a(false);
                break;
            default:
                this.f192731b = new f(2);
                break;
        }
    }

    @Override // c8.m
    public final /* bridge */ /* synthetic */ boolean a(Object obj2, c8.k kVar) {
        switch (this.f192730a) {
            case 0:
                break;
            case 1:
                break;
            default:
                break;
        }
        return true;
    }

    @Override // c8.m
    public final e8.e0 b(Object obj2, int i, int i2, c8.k kVar) {
        switch (this.f192730a) {
            case 0:
                return ((f) this.f192731b).c(ImageDecoder.createSource((ByteBuffer) obj2), i, i2, kVar);
            case 1:
                return ((f) this.f192731b).c(ImageDecoder.createSource(y8.b.b((InputStream) obj2)), i, i2, kVar);
            default:
                return c((ImageDecoder.Source) obj2, i, i2, kVar);
        }
    }

    public c c(ImageDecoder.Source source, int i, int i2, c8.k kVar) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, new k8.b(i, i2, kVar));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            String str = "Decoded [" + bitmapDecodeBitmap.getWidth() + "x" + bitmapDecodeBitmap.getHeight() + "] for [" + i + "x" + i2 + "]";
        }
        return new c(bitmapDecodeBitmap, (qy5.a) this.f192731b);
    }
}
