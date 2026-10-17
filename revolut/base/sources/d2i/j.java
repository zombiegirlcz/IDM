package d2i;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes10.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f110861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f110862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wd6.e f110863c;
    public final String d;

    public j(dj0.d moneyFrom, dj0.d moneyTo, wd6.e exchangeMode, String str) {
        Intrinsics.checkNotNullParameter(moneyFrom, "moneyFrom");
        Intrinsics.checkNotNullParameter(moneyTo, "moneyTo");
        Intrinsics.checkNotNullParameter(exchangeMode, "exchangeMode");
        this.f110861a = moneyFrom;
        this.f110862b = moneyTo;
        this.f110863c = exchangeMode;
        this.d = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f110861a, jVar.f110861a) && Intrinsics.f(this.f110862b, jVar.f110862b) && this.f110863c == jVar.f110863c && Intrinsics.f(this.d, jVar.d);
    }

    public final int hashCode() {
        int iG = y.g(this.f110863c, v7.c(this.f110861a.hashCode() * 31, 31, this.f110862b), 31);
        String str = this.d;
        return iG + (str == null ? 0 : str.hashCode());
    }
}
