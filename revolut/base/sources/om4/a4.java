package om4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a4 implements z3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m2j.j f226517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dp4.q0 f226518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w5i.a f226519c;

    public a4(m2j.j balancesInteractor, dp4.q0 repository, w5i.a allowedBalancePickerGroupsProvider) {
        Intrinsics.checkNotNullParameter(balancesInteractor, "balancesInteractor");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(allowedBalancePickerGroupsProvider, "allowedBalancePickerGroupsProvider");
        this.f226517a = balancesInteractor;
        this.f226518b = repository;
        this.f226519c = allowedBalancePickerGroupsProvider;
    }
}
