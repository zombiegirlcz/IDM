package a7j;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes10.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f1925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f1926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wd6.e f1927c;
    public final String d;

    public i(dj0.d moneyFrom, dj0.d moneyTo, wd6.e exchangeMode, String str) {
        Intrinsics.checkNotNullParameter(moneyFrom, "moneyFrom");
        Intrinsics.checkNotNullParameter(moneyTo, "moneyTo");
        Intrinsics.checkNotNullParameter(exchangeMode, "exchangeMode");
        this.f1925a = moneyFrom;
        this.f1926b = moneyTo;
        this.f1927c = exchangeMode;
        this.d = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f1925a, iVar.f1925a) && Intrinsics.f(this.f1926b, iVar.f1926b) && this.f1927c == iVar.f1927c && Intrinsics.f(this.d, iVar.d);
    }

    public final int hashCode() {
        int iG = y.g(this.f1927c, v7.c(this.f1925a.hashCode() * 31, 31, this.f1926b), 31);
        String str = this.d;
        return iG + (str == null ? 0 : str.hashCode());
    }
}
