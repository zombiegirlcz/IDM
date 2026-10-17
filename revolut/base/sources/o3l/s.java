package o3l;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KProperty;
import kotlin.sequences.Sequence;

/* JADX INFO: loaded from: classes12.dex */
public final class s extends iri.a implements f {
    public static final /* synthetic */ KProperty[] E;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final te0.j f221867b = new te0.j();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final te0.j f221868c = new te0.j();
    public final te0.j d = new te0.j();
    public final te0.j e = new te0.j();
    public final te0.j f = new te0.j();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final te0.j f221869g = new te0.j();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final te0.j f221870h = new te0.j();
    public final te0.j i = new te0.j();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final te0.j f221871j = new te0.j();
    public final te0.j k = new te0.j();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final te0.j f221872l = new te0.j();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final te0.j f221873m = new te0.j();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final te0.j f221874n = new te0.j();
    public final te0.j o = new te0.j();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final te0.j f221875p = new te0.j();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final te0.j f221876q = new te0.j();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final te0.j f221877r = new te0.j();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final te0.j f221878s = new te0.j();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final te0.j f221879t = new te0.j();
    public final te0.j u = new te0.j();
    public final te0.j v = new te0.j();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final te0.j f221880w = new te0.j();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final te0.j f221881x = new te0.j();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final te0.j f221882y = new te0.j();
    public final te0.j z = new te0.j();
    public final te0.j A = new te0.j();
    public final te0.j B = new te0.j();
    public final te0.j C = new te0.j();
    public final te0.j D = new te0.j();

    static {
        h0 h0Var = new h0(s.class, "title", "getTitle()Lcom/revolut/core/data/state/BaseBundleField;", 0);
        p0 p0Var = o0.f186429a;
        E = new KProperty[]{p0Var.j(h0Var), p.a.y(s.class, "subtitle", "getSubtitle()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(s.class, "linkText", "getLinkText()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(s.class, "linkNavigationCommand", "getLinkNavigationCommand()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(s.class, "linkCopyMessage", "getLinkCopyMessage()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(s.class, "linkTextStyle", "getLinkTextStyle()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(s.class, "bottomAboveNextButtonText", "getBottomAboveNextButtonText()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(s.class, "bottomAboveNextButtonNavigationCommand", "getBottomAboveNextButtonNavigationCommand()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(s.class, "primaryButtonText", "getPrimaryButtonText()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(s.class, "primaryButtonVisible", "getPrimaryButtonVisible()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(s.class, "primaryButtonNavigationCommand", "getPrimaryButtonNavigationCommand()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(s.class, "primaryButtonDeeplink", "getPrimaryButtonDeeplink()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(s.class, "secondaryButtonText", "getSecondaryButtonText()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(s.class, "secondaryButtonVisible", "getSecondaryButtonVisible()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(s.class, "secondaryButtonNavigationCommand", "getSecondaryButtonNavigationCommand()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(s.class, "toolbarNavigationIcon", "getToolbarNavigationIcon()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(s.class, "toolbarProgressVisible", "getToolbarProgressVisible()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(s.class, "toolbarTitle", "getToolbarTitle()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(s.class, "toolbarMenu", "getToolbarMenu()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(s.class, "toolbarMenuButtonNavigationCommand", "getToolbarMenuButtonNavigationCommand()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(s.class, "image", "getImage()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(s.class, "bigImage", "getBigImage()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(s.class, "progress", "getProgress()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(s.class, "toolbarVisible", "getToolbarVisible()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(s.class, "overlayAnimation", "getOverlayAnimation()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(s.class, "progressVisible", "getProgressVisible()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(s.class, "video", "getVideo()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(s.class, "canGoBack", "getCanGoBack()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var), p.a.y(s.class, "operationStatusType", "getOperationStatusType()Lcom/revolut/core/data/state/BaseBundleField;", 0, p0Var)};
    }

    @Override // o3l.f
    public final te0.e B() {
        return this.f.getValue(this, E[4]);
    }

    @Override // o3l.f
    public final te0.e C() {
        return this.C.getValue(this, E[27]);
    }

    @Override // o3l.f
    public final te0.e I() {
        return this.e.getValue(this, E[3]);
    }

    @Override // o3l.f
    public final te0.e L() {
        return this.o.getValue(this, E[13]);
    }

    @Override // o3l.f
    public final te0.e M() {
        return this.f221874n.getValue(this, E[12]);
    }

    @Override // o3l.f
    public final te0.e N() {
        return this.B.getValue(this, E[26]);
    }

    @Override // o3l.f
    public final te0.e O() {
        return this.D.getValue(this, E[28]);
    }

    @Override // o3l.f
    public final te0.e Q() {
        return this.u.getValue(this, E[19]);
    }

    @Override // o3l.f
    public final te0.e R() {
        return this.f221878s.getValue(this, E[17]);
    }

    @Override // o3l.f
    public final te0.e T() {
        return this.f221879t.getValue(this, E[18]);
    }

    @Override // o3l.f
    public final te0.e W() {
        return this.k.getValue(this, E[9]);
    }

    @Override // o3l.f
    public final te0.e X() {
        return this.f221876q.getValue(this, E[15]);
    }

    @Override // o3l.f
    public final te0.e Y() {
        return this.f221869g.getValue(this, E[5]);
    }

    @Override // o3l.f
    public final te0.e c() {
        return this.f221868c.getValue(this, E[1]);
    }

    @Override // o3l.f
    public final te0.e d0() {
        return this.f221875p.getValue(this, E[14]);
    }

    @Override // o3l.f
    public final te0.e e0() {
        return this.f221882y.getValue(this, E[23]);
    }

    @Override // o3l.f
    public final te0.e getImage() {
        return this.v.getValue(this, E[20]);
    }

    @Override // o3l.f
    public final te0.e getProgress() {
        return this.f221881x.getValue(this, E[22]);
    }

    @Override // o3l.f
    public final te0.e k0() {
        return this.f221872l.getValue(this, E[10]);
    }

    @Override // o3l.f
    public final te0.e l() {
        return this.f221880w.getValue(this, E[21]);
    }

    @Override // o3l.f
    public final te0.e m() {
        return this.f221873m.getValue(this, E[11]);
    }

    @Override // o3l.f
    public final te0.e m0() {
        return this.f221871j.getValue(this, E[8]);
    }

    @Override // o3l.f
    public final te0.e o0() {
        return this.z.getValue(this, E[24]);
    }

    @Override // o3l.f
    public final te0.e p() {
        return this.i.getValue(this, E[7]);
    }

    @Override // o3l.f
    public final te0.e p0() {
        return this.d.getValue(this, E[2]);
    }

    @Override // o3l.f
    public final te0.e r() {
        return this.f221867b.getValue(this, E[0]);
    }

    @Override // o3l.f
    public final te0.e t() {
        return this.f221870h.getValue(this, E[6]);
    }

    @Override // o3l.f
    public final te0.e u() {
        return this.f221877r.getValue(this, E[16]);
    }

    @Override // iri.a
    public final Sequence v0() {
        te0.e[] elements = {r(), c(), p0(), t(), p(), I(), B(), Y(), m0(), W(), k0(), M(), L(), d0(), X(), u(), R(), T(), Q(), getImage(), l(), getProgress(), e0(), o0(), w(), N(), C(), O()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.E(elements);
    }

    @Override // o3l.f
    public final te0.e w() {
        return this.A.getValue(this, E[25]);
    }
}
