package cp0;

import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextSwitcher;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c extends b {
    @Override // cp0.b
    public final void b(View view, SpannableStringBuilder spannableStringBuilder) {
        TextSwitcher view2 = (TextSwitcher) view;
        Intrinsics.checkNotNullParameter(view2, "view");
        view2.setCurrentText(spannableStringBuilder);
    }

    @Override // cp0.b
    public final void e(View view, SpannableStringBuilder spannableStringBuilder) {
        TextSwitcher view2 = (TextSwitcher) view;
        Intrinsics.checkNotNullParameter(view2, "view");
        view2.getCurrentView().setContentDescription(spannableStringBuilder);
    }

    @Override // cp0.b
    public final void f(View view, SpannableStringBuilder spannableStringBuilder) {
        TextSwitcher view2 = (TextSwitcher) view;
        Intrinsics.checkNotNullParameter(view2, "view");
        view2.setText(spannableStringBuilder);
    }
}
