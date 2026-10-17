package qll;

import com.revolut.sso.api.models.CombinedAuthenticationScreenCustomization;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f247598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f247599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CombinedAuthenticationScreenCustomization f247600c;

    public r(String detectedCountryCode, String str, CombinedAuthenticationScreenCustomization customization) {
        Intrinsics.checkNotNullParameter(detectedCountryCode, "detectedCountryCode");
        Intrinsics.checkNotNullParameter(customization, "customization");
        this.f247598a = detectedCountryCode;
        this.f247599b = str;
        this.f247600c = customization;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f247598a, rVar.f247598a) && Intrinsics.f(this.f247599b, rVar.f247599b) && Intrinsics.f(this.f247600c, rVar.f247600c);
    }

    public final int hashCode() {
        int iHashCode = this.f247598a.hashCode() * 31;
        String str = this.f247599b;
        return this.f247600c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
