package vrc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f291571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f291572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f291573c;

    public c(boolean z, b bVar, b bVar2) {
        this.f291571a = z;
        this.f291572b = bVar;
        this.f291573c = bVar2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f291571a == cVar.f291571a && Intrinsics.f(this.f291572b, cVar.f291572b) && Intrinsics.f(this.f291573c, cVar.f291573c);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f291571a) * 31;
        b bVar = this.f291572b;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        b bVar2 = this.f291573c;
        return iHashCode2 + (bVar2 != null ? bVar2.hashCode() : 0);
    }
}
