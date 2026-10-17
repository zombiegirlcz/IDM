package ee1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f125061a;

    public d(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f125061a = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f125061a, ((d) obj2).f125061a);
    }

    public final int hashCode() {
        return this.f125061a.hashCode();
    }
}
