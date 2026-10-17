package r40;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class p {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k50.x f251358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z50.g f251359b;

    public p(k50.x chatMessageTextMapper, z50.g liveAgentAvatarProvider) {
        Intrinsics.checkNotNullParameter(chatMessageTextMapper, "chatMessageTextMapper");
        Intrinsics.checkNotNullParameter(liveAgentAvatarProvider, "liveAgentAvatarProvider");
        this.f251358a = chatMessageTextMapper;
        this.f251359b = liveAgentAvatarProvider;
    }
}
