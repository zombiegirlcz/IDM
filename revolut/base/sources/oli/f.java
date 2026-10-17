package oli;

import a82.v;
import android.net.Uri;
import android.view.View;
import aw0.n6;
import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.data.model.Data;
import com.revolut.feature.acquiring.card_reader.ui.api.navigation.CardReaderFlowDestination;
import com.revolut.feature.apm.breb.impl.ui.qr_request.request.BrebQrRequestScreen;
import com.revolut.feature.apm.core.api.product.ApmBlik;
import com.revolut.feature.apm.core.ui.api.navigation.ApmAliasClaimNavigation$Destination;
import com.revolut.feature.apm.core.ui.api.navigation.ApmAliasClaimNavigation$InputData;
import com.revolut.feature.card_design.impl.card_design.card_personalisation_info.CardPersonalisationInfoController;
import com.revolut.feature.credit.autopay.model.CreditCardAutoPayDataRequest;
import com.revolut.feature.credit.autopay.models.repayment.AutoPayRepaymentDataRequest;
import com.revolut.feature.credit.card.models.additional_cards.AdditionalCardholdersState;
import com.revolut.feature.crypto.config.api.models.CryptoAddressHostingProviderType;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.hostingaddprovider.CryptoAddressHostingAddProviderController;
import com.revolut.feature.freelancer.api.navigation.FreelancerBizFeatureConfig;
import com.revolut.feature.freelancer.impl.ui.acquiring_order.list.FreelancerAcquiringOrderListScreen;
import com.revolut.feature.freelancer.impl.ui.acquiring_order.list.FreelancerAcquiringOrderListScreenContract$ModalStep;
import com.revolut.feature.insurance_common.data.model.DocumentsGroup;
import com.revolut.feature.user_declarations.shared.flows.place_of_birth.screen.PlaceOfBirthScreen;
import com.revolut.feature.wealth_discovery.api.declaration.ScreenerCollectionDestination;
import com.revolut.feature.wealth_discovery.impl.screener.screens.all_collections_redesign.page.ScreenerCollectionsPageScreen;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.feature.commodity.asset_details.api.navigation.CommodityAssetDetailsDestination;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.student.student_hub.StudentHubScreen;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.etf_details.EtfDetailsFlowController;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.etf_details.EtfDetailsFlowControllerContract$Page;
import com.revolut.shared.feature.user_declarations.api.flows.place_of_birth.PlaceOfBirthFlowOutputData;
import com.revolut.shared.feature.wealth.models.screener.ScreenerCollection;
import cp4.i0;
import dp4.o0;
import h93.f0;
import ha3.x;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import kotlin.text.d0;
import kotlinx.coroutines.CoroutineScope;
import m9d.w0;
import nii.l1;
import nii.n1;
import o9a.y;
import om4.b2;
import om4.e0;
import om4.n;
import om4.p;
import om4.s3;
import om4.x2;
import oqe.t;
import os9.u;
import ot1.b0;
import vkm.j2;
import vkm.q;
import vkm.q0;
import yhm.o;
import yhm.r;
import zh9.u0;
import zhm.w;
import zhm.y0;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f226423w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.v = obj2;
        this.f226423w = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f((g) this.v, (Uri) this.f226423w, continuation, 0);
            case 1:
                f fVar = new f((om4.l) this.f226423w, continuation, 1);
                fVar.v = obj2;
                return fVar;
            case 2:
                f fVar2 = new f((p) this.f226423w, continuation, 2);
                fVar2.v = obj2;
                return fVar2;
            case 3:
                f fVar3 = new f((e0) this.f226423w, continuation, 3);
                fVar3.v = obj2;
                return fVar3;
            case 4:
                f fVar4 = new f((x2) this.f226423w, continuation, 4);
                fVar4.v = obj2;
                return fVar4;
            case 5:
                f fVar5 = new f(continuation, (yw4.p) this.f226423w);
                fVar5.v = obj2;
                return fVar5;
            case 6:
                f fVar6 = new f((s3) this.f226423w, continuation, 6);
                fVar6.v = obj2;
                return fVar6;
            case 7:
                f fVar7 = new f((omh.e) this.f226423w, continuation, 7);
                fVar7.v = obj2;
                return fVar7;
            case 8:
                f fVar8 = new f((ona.i) this.f226423w, continuation, 8);
                fVar8.v = obj2;
                return fVar8;
            case 9:
                f fVar9 = new f((StudentHubScreen) this.f226423w, continuation, 9);
                fVar9.v = obj2;
                return fVar9;
            case 10:
                f fVar10 = new f((onk.l) this.f226423w, continuation, 10);
                fVar10.v = obj2;
                return fVar10;
            case 11:
                f fVar11 = new f((oo2.p) this.f226423w, continuation, 11);
                fVar11.v = obj2;
                return fVar11;
            case 12:
                f fVar12 = new f((PlaceOfBirthScreen) this.f226423w, continuation, 12);
                fVar12.v = obj2;
                return fVar12;
            case 13:
                f fVar13 = new f((com.revolut.feature.user_declarations.shared.flows.place_of_birth.screen.a) this.f226423w, continuation, 13);
                fVar13.v = obj2;
                return fVar13;
            case 14:
                f fVar14 = new f((ScreenerCollectionsPageScreen) this.f226423w, continuation, 14);
                fVar14.v = obj2;
                return fVar14;
            case 15:
                return new f((View) this.v, (CryptoAddressHostingAddProviderController) this.f226423w, continuation, 15);
            case 16:
                f fVar15 = new f((t) this.f226423w, continuation, 16);
                fVar15.v = obj2;
                return fVar15;
            case 17:
                f fVar16 = new f((com.revolut.feature.credit.card.impl.ui.documents_rates.a) this.f226423w, continuation, 17);
                fVar16.v = obj2;
                return fVar16;
            case 18:
                f fVar17 = new f((or7.c) this.f226423w, continuation, 18);
                fVar17.v = obj2;
                return fVar17;
            case 19:
                f fVar18 = new f((u) this.f226423w, continuation, 19);
                fVar18.v = obj2;
                return fVar18;
            case 20:
                f fVar19 = new f((b0) this.f226423w, continuation, 20);
                fVar19.v = obj2;
                return fVar19;
            case 21:
                f fVar20 = new f((EtfDetailsFlowController) this.f226423w, continuation, 21);
                fVar20.v = obj2;
                return fVar20;
            case 22:
                f fVar21 = new f((com.revolut.feature.apm.blik.impl.ui.flow.a) this.f226423w, continuation, 22);
                fVar21.v = obj2;
                return fVar21;
            case 23:
                f fVar22 = new f((FreelancerAcquiringOrderListScreen) this.f226423w, continuation, 23);
                fVar22.v = obj2;
                return fVar22;
            case 24:
                f fVar23 = new f((com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.coverage_details.b) this.f226423w, continuation, 24);
                fVar23.v = obj2;
                return fVar23;
            case 25:
                f fVar24 = new f((BrebQrRequestScreen) this.f226423w, continuation, 25);
                fVar24.v = obj2;
                return fVar24;
            case 26:
                return new f((com.revolut.feature.card_add_to_googlepay.impl.verification.confirmation.e) this.v, (String) this.f226423w, continuation, 26);
            case 27:
                return new f((com.revolut.feature.card_add_to_googlepay.impl.verification.confirmation.e) this.v, (f0) this.f226423w, continuation, 27);
            case 28:
                f fVar25 = new f((CardPersonalisationInfoController) this.f226423w, continuation, 28);
                fVar25.v = obj2;
                return fVar25;
            default:
                f fVar26 = new f((ox2.b) this.f226423w, continuation, 29);
                fVar26.v = obj2;
                return fVar26;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((f) create((yw4.p) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((f) create((AutoPayRepaymentDataRequest) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((f) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((f) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((f) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((f) create((wi0.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((f) create((klh.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((f) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((f) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((f) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((f) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((f) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((f) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((f) create((oph.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((f) create((Unit) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((f) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((f) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((f) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((f) create((os9.k) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((f) create((ot1.c) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((f) create((EtfDetailsFlowControllerContract$Page) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((f) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((f) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((f) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((f) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((f) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((f) create((n6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r2v29, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v43, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v84, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws IOException {
        CryptoAddressHostingProviderType cryptoAddressHostingProviderType;
        int i = this.u;
        w4l.h loadingStrategy = w4l.h.f294642c;
        int i2 = 24;
        int i3 = 10;
        int i5 = 15;
        int i6 = 3;
        int i21 = 22;
        int i22 = 4;
        int i32 = 2;
        int i33 = 0;
        ?? r122 = 0;
        ArrayList arrayList = null;
        Object obj3 = this.f226423w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                g gVar = (g) this.v;
                InputStream inputStreamOpenInputStream = gVar.f226424a.getContentResolver().openInputStream((Uri) obj3);
                if (inputStreamOpenInputStream != null) {
                    File fileB = gVar.e.b(gVar.f.a(gVar.o));
                    try {
                        FileOutputStream fileOutputStream = new FileOutputStream(fileB);
                        try {
                            zi0.c.m(inputStreamOpenInputStream, fileOutputStream, 8192);
                            fileOutputStream.close();
                            inputStreamOpenInputStream.close();
                            r122 = fileB;
                        } finally {
                        }
                    } catch (Throwable th10) {
                        try {
                            throw th10;
                        } catch (Throwable th11) {
                            com.bumptech.glide.d.e(inputStreamOpenInputStream, th10);
                            throw th11;
                        }
                    }
                }
                return r122;
            case 1:
                yw4.p pVar = (yw4.p) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return om4.l.a((om4.l) obj3, pVar);
            case 2:
                AutoPayRepaymentDataRequest autoPayRepaymentDataRequest = (AutoPayRepaymentDataRequest) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                Intrinsics.i(autoPayRepaymentDataRequest, "null cannot be cast to non-null type com.revolut.feature.credit.autopay.model.CreditCardAutoPayDataRequest");
                CreditCardAutoPayDataRequest creditCardAutoPayDataRequest = (CreditCardAutoPayDataRequest) autoPayRepaymentDataRequest;
                p pVar2 = (p) obj3;
                v vVar = new v(q.h(((om4.q) pVar2.f226658c).f226665a), 4);
                xi0.b bVar = creditCardAutoPayDataRequest.d;
                yb5.e eVar = (yb5.e) pVar2.f226657b;
                return nim.a.v(u0.i(vVar, eVar.d(eVar.c(y0.b(bVar))), nim.a.v(pVar2.d.j(w4l.j.f294644c), n.f)), new ofg.a(creditCardAutoPayDataRequest, pVar2, i21));
            case 3:
                List list = (List) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                if (list.isEmpty()) {
                    return new q0(q.q(nim.a.v(rd0.e.b(osg.b.g(((e0) obj3).f226557b, w4l.h.f294642c, io3.l.CREDIT, io3.k.ACTIVE, null, null, null, null, SyslogConstants.LOG_CLOCK)), new okk.d(i2))), new m84.c(i32, i5, r122), 1);
                }
                return zi0.c.i(Boolean.TRUE);
            case 4:
                List list2 = (List) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                return list2.isEmpty() ? new go.g(new Data(zhm.f0.f322471a, null, false, 6, null), 2) : nim.a.v(((x2) obj3).d.e(loadingStrategy), new njf.e(list2, 9));
            case 5:
                Pair pair = (Pair) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                r rVar = (r) pair.f186385a;
                Object obj4 = pair.f186386b;
                return new b2((yw4.p) obj3, (ll4.u) rVar.f314201a, (List) rVar.f314202b, (yw4.b) rVar.f314203c, (AdditionalCardholdersState) obj4);
            case 6:
                wi0.b countryCode = (wi0.b) this.v;
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                o0 o0Var = ((s3) obj3).f226692g;
                o0Var.getClass();
                Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                return o0Var.e.b(new i0(countryCode), loadingStrategy);
            case 7:
                klh.b parcel = (klh.b) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                omh.f fVar = ((omh.e) obj3).f226852c;
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                fVar.A2(new CommodityAssetDetailsDestination(parcel.f185626a, null));
                return Unit.f186387a;
            case 8:
                Data data = (Data) this.v;
                fim.a aVar9 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((ona.i) obj3).x2(new y(data, 27));
                return Unit.f186387a;
            case 9:
                String deeplink = (String) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                onk.h hVar = (onk.h) ((StudentHubScreen) obj3).f103637h0.getValue();
                Intrinsics.h(deeplink);
                onk.l lVar = (onk.l) hVar;
                lVar.getClass();
                Intrinsics.checkNotNullParameter(deeplink, "deeplink");
                lVar.J2(deeplink);
                return Unit.f186387a;
            case 10:
                Data data2 = (Data) this.v;
                fim.a aVar11 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                onk.l lVar2 = (onk.l) obj3;
                lVar2.H2(lVar2.f226965w, new y(data2, 28));
                return Unit.f186387a;
            case 11:
                n1 n1Var = (n1) this.v;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                if (n1Var instanceof l1) {
                    oo2.p pVar3 = (oo2.p) obj3;
                    qo2.k kVar = (qo2.k) ((oo2.i) ((j2) pVar3.f227004p.f22677a).getValue()).d.getContent();
                    if (kVar != null) {
                        pVar3.l2(new oh4.i(pVar3, kVar, (Continuation) r122, i2), new yi5.b(26));
                    }
                }
                return Unit.f186387a;
            case 12:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                oog.i iVarE3 = ((PlaceOfBirthScreen) obj3).R2();
                Intrinsics.h(clickData);
                com.revolut.feature.user_declarations.shared.flows.place_of_birth.screen.a aVar14 = (com.revolut.feature.user_declarations.shared.flows.place_of_birth.screen.a) iVarE3;
                aVar14.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                aVar14.C2(PlaceOfBirthFlowOutputData.DescriptionClicked.f105028a);
                return Unit.f186387a;
            case 13:
                Data data3 = (Data) this.v;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.user_declarations.shared.flows.place_of_birth.screen.a aVar16 = (com.revolut.feature.user_declarations.shared.flows.place_of_birth.screen.a) obj3;
                aVar16.H2(aVar16.u, new ood.k(data3, aVar16, i22));
                return Unit.f186387a;
            case 14:
                oph.b bVar2 = (oph.b) this.v;
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                oph.m mVar = (oph.m) ((ScreenerCollectionsPageScreen) obj3).S.getValue();
                ScreenerCollection collection = bVar2.f227661a;
                mVar.getClass();
                Intrinsics.checkNotNullParameter(collection, "collection");
                mVar.C1(new ScreenerCollectionDestination(collection.f105154a, null));
                return Unit.f186387a;
            case 15:
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                kli.c.c((View) this.v, false);
                oq5.i iVar = (oq5.i) ((CryptoAddressHostingAddProviderController) obj3).d();
                cli.y yVar = iVar.o;
                String string = d0.F0(((oq5.a) ((j2) yVar.f22677a).getValue()).f227741a).toString();
                String str = ((oq5.a) ((j2) yVar.f22677a).getValue()).f227742b;
                if (Intrinsics.f(str, "ADDRESS_HOSTING_ADD_PROVIDER_TYPE_WALLET_ID")) {
                    cryptoAddressHostingProviderType = CryptoAddressHostingProviderType.WALLET;
                } else {
                    if (!Intrinsics.f(str, "ADDRESS_HOSTING_ADD_PROVIDER_TYPE_EXCHANGE_ID")) {
                        throw new IllegalStateException("CryptoAddressHostingAddProviderContract.DomainState.selectedTypeId must be either ADDRESS_HOSTING_ADD_PROVIDER_TYPE_WALLET_ID or ADDRESS_HOSTING_ADD_PROVIDER_TYPE_EXCHANGE_ID");
                    }
                    cryptoAddressHostingProviderType = CryptoAddressHostingProviderType.EXCHANGE;
                }
                iVar.C2(new oq5.c(string, cryptoAddressHostingProviderType));
                return Unit.f186387a;
            case 16:
                Data data4 = (Data) this.v;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                t tVar = (t) obj3;
                tVar.H2(tVar.f227903s, new oph.k(data4, i6));
                return Unit.f186387a;
            case 17:
                Data data5 = (Data) this.v;
                fim.a aVar20 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.credit.card.impl.ui.documents_rates.a aVar21 = (com.revolut.feature.credit.card.impl.ui.documents_rates.a) obj3;
                aVar21.H2(aVar21.f69292t, new oph.k(data5, i22));
                return Unit.f186387a;
            case 18:
                String str2 = (String) this.v;
                fim.a aVar22 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                List list3 = (List) p.a.j(lr7.b.class, KTypeProjection.INSTANCE, List.class, ((or7.c) obj3).f228077c, j6.a.q("POLICY_DOCUMENTS_PREFIX_", str2));
                if (list3 != null) {
                    List<lr7.b> list4 = list3;
                    arrayList = new ArrayList(w.t(list4, 10));
                    for (lr7.b bVar3 : list4) {
                        Object obj5 = mr7.a.f208068a;
                        Intrinsics.checkNotNullParameter(bVar3, "<this>");
                        String strB = bVar3.getTitle();
                        List listA = bVar3.getDocuments();
                        ArrayList arrayList2 = new ArrayList(w.t(listA, 10));
                        Iterator it8 = listA.iterator();
                        while (it8.hasNext()) {
                            arrayList2.add(mr7.a.b((lr7.a) it8.next()));
                        }
                        arrayList.add(new DocumentsGroup(strB, arrayList2));
                    }
                }
                return arrayList;
            case 19:
                os9.k kVar2 = (os9.k) this.v;
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((u) obj3).x2(new oqk.c(kVar2, i3));
                return Unit.f186387a;
            case 20:
                ot1.c cVar = (ot1.c) this.v;
                fim.a aVar24 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((b0) obj3).x2(new oqk.c(cVar, 12));
                return Unit.f186387a;
            case 21:
                EtfDetailsFlowControllerContract$Page page = (EtfDetailsFlowControllerContract$Page) this.v;
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.retail.feature.stockdetails.impl.ui.flows.etf_details.a aVar26 = (com.revolut.retail.feature.stockdetails.impl.ui.flows.etf_details.a) ((EtfDetailsFlowController) obj3).e3();
                aVar26.getClass();
                Intrinsics.checkNotNullParameter(page, "page");
                aVar26.H2(aVar26.v, new oqk.c(page, i5));
                return Unit.f186387a;
            case 22:
                com.revolut.feature.apm.blik.impl.ui.flow.a aVar27 = (com.revolut.feature.apm.blik.impl.ui.flow.a) obj3;
                n1 n1Var2 = (n1) this.v;
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                if (n1Var2 instanceof l1) {
                    aVar27.C1(new ApmAliasClaimNavigation$Destination(new ApmAliasClaimNavigation$InputData(ApmBlik.f61809c, c12.a.LINK)));
                }
                aVar27.I2();
                return Unit.f186387a;
            case 23:
                String listId = (String) this.v;
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                FreelancerAcquiringOrderListScreen freelancerAcquiringOrderListScreen = (FreelancerAcquiringOrderListScreen) obj3;
                ou6.l lVarE3 = freelancerAcquiringOrderListScreen.e3();
                Intrinsics.h(listId);
                com.revolut.feature.freelancer.impl.ui.acquiring_order.list.a aVar30 = (com.revolut.feature.freelancer.impl.ui.acquiring_order.list.a) lVarE3;
                cli.y yVar2 = aVar30.f73703x;
                Intrinsics.checkNotNullParameter(listId, "listId");
                switch (listId.hashCode()) {
                    case -659174493:
                        if (listId.equals("MENU_NEW_SALE_LIST_ID")) {
                            oki.h.v2(aVar30.f73702w, FreelancerAcquiringOrderListScreenContract$ModalStep.NewSalePicker.f73695a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
                        }
                        break;
                    case 350265386:
                        if (listId.equals("MENU_PAYMENTS_LIST_ID")) {
                            aVar30.C1(new FreelancerBizFeatureConfig.AcquiringPayments(i33));
                        }
                        break;
                    case 930056101:
                        if (listId.equals("MENU_SEARCH_LIST_ID")) {
                            if (((ou6.h) ((j2) yVar2.f22677a).getValue()).f229830g) {
                                aVar30.H2(yVar2, new ou6.o(i32));
                            } else {
                                aVar30.H2(yVar2, new ou6.o(i6));
                            }
                        }
                        break;
                    case 1004126957:
                        if (listId.equals("MENU_CARD_READER_SETTINGS_LIST_ID")) {
                            aVar30.C1(CardReaderFlowDestination.CardReaderSettingsBridge.f60611b);
                        }
                        break;
                }
                if (listId.equals("MENU_SEARCH_LIST_ID")) {
                    freelancerAcquiringOrderListScreen.d3().f174539b.E0();
                    NavBarWithToolbar navBarWithToolbar = freelancerAcquiringOrderListScreen.d3().f174539b;
                    Intrinsics.checkNotNullExpressionValue(navBarWithToolbar, "navBarWithToolbar");
                    kli.c.f(navBarWithToolbar);
                }
                return Unit.f186387a;
            case 24:
                Data data6 = (Data) this.v;
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.coverage_details.b bVar4 = (com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.coverage_details.b) obj3;
                bVar4.H2(bVar4.f76110r, new oph.k(data6, i21));
                return Unit.f186387a;
            case 25:
                ty0.a aVar32 = (ty0.a) this.v;
                fim.a aVar33 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ow1.q qVarD3 = ((BrebQrRequestScreen) obj3).R2();
                String listId2 = aVar32.f275445a;
                qVarD3.getClass();
                Intrinsics.checkNotNullParameter(listId2, "listId");
                if (Intrinsics.f(listId2, "MODIFY_DETAILS_ID")) {
                    qVarD3.C2(ow1.j.f230262a);
                }
                return Unit.f186387a;
            case 26:
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.card_add_to_googlepay.impl.verification.confirmation.e eVar2 = (com.revolut.feature.card_add_to_googlepay.impl.verification.confirmation.e) this.v;
                String token = (String) obj3;
                x xVar = (x) eVar2.f64494p;
                xVar.getClass();
                Intrinsics.checkNotNullParameter(token, "token");
                return yji.l.a1(eVar2, rd0.e.b(rd0.e.c(xVar.f.v(token), kotlin.coroutines.g.f186406a)), null, null, new ow2.j(eVar2, r122, i33), 3);
            case 27:
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((com.revolut.feature.card_add_to_googlepay.impl.verification.confirmation.e) this.v).C2(new ow2.f((f0) obj3));
                return Unit.f186387a;
            case 28:
                n6 n6Var = (n6) this.v;
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ox2.b bVar5 = (ox2.b) ((CardPersonalisationInfoController) obj3).T.getValue();
                String tag2 = n6Var.f;
                bVar5.getClass();
                Intrinsics.checkNotNullParameter(tag2, "tag");
                if (Intrinsics.f(tag2, "UPGRADE_BUTTON_TAG")) {
                    e93.f fVar2 = bVar5.o.f64677a;
                    List list5 = (List) ((ox2.c) ((j2) bVar5.f230541q.f22677a).getValue()).f230544c.getContent();
                    if (list5 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    bVar5.C2(new hx2.e(fVar2, uj3.b.h(fVar2, list5)));
                }
                return Unit.f186387a;
            default:
                Pair pair2 = (Pair) this.v;
                fim.a aVar37 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ox2.b bVar6 = (ox2.b) obj3;
                bVar6.H2(bVar6.f230541q, new w0((Data) pair2.f186385a, (Data) pair2.f186386b, 5));
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f226423w = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Continuation continuation, yw4.p pVar) {
        super(2, continuation);
        this.u = 5;
        this.f226423w = pVar;
    }
}
