package vzk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f293551a;

    public i(String link) {
        Intrinsics.checkNotNullParameter(link, "link");
        this.f293551a = link;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f293551a, ((i) obj2).f293551a);
    }

    public final int hashCode() {
        return this.f293551a.hashCode();
    }
}
