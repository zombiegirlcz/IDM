package bt7;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.insurance_credit.impl.ui.screen.contact.ContactScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ContactScreenContract$InputData f18407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f18408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f18409c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    public c(i iVar, j jVar, ViewController viewController, ContactScreenContract$InputData contactScreenContract$InputData) {
        this.f18408b = iVar;
        this.f18407a = contactScreenContract$InputData;
        this.f18409c = e4m.b.b(new b6b.m(iVar, this, 1, 29));
        this.d = e4m.b.b(e4m.c.a(viewController));
        int i = 29;
        this.e = e4m.b.b(new b6b.m(iVar, this, 2, i));
        this.f = e4m.b.b(new b6b.m(iVar, this, 0, i));
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
