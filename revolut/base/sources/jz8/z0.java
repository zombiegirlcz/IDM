package jz8;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class z0 {

    @NotNull
    public static final y0 Companion = new y0();
    public static final Lazy[] d = {yhm.j.c(yhm.k.PUBLICATION, new jxi.a(24)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b1 f179683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pz8.e f179684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f179685c;

    public /* synthetic */ z0(int i, b1 b1Var, pz8.e eVar, String str) {
        if (7 != (i & 7)) {
            j1.f(x0.f179679a.getDescriptor(), i, 7);
            throw null;
        }
        this.f179683a = b1Var;
        this.f179684b = eVar;
        this.f179685c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj2;
        return this.f179683a == z0Var.f179683a && Intrinsics.f(this.f179684b, z0Var.f179684b) && Intrinsics.f(this.f179685c, z0Var.f179685c);
    }

    public final int hashCode() {
        int iHashCode = this.f179683a.hashCode() * 31;
        pz8.e eVar = this.f179684b;
        int iHashCode2 = (iHashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
        String str = this.f179685c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public z0(b1 type, pz8.e eVar, String str) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f179683a = type;
        this.f179684b = eVar;
        this.f179685c = str;
    }
}
