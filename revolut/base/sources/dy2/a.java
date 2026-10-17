package dy2;

import android.view.View;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.internal.views.tag.TagView;
import com.revolut.core.ui_kit.views.FooterTextView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.kompot.view.ControllerContainerConstraintLayout;
import com.revolut.ui_kit.card_scene.CardDesignProxyCarouselView;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ControllerContainerConstraintLayout f121050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CardDesignProxyCarouselView f121051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FooterTextView f121052c;
    public final LargeActionButton d;
    public final BasicNavBar e;
    public final TagView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SmallActionButton f121053g;

    public a(ControllerContainerConstraintLayout controllerContainerConstraintLayout, CardDesignProxyCarouselView cardDesignProxyCarouselView, FooterTextView footerTextView, LargeActionButton largeActionButton, BasicNavBar basicNavBar, TagView tagView, SmallActionButton smallActionButton) {
        this.f121050a = controllerContainerConstraintLayout;
        this.f121051b = cardDesignProxyCarouselView;
        this.f121052c = footerTextView;
        this.d = largeActionButton;
        this.e = basicNavBar;
        this.f = tagView;
        this.f121053g = smallActionButton;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f121050a;
    }
}
