package wx0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.click.animator.ripple.UIKitRippleDrawable;
import com.revolut.core.ui_kit.internal.views.UIKitTextView;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.FloatingBottomBarView;
import com.revolut.core.ui_kit_resources.R$attr;
import com.youTransactor.uCube.rpc.Constants;
import dr0.l;
import efm.r;
import et0.f0;
import fp0.m;
import fp0.p;
import kotlin.jvm.internal.Intrinsics;
import or0.u;
import org.jetbrains.annotations.NotNull;
import wx0.g;

/* JADX INFO: loaded from: classes20.dex */
public final class f extends LinearLayout implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppCompatImageView f300719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UIKitTextView f300720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f300721c;
    public final p d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f300721c = v0.a.d("create(...)");
        m mVar = p.Companion;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        Color.Solid solid = new Color.Solid(R$attr.uikit_colorSelectableItemBackground);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        GradientDrawable gradientDrawableH = l.h(context3, 16.0f, new Color.Solid(R$attr.uikit_colorWidgetBackground), 0, null);
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        UIKitRippleDrawable uIKitRippleDrawableE = l.e(context2, solid, gradientDrawableH, l.h(context4, 16.0f, new Color.SolidInt(-16777216), 0, null), 8);
        g.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        gp0.h hVar = new gp0.h(new hp0.d(uIKitRippleDrawableE, l.h(context, 16.0f, new Color.SolidInt(-16777216), 0, null), 11), new gp0.f((gp0.c) null, 3), fp0.b.f137017a);
        mVar.getClass();
        this.d = m.a(this, hVar);
        setOrientation(0);
        setGravity(16);
        int iK = kli.a.k(context, 16.0f);
        int iK2 = kli.a.k(context, 12.0f);
        setPaddingRelative(iK, iK2, iK, iK2);
        ColorStateList colorStateListA = g.a.a(context);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setLayoutParams(new LinearLayout.LayoutParams(kli.a.k(context, 24.0f), kli.a.k(context, 24.0f)));
        appCompatImageView.setImageTintList(colorStateListA);
        this.f300719a = appCompatImageView;
        addView(appCompatImageView);
        UIKitTextView uIKitTextView = new UIKitTextView(context, null, 6, 0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams.setMarginStart(kli.a.k(context, 24.0f));
        uIKitTextView.setLayoutParams(layoutParams);
        uIKitTextView.setTextAlignment(5);
        uIKitTextView.setEllipsize(TextUtils.TruncateAt.END);
        uIKitTextView.setMaxLines(1);
        uIKitTextView.setIncludeFontPadding(false);
        uIKitTextView.setAutoSizeTextTypeUniformWithConfiguration(8, 16, 1, 2);
        uIKitTextView.setTextColor(colorStateListA);
        jb3.l.e(uIKitTextView, R$attr.internal_textAppearanceEmphasis1);
        this.f300720b = uIKitTextView;
        addView(uIKitTextView);
        setOnLongClickListener(new f0(this, 6));
    }

    @Override // mx0.z4
    public final r a() {
        r rVarHide = this.f300721c.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
        return rVarHide;
    }

    @Override // android.view.View
    public final boolean performClick() {
        Drawable drawable = this.f300719a.getDrawable();
        if (drawable != null) {
            i26.l.s(drawable);
        }
        return super.performClick();
    }

    @Override // wx0.c
    @NotNull
    public ImageView getIconView() {
        return this.f300719a;
    }

    @Override // mx0.z4
    public void setModel(@NotNull FloatingBottomBarView.Item model) {
        Intrinsics.checkNotNullParameter(model, "model");
        setTag(model.f58588a);
        ty0.c cVarB0 = u.k(this).b0();
        TextLocalisedClause textLocalisedClause = model.f58589b;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        setContentDescription(ty0.c.a(cVarB0, textLocalisedClause, context, null, null, null, null, Constants.TAG_FC_SPEED_MODE));
        yy0.f.e(u.k(this).Q(), model.f58590c, this.f300719a, null, null, 12);
        ty0.c.b(u.k(this).b0(), textLocalisedClause, this.f300720b, null, null, 12);
        py0.c cVar = new py0.c(textLocalisedClause);
        p pVar = this.d;
        p.b(pVar, true);
        View view = pVar.f137029a;
        or0.m.a(view);
        view.setOnClickListener(new d(model, 1, cVar, this));
    }
}
