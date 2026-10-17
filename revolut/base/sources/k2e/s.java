package k2e;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class s implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f180550a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ViewController f180551b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f180552c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f180553g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f180554h;

    public s(j jVar, l lVar, ViewController viewController) {
        this.f180552c = jVar;
        this.f180551b = viewController;
        int i = 14;
        this.d = e4m.b.b(new jqa.h(jVar, this, 1, i));
        this.e = e4m.b.b(new jqa.h(jVar, this, 0, i));
        this.f = e4m.b.b(new jqa.h(jVar, this, 3, i));
        this.f180553g = e4m.b.b(new jqa.h(jVar, this, 2, i));
        this.f180554h = e4m.b.b(new jqa.h(jVar, this, 4, i));
    }

    @Override // xki.e
    public final Set f() {
        switch (this.f180550a) {
        }
        return ImmutableSet.of((yji.n) this.e.get());
    }

    @Override // xki.e
    public final Set g() {
        switch (this.f180550a) {
        }
        return ImmutableSet.of();
    }

    public s(j jVar, ViewController viewController) {
        this.f180552c = jVar;
        this.f180551b = viewController;
        int i = 15;
        this.d = e4m.b.b(new jqa.h(jVar, this, 1, i));
        this.e = e4m.b.b(new jqa.h(jVar, this, 0, i));
        this.f = e4m.b.b(new jqa.h(jVar, this, 3, i));
        this.f180553g = e4m.b.b(new jqa.h(jVar, this, 2, i));
        this.f180554h = e4m.b.b(new jqa.h(jVar, this, 4, i));
    }
}
