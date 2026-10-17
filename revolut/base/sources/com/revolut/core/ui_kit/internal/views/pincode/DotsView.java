package com.revolut.core.ui_kit.internal.views.pincode;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.Animation;
import android.widget.LinearLayout;
import au0.l5;
import aw0.v1;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.R$string;
import com.revolut.core.ui_kit_resources.R$attr;
import dr0.l;
import io0.c;
import iu0.b;
import iu0.f;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import or0.u;
import org.jetbrains.annotations.NotNull;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R#\u0010\u001b\u001a\n \u0016*\u0004\u0018\u00010\u00150\u00158BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\r\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/pincode/DotsView;", "Landroid/widget/LinearLayout;", "Liu0/b;", "Lur0/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View;", "view", "", "setDotSelected", "(Landroid/view/View;)V", "setDotUnselected", "amount", "setDotsSelected", "(Ljava/lang/Integer;)V", "Landroid/view/animation/Animation;", "kotlin.jvm.PlatformType", "b", "Lkotlin/Lazy;", "getShakeAnimation", "()Landroid/view/animation/Animation;", "shakeAnimation", "getView", "()Landroid/view/View;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DotsView extends LinearLayout implements b, ur0.a {
    public static final /* synthetic */ int d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View[] f57434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f57435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f57436c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DotsView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final Animation getShakeAnimation() {
        return (Animation) this.f57435b.getValue();
    }

    private final void setDotSelected(View view) {
        view.setSelected(true);
    }

    private final void setDotUnselected(View view) {
        view.setSelected(false);
    }

    @Override // iu0.b
    public final void a() {
        View[] viewArr = this.f57434a;
        int length = viewArr.length;
        while (true) {
            length--;
            if (-1 >= length) {
                return;
            } else {
                setDotUnselected(viewArr[length]);
            }
        }
    }

    @Override // iu0.b
    public final void b() {
        clearAnimation();
        startAnimation(getShakeAnimation());
    }

    @Override // iu0.b
    public final void c() {
        View[] viewArr = this.f57434a;
        int i = -1;
        int length = viewArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (viewArr[length].isSelected()) {
                    i = length;
                    break;
                } else if (i2 < 0) {
                    break;
                } else {
                    length = i2;
                }
            }
        }
        if (i >= 0) {
            setDotUnselected(viewArr[i]);
        }
    }

    @Override // iu0.b
    public final void d() {
        View view;
        View[] viewArr = this.f57434a;
        int length = viewArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                view = null;
                break;
            }
            view = viewArr[i];
            if (!view.isSelected()) {
                break;
            } else {
                i++;
            }
        }
        if (view != null) {
            setDotSelected(view);
        }
    }

    @Override // iu0.b
    public final void e() {
        setDotsSelected(null);
        f fVar = this.f57436c;
        if (fVar != null) {
            AnimatorSet animatorSet = fVar.f168437b;
            animatorSet.start();
            animatorSet.addListener(new l5(fVar, 8));
        }
    }

    @Override // iu0.b
    public final void f() {
        f fVar = this.f57436c;
        if (fVar != null) {
            AnimatorSet animatorSet = fVar.f168437b;
            ArrayList<Animator.AnimatorListener> listeners = animatorSet.getListeners();
            if (listeners != null) {
                listeners.clear();
            }
            animatorSet.cancel();
            for (View view : fVar.f168436a) {
                view.setAlpha(1.0f);
            }
        }
        a();
    }

    public final void g(int i) {
        int[] iArr = c.f163133a;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iE = c.e(0.4f, i, kli.a.s(R$attr.uikit_colorBackground, context));
        for (View view : this.f57434a) {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            GradientDrawable gradientDrawableC = l.c(context2, new Color.SolidInt(iE));
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            view.setBackground(l.j(l.f117054a, gradientDrawableC, null, l.c(context3, new Color.SolidInt(i)), null, 54));
        }
    }

    @Override // iu0.b
    @NotNull
    public View getView() {
        return this;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        super.onInitializeAccessibilityNodeInfo(info);
        View[] viewArr = this.f57434a;
        int i = -1;
        int length = viewArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (viewArr[length].isSelected()) {
                    i = length;
                    break;
                } else if (i2 < 0) {
                    break;
                } else {
                    length = i2;
                }
            }
        }
        String string = getContext().getString(R$string.passcode_field_accessibility_value, Integer.valueOf(i + 1), Integer.valueOf(viewArr.length));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        iu0.c.a(context, info, string);
    }

    @Override // ur0.a
    public final void r(v1 colorScheme, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        g(kli.a.s(colorScheme.a(), context));
    }

    @Override // iu0.b
    public void setDotsSelected(Integer amount) {
        for (View view : this.f57434a) {
            setDotSelected(view);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DotsView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DotsView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f57435b = j.c(k.NONE, new a01.c(context, 11));
        View.inflate(context, R$layout.internal_view_dots_view, this);
        View viewFindViewById = findViewById(R$id.DotsView_dot1);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        View viewFindViewById2 = findViewById(R$id.DotsView_dot2);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        View viewFindViewById3 = findViewById(R$id.DotsView_dot3);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        View viewFindViewById4 = findViewById(R$id.DotsView_dot4);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        View[] viewArr = {viewFindViewById, viewFindViewById2, viewFindViewById3, viewFindViewById4};
        this.f57434a = viewArr;
        g(kli.a.s(R$attr.uikit_colorAccentNeutral, context));
        f fVar = new f(viewArr);
        this.f57436c = fVar;
        u.g(this).addObserver(fVar);
        pd.b.q(this, true);
    }

    public /* synthetic */ DotsView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
