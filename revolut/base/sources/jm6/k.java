package jm6;

import e7l.g;
import efm.r;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends gim.i implements Function1 {
    public boolean u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.external_accounts.impl.ui.flow.link_external.b f176485w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.revolut.feature.external_accounts.impl.ui.flow.link_external.b bVar, Continuation continuation) {
        super(1, continuation);
        this.f176485w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new k(this.f176485w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((k) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        boolean z;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        com.revolut.feature.external_accounts.impl.ui.flow.link_external.b bVar = this.f176485w;
        if (i == 0) {
            o.b(obj2);
            this.v = 1;
            obj2 = com.revolut.feature.external_accounts.impl.ui.flow.link_external.b.K2(bVar, this);
            if (obj2 != aVar) {
            }
            return aVar;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = this.u;
            o.b(obj2);
            return new e(z, (e7l.f) obj2);
        }
        o.b(obj2);
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        fk3.a aVar2 = bVar.f72919p;
        r rVarG = m70.a.g(zi0.c.J(((ik3.c) aVar2).l(g.b.f123407a, w4l.h.f294642c)), null, null, 3);
        this.u = zBooleanValue;
        this.v = 2;
        Object objE = nim.a.e(rVarG, this);
        if (objE != aVar) {
            z = zBooleanValue;
            obj2 = objE;
            return new e(z, (e7l.f) obj2);
        }
        return aVar;
    }
}
