package jqd;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import zm3.l;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f177706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f177707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f177708c;
    public final krf.c d;

    public f(l contact, dj0.d value, String str, krf.c cVar) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f177706a = contact;
        this.f177707b = value;
        this.f177708c = str;
        this.d = cVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f177706a, fVar.f177706a) && Intrinsics.f(this.f177707b, fVar.f177707b) && Intrinsics.f(this.f177708c, fVar.f177708c) && Intrinsics.f(this.d, fVar.d);
    }

    public final int hashCode() {
        int iC = v7.c(this.f177706a.hashCode() * 31, 31, this.f177707b);
        String str = this.f177708c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        krf.c cVar = this.d;
        return iHashCode + (cVar != null ? cVar.hashCode() : 0);
    }
}
