package qp6;

import a2f.k;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.feature.feedback.impl.ui.screen.comment.FeedbackCommentController;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ FeedbackCommentController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(FeedbackCommentController feedbackCommentController, Continuation continuation) {
        super(2, continuation);
        this.v = feedbackCommentController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((InputTextDelegate.TextData) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        InputTextDelegate.TextData textData = (InputTextDelegate.TextData) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        a aVar2 = (a) this.v.T.getValue();
        CharSequence comment = textData.f52598b;
        g gVar = (g) aVar2;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(comment, "comment");
        gVar.H2(gVar.f248302q, new k(14, comment));
        return Unit.f186387a;
    }
}
