package r6e;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.subaccount.impl.ui.edit.permission.UserPermissionEditScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class s implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserPermissionEditScreenContract$InputData f251799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f251800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f251801c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f251802g;

    public s(o oVar, BaseScreen baseScreen, UserPermissionEditScreenContract$InputData userPermissionEditScreenContract$InputData) {
        this.f251799a = userPermissionEditScreenContract$InputData;
        this.f251800b = e4m.b.b(e4m.c.a(baseScreen));
        int i = 17;
        this.f251801c = e4m.b.b(new qy7.f(oVar, this, 2, i));
        this.d = e4m.b.b(new qy7.f(oVar, this, 1, i));
        this.e = e4m.b.b(new qy7.f(oVar, this, 0, i));
        this.f = e4m.b.b(new qy7.f(oVar, this, 4, i));
        this.f251802g = e4m.b.b(new qy7.f(oVar, this, 3, i));
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
