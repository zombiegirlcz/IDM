package hl7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f153089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f153090c;
    public final String d;
    public final String e;
    public final t9 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f153091g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f153092h;

    public /* synthetic */ f(int i, String str, String str2, String str3, String str4, String str5, t9 t9Var, String str6, String str7) {
        if (255 != (i & 255)) {
            qlm.j1.f(d.f153054a.getDescriptor(), i, 255);
            throw null;
        }
        this.f153088a = str;
        this.f153089b = str2;
        this.f153090c = str3;
        this.d = str4;
        this.e = str5;
        this.f = t9Var;
        this.f153091g = str6;
        this.f153092h = str7;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f153088a, fVar.f153088a) && Intrinsics.f(this.f153089b, fVar.f153089b) && Intrinsics.f(this.f153090c, fVar.f153090c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e) && Intrinsics.f(this.f, fVar.f) && Intrinsics.f(this.f153091g, fVar.f153091g) && Intrinsics.f(this.f153092h, fVar.f153092h);
    }

    public final int hashCode() {
        String str = this.f153088a;
        int iHashCode = (this.f.hashCode() + p.a.c(p.a.c(p.a.c(p.a.c((str == null ? 0 : str.hashCode()) * 31, 31, this.f153089b), 31, this.f153090c), 31, this.d), 31, this.e)) * 31;
        String str2 = this.f153091g;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f153092h;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public f(String str, String firstName, String lastName, String birthDate, String relationship, t9 survey, String str2, String str3) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(birthDate, "birthDate");
        Intrinsics.checkNotNullParameter(relationship, "relationship");
        Intrinsics.checkNotNullParameter(survey, "survey");
        this.f153088a = str;
        this.f153089b = firstName;
        this.f153090c = lastName;
        this.d = birthDate;
        this.e = relationship;
        this.f = survey;
        this.f153091g = str2;
        this.f153092h = str3;
    }
}
