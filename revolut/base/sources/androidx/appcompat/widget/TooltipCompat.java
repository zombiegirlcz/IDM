package androidx.appcompat.widget;

import android.view.View;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes13.dex */
public abstract class TooltipCompat {

    public static class Api26Impl {
        public static void setTooltipText(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    public static void setTooltipText(@NonNull View view, CharSequence charSequence) {
        Api26Impl.setTooltipText(view, charSequence);
    }
}
