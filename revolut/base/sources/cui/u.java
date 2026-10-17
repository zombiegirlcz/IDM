package cui;

import cli.y;
import com.revolut.feature.topup_screen.api.config.TopUpConfig;
import com.revolut.feature.topup_screen.api.destination.InitTopUpDestination;
import cui.n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import nii.l1;

/* JADX INFO: loaded from: classes10.dex */
public final class u extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.checkout.b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.checkout.b bVar, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        u uVar = new u(this.v, continuation);
        uVar.u = obj2;
        return uVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((u) create((gui.f) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        com.revolut.retail.feature.airport.security_fast_track.impl.ui.screens.checkout.b bVar = this.v;
        y yVar = bVar.z;
        gui.f fVar = (gui.f) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        if (fVar instanceof gui.c) {
            bVar.H2(yVar, new s(3));
        } else if (fVar instanceof gui.d) {
            bVar.H2(yVar, new s(4));
            gui.d dVar = (gui.d) fVar;
            bVar.C2(new m(dVar.f146948a, dVar.f146949b, dVar.f146950c, dVar.d));
        } else if (fVar instanceof gui.e) {
            bVar.H2(yVar, new s(5));
            bVar.C2(n.a.f109015a);
        } else if (fVar instanceof gui.b) {
            bVar.H2(yVar, new s(6));
            gui.b bVar2 = (gui.b) fVar;
            if (bVar2.f146946b instanceof l1) {
                bVar.C1(new InitTopUpDestination(TopUpConfig.Companion.a(TopUpConfig.INSTANCE, bVar2.f146945a, null, null, 30)));
            }
        } else {
            if (!(fVar instanceof gui.a)) {
                throw new NoWhenBranchMatchedException();
            }
            bVar.H2(yVar, new s(7));
            gui.a aVar2 = (gui.a) fVar;
            if (aVar2.f146944b && !aVar2.f146943a) {
                bVar.I2();
            }
        }
        return Unit.f186387a;
    }
}
