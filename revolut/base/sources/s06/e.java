package s06;

import b93.f;
import bgk.b;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.card_order_new.api.navigation.CardOrderFlowDestination;
import com.revolut.feature.external_accounts.api.model.ExternalAccountModel;
import com.revolut.feature.external_accounts.api.model.ExternalInstitutionAuthData;
import com.revolut.feature.external_accounts.impl.repository.network.InstitutionAccountsService;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import skm.e0;
import skm.p0;
import zh9.r0;
import zh9.u0;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f258850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f258851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f258852c;
    public final /* synthetic */ Object d;

    public /* synthetic */ e(TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, TextLocalisedClause textLocalisedClause3, swb.k kVar) {
        this.f258850a = 18;
        this.f258851b = textLocalisedClause;
        this.f258852c = textLocalisedClause2;
        this.d = textLocalisedClause3;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object a(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f258851b
            t43.c r0 = (t43.c) r0
            java.lang.Object r1 = r8.f258852c
            xi0.b r1 = (xi0.b) r1
            java.lang.Object r2 = r8.d
            java.util.List r2 = (java.util.List) r2
            x33.a r9 = (x33.a) r9
            java.lang.String r3 = "pocketWithBalance"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r3)
            r0.getClass()
            com.revolut.feature.cards.models.card.PocketWithSubaccount r0 = r9.f302630a
            io3.d r0 = r0.f65523a
            xi0.b r0 = z92.f.l(r0)
            com.revolut.feature.cards.models.card.PocketWithSubaccount r9 = r9.f302630a
            boolean r3 = r9.a()
            io3.d r9 = r9.f65523a
            r4 = 0
            if (r3 == 0) goto L31
            long r6 = r9.i
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 < 0) goto L52
            goto L67
        L31:
            boolean r3 = cp5.d.A(r0)
            if (r3 == 0) goto L3e
            long r6 = r9.i
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 < 0) goto L52
            goto L67
        L3e:
            boolean r0 = cp5.d.z(r0)
            if (r0 == 0) goto L4b
            long r6 = r9.i
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 <= 0) goto L52
            goto L67
        L4b:
            long r6 = r9.i
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 <= 0) goto L52
            goto L67
        L52:
            java.lang.String r0 = r9.f163147c
            java.lang.String r1 = r1.f306286a
            boolean r0 = kotlin.jvm.internal.Intrinsics.f(r0, r1)
            if (r0 != 0) goto L67
            java.lang.String r9 = r9.f163145a
            boolean r9 = r2.contains(r9)
            if (r9 == 0) goto L65
            goto L67
        L65:
            r9 = 0
            goto L68
        L67:
            r9 = 1
        L68:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: s06.e.a(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0063  */
    /* JADX WARN: Type inference failed for: r11v14, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object b(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s06.e.b(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object c(Object obj2) {
        FeatureCommand featureCommand;
        com.revolut.retail.feature.pricing_plans.ui.impl.flows.checkout.a aVar = (com.revolut.retail.feature.pricing_plans.ui.impl.flows.checkout.a) this.f258851b;
        b93.f fVar = (b93.f) this.f258852c;
        pi3.h checkoutPlan = (pi3.h) this.d;
        bgk.b output = (bgk.b) obj2;
        Intrinsics.checkNotNullParameter(output, "output");
        if (Intrinsics.f(output, b.C0097b.f15210a) || Intrinsics.f(output, b.c.f15211a)) {
            tfk.a aVar2 = aVar.u;
            String planId = checkoutPlan.f236404a.f152287a;
            aVar2.getClass();
            Intrinsics.checkNotNullParameter(planId, "planId");
            CoroutineScope coroutineScope = aVar2.f270326a;
            p0 p0Var = p0.f264001a;
            Continuation continuation = null;
            e0.C(coroutineScope, elm.f.f127540b, null, new sx2.r(aVar2, planId, continuation, 28), 2);
            int i = 6;
            if ((fVar instanceof f.a) || (fVar instanceof f.b) || (fVar instanceof b93.h)) {
                aVar.n2(new sma.f(aVar, fVar, checkoutPlan, continuation, 17), new whi.b(i));
            } else {
                if (!(fVar instanceof b93.g)) {
                    throw new NoWhenBranchMatchedException();
                }
                b93.g cardParams = (b93.g) fVar;
                Intrinsics.checkNotNullParameter(cardParams, "<this>");
                String str = cardParams.f13620b;
                e93.f fVar2 = cardParams.f13619a;
                if (str == null || cardParams.d == null || cardParams.e == null) {
                    Continuation continuation2 = null;
                    tgk.d dVar = aVar.o;
                    if (dVar.e) {
                        aVar.n2(new tgk.f(aVar, checkoutPlan, continuation2, 1), new whi.b(i));
                    } else {
                        tgk.a aVar3 = aVar.f102977r;
                        AccountId accountId = dVar.f271192g;
                        e93.d dVar2 = dVar.d;
                        aVar3.getClass();
                        Intrinsics.checkNotNullParameter(cardParams, "cardParams");
                        Intrinsics.checkNotNullParameter(checkoutPlan, "checkoutPlan");
                        Intrinsics.checkNotNullParameter(accountId, "accountId");
                        e93.n nVar = continuation2;
                        if (dVar2 != null) {
                            nVar = dVar2.i;
                        }
                        if (nVar != 0) {
                            featureCommand = u0.f(new CardOrderFlowDestination.CardPersonalisation(nVar, false, new c93.b(fVar2), cardParams.f, checkoutPlan, null, null, cardParams.f13623h, accountId, null, null, null, 15558));
                        } else {
                            featureCommand = new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new CardOrderFlowDestination.CardDelivery(new c93.b(fVar2), cardParams.f, (Address) null, checkoutPlan, (NaviCommand) null, (xfa.b) null, (c93.j) null, (c93.j) null, accountId, (String) null, (String) null, (List) null, (AnalyticsProduct) null, (i93.d) null, (Set) null, (String) null, 130538), false, (Integer) null, 0, 61));
                        }
                        aVar.C1(u0.b(featureCommand));
                    }
                } else {
                    aVar.n2(new sma.f(aVar, cardParams, checkoutPlan, continuation, 17), new whi.b(i));
                }
            }
        } else if (!Intrinsics.f(output, b.a.f15209a)) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.f186387a;
    }

    private final Object d(Object obj2) {
        Object next;
        th6.c cVar = (th6.c) this.f258851b;
        ExternalInstitutionAuthData authState = (ExternalInstitutionAuthData) this.f258852c;
        String str = (String) this.d;
        List models = (List) obj2;
        Intrinsics.checkNotNullParameter(models, "models");
        Iterator it8 = models.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((ExternalAccountModel) next).f72210a, str)) {
                break;
            }
        }
        ExternalAccountModel externalAccountModel = (ExternalAccountModel) next;
        if (externalAccountModel == null) {
            return efm.b.n(new IllegalStateException("Trying to post externalAccountId for non-existent model"));
        }
        InstitutionAccountsService institutionAccountsService = cVar.f271268a;
        String str2 = authState.f72213a;
        Intrinsics.checkNotNullParameter(externalAccountModel, "<this>");
        Intrinsics.checkNotNullParameter(authState, "authState");
        String str3 = authState.f72214b;
        String str4 = authState.f72215c;
        String str5 = externalAccountModel.f72210a;
        String str6 = externalAccountModel.f72211b;
        String str7 = externalAccountModel.f72212c;
        String str8 = externalAccountModel.d;
        String str9 = externalAccountModel.e.f306286a;
        ArrayList arrayList = externalAccountModel.f;
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it9 = arrayList.iterator();
        while (it9.hasNext()) {
            arrayList2.add(((xi0.b) it9.next()).f306286a);
        }
        return institutionAccountsService.selectAccount(str2, new uh6.n(str3, str4, new uh6.i(str5, str6, str7, str8, str9, arrayList2)));
    }

    private final Object e(Object obj2) {
        ti9.g gVar = (ti9.g) this.f258851b;
        String transactionId = (String) this.f258852c;
        w4l.k loadingStrategy = (w4l.k) this.d;
        r0 plan = (r0) obj2;
        Intrinsics.checkNotNullParameter(plan, "plan");
        ci9.a aVar = gVar.f271458c;
        String facilityId = plan.f322327b;
        ej9.p pVar = (ej9.p) aVar;
        pVar.getClass();
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return pVar.f.e(new ej9.n(transactionId, facilityId), loadingStrategy);
    }

    /* JADX WARN: Code restructure failed: missing block: B:96:0x0394, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.f(r2, ((dv9.o) r1).f118078b) != false) goto L101;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v62, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v47, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r39) {
        /*
            Method dump skipped, instruction units count: 3152
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s06.e.invoke(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ e(Object obj2, int i, Object obj3, Object obj4) {
        this.f258850a = i;
        this.f258851b = obj2;
        this.f258852c = obj3;
        this.d = obj4;
    }
}
