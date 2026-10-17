package djc;

import com.revolut.data.model.Data;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final egc.a f115299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f115300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f115301c;
    public final Data d;
    public final qv0.i e;
    public final LocalDate f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f115302g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f115303h;

    public i(egc.a categoryType, Data recurringPayments, Data linkedPayments, Data revPoints, qv0.i iVar, LocalDate localDate, Data helpItemsData, boolean z) {
        Intrinsics.checkNotNullParameter(categoryType, "categoryType");
        Intrinsics.checkNotNullParameter(recurringPayments, "recurringPayments");
        Intrinsics.checkNotNullParameter(linkedPayments, "linkedPayments");
        Intrinsics.checkNotNullParameter(revPoints, "revPoints");
        Intrinsics.checkNotNullParameter(helpItemsData, "helpItemsData");
        this.f115299a = categoryType;
        this.f115300b = recurringPayments;
        this.f115301c = linkedPayments;
        this.d = revPoints;
        this.e = iVar;
        this.f = localDate;
        this.f115302g = helpItemsData;
        this.f115303h = z;
    }

    public static i a(i iVar, Data data, Data linkedPayments, Data revPoints, qv0.i iVar2, LocalDate localDate, Data helpItemsData, boolean z, int i) {
        Data recurringPayments = data;
        egc.a categoryType = iVar.f115299a;
        if ((i & 2) != 0) {
            recurringPayments = iVar.f115300b;
        }
        if ((i & 4) != 0) {
            linkedPayments = iVar.f115301c;
        }
        if ((i & 8) != 0) {
            revPoints = iVar.d;
        }
        if ((i & 16) != 0) {
            iVar2 = iVar.e;
        }
        if ((i & 32) != 0) {
            localDate = iVar.f;
        }
        if ((i & 64) != 0) {
            helpItemsData = iVar.f115302g;
        }
        if ((i & 128) != 0) {
            z = iVar.f115303h;
        }
        boolean z3 = z;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(categoryType, "categoryType");
        Intrinsics.checkNotNullParameter(recurringPayments, "recurringPayments");
        Intrinsics.checkNotNullParameter(linkedPayments, "linkedPayments");
        Intrinsics.checkNotNullParameter(revPoints, "revPoints");
        Intrinsics.checkNotNullParameter(helpItemsData, "helpItemsData");
        Data data2 = helpItemsData;
        LocalDate localDate2 = localDate;
        qv0.i iVar3 = iVar2;
        Data data3 = revPoints;
        return new i(categoryType, recurringPayments, linkedPayments, data3, iVar3, localDate2, data2, z3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f115299a == iVar.f115299a && Intrinsics.f(this.f115300b, iVar.f115300b) && Intrinsics.f(this.f115301c, iVar.f115301c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e) && Intrinsics.f(this.f, iVar.f) && Intrinsics.f(this.f115302g, iVar.f115302g) && this.f115303h == iVar.f115303h;
    }

    public final int hashCode() {
        int iC = kii.e.c(this.d, kii.e.c(this.f115301c, kii.e.c(this.f115300b, this.f115299a.hashCode() * 31, 31), 31), 31);
        qv0.i iVar = this.e;
        int iHashCode = (iC + (iVar == null ? 0 : iVar.hashCode())) * 31;
        LocalDate localDate = this.f;
        return Boolean.hashCode(this.f115303h) + kii.e.c(this.f115302g, (iHashCode + (localDate != null ? localDate.hashCode() : 0)) * 31, 31);
    }
}
