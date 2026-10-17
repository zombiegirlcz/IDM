package m18;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.invest.smart_notifications.impl.ui.screen.feed.SmartFeedScreenContract$InputData;
import java.util.Set;
import vc.s;
import z0h.s1;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s1 f201278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a18.g f201279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SmartFeedScreenContract$InputData f201280c;
    public final e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f201281g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f201282h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f201283j;

    public f(e eVar, SmartFeedScreenContract$InputData smartFeedScreenContract$InputData, a18.g gVar, s1 s1Var) {
        this.d = eVar;
        this.f201278a = s1Var;
        this.f201279b = gVar;
        this.f201280c = smartFeedScreenContract$InputData;
        int i = 2;
        this.e = e4m.b.b(new lzk.b(eVar, this, 0, i));
        this.f = e4m.b.b(new lzk.b(eVar, this, 2, i));
        this.f201281g = e4m.b.b(new lzk.b(eVar, this, 1, i));
        this.f201282h = e4m.b.b(new lzk.b(eVar, this, 3, i));
        this.i = e4m.b.b(new lzk.b(eVar, this, 5, i));
        this.f201283j = e4m.b.b(new lzk.b(eVar, this, 4, i));
    }

    @Override // xki.e
    public final Set f() {
        aah.h hVar = (aah.h) this.e.get();
        a0k.b.n(hVar);
        return ImmutableSet.of((yji.n) hVar, (yji.n) this.f201282h.get(), (yji.n) this.f.get());
    }

    @Override // xki.e
    public final Set g() {
        aah.i iVarD = ((u8h.b) this.d.i).d();
        s.j(iVarD);
        return ImmutableSet.of((yji.d) a0k.b.l(iVarD, this.f201278a, (aah.h) this.e.get()), (yji.d) this.f201281g.get());
    }
}
