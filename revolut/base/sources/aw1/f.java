package aw1;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.apm.breb.impl.ui.keys.BrebKeysScreen;
import com.revolut.feature.apm.core.models.alias.Alias;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes20.dex */
public final class f extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ BrebKeysScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(BrebKeysScreen brebKeysScreen, Continuation continuation) {
        super(2, continuation);
        this.v = brebKeysScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.v, continuation);
        fVar.u = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        m mVarD3 = this.v.R2();
        Intrinsics.h(model);
        q qVar = (q) mVarD3;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        String str = model.f53228a;
        if (obj3 instanceof Alias) {
            if (a0.H(str, "ITEM_DISABLED_ALIAS_ID_", false)) {
                qVar.C2(new j((Alias) obj3));
            } else if (a0.H(str, "ITEM_AVAILABLE_ALIAS_ID_", false)) {
                qVar.l2(new av7.l(qVar, (Alias) obj3, null, 3), new a08.e(1, qVar, q.class, "handleGenericOperationError", "handleGenericOperationError(Ljava/lang/Throwable;)Z", 0, 28));
            }
        }
        return Unit.f186387a;
    }
}
