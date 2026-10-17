package ke7;

import android.view.View;
import android.widget.Chronometer;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBindings;
import com.revolut.core.ui_kit.views.CallHaloAvatarView;
import com.revolut.core.ui_kit.views.CircleActionButtonsBarView;
import com.revolut.feature.in_app_calls.R$id;
import com.revolut.kompot.view.ControllerContainerFrameLayout;
import com.revolut.rxdiffadapter.AsyncDiffRecyclerView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class b extends kotlin.jvm.internal.q implements Function1 {
    public static final b f = new b();

    public b() {
        super(1, ce7.a.class, "bind", "bind(Landroid/view/View;)Lcom/revolut/feature/in_app_calls/databinding/LayoutCallInProgressBinding;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        View p0 = (View) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        int i = R$id.inProgress;
        View viewFindChildViewById = ViewBindings.findChildViewById(p0, i);
        if (viewFindChildViewById != null) {
            int i2 = R$id.actionsBar;
            CircleActionButtonsBarView circleActionButtonsBarView = (CircleActionButtonsBarView) ViewBindings.findChildViewById(viewFindChildViewById, i2);
            if (circleActionButtonsBarView != null) {
                i2 = R$id.avatar;
                CallHaloAvatarView callHaloAvatarView = (CallHaloAvatarView) ViewBindings.findChildViewById(viewFindChildViewById, i2);
                if (callHaloAvatarView != null) {
                    i2 = R$id.callTime;
                    Chronometer chronometer = (Chronometer) ViewBindings.findChildViewById(viewFindChildViewById, i2);
                    if (chronometer != null) {
                        i2 = R$id.navigationButton;
                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(viewFindChildViewById, i2);
                        if (imageView != null) {
                            i2 = R$id.ringingSubtitle;
                            if (((TextView) ViewBindings.findChildViewById(viewFindChildViewById, i2)) != null) {
                                i2 = R$id.tvAgentDescription;
                                TextView textView = (TextView) ViewBindings.findChildViewById(viewFindChildViewById, i2);
                                if (textView != null) {
                                    i2 = R$id.tvAgentName;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(viewFindChildViewById, i2);
                                    if (textView2 != null) {
                                        ce7.b bVar = new ce7.b((ConstraintLayout) viewFindChildViewById, circleActionButtonsBarView, callHaloAvatarView, chronometer, imageView, textView, textView2);
                                        i = R$id.recyclerView;
                                        if (((AsyncDiffRecyclerView) ViewBindings.findChildViewById(p0, i)) != null) {
                                            return new ce7.a((ControllerContainerFrameLayout) p0, bVar);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(viewFindChildViewById.getResources().getResourceName(i2)));
        }
        throw new NullPointerException("Missing required view with ID: ".concat(p0.getResources().getResourceName(i)));
    }
}
