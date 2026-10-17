package i8d;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.shared.help_centre.impl.faq.screens.feedback.SharedEditFaqFeedbackScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class k extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ SharedEditFaqFeedbackScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(SharedEditFaqFeedbackScreen sharedEditFaqFeedbackScreen, Continuation continuation) {
        super(2, continuation);
        this.v = sharedEditFaqFeedbackScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        k kVar = new k(this.v, continuation);
        kVar.u = obj2;
        return kVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        e eVar = (e) this.v.f86252a0.getValue();
        CharSequence comment = textData.f52598b;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(comment, "comment");
        eVar.f159510t.d(comment);
        return Unit.f186387a;
    }
}
