package i2l;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nii.j0 f158008a;

    public e(nii.j0 configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f158008a = configuration;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f158008a.equals(((e) obj2).f158008a);
    }

    public final int hashCode() {
        return this.f158008a.hashCode();
    }
}
