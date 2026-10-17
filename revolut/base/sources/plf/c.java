package plf;

import klf.h0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f237371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f237372b;

    public c(h0 commonDataSource, a headerMapper) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(headerMapper, "headerMapper");
        this.f237371a = commonDataSource;
        this.f237372b = headerMapper;
    }
}
