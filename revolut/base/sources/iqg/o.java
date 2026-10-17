package iqg;

import b6d.r;
import com.revolut.data.model.Data;
import ghk.x;
import ip0.wk;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import pcd.s;

/* JADX INFO: loaded from: classes9.dex */
public final class o extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.vaults.impl.ui.details.spare_change.kompot.b f167850w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(com.revolut.feature.vaults.impl.ui.details.spare_change.kompot.b bVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f167850w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                o oVar = new o(this.f167850w, continuation, 0);
                oVar.v = obj2;
                return oVar;
            default:
                o oVar2 = new o(this.f167850w, continuation, 1);
                oVar2.v = obj2;
                return oVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((o) create((s) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((o) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        com.revolut.feature.vaults.impl.ui.details.spare_change.kompot.b bVar = this.f167850w;
        switch (i) {
            case 0:
                s sVar = (s) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return nim.a.v(rd0.e.b(nim.a.w(((r) bVar.f94747p).i(opg.c.b(sVar), w4l.i.f294643c), new x(bVar, 9))), new x(sVar, 10));
            default:
                Data data = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.f94751t, new wk(bVar, data, 17));
                return Unit.f186387a;
        }
    }
}
