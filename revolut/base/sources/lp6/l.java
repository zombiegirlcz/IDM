package lp6;

import com.revolut.feature.feedback.impl.service.FeedbackService;
import hp6.e;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends gim.i implements Function2 {
    public final /* synthetic */ e.a A;
    public int u;
    public final /* synthetic */ m v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f198946w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f198947x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ List f198948y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, String str, int i, List list, String str2, e.a aVar, Continuation continuation) {
        super(2, continuation);
        this.v = mVar;
        this.f198946w = str;
        this.f198947x = i;
        this.f198948y = list;
        this.z = str2;
        this.A = aVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new l(this.v, this.f198946w, this.f198947x, this.f198948y, this.z, this.A, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((l) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            return obj2;
        }
        o.b(obj2);
        FeedbackService feedbackService = this.v.f198949a;
        hp6.e eVar = new hp6.e(this.f198947x, this.f198948y, this.z, this.A);
        this.u = 1;
        Object objUpdateFeedback = feedbackService.updateFeedback(this.f198946w, eVar, this);
        return objUpdateFeedback == aVar ? aVar : objUpdateFeedback;
    }
}
