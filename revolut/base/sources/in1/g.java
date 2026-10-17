package in1;

import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f162584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f162585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f162586c;
    public final String d;
    public final dj0.d e;
    public final dj0.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LocalDate f162587g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TransferScheduleData f162588h;
    public final hn1.a i;

    public g(dj0.d finalAmount, dj0.d dVar, String beneficiaryName, String str, dj0.d dVar2, dj0.d dVar3, LocalDate localDate, TransferScheduleData scheduleData, hn1.a boletoPocket) {
        Intrinsics.checkNotNullParameter(finalAmount, "finalAmount");
        Intrinsics.checkNotNullParameter(beneficiaryName, "beneficiaryName");
        Intrinsics.checkNotNullParameter(scheduleData, "scheduleData");
        Intrinsics.checkNotNullParameter(boletoPocket, "boletoPocket");
        this.f162584a = finalAmount;
        this.f162585b = dVar;
        this.f162586c = beneficiaryName;
        this.d = str;
        this.e = dVar2;
        this.f = dVar3;
        this.f162587g = localDate;
        this.f162588h = scheduleData;
        this.i = boletoPocket;
    }

    public static g a(g gVar, dj0.d dVar, TransferScheduleData transferScheduleData, hn1.a aVar, int i) {
        if ((i & 1) != 0) {
            dVar = gVar.f162584a;
        }
        dj0.d finalAmount = dVar;
        dj0.d dVar2 = gVar.f162585b;
        String beneficiaryName = gVar.f162586c;
        String str = gVar.d;
        dj0.d dVar3 = gVar.e;
        dj0.d dVar4 = gVar.f;
        LocalDate localDate = gVar.f162587g;
        if ((i & 128) != 0) {
            transferScheduleData = gVar.f162588h;
        }
        TransferScheduleData scheduleData = transferScheduleData;
        if ((i & 256) != 0) {
            aVar = gVar.i;
        }
        hn1.a boletoPocket = aVar;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(finalAmount, "finalAmount");
        Intrinsics.checkNotNullParameter(beneficiaryName, "beneficiaryName");
        Intrinsics.checkNotNullParameter(scheduleData, "scheduleData");
        Intrinsics.checkNotNullParameter(boletoPocket, "boletoPocket");
        return new g(finalAmount, dVar2, beneficiaryName, str, dVar3, dVar4, localDate, scheduleData, boletoPocket);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f162584a, gVar.f162584a) && Intrinsics.f(this.f162585b, gVar.f162585b) && Intrinsics.f(this.f162586c, gVar.f162586c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e) && Intrinsics.f(this.f, gVar.f) && Intrinsics.f(this.f162587g, gVar.f162587g) && Intrinsics.f(this.f162588h, gVar.f162588h) && Intrinsics.f(this.i, gVar.i);
    }

    public final int hashCode() {
        int iHashCode = this.f162584a.hashCode() * 31;
        dj0.d dVar = this.f162585b;
        int iC = p.a.c((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.f162586c);
        String str = this.d;
        int iHashCode2 = (iC + (str == null ? 0 : str.hashCode())) * 31;
        dj0.d dVar2 = this.e;
        int iHashCode3 = (iHashCode2 + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        dj0.d dVar3 = this.f;
        int iHashCode4 = (iHashCode3 + (dVar3 == null ? 0 : dVar3.hashCode())) * 31;
        LocalDate localDate = this.f162587g;
        return this.i.hashCode() + h30.l.f(this.f162588h, (iHashCode4 + (localDate != null ? localDate.hashCode() : 0)) * 31, 31);
    }
}
