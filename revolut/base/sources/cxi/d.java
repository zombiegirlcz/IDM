package cxi;

import cli.j;
import kotlin.jvm.internal.Intrinsics;
import svi.i0;
import svi.y;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f109986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f109987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i0 f109988c;

    public d(int i, y passType, i0 pricing) {
        Intrinsics.checkNotNullParameter(passType, "passType");
        Intrinsics.checkNotNullParameter(pricing, "pricing");
        this.f109986a = i;
        this.f109987b = passType;
        this.f109988c = pricing;
    }

    public static d a(d dVar, int i) {
        y passType = dVar.f109987b;
        i0 pricing = dVar.f109988c;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(passType, "passType");
        Intrinsics.checkNotNullParameter(pricing, "pricing");
        return new d(i, passType, pricing);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f109986a == dVar.f109986a && this.f109987b == dVar.f109987b && Intrinsics.f(this.f109988c, dVar.f109988c);
    }

    public final int hashCode() {
        return this.f109988c.hashCode() + ((this.f109987b.hashCode() + (Integer.hashCode(this.f109986a) * 31)) * 31);
    }
}
