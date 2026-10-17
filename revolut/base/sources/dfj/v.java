package dfj;

import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import com.revolut.feature.home_feed.impl.widgets.cards.CardsWidgetContext;
import com.revolut.feature.transfer.core.models.TransferFlowType;
import com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData;
import java.io.Serializable;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes11.dex */
public final class v extends gim.i implements Function3 {
    public final /* synthetic */ Object A;
    public Object B;
    public Object C;
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f114122w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f114123x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f114124y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(int i, Serializable serializable, Object obj2, Object obj3, Object obj4, Object obj5, Continuation continuation) {
        super(3, continuation);
        this.u = i;
        this.A = obj2;
        this.B = obj3;
        this.f114124y = obj4;
        this.z = obj5;
        this.C = serializable;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        int i = this.u;
        Object obj5 = this.A;
        FlowCollector flowCollector = (FlowCollector) obj2;
        switch (i) {
            case 0:
                w4l.k kVar = (w4l.k) this.B;
                String str = (String) this.f114124y;
                String str2 = (String) this.z;
                String str3 = (String) this.C;
                int i2 = 0;
                v vVar = new v(i2, str3, (w) obj5, kVar, str, str2, (Continuation) obj4);
                vVar.f114122w = flowCollector;
                vVar.f114123x = obj3;
                return vVar.invokeSuspend(Unit.f186387a);
            case 1:
                v vVar2 = new v((Continuation) obj4, (String) this.f114124y, (n88.k) obj5, (HomeFeedWidgetContext.Junior) this.B, (String) this.z, (dsh.e) this.C);
                vVar2.f114122w = flowCollector;
                vVar2.f114123x = obj3;
                return vVar2.invokeSuspend(Unit.f186387a);
            case 2:
                CardsWidgetContext cardsWidgetContext = (CardsWidgetContext) this.B;
                String str4 = (String) this.f114124y;
                String str5 = (String) this.z;
                dsh.e eVar = (dsh.e) this.C;
                int i3 = 2;
                v vVar3 = new v(i3, eVar, (qc7.e) obj5, cardsWidgetContext, str4, str5, (Continuation) obj4);
                vVar3.f114122w = flowCollector;
                vVar3.f114123x = obj3;
                return vVar3.invokeSuspend(Unit.f186387a);
            case 3:
                PeerToPeerTransferData peerToPeerTransferData = (PeerToPeerTransferData) this.B;
                zm3.a aVar = (zm3.a) this.f114124y;
                TransferFlowType.Default r132 = TransferFlowType.Default.f92257b;
                v vVar4 = new v((Continuation) obj4, (r9k.k) obj5, peerToPeerTransferData, aVar, (hrf.f) this.z, (Set) this.C);
                vVar4.f114122w = flowCollector;
                vVar4.f114123x = obj3;
                return vVar4.invokeSuspend(Unit.f186387a);
            case 4:
                v vVar5 = new v((com.revolut.feature.card_design.impl.card_design.carousel.e) obj5, (Continuation) obj4);
                vVar5.f114122w = flowCollector;
                vVar5.f114123x = obj3;
                return vVar5.invokeSuspend(Unit.f186387a);
            default:
                tdc.d dVar = (tdc.d) this.B;
                dj0.d dVar2 = (dj0.d) this.f114124y;
                tdc.h hVar = (tdc.h) this.z;
                dj0.d dVar3 = (dj0.d) this.C;
                int i5 = 5;
                v vVar6 = new v(i5, dVar3, (tdc.r) obj5, dVar, dVar2, hVar, (Continuation) obj4);
                vVar6.f114122w = flowCollector;
                vVar6.f114123x = obj3;
                return vVar6.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:37|(1:128)|(1:(1:(3:41|65|66)(2:42|43))(3:44|45|46))(6:49|(3:52|53|(1:130)(1:56))|62|(1:131)|65|66)|126|57|58|62|(0)|65|66) */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01a9, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01aa, code lost:
    
        r8 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01ab, code lost:
    
        r2 = zhm.h0.f322473a;
        r3 = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, "Failed to get walletId for RevPoints unlock retry", r0, r2);
        r8 = r8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v14, types: [kotlinx.coroutines.flow.FlowCollector] */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 826
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dfj.v.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.revolut.feature.card_design.impl.card_design.carousel.e eVar, Continuation continuation) {
        super(3, continuation);
        this.u = 4;
        this.A = eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Continuation continuation, String str, n88.k kVar, HomeFeedWidgetContext.Junior junior, String str2, dsh.e eVar) {
        super(3, continuation);
        this.u = 1;
        this.f114124y = str;
        this.A = kVar;
        this.B = junior;
        this.z = str2;
        this.C = eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Continuation continuation, r9k.k kVar, PeerToPeerTransferData peerToPeerTransferData, zm3.a aVar, hrf.f fVar, Set set) {
        super(3, continuation);
        this.u = 3;
        TransferFlowType.Default r110 = TransferFlowType.Default.f92257b;
        this.A = kVar;
        this.B = peerToPeerTransferData;
        this.f114124y = aVar;
        this.z = fVar;
        this.C = set;
    }
}
