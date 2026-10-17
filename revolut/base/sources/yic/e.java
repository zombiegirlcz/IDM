package yic;

import com.revolut.data.model.Data;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f314277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f314278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f314279c;
    public final Data d;
    public final Data e;
    public final qv0.i f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Data f314280g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LocalDate f314281h;

    public e(Data linkedPayments, Data revPoints, Data configurations, Data plan, Data upgradeAvailable, qv0.i iVar, Data helpItemsData, LocalDate localDate) {
        Intrinsics.checkNotNullParameter(linkedPayments, "linkedPayments");
        Intrinsics.checkNotNullParameter(revPoints, "revPoints");
        Intrinsics.checkNotNullParameter(configurations, "configurations");
        Intrinsics.checkNotNullParameter(plan, "plan");
        Intrinsics.checkNotNullParameter(upgradeAvailable, "upgradeAvailable");
        Intrinsics.checkNotNullParameter(helpItemsData, "helpItemsData");
        this.f314277a = linkedPayments;
        this.f314278b = revPoints;
        this.f314279c = configurations;
        this.d = plan;
        this.e = upgradeAvailable;
        this.f = iVar;
        this.f314280g = helpItemsData;
        this.f314281h = localDate;
    }

    public static e a(e eVar, Data data, Data data2, Data data3, Data data4, Data data5, qv0.i iVar, Data data6, LocalDate localDate, int i) {
        if ((i & 1) != 0) {
            data = eVar.f314277a;
        }
        Data linkedPayments = data;
        if ((i & 2) != 0) {
            data2 = eVar.f314278b;
        }
        Data revPoints = data2;
        if ((i & 4) != 0) {
            data3 = eVar.f314279c;
        }
        Data configurations = data3;
        if ((i & 8) != 0) {
            data4 = eVar.d;
        }
        Data plan = data4;
        if ((i & 16) != 0) {
            data5 = eVar.e;
        }
        Data upgradeAvailable = data5;
        if ((i & 32) != 0) {
            iVar = eVar.f;
        }
        qv0.i iVar2 = iVar;
        Data helpItemsData = (i & 64) != 0 ? eVar.f314280g : data6;
        LocalDate localDate2 = (i & 128) != 0 ? eVar.f314281h : localDate;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(linkedPayments, "linkedPayments");
        Intrinsics.checkNotNullParameter(revPoints, "revPoints");
        Intrinsics.checkNotNullParameter(configurations, "configurations");
        Intrinsics.checkNotNullParameter(plan, "plan");
        Intrinsics.checkNotNullParameter(upgradeAvailable, "upgradeAvailable");
        Intrinsics.checkNotNullParameter(helpItemsData, "helpItemsData");
        return new e(linkedPayments, revPoints, configurations, plan, upgradeAvailable, iVar2, helpItemsData, localDate2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f314277a, eVar.f314277a) && Intrinsics.f(this.f314278b, eVar.f314278b) && Intrinsics.f(this.f314279c, eVar.f314279c) && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e) && Intrinsics.f(this.f, eVar.f) && Intrinsics.f(this.f314280g, eVar.f314280g) && Intrinsics.f(this.f314281h, eVar.f314281h);
    }

    public final int hashCode() {
        int iC = kii.e.c(this.e, kii.e.c(this.d, kii.e.c(this.f314279c, kii.e.c(this.f314278b, this.f314277a.hashCode() * 31, 31), 31), 31), 31);
        qv0.i iVar = this.f;
        int iC2 = kii.e.c(this.f314280g, (iC + (iVar == null ? 0 : iVar.hashCode())) * 31, 31);
        LocalDate localDate = this.f314281h;
        return iC2 + (localDate != null ? localDate.hashCode() : 0);
    }
}
