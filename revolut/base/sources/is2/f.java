package is2;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes21.dex */
public final class f implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f168081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f168082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f168083c;
    public final a3 d;
    public final boolean e;

    public f(String searchQuery, Data transactions, Data blockedMerchants, a3 a3Var, boolean z) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        Intrinsics.checkNotNullParameter(blockedMerchants, "blockedMerchants");
        this.f168081a = searchQuery;
        this.f168082b = transactions;
        this.f168083c = blockedMerchants;
        this.d = a3Var;
        this.e = z;
    }

    public static f a(f fVar, String str, Data data, Data data2, a3 a3Var, boolean z, int i) {
        if ((i & 1) != 0) {
            str = fVar.f168081a;
        }
        String searchQuery = str;
        if ((i & 2) != 0) {
            data = fVar.f168082b;
        }
        Data transactions = data;
        if ((i & 4) != 0) {
            data2 = fVar.f168083c;
        }
        Data blockedMerchants = data2;
        if ((i & 8) != 0) {
            a3Var = fVar.d;
        }
        a3 a3Var2 = a3Var;
        if ((i & 16) != 0) {
            z = fVar.e;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        Intrinsics.checkNotNullParameter(blockedMerchants, "blockedMerchants");
        return new f(searchQuery, transactions, blockedMerchants, a3Var2, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f168081a, fVar.f168081a) && Intrinsics.f(this.f168082b, fVar.f168082b) && Intrinsics.f(this.f168083c, fVar.f168083c) && Intrinsics.f(this.d, fVar.d) && this.e == fVar.e;
    }

    public final int hashCode() {
        int iC = kii.e.c(this.f168083c, kii.e.c(this.f168082b, this.f168081a.hashCode() * 31, 31), 31);
        a3 a3Var = this.d;
        return Boolean.hashCode(this.e) + ((iC + (a3Var == null ? 0 : a3Var.hashCode())) * 31);
    }
}
