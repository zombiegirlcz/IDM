package ot2;

import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Collections;
import java.util.Set;
import xki.e;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewController f229429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f229430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f229431c;

    public b(a aVar, ViewController viewController) {
        this.f229429a = viewController;
        int i = 21;
        this.f229430b = e4m.b.b(new oi9.a(aVar, this, 1, i));
        this.f229431c = e4m.b.b(new oi9.a(aVar, this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        return Collections.EMPTY_SET;
    }

    @Override // xki.e
    public final Set g() {
        return Collections.EMPTY_SET;
    }
}
