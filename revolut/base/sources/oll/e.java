package oll;

import com.revolut.sso.api.models.CombinedAuthenticationScreenCustomization;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f226454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f226455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CombinedAuthenticationScreenCustomization f226456c;

    public e(String detectedCountryCode, String str, CombinedAuthenticationScreenCustomization customization) {
        Intrinsics.checkNotNullParameter(detectedCountryCode, "detectedCountryCode");
        Intrinsics.checkNotNullParameter(customization, "customization");
        this.f226454a = detectedCountryCode;
        this.f226455b = str;
        this.f226456c = customization;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f226454a, eVar.f226454a) && Intrinsics.f(this.f226455b, eVar.f226455b) && Intrinsics.f(this.f226456c, eVar.f226456c);
    }

    public final int hashCode() {
        int iHashCode = this.f226454a.hashCode() * 31;
        String str = this.f226455b;
        return this.f226456c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
