package d8d;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.feature.feedback.api.domain.Feedback;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import lde.n;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements bp6.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bp6.b f112219a;

    public d(bp6.b newFeedbackWidgetMapper, n widgetsInteractor) {
        Intrinsics.checkNotNullParameter(newFeedbackWidgetMapper, "newFeedbackWidgetMapper");
        Intrinsics.checkNotNullParameter(widgetsInteractor, "widgetsInteractor");
        this.f112219a = newFeedbackWidgetMapper;
    }

    @Override // bp6.b
    public final List a(Feedback feedback, AnalyticsContext analyticsContext, bp6.a style) {
        Intrinsics.checkNotNullParameter(feedback, "feedback");
        Intrinsics.checkNotNullParameter(style, "style");
        return this.f112219a.a(feedback, analyticsContext, style);
    }

    @Override // bp6.b
    public final List b() {
        return this.f112219a.b();
    }

    @Override // bp6.b
    public final List c() {
        return this.f112219a.c();
    }
}
