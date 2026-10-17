package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.ContextThemeWrapper;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.internal.views.SecondaryBackgroundConstraintLayout;
import com.revolut.core.ui_kit.internal.views.SmallActionButton;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0003\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ActionWidgetLoadingDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/s;", "Lip0/u;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ActionWidgetLoadingDelegate extends BaseRecyclerViewDelegate<ip0.s, ip0.u> {
    public ActionWidgetLoadingDelegate() {
        super(R$layout.internal_delegate_action_widget_loading, new ip0.c(5));
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ip0.u(kotlin.jvm.internal.s.r(parent, this.f98535a));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(ip0.u holder, ip0.s data, int i, List payloads) {
        Context context;
        Drawable drawable;
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        ifk.b.r(holder.f);
        ip0.r theme = data.f166257b;
        Intrinsics.checkNotNullParameter(theme, "theme");
        int i2 = ip0.t.f166408a[theme.ordinal()];
        if (i2 == 1 || i2 == 2) {
            context = holder.itemView.getContext();
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            context = new ContextThemeWrapper(holder.itemView.getContext(), R$style.UiKitTheme);
        }
        View view = holder.itemView;
        Intrinsics.i(view, "null cannot be cast to non-null type com.revolut.core.ui_kit.internal.views.SecondaryBackgroundConstraintLayout");
        SecondaryBackgroundConstraintLayout secondaryBackgroundConstraintLayout = (SecondaryBackgroundConstraintLayout) view;
        Integer numA = theme.a();
        if (numA != null) {
            drawable = holder.itemView.getContext().getDrawable(numA.intValue());
        } else {
            drawable = null;
        }
        secondaryBackgroundConstraintLayout.setSecondaryBackground(drawable);
        holder.f166569g.setImageDrawable(context.getDrawable(theme.b()));
        Drawable drawable2 = context.getDrawable(theme.e());
        holder.f166570h.setBackground(drawable2);
        holder.i.setBackground(drawable2);
        holder.f166571j.setBackground(drawable2);
        SmallActionButton smallActionButton = holder.k;
        ms0.e4 e4Var = ms0.e4.EnabledNonClickable;
        smallActionButton.setState(e4Var);
        smallActionButton.i(theme.c());
        SmallActionButton smallActionButton2 = holder.f166572l;
        smallActionButton2.setState(e4Var);
        smallActionButton2.i(theme.d());
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        or0.b.c(this, data, itemView, false, null, 28);
    }
}
