package az;

import kotlin.jvm.internal.Intrinsics;
import xv.l;

/* JADX INFO: loaded from: classes16.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f11271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f11272b;

    public a() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f11271a, aVar.f11271a) && this.f11272b == aVar.f11272b;
    }

    public final int hashCode() {
        l lVar = this.f11271a;
        return Boolean.hashCode(this.f11272b) + ((lVar == null ? 0 : lVar.hashCode()) * 31);
    }

    public /* synthetic */ a(int i) {
        this(null, false);
    }

    public a(l lVar, boolean z) {
        this.f11271a = lVar;
        this.f11272b = z;
    }
}
