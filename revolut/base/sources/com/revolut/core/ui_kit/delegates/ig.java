package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;
import com.revolut.core.ui_kit.R$id;
import com.revolut.core.ui_kit.views.ScrollingPagerIndicatorView;
import ip0.ic0;
import ip0.lc0;
import ip0.uc0;
import ip0.vc0;
import ip0.w10;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ig extends koi.b {
    public final RecyclerView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ScrollingPagerIndicatorView f54295g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ViewGroup f54296h;
    public final View i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List f54297j;
    public xq0.f k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public lc0 f54298l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public xv0.w f54299m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public SnapHelper f54300n;
    public vc0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public uc0 f54301p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ic0 f54302q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final xq0.c f54303r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f54304s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ig(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.scrollerDelegate_recyclerView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        RecyclerView recyclerView = (RecyclerView) viewFindViewById;
        this.f = recyclerView;
        View viewFindViewById2 = itemView.findViewById(R$id.scrollerDelegate_pagerIndicator);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f54295g = (ScrollingPagerIndicatorView) viewFindViewById2;
        View viewFindViewById3 = itemView.findViewById(R$id.scrollerDelegate_nestedScrollableHost);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById3, "findViewById(...)");
        this.f54296h = (ViewGroup) viewFindViewById3;
        Object parent = recyclerView.getParent();
        Intrinsics.i(parent, "null cannot be cast to non-null type android.view.View");
        this.i = (View) parent;
        this.f54297j = zhm.f0.f322471a;
        this.f54303r = new xq0.c(recyclerView, itemView);
        this.f54304s = -1;
        c8g.a.a(itemView, ny0.a.f220589a, new w10(this, 14));
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x01bf A[PHI: r7
      0x01bf: PHI (r7v14 java.lang.Integer) = (r7v10 java.lang.Integer), (r7v12 java.lang.Integer) binds: [B:86:0x01bd, B:92:0x01d0] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F(int r23, aw0.x4 r24, com.revolut.core.ui_kit.delegates.gg r25, qv0.c r26, boolean r27, java.util.List r28, ip0.oc0 r29) {
        /*
            Method dump skipped, instruction units count: 544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.delegates.ig.F(int, aw0.x4, com.revolut.core.ui_kit.delegates.gg, qv0.c, boolean, java.util.List, ip0.oc0):void");
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    public final int H(int i, boolean z) {
        if (!z || !((Boolean) jo0.g.f176833q.getValue()).booleanValue()) {
            return i;
        }
        Context context = this.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return ny0.i.d(context) ? i + 1 : i;
    }
}
