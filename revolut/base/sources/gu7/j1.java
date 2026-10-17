package gu7;

import com.revolut.feature.insurance_common.data.model.Banner;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class j1 {

    @NotNull
    public static final i1 Companion = new i1();
    public static final Lazy[] d = {yhm.j.c(yhm.k.PUBLICATION, new d(17)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f146768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j4 f146769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Banner f146770c;

    public /* synthetic */ j1(int i, List list, j4 j4Var, Banner banner) {
        if (7 != (i & 7)) {
            qlm.j1.f(h1.f146755a.getDescriptor(), i, 7);
            throw null;
        }
        this.f146768a = list;
        this.f146769b = j4Var;
        this.f146770c = banner;
    }

    public static j1 a(j1 j1Var, ArrayList arrayList, Banner banner, int i) {
        List sections = arrayList;
        if ((i & 1) != 0) {
            sections = j1Var.f146768a;
        }
        j4 j4Var = j1Var.f146769b;
        j1Var.getClass();
        Intrinsics.checkNotNullParameter(sections, "sections");
        return new j1(sections, j4Var, banner);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj2;
        return Intrinsics.f(this.f146768a, j1Var.f146768a) && Intrinsics.f(this.f146769b, j1Var.f146769b) && Intrinsics.f(this.f146770c, j1Var.f146770c);
    }

    public final int hashCode() {
        int iHashCode = this.f146768a.hashCode() * 31;
        j4 j4Var = this.f146769b;
        int iHashCode2 = (iHashCode + (j4Var == null ? 0 : j4Var.hashCode())) * 31;
        Banner banner = this.f146770c;
        return iHashCode2 + (banner != null ? banner.hashCode() : 0);
    }

    public j1(List sections, j4 j4Var, Banner banner) {
        Intrinsics.checkNotNullParameter(sections, "sections");
        this.f146768a = sections;
        this.f146769b = j4Var;
        this.f146770c = banner;
    }
}
