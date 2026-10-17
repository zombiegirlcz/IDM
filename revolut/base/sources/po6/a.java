package po6;

import kotlin.jvm.internal.Intrinsics;
import nii.z;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f237890a;

    public a(z config) {
        Intrinsics.checkNotNullParameter(config, "config");
        this.f237890a = config;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f237890a, ((a) obj2).f237890a);
    }

    public final int hashCode() {
        return this.f237890a.hashCode();
    }
}
