package cig;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f24545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f24546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f24547c;

    public e() {
        this(0);
    }

    public static e a(e eVar, Data airlines, Data accounts, String query, int i) {
        if ((i & 1) != 0) {
            airlines = eVar.f24545a;
        }
        if ((i & 2) != 0) {
            accounts = eVar.f24546b;
        }
        if ((i & 4) != 0) {
            query = eVar.f24547c;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(airlines, "airlines");
        Intrinsics.checkNotNullParameter(accounts, "accounts");
        Intrinsics.checkNotNullParameter(query, "query");
        return new e(airlines, accounts, query);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f24545a, eVar.f24545a) && Intrinsics.f(this.f24546b, eVar.f24546b) && Intrinsics.f(this.f24547c, eVar.f24547c);
    }

    public final int hashCode() {
        return this.f24547c.hashCode() + kii.e.c(this.f24546b, this.f24545a.hashCode() * 31, 31);
    }

    public e(Data airlines, Data accounts, String query) {
        Intrinsics.checkNotNullParameter(airlines, "airlines");
        Intrinsics.checkNotNullParameter(accounts, "accounts");
        Intrinsics.checkNotNullParameter(query, "query");
        this.f24545a = airlines;
        this.f24546b = accounts;
        this.f24547c = query;
    }

    public /* synthetic */ e(int i) {
        Data data = new Data(null, null, true, 3, null);
        Data data2 = new Data(null, null, true, 3, null);
        m70.a.c(t0.f186434a);
        this(data, data2, "");
    }
}
