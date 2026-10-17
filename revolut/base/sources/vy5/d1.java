package vy5;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d1 extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ cc7.l f293146w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(cc7.l lVar, Continuation continuation) {
        super(2, continuation);
        this.f293146w = lVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d1 d1Var = new d1(this.f293146w, continuation);
        d1Var.v = obj2;
        return d1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d1) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
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
            cc7.l lVar = this.f293146w;
            if (z) {
                oqk.k kVar = (oqk.k) lVar.o;
                this.v = null;
                this.u = 1;
                if (kVar.b3(obj3, this) == aVar) {
                    return aVar;
                }
            } else {
                w wVar = (w) lVar.f22957n;
                wVar.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                j60.a.v(wVar.o, true, null, 2);
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
