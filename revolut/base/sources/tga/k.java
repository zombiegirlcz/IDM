package tga;

import com.revolut.data.model.Data;
import com.revolut.feature.pricing_plans.upgrade_prompt.api.entry_point.UpgradeEntryPointItemContract$ItemType;
import efm.r;
import ffk.t;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mga.d0;
import mga.g0;
import vkm.q;
import vkm.v1;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class k implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ang.f f271122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f271123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ou5.b f271124c;
    public final c d;

    public k(ang.f userInteractor, t pricingPlanInteractor, g entryPointItemsBuilder, uga.c availabilityResolverForPlan, uga.d availabilityResolverForType, uga.e availabilityResolverForUser, uga.b bannerVariantResolver, ou5.b contextualBannerInteractor, c contextualBannerItemBuilder) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(entryPointItemsBuilder, "entryPointItemsBuilder");
        Intrinsics.checkNotNullParameter(availabilityResolverForPlan, "availabilityResolverForPlan");
        Intrinsics.checkNotNullParameter(availabilityResolverForType, "availabilityResolverForType");
        Intrinsics.checkNotNullParameter(availabilityResolverForUser, "availabilityResolverForUser");
        Intrinsics.checkNotNullParameter(bannerVariantResolver, "bannerVariantResolver");
        Intrinsics.checkNotNullParameter(contextualBannerInteractor, "contextualBannerInteractor");
        Intrinsics.checkNotNullParameter(contextualBannerItemBuilder, "contextualBannerItemBuilder");
        this.f271122a = userInteractor;
        this.f271123b = pricingPlanInteractor;
        this.f271124c = contextualBannerInteractor;
        this.d = contextualBannerItemBuilder;
    }

    public final r a(UpgradeEntryPointItemContract$ItemType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        boolean zEquals = type.equals(UpgradeEntryPointItemContract$ItemType.Fees.Stocks.f80979a);
        od0.i iVar = od0.i.f224256b;
        if (zEquals || type.equals(UpgradeEntryPointItemContract$ItemType.ReviewOrder.Stocks.f80993a) || type.equals(UpgradeEntryPointItemContract$ItemType.Transaction.Stocks.f80999a)) {
            od0.i.Companion.getClass();
            return zi0.c.j(iVar);
        }
        if (!type.equals(UpgradeEntryPointItemContract$ItemType.Transaction.Exchange.f80998a) && !type.equals(UpgradeEntryPointItemContract$ItemType.Fees.Commodity.f80977a) && !type.equals(UpgradeEntryPointItemContract$ItemType.ReviewOrder.Commodity.f80980a) && !type.equals(UpgradeEntryPointItemContract$ItemType.Transaction.Commodity.f80995a) && !type.equals(UpgradeEntryPointItemContract$ItemType.Fees.Crypto.f80978a) && !(type instanceof UpgradeEntryPointItemContract$ItemType.ReviewOrder.CryptoFeeTiering) && !type.equals(UpgradeEntryPointItemContract$ItemType.Transaction.Crypto.f80996a) && !(type instanceof UpgradeEntryPointItemContract$ItemType.Transaction.CryptoFeeTiering) && !type.equals(UpgradeEntryPointItemContract$ItemType.Transaction.Atm.f80994a)) {
            throw new NoWhenBranchMatchedException();
        }
        if ((type instanceof UpgradeEntryPointItemContract$ItemType.ReviewOrder.CryptoFeeTiering) || (type instanceof UpgradeEntryPointItemContract$ItemType.Transaction.CryptoFeeTiering)) {
            od0.i.Companion.getClass();
            return zi0.c.j(iVar);
        }
        r rVarK = this.f271122a.k(false);
        t tVar = this.f271123b;
        r rVarW = nim.a.w(kli.a.i(rVarK, tVar.q(), tVar.o()), new td1.f(this, type, 16));
        od0.i.Companion.getClass();
        return ue0.e.E(rVarW, new Data(iVar, null, false, 6, null));
    }

    public final r b(d0 context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return m70.a.g(rd0.e.c(d(context), kotlin.coroutines.g.f186406a), null, new tc6.b(23), 1);
    }

    public final r c(UpgradeEntryPointItemContract$ItemType type) {
        uga.a aVar;
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(type, "type");
        if ((type instanceof UpgradeEntryPointItemContract$ItemType.Transaction.Exchange) || (type instanceof UpgradeEntryPointItemContract$ItemType.Transaction.Atm)) {
            aVar = uga.a.CONTEXTUAL;
        } else {
            if (!(type instanceof UpgradeEntryPointItemContract$ItemType.Fees.Commodity) && !(type instanceof UpgradeEntryPointItemContract$ItemType.ReviewOrder.Commodity) && !(type instanceof UpgradeEntryPointItemContract$ItemType.Transaction.Commodity) && !(type instanceof UpgradeEntryPointItemContract$ItemType.Fees.Crypto) && !(type instanceof UpgradeEntryPointItemContract$ItemType.ReviewOrder.CryptoFeeTiering) && !(type instanceof UpgradeEntryPointItemContract$ItemType.Transaction.Crypto) && !(type instanceof UpgradeEntryPointItemContract$ItemType.Transaction.CryptoFeeTiering) && !(type instanceof UpgradeEntryPointItemContract$ItemType.Fees.Stocks) && !(type instanceof UpgradeEntryPointItemContract$ItemType.ReviewOrder.Stocks) && !(type instanceof UpgradeEntryPointItemContract$ItemType.Transaction.Stocks)) {
                throw new NoWhenBranchMatchedException();
            }
            aVar = uga.a.LEGACY;
        }
        int i = i.f271120a[aVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return a(type);
            }
            throw new NoWhenBranchMatchedException();
        }
        Continuation continuation = null;
        return rd0.e.c(rd0.e.e(q.B(new t9h.b(this, continuation, 14), new v1(new sx2.r(type, continuation, 29))), h0.f322473a, new tc6.d(3, 1, continuation)), kotlin.coroutines.g.f186406a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0097 A[PHI: r0
      0x0097: PHI (r0v46 java.lang.String) = (r0v45 java.lang.String), (r0v49 java.lang.String) binds: [B:27:0x00a1, B:21:0x0093] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlinx.coroutines.flow.Flow d(mga.d0 r13) {
        /*
            Method dump skipped, instruction units count: 612
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tga.k.d(mga.d0):kotlinx.coroutines.flow.Flow");
    }
}
