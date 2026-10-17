package fii;

import kotlin.jvm.internal.Intrinsics;
import nii.m0;

/* JADX INFO: loaded from: classes10.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0 f135430a;

    public g(m0 configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f135430a = configuration;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f135430a, ((g) obj2).f135430a);
    }

    public final int hashCode() {
        return this.f135430a.hashCode();
    }
}
