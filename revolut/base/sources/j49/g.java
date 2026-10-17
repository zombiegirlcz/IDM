package j49;

import kotlin.jvm.internal.Intrinsics;
import nii.m0;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0 f171327a;

    public g(m0 config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f171327a = config;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f171327a, ((g) obj2).f171327a);
    }

    public final int hashCode() {
        return this.f171327a.hashCode();
    }
}
