package rkd;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.slot_manager.impl.ui.screen.checklist.SlotChecklistControllerContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SlotChecklistControllerContract$InputData f254817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kkd.f f254818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f254819c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f254820g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f254821h;

    public h(g gVar, ViewController viewController, SlotChecklistControllerContract$InputData slotChecklistControllerContract$InputData, kkd.f fVar) {
        this.f254819c = gVar;
        this.f254817a = slotChecklistControllerContract$InputData;
        this.f254818b = fVar;
        this.d = e4m.b.b(e4m.c.a(viewController));
        int i = 9;
        this.e = e4m.b.b(new r7d.o(gVar, this, 0, i));
        this.f = e4m.b.b(new r7d.o(gVar, this, 1, i));
        this.f254820g = e4m.b.b(new r7d.o(gVar, this, 3, i));
        this.f254821h = e4m.b.b(new r7d.o(gVar, this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.e.get());
    }
}
