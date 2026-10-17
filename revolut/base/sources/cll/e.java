package cll;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f25054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ell.a f25055b;

    public e() {
        this(0);
    }

    public static e a(e eVar, boolean z, ell.a aVar, int i) {
        if ((i & 1) != 0) {
            z = eVar.f25054a;
        }
        if ((i & 2) != 0) {
            aVar = eVar.f25055b;
        }
        eVar.getClass();
        return new e(z, aVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f25054a == eVar.f25054a && Intrinsics.f(this.f25055b, eVar.f25055b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f25054a) * 31;
        ell.a aVar = this.f25055b;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public /* synthetic */ e(int i) {
        this(false, null);
    }

    public e(boolean z, ell.a aVar) {
        this.f25054a = z;
        this.f25055b = aVar;
    }
}
