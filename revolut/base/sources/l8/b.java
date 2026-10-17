package l8;

import android.graphics.Bitmap;
import android.os.SystemClock;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public final class b implements c8.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c8.j f192716b = c8.j.a(90, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c8.j f192717c = new c8.j("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, c8.j.e);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f8.f f192718a;

    public b(f8.f fVar) {
        this.f192718a = fVar;
    }

    @Override // c8.d
    public final boolean h(Object obj2, File file, c8.k kVar) throws Throwable {
        boolean z;
        Bitmap bitmap = (Bitmap) ((e8.e0) obj2).get();
        c8.j jVar = f192717c;
        Bitmap.CompressFormat compressFormat = (Bitmap.CompressFormat) kVar.a(jVar);
        if (compressFormat == null) {
            compressFormat = bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
        }
        bitmap.getWidth();
        bitmap.getHeight();
        int i = y8.h.f311602b;
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        int iIntValue = ((Integer) kVar.a(f192716b)).intValue();
        OutputStream cVar = null;
        try {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                f8.f fVar = this.f192718a;
                if (fVar != null) {
                    try {
                        cVar = new com.bumptech.glide.load.data.c(fileOutputStream, fVar);
                    } catch (IOException e) {
                        cVar = fileOutputStream;
                        if (Log.isLoggable("BitmapEncoder", 3)) {
                        }
                        if (cVar != null) {
                            try {
                                cVar.close();
                            } catch (IOException unused) {
                            }
                        }
                        z = false;
                    } catch (Throwable th10) {
                        th = th10;
                        cVar = fileOutputStream;
                        if (cVar != null) {
                            try {
                                cVar.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                } else {
                    cVar = fileOutputStream;
                }
                bitmap.compress(compressFormat, iIntValue, cVar);
                cVar.close();
                try {
                    cVar.close();
                } catch (IOException unused3) {
                }
                z = true;
            } catch (IOException e2) {
            }
            if (Log.isLoggable("BitmapEncoder", 2)) {
                String str = "Compressed with type: " + compressFormat + " of size " + y8.l.c(bitmap) + " in " + y8.h.a(jElapsedRealtimeNanos) + ", options format: " + kVar.a(jVar) + ", hasAlpha: " + bitmap.hasAlpha();
            }
            return z;
        } catch (Throwable th11) {
            th = th11;
        }
    }

    @Override // c8.n
    public final c8.c p(c8.k kVar) {
        return c8.c.TRANSFORMED;
    }
}
