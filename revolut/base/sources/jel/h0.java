package jel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k0 f173455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f173456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f173457c;
    public final LocalDate d;
    public final List e;
    public final dj0.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e1 f173458g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a0 f173459h;
    public final y i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Integer f173460j;

    public h0(k0 k0Var, String str, String str2, LocalDate localDate, ArrayList arrayList, dj0.d dVar, e1 e1Var, a0 a0Var, y yVar, Integer num) {
        this.f173455a = k0Var;
        this.f173456b = str;
        this.f173457c = str2;
        this.d = localDate;
        this.e = arrayList;
        this.f = dVar;
        this.f173458g = e1Var;
        this.f173459h = a0Var;
        this.i = yVar;
        this.f173460j = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj2;
        return this.f173455a == h0Var.f173455a && Intrinsics.f(this.f173456b, h0Var.f173456b) && Intrinsics.f(this.f173457c, h0Var.f173457c) && Intrinsics.f(this.d, h0Var.d) && Intrinsics.f(this.e, h0Var.e) && Intrinsics.f(this.f, h0Var.f) && this.f173458g == h0Var.f173458g && this.f173459h == h0Var.f173459h && this.i == h0Var.i && Intrinsics.f(this.f173460j, h0Var.f173460j);
    }

    public final int hashCode() {
        k0 k0Var = this.f173455a;
        int iHashCode = (k0Var == null ? 0 : k0Var.hashCode()) * 31;
        String str = this.f173456b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f173457c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        LocalDate localDate = this.d;
        int iHashCode4 = (iHashCode3 + (localDate == null ? 0 : localDate.hashCode())) * 31;
        List list = this.e;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        dj0.d dVar = this.f;
        int iHashCode6 = (iHashCode5 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        e1 e1Var = this.f173458g;
        int iHashCode7 = (iHashCode6 + (e1Var == null ? 0 : e1Var.hashCode())) * 31;
        a0 a0Var = this.f173459h;
        int iHashCode8 = (iHashCode7 + (a0Var == null ? 0 : a0Var.hashCode())) * 31;
        y yVar = this.i;
        int iHashCode9 = (iHashCode8 + (yVar == null ? 0 : yVar.hashCode())) * 31;
        Integer num = this.f173460j;
        return iHashCode9 + (num != null ? num.hashCode() : 0);
    }
}
