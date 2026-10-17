package e60;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f122841a;

    public d(i iVar) {
        this.f122841a = iVar;
    }

    @Override // e60.h
    public final i a() {
        return this.f122841a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f122841a, ((d) obj2).f122841a);
    }

    public final int hashCode() {
        i iVar = this.f122841a;
        if (iVar == null) {
            return 0;
        }
        return iVar.hashCode();
    }
}
