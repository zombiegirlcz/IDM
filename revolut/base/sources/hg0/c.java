package hg0;

import kotlin.jvm.internal.Intrinsics;
import wf0.j0;
import wf0.x;

/* JADX INFO: loaded from: classes19.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f152043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wf0.g f152044b;

    public c(x faqRepository, j0 faqSettingsRepository, ifm.b compositeDisposable, wf0.g faqFeedbackRepository) {
        Intrinsics.checkNotNullParameter(faqRepository, "faqRepository");
        Intrinsics.checkNotNullParameter(faqSettingsRepository, "faqSettingsRepository");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        Intrinsics.checkNotNullParameter(faqFeedbackRepository, "faqFeedbackRepository");
        this.f152043a = faqRepository;
        this.f152044b = faqFeedbackRepository;
    }
}
