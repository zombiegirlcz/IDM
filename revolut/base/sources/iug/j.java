package iug;

import a3e.s;
import a83.p0;
import android.net.Uri;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import com.revolut.core.ui_kit.delegates.u8;
import com.revolut.data.model.Data;
import com.revolut.feature.card_payment_method.impl.flows.link_card.screens.details.LinkCardDetailsReviewScreen;
import com.revolut.feature.credit.loan.api.navigation.LoanKompotFeatureConfig;
import com.revolut.feature.credit.loan.autopay.impl.ui.select_account.selector_v2.SelectAccountV2Controller;
import com.revolut.feature.credit.loan.impl.ui.rev10.paymentmanagement.manage.LoanManageRepaymentsController;
import com.revolut.feature.credit.loan.impl.ui.rev10.paymentmanagement.manage.LoanManageRepaymentsControllerContract$ChangeAccountParcel;
import com.revolut.feature.credit.loan.impl.ui.rev10.paymentmanagement.manage.LoanManageRepaymentsControllerContract$ModalStep;
import com.revolut.feature.insurance_embedded.impl.ui.screen.documents.preview.InsuranceDocumentsPreviewScreen;
import com.revolut.feature.junior.account_activation.impl.ui.screen.edit_dob.EditBirthDateController;
import com.revolut.feature.junior_core.models.configuration.JuniorPlanConfiguration;
import com.revolut.feature.kyc.vendors.shared.impl.uaepass.UaePassScreen;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanHubInfoRewardChallenge;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanHubInfoRewardSection;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanHubInfoRewards;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.flows.plan_hub.CobrandedCardsPlanHubFlow;
import com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.rewards.CobrandedCardsPlanHubRewardsScreenContract$ModalStep;
import com.revolut.feature.shared.help_centre.api.faq.SharedFaqDestination;
import com.revolut.feature.subscriptions.api.navigation.SubscriptionsFlowDestination;
import com.revolut.feature.travel.experiences.impl.ui.screen.home.TravelExperiencesHomeScreen;
import com.revolut.feature.workflow.engine.rfi.impl.ui.base.BaseQuestionScreen;
import com.revolut.kompot.common.ModalDestination;
import h93.f0;
import iuh.f;
import iuj.z;
import iv5.o;
import iy8.r;
import iz1.p;
import j2g.y;
import j33.q;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import nii.n1;
import r10.w;
import vkm.j2;
import zhm.a0;
import zhm.q0;

