package pm6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f237480a;

    public d(String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        this.f237480a = link;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f237480a, ((d) obj2).f237480a);
    }

    public final int hashCode() {
        return this.f237480a.hashCode();
    }
}
