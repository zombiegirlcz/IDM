package o6f;

import com.revolut.core.ui_kit.delegates.TrendViewDelegate;
import com.revolut.core.ui_kit.delegates.hi;
import com.revolut.core.ui_kit.delegates.ii;
import com.revolut.core.ui_kit.delegates.ji;
import com.revolut.core.ui_kit.delegates.ki;
import com.revolut.core.ui_kit.delegates.li;
import com.revolut.core.ui_kit.delegates.mi;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ g7f.b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g7f.b bVar, Continuation continuation) {
        super(2, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((TrendViewDelegate.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object selection;
        TrendViewDelegate.a model = (TrendViewDelegate.a) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        b bVar = (b) this.v.f141197h;
        Intrinsics.h(model);
        m mVar = (m) bVar;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        a6f.f.Companion.getClass();
        if (model instanceof mi) {
            selection = new a6f.e(((mi) model).f54485b);
        } else if (model instanceof hi) {
            hi hiVar = (hi) model;
            selection = new a6f.c(hiVar.f54262b, hiVar.d);
        } else {
            if (!model.equals(TrendViewDelegate.a.C0428a.f53562a) && !(model instanceof ii) && !(model instanceof ji) && !(model instanceof ki) && !(model instanceof li)) {
                throw new NoWhenBranchMatchedException();
            }
            selection = a6f.d.f1671a;
        }
        mVar.X2(mVar.f222593q, new o3k.a(selection, 11));
        x5f.k kVar = mVar.o;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(selection, "selection");
        j2 j2Var = kVar.d;
        j2Var.getClass();
        j2Var.g(null, selection);
        return Unit.f186387a;
    }
}
