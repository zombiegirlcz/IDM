package com.revolut.core.ui_kit.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.delegates.CircleActionButtonsBarDelegate;
import com.revolut.flexbox.FlexboxLayoutManager;
import ix0.c2;
import ix0.w0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mx0.s2;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u000fJ\u001b\u0010\u0015\u001a\u00020\r2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/revolut/core/ui_kit/views/CircleActionButtonsBarView;", "Landroid/widget/FrameLayout;", "Lix0/w0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "singleLine", "", "setSingleLine", "(Z)V", "enabled", "setHapticFeedback", "", "Lcom/revolut/core/ui_kit/delegates/CircleActionButtonsBarDelegate$CircleActionButton;", "actions", "setActions", "(Ljava/util/List;)V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CircleActionButtonsBarView extends FrameLayout implements w0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f58476h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c2 f58477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CircleActionButtonsBarDelegate.CircleActionButtonDelegate f58478b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z4l.j f58479c;
    public final ihm.f d;
    public boolean e;
    public List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final FlexboxLayoutManager f58480g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CircleActionButtonsBarView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final efm.r a() {
        return this.f58478b.f52099c.f121375b;
    }

    @Override // ix0.w0, ix0.v0
    public /* bridge */ boolean getInsetsAdjustable() {
        return super.getInsetsAdjustable();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets insets) {
        Intrinsics.checkNotNullParameter(insets, "insets");
        WindowInsets windowInsetsOnApplyWindowInsets = super.onApplyWindowInsets(this.f58477a.c(insets));
        Intrinsics.checkNotNullExpressionValue(windowInsetsOnApplyWindowInsets, "onApplyWindowInsets(...)");
        return windowInsetsOnApplyWindowInsets;
    }

    public final void setActions(@NotNull List<CircleActionButtonsBarDelegate.CircleActionButton> actions) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        if (Intrinsics.f(actions, this.f)) {
            return;
        }
        this.f = actions;
        int i = this.f58480g.f98208b;
        z4l.j jVar = this.f58479c;
        if (i == 0) {
            jVar.d();
        }
        jVar.c(actions);
    }

    public final void setHapticFeedback(boolean enabled) {
        this.e = enabled;
    }

    public final void setSingleLine(boolean singleLine) {
        this.f58480g.A(!singleLine ? 1 : 0);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CircleActionButtonsBarView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CircleActionButtonsBarView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f58477a = new c2(this);
        CircleActionButtonsBarDelegate.CircleActionButtonDelegate circleActionButtonDelegate = new CircleActionButtonsBarDelegate.CircleActionButtonDelegate();
        this.f58478b = circleActionButtonDelegate;
        z4l.j jVar = new z4l.j(7, zhm.u.c(circleActionButtonDelegate), false);
        this.f58479c = jVar;
        this.d = v0.a.d("create(...)");
        this.f = f0.f322471a;
        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(context, 1);
        flexboxLayoutManager.z(0);
        flexboxLayoutManager.A(1);
        flexboxLayoutManager.B(2);
        flexboxLayoutManager.y(0);
        this.f58480g = flexboxLayoutManager;
        RecyclerView recyclerView = new RecyclerView(context);
        recyclerView.setId(R$id.uikit_circleActionButtonsBarView_recyclerView);
        recyclerView.setAdapter(jVar);
        recyclerView.setLayoutManager(flexboxLayoutManager);
        recyclerView.setClipToPadding(false);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setOverScrollMode(2);
        addView(recyclerView);
        circleActionButtonDelegate.f52099c.f121375b.subscribe(new s2(new mt9.c(this, context, 10), 11));
    }

    public /* synthetic */ CircleActionButtonsBarView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
