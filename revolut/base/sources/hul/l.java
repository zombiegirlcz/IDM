package hul;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f155741a;

    public l(String kidUrl) {
        Intrinsics.checkNotNullParameter(kidUrl, "kidUrl");
        this.f155741a = kidUrl;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f155741a, ((l) obj2).f155741a);
    }

    public final int hashCode() {
        return this.f155741a.hashCode();
    }
}
