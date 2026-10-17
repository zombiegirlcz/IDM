package aye;

import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.feature.topup_screen.impl.flows.stored_method.screen.india.details.IndiaStoredMethodDetailsScreen;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import vkm.j2;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ IndiaStoredMethodDetailsScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(IndiaStoredMethodDetailsScreen indiaStoredMethodDetailsScreen, Continuation continuation) {
        super(2, continuation);
        this.u = indiaStoredMethodDetailsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((ActionsView.Item) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        m mVar = (m) this.u.N.getValue();
        yte.e eVar = (yte.e) ((d) ((j2) mVar.f11148q.f22677a).getValue()).f11136a.getContent();
        if (eVar != null) {
            mVar.l2(new av7.l(mVar, eVar, null, 5), new yi5.b(26));
            return Unit.f186387a;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Attempting to remove method but indiaStoredMethodDetail is not loaded yet");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
        throw illegalArgumentException;
    }
}
