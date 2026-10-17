package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$drawable;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.qj0;
import ip0.ri0;
import ip0.rj0;
import ip0.sj0;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004\u0002\u0006\u0003\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/TabsLoadingDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/qj0;", "Lip0/sj0;", "<init>", "()V", "ip0/rj0", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TabsLoadingDelegate extends BaseRecyclerViewDelegate<qj0, sj0> {

    public static final class a extends ConstraintLayout {
        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(@NotNull Context context) {
            this(context, null, 6, 0);
            Intrinsics.checkNotNullParameter(context, "context");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(@NotNull Context context, AttributeSet attributeSet) {
            this(context, attributeSet, 4, 0);
            Intrinsics.checkNotNullParameter(context, "context");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@NotNull Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            Intrinsics.checkNotNullParameter(context, "context");
            View.inflate(context, R$layout.internal_view_tabs_loading_item, this);
        }

        public /* synthetic */ a(Context context, AttributeSet attributeSet, int i, int i2) {
            this(context, (i & 2) != 0 ? null : attributeSet, 0);
        }
    }

    public TabsLoadingDelegate() {
        super(R$layout.internal_delegate_tabs_loading, new ri0(6));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new sj0(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_tabs_loading));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(sj0 holder, qj0 data, int i, List payloads) {
        boolean z;
        boolean z3;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        int i2 = 0;
        if (payloads.isEmpty()) {
            z = true;
            break;
        }
        List list = payloads;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (Object obj2 : list) {
                Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.TabsLoadingDelegate.Payload");
                if (((rj0) obj2).f166197a) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (payloads.isEmpty()) {
            z3 = true;
            break;
        }
        List list2 = payloads;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            for (Object obj3 : list2) {
                Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.core.ui_kit.delegates.TabsLoadingDelegate.Payload");
                if (((rj0) obj3).f166198b) {
                    z3 = true;
                    break;
                }
            }
        }
        z3 = false;
        if (z) {
            LinearLayout linearLayout = holder.f;
            linearLayout.removeAllViews();
            int i3 = data.f166003b;
            int i5 = 0;
            while (i5 < i3) {
                Context context = linearLayout.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                View aVar = new a(context, null, 6, i2);
                linearLayout.addView(aVar);
                boolean z4 = i5 == 0;
                if (z4) {
                    aVar.setBackgroundResource(R$drawable.internal_tabs_selector);
                } else {
                    aVar.setBackground(null);
                }
                ViewGroup.LayoutParams layoutParams = aVar.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                }
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                float f = z4 ? 96.0f : 80.0f;
                Context context2 = aVar.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                layoutParams2.width = kli.a.k(context2, f);
                Context context3 = aVar.getContext();
                Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                layoutParams2.setMarginEnd(kli.a.k(context3, 8.0f));
                aVar.setLayoutParams(layoutParams2);
                i5++;
            }
        }
        if (z3) {
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.c(this, data, itemView, false, null, 28);
        }
    }
}
