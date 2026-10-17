package zzg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class d implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f326733a;

    public d(c cVar) {
        this.f326733a = cVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f326733a, ((d) obj2).f326733a);
    }

    public final int hashCode() {
        c cVar = this.f326733a;
        if (cVar == null) {
            return 0;
        }
        return cVar.hashCode();
    }
}
