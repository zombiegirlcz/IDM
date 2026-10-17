package ush;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.widgets.impl.ui.flow.selection.WidgetSelectionFlowContact$InputData;
import csh.k;
import e4m.e;
import java.util.Set;
import xki.c;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements c, wsh.a, ysh.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final osh.a f282924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hsh.b f282925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f282926c;
    public final WidgetSelectionFlowContact$InputData d;
    public final b e = this;
    public final e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f282927g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f282928h;

    public b(osh.a aVar, hsh.b bVar, k kVar, WidgetSelectionFlowContact$InputData widgetSelectionFlowContact$InputData) {
        this.f282924a = aVar;
        this.f282925b = bVar;
        this.f282926c = kVar;
        this.d = widgetSelectionFlowContact$InputData;
        int i = 26;
        this.f = e4m.b.b(new tn3.a(this, 0, i));
        this.f282927g = e4m.b.b(new tn3.a(this, 2, i));
        this.f282928h = e4m.b.b(new tn3.a(this, 1, i));
    }

    @Override // ysh.a
    public final qsh.c b() {
        return new qsh.c(this.e, 1);
    }

    @Override // wsh.a
    public final qsh.e c() {
        return new qsh.e(this.e, 1);
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
