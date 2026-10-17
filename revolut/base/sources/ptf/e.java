package ptf;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f239659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f239660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f239661c;

    public e() {
        this(0);
    }

    public static e a(e eVar, Data data, String str, String query, int i) {
        if ((i & 1) != 0) {
            data = eVar.f239659a;
        }
        if ((i & 2) != 0) {
            str = eVar.f239660b;
        }
        if ((i & 4) != 0) {
            query = eVar.f239661c;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(query, "query");
        return new e(data, str, query);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f239659a, eVar.f239659a) && Intrinsics.f(this.f239660b, eVar.f239660b) && Intrinsics.f(this.f239661c, eVar.f239661c);
    }

    public final int hashCode() {
        int iHashCode = this.f239659a.hashCode() * 31;
        String str = this.f239660b;
        return this.f239661c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public e(Data data, String str, String query) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(query, "query");
        this.f239659a = data;
        this.f239660b = str;
        this.f239661c = query;
    }

    public /* synthetic */ e(int i) {
        Data data = new Data(null, null, true, 3, null);
        m70.a.c(t0.f186434a);
        this(data, null, "");
    }
}
