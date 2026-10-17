package f4a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f132043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f132044b;

    public a(b type, String id10) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f132043a = type;
        this.f132044b = id10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f132043a == aVar.f132043a && Intrinsics.f(this.f132044b, aVar.f132044b);
    }

    public final int hashCode() {
        return this.f132044b.hashCode() + (this.f132043a.hashCode() * 31);
    }
}
