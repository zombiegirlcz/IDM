package je6;

import kotlin.jvm.internal.Intrinsics;
import nii.z;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f173231a;

    public b(z config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f173231a = config;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f173231a, ((b) obj2).f173231a);
    }

    public final int hashCode() {
        return this.f173231a.hashCode();
    }
}
