package com.revolut.core.ui_kit.internal.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.revolut.core.ui_kit.internal.drawables.DotDrawable;
import com.revolut.core.ui_kit.models.NewBadgeContent;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ms0.g2;
import or0.u;
import org.jetbrains.annotations.NotNull;
import te0.w;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\r\b\u0007\u0018\u0000 (2\u00020\u0001:\u0001)B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u001b\u0010\u0013\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0016\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u001b\u0010\u0019\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012R\u001b\u0010\u001c\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u001b\u0010\u0012R$\u0010#\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u0014\u0010%\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0012R\u0014\u0010'\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010\u0012¨\u0006*"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/NewBadgeView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/revolut/core/ui_kit/models/NewBadgeContent;", "content", "", "setContent", "(Lcom/revolut/core/ui_kit/models/NewBadgeContent;)V", "b", "Lkotlin/Lazy;", "getDotDiameterSmall", "()I", "dotDiameterSmall", "c", "getDotImageSizeSmall", "dotImageSizeSmall", "d", "getDotDiameterBig", "dotDiameterBig", "e", "getDotImageSizeBig", "dotImageSizeBig", "", "value", "f", "Z", "setShownAsDot", "(Z)V", "isShownAsDot", "getDotDiameter", "dotDiameter", "getDotImageSize", "dotImageSize", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NewBadgeView extends AppCompatTextView {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public NewBadgeContent f56287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f56288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f56289c;
    public final Object d;
    public final Object e;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public boolean isShownAsDot;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.internal.views.NewBadgeView$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NewBadgeView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final int getDotDiameter() {
        NewBadgeContent newBadgeContent = this.f56287a;
        NewBadgeContent.Dot dot = newBadgeContent instanceof NewBadgeContent.Dot ? (NewBadgeContent.Dot) newBadgeContent : null;
        com.revolut.core.ui_kit.models.n nVar = dot != null ? dot.f57887b : null;
        int i = nVar == null ? -1 : g2.f208259a[nVar.ordinal()];
        if (i == -1) {
            return 0;
        }
        if (i == 1) {
            return getDotDiameterSmall();
        }
        if (i == 2) {
            return getDotDiameterBig();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final int getDotDiameterBig() {
        return ((Number) this.d.getValue()).intValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final int getDotDiameterSmall() {
        return ((Number) this.f56288b.getValue()).intValue();
    }

    private final int getDotImageSize() {
        NewBadgeContent newBadgeContent = this.f56287a;
        NewBadgeContent.Dot dot = newBadgeContent instanceof NewBadgeContent.Dot ? (NewBadgeContent.Dot) newBadgeContent : null;
        com.revolut.core.ui_kit.models.n nVar = dot != null ? dot.f57887b : null;
        int i = nVar == null ? -1 : g2.f208259a[nVar.ordinal()];
        if (i == -1) {
            return 0;
        }
        if (i == 1) {
            return getDotImageSizeSmall();
        }
        if (i == 2) {
            return getDotImageSizeBig();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final int getDotImageSizeBig() {
        return ((Number) this.e.getValue()).intValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final int getDotImageSizeSmall() {
        return ((Number) this.f56289c.getValue()).intValue();
    }

    private final void setShownAsDot(boolean z) {
        if (this.isShownAsDot != z) {
            this.isShownAsDot = z;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.isShownAsDot) {
            setMeasuredDimension(getDotImageSize(), getDotImageSize());
            return;
        }
        int iMax = Math.max(getMeasuredHeight(), getMeasuredWidth());
        int size = View.MeasureSpec.getMode(i) == 0 ? Integer.MAX_VALUE : View.MeasureSpec.getSize(i);
        if (getMeasuredWidth() + 1 > iMax || iMax > size) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMax, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
    }

    public final void setContent(@NotNull NewBadgeContent content) {
        int iK;
        int iK2;
        float f;
        Intrinsics.checkNotNullParameter(content, "content");
        if (Intrinsics.f(content, this.f56287a)) {
            return;
        }
        this.f56287a = content;
        if (content instanceof NewBadgeContent.Dot) {
            setShownAsDot(true);
            ty0.c.b(u.k(this).b0(), null, this, null, null, 12);
            setPaddingRelative(0, 0, 0, 0);
            setWidth(getDotDiameter());
            setHeight(getDotDiameter());
            int dotImageSize = getDotImageSize();
            int dotImageSize2 = getDotImageSize();
            int dotDiameter = getDotDiameter();
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            setBackground(new DotDrawable(dotImageSize, dotImageSize2, dotDiameter, io0.a.c(context, ((NewBadgeContent.Dot) content).f57886a)));
            return;
        }
        if (!(content instanceof NewBadgeContent.WithClause)) {
            throw new NoWhenBranchMatchedException();
        }
        setShownAsDot(false);
        NewBadgeContent.WithClause withClause = (NewBadgeContent.WithClause) content;
        if (withClause instanceof NewBadgeContent.WithText) {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            iK = kli.a.k(context2, 8.0f);
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            iK2 = kli.a.k(context3, 4.0f);
            f = 24.0f;
        } else {
            if (!(withClause instanceof NewBadgeContent.WithNumber)) {
                throw new NoWhenBranchMatchedException();
            }
            Context context4 = getContext();
            Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
            iK = kli.a.k(context4, 4.0f);
            Context context5 = getContext();
            Intrinsics.checkNotNullExpressionValue(context5, "getContext(...)");
            iK2 = kli.a.k(context5, 2.0f);
            f = 16.0f;
        }
        setPaddingRelative(iK, iK2, iK, iK2);
        Context context6 = getContext();
        Intrinsics.checkNotNullExpressionValue(context6, "getContext(...)");
        setBackground(dr0.l.h(context6, f, withClause.getF57893c(), 1, withClause.getD()));
        Context context7 = getContext();
        Intrinsics.checkNotNullExpressionValue(context7, "getContext(...)");
        setTextColor(io0.a.c(context7, withClause.getF57892b()));
        ty0.c.b(u.k(this).b0(), withClause.getF57891a(), this, null, null, 12);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NewBadgeView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NewBadgeView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f56288b = w.y0(new lu0.a(context, 3));
        this.f56289c = w.y0(new lu0.a(context, 4));
        this.d = w.y0(new lu0.a(context, 5));
        this.e = w.y0(new lu0.a(context, 6));
        jb3.l.e(this, R$attr.internal_textAppearanceEmphasis4);
        setGravity(17);
        setLines(1);
        setAutoSizeTextTypeUniformWithConfiguration((int) (getTextSize() / 2), (int) getTextSize(), 1, 0);
    }

    public /* synthetic */ NewBadgeView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
