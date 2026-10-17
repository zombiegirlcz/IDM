package v7e;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f286599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f286600b;

    public l(String id10, String text) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(text, "text");
        this.f286599a = id10;
        this.f286600b = text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f286599a, lVar.f286599a) && Intrinsics.f(this.f286600b, lVar.f286600b);
    }

    public final int hashCode() {
        return this.f286600b.hashCode() + (this.f286599a.hashCode() * 31);
    }
}
