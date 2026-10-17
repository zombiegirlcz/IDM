package p40;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f232781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f232782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f232783c;

    public j(String listId, int i, int i2) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        this.f232781a = listId;
        this.f232782b = i;
        this.f232783c = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f232781a, jVar.f232781a) && this.f232782b == jVar.f232782b && this.f232783c == jVar.f232783c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f232783c) + j6.a.b(this.f232782b, this.f232781a.hashCode() * 31, 31);
    }
}
