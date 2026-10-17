package com.revolut.core.ui_kit.internal.delegates;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import h30.l;
import ihm.f;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import pof.e;
import pq0.n;
import pq0.o;
import pq0.p;
import pq0.q;
import pq0.r;
import ty0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0005\u0002\u0006\u0003\u0007\bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/internal/delegates/WidgetHeaderDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lpq0/o;", "Lpq0/r;", "<init>", "()V", "pq0/p", "pq0/n", "pq0/q", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WidgetHeaderDelegate extends BaseRecyclerViewDelegate<o, r> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f55848c;

    public WidgetHeaderDelegate() {
        super(R$layout.internal_delegate_card_header, new e(9));
        this.f55848c = v0.a.d("create(...)");
    }

    public static void q(r rVar, o oVar, boolean z) {
        if (z) {
            rVar.f.setImageResource(oVar.e);
        }
        ImageView imageView = rVar.f;
        Context context = rVar.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        q qVar = oVar.f238660a;
        n nVar = oVar.d;
        q qVar2 = q.EXPANDED;
        imageView.setColorFilter(kli.a.s(qVar == qVar2 ? nVar.f238658a : nVar.f238659b, context));
        rVar.f.setRotation(oVar.f238660a == qVar2 ? 90.0f : BitmapDescriptorFactory.HUE_RED);
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new r(s.r(parent, R$layout.internal_delegate_card_header));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(r holder, o data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        if (payloads.isEmpty()) {
            q(holder, data, true);
        } else {
            ArrayList<p> arrayList = new ArrayList();
            for (Object obj2 : payloads) {
                p pVar = obj2 instanceof p ? (p) obj2 : null;
                if (pVar != null) {
                    arrayList.add(pVar);
                }
            }
            for (p pVar2 : arrayList) {
                if (pVar2.f238669a) {
                    q(holder, data, pVar2.f238670b);
                }
            }
        }
        View itemView = holder.itemView;
        TextView textView = holder.i;
        TextView textView2 = holder.f238673h;
        ImageView imageView = holder.f238672g;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        or0.b.c(this, data, itemView, false, null, 28);
        q qVar = data.f238660a;
        TextLocalisedClause textLocalisedClause = data.f238661b;
        int i2 = pq0.s.f238674a[qVar.ordinal()];
        if (i2 == 1) {
            imageView.setVisibility(8);
            View view = holder.itemView;
            yy0.f.e(l.z(view, "itemView", view), null, holder.f238672g, null, null, 12);
            imageView.clearColorFilter();
            View view2 = holder.itemView;
            c.b(l.x(view2, "itemView", view2), textLocalisedClause, holder.f238673h, null, null, 12);
            Context context = holder.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            textView2.setTextColor(kli.a.s(R$attr.uikit_colorForeground, context));
            imageView.clearColorFilter();
            kli.a.b(textView, null, ty0.f.f275450a);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            imageView.setVisibility(8);
            View view3 = holder.itemView;
            yy0.f.e(l.z(view3, "itemView", view3), null, holder.f238672g, null, null, 12);
            Context context2 = holder.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            imageView.setColorFilter(kli.a.s(R$attr.uikit_colorGreyTone50, context2));
            View view4 = holder.itemView;
            c.b(l.x(view4, "itemView", view4), textLocalisedClause, holder.f238673h, null, null, 12);
            Context context3 = holder.itemView.getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
            textView2.setTextColor(kli.a.s(R$attr.uikit_colorGreyTone50, context3));
            kli.a.b(textView, null, ty0.f.f275450a);
        }
        ViewGroup.LayoutParams layoutParams = holder.f.getLayoutParams();
        Intrinsics.i(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        Context context4 = holder.itemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        ((ViewGroup.MarginLayoutParams) layoutParams).setMarginStart(kli.a.w(data.f238662c, context4));
        holder.itemView.setOnClickListener(new kp0.l(this, data, 18));
    }
}
