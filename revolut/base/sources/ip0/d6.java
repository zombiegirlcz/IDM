package ip0;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.revolut.core.ui_kit.delegates.CellDetailsActionListDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsChevronDelegate;
import com.revolut.core.ui_kit.delegates.ChallengeMediumDelegate;
import com.revolut.core.ui_kit.delegates.IconDelegate;
import com.revolut.core.ui_kit.delegates.InputDisclosureDelegate;
import com.revolut.core.ui_kit.delegates.NewsDelegate;
import com.revolut.core.ui_kit.delegates.NotificationCentreItemDelegate;
import com.revolut.core.ui_kit.delegates.ProductSelectionDelegate;
import com.revolut.core.ui_kit.delegates.RectangularButtonDelegate;
import com.revolut.core.ui_kit.delegates.SummaryCardDelegate;
import com.revolut.core.ui_kit.internal.views.floatingbottombar.FloatingBottomTabView;
import com.revolut.core.ui_kit.views.FloatingBottomBarView;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d6 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f163845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TrackableItem f163846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ py0.d f163847c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ d6(TrackableItem trackableItem, py0.d dVar, Object obj2, Object obj3, Object obj4, int i) {
        this.f163845a = i;
        this.f163846b = trackableItem;
        this.f163847c = dVar;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v20, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Drawable drawable;
        int i = this.f163845a;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        py0.d dVar = this.f163847c;
        TrackableItem trackableItem = this.f163846b;
        switch (i) {
            case 0:
                h30.l.w(view, view).a(view, trackableItem, dVar);
                ((c6) obj4).f163686j.b0();
                ((CellDetailsActionListDelegate) obj3).d.onNext((CellDetailsActionListDelegate.Model) obj2);
                break;
            case 1:
                h30.l.w(view, view).a(view, trackableItem, dVar);
                ((x6) obj4).f167098h.b0();
                ((CellDetailsChevronDelegate) obj3).f51821c.onNext((CellDetailsChevronDelegate.Model) obj2);
                break;
            case 2:
                h30.l.w(view, view).a(view, trackableItem, dVar);
                w9 w9Var = (w9) obj4;
                View itemView = w9Var.itemView;
                Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
                py0.f fVarN0 = or0.u.k(itemView).n0();
                View itemView2 = w9Var.itemView;
                Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
                ChallengeMediumDelegate.Model model = (ChallengeMediumDelegate.Model) obj3;
                model.getClass();
                fVarN0.a(itemView2, model, null);
                ((ChallengeMediumDelegate) obj2).d.onNext(model);
                break;
            case 3:
                h30.l.w(view, view).a(view, trackableItem, dVar);
                ((IconDelegate) obj4).f52482c.onNext(new Pair((IconDelegate.Model) obj3, ((com.revolut.core.ui_kit.delegates.g7) obj2).f54204l));
                break;
            case 4:
                h30.l.w(view, view).a(view, trackableItem, dVar);
                ((oq) obj4).f165704h.b0();
                ((InputDisclosureDelegate) obj3).f52538c.onNext((InputDisclosureDelegate.Model) obj2);
                break;
            case 5:
                h30.l.w(view, view).a(view, trackableItem, dVar);
                ((com.revolut.core.ui_kit.delegates.w9) obj4).v.b0();
                ((ihm.f) obj3).onNext((NewsDelegate.Model) obj2);
                break;
            case 6:
                h30.l.w(view, view).a(view, trackableItem, (py0.c) dVar);
                NotificationCentreItemDelegate.Model model2 = (NotificationCentreItemDelegate.Model) obj3;
                ((NotificationCentreItemDelegate) obj4).f52865c.onNext(new az(model2.f52866a, (yy) obj2, model2.f52872l));
                break;
            case 7:
                h30.l.w(view, view).a(view, trackableItem, dVar);
                ((t20) obj4).f166425l.b0();
                ((ProductSelectionDelegate) obj3).f52972c.onNext((ProductSelectionDelegate.Model) obj2);
                break;
            case 8:
                h30.l.w(view, view).a(view, trackableItem, (py0.c) dVar);
                ((y90) obj4).i.b0();
                ((RectangularButtonDelegate) obj3).f53149c.onNext((RectangularButtonDelegate.Model) obj2);
                break;
            case 9:
                h30.l.w(view, view).a(view, trackableItem, dVar);
                ((com.revolut.core.ui_kit.delegates.uh) obj4).invoke(new com.revolut.core.ui_kit.delegates.qh((SummaryCardDelegate.Model) obj3, (com.revolut.core.ui_kit.delegates.rh) obj2));
                break;
            default:
                h30.l.w(view, view).a(view, (FloatingBottomTabView.DisplayedItemModel) trackableItem, dVar);
                FloatingBottomBarView floatingBottomBarView = (FloatingBottomBarView) obj4;
                FloatingBottomBarView.Companion companion = FloatingBottomBarView.INSTANCE;
                floatingBottomBarView.p();
                if (!((Boolean) jo0.g.J.getValue()).booleanValue() && (drawable = ((FloatingBottomTabView) obj3).f57038h.getDrawable()) != null) {
                    i26.l.s(drawable);
                }
                floatingBottomBarView.q(((FloatingBottomTabView.DisplayedItemModel) obj2).f57043a, true, false, ((Boolean) jo0.g.J.getValue()).booleanValue());
                break;
        }
    }
}
