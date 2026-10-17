package o95;

import bbj.d;
import com.revolut.data.model.Data;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_custom_product.EditCustomProductScreen;
import com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_custom_product.EditCustomProductScreenContract$ModalStep;
import com.revolut.feature.backend_flow.domain.models.BackendEntitiesSummaryItem;
import com.revolut.feature.cashback.impl.ui.yourcashback.cashback_product.CashbackProductScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.single_selection.SingleSelectionController;
import com.revolut.feature.credit.application.plugins.impl.ui.rejected.RejectedController;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.fields.dropdown_searchable.DropdownSearchableSelectionScreen;
import com.revolut.feature.retail.restaurants.impl.ui.reservationcreation.timepicker.ReservationTimePickerScreen;
import com.revolut.feature.shops.impl.ui.personalized_opt_in.ShopsAdsPersonalizedOffersOptInScreen;
import com.revolut.feature.wealth.api.declaration.DisclosuresFeatureConfig;
import com.revolut.feature_web_view.WebViewFeatureConfig;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import com.revolut.retail.feature.esim.api.model.EsimProfile;
import com.revolut.retail.feature.esim.impl.ui.screens.esim_setup_options.EsimSetupOptionsScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.more_for_family.MoreForFamilyScreen;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.more_for_family.MoreForFamilyScreenContract$ClickParcel;
import com.revolut.sso.api.models.Evidence;
import com.revolut.sso.impl.ui.auth.n;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import nii.j1;
import nii.k1;
import nii.l1;
import nii.m1;
import nii.n1;
import o23.l;
import o9a.y;
import ob1.o;
import obc.m;
import oc0.k;
import od3.g0;
import od3.s0;
import og9.j;
import oi4.p;
import ojk.l0;
import ojk.q;
import q90.u;
import yhm.r;
import zhm.h0;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f223072w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
        this.f223072w = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c((e) this.f223072w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            case 1:
                c cVar2 = new c((oa9.h) this.f223072w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
            case 2:
                c cVar3 = new c((oaj.a) this.f223072w, continuation, 2);
                cVar3.v = obj2;
                return cVar3;
            case 3:
                c cVar4 = new c((o) this.f223072w, continuation, 3);
                cVar4.v = obj2;
                return cVar4;
            case 4:
                c cVar5 = new c((m) this.f223072w, continuation, 4);
                cVar5.v = obj2;
                return cVar5;
            case 5:
                c cVar6 = new c((com.revolut.feature.travel.hotels.impl.ui_kompot.screen.campaign.b) this.f223072w, continuation, 5);
                cVar6.v = obj2;
                return cVar6;
            case 6:
                c cVar7 = new c((oc0.i) this.f223072w, continuation, 6);
                cVar7.v = obj2;
                return cVar7;
            case 7:
                c cVar8 = new c((k) this.f223072w, continuation, 7);
                cVar8.v = obj2;
                return cVar8;
            case 8:
                c cVar9 = new c((oc0.m) this.f223072w, continuation, 8);
                cVar9.v = obj2;
                return cVar9;
            case 9:
                c cVar10 = new c((oc4.k) this.f223072w, continuation, 9);
                cVar10.v = obj2;
                return cVar10;
            case 10:
                c cVar11 = new c((com.revolut.feature.onboarding.impl.qes_terms.h) this.f223072w, continuation, 10);
                cVar11.v = obj2;
                return cVar11;
            case 11:
                return new c((com.revolut.feature.onboarding.impl.qes_terms.h) this.v, (com.revolut.feature.onboarding.impl.qes.waiting_qes_result.a) this.f223072w, continuation, 11);
            case 12:
                c cVar12 = new c((CashbackProductScreen) this.f223072w, continuation, 12);
                cVar12.v = obj2;
                return cVar12;
            case 13:
                c cVar13 = new c((EditCustomProductScreen) this.f223072w, continuation, 13);
                cVar13.v = obj2;
                return cVar13;
            case 14:
                c cVar14 = new c((SingleSelectionController) this.f223072w, continuation, 14);
                cVar14.v = obj2;
                return cVar14;
            case 15:
                c cVar15 = new c((ReservationTimePickerScreen) this.f223072w, continuation, 15);
                cVar15.v = obj2;
                return cVar15;
            case 16:
                c cVar16 = new c((DropdownSearchableSelectionScreen) this.f223072w, continuation, 16);
                cVar16.v = obj2;
                return cVar16;
            case 17:
                c cVar17 = new c((j) this.f223072w, continuation, 17);
                cVar17.v = obj2;
                return cVar17;
            case 18:
                c cVar18 = new c((RejectedController) this.f223072w, continuation, 18);
                cVar18.v = obj2;
                return cVar18;
            case 19:
                c cVar19 = new c((ohb.j) this.f223072w, continuation, 19);
                cVar19.v = obj2;
                return cVar19;
            case 20:
                c cVar20 = new c((EsimSetupOptionsScreen) this.f223072w, continuation, 20);
                cVar20.v = obj2;
                return cVar20;
            case 21:
                return new c((ryc.a) this.v, (jpc.e) this.f223072w, continuation, 21);
            case 22:
                return new c((p) this.v, (it3.d) this.f223072w, continuation, 22);
            case 23:
                c cVar21 = new c((oj2.i) this.f223072w, continuation, 23);
                cVar21.v = obj2;
                return cVar21;
            case 24:
                c cVar22 = new c((ShopsAdsPersonalizedOffersOptInScreen) this.f223072w, continuation, 24);
                cVar22.v = obj2;
                return cVar22;
            case 25:
                c cVar23 = new c((q) this.f223072w, continuation, 25);
                cVar23.v = obj2;
                return cVar23;
            case 26:
                c cVar24 = new c((l0) this.f223072w, continuation, 26);
                cVar24.v = obj2;
                return cVar24;
            case 27:
                c cVar25 = new c((MoreForFamilyScreen) this.f223072w, continuation, 27);
                cVar25.v = obj2;
                return cVar25;
            case 28:
                return new c((n) this.v, (gkl.m) this.f223072w, continuation, 28);
            default:
                return new c((n) this.v, (Evidence) this.f223072w, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((od0.i) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((c) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((c) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((c) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((c) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((c) create((r) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((c) create((oc0.h) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((c) create((oc0.j) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((c) create((ax4.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((c) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((c) create((bbj.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((c) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((c) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((c) create((hs3.n) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((c) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((c) create((EsimProfile) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((c) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((c) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((c) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((c) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((c) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((c) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((c) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v62, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v55, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v63, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v72, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v88, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r12v96, types: [java.lang.Object, kotlin.Lazy] */
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
        FeatureConfig featureConfig;
        int i = this.u;
        int i2 = 10;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object obj3 = this.f223072w;
        switch (i) {
            case 0:
                e eVar = (e) obj3;
                od0.i iVar = (od0.i) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (!iVar.d()) {
                    return new go.g(new Data(new f95.a(null), null, false, 6, null), 2);
                }
                i95.e eVar2 = eVar.f223075b;
                String facilityId = ((f95.d) iVar.c()).f132830a;
                eVar2.getClass();
                Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                w4l.h strategy = w4l.h.f294642c;
                Intrinsics.checkNotNullParameter(strategy, "strategy");
                return nim.a.v(eVar2.e.b(facilityId, strategy), new fjm.j(eVar, 5));
            case 1:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                oa9.h hVar = (oa9.h) obj3;
                hVar.H2(hVar.f223551r, new y(data, i2));
                return Unit.f186387a;
            case 2:
                oaj.a aVar3 = (oaj.a) obj3;
                List list = (List) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                List list2 = list;
                ArrayList arrayList = new ArrayList(w.t(list2, 10));
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    t61.a.A(xi0.b.Companion, (String) it8.next(), arrayList);
                }
                return rd0.e.b(nim.a.w(kli.a.h(zi0.c.o(aVar3.f223793b.a(arrayList, n9l.b.SEC_3)), zi0.c.o(aVar3.f223793b.b(arrayList, tzg.j.ONE_DAY))), new o54.a(arrayList, aVar3, 16)));
            case 3:
                Data data2 = (Data) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o oVar = (o) obj3;
                oVar.x2(new y(data2, oVar));
                return Unit.f186387a;
            case 4:
                Data data3 = (Data) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                m mVar = (m) obj3;
                mVar.H2(mVar.f223926r, new y(data3, 12));
                return Unit.f186387a;
            case 5:
                com.revolut.feature.travel.hotels.impl.ui_kompot.screen.campaign.b bVar = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.campaign.b) obj3;
                r rVar = (r) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Data data4 = (Data) rVar.f314201a;
                Data data5 = (Data) rVar.f314202b;
                Data data6 = (Data) rVar.f314203c;
                if (zi0.c.E(data4) && data4.getContent() == null) {
                    bVar.C2(obg.g.f223942a);
                }
                bVar.H2(bVar.f93867s, new afg.h(i2, data4, data5, data6));
                return Unit.f186387a;
            case 6:
                oc0.h hVar2 = (oc0.h) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                oc0.i iVar2 = (oc0.i) obj3;
                q90.j jVar = (q90.j) j6.a.k(q90.j.class, iVar2.d, hVar2.a());
                if (jVar != null) {
                    return ((gc0.b) iVar2.f224034a).a(jVar);
                }
                return null;
            case 7:
                oc0.j jVar2 = (oc0.j) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                q90.k kVar = (q90.k) j6.a.k(q90.k.class, ((k) obj3).f224042c, jVar2.a());
                if (kVar == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(kVar, "<this>");
                return new BackendEntitiesSummaryItem(kVar.getTitle(), kVar.getSubtitle(), kVar.getIconEntityId());
            case 8:
                String str = (String) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return j6.a.k(u.class, ((oc0.m) obj3).f224044b, oc0.m.b(str));
            case 9:
                ax4.b bVar2 = (ax4.b) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                oc4.k kVar2 = (oc4.k) obj3;
                kVar2.H2(kVar2.f224100q, new ah4.f(bVar2, 11));
                return Unit.f186387a;
            case 10:
                com.revolut.feature.onboarding.impl.qes_terms.h hVar3 = (com.revolut.feature.onboarding.impl.qes_terms.h) obj3;
                n1 n1Var = (n1) this.v;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (n1Var instanceof l1) {
                    hVar3.P2();
                } else if (n1Var instanceof k1) {
                    hVar3.Q2();
                } else {
                    if (!(n1Var instanceof j1) && !(n1Var instanceof m1)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    IllegalStateException illegalStateException = new IllegalStateException(n1Var + " is not supported");
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                }
                return Unit.f186387a;
            case 11:
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                com.revolut.feature.onboarding.impl.qes_terms.h.I2((com.revolut.feature.onboarding.impl.qes_terms.h) this.v, ((mc9.f) ((com.revolut.feature.onboarding.impl.qes.waiting_qes_result.a) obj3)).f204314a);
                return Unit.f186387a;
            case 12:
                bbj.d disclosuresLinkParcel = (bbj.d) this.v;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                g0 g0VarT2 = ((CashbackProductScreen) obj3).T2();
                Intrinsics.h(disclosuresLinkParcel);
                s0 s0Var = (s0) g0VarT2;
                s0Var.getClass();
                Intrinsics.checkNotNullParameter(disclosuresLinkParcel, "disclosuresLinkParcel");
                if (Intrinsics.f(disclosuresLinkParcel, d.a.f14312a)) {
                    featureConfig = DisclosuresFeatureConfig.CommoditiesDisclosuresFeatureConfig.f95194a;
                } else {
                    if (!Intrinsics.f(disclosuresLinkParcel, d.b.f14313a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    featureConfig = DisclosuresFeatureConfig.CryptoDisclosuresFeatureConfig.f95195a;
                }
                s0Var.C1(new BridgeDestination(new FeatureCommand(featureConfig)));
                return Unit.f186387a;
            case 13:
                String itemId = (String) this.v;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                oe1.h hVarE3 = ((EditCustomProductScreen) obj3).d();
                Intrinsics.h(itemId);
                com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_custom_product.a aVar16 = (com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_custom_product.a) hVarE3;
                aVar16.getClass();
                Intrinsics.checkNotNullParameter(itemId, "itemId");
                if (itemId.equals("DELETE_MENU_ITEM_ID")) {
                    oki.h.v2(aVar16.f60808t, EditCustomProductScreenContract$ModalStep.DeleteConfirmation.f60801a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                }
                return Unit.f186387a;
            case 14:
                ty0.a aVar17 = (ty0.a) this.v;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                oe4.f fVarE3 = ((SingleSelectionController) obj3).d();
                Intrinsics.h(aVar17);
                ((oe4.q) fVarE3).I2(new oe4.k(aVar17));
                return Unit.f186387a;
            case 15:
                Pair pair = (Pair) this.v;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                int iIntValue = ((Number) pair.f186386b).intValue();
                oeb.f fVar = (oeb.f) ((ReservationTimePickerScreen) obj3).Q.getValue();
                fVar.H2(fVar.f224575p, new abf.n((LocalTime) fVar.o.get(iIntValue), iIntValue, 22));
                return Unit.f186387a;
            case 16:
                String searchQuery = (String) this.v;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                og9.g gVar = (og9.g) ((DropdownSearchableSelectionScreen) obj3).R.getValue();
                Intrinsics.h(searchQuery);
                j jVar3 = (j) gVar;
                jVar3.getClass();
                Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
                jVar3.o.d(searchQuery);
                return Unit.f186387a;
            case 17:
                String str2 = (String) this.v;
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                j jVar4 = (j) obj3;
                jVar4.H2(jVar4.f225062p, new l(str2, 17));
                return Unit.f186387a;
            case 18:
                hs3.n bureau = (hs3.n) this.v;
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                oh4.e eVar3 = (oh4.e) ((RejectedController) obj3).R.getValue();
                Intrinsics.h(bureau);
                oh4.l lVar = (oh4.l) eVar3;
                lVar.getClass();
                Intrinsics.checkNotNullParameter(bureau, "bureau");
                lVar.C1(new BridgeDestination(new FeatureCommand(new WebViewFeatureConfig(bureau.f154916c, null, 0, false, false, true, 65422))));
                return Unit.f186387a;
            case 19:
                n1 n1Var2 = (n1) this.v;
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                if (n1Var2 instanceof l1) {
                    ohb.j jVar5 = (ohb.j) obj3;
                    jVar5.l2(new nt4.f(jVar5, objArr == true ? 1 : 0, 20), new yi5.b(26));
                } else {
                    int i3 = jli.h.f175850a;
                }
                return Unit.f186387a;
            case 20:
                EsimProfile esimProfile = (EsimProfile) this.v;
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ohj.h hVar4 = (ohj.h) ((EsimSetupOptionsScreen) obj3).V.getValue();
                Intrinsics.h(esimProfile);
                hVar4.getClass();
                Intrinsics.checkNotNullParameter(esimProfile, "esimProfile");
                hVar4.H2(hVar4.f225380p, new ohj.g(esimProfile, 0));
                return Unit.f186387a;
            case 21:
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ryc.a aVar26 = (ryc.a) this.v;
                jpc.e listener = (jpc.e) obj3;
                Intrinsics.checkNotNullParameter(listener, "listener");
                LinkedHashMap linkedHashMap = (LinkedHashMap) aVar26.f258290b;
                uh0.d dVar = (uh0.d) linkedHashMap.get(listener);
                if (dVar != null) {
                    ((vc.b) aVar26.f258289a).g(dVar);
                }
                return Unit.f186387a;
            case 22:
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((p) this.v).v2(new oi4.g((it3.d) obj3));
                return Unit.f186387a;
            case 23:
                Data data7 = (Data) this.v;
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                oj2.i iVar3 = (oj2.i) obj3;
                iVar3.H2(iVar3.f225722s, new y(data7, 23));
                return Unit.f186387a;
            case 24:
                ty0.a aVar29 = (ty0.a) this.v;
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ojd.g gVar2 = (ojd.g) ((ShopsAdsPersonalizedOffersOptInScreen) obj3).Q.getValue();
                String id10 = aVar29.f275445a;
                gVar2.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                if (Intrinsics.f(id10, "ID_PROMOTION_STATUS_THIRD_PARTY_LEARN_MORE")) {
                    gVar2.n2(new nt4.f(gVar2, objArr2 == true ? 1 : 0, 25), new whi.b(6));
                }
                return Unit.f186387a;
            case 25:
                Data data8 = (Data) this.v;
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                q qVar = (q) obj3;
                qVar.H2(qVar.L2(), new ofg.a(qVar, data8, 13));
                return Unit.f186387a;
            case 26:
                Data data9 = (Data) this.v;
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                l0 l0Var = (l0) obj3;
                l0Var.H2(l0Var.f225828w, new y(data9, 24));
                return Unit.f186387a;
            case 27:
                Object parcel = this.v;
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                okk.l lVar2 = (okk.l) ((MoreForFamilyScreen) obj3).Q.getValue();
                Intrinsics.h(parcel);
                lVar2.getClass();
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                MoreForFamilyScreenContract$ClickParcel moreForFamilyScreenContract$ClickParcel = parcel instanceof MoreForFamilyScreenContract$ClickParcel ? (MoreForFamilyScreenContract$ClickParcel) parcel : null;
                if (moreForFamilyScreenContract$ClickParcel != null) {
                    lVar2.o.Z2(moreForFamilyScreenContract$ClickParcel);
                }
                return Unit.f186387a;
            case 28:
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((n) this.v).n3((gkl.m) obj3, null, true);
                return Unit.f186387a;
            default:
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ((n) this.v).h3((Evidence) obj3);
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f223072w = obj2;
    }
}
