package com.revolut.core.ui_kit.internal.views.timer;

import android.content.Context;
import android.util.AttributeSet;
import com.revolut.core.ui_kit.internal.views.UIKitTextView;
import com.revolut.core.ui_kit_resources.R$attr;
import jb3.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0013B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/timer/CountDownTextView;", "Lcom/revolut/core/ui_kit/internal/views/timer/a;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "colorAttr", "", "setTextColorAttr", "(I)V", "", "millis", "setTime", "(J)V", "Companion", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CountDownTextView extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public UIKitTextView f57662h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CountDownTextView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static final String h0(long j2) {
        return j2 < 10 ? p.a.m(j2, "0") : String.valueOf(j2);
    }

    public final UIKitTextView g0() {
        UIKitTextView uIKitTextView = this.f57662h;
        if (uIKitTextView != null) {
            return uIKitTextView;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        UIKitTextView uIKitTextView2 = new UIKitTextView(context, null, 6, 0);
        l.e(uIKitTextView2, R$attr.internal_textAppearanceEmphasis1);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        uIKitTextView2.setTextColor(kli.a.s(R$attr.uikit_colorForeground, context2));
        this.f57662h = uIKitTextView2;
        addView(uIKitTextView2);
        return uIKitTextView2;
    }

    public final void setTextColorAttr(int colorAttr) {
        UIKitTextView uIKitTextViewG0 = g0();
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        uIKitTextViewG0.setTextColor(kli.a.s(colorAttr, context));
    }

    @Override // com.revolut.core.ui_kit.internal.views.timer.a
    public void setTime(long millis) {
        long j2 = DateTimeConstants.MILLIS_PER_HOUR;
        long j3 = millis / j2;
        long j5 = j2 * j3;
        long j16 = DateTimeConstants.MILLIS_PER_MINUTE;
        long j22 = (millis - j5) / j16;
        g0().setText(com.google.android.gms.internal.mlkit_vision_face.a.p(h0(j3), ":", h0(j22), ":", h0((millis - ((j16 * j22) + j5)) / 1000)));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CountDownTextView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CountDownTextView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ CountDownTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
