package ohc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f225346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f225347b;

    public a(String id10, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f225346a = id10;
        this.f225347b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f225346a, aVar.f225346a) && this.f225347b == aVar.f225347b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f225347b) + (this.f225346a.hashCode() * 31);
    }
}