/* JADX INFO: loaded from: classes9.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f168599w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.revolut.feature.kyc.impl.idnow.video_ident.screen.a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.u = 7;
        this.v = aVar;
        this.f168599w = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                j jVar = new j((k) this.f168599w, continuation, 0);
                jVar.v = obj2;
                return jVar;
            case 1:
                j jVar2 = new j((BaseQuestionScreen) this.f168599w, continuation, 1);
                jVar2.v = obj2;
                return jVar2;
            case 2:
                j jVar3 = new j((w) this.f168599w, continuation, 2);
                jVar3.v = obj2;
                return jVar3;
            case 3:
                j jVar4 = new j((iv4.g) this.f168599w, continuation, 3);
                jVar4.v = obj2;
                return jVar4;
            case 4:
                j jVar5 = new j((o) this.f168599w, continuation, 4);
                jVar5.v = obj2;
                return jVar5;
            case 5:
                j jVar6 = new j((InsuranceDocumentsPreviewScreen) this.f168599w, continuation, 5);
                jVar6.v = obj2;
                return jVar6;
            case 6:
                j jVar7 = new j((iw6.m) this.f168599w, continuation, 6);
                jVar7.v = obj2;
                return jVar7;
            case 7:
                return new j((com.revolut.feature.kyc.impl.idnow.video_ident.screen.a) this.v, (String) this.f168599w, continuation);
            case 8:
                j jVar8 = new j((iwj.a) this.f168599w, continuation, 8);
                jVar8.v = obj2;
                return jVar8;
            case 9:
                j jVar9 = new j((UaePassScreen) this.f168599w, continuation, 9);
                jVar9.v = obj2;
                return jVar9;
            case 10:
                j jVar10 = new j((iy8.o) this.f168599w, continuation, 10);
                jVar10.v = obj2;
                return jVar10;
            case 11:
                j jVar11 = new j((izd.i) this.f168599w, continuation, 11);
                jVar11.v = obj2;
                return jVar11;
            case 12:
                j jVar12 = new j((com.revolut.feature_crypto_picker.impl.ui.picker.a) this.f168599w, continuation, 12);
                jVar12.v = obj2;
                return jVar12;
            case 13:
                j jVar13 = new j((j1k.f) this.f168599w, continuation, 13);
                jVar13.v = obj2;
                return jVar13;
            case 14:
                j jVar14 = new j((j2f.o) this.f168599w, continuation, 14);
                jVar14.v = obj2;
                return jVar14;
            case 15:
                j jVar15 = new j((TravelExperiencesHomeScreen) this.f168599w, continuation, 15);
                jVar15.v = obj2;
                return jVar15;
            case 16:
                j jVar16 = new j((com.revolut.feature.card_order_new.impl.kompot.screen.extra_security.b) this.f168599w, continuation, 16);
                jVar16.v = obj2;
                return jVar16;
            case 17:
                j jVar17 = new j((j36.e) this.f168599w, continuation, 17);
                jVar17.v = obj2;
                return jVar17;
            case 18:
                j jVar18 = new j((LinkCardDetailsReviewScreen) this.f168599w, continuation, 18);
                jVar18.v = obj2;
                return jVar18;
            case 19:
                j jVar19 = new j((com.revolut.feature.card_payment_method.impl.flows.link_card.screens.details.a) this.f168599w, continuation, 19);
                jVar19.v = obj2;
                return jVar19;
            case 20:
                j jVar20 = new j((SelectAccountV2Controller) this.f168599w, continuation, 20);
                jVar20.v = obj2;
                return jVar20;
            case 21:
                j jVar21 = new j((com.revolut.feature.credit.loan.autopay.impl.ui.select_account.selector_v2.b) this.f168599w, continuation, 21);
                jVar21.v = obj2;
                return jVar21;
            case 22:
                j jVar22 = new j((com.revolut.feature.card_personalisation.generation.impl.ui.generation.a) this.f168599w, continuation, 22);
                jVar22.v = obj2;
                return jVar22;
            case 23:
                j jVar23 = new j((EditBirthDateController) this.f168599w, continuation, 23);
                jVar23.v = obj2;
                return jVar23;
            case 24:
                j jVar24 = new j((j68.i) this.f168599w, continuation, 24);
                jVar24.v = obj2;
                return jVar24;
            case 25:
                j jVar25 = new j((com.revolut.feature.payments_migration.impl.ui.screen.move_payment.account_details.a) this.f168599w, continuation, 25);
                jVar25.v = obj2;
                return jVar25;
            case 26:
                j jVar26 = new j((CobrandedCardsPlanHubFlow) this.f168599w, continuation, 26);
                jVar26.v = obj2;
                return jVar26;
            case 27:
                j jVar27 = new j((j6b.j) this.f168599w, continuation, 27);
                jVar27.v = obj2;
                return jVar27;
            case 28:
                j jVar28 = new j((LoanManageRepaymentsController) this.f168599w, continuation, 28);
                jVar28.v = obj2;
                return jVar28;
            default:
                j jVar29 = new j((com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.rewards.a) this.f168599w, continuation, 29);
                jVar29.v = obj2;
                return jVar29;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((j) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((j) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((j) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((j) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((j) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((j) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((j) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((j) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((j) create((x39.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((j) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((j) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((j) create((lzd.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((j) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((j) create((lk0.g) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((j) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((j) create((u8) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((j) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((j) create((Set) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((j) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((j) create((f0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((j) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((j) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((j) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((j) create((od0.i) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((j) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((j) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((j) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((j) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((j) create((yx4.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((j) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v105, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v114, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v25, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v42, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.util.Set] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object value;
        List list;
        String url2;
        Boolean bool;
        CobrandedCardsPlanHubInfoRewards cobrandedCardsPlanHubInfoRewards;
        String milestoneRewardCode;
        int i = 9;
        int i2 = 23;
        int i3 = 6;
        int i5 = 2;
        int i6 = 11;
        boolean zBooleanValue = true;
        int i21 = 0;
        Boolean boolValueOf = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        switch (this.u) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                k kVar = (k) this.f168599w;
                kVar.H2(kVar.f168600p, new ilk.i(data, 28));
                break;
            case 1:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                iuh.h hVarE3 = ((BaseQuestionScreen) this.f168599w).e3();
                Intrinsics.h(clickData);
                iuh.k kVar2 = (iuh.k) hVarE3;
                kVar2.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                kVar2.C2(f.a.f168609a);
                break;
            case 2:
                String indexRef = (String) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                w wVar = (w) this.f168599w;
                Intrinsics.checkNotNullParameter(indexRef, "indexRef");
                break;
            case 3:
                Data data2 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                iv4.g gVar = (iv4.g) this.f168599w;
                gVar.H2(gVar.f168718q, new z(data2, i5));
                break;
            case 4:
                Data data3 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j2 j2Var = ((o) this.f168599w).f168751s;
                do {
                    value = j2Var.getValue();
                    ((Boolean) value).getClass();
                    rt5.h hVar = (rt5.h) data3.getContent();
                    list = hVar != null ? hVar.f257199a : null;
                } while (!j2Var.h(value, Boolean.valueOf(!(list == null || list.isEmpty()))));
                break;
            case 5:
                ty0.a aVar6 = (ty0.a) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((iv7.i) ((iv7.e) ((InsuranceDocumentsPreviewScreen) this.f168599w).R.getValue())).I2(aVar6.d, aVar6.f275445a);
                break;
            case 6:
                Data data4 = (Data) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                iw6.m mVar = (iw6.m) this.f168599w;
                mVar.H2(mVar.f168983r, new z(data4, i6));
                break;
            case 7:
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.kyc.impl.idnow.video_ident.screen.a aVar10 = (com.revolut.feature.kyc.impl.idnow.video_ident.screen.a) this.v;
                iw8.i iVar = new iw8.i((String) this.f168599w);
                aVar10.H2(aVar10.f77800s, new iui.a(27));
                aVar10.C2(iVar);
                break;
            case 8:
                x39.b bVar = (x39.b) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((iwj.a) this.f168599w).f169175j = bVar == x39.b.ENABLED;
                break;
            case 9:
                String str = (String) this.v;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                UaePassScreen uaePassScreen = (UaePassScreen) this.f168599w;
                KProperty[] kPropertyArr = UaePassScreen.T;
                uaePassScreen.d3().f292848b.g0(str);
                ((iy8.o) uaePassScreen.d()).f169638w.setValue(null);
                break;
            case 10:
                String str2 = (String) this.v;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                iy8.o oVar = (iy8.o) this.f168599w;
                Uri uri2 = Uri.parse(str2);
                if (uri2.isOpaque()) {
                    url2 = null;
                } else {
                    try {
                        url2 = uri2.getQueryParameter("url");
                    } catch (IllegalArgumentException unused) {
                        url2 = null;
                    }
                }
                if (url2 != null) {
                    r rVar = oVar.f169634q;
                    ?? expectedReturnUrls = oVar.v;
                    rVar.getClass();
                    Intrinsics.checkNotNullParameter(url2, "url");
                    Intrinsics.checkNotNullParameter(expectedReturnUrls, "expectedReturnUrls");
                    if (expectedReturnUrls.contains(url2)) {
                        j2 j2Var2 = oVar.f169638w;
                        j2Var2.getClass();
                        j2Var2.g(null, url2);
                    }
                }
                break;
            case 11:
                lzd.c cVar = (lzd.c) this.v;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                izd.i iVar2 = (izd.i) this.f168599w;
                iVar2.H2(iVar2.f169879p, new iyi.i(cVar, i5));
                break;
            case 12:
                Pair pair = (Pair) this.v;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Data data5 = (Data) pair.f186385a;
                Data data6 = (Data) pair.f186386b;
                com.revolut.feature_crypto_picker.impl.ui.picker.a aVar16 = (com.revolut.feature_crypto_picker.impl.ui.picker.a) this.f168599w;
                aVar16.H2(aVar16.u, new p0(data5, data6, i2));
                break;
            case 13:
                lk0.g gVar2 = (lk0.g) this.v;
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((j1k.f) this.f168599w).x2(new s(gVar2, i3));
                break;
            case 14:
                Pair pair2 = (Pair) this.v;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Data data7 = (Data) pair2.f186385a;
                Data data8 = (Data) pair2.f186386b;
                j2f.o oVar2 = (j2f.o) this.f168599w;
                oVar2.H2(oVar2.f170862s, new p0(data7, data8, 24));
                break;
            case 15:
                u8 model = (u8) this.v;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j2g.l lVarE3 = ((TravelExperiencesHomeScreen) this.f168599w).R2();
                Intrinsics.h(model);
                y yVar = (y) lVarE3;
                yVar.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                yVar.u.Z2(new ah1.m(model, yVar, objArr == true ? 1 : 0, 21));
                break;
            case 16:
                Data data9 = (Data) this.v;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.card_order_new.impl.kompot.screen.extra_security.b bVar2 = (com.revolut.feature.card_order_new.impl.kompot.screen.extra_security.b) this.f168599w;
                cli.y yVar2 = bVar2.f65200r;
                Boolean bool2 = ((j33.i) ((j2) yVar2.f22677a).getValue()).f170942c;
                if (bool2 != null) {
                    boolean zBooleanValue2 = bool2.booleanValue();
                    e7l.f fVar = (e7l.f) data9.getContent();
                    if (fVar != null && (bool = fVar.C1) != null) {
                        zBooleanValue = bool.booleanValue();
                    } else if (!zBooleanValue2) {
                        zBooleanValue = false;
                    }
                    boolValueOf = Boolean.valueOf(zBooleanValue);
                }
                bVar2.H2(yVar2, new q(boolValueOf, data9));
                break;
            case 17:
                Set set = (Set) this.v;
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                g36.b bVar3 = (g36.b) ((j36.e) this.f168599w).d.get();
                bVar3.getClass();
                StringBuilder sb6 = new StringBuilder();
                sb6.append("SELECT * FROM defi_currencies WHERE external_asset_id IN (");
                StringUtil.appendPlaceholders(sb6, set.size());
                sb6.append(")");
                List list2 = (List) DBUtil.performBlocking(bVar3.f140207a, true, false, new g36.a(sb6.toString(), set, i21));
                Intrinsics.checkNotNullParameter(list2, "<this>");
                List<g36.d> list3 = list2;
                int iB = q0.b(zhm.w.t(list3, 10));
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB >= 16 ? iB : 16);
                for (g36.d dVar : list3) {
                    String str3 = dVar.f140210a;
                    int i22 = dVar.f140212c;
                    xi0.e eVar = xi0.e.CRYPTO;
                    String str4 = dVar.e;
                    String str5 = dVar.f140211b;
                    Integer num = dVar.d;
                    String str6 = dVar.f;
                    linkedHashMap.put(str3, new xi0.c(i22, eVar, str4, str5, str4, num, str6, str6));
                }
                if (linkedHashMap.size() == set.size()) {
                }
                break;
            case 18:
                ty0.a model2 = (ty0.a) this.v;
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j43.e eVar2 = (j43.e) ((LinkCardDetailsReviewScreen) this.f168599w).M.getValue();
                Intrinsics.h(model2);
                com.revolut.feature.card_payment_method.impl.flows.link_card.screens.details.a aVar23 = (com.revolut.feature.card_payment_method.impl.flows.link_card.screens.details.a) eVar2;
                aVar23.getClass();
                Intrinsics.checkNotNullParameter(model2, "model");
                String str7 = model2.f275445a;
                if (Intrinsics.f(str7, "EXCHANGE_INFO_ID")) {
                    aVar23.C1(new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.FaqExplicit("question.will-i-be-charged-for-exchanging-foreign-currencies", 14), (SharedFaqDestination.PassthroughData) null, false, 14));
                } else if (Intrinsics.f(str7, "CARD_SUBSCRIPTIONS_ID")) {
                    aVar23.C1(new SubscriptionsFlowDestination(new SubscriptionsFlowDestination.StartType.CardSubscriptionList(((j43.d) ((j2) aVar23.u.f22677a).getValue()).f171281a.f150110a, b9e.d.None)));
                }
                break;
            case 19:
                f0 f0Var = (f0) this.v;
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.card_payment_method.impl.flows.link_card.screens.details.a aVar25 = (com.revolut.feature.card_payment_method.impl.flows.link_card.screens.details.a) this.f168599w;
                aVar25.H2(aVar25.u, new avc.o(f0Var, 4));
                break;
            case 20:
                Object obj3 = this.v;
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j45.f fVarE3 = ((SelectAccountV2Controller) this.f168599w).R2();
                yx4.b.Companion.getClass();
                yx4.b click = yx4.a.a(obj3);
                com.revolut.feature.credit.loan.autopay.impl.ui.select_account.selector_v2.b bVar4 = (com.revolut.feature.credit.loan.autopay.impl.ui.select_account.selector_v2.b) fVarE3;
                bVar4.getClass();
                Intrinsics.checkNotNullParameter(click, "click");
                Object obj4 = click.f317545b;
                if (obj4 instanceof j1j.d) {
                    bVar4.n2(new p(bVar4, (j1j.d) obj4, objArr3 == true ? 1 : 0, i), new whi.b(i3));
                } else if (obj4 instanceof x35.b) {
                    bVar4.H2(bVar4.f70305t, new iyi.i((x35.b) obj4, i));
                } else {
                    String str8 = click.f317544a;
                    if (Intrinsics.f(str8, "ERROR_STATE_ID")) {
                        bVar4.I2();
                    } else if (Intrinsics.f(str8, "UPL_LINK_EXTERNAL_ACCOUNT_LIST_ID")) {
                        bVar4.n2(new j45.k(bVar4, objArr2 == true ? 1 : 0, z ? 1 : 0), new whi.b(i3));
                    }
                }
                break;
            case 21:
                Data data10 = (Data) this.v;
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.credit.loan.autopay.impl.ui.select_account.selector_v2.b bVar5 = (com.revolut.feature.credit.loan.autopay.impl.ui.select_account.selector_v2.b) this.f168599w;
                bVar5.H2(bVar5.f70305t, new j45.m(data10, i21));
                break;
            case 22:
                Pair pair3 = (Pair) this.v;
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Data data11 = (Data) pair3.f186385a;
                Boolean bool3 = (Boolean) pair3.f186386b;
                com.revolut.feature.card_personalisation.generation.impl.ui.generation.a aVar29 = (com.revolut.feature.card_personalisation.generation.impl.ui.generation.a) this.f168599w;
                cli.y yVar3 = aVar29.f65320y;
                j53.l lVar = (j53.l) ((j2) yVar3.f22677a).getValue();
                if (lVar instanceof j53.i) {
                    aVar29.H2(yVar3, new j2c.o((j53.i) lVar, i5, bool3, data11));
                }
                break;
            case 23:
                od0.i iVar3 = (od0.i) this.v;
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j68.i iVar4 = (j68.i) ((EditBirthDateController) this.f168599w).O.getValue();
                iVar4.H2(iVar4.f171695q, new a15.l(12, (LocalDate) iVar3.f224257a));
                break;
            case 24:
                Pair pair4 = (Pair) this.v;
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                JuniorPlanConfiguration juniorPlanConfiguration = (JuniorPlanConfiguration) pair4.f186385a;
                do3.n nVar = (do3.n) pair4.f186386b;
                j68.i iVar5 = (j68.i) this.f168599w;
                iVar5.H2(iVar5.f171695q, new j4h.m(juniorPlanConfiguration, nVar, i));
                break;
            case 25:
                Data data12 = (Data) this.v;
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.payments_migration.impl.ui.screen.move_payment.account_details.a aVar33 = (com.revolut.feature.payments_migration.impl.ui.screen.move_payment.account_details.a) this.f168599w;
                aVar33.H2(aVar33.f80279w, new j45.m(data12, 7));
                break;
            case 26:
                String tabId = (String) this.v;
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j6b.j jVar = (j6b.j) ((CobrandedCardsPlanHubFlow) this.f168599w).P.getValue();
                Intrinsics.h(tabId);
                jVar.getClass();
                Intrinsics.checkNotNullParameter(tabId, "tabId");
                jVar.H2(jVar.f171732r, new ik3.a(tabId, i2));
                break;
            case 27:
                Data data13 = (Data) this.v;
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j6b.j jVar2 = (j6b.j) this.f168599w;
                jVar2.H2(jVar2.f171732r, new j4h.m(jVar2, data13, i6));
                break;
            case 28:
                yx4.b click2 = (yx4.b) this.v;
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.credit.loan.impl.ui.rev10.paymentmanagement.manage.a aVar37 = (com.revolut.feature.credit.loan.impl.ui.rev10.paymentmanagement.manage.a) ((j75.g) ((LoanManageRepaymentsController) this.f168599w).S.getValue());
                aVar37.getClass();
                Intrinsics.checkNotNullParameter(click2, "click");
                String str9 = click2.f317544a;
                if (Intrinsics.f(str9, "ERROR_STATE_ID")) {
                    aVar37.l2(new imk.p0(aVar37, objArr4 == true ? 1 : 0, 18), new yi5.b(26));
                } else if (Intrinsics.f(str9, "ID_CHANGE_REPAYMENT_DAY")) {
                    aVar37.C1(new LoanKompotFeatureConfig.ChangeRepaymentDayFlowNavigationDestination(aVar37.o.f70473a));
                } else {
                    Object obj5 = click2.f317545b;
                    if (obj5 instanceof LoanManageRepaymentsControllerContract$ChangeAccountParcel) {
                        LoanManageRepaymentsControllerContract$ChangeAccountParcel loanManageRepaymentsControllerContract$ChangeAccountParcel = (LoanManageRepaymentsControllerContract$ChangeAccountParcel) obj5;
                        oki.h.v2(aVar37.f70479s, new LoanManageRepaymentsControllerContract$ModalStep.SelectAccount(loanManageRepaymentsControllerContract$ChangeAccountParcel.f70471a, loanManageRepaymentsControllerContract$ChangeAccountParcel.f70472b), ModalDestination.Style.POPUP.f98311a);
                    }
                }
                break;
            default:
                Data data14 = (Data) this.v;
                fim.a aVar38 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.rewards.a aVar39 = (com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.rewards.a) this.f168599w;
                cli.y yVar4 = aVar39.f82598q;
                aVar39.H2(yVar4, new j45.m(data14, i6));
                if (!data14.getLoading() && (cobrandedCardsPlanHubInfoRewards = (CobrandedCardsPlanHubInfoRewards) data14.getContent()) != null && (milestoneRewardCode = ((j7b.i) ((j2) yVar4.f22677a).getValue()).f171895c) != null) {
                    aVar39.H2(yVar4, new j7b.l(i21));
                    ArrayList arrayList = cobrandedCardsPlanHubInfoRewards.f82405a;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it8 = arrayList.iterator();
                    while (it8.hasNext()) {
                        a0.x(((CobrandedCardsPlanHubInfoRewardSection) it8.next()).f82400b, arrayList2);
                    }
                    if (!arrayList2.isEmpty()) {
                        Iterator it9 = arrayList2.iterator();
                        while (true) {
                            if (it9.hasNext()) {
                                if (Intrinsics.f(((CobrandedCardsPlanHubInfoRewardChallenge) it9.next()).f82390h, milestoneRewardCode)) {
                                    Intrinsics.checkNotNullParameter(milestoneRewardCode, "milestoneRewardCode");
                                    oki.h.v2(aVar39.f82599r, new CobrandedCardsPlanHubRewardsScreenContract$ModalStep.RewardSelection(milestoneRewardCode), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                                }
                            }
                        }
                    }
                }
                break;
        }
        return Unit.f186387a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f168599w = obj2;
    }
}
