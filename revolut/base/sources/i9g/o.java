package i9g;

import fag.t0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0 f159824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l80.e f159825b;

    public o(t0 travelHotelsRepository, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(travelHotelsRepository, "travelHotelsRepository");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f159824a = travelHotelsRepository;
        this.f159825b = dateProvider;
    }
}
