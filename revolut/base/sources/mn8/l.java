package mn8;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.junior_settings.impl.ui_kompot.settings.JuniorSettingsControllerContract$Input;
import com.revolut.kompot.navigable.vc.ViewController;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class l implements yo8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JuniorSettingsControllerContract$Input f207447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f207448b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f207449c;
    public final e4m.e d;
    public final e4m.e e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f207450g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f207451h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f207452j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f207453l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f207454m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f207455n;
    public final e4m.e o;

    public l(o oVar, ViewController viewController, JuniorSettingsControllerContract$Input juniorSettingsControllerContract$Input) {
        this.f207448b = oVar;
        this.f207447a = juniorSettingsControllerContract$Input;
        this.f207449c = e4m.b.b(e4m.c.a(viewController));
        int i = 22;
        this.d = e4m.b.b(new mjl.b(oVar, this, 2, i));
        this.e = e4m.b.b(new mjl.b(oVar, this, 1, i));
        this.f = e4m.b.b(new mjl.b(oVar, this, 0, i));
        this.f207450g = e4m.b.b(new mjl.b(oVar, this, 5, i));
        this.f207451h = e4m.b.b(new mjl.b(oVar, this, 4, i));
        this.i = e4m.b.b(new mjl.b(oVar, this, 3, i));
        this.f207452j = e4m.b.b(new mjl.b(oVar, this, 7, i));
        this.k = e4m.b.b(new mjl.b(oVar, this, 6, i));
        this.f207453l = e4m.b.b(new mjl.b(oVar, this, 9, i));
        this.f207454m = e4m.b.b(new mjl.b(oVar, this, 8, i));
        this.f207455n = e4m.b.b(new mjl.b(oVar, this, 10, i));
        this.o = e4m.b.b(new mjl.b(oVar, this, 11, i));
    }

    public final jul.o b() {
        o oVar = this.f207448b;
        hj8.a aVarA = oVar.f.a();
        vc.s.j(aVarA);
        te8.e eVarA = oVar.f207465g.a();
        vc.s.j(eVarA);
        return new jul.o(aVarA, eVarA);
    }

    @Override // xki.e
    public final Set f() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(5);
        builderBuilderWithExpectedSize.addAll((Iterable) this.k.get());
        builderBuilderWithExpectedSize.add(this.f207454m.get());
        builderBuilderWithExpectedSize.add(this.f207453l.get());
        builderBuilderWithExpectedSize.add(this.f207455n.get());
        return j6.a.g(this.f207452j, builderBuilderWithExpectedSize);
    }

    @Override // xki.e
    public final Set g() {
        return ImmutableSet.of((yji.d) this.f.get(), (yji.d) this.i.get());
    }
}
