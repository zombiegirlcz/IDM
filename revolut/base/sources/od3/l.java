package od3;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class l implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uc3.d f224276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f224277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f224278c;
    public final boolean d;
    public final f0 e;

    public l(uc3.d sourceType, Data amountData, Data sourceAvailableData, boolean z, f0 productData) {
        Intrinsics.checkNotNullParameter(sourceType, "sourceType");
        Intrinsics.checkNotNullParameter(amountData, "amountData");
        Intrinsics.checkNotNullParameter(sourceAvailableData, "sourceAvailableData");
        Intrinsics.checkNotNullParameter(productData, "productData");
        this.f224276a = sourceType;
        this.f224277b = amountData;
        this.f224278c = sourceAvailableData;
        this.d = z;
        this.e = productData;
    }

    public static l a(l lVar, Data data, Data data2, f0 f0Var, int i) {
        uc3.d sourceType = lVar.f224276a;
        if ((i & 2) != 0) {
            data = lVar.f224277b;
        }
        Data amountData = data;
        if ((i & 4) != 0) {
            data2 = lVar.f224278c;
        }
        Data sourceAvailableData = data2;
        boolean z = lVar.d;
        if ((i & 16) != 0) {
            f0Var = lVar.e;
        }
        f0 productData = f0Var;
        lVar.getClass();
        Intrinsics.checkNotNullParameter(sourceType, "sourceType");
        Intrinsics.checkNotNullParameter(amountData, "amountData");
        Intrinsics.checkNotNullParameter(sourceAvailableData, "sourceAvailableData");
        Intrinsics.checkNotNullParameter(productData, "productData");
        return new l(sourceType, amountData, sourceAvailableData, z, productData);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f224276a == lVar.f224276a && Intrinsics.f(this.f224277b, lVar.f224277b) && Intrinsics.f(this.f224278c, lVar.f224278c) && this.d == lVar.d && Intrinsics.f(this.e, lVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + j6.a.c(kii.e.c(this.f224278c, kii.e.c(this.f224277b, this.f224276a.hashCode() * 31, 31), 31), 31, this.d);
    }
}
