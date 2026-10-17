package kr9;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.payments.groups.impl.ui_chat.members.GroupChatMembersScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class u implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GroupChatMembersScreenContract$InputData f188800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f188801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f188802c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f188803g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f188804h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f188805j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f188806l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f188807m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f188808n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f188809p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f188810q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f188811r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f188812s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f188813t;
    public final e4m.e u;
    public final e4m.e v;

    public u(l lVar, BaseScreen baseScreen, GroupChatMembersScreenContract$InputData groupChatMembersScreenContract$InputData) {
        this.f188801b = lVar;
        this.f188800a = groupChatMembersScreenContract$InputData;
        this.f188802c = e4m.b.b(e4m.c.a(baseScreen));
        int i = 5;
        this.d = e4m.b.b(new m(lVar, this, 2, i));
        this.e = e4m.b.b(new m(lVar, this, 1, i));
        this.f = e4m.b.b(new m(lVar, this, 0, i));
        this.f188803g = e4m.b.b(new m(lVar, this, 4, i));
        this.f188804h = e4m.b.b(new m(lVar, this, 3, i));
        this.i = e4m.b.b(new m(lVar, this, 6, i));
        this.f188805j = e4m.b.b(new m(lVar, this, 5, i));
        this.k = e4m.b.b(new m(lVar, this, 10, i));
        this.f188806l = e4m.b.b(new m(lVar, this, 9, i));
        this.f188807m = e4m.b.b(new m(lVar, this, 8, i));
        this.f188808n = e4m.b.b(new m(lVar, this, 7, i));
        this.o = e4m.b.b(new m(lVar, this, 11, i));
        this.f188809p = e4m.b.b(new m(lVar, this, 12, i));
        this.f188810q = e4m.b.b(new m(lVar, this, 14, i));
        this.f188811r = e4m.b.b(new m(lVar, this, 13, i));
        this.f188812s = e4m.b.b(new m(lVar, this, 16, i));
        this.f188813t = e4m.b.b(new m(lVar, this, 15, i));
        this.u = e4m.b.b(new m(lVar, this, 18, i));
        this.v = e4m.b.b(new m(lVar, this, 17, i));
    }

    public final os9.c d() {
        l lVar = this.f188801b;
        jr9.b bVar = lVar.f188757b;
        mq9.f fVarC = bVar.c();
        vc.s.j(fVarC);
        mr9.d dVarD = bVar.d();
        vc.s.j(dVarD);
        jt0.b bVarE = e();
        cl3.a aVarD = lVar.f.d();
        vc.s.j(aVarD);
        return new os9.c(fVarC, dVarD, bVarE, aVarD, lVar.f188763m.e());
    }

    public final jt0.b e() {
        l lVar = this.f188801b;
        jr9.b bVar = lVar.f188757b;
        mq9.f fVarC = bVar.c();
        vc.s.j(fVarC);
        mr9.d dVarD = bVar.d();
        vc.s.j(dVarD);
        return new jt0.b(fVarC, dVarD, lVar.f188763m.e());
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f188804h.get(), (yji.n) this.f188805j.get(), (yji.n) this.f188808n.get(), (yji.n) this.o.get(), (yji.n) this.f188809p.get(), (yji.n) this.f188811r.get(), (yji.n) this.f188813t.get());
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get());
    }
}
