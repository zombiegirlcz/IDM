package mx0;

import android.content.Context;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.revolut.core.ui_kit.internal.views.UIKitTextView;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class z6 extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f210138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UIKitTextView f210139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final UIKitTextView f210140c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z6(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        setOrientation(1);
        setGravity(17);
        int iK = kli.a.k(context, 16.0f);
        setPaddingRelative(iK, iK, iK, iK);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        ImageView imageView = new ImageView(context);
        imageView.setVisibility(8);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(kli.a.k(context, 16.0f), kli.a.k(context, 16.0f));
        layoutParams.setMarginEnd(kli.a.k(context, 4.0f));
        imageView.setLayoutParams(layoutParams);
        this.f210138a = imageView;
        UIKitTextView uIKitTextView = new UIKitTextView(context, null, R$attr.internal_textAppearanceEmphasis1);
        uIKitTextView.setTextColor(kli.a.s(R$attr.uikit_colorForeground, context));
        uIKitTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.f210139b = uIKitTextView;
        UIKitTextView uIKitTextView2 = new UIKitTextView(context, null, R$attr.internal_textAppearanceEmphasis2);
        uIKitTextView2.setVisibility(8);
        uIKitTextView2.setTextColor(kli.a.s(R$attr.uikit_colorGreyTone50, context));
        uIKitTextView2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        uIKitTextView2.setTextAlignment(4);
        this.f210140c = uIKitTextView2;
        linearLayout.addView(imageView);
        linearLayout.addView(uIKitTextView);
        addView(linearLayout);
        addView(uIKitTextView2);
    }

    public final void a(com.revolut.core.ui_kit.models.b0 content) {
        Intrinsics.checkNotNullParameter(content, "content");
        zi0.c.g(this.f210138a, content.f58048c);
        kli.a.b(this.f210139b, content.f58046a, ty0.f.f275450a);
        kli.a.b(this.f210140c, content.f58047b, ty0.f.f275450a);
    }
}
