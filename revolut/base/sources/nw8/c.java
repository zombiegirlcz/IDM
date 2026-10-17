package nw8;

import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.feature.kyc.impl.init.InitKycScreenContract$Configuration;
import efm.r;
import ihm.j;
import kotlin.jvm.internal.Intrinsics;
import noi.l;
import te0.w;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends ori.a implements g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z51.f f219791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InitKycScreenContract$Configuration f219792c;
    public final ifm.b d;
    public final j e;

    public c(z51.f identityVerificationInteractor, InitKycScreenContract$Configuration configuration, ifm.b compositeDisposable) {
        Intrinsics.checkNotNullParameter(identityVerificationInteractor, "identityVerificationInteractor");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(compositeDisposable, "compositeDisposable");
        this.f219791b = identityVerificationInteractor;
        this.f219792c = configuration;
        this.d = compositeDisposable;
        this.e = p.a.D("toSerialized(...)");
    }

    @Override // ori.a, nri.a
    public final void i3() {
        wi0.b bVar = this.f219792c.f77823c;
        z51.e eVar = (z51.e) this.f219791b;
        eVar.getClass();
        pfm.h hVar = new pfm.h(new xza.a(eVar, bVar, 12), 2);
        Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
        pfm.a aVar = new pfm.a(hVar, new kye.e(new ne0.e(new BreadcrumbException(), 9)), 2);
        Intrinsics.checkNotNullExpressionValue(aVar, "onErrorResumeNext(...)");
        ofm.h hVarW = aVar.w(new n1i.b(3, b.f219790a), a.f219789a);
        Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
        w.j0(this.d, hVarW);
        r rVarHide = eVar.f319418h.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
        rVarHide.map(new l(21, new nrd.g(this, 19))).subscribe(this.e);
    }
}
