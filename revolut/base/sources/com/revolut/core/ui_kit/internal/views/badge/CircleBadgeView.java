package com.revolut.core.ui_kit.internal.views.badge;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import aw0.v1;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.R$styleable;
import com.revolut.core.ui_kit.internal.drawables.RoundedBackgroundDrawable;
import com.revolut.core.ui_kit.models.MaskedImage;
import com.revolut.core.ui_kit.models.badge.AccentCircleBadge;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit.models.badge.CircleIconBadge;
import com.revolut.core.ui_kit.models.badge.CounterBadge;
import com.revolut.core.ui_kit.models.badge.FlagCircleBadge;
import com.revolut.core.ui_kit.models.badge.PlanBadge;
import com.revolut.core.ui_kit.models.badge.RawAccentBadge;
import com.revolut.core.ui_kit.models.badge.RawAccentCircleBadge;
import com.revolut.core.ui_kit.models.badge.RawCutoutImageBadge;
import com.revolut.core.ui_kit.models.badge.RawImageBadge;
import com.revolut.core.ui_kit.models.badge.RevolutBadge;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$Contextual;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$Style;
import com.revolut.core.ui_kit_core.displayers.image.decorator.models.CircleImageDecorator;
import com.revolut.core.ui_kit_core.displayers.image.models.CountryImage;
import com.revolut.core.ui_kit_core.displayers.image.models.TextImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import ez0.g;
import hx7.e;
import ix0.f0;
import ix0.g0;
import ix0.l0;
import jh.d;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import os0.b;
import yy0.f;
import yy0.p;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001c2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u001dJ\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001b\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/badge/CircleBadgeView;", "Landroid/widget/ImageView;", "Lix0/g0;", "Lur0/a;", "Lcom/revolut/core/ui_kit/models/badge/FlagCircleBadge;", "badge", "", "setFlagCircleBadge", "(Lcom/revolut/core/ui_kit/models/badge/FlagCircleBadge;)V", "Lcom/revolut/core/ui_kit/models/badge/RawCutoutImageBadge;", "setRawCutoutImageBadge", "(Lcom/revolut/core/ui_kit/models/badge/RawCutoutImageBadge;)V", "Lcom/revolut/core/ui_kit/models/badge/CounterBadge;", "setCounterBadge", "(Lcom/revolut/core/ui_kit/models/badge/CounterBadge;)V", "Lcom/revolut/core/ui_kit/models/badge/RawImageBadge;", "setRawImageBadge", "(Lcom/revolut/core/ui_kit/models/badge/RawImageBadge;)V", "Los0/a;", "badgeSize", "setBadgeSize", "(Los0/a;)V", "Lcom/revolut/core/ui_kit/models/badge/CircleBadgeModel;", "Lix0/l0;", "cutoutStage", "setBadge", "(Lcom/revolut/core/ui_kit/models/badge/CircleBadgeModel;Lix0/l0;)V", "setBadgeAndVisibility", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CircleBadgeView extends ImageView implements g0, ur0.a {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public os0.a f56515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f56516b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CircleBadgeModel f56517c;
    public l0 d;
    public StylableContactImage$ContactStyle e;

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CircleBadgeView(@NotNull Context context) {
        this(context, null, 0, null, 14);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static int e(dw0.a aVar) {
        switch (b.f229215b[aVar.ordinal()]) {
            case 1:
                return R$drawable.uikit_icn_24_bell;
            case 2:
                return R$drawable.uikit_icn_16_sand_watch;
            case 3:
                return R$drawable.uikit_icn_24_bank;
            case 4:
                return R$drawable.uikit_icn_24_boost;
            case 5:
                return R$drawable.uikit_icn_24_calendar_date;
            case 6:
                return R$drawable.uikit_icn_24_camera;
            case 7:
                return R$drawable.uikit_icn_16_canceled;
            case 8:
                return R$drawable.uikit_icn_24_card;
            case 9:
                return R$drawable.uikit_icn_16_check;
            case 10:
                return R$drawable.uikit_icn_24_cleaning;
            case 11:
                return R$drawable.uikit_icn_24_contrast;
            case 12:
                return R$drawable.uikit_icn_24_dislike;
            case 13:
                return R$drawable.uikit_icn_24_pencil;
            case 14:
                return R$drawable.uikit_icn_16_cross;
            case 15:
                return R$drawable.uikit_icn_24_star_solid;
            case 16:
                return R$drawable.uikit_icn_24_snowflake;
            case 17:
                return R$drawable.uikit_icn_24_image;
            case 18:
                return R$drawable.uikit_icn_16_badge_left;
            case 19:
                return R$drawable.uikit_icn_24_info_sign;
            case 20:
                return R$drawable.uikit_icn_24_like;
            case 21:
                return R$drawable.uikit_icn_24_lightning;
            case 22:
                return R$drawable.uikit_icn_24_link;
            case 23:
                return R$drawable.uikit_icn_16_lock_closed;
            case 24:
                return R$drawable.uikit_icn_16_lock_opened;
            case 25:
                return R$drawable.uikit_icn_24_no_boost;
            case 26:
                return R$drawable.uikit_icn_24_order_downwards;
            case 27:
                return R$drawable.uikit_icn_24_order_upwards;
            case 28:
                return R$drawable.uikit_icn_16_badge_right;
            case 29:
                return R$drawable.uikit_icn_24_pause;
            case 30:
                return R$drawable.uikit_icn_16_status_clock_arrows;
            case 31:
                return R$drawable.uikit_icn_24_call;
            case 32:
                return R$drawable.uikit_icn_24_premium;
            case 33:
                return R$drawable.uikit_icn_24_question_sign;
            case 34:
                return R$drawable.uikit_icn_16_arrow_recurring;
            case 35:
                return R$drawable.uikit_icn_16_status_refund;
            case 36:
                return R$drawable.uikit_icn_24_revert_left;
            case 37:
                return R$drawable.uikit_icn_24_time_outline;
            case 38:
                return R$drawable.uikit_icn_24_shield;
            case 39:
                return R$drawable.uikit_icn_24_spare_change;
            case 40:
                return R$drawable.uikit_icn_16_exclamation_mark_sign;
            case 41:
                return R$drawable.uikit_icn_16_plus;
            case 42:
                return R$drawable.uikit_icn_24_percent;
            case 43:
                return R$drawable.uikit_icn_24_travel;
            case 44:
                return R$drawable.uikit_icn_24_cashback;
            case 45:
                return R$drawable.uikit_icn_24_price_tag;
            case 46:
                return R$drawable.uikit_icn_24_rev_points;
            case 47:
                return R$drawable.uikit_icn_24_arrow_exchange;
            case 48:
                return R$drawable.uikit_icn_24_arrow_split;
            case 49:
                return R$drawable.uikit_icn_24_fees;
            case 50:
                return R$drawable.uikit_icn_merge;
            case 51:
                return R$drawable.uikit_icn_symbol_change;
            case 52:
                return R$drawable.uikit_icn_24_megaphone;
            case 53:
                return R$drawable.uikit_icn_24_moon;
            case 54:
                return R$drawable.uikit_icn_24_more_ios;
            case 55:
                return R$drawable.uikit_icn_24_plan_titan;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static float f(os0.a aVar) {
        int i = b.f229214a[aVar.ordinal()];
        if (i == 1) {
            return 20.0f;
        }
        if (i == 2) {
            return 28.0f;
        }
        if (i == 3) {
            return 24.0f;
        }
        throw new NoWhenBranchMatchedException();
    }

    private final void setCounterBadge(CounterBadge badge) {
        int i;
        int i2 = badge.f58052a;
        if (i2 < 0 || i2 >= 10) {
            dw0.a aVar = dw0.a.More;
            g(new AccentCircleBadge(aVar), e(aVar));
            return;
        }
        String strValueOf = String.valueOf(i2);
        Color.Solid solid = new Color.Solid(R$attr.uikit_colorOnAccentNeutral);
        Color.Solid solid2 = new Color.Solid(R$attr.uikit_colorAccentNeutral);
        int i3 = b.f229214a[this.f56515a.ordinal()];
        if (i3 != 1) {
            i = 14;
            if (i3 != 2) {
                if (i3 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                e.h(new IllegalArgumentException("Counter badge doesn't support profile avatar size"));
            }
        } else {
            i = 11;
        }
        int i5 = i;
        float f = 2.0f;
        int i6 = 0;
        CircleImageDecorator circleImageDecorator = new CircleImageDecorator((Image) new TextImage(strValueOf, solid, solid2, null, i5, (int) f(this.f56515a), g.CIRCLE, null, 8), Float.valueOf(f(this.f56515a)), f, i6, 0, 56);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        f.e(d.f(context).Q(), circleImageDecorator, this, null, null, 12);
    }

    private final void setFlagCircleBadge(FlagCircleBadge badge) {
        MaskedImage maskedImage = new MaskedImage(new CountryImage(badge.f58054a, (Integer) null, (ez0.e) null, 14), new MaskedImage.MaskType.Circle(f(this.f56515a) - 4.0f, 2.0f));
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        f.e(d.f(context).Q(), maskedImage, this, null, null, 12);
    }

    private final void setRawCutoutImageBadge(RawCutoutImageBadge badge) {
        RoundedBackgroundDrawable roundedBackgroundDrawableB;
        Image imageC = c(badge.f58064a);
        if ((imageC instanceof p) && (((p) imageC).getD() instanceof StylableContactImage$Contextual)) {
            RoundedBackgroundDrawable.Companion companion = RoundedBackgroundDrawable.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            roundedBackgroundDrawableB = RoundedBackgroundDrawable.Companion.b(companion, context, 0, 6);
        } else {
            roundedBackgroundDrawableB = null;
        }
        setBackground(roundedBackgroundDrawableB);
        MaskedImage maskedImage = new MaskedImage(imageC, new MaskedImage.MaskType.Circle(f(this.f56515a) - 4.0f, 2.0f));
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        f.e(d.f(context2).Q(), maskedImage, this, null, null, 12);
    }

    private final void setRawImageBadge(RawImageBadge badge) {
        Image imageC = c(badge.f58065a);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        f.e(d.f(context).Q(), imageC, this, null, null, 12);
    }

    @Override // ix0.g0
    public final f0 a(ViewGroup containerLayout) {
        Intrinsics.checkNotNullParameter(containerLayout, "containerLayout");
        float width = getWidth() / 2.0f;
        if (getVisibility() == 0) {
            return new f0(knm.b.f(this, containerLayout) + width, knm.b.h(this, containerLayout) + width, width);
        }
        return null;
    }

    public final void b(StylableContactImage$Contextual stylableContactImage$Contextual) {
        if (Intrinsics.f(this.e, stylableContactImage$Contextual)) {
            return;
        }
        this.e = stylableContactImage$Contextual;
        CircleBadgeModel circleBadgeModel = this.f56517c;
        if (circleBadgeModel != null) {
            d(circleBadgeModel);
        }
    }

    public final Image c(Image image) {
        StylableContactImage$ContactStyle stylableContactImage$ContactStyle;
        if (!(image instanceof p)) {
            return image;
        }
        p pVar = (p) image;
        return ((pVar.getD() instanceof StylableContactImage$Style) || (stylableContactImage$ContactStyle = this.e) == null || Intrinsics.f(pVar.getD(), stylableContactImage$ContactStyle)) ? image : pVar.a(stylableContactImage$ContactStyle);
    }

    public final void d(CircleBadgeModel circleBadgeModel) {
        setBackground(null);
        if (circleBadgeModel instanceof CircleIconBadge) {
            g(circleBadgeModel, e(((CircleIconBadge) circleBadgeModel).getF58050a()));
            return;
        }
        if ((circleBadgeModel instanceof PlanBadge) || (circleBadgeModel instanceof RevolutBadge)) {
            g(circleBadgeModel, R$drawable.uikit_icn_24_logo_revolut);
            return;
        }
        if (circleBadgeModel instanceof RawImageBadge) {
            setRawImageBadge((RawImageBadge) circleBadgeModel);
            return;
        }
        if (circleBadgeModel instanceof RawAccentBadge) {
            g(circleBadgeModel, ((RawAccentBadge) circleBadgeModel).f58062a);
            return;
        }
        if (circleBadgeModel instanceof RawAccentCircleBadge) {
            g(circleBadgeModel, ((RawAccentCircleBadge) circleBadgeModel).f58063a);
            return;
        }
        if (circleBadgeModel instanceof FlagCircleBadge) {
            setFlagCircleBadge((FlagCircleBadge) circleBadgeModel);
        } else if (circleBadgeModel instanceof RawCutoutImageBadge) {
            setRawCutoutImageBadge((RawCutoutImageBadge) circleBadgeModel);
        } else {
            if (!(circleBadgeModel instanceof CounterBadge)) {
                throw new NoWhenBranchMatchedException();
            }
            setCounterBadge((CounterBadge) circleBadgeModel);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(com.revolut.core.ui_kit.models.badge.CircleBadgeModel r14, int r15) {
        /*
            Method dump skipped, instruction units count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.internal.views.badge.CircleBadgeView.g(com.revolut.core.ui_kit.models.badge.CircleBadgeModel, int):void");
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f56516b, 1073741824);
        super.onMeasure(iMakeMeasureSpec, iMakeMeasureSpec);
    }

    @Override // ur0.a
    public final void r(v1 colorScheme, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        Drawable background = getBackground();
        RoundedBackgroundDrawable roundedBackgroundDrawable = background instanceof RoundedBackgroundDrawable ? (RoundedBackgroundDrawable) background : null;
        if (roundedBackgroundDrawable != null) {
            roundedBackgroundDrawable.a(colorScheme);
        }
    }

    public final void setBadge(@NotNull CircleBadgeModel badge, @NotNull l0 cutoutStage) {
        Intrinsics.checkNotNullParameter(badge, "badge");
        Intrinsics.checkNotNullParameter(cutoutStage, "cutoutStage");
        if (Intrinsics.f(badge, this.f56517c) && Intrinsics.f(cutoutStage, this.d)) {
            return;
        }
        this.f56517c = badge;
        this.d = cutoutStage;
        cutoutStage.a(this);
        d(badge);
    }

    public final void setBadgeAndVisibility(CircleBadgeModel badge, @NotNull l0 cutoutStage) {
        boolean z;
        Intrinsics.checkNotNullParameter(cutoutStage, "cutoutStage");
        if (badge != null) {
            setBadge(badge, cutoutStage);
            z = true;
        } else {
            z = false;
        }
        setVisibility(z ? 0 : 8);
    }

    public final void setBadgeSize(@NotNull os0.a badgeSize) {
        Intrinsics.checkNotNullParameter(badgeSize, "badgeSize");
        if (this.f56515a != badgeSize) {
            this.f56515a = badgeSize;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            this.f56516b = kli.a.k(context, f(badgeSize));
            CircleBadgeModel circleBadgeModel = this.f56517c;
            l0 l0Var = this.d;
            if (circleBadgeModel != null && l0Var != null) {
                setBadge(circleBadgeModel, l0Var);
            }
            requestLayout();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CircleBadgeView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, null, 12);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CircleBadgeView(@NotNull Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, null, 8);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CircleBadgeView(Context context, AttributeSet attributeSet, int i, os0.a aVar, int i2) {
        attributeSet = (i2 & 2) != 0 ? null : attributeSet;
        i = (i2 & 4) != 0 ? 0 : i;
        aVar = (i2 & 8) != 0 ? null : aVar;
        Intrinsics.checkNotNullParameter(context, "context");
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.CircleBadgeView, i, 0);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        os0.a aVar2 = (os0.a) os0.a.a().get(typedArrayObtainStyledAttributes.getInt(R$styleable.CircleBadgeView_uikit_circle_badge_size, (aVar == null ? os0.a.SMALL : aVar).ordinal()));
        typedArrayObtainStyledAttributes.recycle();
        this.f56515a = aVar2;
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        this.f56516b = kli.a.k(context2, f(aVar2));
    }
}
