package o9f;

import kotlin.jvm.internal.Intrinsics;
import w4l.k;

/* JADX INFO: loaded from: classes8.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h9f.d f223265a;

    public g(h9f.d repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f223265a = repository;
    }

    public final vkm.d a(String transferId, k loadingStrategy) {
        Intrinsics.checkNotNullParameter(transferId, "transferId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        h9f.d dVar = this.f223265a;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(transferId, "transferId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return dVar.d.b(transferId, loadingStrategy);
    }
}
