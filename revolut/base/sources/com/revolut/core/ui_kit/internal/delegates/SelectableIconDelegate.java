package com.revolut.core.ui_kit.internal.delegates;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.delegates.IconSelectorDelegate;
import com.revolut.core.ui_kit.internal.views.CutoutShapeableImageView;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ihm.f;
import ip0.sp;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import op0.r3;
import or0.m;
import or0.u;
import pof.e;
import pq0.i;
import pq0.j;
import py0.c;
import zhm.f0;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/internal/delegates/SelectableIconDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/IconSelectorDelegate$SelectableIconModel;", "Lpq0/i;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SelectableIconDelegate extends BaseRecyclerViewDelegate<IconSelectorDelegate.SelectableIconModel, i> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f55845c;
    public final f d;

    public SelectableIconDelegate() {
        this(true);
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View viewR = s.r(parent, R$layout.internal_delegate_selectable_icon);
        if (!this.f55845c) {
            viewR.setBackgroundResource(0);
        }
        return new i(viewR);
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(i holder, IconSelectorDelegate.SelectableIconModel data, int i, List list) {
        int i2;
        c cVar;
        float f;
        List payloads = list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, list);
        int size = payloads.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                break;
            }
            if (!(payloads.get(i3) instanceof sp)) {
                payloads = null;
                break;
            }
            i3++;
        }
        if (payloads == null) {
            payloads = f0.f322471a;
        }
        boolean zIsEmpty = payloads.isEmpty();
        Iterator it8 = payloads.iterator();
        boolean z = zIsEmpty;
        boolean z3 = z;
        boolean z4 = z3;
        boolean z6 = z4;
        boolean z11 = z6;
        boolean z12 = z11;
        boolean z29 = z12;
        boolean z31 = z29;
        while (true) {
            i2 = 1;
            if (!it8.hasNext()) {
                break;
            }
            sp spVar = (sp) it8.next();
            z = z || spVar.f166378a;
            z3 = z3 || spVar.f166379b;
            z6 = z6 || spVar.f166380c;
            z11 = z11 || spVar.d;
            z12 = z12 || spVar.e;
            zIsEmpty = zIsEmpty || spVar.f;
            z4 = z4 || spVar.f166381g;
            z29 = z29 || spVar.f166382h;
            z31 = z31 || spVar.i;
        }
        View view = holder.itemView;
        GradientDrawable gradientDrawable = holder.k;
        CutoutShapeableImageView cutoutShapeableImageView = holder.f;
        Context context = view.getContext();
        if (zIsEmpty) {
            int i5 = j.f238653a[data.f52503h.ordinal()];
            if (i5 == 1) {
                f = 20.0f;
            } else {
                if (i5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                f = 12.0f;
                i2 = 0;
            }
            gradientDrawable.setShape(i2);
            if (i2 == 0 && gradientDrawable.getCornerRadius() == BitmapDescriptorFactory.HUE_RED) {
                Intrinsics.h(context);
                gradientDrawable.setCornerRadius(kli.a.k(context, 16.0f));
            }
            ShapeAppearanceModel shapeAppearanceModel = new ShapeAppearanceModel();
            Intrinsics.h(context);
            cutoutShapeableImageView.setShapeAppearanceModel(shapeAppearanceModel.withCornerSize(kli.a.k(context, f)));
        }
        if (z4) {
            boolean z41 = data.i;
            Context context2 = cutoutShapeableImageView.getContext();
            if (z41) {
                Intrinsics.h(context2);
                cutoutShapeableImageView.setStrokeColor(kli.a.u(R$attr.uikit_colorGreyTone20, context2));
                cutoutShapeableImageView.setStrokeWidth(kli.a.k(context2, 2.0f));
                cVar = null;
            } else {
                cVar = null;
                cutoutShapeableImageView.setStrokeColor(null);
                cutoutShapeableImageView.setStrokeWidth(BitmapDescriptorFactory.HUE_RED);
            }
            cutoutShapeableImageView.setClipToOutline(z41);
        } else {
            cVar = null;
        }
        if (z) {
            zi0.c.g(cutoutShapeableImageView, data.f52500b);
        }
        if (z3) {
            holder.f238649g.setVisibility(data.f52501c ? 0 : 8);
        }
        if (z6) {
            Intrinsics.h(context);
            gradientDrawable.setStroke(kli.a.k(context, 2.0f), kli.a.s(data.f52502g, context));
        }
        if (z11) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            itemView.setClickable(data.e);
            itemView.setAlpha(data.e ? 1.0f : 0.5f);
        }
        if (z12) {
            holder.f238650h.setBadgeAndVisibility(data.f, holder.f238652l);
        }
        if (z29) {
            holder.i.setVisibility(data.f52504j ? 0 : 8);
        }
        if (z31) {
            kli.a.b(holder.f238651j, data.d, ty0.f.f275450a);
        }
        boolean z49 = data.e;
        Clause clause = data.k;
        if (z49) {
            Clause clause2 = clause == null ? data.d : clause;
            View itemView2 = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
            c cVar2 = clause2 != null ? new c(clause2) : cVar;
            m.a(itemView2);
            itemView2.setOnClickListener(new r3(data, cVar2, this, data, 2));
        } else {
            u.o(cutoutShapeableImageView);
        }
        View itemView3 = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView3, "itemView");
        pd.b.p(itemView3, clause);
        View itemView4 = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView4, "itemView");
        pd.b.i(itemView4, data.f52501c);
    }

    public SelectableIconDelegate(boolean z) {
        super(R$layout.internal_delegate_selectable_icon, new e(5));
        this.f55845c = z;
        this.d = v0.a.d("create(...)");
    }
}
