package wf0;

import com.revolut.core.faq.data.network.FaqFeedbackService;
import com.revolut.feature.feedback.api.domain.Feedback;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class l implements g {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FaqFeedbackService f296898a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f296899b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne0.j f296900c;
    public final w4l.f d;
    public final w4l.f e;

    public l(FaqFeedbackService faqFeedbackService, ne0.j faqFeedbackCache, ne0.j tagsForFaqFeedbackCache) {
        Intrinsics.checkNotNullParameter(faqFeedbackService, "faqFeedbackService");
        Intrinsics.checkNotNullParameter(faqFeedbackCache, "faqFeedbackCache");
        Intrinsics.checkNotNullParameter(tagsForFaqFeedbackCache, "tagsForFaqFeedbackCache");
        this.f296898a = faqFeedbackService;
        this.f296899b = faqFeedbackCache;
        this.f296900c = tagsForFaqFeedbackCache;
        final int i = 3;
        Function2 function2 = new Function2(this) { // from class: wf0.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f296890b;

            {
                this.f296890b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i2 = i;
                l lVar = this.f296890b;
                switch (i2) {
                    case 0:
                        String faqKey = (String) obj2;
                        Feedback feedback = (Feedback) obj3;
                        Intrinsics.checkNotNullParameter(faqKey, "faqKey");
                        Intrinsics.checkNotNullParameter(feedback, "feedback");
                        lVar.f296899b.f(faqKey, feedback);
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        efm.d0<cg0.g0> tagsForFaqFeedback = lVar.f296898a.getTagsForFaqFeedback();
                        w4l.c cVar = new w4l.c(new wd3.a(15), 23);
                        tagsForFaqFeedback.getClass();
                        ufm.i iVar = new ufm.i(tagsForFaqFeedback, cVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 2:
                        List tags = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(tags, "tags");
                        lVar.f296900c.f("KEY_CACHE_TAGS_FOR_FAQ_FEEDBACK", tags);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String faqKey2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(faqKey2, "faqKey");
                        rfm.w wVarH0 = te0.w.h0(lVar.f296898a.getFeedbackForFaq(faqKey2));
                        k kVar = k.f;
                        rfm.m mVar = new rfm.m(wVarH0, new vf0.q(21), 1);
                        w4l.c cVar2 = new w4l.c(new wd3.a(14), 22);
                        dfm.c cVar3 = mfm.f.d;
                        rfm.y yVar = new rfm.y(mVar, cVar3, cVar3, cVar2, mfm.f.f205043c);
                        Feedback.INSTANCE.getClass();
                        Feedback feedback2 = Feedback.f73124g;
                        mfm.f.b(feedback2, "item is null");
                        rfm.f0 f0VarP = new rfm.f(yVar, new mfm.d(feedback2), 3).p(feedback2);
                        Intrinsics.checkNotNullExpressionValue(f0VarP, "toSingle(...)");
                        return f0VarP;
                }
            }
        };
        final int i2 = 2;
        Function1 function1 = new Function1(this) { // from class: wf0.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f296894b;

            {
                this.f296894b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        String faqKey = (String) obj2;
                        Intrinsics.checkNotNullParameter(faqKey, "faqKey");
                        this.f296894b.f296899b.remove(faqKey);
                        return Unit.f186387a;
                    case 1:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f296894b.f296900c.get("KEY_CACHE_TAGS_FOR_FAQ_FEEDBACK");
                    default:
                        String faqKey2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(faqKey2, "faqKey");
                        return (Feedback) this.f296894b.f296899b.get(faqKey2);
                }
            }
        };
        final int i3 = 0;
        this.d = new w4l.f(function2, function1, new Function2(this) { // from class: wf0.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f296890b;

            {
                this.f296890b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i22 = i3;
                l lVar = this.f296890b;
                switch (i22) {
                    case 0:
                        String faqKey = (String) obj2;
                        Feedback feedback = (Feedback) obj3;
                        Intrinsics.checkNotNullParameter(faqKey, "faqKey");
                        Intrinsics.checkNotNullParameter(feedback, "feedback");
                        lVar.f296899b.f(faqKey, feedback);
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        efm.d0<cg0.g0> tagsForFaqFeedback = lVar.f296898a.getTagsForFaqFeedback();
                        w4l.c cVar = new w4l.c(new wd3.a(15), 23);
                        tagsForFaqFeedback.getClass();
                        ufm.i iVar = new ufm.i(tagsForFaqFeedback, cVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 2:
                        List tags = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(tags, "tags");
                        lVar.f296900c.f("KEY_CACHE_TAGS_FOR_FAQ_FEEDBACK", tags);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String faqKey2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(faqKey2, "faqKey");
                        rfm.w wVarH0 = te0.w.h0(lVar.f296898a.getFeedbackForFaq(faqKey2));
                        k kVar = k.f;
                        rfm.m mVar = new rfm.m(wVarH0, new vf0.q(21), 1);
                        w4l.c cVar2 = new w4l.c(new wd3.a(14), 22);
                        dfm.c cVar3 = mfm.f.d;
                        rfm.y yVar = new rfm.y(mVar, cVar3, cVar3, cVar2, mfm.f.f205043c);
                        Feedback.INSTANCE.getClass();
                        Feedback feedback2 = Feedback.f73124g;
                        mfm.f.b(feedback2, "item is null");
                        rfm.f0 f0VarP = new rfm.f(yVar, new mfm.d(feedback2), 3).p(feedback2);
                        Intrinsics.checkNotNullExpressionValue(f0VarP, "toSingle(...)");
                        return f0VarP;
                }
            }
        }, null, null, new Function1(this) { // from class: wf0.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f296894b;

            {
                this.f296894b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i3) {
                    case 0:
                        String faqKey = (String) obj2;
                        Intrinsics.checkNotNullParameter(faqKey, "faqKey");
                        this.f296894b.f296899b.remove(faqKey);
                        return Unit.f186387a;
                    case 1:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f296894b.f296900c.get("KEY_CACHE_TAGS_FOR_FAQ_FEEDBACK");
                    default:
                        String faqKey2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(faqKey2, "faqKey");
                        return (Feedback) this.f296894b.f296899b.get(faqKey2);
                }
            }
        }, null, null, Constants.TAG_EMV_L2_CHECKSUM);
        final int i5 = 1;
        Function2 function22 = new Function2(this) { // from class: wf0.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f296890b;

            {
                this.f296890b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i22 = i5;
                l lVar = this.f296890b;
                switch (i22) {
                    case 0:
                        String faqKey = (String) obj2;
                        Feedback feedback = (Feedback) obj3;
                        Intrinsics.checkNotNullParameter(faqKey, "faqKey");
                        Intrinsics.checkNotNullParameter(feedback, "feedback");
                        lVar.f296899b.f(faqKey, feedback);
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        efm.d0<cg0.g0> tagsForFaqFeedback = lVar.f296898a.getTagsForFaqFeedback();
                        w4l.c cVar = new w4l.c(new wd3.a(15), 23);
                        tagsForFaqFeedback.getClass();
                        ufm.i iVar = new ufm.i(tagsForFaqFeedback, cVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 2:
                        List tags = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(tags, "tags");
                        lVar.f296900c.f("KEY_CACHE_TAGS_FOR_FAQ_FEEDBACK", tags);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String faqKey2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(faqKey2, "faqKey");
                        rfm.w wVarH0 = te0.w.h0(lVar.f296898a.getFeedbackForFaq(faqKey2));
                        k kVar = k.f;
                        rfm.m mVar = new rfm.m(wVarH0, new vf0.q(21), 1);
                        w4l.c cVar2 = new w4l.c(new wd3.a(14), 22);
                        dfm.c cVar3 = mfm.f.d;
                        rfm.y yVar = new rfm.y(mVar, cVar3, cVar3, cVar2, mfm.f.f205043c);
                        Feedback.INSTANCE.getClass();
                        Feedback feedback2 = Feedback.f73124g;
                        mfm.f.b(feedback2, "item is null");
                        rfm.f0 f0VarP = new rfm.f(yVar, new mfm.d(feedback2), 3).p(feedback2);
                        Intrinsics.checkNotNullExpressionValue(f0VarP, "toSingle(...)");
                        return f0VarP;
                }
            }
        };
        Function1 function12 = new Function1(this) { // from class: wf0.i

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f296894b;

            {
                this.f296894b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i5) {
                    case 0:
                        String faqKey = (String) obj2;
                        Intrinsics.checkNotNullParameter(faqKey, "faqKey");
                        this.f296894b.f296899b.remove(faqKey);
                        return Unit.f186387a;
                    case 1:
                        Unit it8 = (Unit) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return (List) this.f296894b.f296900c.get("KEY_CACHE_TAGS_FOR_FAQ_FEEDBACK");
                    default:
                        String faqKey2 = (String) obj2;
                        Intrinsics.checkNotNullParameter(faqKey2, "faqKey");
                        return (Feedback) this.f296894b.f296899b.get(faqKey2);
                }
            }
        };
        final int i6 = 2;
        this.e = new w4l.f(function22, function12, new Function2(this) { // from class: wf0.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ l f296890b;

            {
                this.f296890b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                int i22 = i6;
                l lVar = this.f296890b;
                switch (i22) {
                    case 0:
                        String faqKey = (String) obj2;
                        Feedback feedback = (Feedback) obj3;
                        Intrinsics.checkNotNullParameter(faqKey, "faqKey");
                        Intrinsics.checkNotNullParameter(feedback, "feedback");
                        lVar.f296899b.f(faqKey, feedback);
                        return Unit.f186387a;
                    case 1:
                        w4l.f DataObservableDelegate = (w4l.f) obj2;
                        Unit it8 = (Unit) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(it8, "it");
                        efm.d0<cg0.g0> tagsForFaqFeedback = lVar.f296898a.getTagsForFaqFeedback();
                        w4l.c cVar = new w4l.c(new wd3.a(15), 23);
                        tagsForFaqFeedback.getClass();
                        ufm.i iVar = new ufm.i(tagsForFaqFeedback, cVar, 1);
                        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                        return iVar;
                    case 2:
                        List tags = (List) obj3;
                        Intrinsics.checkNotNullParameter((Unit) obj2, "<unused var>");
                        Intrinsics.checkNotNullParameter(tags, "tags");
                        lVar.f296900c.f("KEY_CACHE_TAGS_FOR_FAQ_FEEDBACK", tags);
                        return Unit.f186387a;
                    default:
                        w4l.f DataObservableDelegate2 = (w4l.f) obj2;
                        String faqKey2 = (String) obj3;
                        Intrinsics.checkNotNullParameter(DataObservableDelegate2, "$this$DataObservableDelegate");
                        Intrinsics.checkNotNullParameter(faqKey2, "faqKey");
                        rfm.w wVarH0 = te0.w.h0(lVar.f296898a.getFeedbackForFaq(faqKey2));
                        k kVar = k.f;
                        rfm.m mVar = new rfm.m(wVarH0, new vf0.q(21), 1);
                        w4l.c cVar2 = new w4l.c(new wd3.a(14), 22);
                        dfm.c cVar3 = mfm.f.d;
                        rfm.y yVar = new rfm.y(mVar, cVar3, cVar3, cVar2, mfm.f.f205043c);
                        Feedback.INSTANCE.getClass();
                        Feedback feedback2 = Feedback.f73124g;
                        mfm.f.b(feedback2, "item is null");
                        rfm.f0 f0VarP = new rfm.f(yVar, new mfm.d(feedback2), 3).p(feedback2);
                        Intrinsics.checkNotNullExpressionValue(f0VarP, "toSingle(...)");
                        return f0VarP;
                }
            }
        }, null, null, null, null, null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
    }
}
