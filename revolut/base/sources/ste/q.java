package ste;

import com.revolut.feature.topup_screen.api.config.TopUpConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class q implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TopUpConfig f265570a;

    public q(TopUpConfig topUpConfig) {
        Intrinsics.checkNotNullParameter(topUpConfig, "topUpConfig");
        this.f265570a = topUpConfig;
    }

    public final TopUpConfig b() {
        return this.f265570a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && Intrinsics.f(this.f265570a, ((q) obj2).f265570a);
    }

    public final int hashCode() {
        return this.f265570a.hashCode();
    }
}
