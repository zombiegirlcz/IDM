package zme;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class l implements Serializable {

    @NotNull
    public static final k Companion = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f323500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f323501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f323502c;
    public final g d;
    public final List e;

    public l(wi0.b countryCode, boolean z, boolean z3, g gVar, List requiredTaxForms) {
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(requiredTaxForms, "requiredTaxForms");
        this.f323500a = countryCode;
        this.f323501b = z;
        this.f323502c = z3;
        this.d = gVar;
        this.e = requiredTaxForms;
    }

    public final g a() {
        g gVar = this.d;
        if (gVar != null) {
            return gVar;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f323500a, lVar.f323500a) && this.f323501b == lVar.f323501b && this.f323502c == lVar.f323502c && Intrinsics.f(this.d, lVar.d) && Intrinsics.f(this.e, lVar.e);
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(this.f323500a.f297794a.hashCode() * 31, 31, this.f323501b), 31, this.f323502c);
        g gVar = this.d;
        return this.e.hashCode() + ((iC + (gVar == null ? 0 : gVar.hashCode())) * 31);
    }
}
