package nld;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kpj.f f217113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f217114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f217115c;

    public b(kpj.f headerMapper, i stepsMapper, j termsMapper, a actionsMapper) {
        Intrinsics.checkNotNullParameter(headerMapper, "headerMapper");
        Intrinsics.checkNotNullParameter(stepsMapper, "stepsMapper");
        Intrinsics.checkNotNullParameter(termsMapper, "termsMapper");
        Intrinsics.checkNotNullParameter(actionsMapper, "actionsMapper");
        this.f217113a = headerMapper;
        this.f217114b = stepsMapper;
        this.f217115c = termsMapper;
    }
}
