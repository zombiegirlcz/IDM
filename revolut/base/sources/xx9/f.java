package xx9;

import androidx.camera.camera2.pipe.core.Debug;
import androidx.camera.camera2.pipe.core.ProcessingQueue;
import androidx.camera.camera2.pipe.core.PruningProcessingQueue;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.models.recipients.ApmRecipient;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.payment.counterparty.models.PaymentCounterpartyInfo;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.feature.push_to_card.api.data.CardOwnerWithStats;
import com.revolut.feature.referrals.promo.api.invitation.models.ChatInvitationPromo;
import com.revolut.feature.referrals.promo.api.invitation.models.EmptyChatInvitationPromo;
import com.revolut.feature.referrals.promo.api.invitation.models.InvitationPromo;
import com.revolut.feature.referrals.promo.api.invitation.models.ReferralsInvitationModel;
import com.revolut.feature.selfserve.sot.impl.ui.flow.SotFlowContract$FlowState;
import com.revolut.feature.selfserve.sow.impl.ui.document.other.SowOtherDocumentFragment;
import com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft;
import ip0.ji;
import ip0.nb0;
import ip0.pb0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import mx0.z5;
import zhm.d0;
import zhm.f0;
import zhm.q0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f309416a;

    public /* synthetic */ f(int i) {
        this.f309416a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        String code;
        ArrayList arrayList;
        boolean zT;
        String str;
        switch (this.f309416a) {
            case 0:
                vf0.e eVar = (vf0.e) obj2;
                Intrinsics.checkNotNullParameter(eVar, "<destruct>");
                i iVar = (i) eVar.f288410a;
                List list = (List) eVar.f288411b;
                List list2 = (List) eVar.f288412c;
                List list3 = (List) eVar.d;
                List list4 = (List) eVar.e;
                List list5 = (List) eVar.f;
                List list6 = (List) eVar.f288413g;
                List list7 = (List) eVar.f288414h;
                List list8 = (List) eVar.i;
                ArrayList arrayList2 = iVar.f309426a;
                ArrayList arrayList3 = iVar.f309427b;
                int iB = q0.b(w.t(arrayList2, 10));
                if (iB < 16) {
                    iB = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iB);
                for (Object obj3 : arrayList2) {
                    zm3.a aVar = (zm3.a) obj3;
                    if (aVar instanceof zm3.l) {
                        code = ((zm3.l) aVar).getCode();
                    } else if (aVar instanceof zm3.f) {
                        code = ((zm3.f) aVar).f323345a;
                    } else if (aVar instanceof zm3.e) {
                        code = ((zm3.e) aVar).f323340a;
                    } else if (aVar instanceof zm3.n) {
                        code = ((zm3.n) aVar).f323373a;
                    } else {
                        if (!(aVar instanceof zm3.o)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        code = ((zm3.o) aVar).f323376a;
                    }
                    linkedHashMap.put(code, obj3);
                }
                int iB2 = q0.b(w.t(arrayList3, 10));
                if (iB2 < 16) {
                    iB2 = 16;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iB2);
                for (Object obj4 : arrayList3) {
                    linkedHashMap2.put(((zm3.l) obj4).getCode(), obj4);
                }
                List list9 = list;
                int iB3 = q0.b(w.t(list9, 10));
                if (iB3 < 16) {
                    iB3 = 16;
                }
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(iB3);
                for (Object obj5 : list9) {
                    linkedHashMap3.put(hx7.q.G((zm3.p) obj5), obj5);
                }
                List list10 = list2;
                int iB4 = q0.b(w.t(list10, 10));
                if (iB4 < 16) {
                    iB4 = 16;
                }
                LinkedHashMap linkedHashMap4 = new LinkedHashMap(iB4);
                for (Object obj6 : list10) {
                    f5j.a aVar2 = (f5j.a) obj6;
                    String str2 = aVar2.f132330b;
                    if (str2 == null) {
                        str2 = aVar2.f132329a;
                    }
                    linkedHashMap4.put(str2, obj6);
                }
                List list11 = list3;
                int iB5 = q0.b(w.t(list11, 10));
                if (iB5 < 16) {
                    iB5 = 16;
                }
                LinkedHashMap linkedHashMap5 = new LinkedHashMap(iB5);
                for (Object obj7 : list11) {
                    linkedHashMap5.put(((CryptoAddress) obj7).f71059a, obj7);
                }
                List list12 = list4;
                int iB6 = q0.b(w.t(list12, 10));
                if (iB6 < 16) {
                    iB6 = 16;
                }
                LinkedHashMap linkedHashMap6 = new LinkedHashMap(iB6);
                for (Object obj8 : list12) {
                    linkedHashMap6.put(((ba6.l) obj8).f13938a, obj8);
                }
                List list13 = list5;
                int iB7 = q0.b(w.t(list13, 10));
                if (iB7 < 16) {
                    iB7 = 16;
                }
                LinkedHashMap linkedHashMap7 = new LinkedHashMap(iB7);
                for (Object obj9 : list13) {
                    linkedHashMap7.put(((CardOwnerWithStats) obj9).f81495a.f81490a, obj9);
                }
                List list14 = list6;
                int iB8 = q0.b(w.t(list14, 10));
                if (iB8 < 16) {
                    iB8 = 16;
                }
                LinkedHashMap linkedHashMap8 = new LinkedHashMap(iB8);
                for (Object obj10 : list14) {
                    linkedHashMap8.put(((PaymentGroup) obj10).f79285a, obj10);
                }
                List list15 = list7;
                int iB9 = q0.b(w.t(list15, 10));
                if (iB9 < 16) {
                    iB9 = 16;
                }
                LinkedHashMap linkedHashMap9 = new LinkedHashMap(iB9);
                for (Object obj11 : list15) {
                    linkedHashMap9.put(((ApmRecipient) obj11).getF62134a().getF62112a(), obj11);
                }
                List list16 = list8;
                int iB10 = q0.b(w.t(list16, 10));
                LinkedHashMap linkedHashMap10 = new LinkedHashMap(iB10 < 16 ? 16 : iB10);
                for (Object obj12 : list16) {
                    linkedHashMap10.put(((PaymentCounterpartyInfo) obj12).f79060a, obj12);
                }
                return new h(linkedHashMap, linkedHashMap2, linkedHashMap3, linkedHashMap4, linkedHashMap5, linkedHashMap6, linkedHashMap7, linkedHashMap8, linkedHashMap9, linkedHashMap10);
            case 1:
                List recents = (List) obj2;
                Intrinsics.checkNotNullParameter(recents, "recents");
                ArrayList arrayList4 = new ArrayList();
                for (Object obj13 : recents) {
                    if (!fc.g.c((jq9.k) obj13)) {
                        arrayList4.add(obj13);
                    }
                }
                return arrayList4;
            case 2:
                List recentsList = (List) obj2;
                Intrinsics.checkNotNullParameter(recentsList, "recentsList");
                return Boolean.valueOf(!recentsList.isEmpty());
            case 3:
                Boolean isRecentsListNotEmpty = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(isRecentsListNotEmpty, "isRecentsListNotEmpty");
                isRecentsListNotEmpty.booleanValue();
                return isRecentsListNotEmpty;
            case 4:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                Data data = (Data) pair.f186385a;
                Iterable iterable = (Iterable) pair.f186386b;
                try {
                    Object content = data.getContent();
                    if (content != null) {
                        arrayList = new ArrayList();
                        for (Object obj14 : (List) content) {
                            jq9.k kVar = (jq9.k) obj14;
                            if (fc.g.c(kVar)) {
                                jq9.p pVar = kVar instanceof jq9.p ? (jq9.p) kVar : null;
                                zm3.a aVar3 = pVar != null ? pVar.f177514b : null;
                                zm3.l lVar = aVar3 instanceof zm3.l ? (zm3.l) aVar3 : null;
                                zT = d0.T(iterable, lVar != null ? lVar.getCode() : null);
                            } else {
                                zT = true;
                            }
                            if (zT) {
                                arrayList.add(obj14);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    return new Data(arrayList, data.getError(), data.getLoading());
                } catch (Throwable th10) {
                    return new Data(null, th10, data.getLoading());
                }
            case 5:
                Long it8 = (Long) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return Boolean.valueOf(it8.longValue() == 0);
            case 6:
                List recentTransactions = (List) obj2;
                Intrinsics.checkNotNullParameter(recentTransactions, "recentTransactions");
                return Boolean.valueOf(!recentTransactions.isEmpty());
            case 7:
                List recentTransactions2 = (List) obj2;
                Intrinsics.checkNotNullParameter(recentTransactions2, "recentTransactions");
                return Boolean.valueOf(!recentTransactions2.isEmpty());
            case 8:
                wxa.d responseDto = (wxa.d) obj2;
                Intrinsics.checkNotNullParameter(responseDto, "responseDto");
                Intrinsics.checkNotNullParameter(responseDto, "<this>");
                wxa.b emptyChat = responseDto.getEmptyChat();
                EmptyChatInvitationPromo emptyChatInvitationPromo = new EmptyChatInvitationPromo(emptyChat.getTitle(), emptyChat.getDescription(), emptyChat.getDarkImage(), emptyChat.getLightImage(), emptyChat.getAcceptButton());
                wxa.a chat = responseDto.getChat();
                ChatInvitationPromo chatInvitationPromo = new ChatInvitationPromo(chat.getDescription(), chat.getDarkImage(), chat.getLightImage(), chat.getAcceptButton(), chat.getDeclineButton());
                wxa.c beneficiaryProfile = responseDto.getBeneficiaryProfile();
                InvitationPromo invitationPromo = new InvitationPromo(beneficiaryProfile.getTitle(), beneficiaryProfile.getDescription());
                wxa.c transactionDetails = responseDto.getTransactionDetails();
                InvitationPromo invitationPromo2 = new InvitationPromo(transactionDetails.getTitle(), transactionDetails.getDescription());
                wxa.c transactionFee = responseDto.getTransactionFee();
                return new ReferralsInvitationModel(emptyChatInvitationPromo, chatInvitationPromo, invitationPromo, invitationPromo2, new InvitationPromo(transactionFee.getTitle(), transactionFee.getDescription()));
            case 9:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                Intrinsics.checkNotNullParameter("ID_PASS_ACTIVITY_FILTERS_SHIMMER_ITEM", "listId");
                return u.c(new ji(R$attr.uikit_dp0, 56, "ID_PASS_ACTIVITY_FILTERS_ROW", u.c(new z5())));
            case 10:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return xxi.o.a();
            case 11:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return null;
            case 12:
                Intrinsics.checkNotNullParameter((Function0) obj2, "it");
                return nb0.a(pb0.Companion, "EARN_ITEM_ID", false, 6);
            case 13:
                SotFlowContract$FlowState update = (SotFlowContract$FlowState) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                f0 f0Var = f0.f322471a;
                t0 t0Var = t0.f186434a;
                m70.a.c(t0Var);
                Intrinsics.checkNotNullParameter(t0Var, "<this>");
                Intrinsics.checkNotNullParameter(t0Var, "<this>");
                Intrinsics.checkNotNullParameter(t0Var, "<this>");
                return SotFlowContract$FlowState.a(update, false, null, null, null, null, f0Var, "", "", "", null, null, "", null, false, 4099);
            case 14:
                SotFlowContract$FlowState update2 = (SotFlowContract$FlowState) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return SotFlowContract$FlowState.a(update2, false, null, null, null, null, null, null, null, null, null, null, null, null, false, 8191);
            case 15:
                CryptoOrderDraft draft = (CryptoOrderDraft) obj2;
                Intrinsics.checkNotNullParameter(draft, "draft");
                return draft.f;
            case 16:
                InputTextDelegate.TextData it9 = (InputTextDelegate.TextData) obj2;
                int i = SowOtherDocumentFragment.g0;
                Intrinsics.checkNotNullParameter(it9, "it");
                return it9.f52598b;
            case 17:
                xzd.k update3 = (xzd.k) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return xzd.k.a(update3, new Data(null, null, true, 3, null), null, null, false, 14);
            case 18:
                xzd.k update4 = (xzd.k) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return xzd.k.a(update4, null, null, null, !update4.d, 7);
            case 19:
                Intrinsics.checkNotNullParameter((Function0) obj2, "<unused var>");
                aim.e eVarB = u.b();
                pb0 pb0VarB = nb0.b(pb0.Companion, "ID_LOADING_ACCOUNTS_ITEM", false, 0, false, 30);
                yp0.b.l(pb0VarB, 0, 0, 0, 0, null, false, 63);
                eVarB.add(pb0VarB);
                ArrayList arrayList5 = new ArrayList(3);
                for (int i2 = 0; i2 < 3; i2++) {
                    arrayList5.add(t61.a.o("ID_LOADING_FILTER_ITEM_", i2, pb0.Companion, false, 6));
                }
                yp0.b.k(arrayList5, 0, 0, 0, 0, 31);
                eVarB.addAll(arrayList5);
                return new xzd.n(u.a(eVarB), false, false);
            case 20:
                Integer it10 = (Integer) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return zi0.c.P(it10, false, null, 3);
            case 21:
                Map it11 = (Map) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                return new Data(it11, null, false, 6, null);
            case 22:
                List it12 = (List) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return zi0.c.P(it12, false, null, 3);
            case 23:
                Integer it13 = (Integer) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return new Data(it13, null, false, 6, null);
            case 24:
                return Debug.formatParameterMap$lambda$0((Pair) obj2);
            case 25:
                return Debug.valueToString$lambda$0(obj2);
            case 26:
                return ProcessingQueue._init_$lambda$0((List) obj2);
            case 27:
                return PruningProcessingQueue._init_$lambda$0((List) obj2);
            case 28:
                return PruningProcessingQueue._init_$lambda$1((List) obj2);
            default:
                y07.g updateState = (y07.g) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                if (updateState.d) {
                    str = updateState.f310156a;
                } else {
                    m70.a.c(t0.f186434a);
                    str = "";
                }
                return y07.g.a(updateState, str, null, null, !updateState.d, 6);
        }
    }

    public /* synthetic */ f(Object obj2, int i) {
        this.f309416a = i;
    }
}
