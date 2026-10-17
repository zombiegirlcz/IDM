package r3k;

import com.revolut.data.model.Data;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f251299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f251300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f251301c;
    public final Data d;

    public b(List counterLimits, dj0.d dVar, Data corridorPropertyData, Data validationRulesData) {
        Intrinsics.checkNotNullParameter(counterLimits, "counterLimits");
        Intrinsics.checkNotNullParameter(corridorPropertyData, "corridorPropertyData");
        Intrinsics.checkNotNullParameter(validationRulesData, "validationRulesData");
        this.f251299a = counterLimits;
        this.f251300b = dVar;
        this.f251301c = corridorPropertyData;
        this.d = validationRulesData;
    }

    public static b a(b bVar, ArrayList arrayList, dj0.d dVar, Data corridorPropertyData, Data validationRulesData, int i) {
        List counterLimits = arrayList;
        if ((i & 1) != 0) {
            counterLimits = bVar.f251299a;
        }
        if ((i & 2) != 0) {
            dVar = bVar.f251300b;
        }
        if ((i & 4) != 0) {
            corridorPropertyData = bVar.f251301c;
        }
        if ((i & 8) != 0) {
            validationRulesData = bVar.d;
        }
        bVar.getClass();
        Intrinsics.checkNotNullParameter(counterLimits, "counterLimits");
        Intrinsics.checkNotNullParameter(corridorPropertyData, "corridorPropertyData");
        Intrinsics.checkNotNullParameter(validationRulesData, "validationRulesData");
        return new b(counterLimits, dVar, corridorPropertyData, validationRulesData);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f251299a, bVar.f251299a) && Intrinsics.f(this.f251300b, bVar.f251300b) && Intrinsics.f(this.f251301c, bVar.f251301c) && Intrinsics.f(this.d, bVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f251299a.hashCode() * 31;
        dj0.d dVar = this.f251300b;
        return this.d.hashCode() + kii.e.c(this.f251301c, (iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31, 31);
    }
}
