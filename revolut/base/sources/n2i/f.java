package n2i;

import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import skm.e0;
import skm.p0;
import x0i.l;
import yhm.o;

/* JADX INFO: loaded from: classes10.dex */
public final class f extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ j v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CellDetailsSwitcherDelegate.Model f211550w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(j jVar, CellDetailsSwitcherDelegate.Model model, Continuation continuation) {
        super(2, continuation);
        this.v = jVar;
        this.f211550w = model;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new f(this.v, this.f211550w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object obj3 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            l lVar = this.v.f211555q;
            boolean z = !this.f211550w.f51915c;
            this.u = 1;
            lVar.getClass();
            mt8.b bVar = new mt8.b(lVar, z, null, 13);
            p0 p0Var = p0.f264001a;
            Object objJ = e0.J(elm.f.f127540b, bVar, this);
            if (objJ != obj3) {
                objJ = Unit.f186387a;
            }
            if (objJ == obj3) {
                return obj3;
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
