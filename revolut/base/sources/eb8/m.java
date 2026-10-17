package eb8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f124310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f124311b;

    public m(String id10, int i) {
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f124310a = id10;
        this.f124311b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f124310a, mVar.f124310a) && this.f124311b == mVar.f124311b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f124311b) + (this.f124310a.hashCode() * 31);
    }
}
