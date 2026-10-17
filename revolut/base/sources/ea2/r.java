package ea2;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class r implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f124111a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f124112b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f124113c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public r(h hVar, k kVar, ViewController viewController) {
        this.f124112b = hVar;
        this.f124113c = e4m.b.b(e4m.c.a(viewController));
        int i = 2;
        this.d = e4m.b.b(new p(hVar, this, 1, i));
        this.e = e4m.b.b(new p(hVar, this, 2, i));
        this.f = e4m.b.b(new p(hVar, this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        switch (this.f124111a) {
        }
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        switch (this.f124111a) {
        }
        return ImmutableSet.of();
    }

    public r(h hVar, i iVar, ViewController viewController) {
        this.f124112b = hVar;
        this.f124113c = e4m.b.b(e4m.c.a(viewController));
        int i = 1;
        this.d = e4m.b.b(new p(hVar, this, 1, i));
        this.e = e4m.b.b(new p(hVar, this, 2, i));
        this.f = e4m.b.b(new p(hVar, this, 0, i));
    }
}
