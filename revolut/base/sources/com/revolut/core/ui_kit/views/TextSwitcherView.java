package com.revolut.core.ui_kit.views;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.revolut.core.ui_kit.internal.views.UIKitTextView;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx0.rc;
import mx0.sc;
import mx0.tc;
import mx0.uc;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u001cB'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000e2\b\b\u0001\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0013J\u0015\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0013J\u0015\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/revolut/core/ui_kit/views/TextSwitcherView;", "Lcom/revolut/core/ui_kit/views/TwoViewsSwitcherView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/revolut/core/ui_kit/models/Clause;", "clause", "", "animate", "", "setText", "(Lcom/revolut/core/ui_kit/models/Clause;Z)V", "color", "setTextColor", "(I)V", "gravity", "setGravity", "lines", "setLines", "Landroid/text/TextUtils$TruncateAt;", "where", "setEllipsize", "(Landroid/text/TextUtils$TruncateAt;)V", "mx0/uc", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TextSwitcherView extends TwoViewsSwitcherView {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final UIKitTextView f58901h;
    public final UIKitTextView i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public uc f58902j;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextSwitcherView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.revolut.core.ui_kit.views.TwoViewsSwitcherView, android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() >= 2) {
            throw new IllegalStateException("No more children allowed");
        }
        super.addView(view);
    }

    public final void setEllipsize(@NotNull TextUtils.TruncateAt where) {
        Intrinsics.checkNotNullParameter(where, "where");
        this.f58901h.setEllipsize(where);
        this.i.setEllipsize(where);
    }

    public final void setGravity(int gravity) {
        this.f58901h.setGravity(gravity);
        this.i.setGravity(gravity);
    }

    public final void setLines(int lines) {
        this.f58901h.setLines(lines);
        this.i.setLines(lines);
    }

    public final void setText(@NotNull Clause clause, boolean animate) {
        Intrinsics.checkNotNullParameter(clause, "clause");
        uc ucVar = this.f58902j;
        if ((ucVar instanceof rc) && !Intrinsics.f(((rc) ucVar).f209979a, clause)) {
            this.f58902j = new tc(clause);
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            ty0.c.b(jh.d.f(context).b0(), clause, this.i, null, null, 12);
            d(animate);
            return;
        }
        if (Intrinsics.f(ucVar, sc.f210001a) || ((ucVar instanceof tc) && !Intrinsics.f(((tc) ucVar).f210024a, clause))) {
            this.f58902j = new rc(clause);
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            ty0.c.b(jh.d.f(context2).b0(), clause, this.f58901h, null, null, 12);
            c(animate);
        }
    }

    public final void setTextColor(int color) {
        this.f58901h.setTextColor(color);
        this.i.setTextColor(color);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextSwitcherView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextSwitcherView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        UIKitTextView uIKitTextView = new UIKitTextView(context, attributeSet, i);
        this.f58901h = uIKitTextView;
        UIKitTextView uIKitTextView2 = new UIKitTextView(context, attributeSet, i);
        this.i = uIKitTextView2;
        this.f58902j = sc.f210001a;
        addView(uIKitTextView);
        addView(uIKitTextView2);
    }

    public /* synthetic */ TextSwitcherView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
