package u5d;

import com.revolut.feature.shared.autoinvest.impl.database.AutoInvestDatabase;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import yhm.j;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AutoInvestDatabase f277450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f277451b;

    public c(AutoInvestDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        this.f277450a = database;
        this.f277451b = j.b(new tyl.a(this, 6));
    }

    public final v5d.a a() {
        return (v5d.a) this.f277451b.getValue();
    }
}
