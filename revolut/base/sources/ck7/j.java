package ck7;

import android.os.Parcelable;
import auc.a1;
import auc.s;
import ba4.x;
import cli.v;
import cmh.n;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.wh;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.data.model.Data;
import com.revolut.domain.models.topup.methods.TopupMethodType;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.apm.core.impl.crypto.ApmKeyGenerator;
import com.revolut.feature.credit.api.navigation.LoanHomeFeatureConfig;
import com.revolut.feature.freelancer.impl.ui.acquiring_payment.filters.screen.FreelancerAcquiringPaymentFiltersScreen;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.edit_application.EditApplicationScreen;
import com.revolut.feature.tab.crypto.impl.ui.v2.accounts.picker.CryptoAccountPickerScreen;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import com.revolut.oauth.impl.ui.consent.screen.ConsentScreen;
import com.revolut.retail.core.navigation.CompositeCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_page.info_bottom_sheet.PricingPlanInfoBottomSheetScreen;
import com.revolut.sso.impl.ui.signin_sessions_flow.bottom_dialog.SignInSessionsBottomSheet;
import cp7.p;
import cq8.m;
import csj.u;
import ctk.r;
import cuc.f0;
import cuc.z;
import cuj.y;
import cul.n2;
import cul.w0;
import dce.l0;
import ive.a;
import java.security.KeyStore;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlinx.coroutines.CoroutineScope;
import nii.h0;
import nii.j0;
import nii.u1;
import nii.w1;
import nii.y0;
import skm.a2;
import skm.p0;
import vkm.q;
import x8h.t0;
import yhm.o;
import zh9.u0;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f24793w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
        this.f24793w = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                j jVar = new j((k) this.f24793w, continuation, 0);
                jVar.v = obj2;
                return jVar;
            case 1:
                j jVar2 = new j((CryptoAccountPickerScreen) this.f24793w, continuation, 1);
                jVar2.v = obj2;
                return jVar2;
            case 2:
                j jVar3 = new j((cli.g) this.f24793w, continuation, 2);
                jVar3.v = obj2;
                return jVar3;
            case 3:
                j jVar4 = new j((v) this.f24793w, continuation, 3);
                jVar4.v = obj2;
                return jVar4;
            case 4:
                j jVar5 = new j((n) this.f24793w, continuation, 4);
                jVar5.v = obj2;
                return jVar5;
            case 5:
                j jVar6 = new j((cnh.d) this.f24793w, continuation, 5);
                jVar6.v = obj2;
                return jVar6;
            case 6:
                j jVar7 = new j((ConsentScreen) this.f24793w, continuation, 6);
                jVar7.v = obj2;
                return jVar7;
            case 7:
                j jVar8 = new j((PricingPlanInfoBottomSheetScreen) this.f24793w, continuation, 7);
                jVar8.v = obj2;
                return jVar8;
            case 8:
                return new j((ApmKeyGenerator) this.v, (String) this.f24793w, continuation, 8);
            case 9:
                j jVar9 = new j((EditApplicationScreen) this.f24793w, continuation, 9);
                jVar9.v = obj2;
                return jVar9;
            case 10:
                j jVar10 = new j((p) this.f24793w, continuation, 10);
                jVar10.v = obj2;
                return jVar10;
            case 11:
                j jVar11 = new j((cpb.k) this.f24793w, continuation, 11);
                jVar11.v = obj2;
                return jVar11;
            case 12:
                return new j((cq6.c) this.v, (xi0.b) this.f24793w, continuation, 12);
            case 13:
                j jVar12 = new j((m) this.f24793w, continuation, 13);
                jVar12.v = obj2;
                return jVar12;
            case 14:
                return new j((cqf.h) this.v, (String) this.f24793w, continuation, 14);
            case 15:
                j jVar13 = new j((SignInSessionsBottomSheet) this.f24793w, continuation, 15);
                jVar13.v = obj2;
                return jVar13;
            case 16:
                j jVar14 = new j((com.revolut.feature.spending_analytics.impl.ui.rev10.settings.a) this.f24793w, continuation, 16);
                jVar14.v = obj2;
                return jVar14;
            case 17:
                j jVar15 = new j((crf.k) this.f24793w, continuation, 17);
                jVar15.v = obj2;
                return jVar15;
            case 18:
                j jVar16 = new j((u) this.f24793w, continuation, 18);
                jVar16.v = obj2;
                return jVar16;
            case 19:
                return new j((jf0.c) this.v, (ct7.b) this.f24793w, continuation, 19);
            case 20:
                j jVar17 = new j((cta.c) this.f24793w, continuation, 20);
                jVar17.v = obj2;
                return jVar17;
            case 21:
                j jVar18 = new j((r) this.f24793w, continuation, 21);
                jVar18.v = obj2;
                return jVar18;
            case 22:
                j jVar19 = new j((cuc.r) this.f24793w, continuation, 22);
                jVar19.v = obj2;
                return jVar19;
            case 23:
                j jVar20 = new j((z) this.f24793w, continuation, 23);
                jVar20.v = obj2;
                return jVar20;
            case 24:
                j jVar21 = new j((cuh.b) this.f24793w, continuation, 24);
                jVar21.v = obj2;
                return jVar21;
            case 25:
                j jVar22 = new j((com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.checkout.b) this.f24793w, continuation, 25);
                jVar22.v = obj2;
                return jVar22;
            case 26:
                j jVar23 = new j((y) this.f24793w, continuation, 26);
                jVar23.v = obj2;
                return jVar23;
            case 27:
                j jVar24 = new j((FreelancerAcquiringPaymentFiltersScreen) this.f24793w, continuation, 27);
                jVar24.v = obj2;
                return jVar24;
            case 28:
                j jVar25 = new j((com.revolut.feature.freelancer.impl.ui.acquiring_payment.filters.screen.a) this.f24793w, continuation, 28);
                jVar25.v = obj2;
                return jVar25;
            default:
                j jVar26 = new j((cve.c) this.f24793w, continuation, 29);
                jVar26.v = obj2;
                return jVar26;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((j) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((j) create((cke.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((j) create((cli.j) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((j) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((j) create((xi0.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((j) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((j) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((j) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((j) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((j) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((j) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((j) create((yhm.r) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((j) create((lw0.l) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((j) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((j) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((j) create((csj.i) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                return Boolean.TRUE;
            case 20:
                return ((j) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((j) create((ctk.l) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((j) create((cuc.m) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((j) create((qtc.k) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((j) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((j) create((vf0.k) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((j) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((j) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((j) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((j) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r11v1, types: [cli.q] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r2v46, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v66, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v27, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v3, types: [cli.w] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        yte.d dVar;
        yte.d dVar2;
        TopupMethodType topupMethodType;
        TopupMethodType topupMethodType2;
        io3.b bVar;
        io3.b bVar2;
        int i = 6;
        int i2 = 14;
        int i3 = 16;
        int i5 = 18;
        int i6 = 3;
        int i21 = 4;
        int i22 = 2;
        int i32 = 0;
        int i33 = 1;
        switch (this.u) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((k) this.f24793w).x2(new ck2.c(data, i6));
                return Unit.f186387a;
            case 1:
                cke.d clickedAccount = (cke.d) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                cke.h hVar = (cke.h) ((CryptoAccountPickerScreen) this.f24793w).N.getValue();
                hVar.getClass();
                Intrinsics.checkNotNullParameter(clickedAccount, "clickedAccount");
                hVar.C2(new cke.f(clickedAccount.f24820a));
                return Unit.f186387a;
            case 2:
                cli.j jVar = (cli.j) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                go.g gVar = new go.g(jVar, 2);
                cli.g gVar2 = (cli.g) this.f24793w;
                x xVar = new x(gVar, gVar2.f25025b, 27);
                return gVar2.d ? q.C(xVar, p0.f264002b) : xVar;
            case 3:
                v vVar = (v) this.f24793w;
                Pair pair = (Pair) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                cli.o oVar = (cli.o) pair.f186385a;
                cli.o oVar2 = (cli.o) pair.f186386b;
                A = oVar != null ? oVar2.a(oVar) : 0;
                long jNanoTime = System.nanoTime();
                l0 l0Var = vVar.f25040g;
                if (l0Var != null) {
                    l0Var.invoke(oVar2);
                }
                vVar.f25037a.B(oVar2, A);
                vVar.a().E.a(System.nanoTime() - jNanoTime);
                return Unit.f186387a;
            case 4:
                xi0.b currency = (xi0.b) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                tzg.l lVar = ((n) this.f24793w).f25261a;
                n9l.b ratesUpdatePeriod = n9l.b.SEC_10;
                t0 t0Var = (t0) lVar;
                Intrinsics.checkNotNullParameter(currency, "currency");
                Intrinsics.checkNotNullParameter(ratesUpdatePeriod, "ratesUpdatePeriod");
                return nim.a.v(t0.e(t0Var, zi0.c.i(currency), null, ratesUpdatePeriod, false, 10), new x8h.h(t0Var, i5));
            case 5:
                List items = (List) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                cnh.d dVar3 = (cnh.d) this.f24793w;
                Intrinsics.h(items);
                Intrinsics.checkNotNullParameter(items, "items");
                List list = items;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (obj3 instanceof qv0.p) {
                        arrayList.add(obj3);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj4 : list) {
                    if (obj4 instanceof wh) {
                        arrayList2.add(obj4);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it8 = arrayList2.iterator();
                while (it8.hasNext()) {
                    qv0.i iVar = ((wh) it8.next()).f54925b;
                    qv0.p pVar = iVar instanceof qv0.p ? (qv0.p) iVar : null;
                    if (pVar != null) {
                        arrayList3.add(pVar);
                    }
                }
                ArrayList arrayListU = w.u(zhm.v.k(arrayList, arrayList3));
                ArrayList visibleItems = new ArrayList();
                Iterator it9 = arrayListU.iterator();
                while (it9.hasNext()) {
                    Object f55231n = ((qv0.p) it9.next()).getF53564b();
                    ffl.a aVar7 = f55231n instanceof ffl.a ? (ffl.a) f55231n : null;
                    if (aVar7 != null) {
                        visibleItems.add(aVar7);
                    }
                }
                cnh.f fVar = dVar3.f25423c;
                Intrinsics.checkNotNullParameter(visibleItems, "visibleItems");
                ArrayList arrayList4 = new ArrayList(w.t(visibleItems, 10));
                Iterator it10 = visibleItems.iterator();
                while (it10.hasNext()) {
                    arrayList4.add(((ffl.a) it10.next()).i());
                }
                Set setI1 = d0.i1(d0.U(arrayList4));
                a2 a2Var = (a2) fVar.o;
                if (a2Var == null || !a2Var.d() || !Intrinsics.f((Set) fVar.f25428n, setI1)) {
                    fVar.f25428n = setI1;
                    a2 a2Var2 = (a2) fVar.o;
                    if (a2Var2 != null) {
                        a2Var2.f(null);
                    }
                    fVar.o = fVar.V2(new cn0.d(fVar, setI1, (Continuation) A, i22), new yi5.b(29));
                }
                return Unit.f186387a;
            case 6:
                ty0.a aVar8 = (ty0.a) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                cni.m mVarD3 = ((ConsentScreen) this.f24793w).d();
                Object obj5 = aVar8.d;
                cni.q qVar = (cni.q) mVarD3;
                qVar.getClass();
                String str = obj5 instanceof String ? (String) obj5 : null;
                if (str != null) {
                    qVar.C1(new ExternalDestination.Browser(str, null));
                }
                return Unit.f186387a;
            case 7:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                cnk.j jVar2 = (cnk.j) ((PricingPlanInfoBottomSheetScreen) this.f24793w).P.getValue();
                Intrinsics.h(clickData);
                cnk.m mVar = (cnk.m) jVar2;
                mVar.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                mVar.n2(new cn0.d(mVar, clickData, (Continuation) A, i21), new whi.b(i));
                return Unit.f186387a;
            case 8:
                ApmKeyGenerator apmKeyGenerator = (ApmKeyGenerator) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                try {
                    KeyStore keyStore = (KeyStore) apmKeyGenerator.f61851b.invoke();
                    keyStore.load(null);
                    keyStore.deleteEntry((String) this.f24793w);
                    return Boolean.TRUE;
                } catch (Exception e) {
                    ApmKeyGenerator.b("Error when deleting keys: " + e.getMessage(), e);
                    return Boolean.FALSE;
                }
            case 9:
                ty0.a aVar12 = (ty0.a) this.v;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((p) ((cp7.h) ((EditApplicationScreen) this.f24793w).Y.getValue())).y2(aVar12.f275445a);
                return Unit.f186387a;
            case 10:
                Data data2 = (Data) this.v;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                Address address = (Address) data2.getContent();
                p pVar2 = (p) this.f24793w;
                pVar2.x2(new avj.p(address, i33));
                if (((cp7.e) pVar2.t2()).f107892g && ((cp7.e) pVar2.t2()).d != null && ((cp7.e) pVar2.t2()).e) {
                    yji.l.a1(pVar2, pVar2.X1(new y0("ADDRESS_UPDATED_DIALOG", new j0((Clause) new TextLocalisedClause(R$string.car_insurance_edit_application_address_changed_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.car_insurance_edit_application_address_changed_description, null, null, 14), (StatusDialogDescriptionProgress) null, (Parcelable) null, (u1) new w1(6, new TextLocalisedClause(R$string.car_insurance_common_continue, null, null, 14), null), true, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (h0) null, (ResourceImage) null, 4044), false, 4)), null, null, new cp7.o(pVar2, null), 3);
                }
                return Unit.f186387a;
            case 11:
                Data data3 = (Data) this.v;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                cpb.k kVar = (cpb.k) this.f24793w;
                kVar.H2(kVar.f107923r, new ck2.c(data3, i2));
                return Unit.f186387a;
            case 12:
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.data.database.models.openbanking.d.D(Boolean.TYPE, ((cq6.c) this.v).f108003a, j6.a.q("FLEXIBLE_STAKING_BANNER_DISMISSED_KEY_", ((xi0.b) this.f24793w).f306286a), Boolean.TRUE);
                return Unit.f186387a;
            case 13:
                yhm.r rVar = (yhm.r) this.v;
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                Data data4 = (Data) rVar.f314201a;
                Data data5 = (Data) rVar.f314202b;
                Data data6 = (Data) rVar.f314203c;
                m mVar2 = (m) this.f24793w;
                mVar2.H2(mVar2.f108037t, new afg.h(i21, data4, data5, data6));
                return Unit.f186387a;
            case 14:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                cqf.h hVar2 = (cqf.h) this.v;
                hVar2.x2(new cma.b((String) this.f24793w, hVar2, i3));
                return Unit.f186387a;
            case 15:
                lw0.l lVar2 = (lw0.l) this.v;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                cql.h hVar3 = (cql.h) ((SignInSessionsBottomSheet) this.f24793w).T.getValue();
                String menuItemId = lVar2.a();
                hVar3.getClass();
                Intrinsics.checkNotNullParameter(menuItemId, "menuItemId");
                if (Intrinsics.f(menuItemId, "MENU_ID_NOT_YOU")) {
                    hVar3.C2(cql.d.f108155a);
                } else {
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, "Revolut SSO", "menu item id is not supported: ".concat(menuItemId.getClass().getName()), null, h0Var);
                }
                return Unit.f186387a;
            case 16:
                Data data7 = (Data) this.v;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.spending_analytics.impl.ui.rev10.settings.a aVar21 = (com.revolut.feature.spending_analytics.impl.ui.rev10.settings.a) this.f24793w;
                aVar21.H2(aVar21.f87904r, new ck2.c(data7, i3));
                return Unit.f186387a;
            case 17:
                String str2 = (String) this.v;
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                crf.k kVar2 = (crf.k) this.f24793w;
                kVar2.A2(u0.b(kVar2.f108375n.c(null, str2)));
                return Unit.f186387a;
            case 18:
                csj.i iVar2 = (csj.i) this.v;
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((u) this.f24793w).x2(new cp7.k(iVar2, i5));
                return Unit.f186387a;
            case 19:
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                jf0.c cVar = (jf0.c) this.v;
                String strE = cVar.e(3);
                sri.m mVar3 = ((ct7.b) this.f24793w).f108648a;
                FeatureCommand featureCommandF = u0.f(ct7.b.b(cVar));
                if (cVar.l()) {
                    mVar3.c(new CompositeCommand(new FeatureCommand(new LoanHomeFeatureConfig(strE)), featureCommandF));
                } else {
                    mVar3.c(featureCommandF);
                }
                return Boolean.TRUE;
            case 20:
                String str3 = (String) this.v;
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                cta.c cVar2 = (cta.c) this.f24793w;
                return j6.a.k(com.revolut.feature.raffle.impl.data.models.b.class, cVar2.f108653a, cta.c.a(cVar2, str3));
            case 21:
                ctk.l lVar3 = (ctk.l) this.v;
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                r rVar2 = (r) this.f24793w;
                rVar2.X2(rVar2.f108700n, new ctk.q(lVar3, i32));
                return Unit.f186387a;
            case 22:
                cuc.m mVar4 = (cuc.m) this.v;
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                s sVar = (s) j6.a.k(s.class, ((cuc.r) this.f24793w).f108968a, j6.a.q("TRANSACTION_SECURITY_DELAY_INFO_KEY_", mVar4.f108961b));
                if (sVar != null) {
                    return cuc.i.a(sVar);
                }
                return null;
            case 23:
                qtc.k kVar3 = (qtc.k) this.v;
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                a1 a1Var = (a1) j6.a.k(a1.class, ((z) this.f24793w).f108982a, z.b(kVar3));
                if (a1Var != null) {
                    return f0.a(a1Var);
                }
                return null;
            case 24:
                String str4 = (String) this.v;
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return j6.a.k(String.class, ((cuh.b) this.f24793w).d, str4);
            case 25:
                vf0.k kVar4 = (vf0.k) this.v;
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                Data data8 = (Data) kVar4.f288454a;
                Data data9 = (Data) kVar4.f288455b;
                Data data10 = (Data) kVar4.f288456c;
                wi0.b bVar3 = (wi0.b) kVar4.d;
                Data data11 = (Data) kVar4.e;
                com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.checkout.b bVar4 = (com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.checkout.b) this.f24793w;
                bVar4.H2(bVar4.z, new axi.v(data8, data9, data10, data11, bVar4, bVar3));
                return Unit.f186387a;
            case 26:
                Data data12 = (Data) this.v;
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                y yVar = (y) this.f24793w;
                yVar.H2(yVar.f109069t, new ck2.c(data12, 17));
                return Unit.f186387a;
            case 27:
                String listId = (String) this.v;
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                cv6.l lVarE3 = ((FreelancerAcquiringPaymentFiltersScreen) this.f24793w).R2();
                Intrinsics.h(listId);
                com.revolut.feature.freelancer.impl.ui.acquiring_payment.filters.screen.a aVar33 = (com.revolut.feature.freelancer.impl.ui.acquiring_payment.filters.screen.a) lVarE3;
                aVar33.getClass();
                Intrinsics.checkNotNullParameter(listId, "listId");
                if (listId.equals("ITEM_ID_MENU_RESET")) {
                    aVar33.H2(aVar33.f73726t, new n2(12));
                }
                return Unit.f186387a;
            case 28:
                Data data13 = (Data) this.v;
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.freelancer.impl.ui.acquiring_payment.filters.screen.a aVar35 = (com.revolut.feature.freelancer.impl.ui.acquiring_payment.filters.screen.a) this.f24793w;
                aVar35.H2(aVar35.f73726t, new w0(data13, 19));
                return Unit.f186387a;
            default:
                String storedMethodId = (String) this.v;
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ej9.c cVar3 = ((cve.c) this.f24793w).f109339c;
                Intrinsics.checkNotNullParameter(storedMethodId, "storedMethodId");
                ive.a aVar37 = (ive.a) j6.a.k(ive.a.class, cVar3.f126792a, j6.a.q("INDIA_STORED_METHOD_ENTITY_KEY_storedMethodId=", storedMethodId));
                if (aVar37 == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(aVar37, "<this>");
                String strC = aVar37.getId();
                String strF = aVar37.getState();
                yte.d[] dVarArrValues = yte.d.values();
                int length = dVarArrValues.length;
                int i43 = 0;
                while (true) {
                    if (i43 < length) {
                        dVar = dVarArrValues[i43];
                        if (!a0.z(dVar.name(), strF, true)) {
                            i43++;
                        }
                    } else {
                        dVar = null;
                    }
                }
                if (dVar == null) {
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(j6.a.q("State can't be parsed for India Stored method details: ", aVar37.getState()));
                    zhm.h0 h0Var2 = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var2);
                    dVar2 = null;
                } else {
                    dVar2 = dVar;
                }
                String strH = aVar37.getType();
                TopupMethodType[] topupMethodTypeArrValues = TopupMethodType.values();
                int length2 = topupMethodTypeArrValues.length;
                while (true) {
                    if (i32 < length2) {
                        topupMethodType = topupMethodTypeArrValues[i32];
                        if (!a0.z(topupMethodType.name(), strH, true)) {
                            i32++;
                        }
                    } else {
                        topupMethodType = null;
                    }
                }
                if (topupMethodType == null) {
                    IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException(j6.a.q("Type can't be parsed for India Stored method details: ", aVar37.getType()));
                    zhm.h0 h0Var3 = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException2, h0Var3);
                    topupMethodType2 = null;
                } else {
                    topupMethodType2 = topupMethodType;
                }
                String strG = aVar37.getTitle();
                Long lD = aVar37.getLastUsedAt();
                Instant instantOfEpochMilli = lD != null ? Instant.ofEpochMilli(lD.longValue()) : null;
                a.d dVarE = aVar37.getLogo();
                if (dVarE != null) {
                    try {
                        String upperCase = dVarE.getType().toUpperCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                        bVar = new io3.b(io3.a.valueOf(upperCase), dVarE.getValue());
                    } catch (Exception e2) {
                        zhm.h0 h0Var4 = zhm.h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList4 = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, null, null, e2, h0Var4);
                        bVar = null;
                    }
                    bVar2 = bVar;
                    break;
                } else {
                    bVar2 = null;
                }
                a.b bVarA = aVar37.getDetails();
                return new yte.e(strC, dVar2, topupMethodType2, strG, instantOfEpochMilli, bVar2, bVarA != null ? new yte.c(bVarA.getAccountNumber(), bVarA.getAccountHolder()) : null, aVar37.getFailureReason());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f24793w = obj2;
    }
}
