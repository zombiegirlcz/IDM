package dej;

import com.revolut.retail.feature.esim.api.model.EsimHyperText;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f113493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EsimHyperText f113494b;

    public b0(ArrayList sections, EsimHyperText esimHyperText) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f113493a = sections;
        this.f113494b = esimHyperText;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj2;
        return this.f113493a.equals(b0Var.f113493a) && Intrinsics.f(this.f113494b, b0Var.f113494b);
    }

    public final int hashCode() {
        int iHashCode = this.f113493a.hashCode() * 31;
        EsimHyperText esimHyperText = this.f113494b;
        return iHashCode + (esimHyperText == null ? 0 : esimHyperText.hashCode());
    }
}
