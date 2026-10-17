package lf9;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.error.FormErrorsScreenContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FormErrorsScreenContract$InputData f194713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4m.e f194714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f194715c;
    public final e4m.e d;

    public g(m mVar, h hVar, ViewController viewController, FormErrorsScreenContract$InputData formErrorsScreenContract$InputData) {
        this.f194713a = formErrorsScreenContract$InputData;
        this.f194714b = e4m.b.b(e4m.c.a(viewController));
        int i = 19;
        this.f194715c = e4m.b.b(new l9f.z(mVar, this, 1, i));
        this.d = e4m.b.b(new l9f.z(mVar, this, 0, i));
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
