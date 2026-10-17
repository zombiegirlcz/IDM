package rrj;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rnd.d0;

/* JADX INFO: loaded from: classes11.dex */
public final class x implements jki.p {

    @NotNull
    public static final v Companion = new v();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oe3.b f256880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final thf.c f256881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final srj.b f256882c;

    public x(oe3.b transactionsListItemMapper, thf.c transactionCategoryResourcesMapper, srj.c categoryBudgetOverviewFactory, srj.b categoryBudgetBannerMapper) {
        Intrinsics.checkNotNullParameter(transactionsListItemMapper, "transactionsListItemMapper");
        Intrinsics.checkNotNullParameter(transactionCategoryResourcesMapper, "transactionCategoryResourcesMapper");
        Intrinsics.checkNotNullParameter(categoryBudgetOverviewFactory, "categoryBudgetOverviewFactory");
        Intrinsics.checkNotNullParameter(categoryBudgetBannerMapper, "categoryBudgetBannerMapper");
        this.f256880a = transactionsListItemMapper;
        this.f256881b = transactionCategoryResourcesMapper;
        this.f256882c = categoryBudgetBannerMapper;
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        d domainState = (d) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (j) iii.c.f(domainState.f256854a, new rpi.e(22), new d0(18), new ri4.o(this, 8));
    }
}
