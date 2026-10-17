package vpd;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.feature.spending_analytics.api.models.income_sorter.a f291160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f291161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f291162c;

    public e(com.revolut.feature.spending_analytics.api.models.income_sorter.a investmentType, String str, ArrayList investments) {
        Intrinsics.checkNotNullParameter(investmentType, "investmentType");
        Intrinsics.checkNotNullParameter(investments, "investments");
        this.f291160a = investmentType;
        this.f291161b = investments;
        this.f291162c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f291160a == eVar.f291160a && this.f291161b.equals(eVar.f291161b) && Intrinsics.f(this.f291162c, eVar.f291162c);
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f291161b, this.f291160a.hashCode() * 31, 31);
        String str = this.f291162c;
        return iB + (str == null ? 0 : str.hashCode());
    }
}
