package mwg;

import ip0.v7;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f209450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f209451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f209452c;
    public final Map d;
    public final Map e;

    public e(List analyticsProductTypes, boolean z, dj0.d totalValue, Map cash, Map assets) {
        Intrinsics.checkNotNullParameter(analyticsProductTypes, "analyticsProductTypes");
        Intrinsics.checkNotNullParameter(totalValue, "totalValue");
        Intrinsics.checkNotNullParameter(cash, "cash");
        Intrinsics.checkNotNullParameter(assets, "assets");
        this.f209450a = analyticsProductTypes;
        this.f209451b = z;
        this.f209452c = totalValue;
        this.d = cash;
        this.e = assets;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f209450a, eVar.f209450a) && this.f209451b == eVar.f209451b && Intrinsics.f(this.f209452c, eVar.f209452c) && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.e(v7.c(j6.a.c(this.f209450a.hashCode() * 31, 31, this.f209451b), 31, this.f209452c), 31, this.d);
    }
}
