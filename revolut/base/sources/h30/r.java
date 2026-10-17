package h30;

import com.google.common.collect.ImmutableSet;
import com.revolut.chat.ui.chatlist.ChatListContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes19.dex */
public final class r implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ChatListContract$InputData f148943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f148944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f148945c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f148946g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f148947h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f148948j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f148949l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f148950m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f148951n;
    public final e4m.e o;

    public r(n nVar, o oVar, BaseScreen baseScreen, ChatListContract$InputData chatListContract$InputData) {
        this.f148943a = chatListContract$InputData;
        this.f148944b = e4m.b.b(e4m.c.a(baseScreen));
        int i = 8;
        this.f148945c = e4m.b.b(new h08.e(nVar, this, 2, i));
        this.d = e4m.b.b(new h08.e(nVar, this, 1, i));
        this.e = e4m.b.b(new h08.e(nVar, this, 0, i));
        this.f = e4m.b.b(new h08.e(nVar, this, 4, i));
        this.f148946g = e4m.b.b(new h08.e(nVar, this, 3, i));
        this.f148947h = e4m.b.b(new h08.e(nVar, this, 6, i));
        this.i = e4m.b.b(new h08.e(nVar, this, 5, i));
        this.f148948j = e4m.b.b(new h08.e(nVar, this, 9, i));
        this.k = e4m.b.b(new h08.e(nVar, this, 8, i));
        this.f148949l = e4m.b.b(new h08.e(nVar, this, 7, i));
        this.f148950m = e4m.b.b(new h08.e(nVar, this, 10, i));
        this.f148951n = e4m.b.b(new h08.e(nVar, this, 12, i));
        this.o = e4m.b.b(new h08.e(nVar, this, 11, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f148946g.get(), (yji.n) this.i.get(), (yji.n) this.f148949l.get(), (yji.n) this.f148950m.get());
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
