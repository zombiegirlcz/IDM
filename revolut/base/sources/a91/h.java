package a91;

import cli.n;
import cli.y;
import kotlin.jvm.internal.Intrinsics;
import tnb.k;
import vkm.j2;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes20.dex */
public final class h extends oki.h implements e {
    public final x81.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final s70.a f2293p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ekg.g f2294q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f2295r;

    public h(n stateMapper, x81.b accessibilitySettingsInteractor, s70.a intentProvider, ekg.g uiPersonalisationInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(accessibilitySettingsInteractor, "accessibilitySettingsInteractor");
        Intrinsics.checkNotNullParameter(intentProvider, "intentProvider");
        Intrinsics.checkNotNullParameter(uiPersonalisationInteractor, "uiPersonalisationInteractor");
        this.o = accessibilitySettingsInteractor;
        this.f2293p = intentProvider;
        this.f2294q = uiPersonalisationInteractor;
        u81.d dVar = accessibilitySettingsInteractor.f303257a;
        ue0.c cVar = dVar.f278076a;
        Class cls = Boolean.TYPE;
        Boolean bool = (Boolean) cVar.T2("ACTION_VISIBILITY_KEY", cls);
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Boolean bool2 = (Boolean) dVar.f278076a.T2("COLOR_CONTRAST_KEY", cls);
        this.f2295r = mra.d.b(this, new d(zBooleanValue, bool2 != null ? bool2.booleanValue() : false), stateMapper, null, false, 12);
    }

    public final void I2() throws Throwable {
        boolean z = !((d) ((j2) this.f2295r.f22677a).getValue()).f2289a;
        x81.b bVar = this.o;
        bVar.f303257a.f278076a.G(Boolean.valueOf(z), "ACTION_VISIBILITY_KEY", Boolean.TYPE);
        bVar.a();
    }

    public final void J2() throws Throwable {
        boolean z = !((d) ((j2) this.f2295r.f22677a).getValue()).f2290b;
        x81.b bVar = this.o;
        bVar.f303257a.f278076a.G(Boolean.valueOf(z), "COLOR_CONTRAST_KEY", Boolean.TYPE);
        bVar.a();
        wjg.a.a(this.f2294q);
    }

    @Override // yji.l
    public final void T1(long j2) {
        x81.b bVar = this.o;
        ue0.c cVar = bVar.f303257a.f278076a;
        Class cls = Boolean.TYPE;
        l.b1(this, q.q(new k(cVar.C0("ACTION_VISIBILITY_KEY", cls), 2)), null, new g(this, null, 0), 3);
        l.b1(this, q.q(new k(bVar.f303257a.f278076a.C0("COLOR_CONTRAST_KEY", cls), 3)), null, new g(this, null, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f2295r;
    }
}
