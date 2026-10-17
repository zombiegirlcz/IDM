package tpd;

import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import gim.i;
import go.g;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import w4l.h;
import yhm.o;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class e extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ xi0.b f273348w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, xi0.b bVar, Continuation continuation) {
        super(2, continuation);
        this.v = fVar;
        this.f273348w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, this.f273348w, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((od0.i) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        od0.i iVar = (od0.i) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        if (!iVar.d()) {
            return new g(new Data(f0.f322471a, null, false, 6, null), 2);
        }
        AccountId.Joint jointC = l38.a.c((n38.a) iVar.c());
        return nim.a.v(rd0.e.b(osg.b.g(this.v.f273349a, h.f294642c, null, null, null, null, null, jointC, 62)), new b(this.f273348w, jointC, 0));
    }
}
