package com.revolut.feature.junior_profile.api.models;

import ij8.i;
import ij8.j;
import java.time.LocalDate;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import wp5.y;
import yhm.k;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class c extends a {

    @NotNull
    public static final j Companion = new j();
    public static final Lazy[] k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f77115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f77116c;
    public final bj0.b d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f77117g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f77118h;
    public final LocalDate i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f77119j;

    static {
        k kVar = k.PUBLICATION;
        k = new Lazy[]{null, null, null, yhm.j.c(kVar, new igb.j(12)), null, null, null, null, null, yhm.j.c(kVar, new igb.j(13))};
    }

    public c(int i, String str, String str2, String str3, bj0.b bVar, String str4, String str5, String str6, String str7, LocalDate localDate, List list) {
        if (1023 != (i & 1023)) {
            j1.f(i.f161733a.getDescriptor(), i, 1023);
            throw null;
        }
        this.f77114a = str;
        this.f77115b = str2;
        this.f77116c = str3;
        this.d = bVar;
        this.e = str4;
        this.f = str5;
        this.f77117g = str6;
        this.f77118h = str7;
        this.i = localDate;
        this.f77119j = list;
    }

    @Override // com.revolut.feature.junior_profile.api.models.a
    /* JADX INFO: renamed from: a */
    public final LocalDate getI() {
        return this.i;
    }

    @Override // com.revolut.feature.junior_profile.api.models.a
    /* JADX INFO: renamed from: b */
    public final bj0.b getD() {
        return this.d;
    }

    @Override // com.revolut.feature.junior_profile.api.models.a
    /* JADX INFO: renamed from: c */
    public final String getF77098a() {
        return this.f77114a;
    }

    @Override // com.revolut.feature.junior_profile.api.models.a
    /* JADX INFO: renamed from: d */
    public final String getF77100c() {
        return this.f77116c;
    }

    public final List e() {
        return this.f77119j;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f77114a, cVar.f77114a) && Intrinsics.f(this.f77115b, cVar.f77115b) && Intrinsics.f(this.f77116c, cVar.f77116c) && this.d == cVar.d && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f) && Intrinsics.f(this.f77117g, cVar.f77117g) && Intrinsics.f(this.f77118h, cVar.f77118h) && Intrinsics.f(this.i, cVar.i) && Intrinsics.f(this.f77119j, cVar.f77119j);
    }

    @Override // com.revolut.feature.junior_profile.api.models.a
    /* JADX INFO: renamed from: getFirstName */
    public final String getF77099b() {
        return this.f77115b;
    }

    @Override // com.revolut.feature.junior_profile.api.models.a
    /* JADX INFO: renamed from: getPhone */
    public final String getF() {
        return this.f;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + p.a.c(p.a.c(this.f77114a.hashCode() * 31, 31, this.f77115b), 31, this.f77116c)) * 31;
        String str = this.e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f77117g;
        return this.f77119j.hashCode() + y.a(p.a.c((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.f77118h), 31, this.i);
    }
}
