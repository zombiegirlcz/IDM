package fo1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class p implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f136766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f136767b;

    public p(String listId, String value) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f136766a = listId;
        this.f136767b = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f136766a, pVar.f136766a) && Intrinsics.f(this.f136767b, pVar.f136767b);
    }

    public final int hashCode() {
        return this.f136767b.hashCode() + (this.f136766a.hashCode() * 31);
    }
}
