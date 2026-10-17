package my3;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f210325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f210326b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f210327c;
    public final String d;
    public final LocalDate e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f210328g;

    public k(String id10, boolean z, boolean z3, String label, LocalDate localDate, String str, String initialTextValue) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(initialTextValue, "initialTextValue");
        this.f210325a = id10;
        this.f210326b = z;
        this.f210327c = z3;
        this.d = label;
        this.e = localDate;
        this.f = str;
        this.f210328g = initialTextValue;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f210325a, kVar.f210325a) && this.f210326b == kVar.f210326b && this.f210327c == kVar.f210327c && Intrinsics.f(this.d, kVar.d) && Intrinsics.f(this.e, kVar.e) && Intrinsics.f(this.f, kVar.f) && Intrinsics.f(this.f210328g, kVar.f210328g);
    }

    @Override // my3.o
    public final boolean f0() {
        return this.f210327c;
    }

    @Override // my3.o
    public final String getId() {
        return this.f210325a;
    }

    @Override // my3.o
    public final Object getValue() {
        return this.e;
    }

    public final int hashCode() {
        int iC = p.a.c(j6.a.c(j6.a.c(this.f210325a.hashCode() * 31, 31, this.f210326b), 31, this.f210327c), 31, this.d);
        LocalDate localDate = this.e;
        int iHashCode = (iC + (localDate == null ? 0 : localDate.hashCode())) * 31;
        String str = this.f;
        return this.f210328g.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // my3.o
    public final boolean k0() {
        return this.f210326b;
    }
}
