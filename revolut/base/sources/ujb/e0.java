package ujb;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class e0 {

    @NotNull
    public static final x Companion = new x();
    public static final Lazy[] k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f280552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f280553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f280554c;
    public final long d;
    public final long e;
    public final long f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f280555g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d0 f280556h;
    public final List i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f280557j;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        k = new Lazy[]{null, yhm.j.c(kVar, new v(0)), null, null, null, null, null, null, yhm.j.c(kVar, new v(1)), null};
    }

    public /* synthetic */ e0(int i, String str, List list, String str2, long j2, long j3, long j5, String str3, d0 d0Var, List list2, String str4) {
        if (1023 != (i & 1023)) {
            j1.f(w.f280596a.getDescriptor(), i, 1023);
            throw null;
        }
        this.f280552a = str;
        this.f280553b = list;
        this.f280554c = str2;
        this.d = j2;
        this.e = j3;
        this.f = j5;
        this.f280555g = str3;
        this.f280556h = d0Var;
        this.i = list2;
        this.f280557j = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return Intrinsics.f(this.f280552a, e0Var.f280552a) && Intrinsics.f(this.f280553b, e0Var.f280553b) && Intrinsics.f(this.f280554c, e0Var.f280554c) && this.d == e0Var.d && this.e == e0Var.e && this.f == e0Var.f && Intrinsics.f(this.f280555g, e0Var.f280555g) && Intrinsics.f(this.f280556h, e0Var.f280556h) && Intrinsics.f(this.i, e0Var.i) && Intrinsics.f(this.f280557j, e0Var.f280557j);
    }

    public final int hashCode() {
        return this.f280557j.hashCode() + p.a.d((this.f280556h.hashCode() + p.a.c(a0.d.c(a0.d.c(a0.d.c(p.a.c(p.a.d(this.f280552a.hashCode() * 31, 31, this.f280553b), 31, this.f280554c), 31, this.d), 31, this.e), 31, this.f), 31, this.f280555g)) * 31, 31, this.i);
    }

    public e0(String id10, List productIds, String displayName, long j2, long j3, long j5, String currency, d0 contribution, ArrayList documents, String detailsLink) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(productIds, "productIds");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(contribution, "contribution");
        Intrinsics.checkNotNullParameter(documents, "documents");
        Intrinsics.checkNotNullParameter(detailsLink, "detailsLink");
        this.f280552a = id10;
        this.f280553b = productIds;
        this.f280554c = displayName;
        this.d = j2;
        this.e = j3;
        this.f = j5;
        this.f280555g = currency;
        this.f280556h = contribution;
        this.i = documents;
        this.f280557j = detailsLink;
    }
}
