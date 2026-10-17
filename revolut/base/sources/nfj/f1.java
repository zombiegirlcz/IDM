package nfj;

import com.revolut.retail.feature.esim.impl.network.EsimProfilesService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes11.dex */
public final class f1 extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m1 f214942w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f1(m1 m1Var, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.f214942w = m1Var;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                return new f1(this.f214942w, continuation, 0).invokeSuspend(Unit.f186387a);
            default:
                return new f1(this.f214942w, continuation, 1).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        m1 m1Var = this.f214942w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    d1 d1Var = m1.Companion;
                    EsimProfilesService esimProfilesServiceB = m1Var.b();
                    this.v = 1;
                    obj2 = esimProfilesServiceB.getProfiles(null, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return ofj.m.b(((mfj.h) obj2).getList());
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    d1 d1Var2 = m1.Companion;
                    EsimProfilesService esimProfilesServiceB2 = m1Var.b();
                    this.v = 1;
                    obj2 = esimProfilesServiceB2.getConnectivityTroubleshootingScopes(this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return io3.h.I(((mfj.g) obj2).getItems());
        }
    }
}
