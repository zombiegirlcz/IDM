package pij;

import dfj.s3;
import dfj.v2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import nfj.s2;

/* JADX INFO: loaded from: classes11.dex */
public final class k1 extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b f236560w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k1(com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b bVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f236560w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new k1(this.f236560w, continuation, 0);
            default:
                return new k1(this.f236560w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((k1) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        boolean z = false;
        Continuation continuation = null;
        com.revolut.retail.feature.esim.impl.ui.screens.home.subscriptions.b bVar = this.f236560w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                v2 v2Var = bVar.f101084r;
                this.v = 1;
                nfj.m1 m1Var = (nfj.m1) v2Var.f114130a;
                m1Var.getClass();
                n3j.w wVar = new n3j.w(m1Var, z, continuation, 24);
                skm.p0 p0Var = skm.p0.f264001a;
                Object objJ = skm.e0.J(elm.f.f127540b, wVar, this);
                return objJ == aVar ? aVar : objJ;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                s3 s3Var = bVar.v;
                this.v = 1;
                s2 s2Var = (s2) s3Var.f114105a;
                s2Var.getClass();
                n3j.w wVar2 = new n3j.w(s2Var, z, continuation, 26);
                skm.p0 p0Var2 = skm.p0.f264001a;
                Object objJ2 = skm.e0.J(elm.f.f127540b, wVar2, this);
                return objJ2 == aVar2 ? aVar2 : objJ2;
        }
    }
}
