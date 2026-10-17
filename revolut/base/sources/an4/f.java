package an4;

import aim.o;
import android.content.Intent;
import android.net.Uri;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.CoroutinesRoom;
import androidx.room.DatabaseConfiguration;
import androidx.room.RoomConnectionManager;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import androidx.sqlite.db.SupportSQLiteDatabase;
import anf.q;
import anf.r;
import aqd.i0;
import aqd.i1;
import aqd.m;
import aqd.n;
import aqd.t;
import bq5.e0;
import cfl.p;
import cni.l;
import com.revolut.core.ui_kit.chat.prompt.ChatPromptSuggestion;
import com.revolut.core.ui_kit.chat.prompt.ChatSuggestionRowDelegate;
import com.revolut.core.ui_kit.chat.prompt.ChatSuggestionsBlockDelegate;
import com.revolut.core.ui_kit.delegates.vf;
import com.revolut.core.ui_kit.gallery_picker.GalleryPickerView;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.commodities.onboarding.api.CommoditiesOnboardingApi$Toggles$InvestCommoditiesToEtc;
import com.revolut.feature.credit.card.impl.ui.cancellation.checkout.a;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.CryptoAddBeneficiaryFlowContract$CollectedDetails;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.CryptoAddBeneficiaryFlowContract$State;
import com.revolut.feature.insurance_car.impl.data.model.AdditionalDriver;
import com.revolut.feature.payments.bills_chooser.api.splits.SplitMemberType;
import com.revolut.feature.payments.bills_chooser.api.splits.SplitMembersType;
import com.revolut.feature.payments.bills_chooser.impl.ui.flow.summary.SplitBillsSummaryFlowContract$State;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import com.revolut.feature.wealth.api.domain.model.WealthAccount;
import com.revolut.feature.wealth.ui.api.WealthUiApi$Toggles;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.oauth.api.consent.ConsentFlowDestination;
import com.revolut.oauth.api.consent.OAuthAuthorizeParams;
import com.revolut.retail.feature.analytics.models.income_sorter.IncomeSorterDestinationId;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;
import te0.w;
import zhm.a0;
import zhm.d0;
import zhm.v;
import zhm.y0;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6559b;

    public /* synthetic */ f(Object obj2, int i) {
        this.f6558a = i;
        this.f6559b = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        do3.e eVar;
        Object next2;
        Object next3;
        boolean z;
        Object next4;
        SplitMembersType splitMembersTypeA;
        n nVar;
        int i = this.f6558a;
        Object obj3 = this.f6559b;
        switch (i) {
            case 0:
                String it8 = (String) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return ((i) obj3).b(it8);
            case 1:
                com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.penalty.a aVar = (com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.penalty.a) obj3;
                ty0.a it9 = (ty0.a) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                String str = it9.f275445a;
                String str2 = it9.f275446b;
                if (Intrinsics.f(str, "DIALOG_EMAIL_CLAUSE_ITEM")) {
                    aVar.C1(sl7.b.d(str2));
                } else if (Intrinsics.f(str, "DIALOG_PHONE_CLAUSE_ITEM")) {
                    aVar.C1(sl7.b.b(str2));
                }
                return Unit.f186387a;
            case 2:
                an8.b bVar = (an8.b) obj3;
                List savingsProductsContainers = (List) obj2;
                Intrinsics.checkNotNullParameter(savingsProductsContainers, "savingsProductsContainers");
                Iterator it10 = savingsProductsContainers.iterator();
                if (it10.hasNext()) {
                    next = it10.next();
                    if (it10.hasNext()) {
                        double d = opg.a.d((SavingsProductData) next);
                        do {
                            Object next5 = it10.next();
                            double d5 = opg.a.d((SavingsProductData) next5);
                            if (Double.compare(d, d5) < 0) {
                                next = next5;
                                d = d5;
                            }
                        } while (it10.hasNext());
                    }
                } else {
                    next = null;
                }
                SavingsProductData savingsProductData = (SavingsProductData) next;
                return savingsProductData == null ? "" : bVar.e.b(bVar.f6577c.g(savingsProductData, false, null, true)).toString();
            case 3:
                an9.n update = (an9.n) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return an9.n.a(update, (im9.c) obj3, null, null, null, 30);
            case 4:
                ypi.i iVar = ((ana.g) obj3).f6613j;
                iVar.f(new TextLocalisedClause(((Boolean) obj2).booleanValue() ? R.string.profile_details_email_button_change : R.string.profile_details_email_button_verify, null, null, 14));
                iVar.setVisible(true);
                return Unit.f186387a;
            case 5:
                com.revolut.feature.robo.impl.ui.screen.edit_goal.a aVar2 = (com.revolut.feature.robo.impl.ui.screen.edit_goal.a) obj3;
                gii.a output = (gii.a) obj2;
                Intrinsics.checkNotNullParameter(output, "output");
                aVar2.H2(aVar2.f85136s, new f(output, 6));
                return Unit.f186387a;
            case 6:
                anc.e update2 = (anc.e) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return anc.e.a(update2, null, null, ((gii.a) obj3).f144218a, null, null, 27);
            case 7:
                return CoroutinesRoom.Companion.createFlow$lambda$1((Callable) obj3, (SQLiteConnection) obj2);
            case 8:
                return RoomConnectionManager._init_$lambda$1((RoomConnectionManager) obj3, (SupportSQLiteDatabase) obj2);
            case 9:
                return RoomDatabase.createConnectionManager$lambda$1((RoomDatabase) obj3, (DatabaseConfiguration) obj2);
            case 10:
                return RoomSQLiteQuery.toRoomRawQuery$lambda$1((RoomSQLiteQuery) obj3, (SQLiteStatement) obj2);
            case 11:
                ar3.c cVar = ((r) obj3).f;
                l35.e loanApplicationAvailability = (l35.e) obj2;
                Intrinsics.checkNotNullParameter(loanApplicationAvailability, "loanApplicationAvailability");
                if (loanApplicationAvailability instanceof l35.c) {
                    o35.e eVar2 = ((l35.c) loanApplicationAvailability).f191851a;
                    return w.H0(cVar.b(eVar2.f221695b), cVar.b(eVar2.f221694a)).x().map(new ai0.j(new amf.i(28), 24));
                }
                if (loanApplicationAvailability instanceof l35.d) {
                    return efm.r.just(new q(0));
                }
                throw new NoWhenBranchMatchedException();
            case 12:
                do3.f fVar = (do3.f) obj3;
                do3.n user = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(user, "user");
                List list = user.v;
                if (list != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it11 = list.iterator();
                    while (it11.hasNext()) {
                        a0.x(((do3.r) it11.next()).f116431b, arrayList);
                    }
                    Iterator it12 = arrayList.iterator();
                    while (true) {
                        if (it12.hasNext()) {
                            next2 = it12.next();
                            do3.e eVar3 = (do3.e) next2;
                            if (!Intrinsics.f(eVar3.f116395a, user.f116408a) || eVar3.f116396b != fVar) {
                            }
                        } else {
                            next2 = null;
                        }
                    }
                    eVar = (do3.e) next2;
                } else {
                    eVar = null;
                }
                if (eVar != null) {
                    return eVar;
                }
                List list2 = user.v;
                if (list2 != null) {
                    return v13.d.h(list2, fVar);
                }
                return null;
            case 13:
                com.revolut.oauth.impl.ui.consent.flow.a aVar3 = (com.revolut.oauth.impl.ui.consent.flow.a) obj3;
                ConsentFlowDestination.InputData inputData = aVar3.o;
                eni.b bVar2 = aVar3.f98490p;
                yki.a aVar4 = aVar3.f98491q;
                l result = (l) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if (result instanceof cni.i) {
                    OAuthAuthorizeParams oAuthAuthorizeParams = inputData.f98483a;
                    String redirectUri = oAuthAuthorizeParams.f98486c;
                    String authorizationCode = ((cni.i) result).f25440a;
                    String state = oAuthAuthorizeParams.f98487g;
                    bVar2.getClass();
                    Intrinsics.checkNotNullParameter(redirectUri, "redirectUri");
                    Intrinsics.checkNotNullParameter(authorizationCode, "authorizationCode");
                    Intrinsics.checkNotNullParameter(state, "state");
                    Uri uriBuild = Uri.parse(redirectUri).buildUpon().appendQueryParameter("code", authorizationCode).appendQueryParameter("state", state).build();
                    Intrinsics.h(uriBuild);
                    Intent intent = new Intent("android.intent.action.VIEW", uriBuild);
                    intent.addFlags(268435456);
                    aVar3.C1(new ExternalDestination.ByIntent(intent, null));
                    oki.h.D2(aVar4);
                } else if (Intrinsics.f(result, cni.j.f25441a)) {
                    oki.h.D2(aVar4);
                } else {
                    if (!Intrinsics.f(result, cni.k.f25442a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    OAuthAuthorizeParams oAuthAuthorizeParams2 = inputData.f98483a;
                    String redirectUri2 = oAuthAuthorizeParams2.f98486c;
                    eni.a errorCode = eni.a.ACCESS_DENIED;
                    String str3 = oAuthAuthorizeParams2.f98487g;
                    bVar2.getClass();
                    Intrinsics.checkNotNullParameter(redirectUri2, "redirectUri");
                    Intrinsics.checkNotNullParameter(errorCode, "errorCode");
                    Uri.Builder builderAppendQueryParameter = Uri.parse(redirectUri2).buildUpon().appendQueryParameter("error", errorCode.a());
                    if (str3 != null) {
                        builderAppendQueryParameter.appendQueryParameter("state", str3);
                    }
                    Uri uriBuild2 = builderAppendQueryParameter.build();
                    Intrinsics.checkNotNullExpressionValue(uriBuild2, "build(...)");
                    Intent intent2 = new Intent("android.intent.action.VIEW", uriBuild2);
                    intent2.addFlags(268435456);
                    aVar3.C1(new ExternalDestination.ByIntent(intent2, null));
                    oki.h.D2(aVar4);
                }
                return Unit.f186387a;
            case 14:
                aob.g request = (aob.g) obj2;
                Intrinsics.checkNotNullParameter(request, "request");
                return ((rnb.i) ((aob.i) obj3).f7968b).f(request.f7964a, c8g.c.C(request.f7965b));
            case 15:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                ybl.g gVar = (ybl.g) pair.f186385a;
                List list3 = (List) pair.f186386b;
                o oVar = new o();
                gte.a aVar5 = ((aoh.a) obj3).f7987c;
                List<WealthAccount> list4 = list3;
                Iterator it13 = list4.iterator();
                while (true) {
                    if (it13.hasNext()) {
                        next3 = it13.next();
                        if (next3 instanceof WealthAccount.Securities) {
                        }
                    } else {
                        next3 = null;
                    }
                }
                WealthAccount.Securities securities = (WealthAccount.Securities) next3;
                if (securities != null ? securities.available() : false) {
                    oVar.add(xnh.a.STOCKS);
                }
                jte.d dVar = (jte.d) aVar5;
                if (!dVar.c(WealthUiApi$Toggles.RoboStrategies.f95863c) || ((list4 instanceof Collection) && list4.isEmpty())) {
                    z = false;
                } else {
                    for (WealthAccount wealthAccount : list4) {
                        if ((wealthAccount instanceof WealthAccount.Robo) && wealthAccount.available()) {
                            z = true;
                        }
                    }
                    z = false;
                }
                if (z) {
                    oVar.add(xnh.a.STRATEGIES);
                }
                p pVar = p.ETF;
                TradingAccountType.Gia gia = TradingAccountType.Gia.f105270a;
                if (gVar.c(pVar, gia)) {
                    oVar.add(xnh.a.ETFS);
                }
                if (gVar.c(p.BONDS, gia)) {
                    oVar.add(xnh.a.BONDS);
                }
                Iterator it14 = list4.iterator();
                while (true) {
                    if (it14.hasNext()) {
                        next4 = it14.next();
                        if (next4 instanceof WealthAccount.Margin) {
                        }
                    } else {
                        next4 = null;
                    }
                }
                if (next4 != null) {
                    oVar.add(xnh.a.CFD);
                }
                Iterator it15 = list4.iterator();
                while (true) {
                    if (it15.hasNext()) {
                        Object next6 = it15.next();
                        if (next6 instanceof WealthAccount.Commodities) {
                            obj = next6;
                        }
                    }
                }
                WealthAccount.Commodities commodities = (WealthAccount.Commodities) obj;
                if ((commodities != null ? commodities.available() : false) || dVar.c(CommoditiesOnboardingApi$Toggles$InvestCommoditiesToEtc.f65947c)) {
                    oVar.add(xnh.a.COMMODITY);
                }
                if (gVar.a(v.k(p.PRIVATE_MARKETS, p.PRIVATE_BANK))) {
                    oVar.add(xnh.a.PRIVATE_MARKETS);
                }
                if (gVar.c(p.MUTUAL_FUNDS, gia)) {
                    oVar.add(xnh.a.MUTUAL_FUNDS);
                }
                if (gVar.c(p.STRUCTURED_NOTES, gia)) {
                    oVar.add(xnh.a.STRUCTURED_NOTES);
                }
                return y0.a(oVar);
            case 16:
                ChatPromptSuggestion it16 = (ChatPromptSuggestion) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                ((ChatSuggestionRowDelegate) obj3).f51548c.onNext(it16);
                return Unit.f186387a;
            case 17:
                ((ChatSuggestionsBlockDelegate) obj3).f51549c.onNext((ChatPromptSuggestion) obj2);
                return Unit.f186387a;
            case 18:
                return ap0.n.a((ap0.n) obj3, (ChatPromptSuggestion) obj2);
            case 19:
                AdditionalDriver additionalDriver = (AdditionalDriver) obj3;
                ap7.d updateState = (ap7.d) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                List listA0 = updateState.f8102a;
                if (additionalDriver != null) {
                    listA0 = d0.A0(listA0, additionalDriver);
                }
                return ap7.d.a(updateState, listA0, null, 2);
            case 20:
                RecyclerView.ViewHolder holder = (RecyclerView.ViewHolder) obj2;
                GalleryPickerView.Companion companion = GalleryPickerView.INSTANCE;
                Intrinsics.checkNotNullParameter(holder, "holder");
                Function1 function1 = ((GalleryPickerView) obj3).onViewRecycledListener;
                if (function1 != null) {
                    function1.invoke(holder);
                }
                return Unit.f186387a;
            case 21:
                com.revolut.feature.credit.card.impl.ui.cancellation.checkout.b bVar3 = (com.revolut.feature.credit.card.impl.ui.cancellation.checkout.b) obj3;
                com.revolut.feature.credit.card.impl.ui.cancellation.checkout.a result2 = (com.revolut.feature.credit.card.impl.ui.cancellation.checkout.a) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (result2 instanceof a.c) {
                    bVar3.C2(a.c.f69109a);
                }
                return Unit.f186387a;
            case 22:
                CryptoAddBeneficiaryFlowContract$State update3 = (CryptoAddBeneficiaryFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                update3.getClass();
                return new CryptoAddBeneficiaryFlowContract$State((CryptoAddBeneficiaryFlowContract$CollectedDetails) obj3);
            case 23:
                e0 e0Var = (e0) obj3;
                CryptoAddBeneficiaryFlowContract$State update4 = (CryptoAddBeneficiaryFlowContract$State) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                CryptoAddBeneficiaryFlowContract$CollectedDetails cryptoAddBeneficiaryFlowContract$CollectedDetails = new CryptoAddBeneficiaryFlowContract$CollectedDetails(e0Var.f17703a, e0Var.f17704b, e0Var.f17705c, e0Var.d);
                update4.getClass();
                return new CryptoAddBeneficiaryFlowContract$State(cryptoAddBeneficiaryFlowContract$CollectedDetails);
            case 24:
                com.revolut.feature.payments.bills_chooser.impl.ui.flow.summary.a aVar6 = (com.revolut.feature.payments.bills_chooser.impl.ui.flow.summary.a) obj3;
                bp9.g outputData = (bp9.g) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                if (outputData instanceof bp9.f) {
                    bp9.f fVar2 = (bp9.f) outputData;
                    SplitMemberType splitMemberType = fVar2.f17568b;
                    SplitMembersType splitMembersType = ((SplitBillsSummaryFlowContract$State) aVar6.A2().f98429a).f79260a;
                    if (splitMembersType instanceof SplitMembersType.Group) {
                        SplitMembersType.Group group = (SplitMembersType.Group) splitMembersType;
                        SplitMemberType.GroupMember groupMember = splitMemberType instanceof SplitMemberType.GroupMember ? (SplitMemberType.GroupMember) splitMemberType : null;
                        if (groupMember == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        splitMembersTypeA = SplitMembersType.Group.a(group, groupMember, null, 2);
                    } else {
                        if (!(splitMembersType instanceof SplitMembersType.Split)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        SplitMembersType.Split split = (SplitMembersType.Split) splitMembersType;
                        SplitMemberType.SplitMember splitMember = splitMemberType instanceof SplitMemberType.SplitMember ? (SplitMemberType.SplitMember) splitMemberType : null;
                        if (splitMember == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        splitMembersTypeA = SplitMembersType.Split.a(split, splitMember, null, 2);
                    }
                    aVar6.L2(SplitBillsSummaryFlowContract$State.a((SplitBillsSummaryFlowContract$State) aVar6.A2().f98429a, splitMembersTypeA, null, fVar2.f17567a, 14));
                    aVar6.P2();
                } else if (!(outputData instanceof bp9.e)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
            case 25:
                aqb.f updateState2 = (aqb.f) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                return aqb.f.a(updateState2, null, null, !((vf) obj3).f54880a, null, null, 27);
            case 26:
                aqb.f updateState3 = (aqb.f) obj2;
                Intrinsics.checkNotNullParameter(updateState3, "$this$updateState");
                aqb.k kVar = (aqb.k) ((aqb.p) obj3);
                return aqb.f.a(updateState3, null, null, false, kVar.f8289a, kVar.f8290b, 7);
            case 27:
                i0 i0Var = (i0) obj3;
                t update5 = (t) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                Data data = update5.f8402a;
                m mVar = (m) data.getContent();
                return t.a(update5, Data.copy$default(data, mVar != null ? m.a(mVar, null, i0Var, 16255) : null, null, false, 6, null), null, null, null, false, null, null, 126);
            case 28:
                t update6 = (t) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                return t.a(update6, null, null, null, null, false, null, (IncomeSorterDestinationId) obj3, 63);
            default:
                t update7 = (t) obj2;
                Intrinsics.checkNotNullParameter(update7, "$this$update");
                int i2 = i1.f8349a[((n) obj3).ordinal()];
                if (i2 == 1) {
                    nVar = n.REGULAR;
                } else {
                    if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    nVar = n.REMOVE_DESTINATIONS;
                }
                return t.a(update7, null, nVar, null, null, false, null, null, ISO781611.SMT_TAG);
        }
    }
}
