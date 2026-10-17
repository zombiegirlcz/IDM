package y74;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tqi.g;
import y65.l;
import y66.p;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends a {

    @NotNull
    private static final b Companion = new b();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final hk0.a f311344l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final zk0.b f311345m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final n80.d f311346n;
    public final g o;

    public d(hk0.a networkFileRepository, zk0.b fileSystemRepository, n80.d packageManagerResolver, g shareNaviCommandFactory) {
        Intrinsics.checkNotNullParameter(networkFileRepository, "networkFileRepository");
        Intrinsics.checkNotNullParameter(fileSystemRepository, "fileSystemRepository");
        Intrinsics.checkNotNullParameter(packageManagerResolver, "packageManagerResolver");
        Intrinsics.checkNotNullParameter(shareNaviCommandFactory, "shareNaviCommandFactory");
        this.f311344l = networkFileRepository;
        this.f311345m = fileSystemRepository;
        this.f311346n = packageManagerResolver;
        this.o = shareNaviCommandFactory;
    }

    @Override // y74.a
    public final void Z2(String url2, String documentName) {
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(documentName, "documentName");
        T2(new l(this, url2, documentName, null, 1), new p(6));
    }
}
