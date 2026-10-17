package nv0;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.AvatarView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$style;
import iv0.s;
import kotlin.jvm.internal.Intrinsics;
import mx0.i1;
import or0.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class k extends FrameLayout {

    @NotNull
    private static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f219353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f219354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f219355c;
    public final int d;
    public final int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f219356g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f219357h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f219358j;
    public final int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AppCompatImageView f219359l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final AppCompatTextView f219360m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final AppCompatTextView f219361n;
    public final AvatarView o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final GradientDrawable f219362p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context, int i) {
        super(context, null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        float fV = kli.a.v(R$attr.uikit_box_corner_radius, context);
        int iS = kli.a.s(i, context);
        this.f219353a = iS;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, R$style.UiKitColorsTheme_Night);
        ContextThemeWrapper contextThemeWrapper2 = new ContextThemeWrapper(context, R$style.UiKitColorsTheme_Day);
        this.f219354b = kli.a.s(i, contextThemeWrapper);
        this.f219355c = kli.a.s(i, contextThemeWrapper2);
        this.d = kli.a.s(R$attr.uikit_colorPopoverBackground, context);
        this.e = kli.a.s(R$attr.uikit_colorPopoverBackground, contextThemeWrapper);
        this.f = kli.a.s(R$attr.uikit_colorPopoverBackground, contextThemeWrapper2);
        this.f219356g = kli.a.s(R$attr.uikit_colorForeground, contextThemeWrapper);
        this.f219357h = kli.a.s(R$attr.uikit_colorForeground, contextThemeWrapper2);
        this.i = kli.a.s(R$attr.uikit_colorForeground, context);
        this.f219358j = kli.a.s(R$attr.uikit_colorForeground, context);
        this.k = kli.a.s(R$attr.uikit_colorForeground, contextThemeWrapper2);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(fV);
        gradientDrawable.setColor(iS);
        this.f219362p = gradientDrawable;
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(fV);
        gradientDrawable2.setColor(-1);
        View.inflate(context, R$layout.internal_view_wallet_widget_card, this);
        View viewFindViewById = findViewById(R$id.walletWidgetCard_backgroundImage);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        AppCompatImageView appCompatImageView = (AppCompatImageView) viewFindViewById;
        this.f219359l = appCompatImageView;
        View viewFindViewById2 = findViewById(R$id.walletWidgetCard_title);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f219360m = (AppCompatTextView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R$id.walletWidgetCard_subtitle);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f219361n = (AppCompatTextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R$id.walletWidgetCard_avatar);
        AvatarView avatarView = (AvatarView) viewFindViewById4;
        avatarView.setDefaultAvatarStyle$ui_kit_components_release(i1.SIZE_36_36);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "apply(...)");
        this.o = avatarView;
        setBackground(gradientDrawable);
        setForeground(new LayerDrawable(new Drawable[]{dr0.l.f(context, fp0.h.f137024a, null, null, gradientDrawable2, 12), b.a(fV, kli.a.l(context, 1.0f))}));
        appCompatImageView.setClipToOutline(true);
        appCompatImageView.setOutlineProvider(new s(fV, true));
    }

    public final int getBackCardBackgroundColor$ui_kit_components_release() {
        return this.d;
    }

    public final int getDarkBackCardBackgroundColor$ui_kit_components_release() {
        return this.e;
    }

    public final void setModel(@NotNull d model) {
        Intrinsics.checkNotNullParameter(model, "model");
        Clause clause = model.f219347a;
        i iVar = model.e;
        AppCompatTextView appCompatTextView = this.f219360m;
        kli.a.b(appCompatTextView, clause, ty0.f.f275450a);
        Clause clause2 = model.f219348b;
        AppCompatTextView appCompatTextView2 = this.f219361n;
        kli.a.b(appCompatTextView2, clause2, ty0.f.f275450a);
        this.o.setModel(model.f219349c);
        Image image = model.d;
        int i = image != null ? 0 : 8;
        AppCompatImageView appCompatImageView = this.f219359l;
        appCompatImageView.setVisibility(i);
        if (image != null) {
            yy0.f.e(u.k(appCompatImageView).Q(), image, this.f219359l, null, null, 12);
        }
        this.f219362p.setColor(iVar.a(this, model.f));
        appCompatTextView.setTextColor(iVar.b(this));
        appCompatTextView2.setTextColor(iVar.c(this));
    }
}
