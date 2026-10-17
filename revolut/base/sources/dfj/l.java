package dfj;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nfj.e f114025a;

    public l(nfj.e repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f114025a = repository;
    }

    public final vkm.d a(w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        nfj.g gVar = (nfj.g) this.f114025a;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return gVar.e.b(Unit.f186387a, loadingStrategy);
    }
}
