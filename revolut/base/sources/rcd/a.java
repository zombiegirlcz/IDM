package rcd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f253250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f253251b;

    public a(String id10, String youthId) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(youthId, "youthId");
        this.f253250a = id10;
        this.f253251b = youthId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f253250a, aVar.f253250a) && Intrinsics.f(this.f253251b, aVar.f253251b);
    }

    public final int hashCode() {
        return this.f253251b.hashCode() + (this.f253250a.hashCode() * 31);
    }
}
