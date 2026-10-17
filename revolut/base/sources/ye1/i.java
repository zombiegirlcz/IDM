package ye1;

import com.revolut.feature.acquiring.lite_pos.api.model.TaxRate;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f312745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f312746b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f312747c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f312748g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final od1.b f312749h;
    public final List i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f312750j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f312751l;

    public i(xi0.b bVar, String formattedAmount, long j2, String description, String color, String initialColor, String str, od1.b focusedField, List availableCategories, List availableTaxRates, String str2, boolean z) {
        Intrinsics.checkNotNullParameter(formattedAmount, "formattedAmount");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(initialColor, "initialColor");
        Intrinsics.checkNotNullParameter(focusedField, "focusedField");
        Intrinsics.checkNotNullParameter(availableCategories, "availableCategories");
        Intrinsics.checkNotNullParameter(availableTaxRates, "availableTaxRates");
        this.f312745a = bVar;
        this.f312746b = formattedAmount;
        this.f312747c = j2;
        this.d = description;
        this.e = color;
        this.f = initialColor;
        this.f312748g = str;
        this.f312749h = focusedField;
        this.i = availableCategories;
        this.f312750j = availableTaxRates;
        this.k = str2;
        this.f312751l = z;
    }

    public static i a(i iVar, xi0.b bVar, String str, long j2, String str2, String str3, String str4, od1.b bVar2, List list, List list2, String str5, boolean z, int i) {
        if ((i & 1) != 0) {
            bVar = iVar.f312745a;
        }
        xi0.b bVar3 = bVar;
        String formattedAmount = (i & 2) != 0 ? iVar.f312746b : str;
        long j3 = (i & 4) != 0 ? iVar.f312747c : j2;
        String description = (i & 8) != 0 ? iVar.d : str2;
        String color = (i & 16) != 0 ? iVar.e : str3;
        String initialColor = iVar.f;
        String str6 = (i & 64) != 0 ? iVar.f312748g : str4;
        od1.b focusedField = (i & 128) != 0 ? iVar.f312749h : bVar2;
        List availableCategories = (i & 256) != 0 ? iVar.i : list;
        List availableTaxRates = (i & 512) != 0 ? iVar.f312750j : list2;
        String str7 = (i & 1024) != 0 ? iVar.k : str5;
        boolean z3 = (i & 2048) != 0 ? iVar.f312751l : z;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(formattedAmount, "formattedAmount");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(initialColor, "initialColor");
        Intrinsics.checkNotNullParameter(focusedField, "focusedField");
        Intrinsics.checkNotNullParameter(availableCategories, "availableCategories");
        Intrinsics.checkNotNullParameter(availableTaxRates, "availableTaxRates");
        return new i(bVar3, formattedAmount, j3, description, color, initialColor, str6, focusedField, availableCategories, availableTaxRates, str7, z3);
    }

    public final TaxRate c() {
        Object obj2 = null;
        String str = this.k;
        if (str == null) {
            return null;
        }
        Iterator it8 = this.f312750j.iterator();
        while (true) {
            if (!it8.hasNext()) {
                break;
            }
            Object next = it8.next();
            if (Intrinsics.f(((TaxRate) next).f60694a, str)) {
                obj2 = next;
                break;
            }
        }
        return (TaxRate) obj2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f312745a, iVar.f312745a) && Intrinsics.f(this.f312746b, iVar.f312746b) && this.f312747c == iVar.f312747c && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e) && Intrinsics.f(this.f, iVar.f) && Intrinsics.f(this.f312748g, iVar.f312748g) && this.f312749h == iVar.f312749h && Intrinsics.f(this.i, iVar.i) && Intrinsics.f(this.f312750j, iVar.f312750j) && Intrinsics.f(this.k, iVar.k) && this.f312751l == iVar.f312751l;
    }

    public final int hashCode() {
        xi0.b bVar = this.f312745a;
        int iC = p.a.c(p.a.c(p.a.c(a0.d.c(p.a.c((bVar == null ? 0 : bVar.hashCode()) * 31, 31, this.f312746b), 31, this.f312747c), 31, this.d), 31, this.e), 31, this.f);
        String str = this.f312748g;
        int iD = p.a.d(p.a.d((this.f312749h.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.i), 31, this.f312750j);
        String str2 = this.k;
        return Boolean.hashCode(this.f312751l) + ((iD + (str2 != null ? str2.hashCode() : 0)) * 31);
    }
}
