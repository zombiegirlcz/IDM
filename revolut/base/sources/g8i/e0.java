package g8i;

import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.feature_move_money.impl.model.MoveMoneyOrderInfo;
import com.revolut.feature_move_money.impl.review.MoveMoneyReviewScreenContract$InputData;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData;
import kl.t1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final class e0 extends jki.g implements v {
    public final f61.a A;
    public final q7i.a B;
    public final n5k.q C;
    public final r D;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final MoveMoneyInputData f141366p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final w5i.d f141367q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ang.f f141368r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final zof.f f141369s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final t1 f141370t;
    public final h8i.e u;
    public final tga.k v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final MoveMoneyReviewScreenContract$InputData f141371w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final a f141372x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final d f141373y;
    public final vrf.h z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(MoveMoneyInputData moveMoneyInputData, w5i.d quoteInteractor, ang.f userInteractor, zof.f transferFeatureScreensProvider, t1 currencyRateNaviProvider, h8i.e disclaimerDelegate, tga.k upgradeEntryPointItemProvider, MoveMoneyReviewScreenContract$InputData inputData, a dealableQuoteEligibilityChecker, d moveMoneyReviewDescriptionProvider, vrf.h transferSectionClickHandlersFactory, f61.a transferSectionDataDelegate, q7i.a noteDelegate, n5k.q rateExplanationExtension, jki.p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(moveMoneyInputData, "moveMoneyInputData");
        Intrinsics.checkNotNullParameter(quoteInteractor, "quoteInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(transferFeatureScreensProvider, "transferFeatureScreensProvider");
        Intrinsics.checkNotNullParameter(currencyRateNaviProvider, "currencyRateNaviProvider");
        Intrinsics.checkNotNullParameter(disclaimerDelegate, "disclaimerDelegate");
        Intrinsics.checkNotNullParameter(upgradeEntryPointItemProvider, "upgradeEntryPointItemProvider");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(dealableQuoteEligibilityChecker, "dealableQuoteEligibilityChecker");
        Intrinsics.checkNotNullParameter(moveMoneyReviewDescriptionProvider, "moveMoneyReviewDescriptionProvider");
        Intrinsics.checkNotNullParameter(transferSectionClickHandlersFactory, "transferSectionClickHandlersFactory");
        Intrinsics.checkNotNullParameter(transferSectionDataDelegate, "transferSectionDataDelegate");
        Intrinsics.checkNotNullParameter(noteDelegate, "noteDelegate");
        Intrinsics.checkNotNullParameter(rateExplanationExtension, "rateExplanationExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f141366p = moveMoneyInputData;
        this.f141367q = quoteInteractor;
        this.f141368r = userInteractor;
        this.f141369s = transferFeatureScreensProvider;
        this.f141370t = currencyRateNaviProvider;
        this.u = disclaimerDelegate;
        this.v = upgradeEntryPointItemProvider;
        this.f141371w = inputData;
        this.f141372x = dealableQuoteEligibilityChecker;
        this.f141373y = moveMoneyReviewDescriptionProvider;
        this.z = transferSectionClickHandlersFactory;
        this.A = transferSectionDataDelegate;
        this.B = noteDelegate;
        this.C = rateExplanationExtension;
        OrderQuote orderQuote = inputData.f97411b;
        MoveMoneyOrderInfo moveMoneyOrderInfo = inputData.f97410a;
        this.D = new r(orderQuote, moveMoneyOrderInfo.d, moveMoneyOrderInfo.e, moveMoneyOrderInfo.f97403c, moveMoneyOrderInfo.f, false, moveMoneyOrderInfo.f97401a, null, null, null, moveMoneyInputData.f104833a, zhm.f0.f322471a);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l2(new g0a.e(4, continuation, this), new yi5.b(26));
        MoveMoneyReviewScreenContract$InputData moveMoneyReviewScreenContract$InputData = this.f141371w;
        j8l.a aVar = moveMoneyReviewScreenContract$InputData.f97410a.d.f97224a;
        Intrinsics.checkNotNullParameter(aVar, "<this>");
        j8l.a aVar2 = j8l.a.FIAT;
        if (aVar == aVar2) {
            j8l.a aVar3 = moveMoneyReviewScreenContract$InputData.f97410a.e.f97224a;
            Intrinsics.checkNotNullParameter(aVar3, "<this>");
            if (aVar3 == aVar2) {
                yji.l.a1(this, vkm.q.Q(vkm.q.q(new g4b.a0(q2(), 5)), new g6f.l(continuation, this, 1)), null, null, new a0(this, continuation, 0), 3);
            }
        }
        yji.l.a1(this, rd0.e.d(vkm.q.q(vkm.q.Q(vkm.q.q(new g4b.a0(q2(), 6)), new g6f.l(continuation, this.A, 2))), h0.f322473a), null, null, new a0(this, continuation, 2), 3);
    }

    @Override // yji.l
    public final void T1(long j2) {
        AccountWrapper accountWrapper = ((r) t2()).f141386b;
        AccountWrapper accountWrapper2 = ((r) t2()).f141387c;
        long j3 = ((r) t2()).d;
        int i = y.f141403a[((r) t2()).e.ordinal()];
        boolean z = true;
        if (i == 1) {
            z = false;
        } else if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        boolean z3 = z;
        yji.l.b1(this, ((c8i.z) this.f141367q).d(accountWrapper, accountWrapper2, j3, z3, ((r) t2()).f141388g, this.f141372x.b(((r) t2()).f141386b, ((r) t2()).f141387c, ((r) t2()).f141388g)), null, new a0(this, null, 1), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.D;
    }
}
