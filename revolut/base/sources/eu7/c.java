package eu7;

import androidx.camera.core.impl.utils.MappingRedirectableLiveData;
import bu7.b0;
import bu7.c0;
import bu7.e0;
import bu7.g0;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.card_add_to_googlepay.api.NavigationIconConfig;
import com.revolut.feature.freelancer.impl.ui.acquiring_payment.flow.FreelancerAcquiringPaymentFlowContract$Step;
import com.revolut.feature.insurance_embedded.api.models.RemoteDocument;
import com.revolut.feature.insurance_pet.impl.R$string;
import com.revolut.feature.selfserve.entity.config.shared.ui.home.EntityHomeScreenContract$InputData;
import com.revolut.feature_autoinvest_ui_api.navigation.AutoInvestMoveControllerApi$Result;
import com.revolut.retail.core.navigation.FinishFlowCommand;
import com.revolut.retail.feature.airport.security_fast_track.api.model.AsftTimeSlot;
import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import com.revolut.ui.activity.container.ContainerActivity;
import com.revolut.uicomponent.widgets.chip.ChipGroupView;
import efm.d0;
import eul.h;
import ev4.f;
import ev4.g;
import ew2.k;
import ew2.r0;
import ew2.v0;
import ew4.q;
import ew4.t;
import ew4.v;
import ew4.z;
import ewh.a0;
import eyc.n;
import eyc.r;
import fv6.i;
import fv6.j;
import h93.f0;
import ip0.nb0;
import ip0.pb0;
import ir2.d;
import ir2.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kx7.y0;
import org.joda.time.LocalDate;
import p1c.c;
import pfm.m;
import til.o;
import til.p;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f129528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f129529b;

    public /* synthetic */ c(r rVar, n nVar) {
        this.f129528a = 18;
        this.f129529b = nVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [bu7.g0[], java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v29, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v33 */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Data data;
        f fVar;
        Object next;
        int i = this.f129528a;
        m mVar = m.f235744a;
        int i2 = 7;
        int i3 = 5;
        int i5 = 2;
        int i6 = 0;
        Object obj3 = this.f129529b;
        switch (i) {
            case 0:
                b0 it8 = (b0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                ((e) obj3).getClass();
                com.revolut.feature.insurance_embedded.api.models.b bVar = it8.k;
                RemoteDocument remoteDocument = bVar.f75850c;
                if (remoteDocument != null) {
                    return u.c(e.a(remoteDocument, c0.GUIDE_TO_BENEFIT, false));
                }
                List list = it8.f18699l;
                RemoteDocument remoteDocument2 = bVar.f75849b;
                g0 g0VarA = remoteDocument2 != null ? e.a(remoteDocument2, c0.INSURANCE_POLICY, false) : null;
                RemoteDocument remoteDocument3 = bVar.f;
                g0 g0VarA2 = remoteDocument3 != null ? e.a(remoteDocument3, c0.INSURANCE_STATEMENT, true) : null;
                RemoteDocument remoteDocument4 = bVar.f75848a;
                g0 g0VarA3 = remoteDocument4 != null ? e.a(remoteDocument4, c0.POLICY_WORDING, false) : null;
                e0 e0Var = !list.isEmpty() ? new e0(c0.SUITABILITY_STATEMENT, list) : null;
                RemoteDocument remoteDocument5 = bVar.d;
                ?? elements = {g0VarA, g0VarA2, g0VarA3, e0Var, remoteDocument5 != null ? e.a(remoteDocument5, c0.CLAIMS_ELIGIBILITY_STATEMENT, false) : 0};
                Intrinsics.checkNotNullParameter(elements, "elements");
                return kotlin.collections.d.L(elements);
            case 1:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return u.c(((h) obj3).a());
            case 2:
                ll4.c0 c0Var = (ll4.c0) obj3;
                g updateState = (g) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                Data data2 = updateState.f129710b;
                try {
                    Object content = data2.getContent();
                    if (content != null) {
                        f fVar2 = (f) content;
                        String facilityId = fVar2.f129706a;
                        xi0.b currency = fVar2.f129707b;
                        List statements = fVar2.d;
                        wi0.b countryCode = fVar2.e;
                        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
                        Intrinsics.checkNotNullParameter(currency, "currency");
                        Intrinsics.checkNotNullParameter(statements, "statements");
                        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
                        fVar = new f(facilityId, currency, c0Var, statements, countryCode);
                    } else {
                        fVar = null;
                    }
                    data = new Data(fVar, data2.getError(), data2.getLoading());
                    break;
                } catch (Throwable th10) {
                    data = new Data(null, th10, data2.getLoading());
                }
                return g.a(updateState, null, data, 1);
            case 3:
                com.revolut.feature.freelancer.impl.ui.acquiring_payment.flow.a aVar = (com.revolut.feature.freelancer.impl.ui.acquiring_payment.flow.a) obj3;
                j result = (j) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (Intrinsics.f(result, fv6.h.f138362a)) {
                    oki.h.D2(aVar.o);
                } else {
                    if (!(result instanceof i)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    oki.h.t2(aVar, aVar.o, new FreelancerAcquiringPaymentFlowContract$Step.PaymentDetails(((i) result).f138363a), false, null, false, 14);
                }
                return Unit.f186387a;
            case 4:
                ev7.i iVar = (ev7.i) obj3;
                f9i.c request = (f9i.c) obj2;
                Intrinsics.checkNotNullParameter(request, "request");
                iVar.A1(new esa.i(iVar, request, , i3), new yi5.b(25));
                return Unit.f186387a;
            case 5:
                eve.a key = (eve.a) obj2;
                Intrinsics.checkNotNullParameter(key, "key");
                ne0.j jVar = ((eve.b) obj3).d;
                String str = key.f129779a;
                yte.n nVar = key.f129780b;
                if (nVar == null) {
                    nVar = yte.n.CURRENT;
                }
                return (List) jVar.get("COUNTRY_LIMITS_MEMORY_KEY_" + str + "_" + nVar);
            case 6:
                evi.d update = (evi.d) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return evi.d.a(update, null, (AsftTimeSlot) obj3, 3);
            case 7:
                ew1.m mVar2 = (ew1.m) obj3;
                dii.g result2 = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (result2 instanceof dii.e) {
                    mVar2.l2(new esa.i(mVar2, mVar2.o, , i2), new eif.c(1, mVar2, ew1.m.class, "handleGenericOperationError", "handleGenericOperationError(Ljava/lang/Throwable;)Z", 0, 24));
                } else {
                    int i21 = jli.h.f175850a;
                }
                return Unit.f186387a;
            case 8:
                k kVar = (k) obj3;
                f0 card = (f0) obj2;
                Intrinsics.checkNotNullParameter(card, "card");
                l93.b bVar2 = kVar.f130023c;
                String cardId = card.f150110a;
                ha3.j jVar2 = (ha3.j) bVar2;
                jVar2.getClass();
                Intrinsics.checkNotNullParameter(cardId, "cardId");
                d0 d0VarG = jVar2.f150410a.p(cardId).D(card).g(sjg.a.a(kVar.d));
                Intrinsics.checkNotNullExpressionValue(d0VarG, "compose(...)");
                return d0VarG;
            case 9:
                com.revolut.feature.card_add_to_googlepay.impl.a aVar2 = (com.revolut.feature.card_add_to_googlepay.impl.a) obj3;
                dii.g result3 = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(result3, "result");
                if (result3 instanceof dii.e) {
                    aVar2.l2(new r0(aVar2, , i5), new yi5.b(26));
                } else if (result3 instanceof dii.f) {
                    aVar2.K2(aVar2.o.d);
                }
                return Unit.f186387a;
            case 10:
                v0 v0Var = (v0) obj3;
                od0.i configOptional = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(configOptional, "configOptional");
                return configOptional.d() ? ((ln.a) v0Var.f130061b).a(((NavigationIconConfig) configOptional.c()).f64437b) : mVar;
            case 11:
                com.revolut.feature.credit.card.impl.ui.statement_financing.details.a aVar3 = (com.revolut.feature.credit.card.impl.ui.statement_financing.details.a) obj3;
                zx4.d result4 = (zx4.d) obj2;
                Intrinsics.checkNotNullParameter(result4, "result");
                if (result4 instanceof zx4.b) {
                    aVar3.l2(new v(aVar3, , i6), new yi5.b(26));
                }
                return Unit.f186387a;
            case 12:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                return new t(((z) obj3).f130091a.f69748c ? q.f130085a : ew4.m.f130082a, yr4.a.a());
            case 13:
                com.revolut.feature.topup_screen.impl.flow.external_card_details.e eVar = (com.revolut.feature.topup_screen.impl.flow.external_card_details.e) obj3;
                til.r output = (til.r) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                if (output instanceof til.q) {
                    ewe.b bVar3 = eVar.f90617w;
                    bVar3.getClass();
                    ewe.a result5 = ewe.a.f130166a;
                    Intrinsics.checkNotNullParameter(result5, "result");
                    bVar3.f130167a.k(result5);
                } else if (!(output instanceof til.n) && !(output instanceof o) && !(output instanceof p)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            case 14:
                ewh.v vVar = (ewh.v) obj3;
                if (((p1c.c) obj2) instanceof c.a) {
                    vVar.C2(new AutoInvestMoveControllerApi$Result.Move(vVar.o.f96624a));
                }
                return Unit.f186387a;
            case 15:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                ((ewh.e) ((a0) obj3).f130263a).getClass();
                pb0 pb0VarA = nb0.a(pb0.Companion, "ACCOUNT_ITEM_ID", false, 6);
                yp0.b.l(pb0VarA, 0, 0, 0, 0, null, false, 63);
                return pb0VarA;
            case 16:
                ContainerActivity.Companion companion = ContainerActivity.INSTANCE;
                ewl.i iVar2 = (ewl.i) ((ContainerActivity) obj3).f218652a0;
                if (iVar2 != null) {
                    ((hqi.a) iVar2.i).d.onNext(new Object());
                }
                return Unit.f186387a;
            case 17:
                return ex2.c.a((ex2.c) obj2, false, (ex2.f) obj3, 509);
            case 18:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return new eyc.q(r.a((n) obj3), h.a.f167992a, d.a.f167986a, (List) getDefaultLoadingItems.invoke(), null);
            case 19:
                n update2 = (n) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return n.a(update2, new Data(((EntityHomeScreenContract$InputData.ScreenContent) ((com.revolut.feature.selfserve.entity.config.shared.ui.home.b) obj3).o).f85848b, null, false, 6, null), 5);
            case 20:
                return ezb.g.a((ezb.g) obj2, (ezb.i) obj3, null, 2);
            case 21:
                com.revolut.retail.feature.trading_onboarding.impl.ui.free_stocks.select.b bVar4 = (com.revolut.retail.feature.trading_onboarding.impl.ui.free_stocks.select.b) obj3;
                List collectionInstruments = (List) obj2;
                Intrinsics.checkNotNullParameter(collectionInstruments, "collectionInstruments");
                List list2 = collectionInstruments;
                ArrayList arrayList = new ArrayList(w.t(list2, 10));
                Iterator it9 = list2.iterator();
                while (it9.hasNext()) {
                    arrayList.add(((qi7.a) it9.next()).f246657a);
                }
                return ((ael.k) bVar4.f104172t).l(zhm.d0.i1(arrayList));
            case 22:
                ChipGroupView chipGroupView = (ChipGroupView) obj3;
                if (obj2 != null) {
                    throw new ClassCastException();
                }
                ChipGroupView.a(chipGroupView);
                throw null;
            case 23:
                return MappingRedirectableLiveData.redirectTo$lambda$0$0((MappingRedirectableLiveData) obj3, obj2);
            case 24:
                List history = (List) obj2;
                Intrinsics.checkNotNullParameter(history, "history");
                ArrayList<zw7.m> arrayList2 = ((zw7.r0) obj3).k;
                ArrayList arrayList3 = new ArrayList(w.t(arrayList2, 10));
                for (zw7.m mVar3 : arrayList2) {
                    if (mVar3.f325814a == zw7.n.STATEMENT_OF_INSURANCE) {
                        Integer numValueOf = Integer.valueOf(history.size());
                        zw7.n code = mVar3.f325814a;
                        zw7.o urlType = mVar3.f325815b;
                        String url2 = mVar3.f325816c;
                        LocalDate localDate = mVar3.e;
                        Intrinsics.checkNotNullParameter(code, "code");
                        Intrinsics.checkNotNullParameter(urlType, "urlType");
                        Intrinsics.checkNotNullParameter(url2, "url");
                        mVar3 = new zw7.m(code, urlType, url2, numValueOf, localDate);
                    }
                    arrayList3.add(mVar3);
                }
                return arrayList3;
            case 25:
                zw7.d0 d0Var = (zw7.d0) obj3;
                zw7.v data3 = (zw7.v) obj2;
                Intrinsics.checkNotNullParameter(data3, "data");
                Iterator it10 = data3.f325857a.iterator();
                while (true) {
                    if (it10.hasNext()) {
                        next = it10.next();
                        if (Intrinsics.f(((zw7.u) next).f325853a, d0Var.f325764a)) {
                        }
                    } else {
                        next = null;
                    }
                }
                zw7.u uVar = (zw7.u) next;
                return new n08.e(d0Var, uVar != null ? uVar.f325854b : null);
            case 26:
                f08.m mVar4 = (f08.m) obj3;
                Intrinsics.checkNotNullParameter((mm.e) obj2, "<unused var>");
                fx7.f fVar3 = mVar4.f131025b;
                Object obj4 = ((te0.r) mVar4.f131026c.d()).get();
                if (obj4 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                String petId = (String) obj4;
                Intrinsics.checkNotNullParameter(petId, "petId");
                y0 y0Var = (y0) fVar3.f138760a;
                y0Var.getClass();
                Intrinsics.checkNotNullParameter(petId, "petId");
                efm.b bVarRemovePetProfile = y0Var.f190501a.removePetProfile(petId);
                Intrinsics.checkNotNullExpressionValue(mVar, "complete(...)");
                pfm.a aVarE = bVarRemovePetProfile.e(mVar);
                Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
                pfm.a aVarE2 = te0.w.g0(aVarE).e(mVar4.d.c0(new StatusViewConfiguration.Success("REMOVAL_SUCCESS_STATUS_SCREEN_ID", new TextLocalisedClause(R$string.pets_profile_removal_confirmed_dialog_title, null, null, 14), null, null, null, 2044)));
                Intrinsics.checkNotNullExpressionValue(aVarE2, "andThen(...)");
                return aVarE2;
            case 27:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                ((f0c.o) obj3).getClass();
                IntRange intRangeO = kotlin.ranges.f.o(0, 7);
                ArrayList arrayList4 = new ArrayList(w.t(intRangeO, 10));
                vim.f it11 = intRangeO.iterator();
                while (it11.f289625c) {
                    arrayList4.add(nb0.b(pb0.Companion, a0.d.n("WAYS_TO_REDEEM_ROW_LOADING_LIST_PREFIX", it11.nextInt()), false, 0, false, 30));
                }
                return yp0.b.g(arrayList4, f0c.o.a(), null, 0, 0, 126);
            case 28:
                return ((xzk.h) ((f0l.c) obj3).f131127h).f310046b.a(FinishFlowCommand.f98647a);
            default:
                Character ch5 = (Character) obj2;
                char cCharValue = ch5.charValue();
                String str2 = (String) ((Map) ((f0m.b) obj3).f131130b.getValue()).get(ch5);
                return str2 != null ? str2 : new String(new char[]{cCharValue});
        }
    }

    public /* synthetic */ c(Object obj2, int i) {
        this.f129528a = i;
        this.f129529b = obj2;
    }
}
