package a6e;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class o extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s f1641w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(s sVar, Continuation continuation) {
        super(2, continuation);
        this.f1641w = sVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        o oVar = new o(this.f1641w, continuation);
        oVar.v = obj2;
        return oVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((o) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            Object obj3 = model.i;
            boolean z = obj3 instanceof uhf.i;
            s sVar = this.f1641w;
            if (z) {
                oqk.k kVar = sVar.f1647n;
                this.v = null;
                this.u = 1;
                if (kVar.b3(obj3, this) == aVar) {
                    return aVar;
                }
            } else {
                x6e.d dVar = sVar.f1648p;
                g6e.c event = new g6e.c(model);
                dVar.getClass();
                Intrinsics.checkNotNullParameter(event, "event");
                dVar.f303064a.onNext(event);
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
