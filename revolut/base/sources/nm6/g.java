package nm6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f217188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f217189b;

    public g(String content, String selectedMethodId) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(selectedMethodId, "selectedMethodId");
        this.f217188a = content;
        this.f217189b = selectedMethodId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f217188a, gVar.f217188a) && Intrinsics.f(this.f217189b, gVar.f217189b);
    }

    public final int hashCode() {
        return this.f217189b.hashCode() + (this.f217188a.hashCode() * 31);
    }
}
