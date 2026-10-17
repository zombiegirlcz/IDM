package ipb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f167715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f167716b;

    public g(String title, String explanation) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(explanation, "explanation");
        this.f167715a = title;
        this.f167716b = explanation;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f167715a, gVar.f167715a) && Intrinsics.f(this.f167716b, gVar.f167716b);
    }

    public final int hashCode() {
        return this.f167716b.hashCode() + (this.f167715a.hashCode() * 31);
    }
}
