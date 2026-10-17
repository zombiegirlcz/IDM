package n38;

import java.time.LocalDate;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f211926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f211927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f211928c;
    public final LocalDate d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f211929g;

    public a0(String id10, ArrayList pockets, String str, LocalDate localDate, String brand, String design, String cardName) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(pockets, "pockets");
        Intrinsics.checkNotNullParameter(brand, "brand");
        Intrinsics.checkNotNullParameter(design, "design");
        Intrinsics.checkNotNullParameter(cardName, "cardName");
        this.f211926a = id10;
        this.f211927b = pockets;
        this.f211928c = str;
        this.d = localDate;
        this.e = brand;
        this.f = design;
        this.f211929g = cardName;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f211926a, a0Var.f211926a) && this.f211927b.equals(a0Var.f211927b) && Intrinsics.f(this.f211928c, a0Var.f211928c) && Intrinsics.f(this.d, a0Var.d) && Intrinsics.f(this.e, a0Var.e) && Intrinsics.f(this.f, a0Var.f) && Intrinsics.f(this.f211929g, a0Var.f211929g);
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f211927b, this.f211926a.hashCode() * 31, 31);
        String str = this.f211928c;
        int iHashCode = (iB + (str == null ? 0 : str.hashCode())) * 31;
        LocalDate localDate = this.d;
        return this.f211929g.hashCode() + p.a.c(p.a.c((iHashCode + (localDate != null ? localDate.hashCode() : 0)) * 31, 31, this.e), 31, this.f);
    }
}
