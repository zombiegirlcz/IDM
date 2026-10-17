package dda;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f113165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f113166b;

    public c(String title, String deeplink) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f113165a = title;
        this.f113166b = deeplink;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f113165a, cVar.f113165a) && Intrinsics.f(this.f113166b, cVar.f113166b);
    }

    public final int hashCode() {
        return this.f113166b.hashCode() + (this.f113165a.hashCode() * 31);
    }
}
