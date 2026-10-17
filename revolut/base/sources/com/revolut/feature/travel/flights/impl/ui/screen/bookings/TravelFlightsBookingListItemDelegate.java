package com.revolut.feature.travel.flights.impl.ui.screen.bookings;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.ListingTileDelegate;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ewh.y;
import f5g.b;
import ip0.nv;
import java.util.List;
import koi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/travel/flights/impl/ui/screen/bookings/TravelFlightsBookingListItemDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lf5g/b;", "Lip0/nv;", "<init>", "()V", "feature_travel_flights_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TravelFlightsBookingListItemDelegate extends BaseRecyclerViewDelegate<b, nv> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ListingTileDelegate f93284c;

    public TravelFlightsBookingListItemDelegate() {
        super(R$layout.internal_delegate_listing_tile, new y(29));
        this.f93284c = new ListingTileDelegate();
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        this.f93284c.getClass();
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new nv(s.r(parent, R$layout.internal_delegate_listing_tile));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate, koi.k
    /* JADX INFO: renamed from: j */
    public final void p(RecyclerView.ViewHolder viewHolder, j jVar, int i, List payloads) {
        nv holder = (nv) viewHolder;
        b data = (b) jVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        this.f93284c.p(holder, data.f132313b, i, payloads);
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: m */
    public final void p(koi.b bVar, j jVar, int i, List payloads) {
        nv holder = (nv) bVar;
        b data = (b) jVar;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        this.f93284c.p(holder, data.f132313b, i, payloads);
    }
}
