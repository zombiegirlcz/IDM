package uk2;

import com.revolut.feature.atm.impl.ui.redesign.v2.atm_list.AtmListScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes21.dex */
public final class o extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AtmListScreen f280658w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(AtmListScreen atmListScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f280658w = atmListScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                o oVar = new o(this.f280658w, continuation, 0);
                oVar.v = obj2;
                return oVar;
            default:
                o oVar2 = new o(this.f280658w, continuation, 1);
                oVar2.v = obj2;
                return oVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((o) create((zv0.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((o) create((k) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        AtmListScreen atmListScreen = this.f280658w;
        switch (i) {
            case 0:
                zv0.b bVar = (zv0.b) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                zv0.a aVarD = pd.b.d(atmListScreen);
                if (aVarD != null) {
                    aVarD.setExpandableModalState(bVar);
                }
                break;
            default:
                k kVar = (k) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                atmListScreen.e3().I2(kVar);
                break;
        }
        return Unit.f186387a;
    }
}
