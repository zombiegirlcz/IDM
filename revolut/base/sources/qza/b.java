package qza;

import com.revolut.feature.remote_stories.impl.ui.RemoteStoriesContract$Config;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements mm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RemoteStoriesContract$Config f250457a;

    public b(RemoteStoriesContract$Config config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f250457a = config;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f250457a, ((b) obj2).f250457a);
    }

    public final int hashCode() {
        return this.f250457a.hashCode();
    }
}
