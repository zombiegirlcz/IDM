package ulf;

import com.revolut.feature.topup_screen.api.config.TopUpConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c0 implements d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TopUpConfig f280966a;

    public c0(TopUpConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f280966a = config;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c0) && Intrinsics.f(this.f280966a, ((c0) obj2).f280966a);
    }

    public final int hashCode() {
        return this.f280966a.hashCode();
    }
}
