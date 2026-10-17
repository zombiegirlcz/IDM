package a9j;

import com.revolut.feature.wealth.api.domain.model.instruments_collection.InstrumentsCollectionType;
import com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes11.dex */
public final class m extends gim.i implements Function3 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ FlowCollector f2694w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f2695x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ boolean f2696y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(k18.c cVar, boolean z, String str, Continuation continuation) {
        super(3, continuation);
        this.u = 5;
        this.z = cVar;
        this.f2696y = z;
        this.A = str;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        FlowCollector flowCollector = (FlowCollector) obj2;
        switch (this.u) {
            case 0:
                m mVar = new m((Continuation) obj4, this.f2696y, (u) this.z, (xi0.b) this.A, 0);
                mVar.f2694w = flowCollector;
                mVar.f2695x = obj3;
                return mVar.invokeSuspend(Unit.f186387a);
            case 1:
                m mVar2 = new m((Continuation) obj4, (b9k.d) this.z, (PeerToPeerTransferData) this.A, this.f2696y, 1);
                mVar2.f2694w = flowCollector;
                mVar2.f2695x = obj3;
                return mVar2.invokeSuspend(Unit.f186387a);
            case 2:
                m mVar3 = new m((Continuation) obj4, (fxb.h) this.z, (String) this.A, this.f2696y, 2);
                mVar3.f2694w = flowCollector;
                mVar3.f2695x = obj3;
                return mVar3.invokeSuspend(Unit.f186387a);
            case 3:
                m mVar4 = new m((Continuation) obj4, (k23.b) this.z, (String) this.A, this.f2696y, 3);
                mVar4.f2694w = flowCollector;
                mVar4.f2695x = obj3;
                return mVar4.invokeSuspend(Unit.f186387a);
            case 4:
                m mVar5 = new m((Continuation) obj4, (l2d.n) this.z, this.f2696y, (w4l.k) this.A);
                mVar5.f2694w = flowCollector;
                mVar5.f2695x = obj3;
                return mVar5.invokeSuspend(Unit.f186387a);
            case 5:
                k18.c cVar = (k18.c) this.z;
                String str = (String) this.A;
                m mVar6 = new m(cVar, this.f2696y, str, (Continuation) obj4);
                mVar6.f2694w = flowCollector;
                mVar6.f2695x = (Throwable) obj3;
                return mVar6.invokeSuspend(Unit.f186387a);
            case 6:
                m mVar7 = new m((Continuation) obj4, (s7d.e) this.z, (v30.s) this.A, this.f2696y, 6);
                mVar7.f2694w = flowCollector;
                mVar7.f2695x = obj3;
                return mVar7.invokeSuspend(Unit.f186387a);
            default:
                m mVar8 = new m((Continuation) obj4, this.f2696y, (x8h.g) this.z, (InstrumentsCollectionType) this.A, 7);
                mVar8.f2694w = flowCollector;
                mVar8.f2695x = obj3;
                return mVar8.invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:269:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c6  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r40) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2134
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a9j.m.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(Continuation continuation, Object obj2, Object obj3, boolean z, int i) {
        super(3, continuation);
        this.u = i;
        this.z = obj2;
        this.A = obj3;
        this.f2696y = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Continuation continuation, l2d.n nVar, boolean z, w4l.k kVar) {
        super(3, continuation);
        this.u = 4;
        this.z = nVar;
        this.f2696y = z;
        this.A = kVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(Continuation continuation, boolean z, Object obj2, Object obj3, int i) {
        super(3, continuation);
        this.u = i;
        this.f2696y = z;
        this.z = obj2;
        this.A = obj3;
    }
}
