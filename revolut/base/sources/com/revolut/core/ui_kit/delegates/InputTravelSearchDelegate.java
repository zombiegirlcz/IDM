package com.revolut.core.ui_kit.delegates;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.views.InputTravelAirportSearchItemView;
import com.revolut.core.ui_kit.views.InputTravelDatesGuestsItemView;
import com.revolut.core.ui_kit.views.InputTravelSearchView;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.ao;
import ip0.hq;
import ip0.ur;
import ip0.vr;
import ip0.wr;
import ip0.xr;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0003\u0002\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/InputTravelSearchDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/vr;", "Lip0/xr;", "<init>", "()V", "ip0/wr", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InputTravelSearchDelegate extends BaseRecyclerViewDelegate<vr, xr> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e01.a f52599c;
    public final e01.a d;
    public final e01.a e;
    public final e01.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e01.a f52600g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e01.a f52601h;
    public final e01.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e01.a f52602j;

    public InputTravelSearchDelegate() {
        super(R$layout.internal_delegate_input_travel_search, new hq(6));
        this.f52599c = new e01.a();
        this.d = new e01.a();
        this.e = new e01.a();
        this.f = new e01.a();
        this.f52600g = new e01.a();
        this.f52601h = new e01.a();
        this.i = new e01.a();
        this.f52602j = new e01.a();
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new xr(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_input_travel_search));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(xr holder, vr data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        InputTravelSearchView inputTravelSearchView = holder.f;
        int size = payloads.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            if (!(payloads.get(i2) instanceof wr)) {
                payloads = null;
                break;
            }
            i2++;
        }
        if (payloads == null) {
            payloads = zhm.f0.f322471a;
        }
        boolean zIsEmpty = payloads.isEmpty();
        Iterator it8 = payloads.iterator();
        while (it8.hasNext()) {
            zIsEmpty = zIsEmpty || ((wr) it8.next()).f167058a;
        }
        if (zIsEmpty) {
            inputTravelSearchView.setConfiguration(data.f166877b);
        }
        efm.r map = inputTravelSearchView.f.a().map(new ao(21, new ur(data, 3)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        this.f52599c.a(map, holder);
        InputTravelAirportSearchItemView inputTravelAirportSearchItemView = inputTravelSearchView.f58673g;
        InputTravelDatesGuestsItemView inputTravelDatesGuestsItemView = inputTravelSearchView.f58674h;
        InputTravelAirportSearchItemView inputTravelAirportSearchItemView2 = inputTravelSearchView.f58673g;
        efm.r map2 = inputTravelAirportSearchItemView.f58664a.getTextInput1().u0.map(new ao(14, new ur(data, 7)));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        this.d.a(map2, holder);
        efm.r map3 = inputTravelAirportSearchItemView2.f58664a.getTextInput2().u0.map(new ao(15, new ur(data, 0)));
        Intrinsics.checkNotNullExpressionValue(map3, "map(...)");
        this.e.a(map3, holder);
        efm.r map4 = inputTravelAirportSearchItemView2.f58664a.f58662g.map(new ao(16, new ur(data, 1)));
        Intrinsics.checkNotNullExpressionValue(map4, "map(...)");
        this.f.a(map4, holder);
        efm.r map5 = inputTravelDatesGuestsItemView.f0().map(new ao(17, new ur(data, 2)));
        Intrinsics.checkNotNullExpressionValue(map5, "map(...)");
        this.f52600g.a(map5, holder);
        efm.r map6 = inputTravelSearchView.i.u0.map(new ao(18, new ur(data, 4)));
        Intrinsics.checkNotNullExpressionValue(map6, "map(...)");
        this.f52601h.a(map6, holder);
        efm.r map7 = inputTravelSearchView.f58675j.u0.map(new ao(19, new ur(data, 5)));
        Intrinsics.checkNotNullExpressionValue(map7, "map(...)");
        this.i.a(map7, holder);
        efm.r map8 = inputTravelDatesGuestsItemView.g0().map(new ao(20, new ur(data, 6)));
        Intrinsics.checkNotNullExpressionValue(map8, "map(...)");
        this.f52602j.a(map8, holder);
    }
}
