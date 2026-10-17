package c42;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f20976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f20978c;
    public final Clause d;
    public final List e;

    public a(Data data, String query, boolean z, Clause apmName, List extraItems) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(apmName, "apmName");
        Intrinsics.checkNotNullParameter(extraItems, "extraItems");
        this.f20976a = data;
        this.f20977b = query;
        this.f20978c = z;
        this.d = apmName;
        this.e = extraItems;
    }

    public static a a(a aVar, Data data, String str, boolean z, int i) {
        if ((i & 1) != 0) {
            data = aVar.f20976a;
        }
        Data data2 = data;
        if ((i & 2) != 0) {
            str = aVar.f20977b;
        }
        String query = str;
        if ((i & 4) != 0) {
            z = aVar.f20978c;
        }
        Clause apmName = aVar.d;
        List extraItems = aVar.e;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(data2, "data");
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(apmName, "apmName");
        Intrinsics.checkNotNullParameter(extraItems, "extraItems");
        return new a(data2, query, z, apmName, extraItems);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f20976a, aVar.f20976a) && Intrinsics.f(this.f20977b, aVar.f20977b) && this.f20978c == aVar.f20978c && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.a(j6.a.c(p.a.c(this.f20976a.hashCode() * 31, 31, this.f20977b), 31, this.f20978c), 31, this.d);
    }
}
