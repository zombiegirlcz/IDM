package cj0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24571b;

    public b(String title, String deeplink) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f24570a = title;
        this.f24571b = deeplink;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f24570a, bVar.f24570a) && Intrinsics.f(this.f24571b, bVar.f24571b);
    }

    public final int hashCode() {
        return this.f24571b.hashCode() + (this.f24570a.hashCode() * 31);
    }
}
