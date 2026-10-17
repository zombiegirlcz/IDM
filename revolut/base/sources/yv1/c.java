package yv1;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.apm.breb.impl.ui.key_replace.BrebKeyReplaceScreen;
import com.revolut.feature.apm.core.models.alias.Alias;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ BrebKeyReplaceScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(BrebKeyReplaceScreen brebKeyReplaceScreen, Continuation continuation) {
        super(2, continuation);
        this.v = brebKeyReplaceScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        c cVar = new c(this.v, continuation);
        cVar.u = obj2;
        return cVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        i iVar = (i) this.v.R.getValue();
        Intrinsics.h(model);
        l lVar = (l) iVar;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(model, "model");
        Object obj3 = model.u;
        if ((obj3 instanceof Alias) && a0.H(model.f53228a, "ITEM_REPLACE_ALIAS_ID_", false)) {
            lVar.l2(new k(lVar, (Alias) obj3, null, 0), new yea.l(1, lVar, l.class, "handleGenericOperationError", "handleGenericOperationError(Ljava/lang/Throwable;)Z", 0, 15));
        }
        return Unit.f186387a;
    }
}
