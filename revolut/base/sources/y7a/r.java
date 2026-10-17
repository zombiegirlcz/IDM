package y7a;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.data.model.Data;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class r implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f311447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f311448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f311449c;
    public final String d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f311450g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f311451h;
    public final Clause i;

    public r(Data models, Data modelsFiltered, Set selectedIds, String searchString, boolean z, boolean z3, boolean z4, boolean z6, Clause clause) {
        Intrinsics.checkNotNullParameter(models, "models");
        Intrinsics.checkNotNullParameter(modelsFiltered, "modelsFiltered");
        Intrinsics.checkNotNullParameter(selectedIds, "selectedIds");
        Intrinsics.checkNotNullParameter(searchString, "searchString");
        this.f311447a = models;
        this.f311448b = modelsFiltered;
        this.f311449c = selectedIds;
        this.d = searchString;
        this.e = z;
        this.f = z3;
        this.f311450g = z4;
        this.f311451h = z6;
        this.i = clause;
    }

    public static r a(r rVar, Data data, Data data2, Set set, String str, boolean z, boolean z3, boolean z4, Clause clause, int i) {
        if ((i & 1) != 0) {
            data = rVar.f311447a;
        }
        Data models = data;
        if ((i & 2) != 0) {
            data2 = rVar.f311448b;
        }
        Data modelsFiltered = data2;
        if ((i & 4) != 0) {
            set = rVar.f311449c;
        }
        Set selectedIds = set;
        if ((i & 8) != 0) {
            str = rVar.d;
        }
        String searchString = str;
        boolean z6 = (i & 16) != 0 ? rVar.e : true;
        if ((i & 32) != 0) {
            z = rVar.f;
        }
        boolean z11 = z;
        boolean z12 = (i & 64) != 0 ? rVar.f311450g : z3;
        boolean z29 = (i & 128) != 0 ? rVar.f311451h : z4;
        Clause clause2 = (i & 256) != 0 ? rVar.i : clause;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(models, "models");
        Intrinsics.checkNotNullParameter(modelsFiltered, "modelsFiltered");
        Intrinsics.checkNotNullParameter(selectedIds, "selectedIds");
        Intrinsics.checkNotNullParameter(searchString, "searchString");
        return new r(models, modelsFiltered, selectedIds, searchString, z6, z11, z12, z29, clause2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f311447a, rVar.f311447a) && Intrinsics.f(this.f311448b, rVar.f311448b) && Intrinsics.f(this.f311449c, rVar.f311449c) && Intrinsics.f(this.d, rVar.d) && this.e == rVar.e && this.f == rVar.f && this.f311450g == rVar.f311450g && this.f311451h == rVar.f311451h && Intrinsics.f(this.i, rVar.i);
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(j6.a.c(j6.a.c(p.a.c(p.a.f(kii.e.c(this.f311448b, this.f311447a.hashCode() * 31, 31), 31, this.f311449c), 31, this.d), 31, this.e), 31, this.f), 31, this.f311450g), 31, this.f311451h);
        Clause clause = this.i;
        return iC + (clause == null ? 0 : clause.hashCode());
    }
}
