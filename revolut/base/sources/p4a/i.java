package p4a;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ j v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ RowDelegate.Model f232870w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(RowDelegate.Model model, Continuation continuation, j jVar) {
        super(2, continuation);
        this.v = jVar;
        this.f232870w = model;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new i(this.f232870w, continuation, this.v);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            return obj2;
        }
        o.b(obj2);
        RowDelegate.Model model = this.f232870w;
        j jVar = this.v;
        h hVar = new h(model, null, jVar);
        this.u = 1;
        Object objB = pu7.a.B(jVar.k, "onRowItemClicked", hVar, this);
        return objB == aVar ? aVar : objB;
    }
}
