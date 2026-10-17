package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.aq;
import ip0.bq;
import ip0.dk;
import ip0.zp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0003\u0002\u0006\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ImageAttachmentDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/zp;", "Lip0/bq;", "<init>", "()V", "ip0/aq", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ImageAttachmentDelegate extends BaseRecyclerViewDelegate<zp, bq> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f52515c;

    public ImageAttachmentDelegate() {
        super(R$layout.internal_delegate_image_attachment, new dk(27));
        v0.a.d("create(...)");
        this.f52515c = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new bq(kotlin.jvm.internal.s.r(parent, this.f98535a));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.ArrayList] */
    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(bq holder, zp data, int i, List payloads) {
        ?? arrayList;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        if (payloads != null) {
            arrayList = new ArrayList();
            for (Object obj2 : payloads) {
                if (obj2 instanceof aq) {
                    arrayList.add(obj2);
                }
            }
        } else {
            arrayList = zhm.f0.f322471a;
        }
        if (arrayList.isEmpty()) {
            q(holder, data.f167528a);
            return;
        }
        Iterator it8 = ((Iterable) arrayList).iterator();
        while (it8.hasNext()) {
            if (((aq) it8.next()).f163483a) {
                q(holder, data.f167528a);
            }
        }
    }

    public final void q(bq bqVar, UrlImage urlImage) {
        or0.u.v(R$attr.uikit_dp16, bqVar.f163654g);
        View view = bqVar.itemView;
        yy0.f.e(h30.l.z(view, "itemView", view), urlImage, bqVar.f163654g, null, null, 12);
        View view2 = bqVar.f;
        view2.setVisibility(0);
        view2.setOnClickListener(new ip0.g0(this, 5));
    }
}
