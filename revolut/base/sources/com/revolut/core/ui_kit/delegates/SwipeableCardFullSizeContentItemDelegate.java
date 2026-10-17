package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.swipeablecards.SwipeableCardContentHeaderView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.je0;
import ip0.li0;
import ip0.oi0;
import ip0.pi0;
import ip0.qi0;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0003\u0002\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/SwipeableCardFullSizeContentItemDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/oi0;", "Lip0/qi0;", "<init>", "()V", "ip0/pi0", "ip0/ni0", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SwipeableCardFullSizeContentItemDelegate extends BaseRecyclerViewDelegate<oi0, qi0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f53511c;

    public SwipeableCardFullSizeContentItemDelegate() {
        super(R$layout.internal_delegate_swipeable_card_full_size_content, new je0(29));
        this.f53511c = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new qi0(kotlin.jvm.internal.s.r(parent, this.f98535a));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(qi0 holder, oi0 data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        SwipeableCardContentHeaderView swipeableCardContentHeaderView = holder.f;
        boolean zN = ue0.e.n(payloads);
        boolean zN2 = ue0.e.n(payloads);
        boolean zN3 = ue0.e.n(payloads);
        boolean zN4 = ue0.e.n(payloads);
        boolean zN5 = ue0.e.n(payloads);
        Iterator it8 = payloads.iterator();
        while (true) {
            if (!it8.hasNext()) {
                break;
            }
            Object next = it8.next();
            if (next instanceof pi0) {
                zN = zN || ((pi0) next).f165827a.f165384a;
                zN2 = zN2 || ((pi0) next).f165827a.f165385b;
                zN3 = zN3 || ((pi0) next).f165827a.f165386c;
                zN4 = zN4 || ((pi0) next).f165828b;
                zN5 = (zN5 != 0 || ((pi0) next).f165829c) ? 1 : 0;
            }
        }
        if (zN) {
            swipeableCardContentHeaderView.setSmallTitleStart(data.f165671b.f165517a);
        }
        if (zN2) {
            swipeableCardContentHeaderView.setSmallTitleEnd(data.f165671b.f165518b);
        }
        if (zN3) {
            swipeableCardContentHeaderView.setBigTitle(data.f165671b.f165519c);
        }
        if (zN4) {
            kli.a.b(holder.f165986g, data.f165672c, ty0.f.f275450a);
        }
        if (zN5 != 0) {
            Context context = holder.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            yy0.f fVarQ = jh.d.f(context).Q();
            Image imageA = data.d;
            if (imageA != null) {
                float f = holder.itemView.getContext().getResources().getDisplayMetrics().density;
                Intrinsics.checkNotNullParameter(imageA, "<this>");
                if (f >= 3.0d && (imageA instanceof UrlImage)) {
                    UrlImage urlImage = (UrlImage) imageA;
                    if (kotlin.text.a0.y(urlImage.f60017a, ".gif", false)) {
                        imageA = UrlImage.a(urlImage, null, null, null, null, null, 458751);
                    }
                }
            } else {
                imageA = null;
            }
            yy0.f.e(fVarQ, imageA, holder.f165987h, null, null, 12);
            holder.f165987h.setVisibility(data.d == null ? 8 : 0);
        }
        View view = holder.itemView;
        view.setOnTouchListener(new li0(this, view.getContext(), 1));
    }
}
