package kn5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f186001a;

    public e() {
        this(null);
    }

    @Override // kn5.f
    public final n a() {
        return this.f186001a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f186001a, ((e) obj2).f186001a);
    }

    public final int hashCode() {
        n nVar = this.f186001a;
        if (nVar == null) {
            return 0;
        }
        return nVar.hashCode();
    }

    public e(n nVar) {
        this.f186001a = nVar;
    }
}
