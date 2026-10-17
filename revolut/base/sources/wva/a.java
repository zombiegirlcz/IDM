package wva;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f300309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f300310b;

    public a(String referrerName, String referralCode) {
        Intrinsics.checkNotNullParameter(referrerName, "referrerName");
        Intrinsics.checkNotNullParameter(referralCode, "referralCode");
        this.f300309a = referrerName;
        this.f300310b = referralCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f300309a, aVar.f300309a) && Intrinsics.f(this.f300310b, aVar.f300310b);
    }

    public final int hashCode() {
        return this.f300310b.hashCode() + (this.f300309a.hashCode() * 31);
    }
}
