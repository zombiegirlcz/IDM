package qza;

import com.revolut.feature.remote_stories.impl.ui.RemoteStoriesContract$Config;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class l implements ym.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f250466a;

    public l(g state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f250466a = state;
    }

    @Override // ym.c
    public final efm.d0 g3(ym.b loadingData) {
        Intrinsics.checkNotNullParameter(loadingData, "loadingData");
        return (loadingData.f314824b && Intrinsics.f(loadingData.f314823a, new b((RemoteStoriesContract$Config) ((b0) this.f250466a).w0().get()))) ? new ufm.c(new nc0.a(this, 22), 2) : efm.d0.m(Boolean.TRUE);
    }

    @Override // ym.c
    public final int getLevel() {
        return 1;
    }
}
