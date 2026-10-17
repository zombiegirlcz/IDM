package jd7;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.feature.html_viewer.impl.screen.HtmlViewerScreen;
import jcj.n;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ HtmlViewerScreen u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(HtmlViewerScreen htmlViewerScreen, Continuation continuation) {
        super(2, continuation);
        this.u = htmlViewerScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((FullScreenStateDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        l lVar = (l) ((h) this.u.R.getValue());
        lVar.H2(lVar.f172997s, new n(26));
        lVar.f172996r.a();
        return Unit.f186387a;
    }
}
