package ame;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.tab.lifestyle.impl.ui.documents.LifestyleDocumentsScreen;
import com.revolut.feature.terms.api.model.Terms;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ LifestyleDocumentsScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(LifestyleDocumentsScreen lifestyleDocumentsScreen, Continuation continuation) {
        super(2, continuation);
        this.v = lifestyleDocumentsScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        f fVar = (f) this.v.P.getValue();
        Object obj3 = model.u;
        fVar.getClass();
        Terms terms = obj3 instanceof Terms ? (Terms) obj3 : null;
        if (terms != null) {
            fVar.C1(u0.b(((rre.d) fVar.f6362p).b(terms)));
        }
        return Unit.f186387a;
    }
}
