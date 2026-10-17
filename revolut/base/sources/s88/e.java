package s88;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.q0;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import dsh.o;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e implements kfm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f260934a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f260935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ HomeFeedWidgetContext.Junior f260936c;
    public final /* synthetic */ BaseDraggableWidgetDelegate.a d;

    public /* synthetic */ e(f fVar, BaseDraggableWidgetDelegate.a aVar, HomeFeedWidgetContext.Junior junior) {
        this.f260935b = fVar;
        this.d = aVar;
        this.f260936c = junior;
    }

    @Override // kfm.a
    public final void run() {
        switch (this.f260934a) {
            case 0:
                this.f260935b.f260938b.a(new o(this.f260936c, ((q0) this.d).f55476b));
                break;
            default:
                this.f260935b.f260937a.b(new fc7.c("JuniorPartnershipsMedium", this.f260936c, this.d));
                break;
        }
    }

    public /* synthetic */ e(f fVar, HomeFeedWidgetContext.Junior junior, BaseDraggableWidgetDelegate.a aVar) {
        this.f260935b = fVar;
        this.f260936c = junior;
        this.d = aVar;
    }
}
