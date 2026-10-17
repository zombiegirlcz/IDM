package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.a70;
import ip0.l40;
import ip0.ws;
import ip0.x60;
import ip0.y60;
import ip0.z60;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0002\u0003\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/PromptMarketingContentLoadingDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/x60;", "Lip0/z60;", "<init>", "()V", "ip0/y60", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PromptMarketingContentLoadingDelegate extends BaseRecyclerViewDelegate<x60, z60> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f53118c;

    public PromptMarketingContentLoadingDelegate() {
        super(R$layout.internal_delegate_prompt_marketing_loading, new l40(15));
        this.f53118c = yhm.j.c(yhm.k.NONE, new il9.p(28));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new z60(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_prompt_marketing_loading));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ihm.f p() {
        return (ihm.f) this.f53118c.getValue();
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void p(z60 holder, x60 data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        View view = holder.o;
        View view2 = holder.f167406n;
        View view3 = holder.f167405m;
        View view4 = holder.f167404l;
        View view5 = holder.k;
        View view6 = holder.f167403j;
        View view7 = holder.i;
        AppCompatImageView appCompatImageView = holder.f167401g;
        ArrayList<y60> arrayList = new ArrayList();
        for (Object obj2 : payloads) {
            if (obj2 instanceof y60) {
                arrayList.add(obj2);
            }
        }
        boolean zIsEmpty = payloads.isEmpty();
        boolean z = zIsEmpty;
        for (y60 y60Var : arrayList) {
            zIsEmpty = zIsEmpty || y60Var.f167257a;
            z = z || y60Var.f167258b;
        }
        if (zIsEmpty) {
            int i2 = a70.f163404a[data.f167100b.ordinal()];
            if (i2 == 1) {
                View[] views = {view7, view6, view5};
                Intrinsics.checkNotNullParameter(views, "views");
                for (View view8 : views) {
                    view8.setVisibility(0);
                    view8.setAlpha(1.0f);
                }
                View[] views2 = {view4, view3, view2, view};
                Intrinsics.checkNotNullParameter(views2, "views");
                for (View view9 : views2) {
                    view9.setVisibility(8);
                    view9.setAlpha(1.0f);
                }
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                View[] views3 = {view7, view6, view5};
                Intrinsics.checkNotNullParameter(views3, "views");
                for (View view10 : views3) {
                    view10.setVisibility(8);
                    view10.setAlpha(1.0f);
                }
                View[] views4 = {view4, view3, view2, view};
                Intrinsics.checkNotNullParameter(views4, "views");
                for (View view11 : views4) {
                    view11.setVisibility(0);
                    view11.setAlpha(1.0f);
                }
            }
        }
        if (z) {
            zi0.c.g(appCompatImageView, data.f167101c);
        }
        if (data.f167101c != null) {
            appCompatImageView.setOnClickListener(new ws(this, data, 15));
        } else {
            appCompatImageView.setOnClickListener(null);
        }
        ifk.b.r(holder.f);
    }
}
