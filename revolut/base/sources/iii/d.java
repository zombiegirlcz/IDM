package iii;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f161620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f161621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f161622c;
    public final Object d;

    public d(boolean z, boolean z3, String listId, Object obj2) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        this.f161620a = z;
        this.f161621b = z3;
        this.f161622c = listId;
        this.d = obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f161620a == dVar.f161620a && this.f161621b == dVar.f161621b && Intrinsics.f(this.f161622c, dVar.f161622c) && Intrinsics.f(this.d, dVar.d);
    }

    public final int hashCode() {
        int iC = p.a.c(j6.a.c(Boolean.hashCode(this.f161620a) * 31, 31, this.f161621b), 31, this.f161622c);
        Object obj2 = this.d;
        return iC + (obj2 == null ? 0 : obj2.hashCode());
    }

    public /* synthetic */ d(int i, Object obj2, boolean z, boolean z3, String str) {
        this(z, (i & 2) != 0 ? false : z3, (i & 4) != 0 ? "ERROR_STATE_ID" : str, (i & 8) != 0 ? null : obj2);
    }
}
