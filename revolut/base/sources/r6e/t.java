package r6e;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.subaccount.impl.ui.create.screen.permission.UserPermissionSelectorScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class t implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserPermissionSelectorScreenContract$InputData f251803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f251804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f251805c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f251806g;

    public t(o oVar, e eVar, BaseScreen baseScreen, UserPermissionSelectorScreenContract$InputData userPermissionSelectorScreenContract$InputData) {
        this.f251803a = userPermissionSelectorScreenContract$InputData;
        this.f251804b = e4m.b.b(e4m.c.a(baseScreen));
        int i = 18;
        this.f251805c = e4m.b.b(new qy7.f(oVar, this, 2, i));
        this.d = e4m.b.b(new qy7.f(oVar, this, 1, i));
        this.e = e4m.b.b(new qy7.f(oVar, this, 0, i));
        this.f = e4m.b.b(new qy7.f(oVar, this, 4, i));
        this.f251806g = e4m.b.b(new qy7.f(oVar, this, 3, i));
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
