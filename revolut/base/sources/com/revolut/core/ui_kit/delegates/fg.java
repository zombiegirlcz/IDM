package com.revolut.core.ui_kit.delegates;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$id;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class fg extends koi.b {
    public final RecyclerView f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final nt0.b f54165g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public xv0.w f54166h;
    public ValueAnimator i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public xq0.h f54167j;
    public List k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public dg f54168l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public z4l.j f54169m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fg(View itemView) {
        super(itemView);
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        View viewFindViewById = itemView.findViewById(R$id.scrollerBoxDelegate_recyclerView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f = (RecyclerView) viewFindViewById;
        this.f54165g = (nt0.b) itemView.findViewById(R$id.scrollerBoxDelegate_touchInterceptor);
    }

    public final void F(List list, final boolean z) {
        z4l.j jVar = new z4l.j(7, list, false);
        Intrinsics.checkNotNullParameter(jVar, "<set-?>");
        this.f54169m = jVar;
        RecyclerView recyclerView = this.f;
        recyclerView.setAdapter(jVar);
        final Context context = this.itemView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(context) { // from class: com.revolut.core.ui_kit.delegates.ScrollerBoxDelegate$ViewHolder$getStaticLayoutManager$1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            /* JADX INFO: renamed from: canScrollHorizontally, reason: from getter */
            public final boolean getF53278a() {
                return z;
            }
        });
    }
}
