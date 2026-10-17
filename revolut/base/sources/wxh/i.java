package wxh;

import aii.u;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import qua.p;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class i extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ CellDetailsChevronDelegate.Model v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f300991w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(CellDetailsChevronDelegate.Model model, j jVar, Continuation continuation) {
        super(2, continuation);
        this.v = model;
        this.f300991w = jVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new i(this.v, this.f300991w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        j jVar = this.f300991w;
        if (i == 0) {
            o.b(obj2);
            Object obj3 = this.v.e;
            p pVar = obj3 instanceof p ? (p) obj3 : null;
            if (pVar == null) {
                return Unit.f186387a;
            }
            mde.e eVar = jVar.f300993m;
            this.u = 1;
            obj2 = eVar.h(pVar, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        u uVar = (u) obj2;
        if (uVar != null) {
            jVar.A2(uVar);
        }
        return Unit.f186387a;
    }
}
