package a7j;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f1913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f1915c;
    public final b d;
    public final long e;
    public final wd6.e f;

    public a(dj0.d moneyFrom, String str, dj0.d moneyTo, b exchangeOperation, long j2, wd6.e exchangeMode) {
        Intrinsics.checkNotNullParameter(moneyFrom, "moneyFrom");
        Intrinsics.checkNotNullParameter(moneyTo, "moneyTo");
        Intrinsics.checkNotNullParameter(exchangeOperation, "exchangeOperation");
        Intrinsics.checkNotNullParameter(exchangeMode, "exchangeMode");
        this.f1913a = moneyFrom;
        this.f1914b = str;
        this.f1915c = moneyTo;
        this.d = exchangeOperation;
        this.e = j2;
        this.f = exchangeMode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f1913a.equals(aVar.f1913a) && Intrinsics.f(this.f1914b, aVar.f1914b) && this.f1915c.equals(aVar.f1915c) && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f;
    }

    public final int hashCode() {
        int iHashCode = this.f1913a.hashCode() * 31;
        String str = this.f1914b;
        return y.g(this.f, a0.d.c((this.d.hashCode() + v7.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f1915c)) * 31, 31, this.e), 923521);
    }
}
