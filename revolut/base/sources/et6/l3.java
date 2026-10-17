package et6;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final au6.q2 f129270a;

    public l3(au6.q2 repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f129270a = repository;
    }

    public final vkm.d a(w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        au6.q2 q2Var = this.f129270a;
        q2Var.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return q2Var.f9604c.b(Unit.f186387a, loadingStrategy);
    }
}
