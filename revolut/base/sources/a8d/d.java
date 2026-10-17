package a8d;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d8d.d f2180a;

    public d(a aiSearchRelatedArticlesMapper, d8d.d helpFeedbackMapper) {
        Intrinsics.checkNotNullParameter(aiSearchRelatedArticlesMapper, "aiSearchRelatedArticlesMapper");
        Intrinsics.checkNotNullParameter(helpFeedbackMapper, "helpFeedbackMapper");
        this.f2180a = helpFeedbackMapper;
    }
}
