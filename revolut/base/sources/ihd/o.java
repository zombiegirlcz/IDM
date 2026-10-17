package ihd;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class o implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f161384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f161385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f161386c;
    public final String d;
    public final boolean e;

    public o(Data data, List list, int i, String searchQuery, boolean z) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        this.f161384a = data;
        this.f161385b = list;
        this.f161386c = i;
        this.d = searchQuery;
        this.e = z;
    }

    public static o a(o oVar, Data data, List list, String str, boolean z, int i) {
        if ((i & 1) != 0) {
            data = oVar.f161384a;
        }
        Data data2 = data;
        if ((i & 2) != 0) {
            list = oVar.f161385b;
        }
        List list2 = list;
        int i2 = oVar.f161386c;
        if ((i & 8) != 0) {
            str = oVar.d;
        }
        String searchQuery = str;
        if ((i & 16) != 0) {
            z = oVar.e;
        }
        oVar.getClass();
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        return new o(data2, list2, i2, searchQuery, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f161384a, oVar.f161384a) && Intrinsics.f(this.f161385b, oVar.f161385b) && this.f161386c == oVar.f161386c && Intrinsics.f(this.d, oVar.d) && this.e == oVar.e;
    }

    public final int hashCode() {
        Data data = this.f161384a;
        int iHashCode = (data == null ? 0 : data.hashCode()) * 31;
        List list = this.f161385b;
        return Boolean.hashCode(this.e) + p.a.c(j6.a.b(this.f161386c, (iHashCode + (list != null ? list.hashCode() : 0)) * 31, 31), 31, this.d);
    }
}
