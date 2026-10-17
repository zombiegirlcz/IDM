package s7a;

import com.revolut.data.model.Data;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class r implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f260626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f260627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f260628c;
    public final String d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f260629g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f260630h;

    public r(Data models, Set selectableIds, Set selectedIds, String searchString, boolean z, boolean z3, boolean z4, String previousSearchString) {
        Intrinsics.checkNotNullParameter(models, "models");
        Intrinsics.checkNotNullParameter(selectableIds, "selectableIds");
        Intrinsics.checkNotNullParameter(selectedIds, "selectedIds");
        Intrinsics.checkNotNullParameter(searchString, "searchString");
        Intrinsics.checkNotNullParameter(previousSearchString, "previousSearchString");
        this.f260626a = models;
        this.f260627b = selectableIds;
        this.f260628c = selectedIds;
        this.d = searchString;
        this.e = z;
        this.f = z3;
        this.f260629g = z4;
        this.f260630h = previousSearchString;
    }

    public static r a(r rVar, Data data, Set set, Set set2, String str, boolean z, String str2, int i) {
        if ((i & 1) != 0) {
            data = rVar.f260626a;
        }
        Data models = data;
        if ((i & 2) != 0) {
            set = rVar.f260627b;
        }
        Set selectableIds = set;
        if ((i & 4) != 0) {
            set2 = rVar.f260628c;
        }
        Set selectedIds = set2;
        String searchString = (i & 8) != 0 ? rVar.d : str;
        boolean z3 = (i & 16) != 0 ? rVar.e : true;
        boolean z4 = (i & 32) != 0 ? rVar.f : true;
        boolean z6 = (i & 64) != 0 ? rVar.f260629g : z;
        String previousSearchString = (i & 128) != 0 ? rVar.f260630h : str2;
        rVar.getClass();
        Intrinsics.checkNotNullParameter(models, "models");
        Intrinsics.checkNotNullParameter(selectableIds, "selectableIds");
        Intrinsics.checkNotNullParameter(selectedIds, "selectedIds");
        Intrinsics.checkNotNullParameter(searchString, "searchString");
        Intrinsics.checkNotNullParameter(previousSearchString, "previousSearchString");
        return new r(models, selectableIds, selectedIds, searchString, z3, z4, z6, previousSearchString);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f260626a, rVar.f260626a) && Intrinsics.f(this.f260627b, rVar.f260627b) && Intrinsics.f(this.f260628c, rVar.f260628c) && Intrinsics.f(this.d, rVar.d) && this.e == rVar.e && this.f == rVar.f && this.f260629g == rVar.f260629g && Intrinsics.f(this.f260630h, rVar.f260630h);
    }

    public final int hashCode() {
        return this.f260630h.hashCode() + j6.a.c(j6.a.c(j6.a.c(p.a.c(p.a.f(p.a.f(this.f260626a.hashCode() * 31, 31, this.f260627b), 31, this.f260628c), 31, this.d), 31, this.e), 31, this.f), 31, this.f260629g);
    }
}
