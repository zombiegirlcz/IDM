package tz2;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.card_management.impl.ui.kompot.placeholder_settings.DisposableCardSettingsContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;
import vc.s;

/* JADX INFO: loaded from: classes21.dex */
public final class m implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DisposableCardSettingsContract$InputData f275791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f275792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f275793c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f275794g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f275795h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f275796j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f275797l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f275798m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f275799n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f275800p;

    public m(e eVar, o oVar, ViewController viewController, DisposableCardSettingsContract$InputData disposableCardSettingsContract$InputData) {
        this.f275792b = eVar;
        this.f275791a = disposableCardSettingsContract$InputData;
        this.f275793c = e4m.b.b(e4m.c.a(viewController));
        int i = 20;
        this.d = e4m.b.b(new tg5.h(eVar, this, 2, i));
        this.e = e4m.b.b(new tg5.h(eVar, this, 1, i));
        this.f = e4m.b.b(new tg5.h(eVar, this, 0, i));
        this.f275794g = e4m.b.b(new tg5.h(eVar, this, 5, i));
        this.f275795h = e4m.b.b(new tg5.h(eVar, this, 4, i));
        this.i = e4m.b.b(new tg5.h(eVar, this, 3, i));
        this.f275796j = e4m.b.b(new tg5.h(eVar, this, 6, i));
        this.k = e4m.b.b(new tg5.h(eVar, this, 8, i));
        this.f275797l = e4m.b.b(new tg5.h(eVar, this, 7, i));
        this.f275798m = e4m.b.b(new tg5.h(eVar, this, 9, i));
        this.f275799n = e4m.b.b(new tg5.h(eVar, this, 11, i));
        this.o = e4m.b.b(new tg5.h(eVar, this, 12, i));
        this.f275800p = e4m.b.b(new tg5.h(eVar, this, 10, i));
    }

    public final u03.j b() {
        e03.c cVar = (e03.c) this.k.get();
        e eVar = this.f275792b;
        y43.a aVarA = eVar.d.a();
        m93.d dVarF = eVar.f275760c.f();
        s.j(dVarF);
        u03.g gVar = new u03.g(dVarF);
        gte.a aVarB = eVar.f275758a.b();
        s.j(aVarB);
        return new u03.j(cVar, aVarA, gVar, aVarB, eVar.e.c());
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f275796j.get(), (yji.n) this.f275797l.get(), (yji.n) this.f275798m.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get(), (yji.d) this.i.get());
    }
}
