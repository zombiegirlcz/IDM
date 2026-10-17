package wx0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import com.revolut.core.ui.models.Color;
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
import ny0.i;
import or0.u;
import org.jetbrains.annotations.NotNull;
import wvg.d0;
import wx0.g;

/* JADX INFO: loaded from: classes20.dex */
public final class e extends LinearLayout implements c {
    public static final /* synthetic */ int f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppCompatImageView f300716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UIKitTextView f300717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public GradientDrawable f300718c;
    public final ihm.f d;
    public final p e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.d = v0.a.d("create(...)");
        m mVar = p.Companion;
        g.Companion.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        gp0.h hVar = new gp0.h(new hp0.c(null, l.h(context, 12.0f, new Color.SolidInt(-16777216), 0, null), 1), new gp0.f((gp0.c) null, 3), fp0.b.f137017a);
        mVar.getClass();
        this.e = m.a(this, hVar);
        setOrientation(1);
        setGravity(17);
        c();
        ColorStateList colorStateListA = g.a.a(context);
        int iK = kli.a.k(context, 6.0f);
        AppCompatImageView appCompatImageView = new AppCompatImageView(context);
        appCompatImageView.setLayoutParams(new LinearLayout.LayoutParams(kli.a.k(context, 36.0f), kli.a.k(context, 36.0f)));
        appCompatImageView.setPadding(iK, iK, iK, iK);
        appCompatImageView.setImageTintList(colorStateListA);
        this.f300716a = appCompatImageView;
        addView(appCompatImageView);
        UIKitTextView uIKitTextView = new UIKitTextView(context, null, 6, 0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = kli.a.k(context, 4.0f);
        uIKitTextView.setLayoutParams(layoutParams);
        uIKitTextView.setGravity(17);
        uIKitTextView.setEllipsize(TextUtils.TruncateAt.END);
        uIKitTextView.setMaxLines(1);
        uIKitTextView.setIncludeFontPadding(false);
        uIKitTextView.setAutoSizeTextTypeUniformWithConfiguration(8, 14, 1, 2);
        uIKitTextView.setTextColor(colorStateListA);
        jb3.l.e(uIKitTextView, R$attr.internal_textAppearanceEmphasis4);
        this.f300717b = uIKitTextView;
        addView(uIKitTextView);
        b();
        c8g.a.a(this, ny0.a.f220589a, new d0(this, 11));
        setOnLongClickListener(new f0(this, 5));
    }

    @Override // mx0.z4
    public final r a() {
        r rVarHide = this.d.hide();
        Intrinsics.checkNotNullExpressionValue(rVarHide, "hide(...)");
        return rVarHide;
    }

    public final void b() {
        boolean zIsSelected = isSelected();
        AppCompatImageView appCompatImageView = this.f300716a;
        if (!zIsSelected) {
            appCompatImageView.setBackground(null);
            return;
        }
        GradientDrawable gradientDrawableH = this.f300718c;
        if (gradientDrawableH == null) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            gradientDrawableH = l.h(context, 12.0f, new Color.Solid(R$attr.uikit_colorWidgetBackground), 0, null);
            this.f300718c = gradientDrawableH;
        }
        appCompatImageView.setBackground(gradientDrawableH);
    }

    public final void c() {
        Context context;
        float f4;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        if (i.c(context2)) {
            context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            f4 = 2.0f;
        } else {
            context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            f4 = 8.0f;
        }
        int iK = kli.a.k(context, f4);
        setPaddingRelative(0, iK, 0, iK);
    }

    @Override // wx0.c
    @NotNull
    public View getIconView() {
        return this.f300716a;
    }

    @Override // android.view.View
    public final boolean performClick() {
        Drawable drawable = this.f300716a.getDrawable();
        if (drawable != null) {
            i26.l.s(drawable);
        }
        return super.performClick();
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        boolean zIsSelected = isSelected();
        super.setSelected(z);
        if (zIsSelected != isSelected()) {
            b();
        }
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
        yy0.f.e(u.k(this).Q(), model.f58590c, this.f300716a, null, null, 12);
        ty0.c.b(u.k(this).b0(), textLocalisedClause, this.f300717b, null, null, 12);
        py0.c cVar = new py0.c(textLocalisedClause);
        p pVar = this.e;
        p.b(pVar, true);
        View view = pVar.f137029a;
        or0.m.a(view);
        view.setOnClickListener(new d(model, 0, cVar, this));
    }
}
