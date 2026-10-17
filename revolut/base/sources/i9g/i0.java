package i9g;

import fag.t0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t0 f159804a;

    public i0(t0 travelHotelsRepository) {
        Intrinsics.checkNotNullParameter(travelHotelsRepository, "travelHotelsRepository");
        this.f159804a = travelHotelsRepository;
    }

    public final efm.r a() {
        return rd0.e.c(this.f159804a.f133382n.C0("CACHE_KEY_SEARCH_SESSION_ID", String.class), kotlin.coroutines.g.f186406a);
    }
}
