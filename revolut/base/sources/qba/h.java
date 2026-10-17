package qba;

import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f244154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f244155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f244156c;
    public final String d;
    public final io3.d e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LocalDate f244157g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f244158h;
    public final TransferScheduleData i;

    public h(dj0.d amount, String beneficiaryName, String beneficiarySubtitle, String reference, io3.d pocket, String str, LocalDate localDate, boolean z, TransferScheduleData scheduleData) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(beneficiaryName, "beneficiaryName");
        Intrinsics.checkNotNullParameter(beneficiarySubtitle, "beneficiarySubtitle");
        Intrinsics.checkNotNullParameter(reference, "reference");
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        Intrinsics.checkNotNullParameter(scheduleData, "scheduleData");
        this.f244154a = amount;
        this.f244155b = beneficiaryName;
        this.f244156c = beneficiarySubtitle;
        this.d = reference;
        this.e = pocket;
        this.f = str;
        this.f244157g = localDate;
        this.f244158h = z;
        this.i = scheduleData;
    }

    public static h a(h hVar, dj0.d dVar, String str, io3.d dVar2, TransferScheduleData transferScheduleData, int i) {
        if ((i & 1) != 0) {
            dVar = hVar.f244154a;
        }
        dj0.d amount = dVar;
        String beneficiaryName = hVar.f244155b;
        String beneficiarySubtitle = hVar.f244156c;
        if ((i & 8) != 0) {
            str = hVar.d;
        }
        String reference = str;
        if ((i & 16) != 0) {
            dVar2 = hVar.e;
        }
        io3.d pocket = dVar2;
        String str2 = hVar.f;
        LocalDate localDate = hVar.f244157g;
        boolean z = hVar.f244158h;
        if ((i & 256) != 0) {
            transferScheduleData = hVar.i;
        }
        TransferScheduleData scheduleData = transferScheduleData;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(beneficiaryName, "beneficiaryName");
        Intrinsics.checkNotNullParameter(beneficiarySubtitle, "beneficiarySubtitle");
        Intrinsics.checkNotNullParameter(reference, "reference");
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        Intrinsics.checkNotNullParameter(scheduleData, "scheduleData");
        return new h(amount, beneficiaryName, beneficiarySubtitle, reference, pocket, str2, localDate, z, scheduleData);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f244154a, hVar.f244154a) && Intrinsics.f(this.f244155b, hVar.f244155b) && Intrinsics.f(this.f244156c, hVar.f244156c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e) && Intrinsics.f(this.f, hVar.f) && Intrinsics.f(this.f244157g, hVar.f244157g) && this.f244158h == hVar.f244158h && Intrinsics.f(this.i, hVar.i);
    }

    public final int hashCode() {
        int iG = h30.l.g(this.e, p.a.c(p.a.c(p.a.c(this.f244154a.hashCode() * 31, 31, this.f244155b), 31, this.f244156c), 31, this.d), 31);
        String str = this.f;
        int iHashCode = (iG + (str == null ? 0 : str.hashCode())) * 31;
        LocalDate localDate = this.f244157g;
        return this.i.hashCode() + j6.a.c((iHashCode + (localDate != null ? localDate.hashCode() : 0)) * 31, 31, this.f244158h);
    }
}
