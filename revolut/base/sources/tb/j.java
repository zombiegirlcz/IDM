package tb;

import androidx.compose.ui.unit.Density;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes23.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ Density u;
    public final /* synthetic */ a0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ float f269383w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Density density, a0 a0Var, float f, Continuation continuation) {
        super(2, continuation);
        this.u = density;
        this.v = a0Var;
        this.f269383w = f;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new j(this.u, this.v, this.f269383w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        this.v.f269376c.setValue(Integer.valueOf(this.u.mo762roundToPx0680j_4(this.f269383w)));
        return Unit.f186387a;
    }
}
