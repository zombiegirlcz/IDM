package vm6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f290547a;

    public d(String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        this.f290547a = link;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f290547a, ((d) obj2).f290547a);
    }

    public final int hashCode() {
        return this.f290547a.hashCode();
    }
}
