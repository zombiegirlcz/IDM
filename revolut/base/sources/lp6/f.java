package lp6;

import com.revolut.feature.feedback.impl.service.FeedbackService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ m f198935w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ yo6.d f198936x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f198937y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(m mVar, yo6.d dVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f198935w = mVar;
        this.f198936x = dVar;
        this.f198937y = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.f198935w, this.f198936x, this.f198937y, continuation, 0);
            default:
                return new f(this.f198935w, this.f198936x, this.f198937y, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                FeedbackService feedbackService = this.f198935w.f198949a;
                String strB = this.f198936x.b();
                this.v = 1;
                Object feedbackConfig = feedbackService.getFeedbackConfig(strB, this.f198937y, this);
                return feedbackConfig == aVar ? aVar : feedbackConfig;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                FeedbackService feedbackService2 = this.f198935w.f198949a;
                String strB2 = this.f198936x.b();
                this.v = 1;
                Object feedbackActions = feedbackService2.getFeedbackActions(strB2, this.f198937y, this);
                return feedbackActions == aVar2 ? aVar2 : feedbackActions;
        }
    }
}
