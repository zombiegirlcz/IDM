package i0e;

import com.revolut.feature.statements.api.models.StatementPeriod;
import com.revolut.feature.statements.api.models.TaxPeriod;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e0 extends b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TaxPeriod f157365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f157366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StatementPeriod f157367c;

    public e0(TaxPeriod taxPeriod, ArrayList availablePeriods, StatementPeriod selectedPeriod) {
        Intrinsics.checkNotNullParameter(taxPeriod, "taxPeriod");
        Intrinsics.checkNotNullParameter(availablePeriods, "availablePeriods");
        Intrinsics.checkNotNullParameter(selectedPeriod, "selectedPeriod");
        this.f157365a = taxPeriod;
        this.f157366b = availablePeriods;
        this.f157367c = selectedPeriod;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return this.f157365a.equals(e0Var.f157365a) && this.f157366b.equals(e0Var.f157366b) && this.f157367c.equals(e0Var.f157367c);
    }

    public final int hashCode() {
        return this.f157367c.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f157366b, this.f157365a.hashCode() * 31, 31);
    }
}
