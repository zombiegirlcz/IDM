package cp0;

import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import bp0.y;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class d extends b {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f107767s;

    @Override // cp0.b
    public final void b(View view, SpannableStringBuilder spannableStringBuilder) {
        TextView view2 = (TextView) view;
        Intrinsics.checkNotNullParameter(view2, "view");
        view2.setText(spannableStringBuilder);
    }

    @Override // cp0.b
    public final void e(View view, SpannableStringBuilder spannableStringBuilder) {
        TextView view2 = (TextView) view;
        Intrinsics.checkNotNullParameter(view2, "view");
        view2.setContentDescription(spannableStringBuilder);
    }

    @Override // cp0.b
    public final void f(View view, SpannableStringBuilder spannableStringBuilder) {
        Clause clause;
        TextView view2 = (TextView) view;
        Intrinsics.checkNotNullParameter(view2, "view");
        view2.setText(spannableStringBuilder);
        if (this.f107767s || (clause = this.e) == null || !((y) this.f107756b.b0()).g(clause)) {
            return;
        }
        this.f107767s = true;
        ViewCompat.setAccessibilityDelegate(view2, new oy0.c(view2));
    }
}
