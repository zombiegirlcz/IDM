package gei;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f143303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f143304b;

    public c(String label, String deeplink) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f143303a = label;
        this.f143304b = deeplink;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f143303a, cVar.f143303a) && Intrinsics.f(this.f143304b, cVar.f143304b);
    }

    public final int hashCode() {
        return this.f143304b.hashCode() + (this.f143303a.hashCode() * 31);
    }
}
