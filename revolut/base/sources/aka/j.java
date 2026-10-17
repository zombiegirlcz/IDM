package aka;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5758b;

    public j(String asset, String title) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f5757a = asset;
        this.f5758b = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f5757a, jVar.f5757a) && Intrinsics.f(this.f5758b, jVar.f5758b);
    }

    public final int hashCode() {
        return this.f5758b.hashCode() + (this.f5757a.hashCode() * 31);
    }
}
