package fl;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;

/* JADX INFO: loaded from: classes17.dex */
public final class a implements ViewBinding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f135873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f135874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f135875c;

    public a(ConstraintLayout constraintLayout, TextView textView, TextView textView2) {
        this.f135873a = constraintLayout;
        this.f135874b = textView;
        this.f135875c = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public final View getRoot() {
        return this.f135873a;
    }
}
