package uf0;

import android.view.View;
import aw0.n6;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.data.model.Data;
import com.revolut.feature.bank_account_switching.impl.ui.switch_out.review.BankAccountSwitchingReviewOutScreen;
import com.revolut.feature.credit.autopay.ui.screen.select_autopay_method_v3.SelectAutopayMethodV3Screen;
import com.revolut.feature.insurance.api.models.details.CFACCancellationReason;
import com.revolut.feature.insurance.impl.ui.cfac.claim.exact_reason.CFACInsuranceExactReasonScreen;
import com.revolut.feature.junior_remote_login.impl.ui.screen.add_phone_number.junior_add_phone_number.JuniorAddPhoneNumberScreen;
import com.revolut.feature.shops.impl.ui.bid_custom_input.BidCustomInputScreen;
import com.revolut.otp.input.flow.push.OtpPushScreen;
import com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanAction;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_offer_prompt.PlanOfferPromptScreen;
import com.revolut.retail.feature.stockdetails.api.navigation.AssetDetailsDestination;
import gim.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import kotlin.text.Regex;
import kotlin.text.y;
import kotlinx.coroutines.CoroutineScope;
import nii.l1;
import nii.n1;
import qi7.h;
import s78.n;
import ud3.a0;
import uf7.f0;
import uh7.l;
import uj7.j;
import uk4.e;
import uk9.k;
import ulk.o;
import umd.m;
import uod.g;
import vkm.j2;
import we6.j0;
import zh9.u0;
import zhm.w;

