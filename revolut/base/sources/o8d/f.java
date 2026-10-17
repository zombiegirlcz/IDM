package o8d;

import kotlin.jvm.internal.Intrinsics;
import lde.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class f {

    @NotNull
    private static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bp6.b f223017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f223018b;

    public f(bp6.b helpFeedbackMapper, n sharedHelpWidgetsInteractor, h pigeonNeedMoreHelpStateMapper) {
        Intrinsics.checkNotNullParameter(helpFeedbackMapper, "helpFeedbackMapper");
        Intrinsics.checkNotNullParameter(sharedHelpWidgetsInteractor, "sharedHelpWidgetsInteractor");
        Intrinsics.checkNotNullParameter(pigeonNeedMoreHelpStateMapper, "pigeonNeedMoreHelpStateMapper");
        this.f223017a = helpFeedbackMapper;
        this.f223018b = sharedHelpWidgetsInteractor;
    }
}
