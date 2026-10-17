package v6i;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f286396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f286397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f286398c;
    public final boolean d;

    public i(BigDecimal currentRate, BigDecimal formattedInputRate, h hVar, boolean z) {
        Intrinsics.checkNotNullParameter(currentRate, "currentRate");
        Intrinsics.checkNotNullParameter(formattedInputRate, "formattedInputRate");
        this.f286396a = currentRate;
        this.f286397b = formattedInputRate;
        this.f286398c = hVar;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f286396a, iVar.f286396a) && Intrinsics.f(this.f286397b, iVar.f286397b) && this.f286398c == iVar.f286398c && this.d == iVar.d;
    }

    public final int hashCode() {
        int iD = t61.a.d(this.f286397b, this.f286396a.hashCode() * 31, 31);
        h hVar = this.f286398c;
        return Boolean.hashCode(this.d) + ((iD + (hVar == null ? 0 : hVar.hashCode())) * 31);
    }
}
