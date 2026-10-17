package r40;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBindings;
import com.revolut.chat_core.R$id;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.core_ui_custom_font.TypefaceTextView;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class x extends kotlin.jvm.internal.q implements Function1 {
    public static final x f = new x();

    public x() {
        super(1, a60.c.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/chat_core/databinding/ScreenChatListBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.navBarWithToolbar;
        NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) ViewBindings.findChildViewById(p0, i);
        if (navBarWithToolbar != null) {
            i = R$id.newBtnSubtitle;
            TypefaceTextView typefaceTextView = (TypefaceTextView) ViewBindings.findChildViewById(p0, i);
            if (typefaceTextView != null) {
                i = R$id.newChatBtn;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(p0, i);
                if (imageView != null) {
                    i = R$id.newChatContainer;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(p0, i);
                    if (linearLayout != null) {
                        i = R$id.recyclerView;
                        if (((ScreenContentRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                            return new a60.c((ControllerContainerCoordinatorLayout) p0, navBarWithToolbar, typefaceTextView, imageView, linearLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
