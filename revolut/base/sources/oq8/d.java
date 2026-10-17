package oq8;

import com.google.common.collect.ImmutableSet;
import com.revolut.core.ui_kit.views.reactionskeyboard.ReactionsKeyboardView;
import com.revolut.feature.junior_transfer.impl.ui.screen.JuniorTransferAmountScreenContract$InputData;
import com.revolut.kompot.navigable.screen.BaseScreen;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements sji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o9i.a f227770a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o9i.b f227771b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o9i.c f227772c;
    public final ReactionsKeyboardView d;
    public final JuniorTransferAmountScreenContract$InputData e;
    public final f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f227773g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f227774h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f227775j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f227776l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f227777m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f227778n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f227779p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f227780q;

    public d(f fVar, e eVar, o9i.a aVar, o9i.b bVar, o9i.c cVar, BaseScreen baseScreen, JuniorTransferAmountScreenContract$InputData juniorTransferAmountScreenContract$InputData, ReactionsKeyboardView reactionsKeyboardView) {
        this.f = fVar;
        this.f227770a = aVar;
        this.f227771b = bVar;
        this.f227772c = cVar;
        this.d = reactionsKeyboardView;
        this.e = juniorTransferAmountScreenContract$InputData;
        this.f227773g = e4m.b.b(e4m.c.a(baseScreen));
        int i = 19;
        this.f227774h = e4m.b.b(new oi9.a(fVar, this, 1, i));
        this.i = e4m.b.b(new oi9.a(fVar, this, 0, i));
        this.f227775j = e4m.b.b(new oi9.a(fVar, this, 3, i));
        this.k = e4m.b.b(new oi9.a(fVar, this, 2, i));
        this.f227776l = e4m.b.b(new oi9.a(fVar, this, 5, i));
        this.f227777m = e4m.b.b(new oi9.a(fVar, this, 6, i));
        this.f227778n = e4m.b.b(new oi9.a(fVar, this, 9, i));
        this.o = e4m.b.b(new oi9.a(fVar, this, 8, i));
        this.f227779p = e4m.b.b(new oi9.a(fVar, this, 7, i));
        this.f227780q = e4m.b.b(new oi9.a(fVar, this, 4, i));
    }

    @Override // sji.b
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // sji.b
    public final Set g() {
        return ImmutableSet.of((yji.d) this.i.get(), (yji.d) this.k.get());
    }
}
