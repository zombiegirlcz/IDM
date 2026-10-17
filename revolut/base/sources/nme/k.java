package nme;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.tab.lifestyle.impl.ui.screen.TabLifestyleScreen;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes8.dex */
public final class k extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TabLifestyleScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(TabLifestyleScreen tabLifestyleScreen, Continuation continuation) {
        super(2, continuation);
        this.v = tabLifestyleScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        k kVar = new k(this.v, continuation);
        kVar.u = obj2;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object obj3 = model.i;
        if (obj3 instanceof mme.a) {
            mme.a aVar2 = (mme.a) obj3;
            z zVarG3 = this.v.d();
            String slotId = aVar2.f207204a;
            boolean z = aVar2.f207205b;
            com.revolut.feature.tab.lifestyle.impl.ui.screen.f fVar = (com.revolut.feature.tab.lifestyle.impl.ui.screen.f) zVarG3;
            cli.y yVar = fVar.g0;
            Intrinsics.checkNotNullParameter(slotId, "slotId");
            fVar.N2(new imk.e(18, (z && ((com.revolut.feature.tab.lifestyle.impl.ui.screen.a) ((j2) yVar.f22677a).getValue()).f89929l.contains(slotId)) ? zhm.a1.j(((com.revolut.feature.tab.lifestyle.impl.ui.screen.a) ((j2) yVar.f22677a).getValue()).f89929l, slotId) : (z || ((com.revolut.feature.tab.lifestyle.impl.ui.screen.a) ((j2) yVar.f22677a).getValue()).f89929l.contains(slotId)) ? ((com.revolut.feature.tab.lifestyle.impl.ui.screen.a) ((j2) yVar.f22677a).getValue()).f89929l : zhm.a1.m(((com.revolut.feature.tab.lifestyle.impl.ui.screen.a) ((j2) yVar.f22677a).getValue()).f89929l, slotId)));
        } else {
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Large action button click not handled: " + model);
            zhm.h0 h0Var = zhm.h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
        }
        return Unit.f186387a;
    }
}
