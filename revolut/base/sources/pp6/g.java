package pp6;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.feedback.impl.ui.screen.FeedbackController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ FeedbackController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(FeedbackController feedbackController, Continuation continuation) {
        super(2, continuation);
        this.v = feedbackController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        g gVar = new g(this.v, continuation);
        gVar.u = obj2;
        return gVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        a aVarD3 = this.v.d();
        CharSequence commentChange = textData.f52598b;
        k kVar = (k) aVarD3;
        kVar.getClass();
        Intrinsics.checkNotNullParameter(commentChange, "commentChange");
        kVar.H2(kVar.f238290s, new a2f.k(11, commentChange));
        return Unit.f186387a;
    }
}
