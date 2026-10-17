package bw;

import android.graphics.Bitmap;
import android.os.Build;
import java.nio.ByteBuffer;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import yhm.m;

/* JADX INFO: loaded from: classes16.dex */
public final class m implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f19150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ xv.n f19151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yw.j f19152c;
    public final /* synthetic */ skm.l d;

    public m(n nVar, xv.n nVar2, yw.j jVar, skm.l lVar) {
        this.f19150a = nVar;
        this.f19151b = nVar2;
        this.f19152c = jVar;
        this.d = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bitmap.CompressFormat compressFormat;
        n nVar = this.f19150a;
        qw.a aVar = nVar.d;
        xv.n nVar2 = this.f19151b;
        ByteBuffer byteBuffer = nVar2.f309130a;
        int i = nVar2.f309132c;
        int i2 = nVar2.d;
        aVar.getClass();
        Bitmap bitmapD = qw.a.d(byteBuffer, i, i2);
        yw.j compressionType = this.f19152c;
        Intrinsics.checkNotNullParameter(compressionType, "compressionType");
        int i3 = d.f19143a[compressionType.ordinal()];
        if (i3 == 1) {
            compressFormat = Bitmap.CompressFormat.JPEG;
        } else if (i3 == 2) {
            compressFormat = Bitmap.CompressFormat.PNG;
        } else {
            if (i3 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            int i5 = Build.VERSION.SDK_INT;
            compressFormat = i5 >= 30 ? Bitmap.CompressFormat.WEBP_LOSSLESS : i5 >= 29 ? Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.PNG;
        }
        int i6 = l.f19149a[compressionType.ordinal()] == 1 ? nVar.f19155c.b().f317230a.f317227a : 100;
        aVar.getClass();
        ByteBuffer byteBufferB = qw.a.b(i6, compressFormat, bitmapD);
        bitmapD.recycle();
        m.Companion companion = yhm.m.INSTANCE;
        this.d.resumeWith(new vw.a(byteBufferB, nVar2.f309134h));
    }
}
