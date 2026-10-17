package cv7;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f109304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f109305b;

    public j() {
        this(0);
    }

    public static j a(j jVar, Data insuranceDetails, Data countryCode, int i) {
        if ((i & 1) != 0) {
            insuranceDetails = jVar.f109304a;
        }
        if ((i & 2) != 0) {
            countryCode = jVar.f109305b;
        }
        jVar.getClass();
        Intrinsics.checkNotNullParameter(insuranceDetails, "insuranceDetails");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        return new j(insuranceDetails, countryCode);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f109304a, jVar.f109304a) && Intrinsics.f(this.f109305b, jVar.f109305b);
    }

    public final int hashCode() {
        return this.f109305b.hashCode() + (this.f109304a.hashCode() * 31);
    }

    public j(Data insuranceDetails, Data countryCode) {
        Intrinsics.checkNotNullParameter(insuranceDetails, "insuranceDetails");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f109304a = insuranceDetails;
        this.f109305b = countryCode;
    }

    public /* synthetic */ j(int i) {
        this(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null));
    }
}
