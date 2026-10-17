package c69;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class p implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CharSequence f21735b;

    public p(String listId, CharSequence value) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f21734a = listId;
        this.f21735b = value;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f21734a, pVar.f21734a) && Intrinsics.f(this.f21735b, pVar.f21735b);
    }

    public final int hashCode() {
        return this.f21735b.hashCode() + (this.f21734a.hashCode() * 31);
    }
}
