package u8d;

import com.revolut.core.ui_kit.delegates.SearchButtonDelegate;
import com.revolut.feature.shared.help_centre.impl.faq.screens.something_else.FaqSomethingElseScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class k extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ FaqSomethingElseScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(FaqSomethingElseScreen faqSomethingElseScreen, Continuation continuation) {
        super(2, continuation);
        this.v = faqSomethingElseScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        k kVar = new k(this.v, continuation);
        kVar.u = obj2;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((SearchButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SearchButtonDelegate.Model model = (SearchButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        ((g) ((e) this.v.c0.getValue())).y2(null, model.f53284a);
        return Unit.f186387a;
    }
}
