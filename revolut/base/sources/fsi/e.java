package fsi;

import android.view.View;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kp0.w0;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f137710a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f137711b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BaseDelegatesActivity f137712c;

    public e(BaseDelegatesActivity baseDelegatesActivity) {
        this.f137712c = baseDelegatesActivity;
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(insets, "insets");
        BaseDelegatesActivity.a aVar = BaseDelegatesActivity.Companion;
        List<Fragment> fragments = this.f137712c.getSupportFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        List<Fragment> list = fragments;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (Fragment fragment : list) {
                if (fragment.isVisible() && (fragment instanceof i)) {
                    int iMax = Math.max(this.f137710a, 0);
                    this.f137711b = iMax;
                    view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), iMax);
                    return insets;
                }
            }
        }
        int iSystemBars = WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.ime();
        Insets insets2 = insets.getInsets(iSystemBars);
        Intrinsics.checkNotNullExpressionValue(insets2, "getInsets(...)");
        if (this.f137710a < 0 || this.f137711b != view.getPaddingBottom()) {
            this.f137710a = view.getPaddingBottom();
        }
        int i = this.f137710a + insets2.bottom;
        this.f137711b = i;
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
        WindowInsetsCompat windowInsetsCompatBuild = new WindowInsetsCompat.Builder(insets).setInsets(iSystemBars, w0.G(7, insets2)).build();
        Intrinsics.checkNotNullExpressionValue(windowInsetsCompatBuild, "build(...)");
        return windowInsetsCompatBuild;
    }
}
