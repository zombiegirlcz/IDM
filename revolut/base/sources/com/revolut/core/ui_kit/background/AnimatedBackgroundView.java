package com.revolut.core.ui_kit.background;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import aw0.s8;
import com.revolut.core.ui_kit_resources.R$attr;
import ix0.s0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ny0.h;
import org.jetbrains.annotations.NotNull;
import po0.l;
import po0.v;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00142\u00020\u00012\u00020\u0002:\u0001\u0015B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/revolut/core/ui_kit/background/AnimatedBackgroundView;", "Landroid/widget/FrameLayout;", "Lny0/h;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lcom/revolut/core/ui_kit/background/AnimatedBackgroundType;", "type", "", "setBackgroundType", "(Lcom/revolut/core/ui_kit/background/AnimatedBackgroundType;)V", "", "getFitsReadableArea", "()Z", "fitsReadableArea", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AnimatedBackgroundView extends FrameLayout implements h {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f51491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ihm.b f51492b;

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.background.AnimatedBackgroundView$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AnimatedBackgroundView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // ny0.h
    /* JADX INFO: renamed from: getFitsReadableArea */
    public boolean getF() {
        return false;
    }

    public final void setBackgroundType(AnimatedBackgroundType type) {
        l lVarA = this.f51491a.a(type);
        if (lVarA == null) {
            return;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int iA = lVarA.a(kli.a.q(context));
        int i = (iA >> 24) & 255;
        if (i != 255) {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            iA = io0.c.e(i / 255.0f, iA, kli.a.s(R$attr.uikit_colorBackground, context2));
        }
        ColorDrawable colorDrawable = new ColorDrawable(iA);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        this.f51492b.onNext(s0.d(colorDrawable, context3, s8.DEFAULT));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AnimatedBackgroundView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedBackgroundView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f51491a = new v(this);
        ihm.b bVarE = ihm.b.e(s0.d(new ColorDrawable(0), context, s8.DEFAULT));
        Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
        this.f51492b = bVarE;
    }

    public /* synthetic */ AnimatedBackgroundView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
