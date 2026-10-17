package lq;

import a08.g0;
import asi.d;
import com.revolut.core.extensions.rx.BreadcrumbException;
import cu8.r0;
import kotlin.jvm.internal.Intrinsics;
import lak.l;
import lk4.g;
import sri.m;
import te0.w;
import ufm.i;
import ufm.n;

/* JADX INFO: loaded from: classes17.dex */
public final class c extends bsi.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final m f199159j;
    public final d k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final r0 f199160l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f199161m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final a f199162n;

    public c(m navigator, d userSessionInteractor, r0 kycRequiredActionTransformer, int i, a configurationScreenProvider) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(userSessionInteractor, "userSessionInteractor");
        Intrinsics.checkNotNullParameter(kycRequiredActionTransformer, "kycRequiredActionTransformer");
        Intrinsics.checkNotNullParameter(configurationScreenProvider, "configurationScreenProvider");
        this.f199159j = navigator;
        this.k = userSessionInteractor;
        this.f199160l = kycRequiredActionTransformer;
        this.f199161m = i;
        this.f199162n = configurationScreenProvider;
    }

    @Override // pri.a
    public final void N(rri.a view) {
        Intrinsics.checkNotNullParameter(view, "view");
        n nVarI = o70.a.i(ks8.m.a(this.f199160l));
        g gVar = new g(this, 18);
        i iVar = new i(nVarI, new ks0.n(new l(new BreadcrumbException(), 9), (byte) 0), 2);
        Intrinsics.checkNotNullExpressionValue(iVar, "onErrorResumeNext(...)");
        ofm.i iVar2 = new ofm.i(new g0(27, gVar), new g0(27, this.i), 0);
        iVar.q(iVar2);
        Intrinsics.checkNotNullExpressionValue(iVar2, "subscribe(...)");
        w.j0(this.f239031a, iVar2);
    }
}
