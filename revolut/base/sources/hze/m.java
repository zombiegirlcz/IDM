package hze;

import com.revolut.domain.models.topup.TopUpContext;
import com.revolut.feature.topup_screen.api.descriptor.CardTopUpType;
import com.revolut.feature.topup_screen.api.descriptor.FacadeCardTopupFlowDescriptor$InputData;
import e0f.i0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes8.dex */
public final class m extends gim.i implements Function1 {
    public Ref$ObjectRef u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Ref$ObjectRef f157163w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.flows.topup_flows.card_deferred_cvv.c f157164x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ CardTopUpType.RegularTopUp f157165y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(CardTopUpType.RegularTopUp regularTopUp, com.revolut.feature.topup_screen.impl.flows.topup_flows.card_deferred_cvv.c cVar, String str, Continuation continuation, Ref$ObjectRef ref$ObjectRef) {
        super(1, continuation);
        this.f157163w = ref$ObjectRef;
        this.f157164x = cVar;
        this.f157165y = regularTopUp;
        this.z = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new m(this.f157165y, this.f157164x, this.z, continuation, this.f157163w);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((m) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objA;
        Ref$ObjectRef ref$ObjectRef;
        com.revolut.feature.topup_screen.impl.flows.topup_flows.card_deferred_cvv.c cVar = this.f157164x;
        FacadeCardTopupFlowDescriptor$InputData facadeCardTopupFlowDescriptor$InputData = cVar.o;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        Ref$ObjectRef ref$ObjectRef2 = this.f157163w;
        if (i == 0) {
            yhm.o.b(obj2);
            rve.d dVar = cVar.f90988w;
            String str = facadeCardTopupFlowDescriptor$InputData.f90494b;
            dj0.d dVar2 = this.f157165y.f90489a;
            long j2 = dVar2.f115082a;
            String str2 = dVar2.f115083b.f306286a;
            io3.l lVarB = e1f.c.b(facadeCardTopupFlowDescriptor$InputData.f90495c);
            TopUpContext topUpContextD = facadeCardTopupFlowDescriptor$InputData.d;
            if (topUpContextD == null) {
                topUpContextD = e1f.c.d(facadeCardTopupFlowDescriptor$InputData.f90495c);
            }
            t61.k kVar = new t61.k(str, j2, str2, lVarB, topUpContextD);
            this.u = ref$ObjectRef2;
            this.v = 1;
            objA = dVar.a(kVar, null, this.z, this);
            if (objA != aVar) {
                ref$ObjectRef = ref$ObjectRef2;
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            return obj2;
        }
        Ref$ObjectRef ref$ObjectRef3 = this.u;
        yhm.o.b(obj2);
        ref$ObjectRef = ref$ObjectRef3;
        objA = obj2;
        ref$ObjectRef.f186409a = objA;
        i0 i0Var = cVar.v;
        zve.b bVar = (zve.b) ref$ObjectRef2.f186409a;
        this.u = null;
        this.v = 2;
        Object objA2 = i0Var.a(bVar, this);
        return objA2 == aVar ? aVar : objA2;
    }
}
