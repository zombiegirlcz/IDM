package p12;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class k implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f231691a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g12.l f231692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f231693c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f231694g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f231695h;

    public k(d dVar, f fVar, ViewController viewController, g12.l lVar) {
        this.f231695h = fVar;
        this.f231692b = lVar;
        int i = 17;
        this.f231693c = e4m.g.a(new ned.h(dVar, fVar, this, 2, i));
        this.d = e4m.b.b(e4m.c.a(viewController));
        this.e = e4m.b.b(new ned.h(dVar, fVar, this, 1, i));
        this.f = e4m.b.b(new ned.h(dVar, fVar, this, 3, i));
        this.f231694g = e4m.b.b(new ned.h(dVar, fVar, this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        switch (this.f231691a) {
        }
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        switch (this.f231691a) {
        }
        return ImmutableSet.of();
    }

    public k(d dVar, g gVar, ViewController viewController, g12.l lVar) {
        this.f231695h = gVar;
        this.f231692b = lVar;
        int i = 16;
        this.f231693c = e4m.g.a(new ned.h(dVar, gVar, this, 2, i));
        this.d = e4m.b.b(e4m.c.a(viewController));
        this.e = e4m.b.b(new ned.h(dVar, gVar, this, 1, i));
        this.f = e4m.b.b(new ned.h(dVar, gVar, this, 3, i));
        this.f231694g = e4m.b.b(new ned.h(dVar, gVar, this, 0, i));
    }
}
