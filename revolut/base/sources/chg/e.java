package chg;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f24224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24225b;

    public e() {
        this(0);
    }

    public static e a(e eVar, Data airlines, String query, int i) {
        if ((i & 1) != 0) {
            airlines = eVar.f24224a;
        }
        if ((i & 2) != 0) {
            query = eVar.f24225b;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(airlines, "airlines");
        Intrinsics.checkNotNullParameter(query, "query");
        return new e(airlines, query);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f24224a, eVar.f24224a) && Intrinsics.f(this.f24225b, eVar.f24225b);
    }

    public final int hashCode() {
        return this.f24225b.hashCode() + (this.f24224a.hashCode() * 31);
    }

    public e(Data airlines, String query) {
        Intrinsics.checkNotNullParameter(airlines, "airlines");
        Intrinsics.checkNotNullParameter(query, "query");
        this.f24224a = airlines;
        this.f24225b = query;
    }

    public /* synthetic */ e(int i) {
        Data data = new Data(null, null, true, 3, null);
        m70.a.c(t0.f186434a);
        this(data, "");
    }
}
