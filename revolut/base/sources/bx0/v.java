package bx0;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.util.Property;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.internal.dialogs.BottomExpandableDialogView;
import com.revolut.core.ui_kit.internal.views.dual_amount.AmountForDualEditView;
import com.revolut.core.ui_kit.internal.views.pincode.DynamicDotsView;
import com.revolut.core.ui_kit.storiesdelegates.StickerStoriesPageDelegate;
import com.revolut.core.ui_kit.views.ChatInputView;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.feature.shared.help_centre.impl.faq.screens.ai_search.v2.AskAiScreen;
import com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.list.TripsListController;
import com.revolut.feature.wealth.analytics.ui.widgetised.performance.WidgetisedAnalyticsPerformanceScreen;
import com.revolut.feature.wealth.analytics.ui.widgetised.pnl.WidgetisedAnalyticsPnLScreen;
import com.revolut.feature.wealth.analytics.ui.widgetised.total_value.WidgetisedAnalyticsTotalValueScreen;
import ip0.zh0;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import zhm.f0;

/* JADX INFO: loaded from: classes19.dex */
public final class v implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f19467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f19468c;

    public /* synthetic */ v(Object obj2, Object obj3, int i) {
        this.f19466a = i;
        this.f19467b = obj2;
        this.f19468c = obj3;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i5, int i6, int i21, int i22, int i32) throws IOException {
        int i33 = this.f19466a;
        Object obj2 = this.f19468c;
        Object obj3 = this.f19467b;
        switch (i33) {
            case 0:
                view.removeOnLayoutChangeListener(this);
                ((StickerStoriesPageDelegate) obj3).u((u) obj2);
                return;
            case 1:
                view.removeOnLayoutChangeListener(this);
                NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) obj3;
                ViewGroup.LayoutParams layoutParams = navBarWithToolbar.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                KProperty[] kPropertyArr = WidgetisedAnalyticsPnLScreen.Y;
                navBarWithToolbar.setMinimumHeight(((WidgetisedAnalyticsPnLScreen) obj2).d3().f174539b.getHeight());
                navBarWithToolbar.setLayoutParams(layoutParams);
                return;
            case 2:
                view.removeOnLayoutChangeListener(this);
                ((cr0.d) obj3).invoke(((BottomExpandableDialogView) obj2).getState());
                return;
            case 3:
                view.removeOnLayoutChangeListener(this);
                View view2 = (View) obj3;
                int i43 = view2.getResources().getDisplayMetrics().heightPixels;
                Context context = view2.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                int iO = kli.a.o(context);
                int iA = com.google.android.gms.internal.mlkit_vision_face.a.a(view2, "getContext(...)", 56.0f);
                Context context2 = view2.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                int iMax = Math.max(i43 - ((View) obj2).getHeight(), kli.a.k(context2, 204.0f) + iA + iO);
                ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                if (layoutParams2.height != iMax) {
                    layoutParams2.height = iMax;
                    view2.setLayoutParams(layoutParams2);
                    view2.requestLayout();
                    return;
                }
                return;
            case 4:
                view.removeOnLayoutChangeListener(this);
                View view3 = (View) obj3;
                float f = view3.getResources().getDisplayMetrics().heightPixels / 2.0f;
                float height = view3.getHeight() / 2.0f;
                view3.setTranslationY((com.google.android.gms.internal.mlkit_vision_face.a.a(view3, "getContext(...)", 64.0f) + f) - height);
                view3.animate().translationY(f - height).alpha(1.0f).setDuration(800L).withEndAction(new ag.q((Function0) obj2)).start();
                return;
            case 5:
                View view4 = (View) obj3;
                if (view4.getVisibility() == 0) {
                    ((es0.d0) obj2).e(view4);
                    return;
                }
                return;
            case 6:
                view.removeOnLayoutChangeListener(this);
                NavBarWithToolbar navBarWithToolbar2 = (NavBarWithToolbar) obj3;
                ViewGroup.LayoutParams layoutParams3 = navBarWithToolbar2.getLayoutParams();
                if (layoutParams3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                KProperty[] kPropertyArr2 = WidgetisedAnalyticsTotalValueScreen.X;
                navBarWithToolbar2.setMinimumHeight(((WidgetisedAnalyticsTotalValueScreen) obj2).d3().f174539b.getHeight());
                navBarWithToolbar2.setLayoutParams(layoutParams3);
                return;
            case 7:
                view.removeOnLayoutChangeListener(this);
                SwipeToActionDelegate.Companion companion = SwipeToActionDelegate.INSTANCE;
                ((SwipeToActionDelegate) obj3).w((zh0) obj2);
                return;
            case 8:
                view.removeOnLayoutChangeListener(this);
                ((DynamicDotsView) obj3).setDotsSelectedInternal((Integer) obj2);
                return;
            case 9:
                view.removeOnLayoutChangeListener(this);
                Rect rect = new Rect();
                View view5 = (View) obj3;
                view5.getHitRect(rect);
                Context context3 = view5.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                int iK = kli.a.k(context3, 16.0f);
                if (view5.getLayoutDirection() == 1) {
                    rect.left -= iK;
                } else {
                    rect.right += iK;
                }
                rect.top -= iK;
                ((AmountForDualEditView) obj2).getOrCreateCompositeTouchDelegate().a("inputContainer", new TouchDelegate(rect, view5));
                return;
            case 10:
                view.removeOnLayoutChangeListener(this);
                Rect rect2 = new Rect();
                FrameLayout frameLayout = (FrameLayout) obj3;
                frameLayout.getHitRect(rect2);
                int i59 = rect2.right;
                Context context4 = frameLayout.getContext();
                Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
                rect2.right = kli.a.k(context4, 16.0f) + i59;
                int i66 = rect2.top;
                Context context5 = frameLayout.getContext();
                Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
                rect2.top = i66 - kli.a.k(context5, 16.0f);
                TouchDelegate touchDelegate = new TouchDelegate(rect2, frameLayout);
                View view6 = (View) obj2;
                TouchDelegate touchDelegate2 = view6.getTouchDelegate();
                xv0.c cVar = touchDelegate2 instanceof xv0.c ? (xv0.c) touchDelegate2 : null;
                if (cVar != null) {
                    cVar.a("inputContainer", touchDelegate);
                    return;
                }
                xv0.c cVar2 = new xv0.c(frameLayout);
                cVar2.a("inputContainer", touchDelegate);
                view6.setTouchDelegate(cVar2);
                return;
            case 11:
                WebView webView = (WebView) obj2;
                view.removeOnLayoutChangeListener(this);
                TripsListController tripsListController = (TripsListController) obj3;
                String str = tripsListController.Z;
                if (str == null) {
                    return;
                }
                qod.d dVar = qod.d.HIGH;
                List list = tripsListController.Y;
                if (list == null) {
                    list = f0.f322471a;
                }
                Boolean bool = tripsListController.f87633a0;
                ngm.n.s(webView, new qod.c(dVar, list, str, bool != null ? bool.booleanValue() : false, Integer.valueOf(TripsListController.d3(tripsListController))));
                return;
            case 12:
                view.removeOnLayoutChangeListener(this);
                com.revolut.core.ui_kit.delegates.widgets.v.H((View) obj2, (com.revolut.core.ui_kit.delegates.widgets.v) obj3);
                return;
            case 13:
                view.removeOnLayoutChangeListener(this);
                rp0.o oVar = (rp0.o) obj3;
                if (oVar.f256141n) {
                    view.post(oVar.k);
                    view.post(new r8.d(3, oVar, z, (rp0.y) obj2));
                    return;
                }
                return;
            case 14:
                view.removeOnLayoutChangeListener(this);
                NavBarWithToolbar navBarWithToolbar3 = (NavBarWithToolbar) obj3;
                ViewGroup.LayoutParams layoutParams4 = navBarWithToolbar3.getLayoutParams();
                if (layoutParams4 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                KProperty[] kPropertyArr3 = WidgetisedAnalyticsPerformanceScreen.X;
                navBarWithToolbar3.setMinimumHeight(((WidgetisedAnalyticsPerformanceScreen) obj2).d3().f174539b.getHeight());
                navBarWithToolbar3.setLayoutParams(layoutParams4);
                return;
            case 15:
                view.removeOnLayoutChangeListener(this);
                KProperty[] kPropertyArr4 = AskAiScreen.j0;
                RecyclerView recyclerViewH = ((AskAiScreen) obj3).h();
                ChatInputView chatInputView = (ChatInputView) obj2;
                ViewGroup.LayoutParams layoutParams5 = chatInputView.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams5 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams5 : null;
                knm.b.v(chatInputView.getHeight() + (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0), recyclerViewH);
                return;
            case 16:
                view.removeOnLayoutChangeListener(this);
                ((yt0.o) obj3).y(true, (lki.s) obj2);
                return;
            default:
                view.removeOnLayoutChangeListener(this);
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, view.getHeight(), BitmapDescriptorFactory.HUE_RED);
                Intrinsics.checkNotNullExpressionValue(objectAnimatorOfFloat, "ofFloat(...)");
                ((yt0.d0) obj3).m(objectAnimatorOfFloat, 300L, (lki.s) obj2);
                return;
        }
    }

    public v(es0.d0 d0Var, View view) {
        this.f19466a = 5;
        this.f19467b = view;
        this.f19468c = d0Var;
    }
}
