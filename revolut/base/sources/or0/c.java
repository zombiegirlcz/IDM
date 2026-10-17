package or0;

import android.view.View;
import android.view.WindowInsets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import au0.x4;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class c implements OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f228006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f228007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f228008c;
    public WindowInsets d;
    public x4 e;

    public c(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f228006a = view;
        this.f228007b = new ArrayList();
        this.f228008c = new ArrayList();
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public final WindowInsetsCompat onApplyWindowInsets(View v, WindowInsetsCompat insets) {
        Intrinsics.checkNotNullParameter(v, "v");
        Intrinsics.checkNotNullParameter(insets, "insets");
        Iterator it8 = this.f228007b.iterator();
        while (it8.hasNext()) {
            insets = (WindowInsetsCompat) ((Function1) it8.next()).invoke(insets);
        }
        WindowInsets windowInsets = insets.toWindowInsets();
        if (windowInsets == null) {
            return insets;
        }
        this.d = windowInsets;
        Iterator it9 = this.f228008c.iterator();
        while (it9.hasNext()) {
            ((Function1) it9.next()).invoke(windowInsets);
        }
        WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(v.onApplyWindowInsets(windowInsets));
        Intrinsics.checkNotNullExpressionValue(windowInsetsCompat, "toWindowInsetsCompat(...)");
        return windowInsetsCompat;
    }
}
