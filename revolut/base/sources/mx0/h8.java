package mx0;

import android.content.Context;
import android.text.TextUtils;
import android.widget.LinearLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.internal.drawables.RoundedBackgroundDrawable;
import com.revolut.core.ui_kit.internal.views.UIKitTextView;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class h8 extends LinearLayout {

    @NotNull
    public static final e8 Companion = new e8();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UIKitTextView f209733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UIKitTextView f209734b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h8(Context context, d01.e layoutStyle) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(layoutStyle, "layoutStyle");
        int iK = kli.a.k(context, 16.0f);
        setPaddingRelative(iK, 0, iK, 0);
        setOrientation(1);
        setGravity(17);
        if (layoutStyle.c()) {
            setBackground(new RoundedBackgroundDrawable(context, kli.a.s(R$attr.uikit_colorPopoverBackground, context), true));
        } else {
            setClipToOutline(true);
            setOutlineProvider(new kx0.b());
            setBackgroundColor(kli.a.s(R$attr.uikit_colorPopoverBackground, context));
        }
        UIKitTextView uIKitTextView = new UIKitTextView(context, null, 6, 0);
        uIKitTextView.setId(R$id.keyboardSuggestion_text);
        uIKitTextView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        uIKitTextView.setTextColor(kli.a.s(R$attr.uikit_colorForeground, context));
        uIKitTextView.setGravity(17);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        uIKitTextView.setEllipsize(truncateAt);
        uIKitTextView.setMaxLines(1);
        this.f209733a = uIKitTextView;
        addView(uIKitTextView);
        UIKitTextView uIKitTextView2 = new UIKitTextView(context, null, 6, 0);
        uIKitTextView2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        jb3.l.e(uIKitTextView2, R$attr.internal_textAppearanceBody3);
        uIKitTextView2.setTextColor(kli.a.s(R$attr.uikit_colorForeground, context));
        uIKitTextView2.setGravity(17);
        uIKitTextView2.setEllipsize(truncateAt);
        uIKitTextView2.setMaxLines(1);
        uIKitTextView2.setVisibility(8);
        this.f209734b = uIKitTextView2;
        addView(uIKitTextView2);
    }

    public final void setModel(@NotNull f8 model) {
        Intrinsics.checkNotNullParameter(model, "model");
        d01.f fVar = model.f209701c;
        boolean z = model.d;
        int i = g8.f209718a[fVar.ordinal()];
        UIKitTextView uIKitTextView = this.f209734b;
        UIKitTextView uIKitTextView2 = this.f209733a;
        if (i == 1) {
            uIKitTextView2.setIncludeFontPadding(true);
            jb3.l.e(uIKitTextView2, R$attr.internal_textAppearanceEmphasis2);
            kli.a.b(uIKitTextView, model.f209700b, ty0.f.f275450a);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            uIKitTextView2.setIncludeFontPadding(false);
            jb3.l.e(uIKitTextView2, R$attr.internal_textAppearanceHeading3);
            kli.a.b(uIKitTextView, null, ty0.f.f275450a);
        }
        kli.a.b(uIKitTextView2, model.f209699a, ty0.f.f275450a);
        setEnabled(z);
        float f = z ? 1.0f : 0.4f;
        uIKitTextView2.setAlpha(f);
        uIKitTextView.setAlpha(f);
        or0.u.n(uIKitTextView2, z);
    }
}
