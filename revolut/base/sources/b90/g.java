package b90;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f13528a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13529b;

    public g(String text, String deeplink) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f13528a = text;
        this.f13529b = deeplink;
    }

    public final String a() {
        return this.f13529b;
    }

    public final String b() {
        return this.f13528a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f13528a, gVar.f13528a) && Intrinsics.f(this.f13529b, gVar.f13529b);
    }

    public final int hashCode() {
        return this.f13529b.hashCode() + (this.f13528a.hashCode() * 961);
    }
}
