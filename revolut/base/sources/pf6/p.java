package pf6;

import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class p {

    @NotNull
    public static final o Companion = new o();
    public static final Lazy[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f235490a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f235491b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f235492c;
    public final List d;
    public final List e;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f = new Lazy[]{null, null, null, yhm.j.c(kVar, new pdg.d(27)), yhm.j.c(kVar, new pdg.d(28))};
    }

    public /* synthetic */ p(int i, String str, String str2, String str3, List list, List list2) {
        if (31 != (i & 31)) {
            j1.f(n.f235489a.getDescriptor(), i, 31);
            throw null;
        }
        this.f235490a = str;
        this.f235491b = str2;
        this.f235492c = str3;
        this.d = list;
        this.e = list2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f235490a, pVar.f235490a) && Intrinsics.f(this.f235491b, pVar.f235491b) && Intrinsics.f(this.f235492c, pVar.f235492c) && Intrinsics.f(this.d, pVar.d) && Intrinsics.f(this.e, pVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f235490a.hashCode() * 31;
        String str = this.f235491b;
        return this.e.hashCode() + p.a.d(p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f235492c), 31, this.d);
    }

    public p(String institutionId, String str, ArrayList dates, ArrayList money) {
        Intrinsics.checkNotNullParameter(institutionId, "institutionId");
        Intrinsics.checkNotNullParameter("PIX_SMART_TRANSFER", "type");
        Intrinsics.checkNotNullParameter(dates, "dates");
        Intrinsics.checkNotNullParameter(money, "money");
        this.f235490a = institutionId;
        this.f235491b = str;
        this.f235492c = "PIX_SMART_TRANSFER";
        this.d = dates;
        this.e = money;
    }
}
