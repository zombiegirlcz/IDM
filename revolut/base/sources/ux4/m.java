package ux4;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
public final class m implements Serializable {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f283873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f283874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f283875c;

    public m(k creditFacility, l variant, String str) {
        Intrinsics.checkNotNullParameter(creditFacility, "creditFacility");
        Intrinsics.checkNotNullParameter(variant, "variant");
        this.f283873a = creditFacility;
        this.f283874b = variant;
        this.f283875c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f283873a, mVar.f283873a) && this.f283874b == mVar.f283874b && Intrinsics.f(this.f283875c, mVar.f283875c);
    }

    public final int hashCode() {
        int iHashCode = (this.f283874b.hashCode() + (this.f283873a.hashCode() * 31)) * 31;
        String str = this.f283875c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
