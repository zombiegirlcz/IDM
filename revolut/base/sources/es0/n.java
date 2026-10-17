package es0;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.R$drawable;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class n extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f128839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f128840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fp0.p f128841c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        View viewR = kotlin.jvm.internal.s.r(this, R$layout.internal_view_tabs_item);
        this.f128839a = viewR;
        View viewFindViewById = viewR.findViewById(R$id.tabText);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById;
        this.f128840b = textView;
        View viewFindViewById2 = viewR.findViewById(R$id.tabIcon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        viewFindViewById2.setVisibility(8);
        View viewFindViewById3 = viewR.findViewById(R$id.tabEndIcon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        viewFindViewById3.setVisibility(8);
        View viewFindViewById4 = viewR.findViewById(R$id.tabs_largeIcon);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById4, "findViewById(...)");
        viewFindViewById4.setVisibility(8);
        textView.setTextColor(kli.a.s(R$attr.uikit_colorForeground, context));
        addView(viewR, new FrameLayout.LayoutParams(-1, -2, 17));
        setPaddingRelative(kli.a.k(context, 16.0f), getPaddingTop(), kli.a.k(context, 16.0f), getPaddingBottom());
        setBackgroundResource(R$drawable.internal_tabs_selector);
        l lVar = q.Companion;
        Color.Solid solid = new Color.Solid(R$attr.uikit_colorForeground);
        Color.Solid solid2 = new Color.Solid(R$attr.uikit_colorWidgetBackground);
        int iW = kli.a.w(R$attr.uikit_tab_corner_radius, context);
        lVar.getClass();
        this.f128841c = l.a(this, solid, solid2, iW);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        super.onInitializeAccessibilityNodeInfo(info);
        gq0.g.b(info);
    }
}
