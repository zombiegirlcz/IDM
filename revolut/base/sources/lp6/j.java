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
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ String A;
    public final /* synthetic */ e.a B;
    public final /* synthetic */ Boolean C;
    public int u;
    public final /* synthetic */ m v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ yo6.d f198942w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f198943x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ int f198944y;
    public final /* synthetic */ List z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(m mVar, yo6.d dVar, String str, int i, List list, String str2, e.a aVar, Boolean bool, Continuation continuation) {
        super(2, continuation);
        this.v = mVar;
        this.f198942w = dVar;
        this.f198943x = str;
        this.f198944y = i;
        this.z = list;
        this.A = str2;
        this.B = aVar;
        this.C = bool;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new j(this.v, this.f198942w, this.f198943x, this.f198944y, this.z, this.A, this.B, this.C, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
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
        String strB = this.f198942w.b();
        hp6.e eVar = new hp6.e(this.f198944y, this.z, this.A, this.B);
        this.u = 1;
        Object objPostFeedback = feedbackService.postFeedback(strB, this.f198943x, eVar, this.C, this);
        return objPostFeedback == aVar ? aVar : objPostFeedback;
    }
}
