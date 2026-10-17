package sa6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f261349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f261350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f261351c;

    public v(String revolutAccountId, String pocketId, xi0.b donationCurrency) {
        Intrinsics.checkNotNullParameter(revolutAccountId, "revolutAccountId");
        Intrinsics.checkNotNullParameter(pocketId, "pocketId");
        Intrinsics.checkNotNullParameter(donationCurrency, "donationCurrency");
        this.f261349a = revolutAccountId;
        this.f261350b = pocketId;
        this.f261351c = donationCurrency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f261349a, vVar.f261349a) && Intrinsics.f(this.f261350b, vVar.f261350b) && Intrinsics.f(this.f261351c, vVar.f261351c);
    }

    public final int hashCode() {
        return this.f261351c.hashCode() + p.a.c(this.f261349a.hashCode() * 31, 31, this.f261350b);
    }
}
