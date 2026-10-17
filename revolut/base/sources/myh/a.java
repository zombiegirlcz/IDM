package myh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.b f210507a;

    public a(dj0.b value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f210507a = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f210507a, ((a) obj2).f210507a);
    }

    public final int hashCode() {
        return this.f210507a.hashCode();
    }
}
