package iu0;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
import com.revolut.core.ui_kit.R$string;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c {
    private c() {
    }

    public static void a(Context context, AccessibilityNodeInfo info, String enteredAmountInfo) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(enteredAmountInfo, "enteredAmountInfo");
        String string = context.getString(R$string.passcode_field_accessibility_label);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        info.setContentDescription(string + " " + ((Object) enteredAmountInfo));
        info.setText(null);
    }
}
