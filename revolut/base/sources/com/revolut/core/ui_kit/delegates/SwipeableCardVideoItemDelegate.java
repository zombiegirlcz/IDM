package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import aw0.y8;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.richvideoplayer.RichVideoPlayerControlsView;
import com.revolut.core.ui_kit.internal.views.swipeablecards.container.SwipeableCardContainerView;
import com.revolut.core.ui_kit.internal.views.videoplayer.UiKitPlayerView;
import com.revolut.core.ui_kit.views.RichVideoPlayerView;
import com.revolut.core.ui_kit_core.displayers.video.models.UrlVideo;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.aj0;
import ip0.bj0;
import ip0.cj0;
import ip0.dj0;
import ip0.ej0;
import ip0.fg0;
import ip0.fj0;
import ip0.hj0;
import ip0.li0;
import ip0.ri0;
import ip0.wk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0005\u0003\u0002\u0006\u0007\bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/SwipeableCardVideoItemDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/ej0;", "Lip0/hj0;", "<init>", "()V", "ip0/fj0", "ip0/zi0", "ip0/gj0", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SwipeableCardVideoItemDelegate extends BaseRecyclerViewDelegate<ej0, hj0> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e01.a f53514c;
    public final e01.a d;
    public final e01.a e;
    public final ihm.f f;

    public SwipeableCardVideoItemDelegate() {
        super(R$layout.internal_delegate_swipeable_card_video, new ri0(2));
        this.f53514c = new e01.a();
        this.d = new e01.a();
        this.e = new e01.a();
        this.f = v0.a.d("create(...)");
    }

    public static void p(hj0 hj0Var, dj0 dj0Var) {
        if (dj0Var instanceof aj0) {
            hj0Var.f.setPreferredSubtitlesLanguages(((aj0) dj0Var).f163459a);
        } else if (dj0Var instanceof bj0) {
            hj0Var.f.a(null);
        } else {
            if (!(dj0Var instanceof cj0)) {
                throw new NoWhenBranchMatchedException();
            }
            hj0Var.f.a(Integer.valueOf(((cj0) dj0Var).f163751a.d));
        }
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new hj0(kotlin.jvm.internal.s.r(parent, this.f98535a));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void p(hj0 holder, ej0 data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        View view = holder.itemView;
        Intrinsics.i(view, "null cannot be cast to non-null type com.revolut.core.ui_kit.internal.views.swipeablecards.container.SwipeableCardContainerView");
        LinkedHashMap linkedHashMap = ((SwipeableCardContainerView) view).i;
        tu0.a aVar = new tu0.a();
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        linkedHashMap.put("SwipeableCardContainerVideoDelegate", aVar);
        View view2 = holder.itemView;
        view2.setOnTouchListener(new li0(this, view2.getContext(), 3));
        RichVideoPlayerView richVideoPlayerView = holder.f;
        efm.r map = ((RichVideoPlayerControlsView) richVideoPlayerView.f58849a.mo3804getControlsView()).i.map(new fg0(new wk(data, holder, 12), 8));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        this.f53514c.a(map, holder);
        nu0.c cVar = richVideoPlayerView.f58849a;
        efm.r map2 = cVar.q0().map(new fg0(new a5g.i(i, 22), 9));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        this.d.a(map2, holder);
        efm.r map3 = ((UiKitPlayerView) cVar.getContentPlayerView()).f57715r.filter(new mx0.s2(new mul.k(28), 28)).map(new mx0.s2(new mul.k(29), 29));
        Intrinsics.checkNotNullExpressionValue(map3, "map(...)");
        this.e.a(map3, holder);
        ArrayList<fj0> arrayList = new ArrayList();
        Iterator it8 = payloads.iterator();
        while (true) {
            if (!it8.hasNext()) {
                break;
            }
            Object next = it8.next();
            fj0 fj0Var = next instanceof fj0 ? (fj0) next : null;
            if (fj0Var != null) {
                arrayList.add(fj0Var);
            }
        }
        if (arrayList.isEmpty()) {
            richVideoPlayerView.setPlayerInterfaceMode(new y8.a(false));
            p(holder, data.f164114b);
            UrlVideo video = data.f164113a;
            Intrinsics.checkNotNullParameter(video, "video");
            or0.u.k(richVideoPlayerView).V().a(video, cVar.getContentPlayerView(), null);
            return;
        }
        for (fj0 fj0Var2 : arrayList) {
            if (fj0Var2.f164271a) {
                UrlVideo video2 = data.f164113a;
                Intrinsics.checkNotNullParameter(video2, "video");
                or0.u.k(richVideoPlayerView).V().a(video2, cVar.getContentPlayerView(), null);
            }
            if (fj0Var2.f164272b) {
                p(holder, data.f164114b);
            }
        }
    }
}
