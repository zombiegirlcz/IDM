package sdi;

import ahe.h0;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.spaces.ProductSpaceIdentifier;
import com.revolut.feature_rev_points_pocket_api.R$string;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import sa6.y;
import zh9.u0;
import zhm.v;

/* JADX INFO: loaded from: classes10.dex */
public final class q implements z5e.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ldi.f f261926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tdi.g f261927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tdi.d f261928c;
    public final tdi.c d;
    public final oqk.b e;
    public final nhf.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final fub.k f261929g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final nyb.k f261930h;
    public final gte.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ldi.a f261931j;

    public q(ldi.f revPointsPocketInteractor, tdi.g productAccountMapper, tdi.d pointsEarnedMapper, tdi.c featuredRewardsMapper, oqk.b retailAccountCustomizationInteractor, nhf.a unitedWalletInteractor, fub.k revPointsTransactionItemsMapper, nyb.k revPointsInteractor, tdi.e revPointsPocketProductAccountDiscoverMapper, gte.a featureToggleInteractor, ldi.a revPointsPocketAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(revPointsPocketInteractor, "revPointsPocketInteractor");
        Intrinsics.checkNotNullParameter(productAccountMapper, "productAccountMapper");
        Intrinsics.checkNotNullParameter(pointsEarnedMapper, "pointsEarnedMapper");
        Intrinsics.checkNotNullParameter(featuredRewardsMapper, "featuredRewardsMapper");
        Intrinsics.checkNotNullParameter(retailAccountCustomizationInteractor, "retailAccountCustomizationInteractor");
        Intrinsics.checkNotNullParameter(unitedWalletInteractor, "unitedWalletInteractor");
        Intrinsics.checkNotNullParameter(revPointsTransactionItemsMapper, "revPointsTransactionItemsMapper");
        Intrinsics.checkNotNullParameter(revPointsInteractor, "revPointsInteractor");
        Intrinsics.checkNotNullParameter(revPointsPocketProductAccountDiscoverMapper, "revPointsPocketProductAccountDiscoverMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(revPointsPocketAvailabilityInteractor, "revPointsPocketAvailabilityInteractor");
        this.f261926a = revPointsPocketInteractor;
        this.f261927b = productAccountMapper;
        this.f261928c = pointsEarnedMapper;
        this.d = featuredRewardsMapper;
        this.e = retailAccountCustomizationInteractor;
        this.f = unitedWalletInteractor;
        this.f261929g = revPointsTransactionItemsMapper;
        this.f261930h = revPointsInteractor;
        this.i = featureToggleInteractor;
        this.f261931j = revPointsPocketAvailabilityInteractor;
    }

    @Override // z5e.c
    public final Flow a(ProductAccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        List listK = v.k(new RowDelegate.Model("POINTS_POCKET_DISCOVER_CONTENT_RECEIVE_POINTS_ITEM_ID", tdi.e.a(R$drawable.uikit_icn_24_calendar_recurring), new TextLocalisedClause(R$string.rev_points_pocket_discovery_notes_receive_points_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.rev_points_pocket_discovery_notes_receive_points_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824), new RowDelegate.Model("POINTS_POCKET_DISCOVER_CONTENT_MIN_BALANCE_ITEM_ID", tdi.e.a(R$drawable.uikit_icn_24_coins), new TextLocalisedClause(R$string.rev_points_pocket_discovery_notes_minimum_balance_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.rev_points_pocket_discovery_notes_minimum_balance_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824), new RowDelegate.Model("POINTS_POCKET_DISCOVER_CONTENT_WITHDRAW_ITEM_ID", tdi.e.a(R$drawable.uikit_icn_24_arrow_down), new TextLocalisedClause(R$string.rev_points_pocket_discovery_notes_withdraw_title, null, null, 14), null, 0, new TextLocalisedClause(R$string.rev_points_pocket_discovery_notes_withdraw_subtitle, null, null, 14), null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536868824));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return new go.g(new zfe.c(listK, null), 2);
    }

    @Override // z5e.c
    public final Flow f(ProductSpaceIdentifier productSpaceIdentifier, sfe.a dataLoadingMode) {
        Intrinsics.checkNotNullParameter(productSpaceIdentifier, "productSpaceIdentifier");
        Intrinsics.checkNotNullParameter(dataLoadingMode, "dataLoadingMode");
        w4l.k kVarC = c8g.c.C(dataLoadingMode);
        ldi.f fVar = this.f261926a;
        akg.n nVarV = nim.a.v(u0.m(fVar.c(kVarC), fVar.b(kVarC)), new y(26));
        ldi.a aVar = this.f261931j;
        final int i = 1;
        final int i2 = 0;
        return nim.a.v(u0.m(nVarV, nim.a.v(boh.f.e(((nyb.b) aVar.f194130b).d(), new laj.b(aVar, 12)), new Function1(this) { // from class: sdi.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f261912b;

            {
                this.f261912b = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:9:0x001d  */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r4) {
                /*
                    r3 = this;
                    int r0 = r2
                    switch(r0) {
                        case 0: goto L23;
                        default: goto L5;
                    }
                L5:
                    java.lang.Boolean r4 = (java.lang.Boolean) r4
                    boolean r4 = r4.booleanValue()
                    if (r4 == 0) goto L1d
                    sdi.q r4 = r3.f261912b
                    gte.a r4 = r4.i
                    com.revolut.feature_rev_points_pocket_api.RevPointsPocketApi$Toggles$RevPointsPocketDiscovery r0 = com.revolut.feature_rev_points_pocket_api.RevPointsPocketApi$Toggles.RevPointsPocketDiscovery.f97776c
                    jte.d r4 = (jte.d) r4
                    boolean r4 = r4.c(r0)
                    if (r4 == 0) goto L1d
                    r4 = 1
                    goto L1e
                L1d:
                    r4 = 0
                L1e:
                    java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
                    return r4
                L23:
                    kotlin.Pair r4 = (kotlin.Pair) r4
                    java.lang.String r0 = "<destruct>"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                    java.lang.Object r0 = r4.f186385a
                    kotlin.Pair r0 = (kotlin.Pair) r0
                    java.lang.Object r4 = r4.f186386b
                    java.lang.Boolean r4 = (java.lang.Boolean) r4
                    boolean r4 = r4.booleanValue()
                    java.lang.Object r1 = r0.f186385a
                    com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketState r1 = (com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketState) r1
                    java.lang.Object r0 = r0.f186386b
                    java.util.List r0 = (java.util.List) r0
                    boolean r2 = r1 instanceof com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketState.Active
                    if (r2 == 0) goto L57
                    sdi.q r4 = r3.f261912b
                    tdi.g r4 = r4.f261927b
                    com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketState$Active r1 = (com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketState.Active) r1
                    com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketInfo r1 = r1.f97790b
                    com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketThreshold r0 = hx7.q.t(r1, r0)
                    com.revolut.feature.tab.accounts.api.model.ProductAccount$ValueItem$Main r4 = r4.a(r1, r0)
                    java.util.List r4 = zhm.u.c(r4)
                    goto L72
                L57:
                    boolean r1 = r1 instanceof com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketState.Inactive
                    if (r1 == 0) goto L73
                    if (r4 == 0) goto L70
                    com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketThreshold r4 = hx7.q.B(r0)
                    if (r4 == 0) goto L6d
                    com.revolut.feature.tab.accounts.api.model.ProductAccount$ValueItem$Discover r4 = tdi.e.b(r4)
                    java.util.List r4 = zhm.u.c(r4)
                    if (r4 != 0) goto L72
                L6d:
                    zhm.f0 r4 = zhm.f0.f322471a
                    goto L72
                L70:
                    zhm.f0 r4 = zhm.f0.f322471a
                L72:
                    return r4
                L73:
                    kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
                    r4.<init>()
                    throw r4
                */
                throw new UnsupportedOperationException("Method not decompiled: sdi.j.invoke(java.lang.Object):java.lang.Object");
            }
        })), new Function1(this) { // from class: sdi.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ q f261912b;

            {
                this.f261912b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object v) {
                /*
                    this = this;
                    int r0 = r2
                    switch(r0) {
                        case 0: goto L23;
                        default: goto L5;
                    }
                L5:
                    java.lang.Boolean r4 = (java.lang.Boolean) r4
                    boolean r4 = r4.booleanValue()
                    if (r4 == 0) goto L1d
                    sdi.q r4 = r3.f261912b
                    gte.a r4 = r4.i
                    com.revolut.feature_rev_points_pocket_api.RevPointsPocketApi$Toggles$RevPointsPocketDiscovery r0 = com.revolut.feature_rev_points_pocket_api.RevPointsPocketApi$Toggles.RevPointsPocketDiscovery.f97776c
                    jte.d r4 = (jte.d) r4
                    boolean r4 = r4.c(r0)
                    if (r4 == 0) goto L1d
                    r4 = 1
                    goto L1e
                L1d:
                    r4 = 0
                L1e:
                    java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
                    return r4
                L23:
                    kotlin.Pair r4 = (kotlin.Pair) r4
                    java.lang.String r0 = "<destruct>"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
                    java.lang.Object r0 = r4.f186385a
                    kotlin.Pair r0 = (kotlin.Pair) r0
                    java.lang.Object r4 = r4.f186386b
                    java.lang.Boolean r4 = (java.lang.Boolean) r4
                    boolean r4 = r4.booleanValue()
                    java.lang.Object r1 = r0.f186385a
                    com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketState r1 = (com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketState) r1
                    java.lang.Object r0 = r0.f186386b
                    java.util.List r0 = (java.util.List) r0
                    boolean r2 = r1 instanceof com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketState.Active
                    if (r2 == 0) goto L57
                    sdi.q r4 = r3.f261912b
                    tdi.g r4 = r4.f261927b
                    com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketState$Active r1 = (com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketState.Active) r1
                    com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketInfo r1 = r1.f97790b
                    com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketThreshold r0 = hx7.q.t(r1, r0)
                    com.revolut.feature.tab.accounts.api.model.ProductAccount$ValueItem$Main r4 = r4.a(r1, r0)
                    java.util.List r4 = zhm.u.c(r4)
                    goto L72
                L57:
                    boolean r1 = r1 instanceof com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketState.Inactive
                    if (r1 == 0) goto L73
                    if (r4 == 0) goto L70
                    com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketThreshold r4 = hx7.q.B(r0)
                    if (r4 == 0) goto L6d
                    com.revolut.feature.tab.accounts.api.model.ProductAccount$ValueItem$Discover r4 = tdi.e.b(r4)
                    java.util.List r4 = zhm.u.c(r4)
                    if (r4 != 0) goto L72
                L6d:
                    zhm.f0 r4 = zhm.f0.f322471a
                    goto L72
                L70:
                    zhm.f0 r4 = zhm.f0.f322471a
                L72:
                    return r4
                L73:
                    kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
                    r4.<init>()
                    throw r4
                */
                throw new UnsupportedOperationException("Method not decompiled: sdi.j.invoke(java.lang.Object):java.lang.Object");
            }
        });
    }

    @Override // z5e.c
    public final Flow h(ProductAccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        ldi.f fVar = this.f261926a;
        w4l.h hVar = w4l.h.f294642c;
        Continuation continuation = null;
        wkm.l lVarQ = vkm.q.Q(mo3.a.g(fVar.c(hVar), null, new sa5.a(17), 1), new o(0, continuation, this));
        s6e.v vVar = new s6e.v(nim.a.v(fVar.c(hVar), new y(27)), this, 3);
        w4l.i loadingStrategy = w4l.i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        jxb.l lVar = (jxb.l) this.f261930h.f220804a;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        vkm.d dVarB = rd0.e.b(lVar.f179129j.e(Unit.f186387a, loadingStrategy));
        int i = 4;
        return ta6.a.h(lVarQ, vVar, new s6e.v(dVarB, this, i), new h0(i, 6, continuation));
    }

    @Override // z5e.c
    public final Flow j(ProductAccountId accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        ldi.f fVar = this.f261926a;
        w4l.h hVar = w4l.h.f294642c;
        return nim.a.v(nim.a.v(u0.m(fVar.c(hVar), fVar.b(hVar)), new y(26)), new k(this, accountId, 0));
    }
}
