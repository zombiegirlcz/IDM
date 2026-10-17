package sg8;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.junior_graduation.impl.ui.screen.asset_details.JuniorMigrationAssetDetailsScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JuniorMigrationAssetDetailsScreenContract$InputData f262626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f262627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f262628c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f262629g;

    public f(c cVar, BaseScreen baseScreen, JuniorMigrationAssetDetailsScreenContract$InputData juniorMigrationAssetDetailsScreenContract$InputData) {
        this.f262626a = juniorMigrationAssetDetailsScreenContract$InputData;
        this.f262627b = e4m.b.b(e4m.c.a(baseScreen));
        int i = 17;
        this.f262628c = e4m.b.b(new ryc.d(cVar, this, 2, i));
        this.d = e4m.b.b(new ryc.d(cVar, this, 1, i));
        this.e = e4m.b.b(new ryc.d(cVar, this, 0, i));
        this.f = e4m.b.b(new ryc.d(cVar, this, 4, i));
        this.f262629g = e4m.b.b(new ryc.d(cVar, this, 3, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
