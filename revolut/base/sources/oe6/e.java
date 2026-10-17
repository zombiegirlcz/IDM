package oe6;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f224554a;

    public e(List bankLicenseCountries) {
        Intrinsics.checkNotNullParameter(bankLicenseCountries, "bankLicenseCountries");
        this.f224554a = bankLicenseCountries;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f224554a, ((e) obj2).f224554a);
    }

    public final int hashCode() {
        return this.f224554a.hashCode();
    }
}
