package mic;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class l implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f205671a;

    public l(String promoCode) {
        Intrinsics.checkNotNullParameter(promoCode, "promoCode");
        this.f205671a = promoCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f205671a, ((l) obj2).f205671a);
    }

    public final int hashCode() {
        return this.f205671a.hashCode();
    }
}
