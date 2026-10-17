package nuc;

import com.revolut.data.model.Data;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f219283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f219284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f219285c;
    public final Set d;
    public final k e;

    public h() {
        this(0);
    }

    public static h a(h hVar, Data data, String str, LinkedHashSet linkedHashSet, k kVar, int i) {
        if ((i & 1) != 0) {
            data = hVar.f219283a;
        }
        Data transactions = data;
        if ((i & 2) != 0) {
            str = hVar.f219284b;
        }
        String searchQuery = str;
        boolean z = hVar.f219285c;
        Set set = linkedHashSet;
        if ((i & 8) != 0) {
            set = hVar.d;
        }
        Set selectedTransactionIds = set;
        if ((i & 16) != 0) {
            kVar = hVar.e;
        }
        hVar.getClass();
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(selectedTransactionIds, "selectedTransactionIds");
        return new h(transactions, searchQuery, z, selectedTransactionIds, kVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f219283a, hVar.f219283a) && Intrinsics.f(this.f219284b, hVar.f219284b) && this.f219285c == hVar.f219285c && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e);
    }

    public final int hashCode() {
        int iF = p.a.f(j6.a.c(p.a.c(this.f219283a.hashCode() * 31, 31, this.f219284b), 31, this.f219285c), 31, this.d);
        k kVar = this.e;
        return iF + (kVar == null ? 0 : kVar.hashCode());
    }

    public h(Data transactions, String searchQuery, boolean z, Set selectedTransactionIds, k kVar) {
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(selectedTransactionIds, "selectedTransactionIds");
        this.f219283a = transactions;
        this.f219284b = searchQuery;
        this.f219285c = z;
        this.d = selectedTransactionIds;
        this.e = kVar;
    }

    public h(int i) {
        this(new Data(null, null, true, 3, null), "", false, h0.f322473a, null);
    }
}
