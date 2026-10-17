package mx0;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.revolut.core.ui_kit.internal.views.UIKitTextView;
import com.revolut.core.ui_kit.models.ProfileCardModel;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class ub extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UIKitTextView f210033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.revolut.core.ui_kit.models.r f210034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ProfileCardModel f210035c;
    public v9 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ub(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        UIKitTextView uIKitTextView = new UIKitTextView(context, null, R$attr.internal_textAppearanceBody2);
        uIKitTextView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        uIKitTextView.setTextColor(kli.a.s(R$attr.uikit_colorForeground, context));
        uIKitTextView.setGravity(1);
        uIKitTextView.setMaxLines(2);
        uIKitTextView.setEllipsize(TextUtils.TruncateAt.END);
        this.f210033a = uIKitTextView;
        addView(uIKitTextView);
    }
}
