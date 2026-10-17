package cli;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.OvershootInterpolator;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.revolut.chat.ui.messageslist.MessagesScreen;
import com.revolut.core.ui_kit.internal.views.card_design.CardsEmptyStateView;
import com.revolut.core.ui_kit.internal.views.pincode.DynamicDotsView;
import com.revolut.core.ui_kit.internal.views.pincode.PlaceholderDotsView;
import com.revolut.core.ui_kit.views.ChatInputView;
import com.revolut.core.ui_kit.views.MapView;
import com.revolut.core.ui_kit.views.calendar.CalendarPickerRangeView;
import com.revolut.core.ui_kit.views.status.StatusView;
import com.revolut.feature.corporate_events.impl.ui.screen.details.CorporateEventDetailsController;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.car.confirmation.CarConfirmationScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.car.search.CarSearchScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.date.DateSelectorScreen;
import com.revolut.feature.insurance_car.impl.ui.screen.onboarding.survey.occupation.OccupationScreen;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_page.PlanPageScreen;
import et0.p0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import k50.e2;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.reflect.KProperty;
import n8i.b1;
import rp0.s1;
import yt0.i0;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
public final class u implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f25036b;

    public /* synthetic */ u(Object obj2, int i) {
        this.f25035a = i;
        this.f25036b = obj2;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View v, int i, int i2, int i3, int i5, int i6, int i21, int i22, int i32) {
        RecyclerView.Adapter adapter;
        WindowInsetsCompat windowInsetsCompat;
        View decorView;
        Window window;
        Object obj2 = null;
        int i33 = 0;
        switch (this.f25035a) {
            case 0:
                v.removeOnLayoutChangeListener(this);
                ((v) this.f25036b).f25038b.getState().d = true;
                return;
            case 1:
                Intrinsics.checkNotNullParameter(v, "v");
                co.d dVar = (co.d) this.f25036b;
                RecyclerView recyclerView = dVar.f25480b;
                if (recyclerView == null || !knm.b.n(recyclerView) || (adapter = recyclerView.getAdapter()) == null || adapter.getItemCount() == 0 || !dVar.a(recyclerView)) {
                    return;
                }
                recyclerView.removeOnLayoutChangeListener(this);
                return;
            case 2:
                v.removeOnLayoutChangeListener(this);
                dq0.c cVar = (dq0.c) this.f25036b;
                if (!cVar.f116901h || cVar.i || (windowInsetsCompat = cVar.f) == null) {
                    return;
                }
                cVar.onProgress(windowInsetsCompat, f0.f322471a);
                return;
            case 3:
                v.removeOnLayoutChangeListener(this);
                ((dy0.h) this.f25036b).f120975c = true;
                return;
            case 4:
                v.removeOnLayoutChangeListener(this);
                CorporateEventDetailsController corporateEventDetailsController = (CorporateEventDetailsController) this.f25036b;
                KProperty[] kPropertyArr = CorporateEventDetailsController.T;
                ScreenContentRecyclerView screenCorporateEventDetailRecyclerView = corporateEventDetailsController.d3().d;
                Intrinsics.checkNotNullExpressionValue(screenCorporateEventDetailRecyclerView, "screenCorporateEventDetailRecyclerView");
                knm.b.v(v.getHeight(), screenCorporateEventDetailRecyclerView);
                return;
            case 5:
                v.removeOnLayoutChangeListener(this);
                DynamicDotsView.h((DynamicDotsView) this.f25036b);
                return;
            case 6:
                v.removeOnLayoutChangeListener(this);
                PlaceholderDotsView placeholderDotsView = (PlaceholderDotsView) this.f25036b;
                if (placeholderDotsView.f57457m.isRunning()) {
                    return;
                }
                placeholderDotsView.i = placeholderDotsView.f57454h;
                placeholderDotsView.g();
                placeholderDotsView.f57455j = new iu0.o(placeholderDotsView.e);
                ValueAnimator valueAnimatorC = placeholderDotsView.f57450a.c(new iu0.r(placeholderDotsView, 0), new iu0.r(placeholderDotsView, 1));
                placeholderDotsView.f57457m = valueAnimatorC;
                valueAnimatorC.start();
                return;
            case 7:
                v.removeOnLayoutChangeListener(this);
                MessagesScreen messagesScreen = (MessagesScreen) this.f25036b;
                MessagesScreen.a aVar = MessagesScreen.Companion;
                messagesScreen.f3().f1529m.setOnScrollChangeListener(new e2(messagesScreen));
                return;
            case 8:
                v.removeOnLayoutChangeListener(this);
                ((lki.a) this.f25036b).invoke();
                return;
            case 9:
                v.removeOnLayoutChangeListener(this);
                ChatInputView chatInputView = (ChatInputView) this.f25036b;
                p0 p0Var = chatInputView.f58471w;
                if (p0Var == null) {
                    Intrinsics.r("handsFreePopupView");
                    throw null;
                }
                p0Var.setPivotX(p0Var.getWidth() / 2);
                p0 p0Var2 = chatInputView.f58471w;
                if (p0Var2 == null) {
                    Intrinsics.r("handsFreePopupView");
                    throw null;
                }
                float height = p0Var2.getHeight();
                Intrinsics.checkNotNullExpressionValue(chatInputView.getContext(), "getContext(...)");
                p0Var2.setPivotY(height + kli.a.k(r11, 16.0f));
                p0 p0Var3 = chatInputView.f58471w;
                if (p0Var3 != null) {
                    ChatInputView.A(chatInputView, p0Var3, 300L, new OvershootInterpolator(), 2).alpha(1.0f).scaleX(1.0f).scaleY(1.0f).start();
                    return;
                } else {
                    Intrinsics.r("handsFreePopupView");
                    throw null;
                }
            case 10:
                v.removeOnLayoutChangeListener(this);
                ((MapView) this.f25036b).o.onNext(Unit.f186387a);
                return;
            case 11:
                v.removeOnLayoutChangeListener(this);
                ((ard.t) this.f25036b).invoke(0);
                return;
            case 12:
                v.removeOnLayoutChangeListener(this);
                CarConfirmationScreen carConfirmationScreen = (CarConfirmationScreen) this.f25036b;
                KProperty[] kPropertyArr2 = CarConfirmationScreen.f75547e0;
                ScreenContentRecyclerView buttonWithFooterRecyclerView = carConfirmationScreen.h3().d;
                Intrinsics.checkNotNullExpressionValue(buttonWithFooterRecyclerView, "buttonWithFooterRecyclerView");
                knm.b.v(v.getHeight(), buttonWithFooterRecyclerView);
                return;
            case 13:
                v.removeOnLayoutChangeListener(this);
                ((pq0.c) this.f25036b).F();
                return;
            case 14:
                v.removeOnLayoutChangeListener(this);
                CalendarPickerRangeView calendarPickerRangeView = (CalendarPickerRangeView) this.f25036b;
                z4l.j jVar = calendarPickerRangeView.f59031g;
                List listJ = nkm.y.J(nkm.y.x(nkm.y.n(nkm.y.n(d0.Q(jVar.f319395l), px0.c.f240553a), px0.b.f240552a), new b1(calendarPickerRangeView, 20)));
                RecyclerView.LayoutManager layoutManager = calendarPickerRangeView.getRecyclerView().getLayoutManager();
                if (layoutManager != null) {
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                    IntRange intRange = new IntRange(linearLayoutManager.findFirstVisibleItemPosition(), linearLayoutManager.findLastVisibleItemPosition(), 1);
                    List list = listJ;
                    if ((list instanceof Collection) && list.isEmpty()) {
                        return;
                    }
                    Iterator it8 = list.iterator();
                    while (it8.hasNext()) {
                        int iIntValue = ((Number) it8.next()).intValue();
                        int i43 = intRange.f186448a;
                        if (iIntValue > intRange.f186449b || i43 > iIntValue) {
                            z4l.c cVar2 = jVar.f319395l;
                            ArrayList arrayList = new ArrayList();
                            for (Object obj3 : cVar2) {
                                int i59 = i33 + 1;
                                if (i33 < 0) {
                                    zhm.v.s();
                                    throw null;
                                }
                                Integer numValueOf = ((koi.j) obj3) instanceof tq0.g ? Integer.valueOf(i33) : null;
                                if (numValueOf != null) {
                                    arrayList.add(numValueOf);
                                }
                                i33 = i59;
                            }
                            if (arrayList.isEmpty()) {
                                return;
                            }
                            Integer num = (Integer) d0.p0(list);
                            int iIntValue2 = num != null ? num.intValue() : Integer.MAX_VALUE;
                            Iterator it9 = arrayList.iterator();
                            while (true) {
                                if (it9.hasNext()) {
                                    Object next = it9.next();
                                    if (((Number) next).intValue() > iIntValue2) {
                                        obj2 = next;
                                    }
                                }
                            }
                            Integer num2 = (Integer) obj2;
                            calendarPickerRangeView.getRecyclerView().scrollToPosition(num2 != null ? num2.intValue() : jVar.f319395l.size() - 1);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 15:
                v.removeOnLayoutChangeListener(this);
                s1 s1Var = (s1) this.f25036b;
                ViewGroup viewGroup = s1Var.f256165a;
                StatusView statusView = s1Var.f256166b;
                Activity activityG = s1Var.g();
                if (activityG == null || (window = activityG.getWindow()) == null || (decorView = window.getDecorView()) == null) {
                    decorView = viewGroup;
                }
                View viewA = js0.d.a(s1Var.f256167c, decorView);
                int iC = viewA != null ? rim.d.c(knm.b.h(viewA, viewGroup)) : -1;
                if (iC < 0 || !(s1Var.f(iC) || s1Var.e(iC))) {
                    statusView.setAllowSwipeToDismiss(false);
                    s1.a(s1Var, 17);
                    s1Var.b(0);
                    return;
                } else if (s1Var.f(iC) && s1Var.e(iC)) {
                    statusView.setAllowSwipeToDismiss(false);
                    s1Var.b((iC - rim.d.c(knm.b.h(statusView.getTitleContainer(), statusView))) - (statusView.getTitleContainer().getMeasuredHeight() / 2));
                    return;
                } else if (!s1Var.f(iC)) {
                    statusView.setAllowSwipeToDismiss(false);
                    s1.a(s1Var, 48);
                    s1Var.b(0);
                    return;
                } else {
                    if (s1Var.e(iC)) {
                        return;
                    }
                    s1.a(s1Var, 80);
                    s1Var.b(0);
                    return;
                }
            case 16:
                v.removeOnLayoutChangeListener(this);
                CardsEmptyStateView cardsEmptyStateView = (CardsEmptyStateView) this.f25036b;
                List list2 = CardsEmptyStateView.f56582m;
                cardsEmptyStateView.h();
                return;
            case 17:
                v.removeOnLayoutChangeListener(this);
                CarSearchScreen carSearchScreen = (CarSearchScreen) this.f25036b;
                KProperty[] kPropertyArr3 = CarSearchScreen.c0;
                ScreenContentRecyclerView buttonWithFooterRecyclerView2 = carSearchScreen.h3().d;
                Intrinsics.checkNotNullExpressionValue(buttonWithFooterRecyclerView2, "buttonWithFooterRecyclerView");
                knm.b.v(v.getHeight(), buttonWithFooterRecyclerView2);
                return;
            case 18:
                v.removeOnLayoutChangeListener(this);
                DateSelectorScreen dateSelectorScreen = (DateSelectorScreen) this.f25036b;
                KProperty[] kPropertyArr4 = DateSelectorScreen.c0;
                ScreenContentRecyclerView buttonWithFooterRecyclerView3 = dateSelectorScreen.h3().d;
                Intrinsics.checkNotNullExpressionValue(buttonWithFooterRecyclerView3, "buttonWithFooterRecyclerView");
                knm.b.v(v.getHeight(), buttonWithFooterRecyclerView3);
                return;
            case 19:
                v.removeOnLayoutChangeListener(this);
                OccupationScreen occupationScreen = (OccupationScreen) this.f25036b;
                KProperty[] kPropertyArr5 = OccupationScreen.c0;
                ScreenContentRecyclerView buttonWithFooterRecyclerView4 = occupationScreen.g3().d;
                Intrinsics.checkNotNullExpressionValue(buttonWithFooterRecyclerView4, "buttonWithFooterRecyclerView");
                knm.b.v(v.getHeight(), buttonWithFooterRecyclerView4);
                return;
            case 20:
                v.removeOnLayoutChangeListener(this);
                ymk.o oVarE3 = ((PlanPageScreen) this.f25036b).e3();
                int height2 = v.getHeight();
                com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_page.a aVar2 = (com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_page.a) oVarE3;
                if (height2 > 0) {
                    aVar2.H2(aVar2.f103614x, new wk4.k(height2, 7));
                    return;
                } else {
                    aVar2.getClass();
                    return;
                }
            case 21:
                v.removeOnLayoutChangeListener(this);
                ((yt0.o) this.f25036b).u();
                return;
            case 22:
                v.removeOnLayoutChangeListener(this);
                ((yt0.v) this.f25036b).p();
                return;
            default:
                v.removeOnLayoutChangeListener(this);
                BottomSheetBehavior.from(((i0) this.f25036b).f316561a.getFrame$ui_kit_components_release()).setState(3);
                return;
        }
    }
}
