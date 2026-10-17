package ylh;

import com.revolut.feature.statements.api.models.TaxPeriod;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b0 extends z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TaxPeriod f314709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f314710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f314711c;

    public b0(TaxPeriod taxPeriod, ArrayList availablePeriods, a selectedPeriod) {
        Intrinsics.checkNotNullParameter(taxPeriod, "taxPeriod");
        Intrinsics.checkNotNullParameter(availablePeriods, "availablePeriods");
        Intrinsics.checkNotNullParameter(selectedPeriod, "selectedPeriod");
        this.f314709a = taxPeriod;
        this.f314710b = availablePeriods;
        this.f314711c = selectedPeriod;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return this.f314709a.equals(b0Var.f314709a) && this.f314710b.equals(b0Var.f314710b) && this.f314711c.equals(b0Var.f314711c);
    }

    public final int hashCode() {
        return this.f314711c.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f314710b, this.f314709a.hashCode() * 31, 31);
    }
}
