package uye;

import com.revolut.feature.topup_screen.api.TopupApi$Toggles;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.n1;

/* JADX INFO: loaded from: classes8.dex */
public final class u extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ com.revolut.feature.topup_screen.impl.flows.topup.flow.i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ dj0.d f284323w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar, dj0.d dVar, Continuation continuation) {
        super(2, continuation);
        this.v = iVar;
        this.f284323w = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new u(this.v, this.f284323w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((u) create((n1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        dj0.d dVar = this.f284323w;
        com.revolut.feature.topup_screen.impl.flows.topup.flow.i iVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            if (((jte.d) iVar.f90947q).c(TopupApi$Toggles.TopUpCurrencyChooserImprovements.f90472c)) {
                pfm.r rVarN0 = iVar.E.n0(dVar.f115083b, e1f.c.a(iVar.o.f284275a));
                this.u = 1;
                if (nim.a.a(rVarN0, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        com.revolut.feature.topup_screen.impl.flows.topup.flow.i.I2(iVar, dVar.f115083b);
        return Unit.f186387a;
    }
}
