package z51;

import com.revolut.core.extensions.rx.BreadcrumbException;
import efm.d0;
import efm.r;
import gzc.v;
import kl.c0;
import kotlin.jvm.internal.Intrinsics;
import ngm.n;
import te0.w;
import ufm.i;
import vfg.p;
import yea.l;
import yt8.k;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mt8.d f319414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m61.b f319415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ang.f f319416c;
    public final p d;
    public final c0 e;
    public final mt8.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ihm.f f319417g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ihm.b f319418h;

    public e(mt8.d kycInteractor, m61.b limitInteractor, ang.f userInteractor, p sofDialogAmountFormatter, c0 sowInteractor, mt8.a kycFeatureToggleProvider) {
        Intrinsics.checkNotNullParameter(kycInteractor, "kycInteractor");
        Intrinsics.checkNotNullParameter(limitInteractor, "limitInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(sofDialogAmountFormatter, "sofDialogAmountFormatter");
        Intrinsics.checkNotNullParameter(sowInteractor, "sowInteractor");
        Intrinsics.checkNotNullParameter(kycFeatureToggleProvider, "kycFeatureToggleProvider");
        this.f319414a = kycInteractor;
        this.f319415b = limitInteractor;
        this.f319416c = userInteractor;
        this.d = sofDialogAmountFormatter;
        this.e = sowInteractor;
        this.f = kycFeatureToggleProvider;
        ihm.f fVarD = v0.a.d("create(...)");
        this.f319417g = fVarD;
        ihm.b bVarH = j6.a.h("create(...)");
        this.f319418h = bVarH;
        if (!((pt8.a) kycFeatureToggleProvider).a()) {
            r rVarSwitchMap = w.w0(fVarD).switchMap(new z3e.a(new a(this, 3), 10));
            Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
            l lVar = new l(1, bVarH, ihm.b.class, "onNext", "onNext(Ljava/lang/Object;)V", 0, 24);
            r rVarOnErrorResumeNext = rVarSwitchMap.onErrorResumeNext(new wl3.e(8, new yma.w(new BreadcrumbException(), 28)));
            Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
            Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext.subscribe(new xz7.f(3, lVar), new xz7.f(3, d.f319413a)), "subscribe(...)");
            return;
        }
        r rVarSwitchMap2 = w.w0(fVarD).switchMap(new z3e.a(new a(this, 0), 9));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap2, "switchMap(...)");
        r rVarE = ue0.e.E(rVarSwitchMap2, k.b.f316671a);
        l lVar2 = new l(1, bVarH, ihm.b.class, "onNext", "onNext(Ljava/lang/Object;)V", 0, 23);
        r rVarOnErrorResumeNext2 = rVarE.onErrorResumeNext(new wl3.e(8, new yma.w(new BreadcrumbException(), 27)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext2, "onErrorResumeNext(...)");
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext2.subscribe(new xz7.f(3, lVar2), new xz7.f(3, c.f319412a)), "subscribe(...)");
    }

    public final d0 a(wi0.b bVar) {
        if (bVar != null) {
            ufm.b bVarM = d0.m(bVar);
            Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
            return bVarM;
        }
        d0 d0VarF = this.f319416c.f(false);
        b bVar2 = b.f;
        return new i(d0VarF, new x2l.a(20, false), 1);
    }

    public final r b() {
        d0 d0VarP = osg.b.p(((m61.c) this.f319415b).f202967a, null, 2);
        m30.b bVar = new m30.b(26, new m30.c(28));
        d0VarP.getClass();
        i iVar = new i(d0VarP, bVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        d0 d0VarFirstOrError = zi0.c.q(nim.a.w(this.e.i(), new z1i.l(28)), v.NONE).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return new i(new i(w.H0(iVar, d0VarFirstOrError), new z3e.a(new z1i.l(27), 6), 1), new z3e.a(new a(this, 1), 7), 0).x();
    }

    public final boolean c(yt8.c cVar) {
        yt8.f fVarO;
        if (n.p(cVar.f316662a)) {
            return ((pt8.a) this.f).a() || ((fVarO = l9.l.o(cVar)) != null && n.p(fVarO.f316667a));
        }
        return false;
    }
}
