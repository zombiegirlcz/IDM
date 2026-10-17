package asa;

import com.revolut.data.model.Data;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f8894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f8895b;

    public g(ArrayList counterLimits, Data validationRulesData) {
        Intrinsics.checkNotNullParameter(counterLimits, "counterLimits");
        Intrinsics.checkNotNullParameter(validationRulesData, "validationRulesData");
        this.f8894a = counterLimits;
        this.f8895b = validationRulesData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f8894a.equals(gVar.f8894a) && this.f8895b.equals(gVar.f8895b);
    }

    public final int hashCode() {
        return this.f8895b.hashCode() + (this.f8894a.hashCode() * 31);
    }
}
