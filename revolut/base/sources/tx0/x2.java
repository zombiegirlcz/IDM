package tx0;

import android.content.Context;
import android.view.ViewGroup;
import com.google.android.material.appbar.AppBarLayout;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public interface x2 {
    void H(int i);

    default ViewGroup.LayoutParams N(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new AppBarLayout.LayoutParams(-1, w(context) + d5.b(context));
    }

    void d(float f, int i);

    void d0(int i);

    default int n(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return 0;
    }

    void setBackgroundOffset(int i);

    void setColorSchemeListener(u2 u2Var);

    default int w(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return d5.c(context);
    }
}
