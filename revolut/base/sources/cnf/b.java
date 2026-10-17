package cnf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f25409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f25410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f25411c;

    public b(k staticNoticeDetailsMapper, j rejectMessageExtractor, e stringsProvider) {
        Intrinsics.checkNotNullParameter(staticNoticeDetailsMapper, "staticNoticeDetailsMapper");
        Intrinsics.checkNotNullParameter(rejectMessageExtractor, "rejectMessageExtractor");
        Intrinsics.checkNotNullParameter(stringsProvider, "stringsProvider");
        this.f25409a = staticNoticeDetailsMapper;
        this.f25410b = rejectMessageExtractor;
        this.f25411c = stringsProvider;
    }
}
