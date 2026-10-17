package sxd;

import com.revolut.domain.models.topup.AutoTopUpState;
import com.revolut.feature.standingordertopup.impl.ui.screen.edit_order.EditTopUpOrderScreenContract$InputData;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes7.dex */
public final class o extends gim.i implements Function2 {
    public dj0.d u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z f266442w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(z zVar, Continuation continuation) {
        super(2, continuation);
        this.f266442w = zVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new o(this.f266442w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((o) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        dj0.d dVar;
        z zVar = this.f266442w;
        EditTopUpOrderScreenContract$InputData editTopUpOrderScreenContract$InputData = zVar.o;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        boolean z = false;
        if (i == 0) {
            yhm.o.b(obj2);
            efm.d0 d0VarF = zVar.f266456s.f(false);
            this.v = 1;
            obj2 = nim.a.b(d0VarF, this);
            if (obj2 != aVar) {
            }
            return aVar;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dVar = this.u;
            yhm.o.b(obj2);
            zVar.H2(zVar.f266458w, new n((List) obj2, zVar, dVar, 0));
            return Unit.f186387a;
        }
        yhm.o.b(obj2);
        do3.n nVar = (do3.n) obj2;
        AutoTopUpState autoTopUpState = editTopUpOrderScreenContract$InputData.f88204b;
        dj0.d dVar2 = autoTopUpState.f;
        dj0.d dVar3 = (dVar2 == null || !autoTopUpState.f60421a) ? null : dVar2;
        e0 e0Var = zVar.f266455r;
        xi0.b bVar = editTopUpOrderScreenContract$InputData.f88203a;
        Intrinsics.h(nVar);
        wi0.b.Companion.getClass();
        if (te0.w.S(nVar, wi0.b.f297770q3)) {
            xi0.b bVar2 = editTopUpOrderScreenContract$InputData.f88203a;
            xi0.b.Companion.getClass();
            if (Intrinsics.f(bVar2, xi0.b.i)) {
                z = true;
            }
        }
        this.u = dVar3;
        this.v = 2;
        obj2 = e0Var.a(bVar, z, dVar3, this);
        if (obj2 != aVar) {
            dVar = dVar3;
            zVar.H2(zVar.f266458w, new n((List) obj2, zVar, dVar, 0));
            return Unit.f186387a;
        }
        return aVar;
    }
}
