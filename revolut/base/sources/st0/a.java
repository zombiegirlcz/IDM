package st0;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.ConditionalAmountDelegate$ConditionalAmountItem$ActionChip;
import com.revolut.core.ui_kit.internal.drawables.RoundedBackgroundDrawable;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import e8.q;
import fp0.m;
import fp0.p;
import gp0.g;
import ip0.gc;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import or0.u;
import org.jetbrains.annotations.NotNull;
import rd0.e;
import ty0.c;
import yy0.f;

/* JADX INFO: loaded from: classes19.dex */
public final class a extends ConstraintLayout {

    @NotNull
    private static final C1487a Companion = new C1487a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f265432b;
    public final q f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q f265433g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final RoundedBackgroundDrawable f265434h;
    public final p i;

    /* JADX INFO: renamed from: st0.a$a, reason: collision with other inner class name */
    public static final class C1487a {
        private C1487a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final ImageView getEndImageView() {
        return (ImageView) this.f.f();
    }

    private final TextView getLabelView() {
        return (TextView) this.f265433g.f();
    }

    private final ImageView getStartImageView() {
        return (ImageView) this.f265432b.f();
    }

    public final void f0(gc gcVar) {
        Pair pair;
        int i = b.f265435a[gcVar.ordinal()];
        if (i == 1) {
            pair = new Pair(Integer.valueOf(R$attr.uikit_colorActionBackgroundNeutral), Integer.valueOf(R$attr.uikit_colorForeground));
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            pair = new Pair(Integer.valueOf(R$attr.uikit_colorInputError), Integer.valueOf(R$attr.uikit_colorRed));
        }
        int iIntValue = ((Number) pair.f186385a).intValue();
        int iIntValue2 = ((Number) pair.f186386b).intValue();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iS = kli.a.s(iIntValue, context);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int iS2 = kli.a.s(iIntValue2, context2);
        this.f265434h.e(iS);
        e.q(getEndImageView(), Integer.valueOf(iS2));
        getLabelView().setTextColor(iS2);
    }

    @NotNull
    public final p getClickHandler$ui_kit_components_release() {
        return this.i;
    }

    public final void setModel(@NotNull ConditionalAmountDelegate$ConditionalAmountItem$ActionChip model) {
        Intrinsics.checkNotNullParameter(model, "model");
        Image image = model.f52118b;
        if (image != null) {
            getStartImageView().setVisibility(0);
            f.e(u.k(this).Q(), image, getStartImageView(), null, null, 12);
        } else {
            getStartImageView().setVisibility(8);
        }
        c.b(u.k(this).b0(), model.f52119c, getLabelView(), null, null, 12);
        f0(model.d);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f265432b = kli.a.J(R$id.inlineSwitcherAccountAction_startImage, this);
        this.f = kli.a.J(R$id.inlineSwitcherAccountAction_endImage, this);
        this.f265433g = kli.a.J(R$id.inlineSwitcherAccountAction_label, this);
        RoundedBackgroundDrawable roundedBackgroundDrawable = new RoundedBackgroundDrawable(context, 0, 6);
        this.f265434h = roundedBackgroundDrawable;
        m mVar = p.Companion;
        g gVar = new g(0);
        mVar.getClass();
        this.i = m.a(this, gVar);
        View.inflate(context, R$layout.internal_view_inline_switcher_account_action, this);
        int iK = kli.a.k(context, 4.0f);
        setBackground(new InsetDrawable((Drawable) roundedBackgroundDrawable, 0, iK, 0, iK));
        f0(gc.ACTIVE);
        setClipToPadding(false);
        int iK2 = kli.a.k(context, 8.0f);
        int iK3 = kli.a.k(context, 6.0f);
        setPadding(iK2, iK3, iK2, iK3);
        setClickable(true);
        setFocusable(true);
    }

    public /* synthetic */ a(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
