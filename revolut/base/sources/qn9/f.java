package qn9;

import com.revolut.data.model.Data;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f247879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f247880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f247881c;
    public final String d;
    public final Data e;

    public f(xi0.b displayCurrency, long j2, List pockets, String str, Data orderInitiationDetails) {
        Intrinsics.checkNotNullParameter(displayCurrency, "displayCurrency");
        Intrinsics.checkNotNullParameter(pockets, "pockets");
        Intrinsics.checkNotNullParameter(orderInitiationDetails, "orderInitiationDetails");
        this.f247879a = displayCurrency;
        this.f247880b = j2;
        this.f247881c = pockets;
        this.d = str;
        this.e = orderInitiationDetails;
    }

    public static f a(f fVar, xi0.b bVar, long j2, ArrayList arrayList, String str, Data data, int i) {
        if ((i & 1) != 0) {
            bVar = fVar.f247879a;
        }
        xi0.b displayCurrency = bVar;
        if ((i & 2) != 0) {
            j2 = fVar.f247880b;
        }
        long j3 = j2;
        List list = arrayList;
        if ((i & 4) != 0) {
            list = fVar.f247881c;
        }
        List pockets = list;
        if ((i & 8) != 0) {
            str = fVar.d;
        }
        String str2 = str;
        if ((i & 16) != 0) {
            data = fVar.e;
        }
        Data orderInitiationDetails = data;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(displayCurrency, "displayCurrency");
        Intrinsics.checkNotNullParameter(pockets, "pockets");
        Intrinsics.checkNotNullParameter(orderInitiationDetails, "orderInitiationDetails");
        return new f(displayCurrency, j3, pockets, str2, orderInitiationDetails);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f247879a, fVar.f247879a) && this.f247880b == fVar.f247880b && Intrinsics.f(this.f247881c, fVar.f247881c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e);
    }

    public final int hashCode() {
        int iD = p.a.d(a0.d.c(this.f247879a.hashCode() * 31, 31, this.f247880b), 31, this.f247881c);
        String str = this.d;
        return this.e.hashCode() + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }
}
