package i8d;

import com.revolut.core.faq.data.network.FaqFeedbackService;
import com.revolut.feature.feedback.api.domain.Feedback;
import com.revolut.feature.feedback.api.domain.FeedbackAdditionalData;
import com.revolut.feature.feedback.api.domain.FeedbackTag;
import efm.d0;
import efm.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pfm.t;
import wf0.l;
import yhm.o;
import zhm.w;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ e f159504w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(e eVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f159504w = eVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.f159504w, continuation, 0);
            default:
                return new c(this.f159504w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((c) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String string;
        ArrayList arrayList;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                e eVar = this.f159504w;
                if (i == 0) {
                    o.b(obj2);
                    r rVarFilter = ((l) ((hg0.c) eVar.f159507q).f152044b).e.f(Unit.f186387a, false).filter(new w4l.c(new wd3.a(16), 24));
                    Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
                    d0 d0VarL = prk.o.l(rVarFilter, null, null, 3, "firstOrError(...)");
                    this.v = 1;
                    obj2 = nim.a.b(d0VarL, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                List list = (List) obj2;
                cji.d dVar = eVar.f159508r;
                Intrinsics.h(list);
                dVar.d(list);
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    e eVar2 = this.f159504w;
                    hg0.b bVar = eVar2.f159507q;
                    Feedback feedback = eVar2.f159506p.f86251a;
                    String faqKey = feedback.f73126b;
                    String feedbackId = feedback.f73125a;
                    List listD1 = zhm.d0.d1((Iterable) eVar2.f159509s.a());
                    CharSequence charSequence = (CharSequence) eVar2.f159510t.a();
                    if (charSequence instanceof String) {
                        string = (String) charSequence;
                    } else {
                        StringBuilder sb6 = new StringBuilder(charSequence.length());
                        sb6.append(charSequence);
                        string = sb6.toString();
                    }
                    FeedbackAdditionalData additionalData = new FeedbackAdditionalData(listD1, string);
                    hg0.c cVar = (hg0.c) bVar;
                    cVar.getClass();
                    Intrinsics.checkNotNullParameter(faqKey, "faqKey");
                    Intrinsics.checkNotNullParameter(feedbackId, "feedbackId");
                    Intrinsics.checkNotNullParameter(additionalData, "additionalData");
                    l lVar = (l) cVar.f152044b;
                    lVar.getClass();
                    Intrinsics.checkNotNullParameter(faqKey, "faqKey");
                    Intrinsics.checkNotNullParameter(feedbackId, "feedbackId");
                    Intrinsics.checkNotNullParameter(additionalData, "additionalData");
                    FaqFeedbackService faqFeedbackService = lVar.f296898a;
                    Intrinsics.checkNotNullParameter(additionalData, "<this>");
                    if (listD1 != null) {
                        List list2 = listD1;
                        arrayList = new ArrayList(w.t(list2, 10));
                        Iterator it8 = list2.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(((FeedbackTag) it8.next()).f73133a);
                        }
                    } else {
                        arrayList = null;
                    }
                    t tVarL = faqFeedbackService.editFeedbackFaq(feedbackId, new cg0.g(additionalData.f73129b, arrayList)).l(new v3e.t(lVar, faqKey, 15));
                    Intrinsics.checkNotNullExpressionValue(tVarL, "doOnComplete(...)");
                    pfm.r rVarG0 = te0.w.g0(tVarL);
                    this.v = 1;
                    if (nim.a.a(rVarG0, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
