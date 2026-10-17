package yj8;

import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ h v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ SingleChoiceDelegate.Model f314438w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(SingleChoiceDelegate.Model model, Continuation continuation, h hVar) {
        super(2, continuation);
        this.v = hVar;
        this.f314438w = model;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.f314438w, continuation, this.v);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            SingleChoiceDelegate.Model model = this.f314438w;
            h hVar = this.v;
            f fVar = new f(model, null, hVar);
            this.u = 1;
            if (hVar.p2(this, fVar) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
