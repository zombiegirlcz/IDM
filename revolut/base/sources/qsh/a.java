package qsh;

import com.revolut.feature.widgets.impl.ui.flow.carousel.WidgetCarouselFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import csh.k;
import vc.s;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements xki.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ViewController f248837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public hsh.b f248838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k f248839c;
    public WidgetCarouselFlowContract$InputData d;

    private a() {
    }

    @Override // xki.b
    public final Object a(ViewController viewController) {
        throw null;
    }

    @Override // xki.b
    public final xki.c build() {
        s.h(this.f248837a, ViewController.class);
        s.h(this.f248838b, hsh.b.class);
        s.h(this.f248839c, k.class);
        s.h(this.d, WidgetCarouselFlowContract$InputData.class);
        return new b(new osh.a(), this.f248838b, this.f248839c, this.d);
    }
}
