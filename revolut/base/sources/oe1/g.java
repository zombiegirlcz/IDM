package oe1;

import com.revolut.feature.acquiring.lite_pos.api.model.TaxRate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f224507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f224508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f224509c;
    public final String d;
    public final TaxRate e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final od1.b f224510g;

    public g(xi0.b currency, String formattedAmount, long j2, String description, TaxRate taxRate, int i, od1.b focusedField) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(formattedAmount, "formattedAmount");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(focusedField, "focusedField");
        this.f224507a = currency;
        this.f224508b = formattedAmount;
        this.f224509c = j2;
        this.d = description;
        this.e = taxRate;
        this.f = i;
        this.f224510g = focusedField;
    }

    public static g a(g gVar, String str, long j2, String description, TaxRate taxRate, int i, od1.b bVar, int i2) {
        String formattedAmount = str;
        xi0.b currency = gVar.f224507a;
        if ((i2 & 2) != 0) {
            formattedAmount = gVar.f224508b;
        }
        if ((i2 & 4) != 0) {
            j2 = gVar.f224509c;
        }
        if ((i2 & 8) != 0) {
            description = gVar.d;
        }
        if ((i2 & 16) != 0) {
            taxRate = gVar.e;
        }
        if ((i2 & 32) != 0) {
            i = gVar.f;
        }
        if ((i2 & 64) != 0) {
            bVar = gVar.f224510g;
        }
        od1.b focusedField = bVar;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(formattedAmount, "formattedAmount");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(focusedField, "focusedField");
        int i3 = i;
        long j3 = j2;
        return new g(currency, formattedAmount, j3, description, taxRate, i3, focusedField);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f224507a, gVar.f224507a) && Intrinsics.f(this.f224508b, gVar.f224508b) && this.f224509c == gVar.f224509c && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e) && this.f == gVar.f && this.f224510g == gVar.f224510g;
    }

    public final int hashCode() {
        int iC = p.a.c(a0.d.c(p.a.c(this.f224507a.hashCode() * 31, 31, this.f224508b), 31, this.f224509c), 31, this.d);
        TaxRate taxRate = this.e;
        return this.f224510g.hashCode() + j6.a.b(this.f, (iC + (taxRate == null ? 0 : taxRate.hashCode())) * 31, 31);
    }
}
