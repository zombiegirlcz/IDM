package ush;

import com.revolut.feature.widgets.impl.ui.flow.selection.WidgetSelectionFlowContact$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import csh.k;
import vc.s;
import xki.c;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements xki.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewController f282921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public hsh.b f282922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k f282923c;
    public WidgetSelectionFlowContact$InputData d;

    private a() {
    }

    @Override // xki.b
    public final Object a(ViewController viewController) {
        throw null;
    }

    @Override // xki.b
    public final c build() {
        s.h(this.f282921a, ViewController.class);
        s.h(this.f282922b, hsh.b.class);
        s.h(this.f282923c, k.class);
        s.h(this.d, WidgetSelectionFlowContact$InputData.class);
        return new b(new osh.a(), this.f282922b, this.f282923c, this.d);
    }
}
