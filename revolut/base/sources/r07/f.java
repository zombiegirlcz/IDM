package r07;

import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f250711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f250712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f250713c;
    public final wi0.b d;

    public f(Set supportedTaxTypes, LinkedHashMap activeTaxProfiles, LinkedHashMap taxCalendarEvents, wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(supportedTaxTypes, "supportedTaxTypes");
        Intrinsics.checkNotNullParameter(activeTaxProfiles, "activeTaxProfiles");
        Intrinsics.checkNotNullParameter(taxCalendarEvents, "taxCalendarEvents");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f250711a = supportedTaxTypes;
        this.f250712b = activeTaxProfiles;
        this.f250713c = taxCalendarEvents;
        this.d = countryCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f250711a, fVar.f250711a) && this.f250712b.equals(fVar.f250712b) && this.f250713c.equals(fVar.f250713c) && this.d.equals(fVar.d);
    }

    public final int hashCode() {
        return this.d.f297794a.hashCode() + r6.b.e(this.f250713c, r6.b.e(this.f250712b, this.f250711a.hashCode() * 31, 31), 31);
    }
}
