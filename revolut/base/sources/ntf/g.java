package ntf;

import com.revolut.feature.transfer_reasons.models.reason.TransferReasonCategory;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferReasonCategory f219020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ttf.b f219021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f219022c;
    public final Set d;
    public final String e;
    public final boolean f;

    public g(TransferReasonCategory category, ttf.b catalogue, List searchResults, Set selectedReasons, String query, boolean z) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(catalogue, "catalogue");
        Intrinsics.checkNotNullParameter(searchResults, "searchResults");
        Intrinsics.checkNotNullParameter(selectedReasons, "selectedReasons");
        Intrinsics.checkNotNullParameter(query, "query");
        this.f219020a = category;
        this.f219021b = catalogue;
        this.f219022c = searchResults;
        this.d = selectedReasons;
        this.e = query;
        this.f = z;
    }

    public static g a(g gVar, ArrayList arrayList, Set set, String str, boolean z, int i) {
        TransferReasonCategory category = gVar.f219020a;
        ttf.b catalogue = gVar.f219021b;
        List list = arrayList;
        if ((i & 4) != 0) {
            list = gVar.f219022c;
        }
        List searchResults = list;
        if ((i & 8) != 0) {
            set = gVar.d;
        }
        Set selectedReasons = set;
        if ((i & 16) != 0) {
            str = gVar.e;
        }
        String query = str;
        if ((i & 32) != 0) {
            z = gVar.f;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(catalogue, "catalogue");
        Intrinsics.checkNotNullParameter(searchResults, "searchResults");
        Intrinsics.checkNotNullParameter(selectedReasons, "selectedReasons");
        Intrinsics.checkNotNullParameter(query, "query");
        return new g(category, catalogue, searchResults, selectedReasons, query, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f219020a, gVar.f219020a) && this.f219021b == gVar.f219021b && Intrinsics.f(this.f219022c, gVar.f219022c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e) && this.f == gVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + p.a.c(p.a.f(p.a.d((this.f219021b.hashCode() + (this.f219020a.hashCode() * 31)) * 31, 31, this.f219022c), 31, this.d), 31, this.e);
    }
}
