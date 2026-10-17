package a8j;

import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f2271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2273c;
    public final String d;
    public final List e;

    public d(Clause currencyNameClause, String str, String str2, String str3, List customLinks) {
        Intrinsics.checkNotNullParameter(currencyNameClause, "currencyNameClause");
        Intrinsics.checkNotNullParameter(customLinks, "customLinks");
        this.f2271a = currencyNameClause;
        this.f2272b = str;
        this.f2273c = str2;
        this.d = str3;
        this.e = customLinks;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f2271a.equals(dVar.f2271a) && Intrinsics.f(this.f2272b, dVar.f2272b) && Intrinsics.f(this.f2273c, dVar.f2273c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f2271a.hashCode() * 31;
        String str = this.f2272b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f2273c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return this.e.hashCode() + ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }
}
