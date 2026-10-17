package com.revolut.core.ui_kit.internal.views;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.widget.FrameLayout;
import aw0.c4;
import aw0.d4;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.actionshandler.TrackableItem;
import com.revolut.core.ui_kit_resources.R$attr;
import ix0.c0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u00182\u00020\u00012\u00020\u0002:\u0001\u0019B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fR$\u0010\u0017\u001a\u0004\u0018\u00010\u00108\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/FcaDisclaimerView;", "Landroid/widget/FrameLayout;", "Lcom/revolut/core/ui_kit_core/actionshandler/TrackableItem;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Law0/d4;", "content", "", "setContent", "(Law0/d4;)V", "Landroid/os/Parcelable;", "c", "Landroid/os/Parcelable;", "getAnalyticsContext", "()Landroid/os/Parcelable;", "setAnalyticsContext", "(Landroid/os/Parcelable;)V", "analyticsContext", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class FcaDisclaimerView extends FrameLayout implements TrackableItem {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ihm.f f56171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UIKitTextView f56172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public Parcelable analyticsContext;
    public int d;
    public int e;
    public float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Clause f56174g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f56175h;

    public static final class a {
        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FcaDisclaimerView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void a(float f) {
        Color.ModifiedColor modifiedColor;
        if (this.f56175h) {
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int iB = io0.a.b(f * 1.5f, kli.a.s(R$attr.uikit_colorForeground, context));
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            int iS = kli.a.s(R$attr.uikit_colorBackground, context2);
            int[] iArr = io0.c.f163133a;
            modifiedColor = new Color.ModifiedColor(new Color.SolidInt(io0.c.b(iB, iS, ho0.a.SRC_OVER)), 0.9f);
        } else {
            modifiedColor = new Color.ModifiedColor(new Color.Solid(R$attr.uikit_colorForeground), f);
        }
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        setBackground(dr0.l.h(context3, 8.0f, modifiedColor, 0, null));
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    public Parcelable getAnalyticsContext() {
        return this.analyticsContext;
    }

    @Override // com.revolut.core.ui_kit_core.actionshandler.TrackableItem
    public void setAnalyticsContext(Parcelable parcelable) {
        this.analyticsContext = parcelable;
    }

    public final void setContent(@NotNull d4 content) {
        Intrinsics.checkNotNullParameter(content, "content");
        c4 c4Var = content.f10278b;
        Clause clause = content.f10277a;
        int iB = c4Var.b();
        int i = this.d;
        UIKitTextView uIKitTextView = this.f56172b;
        if (iB != i) {
            this.d = c4Var.b();
            jb3.l.e(uIKitTextView, c4Var.b());
        }
        if (c4Var.c() != this.e) {
            this.e = c4Var.c();
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            uIKitTextView.setTextColor(kli.a.s(c4Var.c(), context));
        }
        if (c4Var.a() != this.f) {
            this.f = c4Var.a();
            a(c4Var.a());
        }
        if (Intrinsics.f(clause, this.f56174g)) {
            return;
        }
        this.f56174g = clause;
        kli.a.d(uIKitTextView, clause, this, new mm7.h(1, this.f56171a, ihm.f.class, "onNext", "onNext(Ljava/lang/Object;)V", 0, 14), 8);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FcaDisclaimerView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FcaDisclaimerView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f56171a = v0.a.d("create(...)");
        UIKitTextView uIKitTextView = new UIKitTextView(new ContextThemeWrapper(context, R$style.UiKitThemeOverlay_FcaDisclaimer), null, R$attr.internal_textAppearanceFcaDisclaimerEmphasised);
        uIKitTextView.setId(R$id.fcaDisclaimer_innerTextView);
        uIKitTextView.setTextAlignment(5);
        uIKitTextView.setTextColor(kli.a.s(R$attr.uikit_colorGreyTone50, context));
        uIKitTextView.setMovementMethod(c0.f169220a);
        uIKitTextView.setIncludeFontPadding(false);
        uIKitTextView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        this.f56172b = uIKitTextView;
        int iK = kli.a.k(context, 8.0f);
        setPaddingRelative(iK, iK, iK, iK);
        addView(uIKitTextView);
        this.d = R$attr.internal_textAppearanceFcaDisclaimerEmphasised;
        this.e = R$attr.uikit_colorGreyTone50;
    }

    public /* synthetic */ FcaDisclaimerView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
