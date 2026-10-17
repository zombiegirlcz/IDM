package krc;

import a82.r;
import a83.p0;
import androidx.room.util.DBUtil;
import avk.d0;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.breb.impl.ui.qr_request.add_details.BrebQrRequestAddDetailsScreen;
import com.revolut.feature.referrals.code.impl.referral_code.screen.ReferralCodeController;
import com.revolut.feature.salary_switch.impl.ui.mexico.screen.review_account_details.ReviewAccountDetailsController;
import com.revolut.feature.sca_prompt.impl.learn_more.ScaLearnMoreScreen;
import com.revolut.feature.shared.help_centre.api.faq.SharedFaqDestination;
import com.revolut.feature.topup_screen.impl.flows.topup.amount_new.AmountNewScreen;
import com.revolut.feature_crypto_order_flow.impl.order_summary.account_balance_limit.AccountBalanceLimitBottomSheetController;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.feature.trading_hours.impl.ui.market_hours.MarketHoursController;
import gvi.s;
import java.io.File;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import k37.t;
import ka2.b0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kp0.q;
import ks9.f0;
import ks9.s0;
import ku1.y;
import kye.k3;
import l0c.u;
import nii.j1;
import nii.k1;
import nii.l1;
import nii.m1;
import nii.n1;
import vkm.j2;
import yhm.o;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f188851w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
        this.f188851w = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                h hVar = new h((ReviewAccountDetailsController) this.f188851w, continuation, 0);
                hVar.v = obj2;
                return hVar;
            case 1:
                return new h((com.revolut.feature.salary_switch.impl.ui.mexico.screen.review_account_details.b) this.v, (String) this.f188851w, continuation, 1);
            case 2:
                h hVar2 = new h((com.revolut.biometric_verification.impl.ui.step.active_liveness.flow.c) this.f188851w, continuation, 2);
                hVar2.v = obj2;
                return hVar2;
            case 3:
                h hVar3 = new h((f0) this.f188851w, continuation, 3);
                hVar3.v = obj2;
                return hVar3;
            case 4:
                return new h((s0) this.v, (iu9.c) this.f188851w, continuation, 4);
            case 5:
                h hVar4 = new h((ScaLearnMoreScreen) this.f188851w, continuation, 5);
                hVar4.v = obj2;
                return hVar4;
            case 6:
                h hVar5 = new h((ksk.g) this.f188851w, continuation, 6);
                hVar5.v = obj2;
                return hVar5;
            case 7:
                h hVar6 = new h((ktk.f) this.f188851w, continuation, 7);
                hVar6.v = obj2;
                return hVar6;
            case 8:
                h hVar7 = new h((kuc.l) this.f188851w, continuation, 8);
                hVar7.v = obj2;
                return hVar7;
            case 9:
                h hVar8 = new h((com.revolut.feature.wealth.account_closure.impl.ui.screens.consent_prompt_precondition.b) this.f188851w, continuation, 9);
                hVar8.v = obj2;
                return hVar8;
            case 10:
                h hVar9 = new h((kui.h) this.f188851w, continuation, 10);
                hVar9.v = obj2;
                return hVar9;
            case 11:
                h hVar10 = new h((kv7.i) this.f188851w, continuation, 11);
                hVar10.v = obj2;
                return hVar10;
            case 12:
                h hVar11 = new h((kvg.i) this.f188851w, continuation, 12);
                hVar11.v = obj2;
                return hVar11;
            case 13:
                h hVar12 = new h((BrebQrRequestAddDetailsScreen) this.f188851w, continuation, 13);
                hVar12.v = obj2;
                return hVar12;
            case 14:
                h hVar13 = new h((ReferralCodeController) this.f188851w, continuation, 14);
                hVar13.v = obj2;
                return hVar13;
            case 15:
                return new h((kwa.i) this.v, (String) this.f188851w, continuation, 15);
            case 16:
                h hVar14 = new h((kx4.a) this.f188851w, continuation, 16);
                hVar14.v = obj2;
                return hVar14;
            case 17:
                h hVar15 = new h((MarketHoursController) this.f188851w, continuation, 17);
                hVar15.v = obj2;
                return hVar15;
            case 18:
                h hVar16 = new h((kxk.n) this.f188851w, continuation, 18);
                hVar16.v = obj2;
                return hVar16;
            case 19:
                h hVar17 = new h((AmountNewScreen) this.f188851w, continuation, 19);
                hVar17.v = obj2;
                return hVar17;
            case 20:
                h hVar18 = new h((k3) this.f188851w, continuation, 20);
                hVar18.v = obj2;
                return hVar18;
            case 21:
                return new h((kyl.i) this.v, (String) this.f188851w, continuation, 21);
            case 22:
                h hVar19 = new h((kzb.h) this.f188851w, continuation, 22);
                hVar19.v = obj2;
                return hVar19;
            case 23:
                h hVar20 = new h((AccountBalanceLimitBottomSheetController) this.f188851w, continuation, 23);
                hVar20.v = obj2;
                return hVar20;
            case 24:
                h hVar21 = new h((kzj.g) this.f188851w, continuation, 24);
                hVar21.v = obj2;
                return hVar21;
            case 25:
                h hVar22 = new h((l05.g) this.f188851w, continuation, 25);
                hVar22.v = obj2;
                return hVar22;
            case 26:
                h hVar23 = new h((u) this.f188851w, continuation, 26);
                hVar23.v = obj2;
                return hVar23;
            case 27:
                return new h((l0g.e) this.v, (String) this.f188851w, continuation, 27);
            case 28:
                h hVar24 = new h((l13.l) this.f188851w, continuation, 28);
                hVar24.v = obj2;
                return hVar24;
            default:
                h hVar25 = new h((l16.e) this.f188851w, continuation, 29);
                hVar25.v = obj2;
                return hVar25;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((h) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((h) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((h) create((ks.f) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((h) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((h) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((h) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((h) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((h) create((jtk.i) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((h) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((h) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((h) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((h) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((h) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((h) create((CharSequence) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((h) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((h) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((h) create((Set) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((h) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((h) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((h) create((bw0.m) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((h) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((h) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((h) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((h) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((h) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((h) create((LocalDate) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((h) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((h) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((h) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((h) create((l16.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v17, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v33, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v37, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v59, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 2;
        int i3 = 19;
        int i5 = 26;
        int i6 = 11;
        boolean z = false;
        z = false;
        int i21 = 1;
        Object obj3 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object obj4 = this.f188851w;
        switch (i) {
            case 0:
                ty0.a aVar = (ty0.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                b bVar = (b) ((ReviewAccountDetailsController) obj4).N.getValue();
                String id10 = aVar.f275445a;
                com.revolut.feature.salary_switch.impl.ui.mexico.screen.review_account_details.b bVar2 = (com.revolut.feature.salary_switch.impl.ui.mexico.screen.review_account_details.b) bVar;
                bVar2.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                if (Intrinsics.f(id10, "TERMS_LINK_CLICK_ID")) {
                    bVar2.n2(new k(bVar2, objArr == true ? 1 : 0, z ? 1 : 0), new i(bVar2, i21));
                } else {
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(j6.a.q("Unknown click ", id10));
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.salary_switch.impl.ui.mexico.screen.review_account_details.b) this.v).C2(new c((String) obj4));
                return Unit.f186387a;
            case 2:
                ks.f fVar = (ks.f) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.biometric_verification.impl.ui.step.active_liveness.flow.c) obj4).M2(fVar.f189050a, fVar.f189051b);
                return Unit.f186387a;
            case 3:
                n1 n1Var = (n1) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                if (!(n1Var instanceof j1) && !(n1Var instanceof k1) && !(n1Var instanceof l1)) {
                    if (!(n1Var instanceof m1)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ((f0) obj4).f189330r.k(Unit.f186387a);
                }
                return Unit.f186387a;
            case 4:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                s0 s0Var = (s0) this.v;
                s0Var.f189382l.x(((zu9.b) s0Var.f189383m).a((iu9.c) obj4));
                return Unit.f186387a;
            case 5:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ksc.e eVar = (ksc.e) ((ScaLearnMoreScreen) obj4).O.getValue();
                Intrinsics.h(clickData);
                ksc.h hVar = (ksc.h) eVar;
                hVar.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                if (Intrinsics.f(clickData.f275445a, "LEARN_MORE_LIST_ID")) {
                    hVar.C1(u0.c(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.FaqExplicit("question.who-provides-revolut-s-crypto-services", 14), (SharedFaqDestination.PassthroughData) null, false, 14), false, (Integer) null, 0, 61)));
                }
                return Unit.f186387a;
            case 6:
                Data data = (Data) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ksk.g gVar = (ksk.g) obj4;
                gVar.X2(gVar.f189480q, new b0(data, 29));
                return Unit.f186387a;
            case 7:
                jtk.i iVar = (jtk.i) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ktk.f fVar2 = (ktk.f) obj4;
                fVar2.X2(fVar2.o, new d0(iVar, i2));
                return Unit.f186387a;
            case 8:
                Data data2 = (Data) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                kuc.l lVar = (kuc.l) obj4;
                lVar.X2(lVar.o, new q(lVar, data2, i6));
                return Unit.f186387a;
            case 9:
                Data data3 = (Data) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.wealth.account_closure.impl.ui.screens.consent_prompt_precondition.b bVar3 = (com.revolut.feature.wealth.account_closure.impl.ui.screens.consent_prompt_precondition.b) obj4;
                bVar3.H2(bVar3.f94942t, new y(data3, i2));
                return Unit.f186387a;
            case 10:
                Pair pair = (Pair) this.v;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                kui.h hVar2 = (kui.h) obj4;
                hVar2.H2(hVar2.f189828s, new p0((Data) pair.f186385a, (Data) pair.f186386b, i5));
                return Unit.f186387a;
            case 11:
                Data data4 = (Data) this.v;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                kv7.i iVar2 = (kv7.i) obj4;
                iVar2.H2(iVar2.f189994r, new y(data4, 3));
                return Unit.f186387a;
            case 12:
                Data data5 = (Data) this.v;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                kvg.i iVar3 = (kvg.i) obj4;
                iVar3.H2(iVar3.f190120p, new y(data5, 4));
                return Unit.f186387a;
            case 13:
                CharSequence charSequence = (CharSequence) this.v;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                kw1.i iVar4 = (kw1.i) ((BrebQrRequestAddDetailsScreen) obj4).M.getValue();
                String newAmount = charSequence.toString();
                iVar4.getClass();
                Intrinsics.checkNotNullParameter(newAmount, "newAmount");
                w80.b bVar4 = iVar4.o;
                xi0.b.Companion.getClass();
                iVar4.H2(iVar4.f190206p, new r(bVar4.b(newAmount, xi0.b.F.f306286a), 22));
                return Unit.f186387a;
            case 14:
                String referralCode = (String) this.v;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                kwa.i iVar5 = (kwa.i) ((ReferralCodeController) obj4).R.getValue();
                Intrinsics.h(referralCode);
                iVar5.getClass();
                Intrinsics.checkNotNullParameter(referralCode, "referralCode");
                iVar5.H2(iVar5.f190321q, new k7c.n(referralCode, 20));
                if (referralCode.length() == 6) {
                    iVar5.l2(new kwa.g(iVar5, referralCode, null), new yi5.b(i5));
                }
                return Unit.f186387a;
            case 15:
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                kwa.i iVar6 = (kwa.i) this.v;
                iVar6.C2(new kwa.b((String) obj4, ((kwa.a) ((j2) iVar6.f190321q.f22677a).getValue()).f190313a));
                return Unit.f186387a;
            case 16:
                Set set = (Set) this.v;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((kx4.a) obj4).d3(new imk.e(7, set));
                return Unit.f186387a;
            case 17:
                String tabId = (String) this.v;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                kxk.i iVarE3 = ((MarketHoursController) obj4).R2();
                Intrinsics.h(tabId);
                kxk.n nVar = (kxk.n) iVarE3;
                nVar.getClass();
                Intrinsics.checkNotNullParameter(tabId, "tabId");
                Iterator<E> it8 = kxk.j.a().iterator();
                while (true) {
                    if (it8.hasNext()) {
                        Object next = it8.next();
                        if (Intrinsics.f(((kxk.j) next).c(), tabId)) {
                            obj3 = next;
                        }
                    }
                }
                kxk.j jVar = (kxk.j) obj3;
                if (jVar != null) {
                    nVar.H2(nVar.f190609q, new kxk.l(jVar, 1));
                }
                return Unit.f186387a;
            case 18:
                Data data6 = (Data) this.v;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                kxk.n nVar2 = (kxk.n) obj4;
                nVar2.H2(nVar2.f190609q, new y(data6, 8));
                return Unit.f186387a;
            case 19:
                bw0.m mVar = (bw0.m) this.v;
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                k3 k3Var = (k3) ((AmountNewScreen) obj4).R2();
                k3Var.getClass();
                k3Var.l2(new kq5.d(k3Var, mVar, objArr2 == true ? 1 : 0, i3), new yi5.b(i5));
                return Unit.f186387a;
            case 20:
                String str = (String) this.v;
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((k3) obj4).S2(str);
                return Unit.f186387a;
            case 21:
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                File file = new File(((kyl.i) this.v).f191024a, (String) obj4);
                if (file.exists() && file.delete()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 22:
                Data data7 = (Data) this.v;
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                kzb.h hVar3 = (kzb.h) obj4;
                hVar3.H2(hVar3.f191092s, new y(data7, 9));
                return Unit.f186387a;
            case 23:
                ty0.a data8 = (ty0.a) this.v;
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                kzh.f fVar3 = (kzh.f) ((kzh.a) ((AccountBalanceLimitBottomSheetController) obj4).S.getValue());
                fVar3.getClass();
                Intrinsics.checkNotNullParameter(data8, "data");
                if (Intrinsics.f(data8.f275445a, "ACCOUNT_BALANCE_LIMIT_SHEET_LEARN_MORE")) {
                    fVar3.C1(new ExternalDestination.Browser("https://www.revolut.com/legal/key-facts-statement-ae-en/", null));
                }
                return Unit.f186387a;
            case 24:
                List list = (List) this.v;
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                kzj.g gVar2 = (kzj.g) obj4;
                gVar2.H2(gVar2.f191124p, new t(list, i3));
                return Unit.f186387a;
            case 25:
                LocalDate localDate = (LocalDate) this.v;
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                m05.m mVar2 = (m05.m) j6.a.k(m05.m.class, ((l05.g) obj4).f191183c, l05.g.a(localDate));
                if (mVar2 != null) {
                    return n05.a.b(mVar2);
                }
                return null;
            case 26:
                Data data9 = (Data) this.v;
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                u uVar = (u) obj4;
                uVar.H2(uVar.f191230t, new y(data9, 10));
                return Unit.f186387a;
            case 27:
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                String str2 = (String) obj4;
                z9h.n.l(String.class, ((l0g.e) this.v).f191248a, "SEARCH_SESSION_ID", str2);
                return str2;
            case 28:
                Data data10 = (Data) this.v;
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                l13.l lVar2 = (l13.l) obj4;
                lVar2.H2(lVar2.f191443w, new y(data10, i6));
                return Unit.f186387a;
            default:
                l16.c cVar = (l16.c) this.v;
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                h16.a aVar32 = ((l16.e) obj4).f191478c;
                i16.b bVar5 = (i16.b) DBUtil.performBlocking(aVar32.f148467a, true, false, new s(aVar32, cVar.f191474a, i6));
                if (bVar5 != null) {
                    return ksj.b.B(bVar5);
                }
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f188851w = obj2;
    }
}
