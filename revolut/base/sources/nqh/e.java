package nqh;

import com.revolut.shared.feature.wealth.models.screener.ScreenerSelectedSorting;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zel.f f218455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f218456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f218457c;
    public final ScreenerSelectedSorting d;
    public final boolean e;

    public e(zel.f instrumentGroup, List filters, String str, ScreenerSelectedSorting screenerSelectedSorting, boolean z) {
        Intrinsics.checkNotNullParameter(instrumentGroup, "instrumentGroup");
        Intrinsics.checkNotNullParameter(filters, "filters");
        this.f218455a = instrumentGroup;
        this.f218456b = filters;
        this.f218457c = str;
        this.d = screenerSelectedSorting;
        this.e = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f218455a == eVar.f218455a && Intrinsics.f(this.f218456b, eVar.f218456b) && Intrinsics.f(this.f218457c, eVar.f218457c) && Intrinsics.f(this.d, eVar.d) && this.e == eVar.e;
    }

    public final int hashCode() {
        int iD = p.a.d(this.f218455a.hashCode() * 31, 31, this.f218456b);
        String str = this.f218457c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        ScreenerSelectedSorting screenerSelectedSorting = this.d;
        return Boolean.hashCode(this.e) + ((iHashCode + (screenerSelectedSorting != null ? screenerSelectedSorting.hashCode() : 0)) * 31);
    }
}
