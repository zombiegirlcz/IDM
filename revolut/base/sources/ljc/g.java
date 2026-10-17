package ljc;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final egc.a f195622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f195623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f195624c;
    public final Data d;
    public final qua.p e;
    public final String f;

    public g(egc.a categoryType, Data recurringPayments, Data linkedPayments, Data exchangeRates, qua.p pVar, String searchQuery) {
        Intrinsics.checkNotNullParameter(categoryType, "categoryType");
        Intrinsics.checkNotNullParameter(recurringPayments, "recurringPayments");
        Intrinsics.checkNotNullParameter(linkedPayments, "linkedPayments");
        Intrinsics.checkNotNullParameter(exchangeRates, "exchangeRates");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        this.f195622a = categoryType;
        this.f195623b = recurringPayments;
        this.f195624c = linkedPayments;
        this.d = exchangeRates;
        this.e = pVar;
        this.f = searchQuery;
    }

    public static g a(g gVar, Data data, Data linkedPayments, Data exchangeRates, qua.p pVar, String str, int i) {
        Data recurringPayments = data;
        egc.a categoryType = gVar.f195622a;
        if ((i & 2) != 0) {
            recurringPayments = gVar.f195623b;
        }
        if ((i & 4) != 0) {
            linkedPayments = gVar.f195624c;
        }
        if ((i & 8) != 0) {
            exchangeRates = gVar.d;
        }
        if ((i & 16) != 0) {
            pVar = gVar.e;
        }
        if ((i & 32) != 0) {
            str = gVar.f;
        }
        String searchQuery = str;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(categoryType, "categoryType");
        Intrinsics.checkNotNullParameter(recurringPayments, "recurringPayments");
        Intrinsics.checkNotNullParameter(linkedPayments, "linkedPayments");
        Intrinsics.checkNotNullParameter(exchangeRates, "exchangeRates");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        qua.p pVar2 = pVar;
        Data data2 = exchangeRates;
        return new g(categoryType, recurringPayments, linkedPayments, data2, pVar2, searchQuery);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f195622a == gVar.f195622a && Intrinsics.f(this.f195623b, gVar.f195623b) && Intrinsics.f(this.f195624c, gVar.f195624c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e) && Intrinsics.f(this.f, gVar.f);
    }

    public final int hashCode() {
        int iC = kii.e.c(this.d, kii.e.c(this.f195624c, kii.e.c(this.f195623b, this.f195622a.hashCode() * 31, 31), 31), 31);
        qua.p pVar = this.e;
        return this.f.hashCode() + ((iC + (pVar == null ? 0 : pVar.hashCode())) * 31);
    }
}
