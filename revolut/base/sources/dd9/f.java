package dd9;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.onboarding.impl.user_migration.UserMigrationFlowContract$InputData;
import java.util.Set;
import qc9.p;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements xki.e, sk3.b, p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserMigrationFlowContract$InputData f113144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f113145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f113146c = this;
    public final e4m.e d;
    public final e4m.e e;

    public f(e eVar, UserMigrationFlowContract$InputData userMigrationFlowContract$InputData) {
        this.f113145b = eVar;
        this.f113144a = userMigrationFlowContract$InputData;
        int i = 2;
        this.d = e4m.b.b(new db1.f(eVar, this, 0, i));
        this.e = e4m.b.b(new db1.f(eVar, this, 1, i));
    }

    @Override // sk3.b
    public final a c() {
        return new a(this.f113145b, this.f113146c, 0);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }

    @Override // qc9.p
    public final c j() {
        return new c(this.f113145b, this.f113146c, 0);
    }
}
