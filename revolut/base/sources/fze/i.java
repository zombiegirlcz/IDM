package fze;

import com.revolut.domain.models.topup.TopUpContext;
import com.revolut.feature.topup_screen.api.descriptor.CardTopUpType;
import com.revolut.feature.topup_screen.api.descriptor.FacadeCardTopupFlowDescriptor$InputData;
import e0f.i0;
import io3.l;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$ObjectRef;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class i extends gim.i implements Function1 {
    public Ref$ObjectRef u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Ref$ObjectRef f139185w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.flows.topup_flows.card.b f139186x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ CardTopUpType.RegularTopUp f139187y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(CardTopUpType.RegularTopUp regularTopUp, com.revolut.feature.topup_screen.impl.flows.topup_flows.card.b bVar, String str, Continuation continuation, Ref$ObjectRef ref$ObjectRef) {
        super(1, continuation);
        this.f139185w = ref$ObjectRef;
        this.f139186x = bVar;
        this.f139187y = regularTopUp;
        this.z = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new i(this.f139187y, this.f139186x, this.z, continuation, this.f139185w);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((i) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objA;
        Ref$ObjectRef ref$ObjectRef;
        com.revolut.feature.topup_screen.impl.flows.topup_flows.card.b bVar = this.f139186x;
        FacadeCardTopupFlowDescriptor$InputData facadeCardTopupFlowDescriptor$InputData = bVar.o;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        Ref$ObjectRef ref$ObjectRef2 = this.f139185w;
        if (i == 0) {
            o.b(obj2);
            rve.d dVar = bVar.u;
            String str = facadeCardTopupFlowDescriptor$InputData.f90494b;
            dj0.d dVar2 = this.f139187y.f90489a;
            long j2 = dVar2.f115082a;
            String str2 = dVar2.f115083b.f306286a;
            l lVarB = e1f.c.b(facadeCardTopupFlowDescriptor$InputData.f90495c);
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
            o.b(obj2);
            return obj2;
        }
        Ref$ObjectRef ref$ObjectRef3 = this.u;
        o.b(obj2);
        ref$ObjectRef = ref$ObjectRef3;
        objA = obj2;
        ref$ObjectRef.f186409a = objA;
        i0 i0Var = bVar.f90975t;
        zve.b bVar2 = (zve.b) ref$ObjectRef2.f186409a;
        this.u = null;
        this.v = 2;
        Object objA2 = i0Var.a(bVar2, this);
        return objA2 == aVar ? aVar : objA2;
    }
}
