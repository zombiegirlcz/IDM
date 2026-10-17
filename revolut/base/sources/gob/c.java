package gob;

import com.revolut.feature.topup_screen.api.config.TopUpConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TopUpConfig f145122a;

    public c(TopUpConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f145122a = config;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f145122a, ((c) obj2).f145122a);
    }

    public final int hashCode() {
        return this.f145122a.hashCode();
    }
}
