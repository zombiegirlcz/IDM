package jj9;

import com.revolut.data.model.Data;
import cxe.u;
import efm.r;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import te0.w;
import vi9.e0;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class m extends jki.g implements h, di9.a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final xh9.a f174796p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final j60.a f174797q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e0 f174798r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final uj9.b f174799s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final di9.b f174800t;
    public final qi9.d u;
    public final ang.f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final di9.a f174801w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final c f174802x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(xh9.a payLaterInteractor, j60.a bottomDialog, e0 payLaterStateDialogMapper, uj9.b payLaterExplainerDialogMapper, di9.b payLaterGetHelpExtension, qi9.d payLaterNavigationCommandFactory, ang.f userInteractor, di9.a payLaterCrossSellExtension, p stateMapper) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(payLaterInteractor, "payLaterInteractor");
        Intrinsics.checkNotNullParameter(bottomDialog, "bottomDialog");
        Intrinsics.checkNotNullParameter(payLaterStateDialogMapper, "payLaterStateDialogMapper");
        Intrinsics.checkNotNullParameter(payLaterExplainerDialogMapper, "payLaterExplainerDialogMapper");
        Intrinsics.checkNotNullParameter(payLaterGetHelpExtension, "payLaterGetHelpExtension");
        Intrinsics.checkNotNullParameter(payLaterNavigationCommandFactory, "payLaterNavigationCommandFactory");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(payLaterCrossSellExtension, "payLaterCrossSellExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.f174796p = payLaterInteractor;
        this.f174797q = bottomDialog;
        this.f174798r = payLaterStateDialogMapper;
        this.f174799s = payLaterExplainerDialogMapper;
        this.f174800t = payLaterGetHelpExtension;
        this.u = payLaterNavigationCommandFactory;
        this.v = userInteractor;
        this.f174801w = payLaterCrossSellExtension;
        this.f174802x = new c(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), new Data(null, null, true, 3, null), null);
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, this.f174801w.Y0(ai9.d.f5220a), null, null, new l(this, null, 0), 3);
        ti9.g gVar = (ti9.g) this.f174796p;
        w4l.h loadingStrategy = w4l.h.f294642c;
        u uVarK = gVar.k(loadingStrategy);
        kotlin.coroutines.g gVar2 = kotlin.coroutines.g.f186406a;
        r rVarW = nim.a.w(rd0.e.c(uVarK, gVar2), new jj3.a(4));
        r rVarH = gVar.h(loadingStrategy);
        r rVarC = rd0.e.c(boh.f.e(nim.a.v(gVar.k(w4l.j.f294644c), new jj3.a(5)), new jeg.g(this, 26)), gVar2);
        gVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        r rVarP = ue0.e.p(rd0.e.c(xam.a.h(new ti9.c(gVar, null, 0), u0.m(rd0.e.b(((ej9.p) gVar.f271458c).e()), ((ej9.e0) gVar.f271456a).a(loadingStrategy))), gVar2), h0.f322473a);
        ux4.b.Companion.getClass();
        yji.l.a1(this, rd0.e.b(w.o(rVarW, rVarH, rVarC, n14.k.r(rVarP, ux4.b.f283863b), this.v.k(false))), null, null, new l(this, null, 1), 3);
    }

    @Override // di9.a
    public final Flow Y0(ai9.h slot) {
        Intrinsics.checkNotNullParameter(slot, "slot");
        return this.f174801w.Y0(slot);
    }

    @Override // di9.a
    public final void f1(ai9.b payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.f174801w.f1(payload);
    }

    @Override // di9.a
    public final void p(ai9.b payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.f174801w.p(payload);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f174802x;
    }
}
