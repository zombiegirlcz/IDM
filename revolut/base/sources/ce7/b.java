package ce7;

import android.view.View;
import android.widget.Chronometer;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.revolut.core.ui_kit.views.CallHaloAvatarView;
import com.revolut.core.ui_kit.views.CircleActionButtonsBarView;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f23399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CircleActionButtonsBarView f23400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CallHaloAvatarView f23401c;
    public final Chronometer d;
    public final ImageView e;
    public final TextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f23402g;

    public b(ConstraintLayout constraintLayout, CircleActionButtonsBarView circleActionButtonsBarView, CallHaloAvatarView callHaloAvatarView, Chronometer chronometer, ImageView imageView, TextView textView, TextView textView2) {
        this.f23399a = constraintLayout;
        this.f23400b = circleActionButtonsBarView;
        this.f23401c = callHaloAvatarView;
        this.d = chronometer;
        this.e = imageView;
        this.f = textView;
        this.f23402g = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f23399a;
    }
}
