package in1;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import vkm.j2;

/* JADX INFO: loaded from: classes20.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f162589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f162590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f162591c;
    public final String d;
    public final dj0.d e;
    public final dj0.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LocalDate f162592g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final MutableStateFlow f162593h;

    public h(dj0.d finalAmount, dj0.d dVar, String beneficiaryName, String str, dj0.d dVar2, dj0.d dVar3, LocalDate localDate, j2 scheduleData) {
        Intrinsics.checkNotNullParameter(finalAmount, "finalAmount");
        Intrinsics.checkNotNullParameter(beneficiaryName, "beneficiaryName");
        Intrinsics.checkNotNullParameter(scheduleData, "scheduleData");
        this.f162589a = finalAmount;
        this.f162590b = dVar;
        this.f162591c = beneficiaryName;
        this.d = str;
        this.e = dVar2;
        this.f = dVar3;
        this.f162592g = localDate;
        this.f162593h = scheduleData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f162589a, hVar.f162589a) && Intrinsics.f(this.f162590b, hVar.f162590b) && Intrinsics.f(this.f162591c, hVar.f162591c) && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e) && Intrinsics.f(this.f, hVar.f) && Intrinsics.f(this.f162592g, hVar.f162592g) && Intrinsics.f(this.f162593h, hVar.f162593h);
    }

    public final int hashCode() {
        int iHashCode = this.f162589a.hashCode() * 31;
        dj0.d dVar = this.f162590b;
        int iC = p.a.c((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.f162591c);
        String str = this.d;
        int iHashCode2 = (iC + (str == null ? 0 : str.hashCode())) * 31;
        dj0.d dVar2 = this.e;
        int iHashCode3 = (iHashCode2 + (dVar2 == null ? 0 : dVar2.hashCode())) * 31;
        dj0.d dVar3 = this.f;
        int iHashCode4 = (iHashCode3 + (dVar3 == null ? 0 : dVar3.hashCode())) * 31;
        LocalDate localDate = this.f162592g;
        return this.f162593h.hashCode() + ((iHashCode4 + (localDate != null ? localDate.hashCode() : 0)) * 31);
    }
}
