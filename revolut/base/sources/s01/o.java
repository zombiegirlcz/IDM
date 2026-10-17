package s01;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class o implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f258801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f258802b;

    public o(String id10, String eventType) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        this.f258801a = id10;
        this.f258802b = eventType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f258801a, oVar.f258801a) && Intrinsics.f(this.f258802b, oVar.f258802b);
    }

    public final int hashCode() {
        return this.f258802b.hashCode() + (this.f258801a.hashCode() * 31);
    }
}
