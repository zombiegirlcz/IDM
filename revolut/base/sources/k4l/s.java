package k4l;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f181002a;

    public s(String tag2) {
        Intrinsics.checkNotNullParameter(tag2, "tag");
        this.f181002a = tag2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && Intrinsics.f(this.f181002a, ((s) obj2).f181002a);
    }

    public final int hashCode() {
        return this.f181002a.hashCode();
    }
}
