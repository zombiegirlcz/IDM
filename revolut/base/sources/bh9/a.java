package bh9;

import com.revolut.feature.apm.bills.billers.api.model.Biller;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import zhm.q0;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Biller f15266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f15267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f15268c;
    public final String d;
    public final List e;
    public final Map f;

    public a(Biller biller, i loadingState, xi0.b bVar, String str, List fields, Map values) {
        Intrinsics.checkNotNullParameter(biller, "biller");
        Intrinsics.checkNotNullParameter(loadingState, "loadingState");
        Intrinsics.checkNotNullParameter(fields, "fields");
        Intrinsics.checkNotNullParameter(values, "values");
        this.f15266a = biller;
        this.f15267b = loadingState;
        this.f15268c = bVar;
        this.d = str;
        this.e = fields;
        this.f = values;
    }

    public static a a(a aVar, i iVar, xi0.b bVar, List list, HashMap map, int i) {
        Biller biller = aVar.f15266a;
        if ((i & 2) != 0) {
            iVar = aVar.f15267b;
        }
        i loadingState = iVar;
        if ((i & 4) != 0) {
            bVar = aVar.f15268c;
        }
        xi0.b bVar2 = bVar;
        String str = (i & 8) != 0 ? aVar.d : "LABEL";
        if ((i & 16) != 0) {
            list = aVar.e;
        }
        List fields = list;
        Map map2 = map;
        if ((i & 32) != 0) {
            map2 = aVar.f;
        }
        Map values = map2;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(biller, "biller");
        Intrinsics.checkNotNullParameter(loadingState, "loadingState");
        Intrinsics.checkNotNullParameter(fields, "fields");
        Intrinsics.checkNotNullParameter(values, "values");
        return new a(biller, loadingState, bVar2, str, fields, values);
    }

    public final LinkedHashMap c() {
        Map map = this.f;
        LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((h) entry.getValue()).f15277a);
        }
        return linkedHashMap;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f15266a, aVar.f15266a) && this.f15267b == aVar.f15267b && Intrinsics.f(this.f15268c, aVar.f15268c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f);
    }

    public final int hashCode() {
        int iHashCode = (this.f15267b.hashCode() + (this.f15266a.hashCode() * 31)) * 31;
        xi0.b bVar = this.f15268c;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        String str = this.d;
        return this.f.hashCode() + p.a.d((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31, 31, this.e);
    }
}
