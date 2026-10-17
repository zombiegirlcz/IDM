package nme;

import com.revolut.core.ui_kit.delegates.HybridTileDelegate;
import com.revolut.feature.tab.lifestyle.impl.ui.payload.FeedSlotPayload;
import com.revolut.feature.tab.lifestyle.impl.ui.screen.TabLifestyleScreen;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ TabLifestyleScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(TabLifestyleScreen tabLifestyleScreen, Continuation continuation) {
        super(2, continuation);
        this.v = tabLifestyleScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((HybridTileDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        HybridTileDelegate.Model item = (HybridTileDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        z zVarG3 = this.v.d();
        Intrinsics.h(item);
        com.revolut.feature.tab.lifestyle.impl.ui.screen.f fVar = (com.revolut.feature.tab.lifestyle.impl.ui.screen.f) zVarG3;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(item, "item");
        Object obj3 = item.k;
        FeedSlotPayload feedSlotPayload = obj3 instanceof FeedSlotPayload ? (FeedSlotPayload) obj3 : null;
        if (feedSlotPayload != null) {
            String str = feedSlotPayload.d;
            if (str != null) {
                fVar.M2(str, feedSlotPayload.e, feedSlotPayload);
            } else {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Hybrid tile footer clicked but the deeplink is null");
                zhm.h0 h0Var = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
            }
        }
        return Unit.f186387a;
    }
}
