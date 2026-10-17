package xmc;

import com.revolut.feature.robo.impl.ui.screen.acknowledgement.AgreementsScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AgreementsScreen f307124w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(AgreementsScreen agreementsScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f307124w = agreementsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f307124w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            default:
                c cVar2 = new c(this.f307124w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((zmc.m) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((zmc.l) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        AgreementsScreen agreementsScreen = this.f307124w;
        switch (i) {
            case 0:
                zmc.m mVar = (zmc.m) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                l lVarI3 = agreementsScreen.i3();
                Intrinsics.h(mVar);
                ((f0) lVarI3).accept(new g(mVar));
                break;
            default:
                zmc.l lVar = (zmc.l) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                l lVarI32 = agreementsScreen.i3();
                Intrinsics.h(lVar);
                ((f0) lVarI32).accept(new f(lVar));
                break;
        }
        return Unit.f186387a;
    }
}
