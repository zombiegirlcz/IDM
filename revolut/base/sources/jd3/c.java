package jd3;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ssi.o;

/* JADX INFO: loaded from: classes21.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bd3.a f172953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eub.i f172954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o f172955c;
    public final eub.a d;
    public final nd3.d e;
    public final md3.a f;

    public c(bd3.a cashbackInteractor, od3.b cashbackLimitItemMapper, eub.i revPointsOptInInteractor, o transactionsWidgetUiModel, eub.a revPointsAvailabilityInteractor, nd3.d cashbackTransactionsFilterProvider, md3.a revPointsBannerItemsMapper) {
        Intrinsics.checkNotNullParameter(cashbackInteractor, "cashbackInteractor");
        Intrinsics.checkNotNullParameter(cashbackLimitItemMapper, "cashbackLimitItemMapper");
        Intrinsics.checkNotNullParameter(revPointsOptInInteractor, "revPointsOptInInteractor");
        Intrinsics.checkNotNullParameter(transactionsWidgetUiModel, "transactionsWidgetUiModel");
        Intrinsics.checkNotNullParameter(revPointsAvailabilityInteractor, "revPointsAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(cashbackTransactionsFilterProvider, "cashbackTransactionsFilterProvider");
        Intrinsics.checkNotNullParameter(revPointsBannerItemsMapper, "revPointsBannerItemsMapper");
        this.f172953a = cashbackInteractor;
        this.f172954b = revPointsOptInInteractor;
        this.f172955c = transactionsWidgetUiModel;
        this.d = revPointsAvailabilityInteractor;
        this.e = cashbackTransactionsFilterProvider;
        this.f = revPointsBannerItemsMapper;
    }
}
