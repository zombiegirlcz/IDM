package le8;

import aw0.f4;
import aw0.o9;
import cjk.b;
import cli.y;
import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.ui_kit.delegates.g6;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.bills.billers.impl.ui.search.BillerSearchScreen;
import com.revolut.feature.apm.bills.bpay.impl.screen.input.InputScreen;
import com.revolut.feature.apm.wero.api.navigation.WeroNavigation$StartType;
import com.revolut.feature.apm.wero.impl.ui.pay.WeroPayFlow;
import com.revolut.feature.apm.wero.impl.ui.pay.WeroPayFlowContract$InputData;
import com.revolut.feature.apm.wero.impl.ui.pay.list.WeroRequestLinkListScreen;
import com.revolut.feature.contacts.impl.ui_kompot.add_contact.AddContactScreen;
import com.revolut.feature.credit.application.plugins.impl.ui.photo_upload.summary.PhotosUploadSummaryController;
import com.revolut.feature.credit.application.plugins.impl.ui.photo_upload.summary.PhotosUploadSummaryControllerContract$InputData;
import com.revolut.feature.credit.autopay.ui.screen.amount.select_type.SelectAmountTypeScreen;
import com.revolut.feature.external_accounts.impl.R$string;
import com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.OpenBankingBrazilPayment;
import com.revolut.feature.external_accounts.impl.mandate.update_limits.UpdateLimitsScreen;
import com.revolut.feature.external_accounts.impl.ui.consents_kompot.consent_details.ConsentDetailsScreen;
import com.revolut.feature.insurance.api.models.details.CFACInsuranceDetails;
import com.revolut.feature.insurance.api.navigation.CFACInsuranceFeatureConfig;
import com.revolut.feature.insurance.impl.ui.cfac.details.CFACInsuranceDetailsScreen;
import com.revolut.feature.insurance_embedded.api.navigation.InsuranceEmbeddedDestinations;
import com.revolut.feature.payments.air.widget.impl.model.PaymentWidget;
import com.revolut.feature.terms.api.model.TermsScope;
import com.revolut.feature.travel.miles.impl.ui.screen.search.location_picker.TravelMilesFlightLocationPickerScreen;
import com.revolut.feature.view.image.api.navigation.ViewImageDestination;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_switch.kompot.PlanSwitchToAnnualScreen;
import gim.i;
import io.reactivex.exceptions.CompositeException;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jh2.n;
import k37.t;
import kl7.s1;
import kl7.w1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import kotlinx.coroutines.CoroutineScope;
import l9k.v;
import lf6.j;
import lg4.s;
import lh9.r;
import li2.g;
import lk6.b0;
import lk6.p;
import lk7.l;
import ll7.h;
import ll7.i0;
import ll7.u;
import lol.k;
import lp6.m;
import mii.q;
import nf6.e;
import nii.y0;
import nii.z;
import retrofit2.HttpException;
import skm.a2;
import vkm.j2;
import yhm.o;
import zh9.u0;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class d extends i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f194513w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f194513w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d((com.revolut.feature.junior_coparent.impl.ui.invitation.b) this.f194513w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            case 1:
                d dVar2 = new d((j) this.f194513w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
            case 2:
                d dVar3 = new d((PhotosUploadSummaryController) this.f194513w, continuation, 2);
                dVar3.v = obj2;
                return dVar3;
            case 3:
                d dVar4 = new d((s) this.f194513w, continuation, 3);
                dVar4.v = obj2;
                return dVar4;
            case 4:
                d dVar5 = new d((UpdateLimitsScreen) this.f194513w, continuation, 4);
                dVar5.v = obj2;
                return dVar5;
            case 5:
                d dVar6 = new d((com.revolut.feature.external_accounts.impl.mandate.update_limits.a) this.f194513w, continuation, 5);
                dVar6.v = obj2;
                return dVar6;
            case 6:
                d dVar7 = new d((r) this.f194513w, continuation, 6);
                dVar7.v = obj2;
                return dVar7;
            case 7:
                d dVar8 = new d((WeroRequestLinkListScreen) this.f194513w, continuation, 7);
                dVar8.v = obj2;
                return dVar8;
            case 8:
                d dVar9 = new d((g) this.f194513w, continuation, 8);
                dVar9.v = obj2;
                return dVar9;
            case 9:
                d dVar10 = new d((TravelMilesFlightLocationPickerScreen) this.f194513w, continuation, 9);
                dVar10.v = obj2;
                return dVar10;
            case 10:
                d dVar11 = new d((SelectAmountTypeScreen) this.f194513w, continuation, 10);
                dVar11.v = obj2;
                return dVar11;
            case 11:
                d dVar12 = new d((b0) this.f194513w, continuation, 11);
                dVar12.v = obj2;
                return dVar12;
            case 12:
                d dVar13 = new d((CFACInsuranceDetailsScreen) this.f194513w, continuation, 12);
                dVar13.v = obj2;
                return dVar13;
            case 13:
                d dVar14 = new d((l) this.f194513w, continuation, 13);
                dVar14.v = obj2;
                return dVar14;
            case 14:
                d dVar15 = new d((ConsentDetailsScreen) this.f194513w, continuation, 14);
                dVar15.v = obj2;
                return dVar15;
            case 15:
                d dVar16 = new d((com.revolut.feature.external_accounts.impl.ui.consents_kompot.consent_details.a) this.f194513w, continuation, 15);
                dVar16.v = obj2;
                return dVar16;
            case 16:
                d dVar17 = new d((h) this.f194513w, continuation, 16);
                dVar17.v = obj2;
                return dVar17;
            case 17:
                return new d((List) this.v, (ll7.l) this.f194513w, continuation);
            case 18:
                d dVar18 = new d((u) this.f194513w, continuation, 18);
                dVar18.v = obj2;
                return dVar18;
            case 19:
                d dVar19 = new d((i0) this.f194513w, continuation, 19);
                dVar19.v = obj2;
                return dVar19;
            case 20:
                d dVar20 = new d((llb.f) this.f194513w, continuation, 20);
                dVar20.v = obj2;
                return dVar20;
            case 21:
                d dVar21 = new d((lld.b) this.f194513w, continuation, 21);
                dVar21.v = obj2;
                return dVar21;
            case 22:
                d dVar22 = new d((BillerSearchScreen) this.f194513w, continuation, 22);
                dVar22.v = obj2;
                return dVar22;
            case 23:
                d dVar23 = new d((AddContactScreen) this.f194513w, continuation, 23);
                dVar23.v = obj2;
                return dVar23;
            case 24:
                d dVar24 = new d((lnc.f) this.f194513w, continuation, 24);
                dVar24.v = obj2;
                return dVar24;
            case 25:
                d dVar25 = new d((PlanSwitchToAnnualScreen) this.f194513w, continuation, 25);
                dVar25.v = obj2;
                return dVar25;
            case 26:
                d dVar26 = new d((InputScreen) this.f194513w, continuation, 26);
                dVar26.v = obj2;
                return dVar26;
            case 27:
                d dVar27 = new d((lo9.e) this.f194513w, continuation, 27);
                dVar27.v = obj2;
                return dVar27;
            case 28:
                d dVar28 = new d((k) this.f194513w, continuation, 28);
                dVar28.v = obj2;
                return dVar28;
            default:
                d dVar29 = new d((m) this.f194513w, continuation, 29);
                dVar29.v = obj2;
                return dVar29;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((d) create((q) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((d) create((yx4.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((d) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((d) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((d) create((e7l.f) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((d) create((lh9.j) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((d) create((n) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((d) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((d) create((ak4.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((d) create((Throwable) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((d) create((Boolean) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((d) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((d) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((d) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((d) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((d) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((d) create((g6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((d) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((d) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((d) create((f4) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((d) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((d) create((tll.m) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((d) create((lp6.d) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v23, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v31, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v52, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v59, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v53, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        dj0.d dVar;
        Object next;
        HttpException httpException;
        ServerError serverErrorC;
        p pVar;
        int i = this.u;
        int i2 = 19;
        int i3 = 24;
        boolean z = true;
        boolean z3 = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        int i5 = 26;
        int i6 = 29;
        Object[] objArr6 = 0;
        Object[] objArr7 = 0;
        Object[] objArr8 = 0;
        Object[] objArr9 = 0;
        Object[] objArr10 = 0;
        Object obj3 = this.f194513w;
        switch (i) {
            case 0:
                q qVar = (q) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                if (!(qVar instanceof mii.m) && !(qVar instanceof mii.p)) {
                    if (!(qVar instanceof mii.n)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oki.h.D2(((com.revolut.feature.junior_coparent.impl.ui.invitation.b) obj3).f76893s);
                }
                return Unit.f186387a;
            case 1:
                String str = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                nf6.e eVar = (nf6.e) j6.a.k(nf6.e.class, ((j) obj3).f194654c, j6.a.q("CONSENTS_STORAGE_KEY", str));
                if (eVar == null) {
                    return null;
                }
                Intrinsics.checkNotNullParameter(eVar, "<this>");
                String strA = eVar.getConsentId();
                String strB = eVar.getFromPocketId();
                e.b bVarC = eVar.getPaymentAmount();
                if (bVarC != null) {
                    long jA = bVarC.getAmount();
                    xi0.a aVar3 = xi0.b.Companion;
                    String strB2 = bVarC.getCurrency();
                    aVar3.getClass();
                    dVar = new dj0.d(jA, xi0.a.a(strB2));
                } else {
                    dVar = null;
                }
                e.f fVarD = eVar.getPaymentInformation();
                Intrinsics.checkNotNullParameter(fVarD, "<this>");
                List listA = fVarD.getGroups();
                ArrayList arrayList = new ArrayList(w.t(listA, 10));
                Iterator it8 = listA.iterator();
                while (it8.hasNext()) {
                    List<e.C1204e> listA2 = ((e.d) it8.next()).getItems();
                    ArrayList arrayList2 = new ArrayList(w.t(listA2, 10));
                    for (e.C1204e c1204e : listA2) {
                        arrayList2.add(new OpenBankingBrazilPayment.Item(c1204e.getTitle(), c1204e.getValue(), null, null));
                    }
                    arrayList.add(new OpenBankingBrazilPayment.InfoGroup(arrayList2));
                }
                return new com.revolut.feature.external_accounts.impl.domain.open_banking_brazil.c(strA, strB, dVar, new OpenBankingBrazilPayment.PaymentInformation(arrayList), eVar.getPaymentNotificationsEnabled(), foh.i.y(eVar.getThirdParty()));
            case 2:
                yx4.b clickWrapper = (yx4.b) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                s sVar = (s) ((lg4.j) ((PhotosUploadSummaryController) obj3).R.getValue());
                PhotosUploadSummaryControllerContract$InputData photosUploadSummaryControllerContract$InputData = sVar.o;
                Intrinsics.checkNotNullParameter(clickWrapper, "clickWrapper");
                Object obj4 = clickWrapper.f317545b;
                if (obj4 instanceof lg4.q) {
                    sVar.C1(new ViewImageDestination(new ViewImageDestination.InputData.Local(((lg4.q) obj4).f195059a.f258207a)));
                } else if (!(obj4 instanceof lg4.h)) {
                    String str2 = clickWrapper.f317544a;
                    switch (str2.hashCode()) {
                        case -1664276849:
                            if (str2.equals("TOOLBAR_BACK_ID")) {
                                sVar.C2(lg4.l.f195053a);
                            }
                            break;
                        case -643313316:
                            if (str2.equals("ADD_PHOTO_ITEM_ID")) {
                                sVar.C2(lg4.k.f195052a);
                            }
                            break;
                        case 1898667146:
                            if (str2.equals("UPLOAD_BUTTON_ID")) {
                                sVar.C2(new lg4.o(((lg4.i) ((j2) sVar.f195064q.f22677a).getValue()).f195051a, photosUploadSummaryControllerContract$InputData.f68204b.e));
                            }
                            break;
                        case 2010199411:
                            if (str2.equals("REQUIREMENTS_SUBTITLE_ID")) {
                                sVar.C2(new lg4.n(photosUploadSummaryControllerContract$InputData.f68204b.f19920b.f19917c));
                            }
                            break;
                    }
                } else {
                    ry3.a aVar5 = ((lg4.h) obj4).f195050a;
                    bz3.c cVar = photosUploadSummaryControllerContract$InputData.f68204b.f;
                    String path = aVar5.f258207a.getPath();
                    Intrinsics.checkNotNullExpressionValue(path, "getPath(...)");
                    sVar.C2(new lg4.m(cVar, path));
                }
                return Unit.f186387a;
            case 3:
                List list = (List) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                s sVar2 = (s) obj3;
                sVar2.H2(sVar2.f195064q, new t(list, i3));
                return Unit.f186387a;
            case 4:
                ty0.a aVar7 = (ty0.a) this.v;
                fim.a aVar8 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                lh6.i iVarE3 = ((UpdateLimitsScreen) obj3).e3();
                String url2 = aVar7.f275445a;
                com.revolut.feature.external_accounts.impl.mandate.update_limits.a aVar9 = (com.revolut.feature.external_accounts.impl.mandate.update_limits.a) iVarE3;
                aVar9.getClass();
                Intrinsics.checkNotNullParameter(url2, "url");
                BridgeDestination bridgeDestinationA = aVar9.f72472q.a(url2);
                if (bridgeDestinationA != null) {
                    aVar9.C1(bridgeDestinationA);
                }
                return Unit.f186387a;
            case 5:
                e7l.f fVar = (e7l.f) this.v;
                fim.a aVar10 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.external_accounts.impl.mandate.update_limits.a aVar11 = (com.revolut.feature.external_accounts.impl.mandate.update_limits.a) obj3;
                aVar11.H2(aVar11.f72475t, new lh6.k(fVar, objArr == true ? 1 : 0));
                return Unit.f186387a;
            case 6:
                lh9.j jVar = (lh9.j) this.v;
                fim.a aVar12 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                r rVar = (r) obj3;
                rVar.H2(rVar.f195193s, new laj.b(jVar, i2));
                return Unit.f186387a;
            case 7:
                n request = (n) this.v;
                fim.a aVar13 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                li2.c cVar2 = (li2.c) ((WeroRequestLinkListScreen) obj3).Q.getValue();
                Intrinsics.h(request);
                g gVar = (g) cVar2;
                gVar.getClass();
                Intrinsics.checkNotNullParameter(request, "request");
                yji.l.j2(gVar, new WeroPayFlow(new WeroPayFlowContract$InputData(new WeroNavigation$StartType.Pay.RequestLinkDetails(request.f174130a))), null, null, 3);
                return Unit.f186387a;
            case 8:
                Data data = (Data) this.v;
                fim.a aVar14 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                g gVar2 = (g) obj3;
                gVar2.H2(gVar2.f195410p, new l7j.t(data, 18));
                return Unit.f186387a;
            case 9:
                String newQuery = (String) this.v;
                fim.a aVar15 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                lig.p pVar2 = (lig.p) ((TravelMilesFlightLocationPickerScreen) obj3).e3();
                pVar2.getClass();
                Intrinsics.checkNotNullParameter(newQuery, "newQuery");
                y yVar = pVar2.f195525t;
                if (!Intrinsics.f(((lig.g) ((j2) yVar.f22677a).getValue()).f195508a, newQuery)) {
                    pVar2.H2(yVar, new l3d.a(newQuery, 16));
                    if (newQuery.length() >= 3) {
                        a2 a2Var = pVar2.f195524s;
                        if (a2Var != null) {
                            a2Var.f(null);
                        }
                        pVar2.f195524s = pVar2.l2(new kze.h(pVar2, objArr6 == true ? 1 : 0, i2), new yi5.b(i5));
                    }
                }
                return Unit.f186387a;
            case 10:
                ak4.a amountType = (ak4.a) this.v;
                fim.a aVar16 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                lk4.h hVar = (lk4.h) ((SelectAmountTypeScreen) obj3).f68615a0.getValue();
                Intrinsics.h(amountType);
                hVar.getClass();
                Intrinsics.checkNotNullParameter(amountType, "amountType");
                hVar.x2(new lk4.g(amountType, objArr2 == true ? 1 : 0));
                return Unit.f186387a;
            case 11:
                Throwable th10 = (Throwable) this.v;
                fim.a aVar17 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                b0 b0Var = (b0) obj3;
                if (!(th10 instanceof HttpException)) {
                    if (th10 instanceof CompositeException) {
                        List list2 = ((CompositeException) th10).f163108a;
                        Intrinsics.checkNotNullExpressionValue(list2, "getExceptions(...)");
                        Iterator it9 = list2.iterator();
                        while (true) {
                            if (it9.hasNext()) {
                                next = it9.next();
                                if (next instanceof HttpException) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        if (!(next instanceof HttpException)) {
                            next = null;
                        }
                        httpException = (HttpException) next;
                    }
                    z = false;
                    return Boolean.valueOf(z);
                }
                httpException = (HttpException) th10;
                if (httpException == null || (serverErrorC = b0Var.f196231q.c(httpException)) == null || serverErrorC.f51362a != 110903) {
                    z = false;
                } else {
                    pg6.a aVarJ = b0Var.f196232r.j(httpException);
                    if (aVarJ != null) {
                        TextClause textClause = new TextClause(aVarJ.getTitle(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                        String strA2 = aVarJ.getMessage();
                        pVar = new p(textClause, strA2 != null ? new TextClause(strA2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : null, aVarJ.getRedirectUri());
                    } else {
                        pVar = new p(new TextLocalisedClause(R$string.open_finance_payment_authorization_payment_fetch_error_title, null, null, 14), new TextLocalisedClause(R$string.open_finance_payment_authorization_payment_fetch_error_subtitle, null, null, 14), null);
                    }
                    b0Var.C2(pVar);
                }
                return Boolean.valueOf(z);
            case 12:
                Boolean bool = (Boolean) this.v;
                fim.a aVar18 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                lk7.j jVar2 = (lk7.j) ((CFACInsuranceDetailsScreen) obj3).Y.getValue();
                Intrinsics.h(bool);
                boolean zBooleanValue = bool.booleanValue();
                l lVar = (l) jVar2;
                CFACInsuranceDetails cFACInsuranceDetails = (CFACInsuranceDetails) ((lk7.g) lVar.t2()).f196275a.getContent();
                if (cFACInsuranceDetails != null) {
                    lVar.C1(new CFACInsuranceFeatureConfig.MakeClaimDestination(cFACInsuranceDetails, lVar.f196284p.f75122b, zBooleanValue));
                }
                return Unit.f186387a;
            case 13:
                Data data2 = (Data) this.v;
                fim.a aVar19 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((l) obj3).x2(new l7j.t(data2, 25));
                return Unit.f186387a;
            case 14:
                ty0.a aVar20 = (ty0.a) this.v;
                fim.a aVar21 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ll6.g gVar3 = (ll6.g) ((ConsentDetailsScreen) obj3).R.getValue();
                String id10 = aVar20.f275445a;
                com.revolut.feature.external_accounts.impl.ui.consents_kompot.consent_details.a aVar22 = (com.revolut.feature.external_accounts.impl.ui.consents_kompot.consent_details.a) gVar3;
                aVar22.getClass();
                Intrinsics.checkNotNullParameter(id10, "id");
                if (Intrinsics.f(id10, "CDR_POLICY_CLICK_ID")) {
                    aVar22.C1(new ExternalDestination.Browser("https://www.revolut.com/en-AU/legal/cdrpolicy", null));
                }
                return Unit.f186387a;
            case 15:
                Pair pair = (Pair) this.v;
                fim.a aVar23 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                com.revolut.feature.external_accounts.impl.ui.consents_kompot.consent_details.a aVar24 = (com.revolut.feature.external_accounts.impl.ui.consents_kompot.consent_details.a) obj3;
                aVar24.H2(aVar24.f72777r, new v((fi6.d) pair.f186385a, (Map) pair.f186386b, i3));
                return Unit.f186387a;
            case 16:
                String str3 = (String) this.v;
                fim.a aVar25 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                hl7.i iVar = (hl7.i) j6.a.k(hl7.i.class, ((h) obj3).f196633c, j6.a.q("RENEWAL_APPLICATION_FORM_", str3));
                if (iVar != null) {
                    return jl7.c.a(iVar);
                }
                return null;
            case 17:
                fim.a aVar26 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ll7.l lVar2 = (ll7.l) obj3;
                for (File file : (List) this.v) {
                    if (lim.o.q(file, lVar2.f196643b)) {
                        file.delete();
                    }
                }
                return Unit.f186387a;
            case 18:
                String str4 = (String) this.v;
                fim.a aVar27 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((u) obj3).f196660b.remove("PLANS_" + str4);
                return Unit.f186387a;
            case 19:
                Pair pair2 = (Pair) this.v;
                fim.a aVar28 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                String str5 = (String) pair2.f186385a;
                w1 w1Var = (w1) pair2.f186386b;
                return p.a.j(s1.class, KTypeProjection.INSTANCE, List.class, ((i0) obj3).f196638c, "KEY_QUESTIONNAIRE_" + w1Var + "_" + str5);
            case 20:
                Data data3 = (Data) this.v;
                fim.a aVar29 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                llb.f fVar2 = (llb.f) obj3;
                fVar2.H2(fVar2.f196698q, new l7j.t(data3, 27));
                return Unit.f186387a;
            case 21:
                String str6 = (String) this.v;
                fim.a aVar30 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                lld.b bVar = (lld.b) obj3;
                bVar.f196711p = true;
                bVar.f196708l.S(str6);
                return Unit.f186387a;
            case 22:
                String query = (String) this.v;
                fim.a aVar31 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                lm1.j jVarE3 = ((BillerSearchScreen) obj3).e3();
                Intrinsics.h(query);
                jVarE3.getClass();
                Intrinsics.checkNotNullParameter(query, "query");
                j2 j2Var = jVarE3.f196861p;
                j2Var.getClass();
                j2Var.g(null, query);
                return Unit.f186387a;
            case 23:
                g6 model = (g6) this.v;
                fim.a aVar32 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                lm3.b bVarE3 = ((AddContactScreen) obj3).e3();
                Intrinsics.h(model);
                com.revolut.feature.contacts.impl.ui_kompot.add_contact.a aVar33 = (com.revolut.feature.contacts.impl.ui_kompot.add_contact.a) bVarE3;
                aVar33.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                aVar33.H2(aVar33.f66025x, new l3d.a(model.f54199a, 23));
                return Unit.f186387a;
            case 24:
                Data data4 = (Data) this.v;
                fim.a aVar34 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((lnc.f) obj3).x2(new l7j.t(data4, 28));
                return Unit.f186387a;
            case 25:
                Pair pair3 = (Pair) this.v;
                fim.a aVar35 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                String id11 = (String) pair3.f186385a;
                Object obj5 = pair3.f186386b;
                lnk.n nVar = (lnk.n) ((lnk.i) ((PlanSwitchToAnnualScreen) obj3).O.getValue());
                nVar.getClass();
                lnk.f fVar3 = nVar.f197307t;
                jgk.v vVar = nVar.f197304q;
                Intrinsics.checkNotNullParameter(id11, "id");
                b.AbstractC0155b abstractC0155b = obj5 instanceof b.AbstractC0155b ? (b.AbstractC0155b) obj5 : null;
                if (abstractC0155b != null) {
                    int i21 = 13;
                    if (abstractC0155b.equals(b.AbstractC0155b.C0156b.f24699a)) {
                        TermsScope.INSTANCE.getClass();
                        nVar.l2(new ll6.i(nVar, TermsScope.Q, objArr10 == true ? 1 : 0, i21), new yi5.b(i5));
                    } else if (abstractC0155b.equals(b.AbstractC0155b.a.f24698a)) {
                        TermsScope.INSTANCE.getClass();
                        nVar.l2(new ll6.i(nVar, TermsScope.P, objArr9 == true ? 1 : 0, i21), new yi5.b(i5));
                    } else if (abstractC0155b instanceof cjk.c) {
                        hha.d plan = fVar3.f197294a;
                        ((jjk.c) vVar).getClass();
                        Intrinsics.checkNotNullParameter(plan, "plan");
                        nVar.C1(u0.b(u0.f(new InsuranceEmbeddedDestinations.InsuranceDocumentsReview(plan.f152287a))));
                    } else {
                        if (!abstractC0155b.equals(b.AbstractC0155b.c.f24700a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        nVar.l2(new kze.h(nVar, objArr8 == true ? 1 : 0, i6), new yi5.b(i5));
                    }
                } else {
                    int iHashCode = id11.hashCode();
                    if (iHashCode != -1619115367) {
                        if (iHashCode != -654631745) {
                            if (iHashCode == 1619886170 && id11.equals("ID_PRICING_PLAN_FOOTER_GENERAL_TERMS_AND_CONDITIONS")) {
                                nVar.l2(new kze.h(nVar, objArr7 == true ? 1 : 0, i6), new yi5.b(i5));
                            }
                        } else if (id11.equals("ID_PRICING_PLAN_FOOTER_PROMOTION_TERMS_AND_CONDITIONS")) {
                            FeatureCommand featureCommandC = ((jjk.c) vVar).c(fVar3.f197294a);
                            if (featureCommandC != null) {
                                nVar.C1(u0.b(featureCommandC));
                            }
                        }
                    } else if (id11.equals("ID_PRICING_PLAN_FOOTER_INSURANCE_COVERAGE_POLICY")) {
                        hha.d plan2 = fVar3.f197294a;
                        ((jjk.c) vVar).getClass();
                        Intrinsics.checkNotNullParameter(plan2, "plan");
                        nVar.C1(u0.b(u0.f(new InsuranceEmbeddedDestinations.InsuranceDocumentsReview(plan2.f152287a))));
                    }
                }
                return Unit.f186387a;
            case 26:
                f4 f4Var = (f4) this.v;
                fim.a aVar36 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ((InputScreen) obj3).R2().I2(new lo1.i(f4Var.f10303a, f4Var.f10304b));
                return Unit.f186387a;
            case 27:
                String widgetId = (String) this.v;
                fim.a aVar37 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                lo9.b bVar2 = ((lo9.e) obj3).f197426b;
                Intrinsics.checkNotNullParameter(widgetId, "widgetId");
                ue0.c cVar3 = bVar2.f197422b;
                lo9.b.Companion.getClass();
                return (PaymentWidget) j6.a.k(PaymentWidget.class, cVar3, lo9.a.a(widgetId));
            case 28:
                k kVar = (k) obj3;
                jol.b bVar3 = kVar.f197476q;
                tll.m mVar = (tll.m) this.v;
                fim.a aVar38 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                if (mVar instanceof tll.g) {
                    kVar.x2(new jck.y(z3, i6));
                } else if (mVar instanceof tll.h) {
                    kVar.x2(new loc.a(5));
                    yji.l.a1(kVar, kVar.X1(((jol.c) bVar3).e("PASSWORD_SCREEN_ID_ERROR_DIALOG")), null, null, null, 7);
                    kVar.x2(new jck.y(objArr5 == true ? 1 : 0, i6));
                } else if (mVar instanceof tll.i) {
                    kVar.x2(new loc.a(4));
                    ((jol.c) bVar3).getClass();
                    Intrinsics.checkNotNullParameter("PASSWORD_SCREEN_ID_ERROR_DIALOG", "dialogId");
                    yji.l.a1(kVar, kVar.X1(new y0("PASSWORD_SCREEN_ID_ERROR_DIALOG", new z(new TextLocalisedClause(com.revolut.sso.api.R$string.revolut_sso_login_incorrect_password_title, null, null, 14), new TextLocalisedClause(com.revolut.sso.api.R$string.revolut_sso_login_incorrect_password_description, null, null, 14), null, null, null, null, true, null, null, null, null, null, null, 32508), false, 4)), null, null, null, 7);
                    kVar.x2(new jck.y(objArr4 == true ? 1 : 0, i6));
                } else if (mVar instanceof tll.j) {
                    kVar.x2(new jck.y(z, i6));
                } else {
                    if (!(mVar instanceof tll.k) && !(mVar instanceof tll.l)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    kVar.x2(new jck.y(objArr3 == true ? 1 : 0, i6));
                }
                return Unit.f186387a;
            default:
                lp6.d dVar2 = (lp6.d) this.v;
                fim.a aVar39 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ue0.c cVar4 = ((m) obj3).f198951c;
                lp6.c cVar5 = m.Companion;
                String strB3 = dVar2.f198931a.b();
                String str7 = dVar2.f198932b;
                cVar5.getClass();
                hp6.b bVar4 = (hp6.b) j6.a.k(hp6.b.class, cVar4, lp6.c.a(strB3, str7));
                if (bVar4 != null) {
                    return jp6.a.b(bVar4);
                }
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(List list, ll7.l lVar, Continuation continuation) {
        super(2, continuation);
        this.u = 17;
        this.v = list;
        this.f194513w = lVar;
    }
}
