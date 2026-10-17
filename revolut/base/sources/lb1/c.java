package lb1;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f193571a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f193572b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ya1.l f193573c;

    public c(Data productDetailsData, Data addressData, ya1.l lVar) {
        Intrinsics.checkNotNullParameter(productDetailsData, "productDetailsData");
        Intrinsics.checkNotNullParameter(addressData, "addressData");
        this.f193571a = productDetailsData;
        this.f193572b = addressData;
        this.f193573c = lVar;
    }

    public static c a(c cVar, Data productDetailsData, Data addressData, ya1.l lVar, int i) {
        if ((i & 1) != 0) {
            productDetailsData = cVar.f193571a;
        }
        if ((i & 2) != 0) {
            addressData = cVar.f193572b;
        }
        if ((i & 4) != 0) {
            lVar = cVar.f193573c;
        }
        cVar.getClass();
        Intrinsics.checkNotNullParameter(productDetailsData, "productDetailsData");
        Intrinsics.checkNotNullParameter(addressData, "addressData");
        return new c(productDetailsData, addressData, lVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f193571a, cVar.f193571a) && Intrinsics.f(this.f193572b, cVar.f193572b) && Intrinsics.f(this.f193573c, cVar.f193573c);
    }

    public final int hashCode() {
        int iC = kii.e.c(this.f193572b, this.f193571a.hashCode() * 31, 31);
        ya1.l lVar = this.f193573c;
        return iC + (lVar == null ? 0 : lVar.hashCode());
    }
}
