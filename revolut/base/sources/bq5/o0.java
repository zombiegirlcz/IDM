package bq5;

import bq7.e;
import com.revolut.core.ui_kit.delegates.CellDetailsActionDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.card.api.models.credit_limit_increase.CreditLimitIncreaseStatus;
import com.revolut.feature.credit.card.models.CreditCard;
import com.revolut.feature.credit_card.autopay.api.models_v3.CreditCardAutopayPayments;
import com.revolut.feature.payments.groups.impl.ui_chat.chat.GroupChatScreen;
import com.revolut.feature.transfer.core.impl.ui.troubleshooter.TransferTroubleshooterScreen;
import ip0.s7;
import ip0.w40;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17744a;

    public /* synthetic */ o0(int i) {
        this.f17744a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f17744a;
        od0.i iVar = od0.i.f224256b;
        CreditLimitIncreaseStatus.Available available = CreditLimitIncreaseStatus.Available.f68725a;
        switch (i) {
            case 0:
                a0 it8 = (a0) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return it8.A;
            case 1:
                a0 update = (a0) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return a0.a(update, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, false, null, null, null, null, 1040187391);
            case 2:
                return a0.a((a0) obj2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, false, null, null, null, null, 1056964607);
            case 3:
                return a0.a((a0) obj2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, false, true, null, null, null, null, 1056964607);
            case 4:
                bq7.f updateState = (bq7.f) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return bq7.f.a(Data.copy$default(updateState.f17778a, null, null, true, 3, null));
            case 5:
                bq7.f updateState2 = (bq7.f) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                return bq7.f.a(Data.copy$default(updateState2.f17778a, null, null, true, 3, null));
            case 6:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return new bq7.i((List) getDefaultLoadingItems.invoke(), null, e.a.f17775a);
            case 7:
                List list = (List) obj2;
                Intrinsics.checkNotNullParameter(list, "list");
                return Boolean.valueOf(!list.isEmpty());
            case 8:
                List list2 = (List) obj2;
                Intrinsics.checkNotNullParameter(list2, "list");
                return Boolean.valueOf(!list2.isEmpty());
            case 9:
                yhm.r rVar = (yhm.r) obj2;
                Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                return new br4.d0((CreditLimitIncreaseStatus) rVar.f314203c, (od0.i) rVar.f314202b, (od0.i) rVar.f314201a);
            case 10:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return Boolean.FALSE;
            case 11:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                od0.i.Companion.getClass();
                return iVar;
            case 12:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                od0.i.Companion.getClass();
                return iVar;
            case 13:
                od0.i it9 = (od0.i) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                CreditLimitIncreaseStatus creditLimitIncreaseStatus = (CreditLimitIncreaseStatus) it9.f224257a;
                return creditLimitIncreaseStatus == null ? available : creditLimitIncreaseStatus;
            case 14:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return available;
            case 15:
                List it10 = (List) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                return Integer.valueOf(it10.size());
            case 16:
                Intrinsics.checkNotNullParameter((Throwable) obj2, "it");
                return 0;
            case 17:
                vf0.k kVar = (vf0.k) obj2;
                Intrinsics.checkNotNullParameter(kVar, "<destruct>");
                return new br4.i((od0.i) kVar.f288456c, ((Number) kVar.d).intValue(), (CreditCardAutopayPayments) kVar.e, (CreditCard) kVar.f288454a, (wi0.b) kVar.f288455b);
            case 18:
                Function0 getDefaultLoadingItems2 = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems2, "getDefaultLoadingItems");
                return new br4.z(br4.x.f17926a, (List) getDefaultLoadingItems2.invoke());
            case 19:
                ArrayList arrayListP = kii.e.p((Function0) obj2, "<unused var>", 3);
                for (int i2 = 0; i2 < 3; i2++) {
                    arrayListP.add(new w40(a0.d.n("STATUS_LOADING_STEP_PREFIX", i2)));
                }
                yp0.b.k(arrayListP, 0, 0, 0, 0, 31);
                ArrayList arrayList = new ArrayList(3);
                for (int i3 = 0; i3 < 3; i3++) {
                    arrayList.add(new s7(a0.d.n("STATUS_LOADING_ITEM_PREFIX", i3), 0, 0, 0, 0, false, null, 126));
                }
                yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                return new brc.r(zhm.d0.E0(arrayList, arrayListP));
            case 20:
                RowDelegate.Model it11 = (RowDelegate.Model) obj2;
                KProperty[] kPropertyArr = TransferTroubleshooterScreen.f0;
                Intrinsics.checkNotNullParameter(it11, "it");
                return it11.u;
            case 21:
                ty0.a it12 = (ty0.a) obj2;
                KProperty[] kPropertyArr2 = TransferTroubleshooterScreen.f0;
                Intrinsics.checkNotNullParameter(it12, "it");
                return it12.d;
            case 22:
                CellDetailsActionDelegate.Model it13 = (CellDetailsActionDelegate.Model) obj2;
                KProperty[] kPropertyArr3 = TransferTroubleshooterScreen.f0;
                Intrinsics.checkNotNullParameter(it13, "it");
                return it13.f51787l;
            case 23:
                ty0.a it14 = (ty0.a) obj2;
                KProperty[] kPropertyArr4 = TransferTroubleshooterScreen.f0;
                Intrinsics.checkNotNullParameter(it14, "it");
                return it14.d;
            case 24:
                brf.d updateState3 = (brf.d) obj2;
                Intrinsics.checkNotNullParameter(updateState3, "$this$updateState");
                return brf.d.a(updateState3, new Data(null, null, true, 3, null));
            case 25:
                mq9.c it15 = (mq9.c) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                return it15.f207898a;
            case 26:
                Map reactionsMap = (Map) obj2;
                Intrinsics.checkNotNullParameter(reactionsMap, "reactionsMap");
                return zi0.c.P(reactionsMap, false, null, 2);
            case 27:
                st9.f it16 = (st9.f) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                return it16.f265548b;
            case 28:
                Throwable it17 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                return new Data(null, it17, false, 5, null);
            default:
                ChatBubbleDelegate.ButtonModel it18 = (ChatBubbleDelegate.ButtonModel) obj2;
                KProperty[] kPropertyArr5 = GroupChatScreen.j0;
                Intrinsics.checkNotNullParameter(it18, "it");
                Object obj3 = it18.d;
                Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.payments.messaging.common.api.ChatButtonParcel");
                return (cu9.b) obj3;
        }
    }

    public /* synthetic */ o0(Object obj2, int i) {
        this.f17744a = i;
    }
}
