package dba;

import java.util.ArrayList;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f112697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f112698b;

    public g(ArrayList beneficiaries, Map trustedBeneficiaries) {
        Intrinsics.checkNotNullParameter(beneficiaries, "beneficiaries");
        Intrinsics.checkNotNullParameter(trustedBeneficiaries, "trustedBeneficiaries");
        this.f112697a = beneficiaries;
        this.f112698b = trustedBeneficiaries;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f112697a.equals(gVar.f112697a) && Intrinsics.f(this.f112698b, gVar.f112698b);
    }

    public final int hashCode() {
        return this.f112698b.hashCode() + (this.f112697a.hashCode() * 31);
    }
}
