package qp6;

import cli.y;
import com.revolut.feature.feedback.impl.ui.screen.comment.FeedbackCommentContract$InputData;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.text.d0;
import lp6.m;
import qp6.c;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends i implements Function1 {
    public int u;
    public final /* synthetic */ g v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, Continuation continuation) {
        super(1, continuation);
        this.v = gVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new f(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((f) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        g gVar = this.v;
        y yVar = gVar.f248302q;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            dp6.a aVar2 = gVar.f248301p;
            FeedbackCommentContract$InputData feedbackCommentContract$InputData = gVar.o;
            String str = feedbackCommentContract$InputData.f73157a;
            int i2 = feedbackCommentContract$InputData.f73158b;
            String string = ((b) ((j2) yVar.f22677a).getValue()).f248296a.toString();
            if (d0.W(string)) {
                string = null;
            }
            String str2 = string;
            this.u = 1;
            if (((m) aVar2).f(str, i2, str2, null, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        gVar.H2(yVar, new qnd.c(26));
        gVar.C2(c.a.f248299a);
        return Unit.f186387a;
    }
}
