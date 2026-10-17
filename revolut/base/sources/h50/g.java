package h50;

import cli.y;
import com.revolut.chat.ui.messagefeedback.MessageFeedbackController;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.feedback.api.domain.FeedbackTag;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yhm.o;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes19.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ MessageFeedbackController u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(MessageFeedbackController messageFeedbackController, Continuation continuation) {
        super(2, continuation);
        this.u = messageFeedbackController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        dli.b bVarR2 = this.u.R2();
        Intrinsics.i(bVarR2, "null cannot be cast to non-null type com.revolut.chat.ui.messagefeedback.MessageFeedbackContract.ScreenModelApi");
        h hVar = (h) bVarR2;
        y yVar = hVar.o;
        String str = ((i) ((j2) yVar.f22677a).getValue()).e;
        if (str.length() <= 0) {
            str = null;
        }
        List listD1 = d0.d1(((i) ((j2) yVar.f22677a).getValue()).d);
        ArrayList arrayList = new ArrayList(w.t(listD1, 10));
        Iterator it8 = listD1.iterator();
        while (it8.hasNext()) {
            arrayList.add(((FeedbackTag) it8.next()).f73133a);
        }
        hVar.C2(new b(str, arrayList));
        return Unit.f186387a;
    }
}
