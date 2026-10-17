package pp6;

import com.revolut.feature.feedback.api.domain.FeedbackTag;
import com.revolut.feature.feedback.impl.ui.screen.FeedbackController;
import ip0.u80;
import ip0.y;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ FeedbackController f238285w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(FeedbackController feedbackController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f238285w = feedbackController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                f fVar = new f(this.f238285w, continuation, 0);
                fVar.v = obj2;
                return fVar;
            default:
                f fVar2 = new f(this.f238285w, continuation, 1);
                fVar2.v = obj2;
                return fVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f) create((u80) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f) create((y) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        FeedbackController feedbackController = this.f238285w;
        switch (i) {
            case 0:
                u80 clickData = (u80) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                a aVarD3 = feedbackController.d();
                Intrinsics.h(clickData);
                int i2 = clickData.f166632b;
                k kVar = (k) aVarD3;
                kVar.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                cli.y yVar = kVar.f238290s;
                yo6.e eVar = ((b) ((j2) yVar.f22677a).getValue()).f238280c;
                if (eVar == null || eVar.c() != i2) {
                    for (yo6.e eVar2 : yo6.e.a()) {
                        if (eVar2.c() == i2) {
                            kVar.H2(yVar, new pp5.d(eVar2, 1));
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                return Unit.f186387a;
            default:
                y clickData2 = (y) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                if (Intrinsics.f(clickData2.f167225a, "FEEDBACK_EXTENSION_ACTIONS_LIST_ID")) {
                    k kVar2 = (k) feedbackController.d();
                    cli.y yVar2 = kVar2.f238290s;
                    Intrinsics.checkNotNullParameter(clickData2, "clickData");
                    Object obj3 = clickData2.f167226b.f58324n;
                    FeedbackTag feedbackTag = obj3 instanceof FeedbackTag ? (FeedbackTag) obj3 : null;
                    if (feedbackTag != null) {
                        Set set = ((b) ((j2) yVar2.f22677a).getValue()).d;
                        kVar2.H2(yVar2, new l1.e(set, set.contains(feedbackTag), feedbackTag, 29));
                    }
                }
                return Unit.f186387a;
        }
    }
}
