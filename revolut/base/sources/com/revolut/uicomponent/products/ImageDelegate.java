package com.revolut.uicomponent.products;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import com.revolut.uicomponent.R$id;
import com.revolut.uicomponent.R$layout;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import rd0.e;
import uyh.s;
import uyl.p;
import uyl.q;
import yp0.l;
import yp0.n;
import yy0.f;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/uicomponent/products/ImageDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Luyl/q;", "Luyl/p;", "core_ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@yhm.d
public final class ImageDelegate extends BaseRecyclerViewDelegate<q, p> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f107215c;
    public final boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImageDelegate(f imageLoader) {
        super(R$layout.delegate_image_lottie, new s(5));
        Intrinsics.checkNotNullParameter(imageLoader, "imageLoader");
        this.f107215c = imageLoader;
        this.d = true;
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        p pVar = new p(kotlin.jvm.internal.s.r(parent, this.f98535a));
        ImageView imageView = pVar.f;
        imageView.setAdjustViewBounds(false);
        if (this.d) {
            View viewFindViewById = pVar.itemView.findViewById(R$id.clipView);
            Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
            viewFindViewById.setVisibility(8);
        }
        e.r(imageView, new l(n.FACTOR_60, 3));
        return pVar;
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(p holder, q data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        f.e(this.f107215c, data.f284473b, holder.f, null, null, 12);
    }
}
