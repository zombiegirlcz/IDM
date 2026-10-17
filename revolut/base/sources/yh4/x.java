package yh4;

import ft3.h1;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes22.dex */
public final class x extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.set_up.a f313772w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.set_up.a aVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f313772w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new x(this.f313772w, continuation, 0);
            default:
                return new x(this.f313772w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((x) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        com.revolut.feature.credit.application.plugins.impl.ui.sepa_direct_debit.set_up.a aVar = this.f313772w;
        switch (i) {
            case 0:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                ey3.a aVar3 = aVar.f68367p;
                h1 h1Var = aVar.o.f68363a;
                this.v = 1;
                i44.b bVar = aVar3.f130563a;
                bVar.getClass();
                i44.a aVar4 = new i44.a(bVar, h1Var, null, 0);
                p0 p0Var = p0.f264001a;
                Object objJ = e0.J(elm.f.f127540b, aVar4, this);
                return objJ == aVar2 ? aVar2 : objJ;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                b45.h hVar = aVar.f68368q;
                this.v = 1;
                Serializable serializableA = hVar.a(this);
                return serializableA == aVar5 ? aVar5 : serializableA;
        }
    }
}
