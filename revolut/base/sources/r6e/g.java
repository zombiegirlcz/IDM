package r6e;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.subaccount.impl.ui.members.screen.GroupMembersScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class g implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GroupMembersScreenContract$InputData f251732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f251733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f251734c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f251735g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f251736h;
    public final e4m.e i;

    public g(o oVar, BaseScreen baseScreen, GroupMembersScreenContract$InputData groupMembersScreenContract$InputData) {
        this.f251732a = groupMembersScreenContract$InputData;
        this.f251733b = e4m.b.b(e4m.c.a(baseScreen));
        int i = 13;
        this.f251734c = e4m.b.b(new qy7.f(oVar, this, 2, i));
        this.d = e4m.b.b(new qy7.f(oVar, this, 1, i));
        this.e = e4m.b.b(new qy7.f(oVar, this, 0, i));
        this.f = e4m.b.b(new qy7.f(oVar, this, 4, i));
        this.f251735g = e4m.b.b(new qy7.f(oVar, this, 3, i));
        this.f251736h = e4m.b.b(new qy7.f(oVar, this, 6, i));
        this.i = e4m.b.b(new qy7.f(oVar, this, 5, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f251735g.get());
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
