package m5c;

import com.google.common.collect.ImmutableSet;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;
import xki.e;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewController f202879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f202880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f202881c;

    public a(c cVar, ViewController viewController) {
        this.f202879a = viewController;
        int i = 22;
        this.f202880b = e4m.b.b(new lzk.b(cVar, this, 1, i));
        this.f202881c = e4m.b.b(new lzk.b(cVar, this, 0, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
