package gpk;

import a0.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f145455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f145456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f145457c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f145458g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f145459h;

    public a(String id10, String state, String targetRate, String str, String currencyFrom, String currencyTo, long j2, long j3) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(targetRate, "targetRate");
        Intrinsics.checkNotNullParameter(currencyFrom, "currencyFrom");
        Intrinsics.checkNotNullParameter(currencyTo, "currencyTo");
        this.f145455a = id10;
        this.f145456b = state;
        this.f145457c = targetRate;
        this.d = str;
        this.e = currencyFrom;
        this.f = currencyTo;
        this.f145458g = j2;
        this.f145459h = j3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f145455a, aVar.f145455a) && Intrinsics.f(this.f145456b, aVar.f145456b) && Intrinsics.f(this.f145457c, aVar.f145457c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && this.f145458g == aVar.f145458g && this.f145459h == aVar.f145459h;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f145455a.hashCode() * 31, 31, this.f145456b), 31, this.f145457c);
        String str = this.d;
        return Long.hashCode(this.f145459h) + d.c(p.a.c(p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.f145458g);
    }
}
