package jel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f173503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f173504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f173505c;
    public final LocalDate d;
    public final List e;

    public m0(String str, String str2, dj0.d dVar, LocalDate localDate, ArrayList arrayList) {
        this.f173503a = str;
        this.f173504b = str2;
        this.f173505c = dVar;
        this.d = localDate;
        this.e = arrayList;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj2;
        return Intrinsics.f(this.f173503a, m0Var.f173503a) && Intrinsics.f(this.f173504b, m0Var.f173504b) && Intrinsics.f(this.f173505c, m0Var.f173505c) && Intrinsics.f(this.d, m0Var.d) && Intrinsics.f(this.e, m0Var.e);
    }

    public final int hashCode() {
        String str = this.f173503a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f173504b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        dj0.d dVar = this.f173505c;
        int iHashCode3 = (iHashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        LocalDate localDate = this.d;
        int iHashCode4 = (iHashCode3 + (localDate == null ? 0 : localDate.hashCode())) * 31;
        List list = this.e;
        return iHashCode4 + (list != null ? list.hashCode() : 0);
    }
}
