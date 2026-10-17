package kz3;

import aii.u;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f191062a;

    public d(u uVar) {
        this.f191062a = uVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f191062a, ((d) obj2).f191062a);
    }

    public final int hashCode() {
        u uVar = this.f191062a;
        if (uVar == null) {
            return 0;
        }
        return uVar.hashCode();
    }
}
