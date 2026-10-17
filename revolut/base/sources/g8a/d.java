package g8a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Exception f141302a;

    public d(Exception throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.f141302a = throwable;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f141302a.equals(((d) obj2).f141302a);
    }

    public final int hashCode() {
        return this.f141302a.hashCode();
    }
}
