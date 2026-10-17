package hw3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements wt3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xq3.j f156072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xq3.y f156073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final eb5.a f156074c;
    public final al4.j d;
    public final xq3.w e;

    public i(xq3.j creditApplicationInteractor, xq3.y creditProductClassificationInteractor, eb5.a creditTilesInteractor, al4.j creditCardEntryPointDetailsInteractor, xq3.w entryPointsInteractor) {
        Intrinsics.checkNotNullParameter(creditApplicationInteractor, "creditApplicationInteractor");
        Intrinsics.checkNotNullParameter(creditProductClassificationInteractor, "creditProductClassificationInteractor");
        Intrinsics.checkNotNullParameter(creditTilesInteractor, "creditTilesInteractor");
        Intrinsics.checkNotNullParameter(creditCardEntryPointDetailsInteractor, "creditCardEntryPointDetailsInteractor");
        Intrinsics.checkNotNullParameter(entryPointsInteractor, "entryPointsInteractor");
        this.f156072a = creditApplicationInteractor;
        this.f156073b = creditProductClassificationInteractor;
        this.f156074c = creditTilesInteractor;
        this.d = creditCardEntryPointDetailsInteractor;
        this.e = entryPointsInteractor;
    }
}
