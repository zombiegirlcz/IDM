package f2e;

import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class d2 {

    @NotNull
    public static final c2 Companion = new c2();
    public static final Lazy[] e = {null, null, yhm.j.c(yhm.k.PUBLICATION, new i(16)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f131565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f131566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f131567c;
    public final String d;

    public d2(int i, String str, String str2, String str3, List list) {
        if (1 != (i & 1)) {
            qlm.j1.f(b2.f131544a.getDescriptor(), i, 1);
            throw null;
        }
        this.f131565a = str;
        if ((i & 2) == 0) {
            this.f131566b = null;
        } else {
            this.f131566b = str2;
        }
        if ((i & 4) == 0) {
            this.f131567c = zhm.f0.f322471a;
        } else {
            this.f131567c = list;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d2)) {
            return false;
        }
        d2 d2Var = (d2) obj2;
        return Intrinsics.f(this.f131565a, d2Var.f131565a) && Intrinsics.f(this.f131566b, d2Var.f131566b) && Intrinsics.f(this.f131567c, d2Var.f131567c) && Intrinsics.f(this.d, d2Var.d);
    }

    public final int hashCode() {
        int iHashCode = this.f131565a.hashCode() * 31;
        String str = this.f131566b;
        int iD = p.a.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f131567c);
        String str2 = this.d;
        return iD + (str2 != null ? str2.hashCode() : 0);
    }

    public d2(String id10, String str, List eligiblePlans, String str2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(eligiblePlans, "eligiblePlans");
        this.f131565a = id10;
        this.f131566b = str;
        this.f131567c = eligiblePlans;
        this.d = str2;
    }
}
