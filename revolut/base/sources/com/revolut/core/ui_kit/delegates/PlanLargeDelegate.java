package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.UiKitMediaView;
import com.revolut.core.ui_kit.internal.views.tag.TagView;
import com.revolut.core.ui_kit_core.displayers.media.Media;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.g20;
import ip0.h20;
import ip0.i20;
import ip0.tz;
import ip0.ws;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0002\u0003\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/PlanLargeDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/g20;", "Lip0/i20;", "<init>", "()V", "ip0/h20", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PlanLargeDelegate extends BaseRecyclerViewDelegate<g20, i20> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f52941c;

    public PlanLargeDelegate() {
        super(R$layout.internal_delegate_plan_large, new tz(16));
        Intrinsics.checkNotNullExpressionValue(new ihm.f(), "create(...)");
        ihm.f fVar = new ihm.f();
        Intrinsics.checkNotNullExpressionValue(fVar, "create(...)");
        this.f52941c = fVar;
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new i20(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_plan_large));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(i20 holder, g20 data, int i, List payloads) {
        Iterator it8;
        int i2;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        View view = holder.f164632m;
        UiKitMediaView uiKitMediaView = holder.f164631l;
        TagView tagView = holder.k;
        TextView textView = holder.f164629h;
        TextView textView2 = holder.f164628g;
        TextView textView3 = holder.f;
        ImageView imageView = holder.i;
        if (payloads.isEmpty()) {
            or0.b.e(this, data.f164328b, textView3, null, 12);
            or0.b.e(this, data.f164329c, textView2, null, 12);
            or0.b.e(this, null, textView, null, 12);
            Media media = data.d;
            Intrinsics.checkNotNullParameter(media, "media");
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            ((jz0.b) or0.u.k(itemView).a0()).b(media, uiKitMediaView, null);
            or0.b.f(this, null, imageView);
            tagView.setVisibility(8);
            view.setVisibility(data.e ? 0 : 8);
            imageView.setOnTouchListener(new j01.e(new View[]{imageView}));
        } else {
            for (Iterator it9 = zhm.c0.N(payloads, h20.class).iterator(); it9.hasNext(); it9 = it8) {
                h20 h20Var = (h20) it9.next();
                if (h20Var.f164495a) {
                    it8 = it9;
                    i2 = 12;
                    or0.b.e(this, data.f164328b, textView3, null, 12);
                } else {
                    it8 = it9;
                    i2 = 12;
                }
                if (h20Var.f164496b) {
                    or0.b.e(this, data.f164329c, textView2, null, i2);
                }
                if (h20Var.f164497c) {
                    data.getClass();
                    or0.b.e(this, null, textView, null, i2);
                }
                if (h20Var.e) {
                    data.getClass();
                    tagView.setVisibility(8);
                }
                if (h20Var.d) {
                    Media media2 = data.d;
                    Intrinsics.checkNotNullParameter(media2, "media");
                    View itemView2 = holder.itemView;
                    Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
                    ((jz0.b) or0.u.k(itemView2).a0()).b(media2, uiKitMediaView, null);
                }
                if (h20Var.f) {
                    data.getClass();
                    or0.b.f(this, null, imageView);
                }
                if (h20Var.f164498g) {
                    view.setVisibility(data.e ? 0 : 8);
                }
            }
        }
        View itemView3 = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView3, "itemView");
        or0.b.c(this, data, itemView3, false, null, 28);
        imageView.setOnClickListener(new ws(this, data, 9));
        data.getClass();
        holder.f164630j.setVisibility(8);
        holder.itemView.setOnClickListener(null);
    }
}
