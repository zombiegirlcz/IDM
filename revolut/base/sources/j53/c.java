package j53;

import android.view.View;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.revolut.core.ui_kit.background.AnimatedBackgroundView;
import com.revolut.core.ui_kit.views.ChatInputView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.ScrollingPagerIndicatorView;
import com.revolut.core.ui_kit.views.navbar.NavBarBottomSheet;
import com.revolut.feature.card_personalisation.generation.impl.R$id;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import com.revolut.rxdiffadapter.AsyncDiffRecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class c extends kotlin.jvm.internal.q implements Function1 {
    public static final c f = new c();

    public c() {
        super(1, c53.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/card_personalisation/generation/impl/databinding/ScreenCustomisationImageGenerationBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.customisationImageGenerationScreen_animatedBackground;
        AnimatedBackgroundView animatedBackgroundView = (AnimatedBackgroundView) ViewBindings.findChildViewById(p0, i);
        if (animatedBackgroundView != null) {
            i = R$id.customisationImageGenerationScreen_buttonsLayout;
            if (((LinearLayout) ViewBindings.findChildViewById(p0, i)) != null) {
                ControllerContainerConstraintLayout controllerContainerConstraintLayout = (ControllerContainerConstraintLayout) p0;
                i = R$id.customisationImageGenerationScreen_firstButton;
                LargeActionButton largeActionButton = (LargeActionButton) ViewBindings.findChildViewById(p0, i);
                if (largeActionButton != null) {
                    i = R$id.customisationImageGenerationScreen_inputView;
                    ChatInputView chatInputView = (ChatInputView) ViewBindings.findChildViewById(p0, i);
                    if (chatInputView != null) {
                        i = R$id.customisationImageGenerationScreen_navBar;
                        NavBarBottomSheet navBarBottomSheet = (NavBarBottomSheet) ViewBindings.findChildViewById(p0, i);
                        if (navBarBottomSheet != null) {
                            i = R$id.customisationImageGenerationScreen_pager;
                            ViewPager2 viewPager2 = (ViewPager2) ViewBindings.findChildViewById(p0, i);
                            if (viewPager2 != null) {
                                i = R$id.customisationImageGenerationScreen_pagerIndicator;
                                ScrollingPagerIndicatorView scrollingPagerIndicatorView = (ScrollingPagerIndicatorView) ViewBindings.findChildViewById(p0, i);
                                if (scrollingPagerIndicatorView != null) {
                                    i = R$id.customisationImageGenerationScreen_recyclerView;
                                    if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                                        i = R$id.customisationImageGenerationScreen_secondButton;
                                        LargeActionButton largeActionButton2 = (LargeActionButton) ViewBindings.findChildViewById(p0, i);
                                        if (largeActionButton2 != null) {
                                            i = R$id.customisationImageGenerationScreen_stopButton;
                                            LargeActionButton largeActionButton3 = (LargeActionButton) ViewBindings.findChildViewById(p0, i);
                                            if (largeActionButton3 != null) {
                                                i = R$id.customisationImageGenerationScreen_suggestionsRecyclerView;
                                                AsyncDiffRecyclerView asyncDiffRecyclerView = (AsyncDiffRecyclerView) ViewBindings.findChildViewById(p0, i);
                                                if (asyncDiffRecyclerView != null) {
                                                    return new c53.a(controllerContainerConstraintLayout, animatedBackgroundView, largeActionButton, chatInputView, navBarBottomSheet, viewPager2, scrollingPagerIndicatorView, largeActionButton2, largeActionButton3, asyncDiffRecyclerView);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
