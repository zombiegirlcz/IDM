package ms0;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.revolut.core.ui_kit.R$drawable;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ms0.j;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class x extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f208479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f208480b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void setBackground(@NotNull j background) {
        Intrinsics.checkNotNullParameter(background, "background");
        background.getClass();
        setBackgroundResource(j.a.f208295b);
    }

    public final void setContent(@NotNull u content) {
        Intrinsics.checkNotNullParameter(content, "content");
        yy0.f fVarQ = or0.u.k(this).Q();
        content.getClass();
        yy0.f.e(fVarQ, null, this.f208479a, null, null, 12);
        this.f208479a.setVisibility(8);
        ty0.c.b(or0.u.k(this).b0(), content.f208446a, this.f208480b, null, null, 12);
    }

    public final void setStyle(@NotNull v style) {
        Intrinsics.checkNotNullParameter(style, "style");
        int i = w.f208471a[style.ordinal()];
        TextView textView = this.f208480b;
        if (i == 1) {
            setBackgroundResource(0);
            setPaddingRelative(0, 0, 0, 0);
            jb3.l.e(textView, R$attr.internal_textAppearanceBody3);
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            textView.setTextColor(kli.a.s(R$attr.uikit_colorGrey50, context));
            return;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        setBackgroundResource(R$drawable.internal_badge_background_white);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        int iK = kli.a.k(context2, 8.0f);
        Context context3 = getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        int iK2 = kli.a.k(context3, 6.0f);
        setPaddingRelative(iK, iK2, iK, iK2);
        jb3.l.e(textView, R$attr.internal_textAppearanceEmphasis4);
        Context context4 = getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        textView.setTextColor(kli.a.s(R$attr.uikit_colorGrey50, context4));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        setOrientation(0);
        View.inflate(context, R$layout.internal_view_chart_badge, this);
        View viewFindViewById = findViewById(R$id.internalViewChartBadge_badgeIcon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f208479a = (ImageView) viewFindViewById;
        View viewFindViewById2 = findViewById(R$id.internalViewChartBadge_badgeLabel);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f208480b = (TextView) viewFindViewById2;
        setStyle(v.WhiteTransparentBackground);
    }

    public /* synthetic */ x(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
