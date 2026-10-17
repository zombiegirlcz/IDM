package com.revolut.core.ui_kit.internal.views.navbar;

import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.TextViewCompat;
import au0.a2;
import au0.b0;
import au0.y1;
import au0.z1;
import bp0.y;
import com.revolut.core.ui_kit.R$dimen;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import e8.q;
import jb3.l;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import or0.u;
import org.jetbrains.annotations.NotNull;
import tx0.k0;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 =2\u00020\u0001:\u00010B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000f\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u000e2\b\b\u0001\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010!\u001a\u00020\u000e2\u0014\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u001e¢\u0006\u0004\b!\u0010\"J\u0015\u0010%\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u000e2\b\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b)\u0010*J\u0015\u0010,\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020\u0006¢\u0006\u0004\b,\u0010\u0015J\u0017\u0010.\u001a\u00020\u000e2\b\b\u0001\u0010-\u001a\u00020\u0006¢\u0006\u0004\b.\u0010\u0015R\u001b\u00104\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001b\u00109\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u00101\u001a\u0004\b7\u00108R\u0014\u0010<\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;¨\u0006>"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/navbar/ImageAutoSizeTextView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/revolut/core/ui_kit/models/Clause;", "text", "Lty0/g;", "handleTypeface", "", "setText", "(Lcom/revolut/core/ui_kit/models/Clause;Lty0/g;)V", "getText", "()Lcom/revolut/core/ui_kit/models/Clause;", "color", "setTextColor", "(I)V", "", "useAutoSize", "setTitleAutoSize", "(Z)V", "Ltx0/k0;", "style", "setHeaderTitleStyle", "(Ltx0/k0;)V", "Lkotlin/Function1;", "Landroid/view/View;", "listener", "setOnTextClickListener", "(Lkotlin/jvm/functions/Function1;)V", "Lau0/b0;", "baseline", "setTitleEndIconBaseline", "(Lau0/b0;)V", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "image", "setEndImage", "(Lcom/revolut/core/ui_kit_core/displayers/image/Image;)V", "maxLines", "setMaxLines", "padding", "setDefaultEndPadding", "Landroidx/appcompat/widget/AppCompatTextView;", "a", "Le8/q;", "getChevronLayoutTitleText", "()Landroidx/appcompat/widget/AppCompatTextView;", "chevronLayoutTitleText", "Landroid/widget/ImageView;", "b", "getChevronLayoutChevron", "()Landroid/widget/ImageView;", "chevronLayoutChevron", "getDefaultMaxTextSize", "()I", "defaultMaxTextSize", "Companion", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ImageAutoSizeTextView extends FrameLayout {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final q chevronLayoutTitleText;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final q chevronLayoutChevron;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f57292c;
    public float d;
    public boolean e;
    public b0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f57293g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Image f57294h;
    public k0 i;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.internal.views.navbar.ImageAutoSizeTextView$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImageAutoSizeTextView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final ImageView getChevronLayoutChevron() {
        return (ImageView) this.chevronLayoutChevron.f();
    }

    private final AppCompatTextView getChevronLayoutTitleText() {
        return (AppCompatTextView) this.chevronLayoutTitleText.f();
    }

    private final int getDefaultMaxTextSize() {
        return getContext().getResources().getDimensionPixelSize(R$dimen.internal_H1_text_size);
    }

    public static /* synthetic */ void setText$default(ImageAutoSizeTextView imageAutoSizeTextView, Clause clause, ty0.g gVar, int i, Object obj2) {
        if ((i & 2) != 0) {
            gVar = ty0.f.f275450a;
        }
        imageAutoSizeTextView.setText(clause, gVar);
    }

    public final void a() {
        int defaultMaxTextSize;
        k0 k0Var = this.i;
        if (k0Var != null) {
            int i = z1.f9450a[k0Var.ordinal()];
            if (i == 1) {
                defaultMaxTextSize = getContext().getResources().getDimensionPixelSize(R$dimen.internal_H1_text_size);
            } else if (i == 2) {
                defaultMaxTextSize = getContext().getResources().getDimensionPixelSize(R$dimen.internal_H2_text_size);
            } else if (i == 3) {
                defaultMaxTextSize = getContext().getResources().getDimensionPixelSize(R$dimen.internal_H1Medium_text_size);
            } else if (i == 4) {
                defaultMaxTextSize = getContext().getResources().getDimensionPixelSize(com.revolut.core.ui_kit_resources.R$dimen.internal_LargeSubheader_text_size);
            } else {
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                defaultMaxTextSize = getContext().getResources().getDimensionPixelSize(com.revolut.core.ui_kit_resources.R$dimen.internal_heading3_text_size);
            }
        } else {
            defaultMaxTextSize = getDefaultMaxTextSize();
        }
        AppCompatTextView chevronLayoutTitleText = getChevronLayoutTitleText();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iB = kli.a.B(context, 5.0f);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        TextViewCompat.setAutoSizeTextTypeUniformWithConfiguration(chevronLayoutTitleText, iB, defaultMaxTextSize, Math.max(1, kli.a.B(context2, 1.0f)), 0);
    }

    public final Clause getText() {
        return ((y) u.k(this).b0()).o(getChevronLayoutTitleText());
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (TextViewCompat.getAutoSizeTextType(getChevronLayoutTitleText()) == 0) {
            return;
        }
        a();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00dd  */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.internal.views.navbar.ImageAutoSizeTextView.onLayout(boolean, int, int, int, int):void");
    }

    public final void setDefaultEndPadding(int padding) {
        if (this.f57293g == padding) {
            return;
        }
        this.f57293g = padding;
        if (this.f57294h != null || getChevronLayoutTitleText().getPaddingEnd() == padding) {
            return;
        }
        knm.b.w(padding, getChevronLayoutTitleText());
    }

    public final void setEndImage(Image image) {
        int iK;
        this.f57294h = image;
        yy0.f.e(u.k(this).Q(), image, getChevronLayoutChevron(), null, null, 12);
        getChevronLayoutChevron().setVisibility(image != null ? 0 : 8);
        if (image == null) {
            iK = this.f57293g;
        } else {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            iK = kli.a.k(context, 32.0f);
        }
        knm.b.w(iK, getChevronLayoutTitleText());
    }

    public final void setHeaderTitleStyle(@NotNull k0 style) {
        int i;
        Intrinsics.checkNotNullParameter(style, "style");
        if (style == this.i) {
            return;
        }
        this.i = style;
        int[] iArr = z1.f9450a;
        int i2 = iArr[style.ordinal()];
        if (i2 == 1) {
            i = R$attr.internal_textAppearanceHeading1;
        } else if (i2 == 2) {
            i = R$attr.internal_textAppearanceHeading2;
        } else if (i2 == 3) {
            i = R$attr.internal_textAppearanceHeading1;
        } else if (i2 == 4) {
            i = R$attr.internal_textAppearanceEmphasis1;
        } else {
            if (i2 != 5) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$attr.internal_textAppearanceHeading3;
        }
        l.e(getChevronLayoutTitleText(), i);
        this.d = getChevronLayoutTitleText().getTextSize();
        getChevronLayoutTitleText().setEllipsize(iArr[style.ordinal()] == 5 ? TextUtils.TruncateAt.END : null);
        if (TextViewCompat.getAutoSizeTextType(getChevronLayoutTitleText()) == 0) {
            return;
        }
        a();
    }

    public final void setMaxLines(int maxLines) {
        getChevronLayoutTitleText().setSingleLine(maxLines == 1);
        getChevronLayoutTitleText().setMaxLines(maxLines);
    }

    public final void setOnTextClickListener(Function1<? super View, Unit> listener) {
        if (listener != null) {
            setOnClickListener(new y1(0, listener));
            setOnTouchListener(new j01.e(new View[]{this}));
        } else {
            setOnClickListener(null);
            setOnTouchListener(null);
            setClickable(false);
        }
    }

    public final void setText(Clause text, @NotNull ty0.g handleTypeface) {
        Intrinsics.checkNotNullParameter(handleTypeface, "handleTypeface");
        ty0.c.b(u.k(this).b0(), text, getChevronLayoutTitleText(), null, handleTypeface, 4);
    }

    public final void setTextColor(int color) {
        getChevronLayoutTitleText().setTextColor(color);
    }

    public final void setTitleAutoSize(boolean useAutoSize) {
        this.e = true;
        if (useAutoSize) {
            a();
        } else {
            TextViewCompat.setAutoSizeTextTypeWithDefaults(getChevronLayoutTitleText(), 0);
            getChevronLayoutTitleText().setTextSize(0, this.d);
        }
        getChevronLayoutTitleText().setBreakStrategy(!useAutoSize ? 1 : 0);
    }

    public final void setTitleEndIconBaseline(@NotNull b0 baseline) {
        Pair pair;
        Intrinsics.checkNotNullParameter(baseline, "baseline");
        if (this.f != baseline) {
            this.f = baseline;
            int i = z1.f9451b[baseline.ordinal()];
            if (i == 1) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                pair = new Pair(Integer.valueOf(kli.a.k(context, 16.0f)), 80);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                pair = new Pair(Integer.valueOf(kli.a.k(context2, 24.0f)), 16);
            }
            int iIntValue = ((Number) pair.f186385a).intValue();
            int iIntValue2 = ((Number) pair.f186386b).intValue();
            ImageView chevronLayoutChevron = getChevronLayoutChevron();
            ViewGroup.LayoutParams layoutParams = chevronLayoutChevron.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.width = iIntValue;
            layoutParams2.height = iIntValue;
            layoutParams2.gravity = iIntValue2;
            chevronLayoutChevron.setLayoutParams(layoutParams2);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ImageAutoSizeTextView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageAutoSizeTextView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.chevronLayoutTitleText = kli.a.J(R$id.chevronLayoutTitleText, this);
        this.chevronLayoutChevron = kli.a.J(R$id.chevronLayoutChevron, this);
        this.f57292c = kli.a.k(context, 8.0f);
        View.inflate(context, R$layout.internal_view_imageautosizetextview_layout, this);
        this.d = getChevronLayoutTitleText().getTextSize();
        setTitleAutoSize(true);
        getChevronLayoutTitleText().addTextChangedListener(new a2(this, 0));
        this.e = true;
        this.f = b0.CENTER;
        this.f57293g = kli.a.k(context, 24.0f);
    }

    public /* synthetic */ ImageAutoSizeTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
