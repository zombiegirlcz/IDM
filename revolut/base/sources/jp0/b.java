package jp0;

import android.content.Context;
import android.view.View;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.drawables.AirTipBackgroundDrawable;
import com.revolut.core.ui_kit.drawables.AirTipHintAnimationDrawable;
import com.revolut.core.ui_kit.internal.views.UIKitTextView;
import com.revolut.core.ui_kit.views.LargeActionButton;
import dr0.l;
import fp0.h;
import fp0.m;
import fp0.p;
import gp0.g;
import iv0.s;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b extends koi.b {
    public final UIKitTextView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final UIKitTextView f177180g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LargeActionButton f177181h;
    public final p i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AirTipHintAnimationDrawable f177182j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "itemView");
        View viewFindViewById = view.findViewById(R$id.air_tip_titleTextView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        UIKitTextView uIKitTextView = (UIKitTextView) viewFindViewById;
        this.f = uIKitTextView;
        View viewFindViewById2 = view.findViewById(R$id.air_tip_bodyTextView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        UIKitTextView uIKitTextView2 = (UIKitTextView) viewFindViewById2;
        this.f177180g = uIKitTextView2;
        View viewFindViewById3 = view.findViewById(R$id.air_tip_ctaView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f177181h = (LargeActionButton) viewFindViewById3;
        m mVar = p.Companion;
        h hVar = h.f137024a;
        g gVar = new g(hVar);
        mVar.getClass();
        this.i = m.a(view, gVar);
        uIKitTextView.setImportantForAccessibility(2);
        uIKitTextView2.setImportantForAccessibility(2);
        AirTipHintAnimationDrawable.INSTANCE.getClass();
        Intrinsics.checkNotNullParameter(view, "view");
        Context context = view.getContext();
        Intrinsics.h(context);
        AirTipHintAnimationDrawable airTipHintAnimationDrawable = new AirTipHintAnimationDrawable(context, new AirTipBackgroundDrawable(context));
        view.setBackground(l.f(context, hVar, airTipHintAnimationDrawable, null, null, 24));
        view.setOutlineProvider(new s(kli.a.l(context, 24.0f), true));
        view.setClipToOutline(true);
        this.f177182j = airTipHintAnimationDrawable;
    }
}
