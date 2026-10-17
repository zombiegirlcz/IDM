package bab;

import b6b.m;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.retail.goals.impl.ui.GoalsControllerContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import e4m.c;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import vc.s;
import xki.e;
import yji.d;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GoalsControllerContract$InputData f14008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f14009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f14010c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f14011g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f14012h;

    public b(a aVar, ViewController viewController, GoalsControllerContract$InputData goalsControllerContract$InputData) {
        this.f14009b = aVar;
        this.f14008a = goalsControllerContract$InputData;
        this.f14010c = e4m.b.b(c.a(viewController));
        this.d = e4m.b.b(new m(aVar, this, 1, 17));
        this.e = e4m.b.b(new m(aVar, this, 0, 17));
        this.f = e4m.b.b(new m(aVar, this, 3, 17));
        this.f14011g = e4m.b.b(new m(aVar, this, 4, 17));
        this.f14012h = e4m.b.b(new m(aVar, this, 2, 17));
    }

    public final w80.b b() {
        qd0.b languageProvider = this.f14009b.f14005a.n();
        s.j(languageProvider);
        dab.b.Companion.getClass();
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        return v80.b.b(languageProvider, false, false, 58);
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((d) this.e.get());
    }
}
