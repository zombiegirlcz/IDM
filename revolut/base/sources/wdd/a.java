package wdd;

import com.revolut.feature.shared.vaults.domain.impl.data.database.VaultsDatabase;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import sdd.b;
import yhm.j;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final VaultsDatabase f296549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f296550b;

    public a(VaultsDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        this.f296549a = database;
        this.f296550b = j.b(new vt3.a(this, 19));
    }

    public final b a() {
        return (b) this.f296550b.getValue();
    }
}
