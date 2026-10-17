package r80;

import android.graphics.Bitmap;
import java.io.File;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import te0.w;
import ufm.n;
import zhm.r0;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zk0.b f252303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f252304b;

    public c(zk0.b fileSystemRepository) {
        Intrinsics.checkNotNullParameter(fileSystemRepository, "fileSystemRepository");
        this.f252303a = fileSystemRepository;
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
        this.f252304b = r0.k(new Pair("jpg", compressFormat), new Pair("jpeg", compressFormat), new Pair("png", Bitmap.CompressFormat.PNG), new Pair("webp", Bitmap.CompressFormat.WEBP));
    }

    public static n a(c cVar, File sourceFile, int i) {
        cVar.getClass();
        Intrinsics.checkNotNullParameter(sourceFile, "sourceFile");
        ufm.c cVar2 = new ufm.c(new a(sourceFile, cVar, 1920, null, i), 2);
        Intrinsics.checkNotNullExpressionValue(cVar2, "fromCallable(...)");
        return w.i0(cVar2);
    }
}
