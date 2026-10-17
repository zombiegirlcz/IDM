package unc;

import com.revolut.data.model.Data;
import com.revolut.feature.robo.impl.ui.screen.spare_change.PortfolioSpareChangeScreenContract$DomainState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;

/* JADX INFO: loaded from: classes6.dex */
public final class z extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b0 f281417w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(b0 b0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f281417w = b0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                z zVar = new z(this.f281417w, continuation, 0);
                zVar.v = obj2;
                return zVar;
            case 1:
                z zVar2 = new z(this.f281417w, continuation, 1);
                zVar2.v = obj2;
                return zVar2;
            case 2:
                z zVar3 = new z(this.f281417w, continuation, 2);
                zVar3.v = obj2;
                return zVar3;
            default:
                z zVar4 = new z(this.f281417w, continuation, 3);
                zVar4.v = obj2;
                return zVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((z) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        b0 b0Var = this.f281417w;
        switch (i) {
            case 0:
                Data data = (Data) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                b0Var.H2(b0Var.v, new y(data, 0));
                break;
            case 1:
                od0.i iVar = (od0.i) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                cli.y yVar = b0Var.v;
                if (((PortfolioSpareChangeScreenContract$DomainState) ((j2) yVar.f22677a).getValue()).f85204b == null) {
                    b0Var.H2(yVar, new djc.z(23, iVar));
                }
                break;
            case 2:
                Data data2 = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                b0Var.H2(b0Var.v, new y(data2, 1));
                break;
            default:
                Data data3 = (Data) this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                b0Var.H2(b0Var.v, new y(data3, 2));
                break;
        }
        return Unit.f186387a;
    }
}
