package s6e;

import com.revolut.feature.subaccount.api.models.Subaccount;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import zh9.u0;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f260261w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(b bVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f260261w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                a aVar = new a(this.f260261w, continuation, 0);
                aVar.v = obj2;
                return aVar;
            default:
                a aVar2 = new a(this.f260261w, continuation, 1);
                aVar2.v = obj2;
                return aVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        Subaccount subaccount = (Subaccount) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((a) create(subaccount, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        b bVar = this.f260261w;
        switch (i) {
            case 0:
                Subaccount subaccount = (Subaccount) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                return ((z) bVar.f260262a).t(subaccount);
            default:
                Subaccount subaccount2 = (Subaccount) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                vkm.d dVarB = rd0.e.b(((yua.q) bVar.f260263b).q(subaccount2.getF88959a().f234881a));
                Flow flowT = ((z) bVar.f260262a).t(subaccount2);
                etj.o oVar = (etj.o) bVar.f260264c;
                Intrinsics.checkNotNullParameter(subaccount2, "subaccount");
                return nim.a.v(u0.i(dVarB, flowT, oVar.l(new e38.c(oVar, subaccount2, (Continuation) null, 29))), new s65.r(11));
        }
    }
}
