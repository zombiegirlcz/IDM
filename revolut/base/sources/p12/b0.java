package p12;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.apm.core.ui.api.navigation.pending_payments.ApmPaymentAuthorisationNavigation$InputData;
import java.util.Set;

/* JADX INFO: loaded from: classes20.dex */
public final class b0 implements xki.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmPaymentAuthorisationNavigation$InputData f231622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f12.a f231623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f231624c;
    public final b0 d = this;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f231625g;

    public b0(v vVar, ApmPaymentAuthorisationNavigation$InputData apmPaymentAuthorisationNavigation$InputData, f12.a aVar) {
        this.f231624c = vVar;
        this.f231622a = apmPaymentAuthorisationNavigation$InputData;
        this.f231623b = aVar;
        int i = 27;
        this.e = e4m.b.b(new oai.s(this, 1, i));
        this.f = e4m.b.b(new oai.s(this, 0, i));
        this.f231625g = e4m.b.b(new oai.s(this, 2, i));
    }

    @Override // xki.e
    public final Set f() {
        return ImmutableSet.of((yji.n) this.f.get());
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of();
    }
}
