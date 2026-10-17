package y4c;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f310861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f310862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f310863c;
    public final List d;
    public final Data e;

    public d(xi0.b currency, Data statsData, Data transactionsData, List actions, Data userCompany) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(statsData, "statsData");
        Intrinsics.checkNotNullParameter(transactionsData, "transactionsData");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(userCompany, "userCompany");
        this.f310861a = currency;
        this.f310862b = statsData;
        this.f310863c = transactionsData;
        this.d = actions;
        this.e = userCompany;
    }

    public static d a(d dVar, Data data, Data data2, Data data3, int i) {
        xi0.b currency = dVar.f310861a;
        if ((i & 2) != 0) {
            data = dVar.f310862b;
        }
        Data statsData = data;
        if ((i & 4) != 0) {
            data2 = dVar.f310863c;
        }
        Data transactionsData = data2;
        List actions = dVar.d;
        if ((i & 16) != 0) {
            data3 = dVar.e;
        }
        Data userCompany = data3;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(statsData, "statsData");
        Intrinsics.checkNotNullParameter(transactionsData, "transactionsData");
        Intrinsics.checkNotNullParameter(actions, "actions");
        Intrinsics.checkNotNullParameter(userCompany, "userCompany");
        return new d(currency, statsData, transactionsData, actions, userCompany);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f310861a, dVar.f310861a) && Intrinsics.f(this.f310862b, dVar.f310862b) && Intrinsics.f(this.f310863c, dVar.f310863c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.d(kii.e.c(this.f310863c, kii.e.c(this.f310862b, this.f310861a.hashCode() * 31, 31), 31), 31, this.d);
    }
}
