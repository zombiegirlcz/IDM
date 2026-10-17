package r9k;

import com.revolut.data.model.Data;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f252738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f252739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f252740c;
    public final Set d;
    public final Map e;

    public d(List counterLimits, dj0.d dVar, Data validationRulesData, Set set, Map configMinAmounts) {
        Intrinsics.checkNotNullParameter(counterLimits, "counterLimits");
        Intrinsics.checkNotNullParameter(validationRulesData, "validationRulesData");
        Intrinsics.checkNotNullParameter(configMinAmounts, "configMinAmounts");
        this.f252738a = counterLimits;
        this.f252739b = dVar;
        this.f252740c = validationRulesData;
        this.d = set;
        this.e = configMinAmounts;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f252738a, dVar.f252738a) && Intrinsics.f(this.f252739b, dVar.f252739b) && Intrinsics.f(this.f252740c, dVar.f252740c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f252738a.hashCode() * 31;
        dj0.d dVar = this.f252739b;
        int iC = kii.e.c(this.f252740c, (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31, 31);
        Set set = this.d;
        return this.e.hashCode() + ((iC + (set != null ? set.hashCode() : 0)) * 31);
    }
}
