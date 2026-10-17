package qp6;

import android.view.View;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.feedback.impl.ui.screen.comment.FeedbackCommentController;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends i implements Function2 {
    public final /* synthetic */ View u;
    public final /* synthetic */ FeedbackCommentController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(View view, FeedbackCommentController feedbackCommentController, Continuation continuation) {
        super(2, continuation);
        this.u = view;
        this.v = feedbackCommentController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        kli.c.c(this.u, false);
        g gVar = (g) ((a) this.v.T.getValue());
        gVar.getClass();
        gVar.l2(new qc8.b(gVar, null, 12), new yi5.b(26));
        return Unit.f186387a;
    }
}
