package nme;

import com.revolut.feature.tab.lifestyle.impl.ui.screen.TabLifestyleScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class w extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TabLifestyleScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(TabLifestyleScreen tabLifestyleScreen, Continuation continuation) {
        super(2, continuation);
        this.v = tabLifestyleScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        w wVar = new w(this.v, continuation);
        wVar.u = obj2;
        return wVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        if (obj2 != null) {
            throw new ClassCastException();
        }
        ((w) create(null, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        throw null;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        if (this.u != null) {
            throw new ClassCastException();
        }
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        z zVarG3 = this.v.d();
        Intrinsics.h(null);
        ((com.revolut.feature.tab.lifestyle.impl.ui.screen.f) zVarG3).getClass();
        Intrinsics.checkNotNullParameter(null, "item");
        throw null;
    }
}
