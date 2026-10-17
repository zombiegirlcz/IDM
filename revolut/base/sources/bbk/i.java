package bbk;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f14325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f14326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f14327c;
    public final tak.b d;
    public final Clause e;

    public i(boolean z, Data paymentData, List detailsItems, tak.b bVar, Clause clause) {
        Intrinsics.checkNotNullParameter(paymentData, "paymentData");
        Intrinsics.checkNotNullParameter(detailsItems, "detailsItems");
        this.f14325a = z;
        this.f14326b = paymentData;
        this.f14327c = detailsItems;
        this.d = bVar;
        this.e = clause;
    }

    public static i a(i iVar, boolean z, Data data, List list, tak.b bVar, Clause clause, int i) {
        if ((i & 1) != 0) {
            z = iVar.f14325a;
        }
        boolean z3 = z;
        if ((i & 2) != 0) {
            data = iVar.f14326b;
        }
        Data paymentData = data;
        if ((i & 4) != 0) {
            list = iVar.f14327c;
        }
        List detailsItems = list;
        if ((i & 8) != 0) {
            bVar = iVar.d;
        }
        tak.b bVar2 = bVar;
        if ((i & 16) != 0) {
            clause = iVar.e;
        }
        iVar.getClass();
        Intrinsics.checkNotNullParameter(paymentData, "paymentData");
        Intrinsics.checkNotNullParameter(detailsItems, "detailsItems");
        return new i(z3, paymentData, detailsItems, bVar2, clause);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f14325a == iVar.f14325a && Intrinsics.f(this.f14326b, iVar.f14326b) && Intrinsics.f(this.f14327c, iVar.f14327c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e);
    }

    public final int hashCode() {
        int iD = p.a.d(kii.e.c(this.f14326b, Boolean.hashCode(this.f14325a) * 31, 31), 31, this.f14327c);
        tak.b bVar = this.d;
        int iHashCode = (iD + (bVar == null ? 0 : bVar.hashCode())) * 31;
        Clause clause = this.e;
        return iHashCode + (clause != null ? clause.hashCode() : 0);
    }
}
