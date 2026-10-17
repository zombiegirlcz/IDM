package com.revolut.core.ui_kit.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowInsets;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$drawable;
import ix0.c2;
import ix0.w0;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mx0.f9;
import mx0.g9;
import mx0.h9;
import mx0.i9;
import mx0.j9;
import mx0.k9;
import mx0.l9;
import mx0.m9;
import mx0.n9;
import mx0.s2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u000eB'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ#\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/revolut/core/ui_kit/views/LoginActionFooterView;", "Landroid/widget/LinearLayout;", "Lix0/w0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/revolut/core/ui_kit/models/Clause;", "text", "", "Lmx0/n9;", "items", "", "setFooterState", "(Lcom/revolut/core/ui_kit/models/Clause;Ljava/util/List;)V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LoginActionFooterView extends LinearLayout implements w0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f58759g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c2 f58760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ihm.f f58761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ifm.b f58762c;
    public List d;
    public final LinearLayout e;
    public final AppCompatTextView f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoginActionFooterView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // ix0.w0, ix0.v0
    public /* bridge */ boolean getInsetsAdjustable() {
        return super.getInsetsAdjustable();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        WindowInsets windowInsetsOnApplyWindowInsets = super.onApplyWindowInsets(this.f58760a.c(insets));
        Intrinsics.checkNotNullExpressionValue(windowInsetsOnApplyWindowInsets, "onApplyWindowInsets(...)");
        return windowInsetsOnApplyWindowInsets;
    }

    public final void setFooterState(@NotNull Clause text, @NotNull List<? extends n9> items) {
        LinearLayout.LayoutParams layoutParams;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(items, "items");
        kli.a.b(this.f, text, ty0.f.f275450a);
        if (Intrinsics.f(this.d, items)) {
            return;
        }
        this.d = items;
        ifm.b bVar = this.f58762c;
        bVar.d();
        LinearLayout linearLayout = this.e;
        linearLayout.removeAllViews();
        int i = 0;
        boolean z = items.size() < 2;
        for (n9 n9Var : items) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            LargeActionButton largeActionButton = new LargeActionButton(context, null, 6, i);
            if (n9Var instanceof f9) {
                largeActionButton.o(LargeActionButton.ButtonStyle.f58732m);
                largeActionButton.setIcon(new ResourceImage(R$drawable.uikit_icn_24_bankid, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
            } else if (n9Var instanceof h9) {
                largeActionButton.o(LargeActionButton.ButtonStyle.f58732m);
                largeActionButton.setIcon(new ResourceImage(R$drawable.uikit_icn_24_envelope, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
            } else if (n9Var instanceof k9) {
                largeActionButton.o(LargeActionButton.ButtonStyle.f58732m);
                largeActionButton.setIcon(new ResourceImage(R$drawable.uikit_icn_24_call, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
            } else if (n9Var instanceof i9) {
                largeActionButton.o(LargeActionButton.ButtonStyle.f58730j);
            } else if (n9Var instanceof j9) {
                largeActionButton.o(LargeActionButton.ButtonStyle.f58732m);
                largeActionButton.setIcon(new ResourceImage(R$drawable.uikit_icn_24_passkey, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
            } else if (n9Var instanceof l9) {
                largeActionButton.o(LargeActionButton.ButtonStyle.f58732m);
                largeActionButton.setIcon(new ResourceImage(R$drawable.uikit_icn_24_qr, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
            } else if (n9Var instanceof g9) {
                largeActionButton.o(LargeActionButton.ButtonStyle.f58732m);
                largeActionButton.setIcon(new ResourceImage(R$drawable.uikit_icn_24_dap, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254));
            } else {
                if (!(n9Var instanceof m9)) {
                    throw new NoWhenBranchMatchedException();
                }
                largeActionButton.o(LargeActionButton.ButtonStyle.k);
            }
            if (z) {
                largeActionButton.setText(n9Var.getText());
            }
            pd.b.p(largeActionButton, n9Var.getText());
            if (z) {
                layoutParams = new LinearLayout.LayoutParams(-1, -2);
            } else {
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                int iK = kli.a.k(context2, 52.0f);
                Context context3 = getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                int iK2 = kli.a.k(context3, 8.0f);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iK, iK);
                layoutParams2.setMargins(iK2, 0, iK2, 0);
                layoutParams = layoutParams2;
            }
            linearLayout.addView(largeActionButton, layoutParams);
            te0.w.j0(bVar, largeActionButton.o.subscribe(new s2(new mt9.c(this, n9Var, 13), 20)));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoginActionFooterView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginActionFooterView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f58760a = new c2(this);
        this.f58761b = v0.a.d("create(...)");
        this.f58762c = new ifm.b();
        View.inflate(context, R$layout.internal_view_login_action_footer, this);
        setOrientation(1);
        View viewFindViewById = findViewById(R$id.loginActionFooterView_separatorContainer).findViewById(R$id.separator_text);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (AppCompatTextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.loginActionFooterView_actionsContainer);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.e = (LinearLayout) viewFindViewById2;
    }

    public /* synthetic */ LoginActionFooterView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
