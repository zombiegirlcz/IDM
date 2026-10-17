package ll7;

import java.io.File;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import skm.p0;

/* JADX INFO: loaded from: classes4.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineScope f196642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f196643b;

    public l(CoroutineScope coroutineScope, File cacheDir) {
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(cacheDir, "cacheDir");
        this.f196642a = coroutineScope;
        this.f196643b = cacheDir;
    }

    public final void a(List files) {
        Intrinsics.checkNotNullParameter(files, "files");
        p0 p0Var = p0.f264001a;
        skm.e0.C(this.f196642a, elm.f.f127540b, null, new le8.d(files, this, (Continuation) null), 2);
    }
}
