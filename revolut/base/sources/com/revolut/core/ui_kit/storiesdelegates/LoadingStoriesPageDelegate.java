package com.revolut.core.ui_kit.storiesdelegates;

import akg.d;
import android.content.Context;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import bx0.i;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit_resources.R$color;
import java.util.List;
import koi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/storiesdelegates/LoadingStoriesPageDelegate;", "Lcom/revolut/core/ui_kit/storiesdelegates/BaseStoriesDelegate;", "Lcom/revolut/core/ui_kit/storiesdelegates/LoadingStoriesModel;", "Lbx0/i;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LoadingStoriesPageDelegate extends BaseStoriesDelegate<LoadingStoriesModel, i> {
    public LoadingStoriesPageDelegate() {
        super(R$layout.internal_loading_stories_page, new d(10));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new i(s.r(parent, R$layout.internal_loading_stories_page));
    }

    @Override // com.revolut.core.ui_kit.storiesdelegates.BaseStoriesDelegate
    public final void s(bx0.d dVar, j jVar, List payloads) {
        i holder = (i) dVar;
        LoadingStoriesModel data = (LoadingStoriesModel) jVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        Context context = holder.H().getContext();
        ShimmerFrameLayout shimmerFrameLayoutH = holder.H();
        c9.d dVar2 = new c9.d();
        dVar2.p(context.getColor(R$color.internal_greyTone10_night));
        dVar2.o(context.getColor(R$color.internal_black));
        shimmerFrameLayoutH.d(((c9.d) ((c9.d) ((c9.d) dVar2.i(true)).k(2000L)).m(2.0f)).c());
    }
}
