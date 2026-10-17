package vdl;

import com.revolut.shared.feature.wealth.domain.impl.data.network.PortfolioSettingsService;
import com.revolut.shared.feature.wealth.models.portfolio.StockBuyBlock;
import ip0.v7;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.BERTags;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class t0 {

    @NotNull
    public static final s0 Companion = new s0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ne0.j f288044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PortfolioSettingsService f288045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dcl.w0 f288046c;
    public final w4l.f d;

    public t0(ne0.j memoryCache, PortfolioSettingsService service, b80.c networkStateRepository, dcl.w0 settingsDao) {
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(networkStateRepository, "networkStateRepository");
        Intrinsics.checkNotNullParameter(settingsDao, "settingsDao");
        this.f288044a = memoryCache;
        this.f288045b = service;
        this.f288046c = settingsDao;
        u3a.p pVar = new u3a.p(this, networkStateRepository, 10);
        final int i = 0;
        Function1 function1 = new Function1(this) { // from class: vdl.q0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t0 f288034b;

            {
                this.f288034b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String portfolioId = (String) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                        return (StockBuyBlock) v7.r("STOCK_BUY_BLOCK_KEY_", portfolioId, this.f288034b.f288044a);
                    default:
                        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                        ocl.a aVarB = this.f288034b.f288046c.b();
                        if (aVarB == null) {
                            return null;
                        }
                        if (!Intrinsics.f(aVarB.f224249a, portfolioId)) {
                            aVarB = null;
                        }
                        if (aVarB == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(aVarB, "<this>");
                        int i2 = ycl.a.f312634b[aVarB.f224250b.ordinal()];
                        if (i2 == 1) {
                            return StockBuyBlock.Active.f105144a;
                        }
                        if (i2 == 2) {
                            return StockBuyBlock.Inactive.f105145a;
                        }
                        if (i2 == 3) {
                            return new StockBuyBlock.PendingDeactivation(aVarB.f224251c);
                        }
                        throw new NoWhenBranchMatchedException();
                }
            }
        };
        Function2 function2 = new Function2(this) { // from class: vdl.r0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t0 f288039b;

            {
                this.f288039b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                ocl.b bVar;
                String portfolioId = (String) obj2;
                StockBuyBlock data = (StockBuyBlock) obj3;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                        Intrinsics.checkNotNullParameter(data, "data");
                        this.f288039b.f288044a.f("STOCK_BUY_BLOCK_KEY_" + portfolioId, data);
                        return Unit.f186387a;
                    default:
                        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                        Intrinsics.checkNotNullParameter(data, "stockBlockBuyData");
                        Intrinsics.checkNotNullParameter(data, "<this>");
                        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                        if (Intrinsics.f(data, StockBuyBlock.Active.f105144a)) {
                            bVar = ocl.b.ACTIVE;
                        } else if (Intrinsics.f(data, StockBuyBlock.Inactive.f105145a)) {
                            bVar = ocl.b.INACTIVE;
                        } else {
                            if (!(data instanceof StockBuyBlock.PendingDeactivation)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            bVar = ocl.b.PENDING_DEACTIVATION;
                        }
                        StockBuyBlock.PendingDeactivation pendingDeactivation = data instanceof StockBuyBlock.PendingDeactivation ? (StockBuyBlock.PendingDeactivation) data : null;
                        this.f288039b.f288046c.d(new ocl.a(portfolioId, bVar, pendingDeactivation != null ? pendingDeactivation.f105146a : null));
                        return Unit.f186387a;
                }
            }
        };
        final int i2 = 1;
        this.d = new w4l.f(pVar, function1, function2, new Function1(this) { // from class: vdl.q0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t0 f288034b;

            {
                this.f288034b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                String portfolioId = (String) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                        return (StockBuyBlock) v7.r("STOCK_BUY_BLOCK_KEY_", portfolioId, this.f288034b.f288044a);
                    default:
                        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                        ocl.a aVarB = this.f288034b.f288046c.b();
                        if (aVarB == null) {
                            return null;
                        }
                        if (!Intrinsics.f(aVarB.f224249a, portfolioId)) {
                            aVarB = null;
                        }
                        if (aVarB == null) {
                            return null;
                        }
                        Intrinsics.checkNotNullParameter(aVarB, "<this>");
                        int i22 = ycl.a.f312634b[aVarB.f224250b.ordinal()];
                        if (i22 == 1) {
                            return StockBuyBlock.Active.f105144a;
                        }
                        if (i22 == 2) {
                            return StockBuyBlock.Inactive.f105145a;
                        }
                        if (i22 == 3) {
                            return new StockBuyBlock.PendingDeactivation(aVarB.f224251c);
                        }
                        throw new NoWhenBranchMatchedException();
                }
            }
        }, new Function2(this) { // from class: vdl.r0

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ t0 f288039b;

            {
                this.f288039b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                ocl.b bVar;
                String portfolioId = (String) obj2;
                StockBuyBlock data = (StockBuyBlock) obj3;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                        Intrinsics.checkNotNullParameter(data, "data");
                        this.f288039b.f288044a.f("STOCK_BUY_BLOCK_KEY_" + portfolioId, data);
                        return Unit.f186387a;
                    default:
                        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                        Intrinsics.checkNotNullParameter(data, "stockBlockBuyData");
                        Intrinsics.checkNotNullParameter(data, "<this>");
                        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
                        if (Intrinsics.f(data, StockBuyBlock.Active.f105144a)) {
                            bVar = ocl.b.ACTIVE;
                        } else if (Intrinsics.f(data, StockBuyBlock.Inactive.f105145a)) {
                            bVar = ocl.b.INACTIVE;
                        } else {
                            if (!(data instanceof StockBuyBlock.PendingDeactivation)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            bVar = ocl.b.PENDING_DEACTIVATION;
                        }
                        StockBuyBlock.PendingDeactivation pendingDeactivation = data instanceof StockBuyBlock.PendingDeactivation ? (StockBuyBlock.PendingDeactivation) data : null;
                        this.f288039b.f288046c.d(new ocl.a(portfolioId, bVar, pendingDeactivation != null ? pendingDeactivation.f105146a : null));
                        return Unit.f186387a;
                }
            }
        }, null, null, null, BERTags.FLAGS);
    }
}
