package f2e;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class d0 {

    @NotNull
    public static final c0 Companion = new c0();
    public static final Lazy[] e = {null, null, yhm.j.c(yhm.k.PUBLICATION, new i(4)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f131561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f131562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f131563c;
    public final jo3.a d;

    public /* synthetic */ d0(int i, String str, String str2, List list, jo3.a aVar) {
        if (15 != (i & 15)) {
            qlm.j1.f(b0.f131541a.getDescriptor(), i, 15);
            throw null;
        }
        this.f131561a = str;
        this.f131562b = str2;
        this.f131563c = list;
        this.d = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.f131561a, d0Var.f131561a) && Intrinsics.f(this.f131562b, d0Var.f131562b) && Intrinsics.f(this.f131563c, d0Var.f131563c) && Intrinsics.f(this.d, d0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.d(p.a.c(this.f131561a.hashCode() * 31, 31, this.f131562b), 31, this.f131563c);
    }

    public d0(String type, String termsLink, List instalmentPeriods, jo3.a minPurchaseAmount) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(termsLink, "termsLink");
        Intrinsics.checkNotNullParameter(instalmentPeriods, "instalmentPeriods");
        Intrinsics.checkNotNullParameter(minPurchaseAmount, "minPurchaseAmount");
        this.f131561a = type;
        this.f131562b = termsLink;
        this.f131563c = instalmentPeriods;
        this.d = minPurchaseAmount;
    }
}
