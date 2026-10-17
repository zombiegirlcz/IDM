package r80;

import a80.h;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import do3.q;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Locale;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;
import lim.o;
import rim.d;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class a implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ File f252300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f252301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f252302c;
    public final /* synthetic */ Bitmap.CompressFormat d;
    public final /* synthetic */ int e;

    public /* synthetic */ a(File file, c cVar, int i, Bitmap.CompressFormat compressFormat, int i2) {
        this.f252300a = file;
        this.f252301b = cVar;
        this.f252302c = i;
        this.d = compressFormat;
        this.e = i2;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    @Override // java.util.concurrent.Callable
    public final Object call() throws IOException {
        File file = this.f252300a;
        String path = file.getPath();
        c cVar = this.f252301b;
        File fileM = ((h) cVar.f252303a).m(zk0.a.INTERNAL_CACHE, j6.a.q("compressed_", file.getName()));
        File parentFile = fileM.getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            parentFile.mkdirs();
        }
        FileOutputStream fileOutputStream = new FileOutputStream(fileM.getPath());
        Intrinsics.h(path);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(path, options);
        int iPow = Math.max(options.outHeight, options.outWidth) > this.f252302c ? (int) Math.pow(2.0d, d.b(Math.log(((double) r7) / ((double) r5)) / Math.log(0.5d))) : 1;
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        options2.inSampleSize = iPow;
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(path, options2);
        Intrinsics.checkNotNullExpressionValue(bitmapDecodeFile, "decodeFile(...)");
        Bitmap bitmapG = q.g(bitmapDecodeFile, path);
        Bitmap.CompressFormat compressFormat = this.d;
        if (compressFormat == null) {
            ?? r2 = cVar.f252304b;
            String lowerCase = o.n(file).toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            compressFormat = (Bitmap.CompressFormat) r2.get(lowerCase);
            if (compressFormat == null) {
                throw new IllegalStateException("Cannot compress image because extension is not supported for file: ".concat(path).toString());
            }
        }
        bitmapG.compress(compressFormat, this.e, fileOutputStream);
        fileOutputStream.flush();
        fileOutputStream.close();
        return fileM;
    }
}
