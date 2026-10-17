package uh7;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import te0.r;
import te0.s;

/* JADX INFO: loaded from: classes22.dex */
public final class j extends c {
    public final b7h.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final nh7.d f280118g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f280119h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(twg.c instrumentsTrendCollectionsInteractor, b7h.a tabbedWidgetInteractor, nh7.d widget, e38.f widgetAvailabilityProvider, e widgetContentMapper, o widgetFiltersProvider) {
        super(widget, widgetAvailabilityProvider, widgetContentMapper, instrumentsTrendCollectionsInteractor, widgetFiltersProvider);
        Intrinsics.checkNotNullParameter(instrumentsTrendCollectionsInteractor, "instrumentsTrendCollectionsInteractor");
        Intrinsics.checkNotNullParameter(tabbedWidgetInteractor, "tabbedWidgetInteractor");
        Intrinsics.checkNotNullParameter(widget, "widget");
        Intrinsics.checkNotNullParameter(widgetAvailabilityProvider, "widgetAvailabilityProvider");
        Intrinsics.checkNotNullParameter(widgetContentMapper, "widgetContentMapper");
        Intrinsics.checkNotNullParameter(widgetFiltersProvider, "widgetFiltersProvider");
        this.f = tabbedWidgetInteractor;
        this.f280118g = widget;
        this.f280119h = widgetContentMapper;
    }

    @Override // uh7.c
    public final Flow k(String id10, dsh.e config) {
        Flow gVar;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(config, "config");
        nh7.d widget = this.f280118g;
        nh7.c cVarC = widget.c();
        if (cVarC instanceof nh7.a) {
            gVar = new go.g(((nh7.a) cVarC).f215377a, 2);
        } else {
            if (!(cVarC instanceof nh7.b)) {
                throw new NoWhenBranchMatchedException();
            }
            b7h.a aVar = this.f;
            aVar.getClass();
            Intrinsics.checkNotNullParameter(widget, "widget");
            ne0.j jVar = aVar.f13040a;
            String strName = widget.name();
            Object rVar = jVar.get(strName);
            if (rVar == null) {
                rVar = new r(b7h.a.a(widget).b());
                jVar.f(strName, rVar);
            }
            gVar = new tzh.g(rd0.e.b(((r) rVar).c(s.f270018a)), 15);
        }
        return vkm.q.Q(gVar, new mki.d((Continuation) null, this, config, id10, 23));
    }
}
