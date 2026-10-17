package ur6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f282251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f282252b;

    public a(String id10, b topic) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(topic, "topic");
        this.f282251a = id10;
        this.f282252b = topic;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f282251a, aVar.f282251a) && this.f282252b == aVar.f282252b;
    }

    public final int hashCode() {
        return this.f282252b.hashCode() + (this.f282251a.hashCode() * 31);
    }
}
