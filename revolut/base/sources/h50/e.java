package h50;

import com.revolut.chat.ui.messagefeedback.MessageFeedbackController;
import com.revolut.feature.feedback.api.domain.FeedbackTag;
import gvi.s;
import ip0.y;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes19.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ MessageFeedbackController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(MessageFeedbackController messageFeedbackController, Continuation continuation) {
        super(2, continuation);
        this.v = messageFeedbackController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((y) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        y yVar = (y) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        if (Intrinsics.f(yVar.f167225a, "FEEDBACK_EXTENSION_ACTIONS_LIST_ID")) {
            Object obj3 = yVar.f167226b.f58324n;
            FeedbackTag tag2 = obj3 instanceof FeedbackTag ? (FeedbackTag) obj3 : null;
            if (tag2 == null) {
                return Unit.f186387a;
            }
            dli.b bVarR2 = this.v.R2();
            Intrinsics.i(bVarR2, "null cannot be cast to non-null type com.revolut.chat.ui.messagefeedback.MessageFeedbackContract.ScreenModelApi");
            h hVar = (h) bVarR2;
            Intrinsics.checkNotNullParameter(tag2, "tag");
            cli.y yVar2 = hVar.o;
            hVar.H2(yVar2, new s(((i) ((j2) yVar2.f22677a).getValue()).d, tag2, 21));
        }
        return Unit.f186387a;
    }
}
