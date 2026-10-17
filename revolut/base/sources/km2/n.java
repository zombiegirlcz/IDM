package km2;

import android.os.Parcelable;
import com.revolut.chat.domain.model.draft.DraftRoutingKey;
import com.revolut.feature.address.common.api.flow.AddressFlowContract$OutputData;
import com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.OfferV2FlowContract$OfferUpdateContext;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.feature.payments.groups.models.GroupMemberSettleInfo;
import com.revolut.feature.payments.messaging.data.api.model.ChatItem;
import com.revolut.feature.payments.messaging.data.api.model.GroupChatItem;
import com.revolut.feature.selfserve.sot.api.models.IncomeSource;
import com.revolut.feature.transfer.models.transfer.TransferTrustData;
import com.revolut.feature.transfer_reasons.models.reason.TransferReasonsValues;
import com.revolut.retail.feature.api.analytics_cycle.models.AnalyticsSpendingPeriod$Interval;
import ip0.yc0;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kl.c0;
import kl7.k2;
import knd.h1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import ks9.b0;
import ks9.n0;
import lfg.g0;
import ll7.e0;
import nel.u0;
import ukm.j0;

/* JADX INFO: loaded from: classes21.dex */
public final class n extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f185698w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f185699x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f185700y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i, Object obj2, Object obj3, Object obj4, Object obj5, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f185698w = obj2;
        this.f185699x = obj3;
        this.f185700y = obj4;
        this.z = obj5;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new n((Map) this.f185698w, (String) this.f185699x, (r) this.z, (String) this.f185700y, continuation);
            case 1:
                n nVar = new n((h1) this.f185699x, (j0) this.f185700y, (AnalyticsSpendingPeriod$Interval) this.z, continuation, 1);
                nVar.f185698w = obj2;
                return nVar;
            case 2:
                return new n(2, (Set) this.f185698w, (com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.v2.e) this.f185699x, (j6e.a) this.f185700y, (yki.b) this.z, continuation);
            case 3:
                return new n(3, (Set) this.f185698w, (com.revolut.feature.spending_analytics.impl.ui.rev10.income_sorter.flow.v2.e) this.f185699x, (zib.a) this.f185700y, (yki.b) this.z, continuation);
            case 4:
                return new n(4, (ks9.b) this.f185698w, (List) this.f185699x, (qq9.d) this.f185700y, (PaymentGroup) this.z, continuation);
            case 5:
                return new n((ks9.s) this.f185699x, (PaymentGroup) this.f185700y, (GroupChatItem) this.z, continuation, 5);
            case 6:
                return new n((ks9.s) this.f185698w, (ChatItem) this.f185700y, (String) this.f185699x, (PaymentGroup) this.z, continuation, 6);
            case 7:
                return new n((ks9.s) this.f185698w, (dv9.m) this.f185700y, (String) this.f185699x, (ChatItem) this.z, continuation, 7);
            case 8:
                return new n(8, (b0) this.f185698w, (qq9.d) this.f185699x, (List) this.f185700y, (PaymentGroup) this.z, continuation);
            case 9:
                return new n(9, (b0) this.f185698w, (PaymentGroup) this.f185699x, (GroupMemberSettleInfo) this.f185700y, (krf.c) this.z, continuation);
            case 10:
                return new n(10, (n0) this.f185698w, (qq9.d) this.f185699x, (PaymentGroup) this.f185700y, (ArrayList) this.z, continuation);
            case 11:
                return new n(11, (kuf.d) this.f185698w, (String) this.f185699x, (iy9.d) this.f185700y, (TransferTrustData) this.z, continuation);
            case 12:
                n nVar2 = new n((l9d.e) this.f185700y, (UUID) this.z, continuation, 12);
                nVar2.f185699x = obj2;
                return nVar2;
            case 13:
                return new n(13, (ldh.m) this.f185698w, (u0) this.f185699x, (bfl.g) this.f185700y, (ArrayList) this.z, continuation);
            case 14:
                n nVar3 = new n((Ref$ObjectRef) this.f185700y, (lfg.e) this.z, continuation, 14);
                nVar3.f185699x = obj2;
                return nVar3;
            case 15:
                return new n((lfg.e) this.f185700y, (hfg.b) this.z, continuation, 15);
            case 16:
                return new n((g0) this.f185699x, (FlowCollector) this.f185700y, (hfg.l) this.z, continuation, 16);
            case 17:
                return new n(17, (lg0.b) this.f185698w, (String) this.f185699x, (lg0.a) this.f185700y, (Boolean) this.z, continuation);
            case 18:
                return new n(18, (lig.p) this.f185698w, (String) this.f185699x, (String) this.f185700y, (String) this.z, continuation);
            case 19:
                return new n(19, (e0) this.f185700y, (k2) this.z, (String) this.f185699x, continuation);
            case 20:
                return new n((String) this.f185699x, (String) this.f185700y, (ArrayList) this.f185698w, continuation, (e0) this.z);
            case 21:
                n nVar4 = new n((lr.p) this.z, (Map) this.f185698w, (String) this.f185699x, continuation);
                nVar4.f185700y = obj2;
                return nVar4;
            case 22:
                return new n(22, (lsf.d) this.f185698w, (String) this.f185699x, (TransferReasonsValues) this.f185700y, (ttf.d) this.z, continuation);
            case 23:
                return new n(23, (ltc.a) this.f185700y, (Boolean) this.z, (String) this.f185699x, continuation);
            case 24:
                n nVar5 = new n((List) this.f185699x, (IncomeSource) this.f185700y, (c0) this.z, continuation, 24);
                nVar5.f185698w = obj2;
                return nVar5;
            case 25:
                return new n(25, (m50.d) this.f185698w, (DraftRoutingKey) this.f185699x, (yc0) this.f185700y, (Flow) this.z, continuation);
            case 26:
                return new n(26, (com.revolut.retail.feature.pod_nominees.impl.edit.d) this.f185698w, (String) this.f185699x, (mek.g) this.f185700y, (AddressFlowContract$OutputData) this.z, continuation);
            case 27:
                return new n(27, (com.revolut.feature.credit.application.plugins.impl.ui.offer_v2.g) this.f185698w, (OfferV2FlowContract$OfferUpdateContext) this.f185699x, (hu3.a) this.f185700y, (yf4.f) this.z, continuation);
            case 28:
                n nVar6 = new n((mk0.a) this.f185699x, (tk0.g) this.f185700y, this.z, continuation, 28);
                nVar6.f185698w = obj2;
                return nVar6;
            default:
                return new n(29, (mt8.d) this.f185698w, (String) this.f185699x, (av.a) this.f185700y, (File) this.z, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((n) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((n) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((n) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((n) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((n) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((n) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((n) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((n) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((n) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((n) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((n) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((n) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((n) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((n) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((n) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((n) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((n) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((n) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((n) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((n) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((n) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((n) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((n) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((n) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((n) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((n) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((n) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((n) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((n) create((FlowCollector) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((n) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:266:0x05c8  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x06d8  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x070d  */
    /* JADX WARN: Removed duplicated region for block: B:544:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:545:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:546:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:550:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r16v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v39, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v32, types: [ulm.b1] */
    /* JADX WARN: Type inference failed for: r8v34 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:262:0x05bf -> B:264:0x05c2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:316:0x070d -> B:317:0x070e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instruction units count: 2896
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: km2.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i, Object obj2, Object obj3, String str, Continuation continuation) {
        super(2, continuation);
        this.u = i;
        this.f185700y = obj2;
        this.f185699x = str;
        this.z = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f185699x = obj2;
        this.f185700y = obj3;
        this.z = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f185700y = obj2;
        this.z = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String str, String str2, ArrayList arrayList, Continuation continuation, e0 e0Var) {
        super(2, continuation);
        this.u = 20;
        this.f185698w = arrayList;
        this.z = e0Var;
        this.f185699x = str;
        this.f185700y = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Map map, String str, r rVar, String str2, Continuation continuation) {
        super(2, continuation);
        this.u = 0;
        this.f185698w = map;
        this.f185699x = str;
        this.z = rVar;
        this.f185700y = str2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(ks9.s sVar, Object obj2, String str, Parcelable parcelable, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f185698w = sVar;
        this.f185700y = obj2;
        this.f185699x = str;
        this.z = parcelable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(lr.p pVar, Map map, String str, Continuation continuation) {
        super(2, continuation);
        this.u = 21;
        this.z = pVar;
        this.f185698w = map;
        this.f185699x = str;
    }
}
