package com.revolut.core.ui_kit.internal.views.navbar;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import aqd.h1;
import au0.b2;
import au0.c2;
import au0.d2;
import au0.e2;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import h30.l;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0002\u0007\u0003\bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/navbar/ImageDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lau0/c2;", "Lau0/e2;", "<init>", "()V", "Companion", "au0/d2", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ImageDelegate extends BaseRecyclerViewDelegate<c2, e2> {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f57295c;

    public static final class a {
        private a() {
        }
    }

    public ImageDelegate() {
        super(-1, new h1(13));
        this.f57295c = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        hu0.g gVar = new hu0.g(parent.getContext());
        gVar.setAdjustViewBounds(true);
        gVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        gVar.setOnClickListener(new b2(this, 0));
        return new e2(gVar);
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(e2 holder, c2 data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        hu0.g gVar = holder.f;
        if (payloads.isEmpty()) {
            if (data.f9157c) {
                gVar.setScaleType(ImageView.ScaleType.CENTER_CROP);
            } else {
                gVar.setScaleType(ImageView.ScaleType.FIT_CENTER);
            }
            Image image = data.f9155a;
            View view = holder.itemView;
            yy0.f.e(l.z(view, "itemView", view), image, holder.f, null, null, 12);
            gVar.setZoomable(data.d);
            return;
        }
        ArrayList<d2> arrayList = new ArrayList();
        for (Object obj2 : payloads) {
            if (obj2 instanceof d2) {
                arrayList.add(obj2);
            }
        }
        for (d2 d2Var : arrayList) {
            if (d2Var.f9166b) {
                if (data.f9157c) {
                    gVar.setScaleType(ImageView.ScaleType.CENTER_CROP);
                } else {
                    gVar.setScaleType(ImageView.ScaleType.FIT_CENTER);
                }
            }
            if (d2Var.f9165a) {
                Image image2 = data.f9155a;
                View view2 = holder.itemView;
                yy0.f.e(l.z(view2, "itemView", view2), image2, holder.f, null, null, 12);
            }
            if (d2Var.f9167c) {
                gVar.setZoomable(data.d);
            }
        }
    }
}
