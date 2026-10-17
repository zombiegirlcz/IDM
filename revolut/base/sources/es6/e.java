package es6;

import h30.l;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f128869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f128870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f128871c;
    public final Float d;

    public e(String name, xi0.b currency, b automaticAllocation, Float f) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(automaticAllocation, "automaticAllocation");
        this.f128869a = name;
        this.f128870b = currency;
        this.f128871c = automaticAllocation;
        this.d = f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f128869a, eVar.f128869a) && Intrinsics.f(this.f128870b, eVar.f128870b) && this.f128871c == eVar.f128871c && Intrinsics.f(this.d, eVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f128871c.hashCode() + l.j(this.f128870b, this.f128869a.hashCode() * 31, 31)) * 31;
        Float f = this.d;
        return iHashCode + (f == null ? 0 : f.hashCode());
    }
}
