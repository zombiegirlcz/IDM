package bwh;

import aii.e;
import kotlin.jvm.internal.Intrinsics;
import yvh.b;
import yvh.h;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f19351a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f19352b;

    public a(b current, h moveTargetType) {
        Intrinsics.checkNotNullParameter(current, "current");
        Intrinsics.checkNotNullParameter(moveTargetType, "moveTargetType");
        this.f19351a = current;
        this.f19352b = moveTargetType;
    }

    public final b b() {
        return this.f19351a;
    }

    public final h c() {
        return this.f19352b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f19351a, aVar.f19351a) && this.f19352b == aVar.f19352b;
    }

    public final int hashCode() {
        return this.f19352b.hashCode() + (this.f19351a.hashCode() * 31);
    }
}
