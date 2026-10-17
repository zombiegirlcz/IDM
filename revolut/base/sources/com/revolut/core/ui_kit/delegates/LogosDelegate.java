package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.bw;
import ip0.cw;
import ip0.dw;
import ip0.ew;
import ip0.fv;
import ip0.fw;
import ip0.gw;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0002\u0006\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/LogosDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/dw;", "Lip0/fw;", "<init>", "()V", "ip0/ew", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LogosDelegate extends BaseRecyclerViewDelegate<dw, fw> {
    public LogosDelegate() {
        super(R$layout.internal_delegate_logos, new fv(4));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new fw(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_logos));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(fw holder, dw data, int i, List list) {
        int i2;
        int iJ;
        float f;
        Integer num;
        int i3;
        List payloads = list;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, list);
        List list2 = payloads;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it8 = list2.iterator();
            while (true) {
                if (it8.hasNext()) {
                    if (!(it8.next() instanceof ew)) {
                        payloads = null;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (payloads == null) {
            payloads = zhm.f0.f322471a;
        }
        Intrinsics.i(payloads, "null cannot be cast to non-null type kotlin.collections.List<com.revolut.core.ui_kit.delegates.LogosDelegate.Payload>");
        boolean zIsEmpty = payloads.isEmpty();
        Iterator it9 = payloads.iterator();
        boolean z = zIsEmpty;
        while (true) {
            i2 = 0;
            if (!it9.hasNext()) {
                break;
            }
            ew ewVar = (ew) it9.next();
            zIsEmpty = zIsEmpty || ewVar.f164159a;
            z = z || ewVar.f164160b;
        }
        if (zIsEmpty) {
            Set set = data.f163964b;
            bw bwVar = data.f163965c;
            List listD1 = zhm.d0.d1(set);
            int[] iArr = gw.f164473a;
            int i5 = iArr[bwVar.ordinal()];
            if (i5 == 1) {
                iJ = foh.i.j(6);
            } else {
                if (i5 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                iJ = foh.i.j(8);
            }
            View view = holder.itemView;
            ViewGroup viewGroup = holder.f;
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            int i6 = iArr[bwVar.ordinal()];
            if (i6 == 1) {
                f = 24.0f;
            } else {
                if (i6 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                f = 40.0f;
            }
            int iK = kli.a.k(context, f);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (int childCount = viewGroup.getChildCount() - 1; -1 < childCount; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                ImageView imageView = childAt instanceof ImageView ? (ImageView) childAt : null;
                if (imageView != null) {
                    Object tag2 = imageView.getTag();
                    cw cwVar = tag2 instanceof cw ? (cw) tag2 : null;
                    if (cwVar != null) {
                        linkedHashMap.put(cwVar, imageView);
                    }
                    viewGroup.removeViewAt(childCount);
                }
            }
            for (Object obj2 : listD1) {
                int i21 = i2 + 1;
                if (i2 < 0) {
                    zhm.v.s();
                    throw null;
                }
                cw cwVar2 = (cw) obj2;
                ImageView imageView2 = (ImageView) linkedHashMap.get(cwVar2);
                if (imageView2 == null) {
                    num = null;
                    imageView2 = new ImageView(holder.itemView.getContext());
                } else {
                    num = null;
                }
                Integer numValueOf = Integer.valueOf(R$attr.uikit_colorForeground);
                if (cwVar2 != cw.REVOLUT_PAY && cwVar2 != cw.CONTACTLESS) {
                    numValueOf = num;
                }
                Context context2 = holder.itemView.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                imageView2.setLayoutParams(new LinearLayout.LayoutParams(iK, iK));
                imageView2.setTag(cwVar2);
                switch (gw.f164474b[cwVar2.ordinal()]) {
                    case 1:
                        i3 = R$drawable.uikit_icn_24_logo_revolut;
                        break;
                    case 2:
                        i3 = R$drawable.uikit_icn_24_logo_visa_colour;
                        break;
                    case 3:
                        i3 = R$drawable.uikit_icn_24_logo_mc;
                        break;
                    case 4:
                        i3 = R$drawable.uikit_icn_24_amexpay;
                        break;
                    case 5:
                        i3 = R$drawable.uikit_icn_24_apple_pay;
                        break;
                    case 6:
                        i3 = R$drawable.uikit_icn_24_google_pay;
                        break;
                    case 7:
                        i3 = R$drawable.uikit_icn_24_contactless;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                imageView2.setImageResource(i3);
                if (numValueOf != null) {
                    imageView2.setColorFilter(kli.a.s(numValueOf.intValue(), context2));
                }
                Integer numValueOf2 = Integer.valueOf(iJ);
                if (i2 <= 0) {
                    numValueOf2 = num;
                }
                int iIntValue = numValueOf2 != null ? numValueOf2.intValue() : -1;
                Integer numValueOf3 = Integer.valueOf(iJ);
                if (i2 >= zhm.v.j(listD1)) {
                    numValueOf3 = num;
                }
                or0.u.y(imageView2, iIntValue, 0, numValueOf3 != null ? numValueOf3.intValue() : -1, 0, 10);
                viewGroup.addView(imageView2);
                i2 = i21;
            }
        }
        if (z) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.c(this, data, itemView, false, null, 28);
        }
    }
}
