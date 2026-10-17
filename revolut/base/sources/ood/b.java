package ood;

import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f227031a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f227032b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final do3.n f227033c;
    public final yld.d d;
    public final yld.c e;
    public final xi0.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set f227034g;

    public b(List allCategories, String walletId, do3.n user, xi0.b baseCurrency, Set allCountryCodes) {
        yld.d screenType = yld.d.SPENDING;
        yld.c chartStyle = yld.c.LINE_CHART;
        Intrinsics.checkNotNullParameter(allCategories, "allCategories");
        Intrinsics.checkNotNullParameter(walletId, "walletId");
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(screenType, "screenType");
        Intrinsics.checkNotNullParameter(chartStyle, "chartStyle");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Intrinsics.checkNotNullParameter(allCountryCodes, "allCountryCodes");
        this.f227031a = allCategories;
        this.f227032b = walletId;
        this.f227033c = user;
        this.d = screenType;
        this.e = chartStyle;
        this.f = baseCurrency;
        this.f227034g = allCountryCodes;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f227031a, bVar.f227031a) && Intrinsics.f(this.f227032b, bVar.f227032b) && Intrinsics.f(this.f227033c, bVar.f227033c) && this.d == bVar.d && this.e == bVar.e && Intrinsics.f(this.f, bVar.f) && Intrinsics.f(this.f227034g, bVar.f227034g);
    }

    public final int hashCode() {
        return this.f227034g.hashCode() + h30.l.j(this.f, (this.e.hashCode() + ((this.d.hashCode() + ((this.f227033c.hashCode() + p.a.c(this.f227031a.hashCode() * 31, 31, this.f227032b)) * 31)) * 31)) * 31, 31);
    }
}
