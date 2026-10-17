package tc7;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.foundation.text.selection.SelectionLayout;
import androidx.core.splashscreen.SplashScreen;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.views.navbar.NavBarWithContainer;
import com.revolut.data.model.Data;
import com.revolut.feature.backgroundpicker.impl.flow.theme_customisation_v2.ThemeCustomisationController;
import com.revolut.feature.external_accounts.api.model.Mandate;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import com.revolut.feature.home_feed.impl.widgets.cards.CardsWidgetContext;
import com.revolut.feature.topup_screen.api.google_pay.models.GooglePayFee;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import mx0.dd;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class m0 implements bsh.a, efm.x, kfm.o, OnApplyWindowInsetsListener, SelectionAdjustment, SplashScreen.KeepOnScreenCondition, dd, kfm.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f269755a;

    public /* synthetic */ m0() {
        this.f269755a = 12;
        u13.d dVar = u13.d.f;
    }

    @Override // androidx.compose.foundation.text.selection.SelectionAdjustment
    public Selection adjust(SelectionLayout selectionLayout) {
        switch (this.f269755a) {
            case 7:
                return SelectionAdjustment.Companion.None$lambda$0(selectionLayout);
            case 8:
                return SelectionAdjustment.Companion.Character$lambda$0(selectionLayout);
            case 9:
                return SelectionAdjustment.Companion.Word$lambda$0(selectionLayout);
            case 10:
                return SelectionAdjustment.Companion.Paragraph$lambda$0(selectionLayout);
            default:
                return SelectionAdjustment.Companion.CharacterWithWordAccelerate$lambda$0(selectionLayout);
        }
    }

    @Override // efm.x
    public efm.w apply(efm.r it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        return it8;
    }

    @Override // bsh.a
    public WidgetContext b(WidgetContext widgetContext) {
        HomeFeedWidgetContext.TotalWealth totalWealthContext = (HomeFeedWidgetContext.TotalWealth) widgetContext;
        Set set = n0.f269756a;
        Intrinsics.checkNotNullParameter(totalWealthContext, "totalWealthContext");
        return new CardsWidgetContext(totalWealthContext.getContextKey(), b93.d.ALL);
    }

    @Override // mx0.dd
    public Animator d(View animatedView) {
        switch (this.f269755a) {
            case 26:
                ThemeCustomisationController.a aVar = ThemeCustomisationController.Companion;
                Intrinsics.checkNotNullParameter(animatedView, "animatedView");
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(animatedView, (Property<View, Float>) View.ALPHA, animatedView.getAlpha(), 1.0f), ObjectAnimator.ofFloat(animatedView, (Property<View, Float>) View.TRANSLATION_Y, animatedView.getTranslationY(), BitmapDescriptorFactory.HUE_RED));
                animatorSet.setDuration(300L);
                return animatorSet;
            default:
                ThemeCustomisationController.a aVar2 = ThemeCustomisationController.Companion;
                Intrinsics.checkNotNullParameter(animatedView, "animatedView");
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(ObjectAnimator.ofFloat(animatedView, (Property<View, Float>) View.ALPHA, animatedView.getAlpha(), BitmapDescriptorFactory.HUE_RED), ObjectAnimator.ofFloat(animatedView, (Property<View, Float>) View.TRANSLATION_Y, animatedView.getTranslationY(), r6.b.a(animatedView, "getContext(...)", 16.0f)));
                animatorSet2.setDuration(300L);
                return animatorSet2;
        }
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        NavBarWithContainer.Companion aVar = NavBarWithContainer.INSTANCE;
        Intrinsics.checkNotNullParameter(view, "<unused var>");
        Intrinsics.checkNotNullParameter(windowInsetsCompat, "<unused var>");
        return WindowInsetsCompat.CONSUMED;
    }

    @Override // kfm.p
    public boolean test(Object it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        return it8 instanceof tx0.r;
    }

    public /* synthetic */ m0(int i) {
        this.f269755a = i;
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        switch (this.f269755a) {
            case 2:
                th6.v vVar = th6.v.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Mandate) vVar.invoke(p0);
            case 3:
                th6.u uVar = th6.u.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) uVar.invoke(p0);
            case 4:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 22:
            default:
                Intrinsics.checkNotNullParameter(p0, "it");
                return (tx0.r) p0;
            case 5:
                tw5.d dVar = tw5.d.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (List) dVar.invoke(p0);
            case 12:
                u13.d dVar2 = u13.d.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (d93.d) dVar2.invoke(p0);
            case 13:
                u13.f fVar = u13.f.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (d93.d) fVar.invoke(p0);
            case 14:
                u13.e eVar = u13.e.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (d93.d) eVar.invoke(p0);
            case 15:
                return zi0.c.O((Throwable) p0);
            case 16:
                u21.h hVar = u21.h.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (GooglePayFee) hVar.invoke(p0);
            case 17:
                u21.i iVar = u21.i.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) iVar.invoke(p0);
            case 18:
                Throwable throwable = (Throwable) p0;
                Intrinsics.checkNotNullParameter(throwable, "throwable");
                return zi0.c.O(throwable);
            case 19:
                Throwable it8 = (Throwable) p0;
                Intrinsics.checkNotNullParameter(it8, "it");
                return new Data(null, it8, false, 5, null);
            case 20:
                Throwable it9 = (Throwable) p0;
                Intrinsics.checkNotNullParameter(it9, "it");
                return new Data(null, it9, false, 5, null);
            case 21:
                Throwable it10 = (Throwable) p0;
                Intrinsics.checkNotNullParameter(it10, "it");
                return zi0.c.O(it10);
            case 23:
                u53.a aVar = u53.a.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (Boolean) aVar.invoke(p0);
            case 24:
                uc0.c cVar = uc0.c.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) cVar.invoke(p0);
            case 25:
                ui9.k kVar = ui9.k.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (wi0.b) kVar.invoke(p0);
        }
    }
}
