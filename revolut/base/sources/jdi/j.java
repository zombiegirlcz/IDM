package jdi;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature_rev_points_pocket_impl.ui.screen.onboarding.RevPointsPocketOnboardingScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public final class j implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f173104a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RevPointsPocketOnboardingScreenContract$InputData f173105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f173106c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f173107g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f173108h;

    public j(c cVar, f fVar, ViewController viewController, RevPointsPocketOnboardingScreenContract$InputData revPointsPocketOnboardingScreenContract$InputData) {
        this.f173105b = revPointsPocketOnboardingScreenContract$InputData;
        this.f173106c = e4m.b.b(e4m.c.a(viewController));
        int i = 0;
        this.d = e4m.b.b(new i(cVar, this, 2, i));
        this.e = e4m.b.b(new i(cVar, this, 1, i));
        this.f = e4m.b.b(new i(cVar, this, 0, i));
        this.f173107g = e4m.b.b(new i(cVar, this, 4, i));
        this.f173108h = e4m.b.b(new i(cVar, this, 3, i));
    }

    @Override // xki.e
    public final Set f() {
        switch (this.f173104a) {
        }
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        switch (this.f173104a) {
        }
        return ImmutableSet.of((yji.d) this.f.get());
    }

    public j(c cVar, ViewController viewController, RevPointsPocketOnboardingScreenContract$InputData revPointsPocketOnboardingScreenContract$InputData) {
        int i = 1;
        this.f173105b = revPointsPocketOnboardingScreenContract$InputData;
        this.f173106c = e4m.b.b(e4m.c.a(viewController));
        this.d = e4m.b.b(new i(cVar, this, 2, i));
        this.e = e4m.b.b(new i(cVar, this, 1, i));
        this.f = e4m.b.b(new i(cVar, this, 0, i));
        this.f173107g = e4m.b.b(new i(cVar, this, 4, i));
        this.f173108h = e4m.b.b(new i(cVar, this, 3, i));
    }
}
