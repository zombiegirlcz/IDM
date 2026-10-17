package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.LargeVoucherTileDelegate;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.core.ui_kit.internal.views.UiKitMediaView;
import com.revolut.core.ui_kit.internal.views.tag.TagView;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.views.OverlappedIconsView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.flexbox.FlexboxLayout;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.ao;
import ip0.hq;
import ip0.os;
import ip0.ps;
import ip0.qs;
import ip0.rs;
import ip0.ts;
import ip0.vs;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0005\u0002\u0006\u0007\b\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/LargeVoucherTileDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/qs;", "Lip0/vs;", "<init>", "()V", "ip0/us", "ip0/os", "ip0/rs", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LargeVoucherTileDelegate extends BaseRecyclerViewDelegate<qs, vs> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e01.a f52628c;
    public final ihm.f d;
    public final ihm.f e;

    public LargeVoucherTileDelegate() {
        super(R$layout.internal_delegate_large_voucher_tile, new hq(12));
        this.f52628c = new e01.a();
        this.d = v0.a.d("create(...)");
        this.e = v0.a.d("create(...)");
    }

    public static void q(qs qsVar, vs vsVar) {
        SmallActionButton smallActionButton = vsVar.k;
        os osVar = qsVar.f166046h;
        knm.b.z(smallActionButton, osVar != null, null, 14);
        if (osVar != null) {
            smallActionButton.i(osVar.f165723b);
            smallActionButton.setIcon(osVar.f165722a);
        }
    }

    public static void r(qs qsVar, vs vsVar) {
        ps psVar = qsVar.f166043b;
        vsVar.f166882g.setImageScaleType(ImageView.ScaleType.CENTER_CROP);
        xv0.m.e0(vsVar, qsVar.f166043b.f165861a, vsVar.f166882g.i(), null, 14);
    }

    public static void s(qs qsVar, vs vsVar) {
        View view = vsVar.itemView;
        yy0.f.e(h30.l.z(view, "itemView", view), qsVar.f166045g, vsVar.i, null, null, 12);
        ImageView imageView = vsVar.i;
        Image image = qsVar.f166045g;
        knm.b.z(imageView, image != null, null, 14);
        boolean z = image != null;
        View view2 = vsVar.f166884j;
        UiKitMediaView uiKitMediaView = vsVar.f166882g;
        Context context = vsVar.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        pv0.a.a(view2, uiKitMediaView, context, z, true);
    }

    public static void t(qs qsVar, vs vsVar) {
        vsVar.f166885l.setVisibility(qsVar.f166044c instanceof ts ? 0 : 8);
        vsVar.f166888p.setVisibility(qsVar.f166044c instanceof ts ? 8 : 0);
    }

    public static void u(qs qsVar, vs vsVar) {
        FlexboxLayout flexboxLayout = vsVar.f166886m;
        flexboxLayout.removeAllViews();
        List list = qsVar.d;
        flexboxLayout.setVisibility((list == null || list.isEmpty()) ? 8 : 0);
        List<TagViewData> list2 = qsVar.d;
        if (list2 != null) {
            if (list2.isEmpty()) {
                list2 = null;
            }
            if (list2 != null) {
                for (TagViewData tagViewData : list2) {
                    Context context = vsVar.itemView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                    TagView tagView = new TagView(context, null, 6, 0);
                    tagView.setContent(tagViewData);
                    vsVar.f166886m.addView(tagView);
                }
            }
        }
    }

    public static void v(qs qsVar, vs vsVar) {
        View itemView = vsVar.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        yy0.f fVarQ = or0.u.k(itemView).Q();
        qsVar.getClass();
        yy0.f.e(fVarQ, null, vsVar.f166883h, null, null, 12);
        knm.b.z(vsVar.f166883h, false, null, 14);
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new vs(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_large_voucher_tile));
    }

    /* JADX WARN: Type inference failed for: r5v13, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v5, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(vs holder, final qs data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        TextView textView = holder.o;
        TextView textView2 = holder.f166887n;
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        or0.b.c(this, data, itemView, false, null, 28);
        if (payloads.isEmpty()) {
            r(data, holder);
            t(data, holder);
            u(data, holder);
            or0.b.e(this, data.e, textView2, null, 12);
            or0.b.e(this, data.f, textView, null, 12);
            s(data, holder);
            q(data, holder);
            v(data, holder);
        } else {
            List list = payloads;
            ArrayList<rs> arrayList = new ArrayList(zhm.w.t(list, 10));
            for (Object obj2 : list) {
                Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.LargeVoucherTileDelegate.Payload");
                arrayList.add((rs) obj2);
            }
            for (rs rsVar : arrayList) {
                if (rsVar.f166228a) {
                    r(data, holder);
                }
                if (rsVar.f166229b) {
                    t(data, holder);
                }
                if (rsVar.f166230c) {
                    u(data, holder);
                }
                if (rsVar.d) {
                    or0.b.e(this, data.e, textView2, null, 12);
                }
                if (rsVar.e) {
                    or0.b.e(this, data.f, textView, null, 12);
                }
                if (rsVar.f) {
                    s(data, holder);
                }
                if (rsVar.f166231g) {
                    q(data, holder);
                }
                if (rsVar.f166232h) {
                    v(data, holder);
                }
                if (rsVar.f166233j) {
                    OverlappedIconsView overlappedIconsView = holder.f166889q;
                    data.getClass();
                    overlappedIconsView.setVisibility(8);
                }
            }
        }
        final int i2 = 0;
        holder.itemView.setOnClickListener(new View.OnClickListener(this) { // from class: ip0.ns

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LargeVoucherTileDelegate f165564b;

            {
                this.f165564b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        this.f165564b.d.onNext(data);
                        break;
                    default:
                        this.f165564b.e.onNext(data);
                        break;
                }
            }
        });
        final int i3 = 1;
        holder.f166883h.setOnClickListener(new View.OnClickListener(this) { // from class: ip0.ns

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LargeVoucherTileDelegate f165564b;

            {
                this.f165564b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        this.f165564b.d.onNext(data);
                        break;
                    default:
                        this.f165564b.e.onNext(data);
                        break;
                }
            }
        });
        efm.r map = holder.k.f56386h.map(new ao(24, new ip0.ad(data, 17)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        this.f52628c.a(map, holder);
    }
}
