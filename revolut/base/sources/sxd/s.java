package sxd;

import com.revolut.domain.models.topup.AutoTopUpState;
import com.revolut.feature.standingordertopup.impl.ui.screen.edit_order.EditTopUpOrderScreenContract$InputData;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes7.dex */
public final class s extends gim.i implements Function2 {
    public dj0.d u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ z f266447w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(z zVar, Continuation continuation) {
        super(2, continuation);
        this.f266447w = zVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new s(this.f266447w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((s) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        dj0.d dVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        z zVar = this.f266447w;
        if (i == 0) {
            yhm.o.b(obj2);
            EditTopUpOrderScreenContract$InputData editTopUpOrderScreenContract$InputData = zVar.o;
            AutoTopUpState autoTopUpState = editTopUpOrderScreenContract$InputData.f88204b;
            dj0.d dVar2 = autoTopUpState.e;
            dj0.d dVar3 = (dVar2 == null || !autoTopUpState.f60421a) ? null : dVar2;
            e0 e0Var = zVar.f266455r;
            xi0.b bVar = editTopUpOrderScreenContract$InputData.f88203a;
            this.u = dVar3;
            this.v = 1;
            obj2 = e0Var.a(bVar, false, dVar3, this);
            if (obj2 == aVar) {
                return aVar;
            }
            dVar = dVar3;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dVar = this.u;
            yhm.o.b(obj2);
        }
        zVar.H2(zVar.f266458w, new n((List) obj2, zVar, dVar, 1));
        return Unit.f186387a;
    }
}