/* JADX INFO: loaded from: classes19.dex */
public final class d extends i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f279496w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
        this.f279496w = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d((Set) this.f279496w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            case 1:
                d dVar2 = new d((f0) this.f279496w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
            case 2:
                return new d((l) this.v, (h) this.f279496w, continuation, 2);
            case 3:
                d dVar3 = new d((com.revolut.feature.retail.salary_account.impl.switch_assistant.flow.b) this.f279496w, continuation, 3);
                dVar3.v = obj2;
                return dVar3;
            case 4:
                d dVar4 = new d((com.revolut.retail.feature.esim.impl.ui.screens.gift_recipient_selection.a) this.f279496w, continuation, 4);
                dVar4.v = obj2;
                return dVar4;
            case 5:
                d dVar5 = new d((BidCustomInputScreen) this.f279496w, continuation, 5);
                dVar5.v = obj2;
                return dVar5;
            case 6:
                return new d((View) this.v, (BidCustomInputScreen) this.f279496w, continuation, 6);
            case 7:
                d dVar6 = new d((CFACInsuranceExactReasonScreen) this.f279496w, continuation, 7);
                dVar6.v = obj2;
                return dVar6;
            case 8:
                d dVar7 = new d((j) this.f279496w, continuation, 8);
                dVar7.v = obj2;
                return dVar7;
            case 9:
                d dVar8 = new d((uj8.i) this.f279496w, continuation, 9);
                dVar8.v = obj2;
                return dVar8;
            case 10:
                d dVar9 = new d((SelectAutopayMethodV3Screen) this.f279496w, continuation, 10);
                dVar9.v = obj2;
                return dVar9;
            case 11:
                d dVar10 = new d((uk5.d) this.f279496w, continuation, 11);
                dVar10.v = obj2;
                return dVar10;
            case 12:
                d dVar11 = new d((k) this.f279496w, continuation, 12);
                dVar11.v = obj2;
                return dVar11;
            case 13:
                d dVar12 = new d((JuniorAddPhoneNumberScreen) this.f279496w, continuation, 13);
                dVar12.v = obj2;
                return dVar12;
            case 14:
                d dVar13 = new d((o) this.f279496w, continuation, 14);
                dVar13.v = obj2;
                return dVar13;
            case 15:
                return new d((com.revolut.feature.external_accounts.impl.ui.japan.authorization.flow.b) this.v, (wte.a) this.f279496w, continuation, 15);
            case 16:
                d dVar14 = new d((com.revolut.feature.payees.impl.ui.payees_overview.junior.a) this.f279496w, continuation, 16);
                dVar14.v = obj2;
                return dVar14;
            case 17:
                d dVar15 = new d((m) this.f279496w, continuation, 17);
                dVar15.v = obj2;
                return dVar15;
            case 18:
                d dVar16 = new d((PlanOfferPromptScreen) this.f279496w, continuation, 18);
                dVar16.v = obj2;
                return dVar16;
            case 19:
                d dVar17 = new d((com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_offer_prompt.a) this.f279496w, continuation, 19);
                dVar17.v = obj2;
                return dVar17;
            case 20:
                d dVar18 = new d((un8.b) this.f279496w, continuation, 20);
                dVar18.v = obj2;
                return dVar18;
            case 21:
                d dVar19 = new d((un8.h) this.f279496w, continuation, 21);
                dVar19.v = obj2;
                return dVar19;
            case 22:
                d dVar20 = new d((un8.k) this.f279496w, continuation, 22);
                dVar20.v = obj2;
                return dVar20;
            case 23:
                d dVar21 = new d((com.revolut.feature.profile.impl.ui.profile.screens.auto_earn_rewards.a) this.f279496w, continuation, 23);
                dVar21.v = obj2;
                return dVar21;
            case 24:
                d dVar22 = new d((OtpPushScreen) this.f279496w, continuation, 24);
                dVar22.v = obj2;
                return dVar22;
            case 25:
                d dVar23 = new d((uni.i) this.f279496w, continuation, 25);
                dVar23.v = obj2;
                return dVar23;
            case 26:
                d dVar24 = new d((uo7.m) this.f279496w, continuation, 26);
                dVar24.v = obj2;
                return dVar24;
            case 27:
                d dVar25 = new d((uob.k) this.f279496w, continuation, 27);
                dVar25.v = obj2;
                return dVar25;
            case 28:
                d dVar26 = new d((g) this.f279496w, continuation, 28);
                dVar26.v = obj2;
                return dVar26;
            default:
                d dVar27 = new d((BankAccountSwitchingReviewOutScreen) this.f279496w, continuation, 29);
                dVar27.v = obj2;
                return dVar27;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((d) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((d) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((d) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((d) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((d) create((CFACCancellationReason) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((d) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((d) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((d) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((d) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((d) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((d) create((CharSequence) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((d) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((d) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((d) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((d) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((d) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((d) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((d) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((d) create((xni.e) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((d) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((d) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((d) create((Image) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v28, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v65, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v2, types: [com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanAction] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 26;
        String str = "";
        int i3 = 15;
        int i5 = 1;
        ArrayList arrayList = null;
        Object obj3 = this.f279496w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Throwable error = data.getError();
                if (error != null) {
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, error, (Set) obj3);
                }
                return Unit.f186387a;
            case 1:
                Data data2 = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                f0 f0Var = (f0) obj3;
                f0Var.H2(f0Var.f279605w, new a0(data2, 12));
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((l) this.v).f280120a.b(u0.f(new AssetDetailsDestination(((h) obj3).f246671a.a(), null, false, null, null, null, 62)));
                return Unit.f186387a;
            case 3:
                com.revolut.feature.retail.salary_account.impl.switch_assistant.flow.b bVar = (com.revolut.feature.retail.salary_account.impl.switch_assistant.flow.b) obj3;
                n1 n1Var = (n1) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (n1Var instanceof l1) {
                    bVar.l2(new uhb.g(bVar, , 0), new yi5.b(i2));
                } else {
                    oki.h.D2(bVar.f83056x);
                }
                return Unit.f186387a;
            case 4:
                Data data3 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.esim.impl.ui.screens.gift_recipient_selection.a aVar6 = (com.revolut.retail.feature.esim.impl.ui.screens.gift_recipient_selection.a) obj3;
                aVar6.H2(aVar6.f100973s, new a0(data3, 13));
                return Unit.f186387a;
            case 5:
                String rawInput = (String) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                uid.d dVarM3 = ((BidCustomInputScreen) obj3).d();
                dVarM3.getClass();
                Intrinsics.checkNotNullParameter(rawInput, "rawInput");
                dVarM3.H2(dVarM3.o, new tr1.a(i5, y.k(new Regex("[^0-9]").replace(rawInput, ""))));
                return Unit.f186387a;
            case 6:
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                kli.c.c((View) this.v, true);
                uid.d dVarM32 = ((BidCustomInputScreen) obj3).d();
                cli.y yVar = dVarM32.o;
                Double d = ((uid.a) ((j2) yVar.f22677a).getValue()).f280378a;
                if (d != null) {
                    double dDoubleValue = d.doubleValue();
                    if (dDoubleValue > ((uid.a) ((j2) yVar.f22677a).getValue()).d) {
                        dVarM32.C2(new uid.b(dDoubleValue));
                    }
                }
                return Unit.f186387a;
            case 7:
                CFACCancellationReason reason = (CFACCancellationReason) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j jVar = (j) ((CFACInsuranceExactReasonScreen) obj3).Y.getValue();
                Intrinsics.h(reason);
                jVar.getClass();
                Intrinsics.checkNotNullParameter(reason, "reason");
                jVar.v2(new uj7.f(reason));
                return Unit.f186387a;
            case 8:
                Data data4 = (Data) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((j) obj3).x2(new a0(data4, 14));
                return Unit.f186387a;
            case 9:
                Data data5 = (Data) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                uj8.i iVar = (uj8.i) obj3;
                iVar.H2(iVar.f280538q, new a0(data5, i3));
                return Unit.f186387a;
            case 10:
                Object obj4 = this.v;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                uk4.f fVar = (uk4.f) ((SelectAutopayMethodV3Screen) obj3).Q.getValue();
                yx4.a aVar13 = yx4.b.Companion;
                Intrinsics.h(obj4);
                aVar13.getClass();
                yx4.b event = yx4.a.a(obj4);
                uk4.i iVar2 = (uk4.i) fVar;
                iVar2.getClass();
                Intrinsics.checkNotNullParameter(event, "event");
                String str2 = event.f317544a;
                int iHashCode = str2.hashCode();
                if (iHashCode != -942096001) {
                    if (iHashCode != -584133624) {
                        if (iHashCode == 845621086 && str2.equals("id_select_autopay_external_account")) {
                            iVar2.C2(e.b.f280678a);
                        }
                    } else if (str2.equals("id_select_autopay_revolut_account")) {
                        iVar2.C2(e.c.f280679a);
                    }
                } else if (str2.equals("id_select_autopay_navigation_icon")) {
                    iVar2.C2(e.a.f280677a);
                }
                return Unit.f186387a;
            case 11:
                List list = (List) this.v;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                uk5.d dVar = (uk5.d) obj3;
                dVar.H2(dVar.f280690p, new n(list, 25));
                return Unit.f186387a;
            case 12:
                Data data6 = (Data) this.v;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((k) obj3).x2(new a0(data6, 17));
                return Unit.f186387a;
            case 13:
                CharSequence charSequence = (CharSequence) this.v;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ul8.g gVarE3 = ((JuniorAddPhoneNumberScreen) obj3).e3();
                String number = charSequence.toString();
                com.revolut.feature.junior_remote_login.impl.ui.screen.add_phone_number.junior_add_phone_number.a aVar17 = (com.revolut.feature.junior_remote_login.impl.ui.screen.add_phone_number.junior_add_phone_number.a) gVarE3;
                aVar17.getClass();
                Intrinsics.checkNotNullParameter(number, "number");
                aVar17.H2(aVar17.f77209r, new uif.d(number, aVar17, i5));
                return Unit.f186387a;
            case 14:
                Data data7 = (Data) this.v;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Object content = data7.getContent();
                if (content != null) {
                    ((o) obj3).invoke(content);
                }
                return Unit.f186387a;
            case 15:
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((com.revolut.feature.external_accounts.impl.ui.japan.authorization.flow.b) this.v).C2(new j0(((wte.a) obj3).f299931a));
                return Unit.f186387a;
            case 16:
                Data data8 = (Data) this.v;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.payees.impl.ui.payees_overview.junior.a aVar21 = (com.revolut.feature.payees.impl.ui.payees_overview.junior.a) obj3;
                aVar21.H2(aVar21.f79016s, new a0(data8, i2));
                return Unit.f186387a;
            case 17:
                Data data9 = (Data) this.v;
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                m mVar = (m) obj3;
                mVar.H2(mVar.f281300r, new a0(data9, 27));
                return Unit.f186387a;
            case 18:
                ty0.a data10 = (ty0.a) this.v;
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                umk.j jVarE3 = ((PlanOfferPromptScreen) obj3).R2();
                Intrinsics.h(data10);
                com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_offer_prompt.a aVar24 = (com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_offer_prompt.a) jVarE3;
                aVar24.getClass();
                Intrinsics.checkNotNullParameter(data10, "data");
                Object obj5 = data10.d;
                 = obj5 instanceof PricingPlanAction ? (PricingPlanAction) obj5 : 0;
                if ( != 0) {
                    aVar24.C2(new umk.g());
                }
                return Unit.f186387a;
            case 19:
                Data data11 = (Data) this.v;
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_offer_prompt.a aVar26 = (com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_offer_prompt.a) obj3;
                aVar26.H2(aVar26.f103599r, new a0(data11, 28));
                return Unit.f186387a;
            case 20:
                String str3 = (String) this.v;
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                List list2 = (List) p.a.j(rn8.c.class, KTypeProjection.INSTANCE, List.class, ((un8.b) obj3).f281357c, un8.b.a(str3));
                if (list2 != null) {
                    List list3 = list2;
                    arrayList = new ArrayList(w.t(list3, 10));
                    Iterator it8 = list3.iterator();
                    while (it8.hasNext()) {
                        arrayList.add(ifk.b.x((rn8.c) it8.next()));
                    }
                }
                return arrayList;
            case 21:
                String str4 = (String) this.v;
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                sn8.a aVar29 = (sn8.a) ((un8.h) obj3).f281368c.T2(un8.h.a(str4), un8.h.k);
                if (aVar29 == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(aVar29, "<this>");
                return new in8.c(aVar29.getVisibleInContacts(), aVar29.getDiscoverableByUsername(), aVar29.getProfileReveal());
            case 22:
                String str5 = (String) this.v;
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                rn8.i iVar3 = (rn8.i) j6.a.k(rn8.i.class, ((un8.k) obj3).f281375c, j6.a.q("JUNIOR_SIGN_IN_CONFIG_KEY", str5));
                if (iVar3 != null) {
                    return jb3.l.C(iVar3);
                }
                return null;
            case 23:
                Data data12 = (Data) this.v;
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.profile.impl.ui.profile.screens.auto_earn_rewards.a aVar32 = (com.revolut.feature.profile.impl.ui.profile.screens.auto_earn_rewards.a) obj3;
                aVar32.H2(aVar32.f81445r, new a0(data12, 29));
                return Unit.f186387a;
            case 24:
                String code = (String) this.v;
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                uni.i iVar4 = (uni.i) ((OtpPushScreen) obj3).Q.getValue();
                Intrinsics.h(code);
                iVar4.getClass();
                Intrinsics.checkNotNullParameter(code, "code");
                cli.y yVar2 = iVar4.f281444q;
                iVar4.H2(yVar2, new a31.i(code, gj7.b.c((xni.a) ((j2) yVar2.f22677a).getValue(), iVar4.o, code), i3));
                return Unit.f186387a;
            case 25:
                uni.i iVar5 = (uni.i) obj3;
                cli.y yVar3 = iVar5.f281444q;
                xni.e eVar = (xni.e) this.v;
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (eVar instanceof xni.b) {
                    iVar5.H2(yVar3, new a31.i(str, ((uni.d) ((j2) yVar3.f22677a).getValue()).f281437b, i3));
                } else if (eVar instanceof xni.c) {
                    iVar5.C2(uni.f.f281440a);
                } else {
                    if (!(eVar instanceof xni.d)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iVar5.H2(yVar3, new a31.i(iVar5.o.f98525a, ((uni.d) ((j2) yVar3.f22677a).getValue()).f281437b, i3));
                }
                return Unit.f186387a;
            case 26:
                n1 n1Var2 = (n1) this.v;
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (n1Var2 instanceof l1) {
                    uo7.m mVar2 = (uo7.m) obj3;
                    mVar2.v2(new uo7.g(((uo7.e) mVar2.t2()).f281572a));
                }
                return Unit.f186387a;
            case 27:
                Data data13 = (Data) this.v;
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                uob.k kVar = (uob.k) obj3;
                kVar.H2(kVar.f281601s, new unc.y(data13, 3));
                return Unit.f186387a;
            case 28:
                Image image = (Image) this.v;
                fim.a aVar37 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                g gVar = (g) obj3;
                gVar.H2(gVar.f281636s, new be3.l(6, image));
                return Unit.f186387a;
            default:
                ty0.a aVar38 = (ty0.a) this.v;
                fim.a aVar39 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                up2.i iVarE3 = ((BankAccountSwitchingReviewOutScreen) obj3).e3();
                String clauseId = aVar38.f275445a;
                Object obj6 = aVar38.d;
                com.revolut.feature.bank_account_switching.impl.ui.switch_out.review.a aVar40 = (com.revolut.feature.bank_account_switching.impl.ui.switch_out.review.a) iVarE3;
                aVar40.getClass();
                Intrinsics.checkNotNullParameter(clauseId, "clauseId");
                if (Intrinsics.f(clauseId, "ID_DIRECT_DEBITS_LIST_ACTION")) {
                    aVar40.J2();
                } else {
                    wn2.b bVar2 = obj6 instanceof wn2.b ? (wn2.b) obj6 : null;
                    if ((bVar2 == null ? -1 : up2.m.f281827a[bVar2.ordinal()]) == 1) {
                        aVar40.J2();
                    }
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f279496w = obj2;
    }
}
