package com.revolut.core.ui_kit.delegates;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0002\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ErrorDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/dg;", "Lip0/eg;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ErrorDelegate extends BaseRecyclerViewDelegate<ip0.dg, ip0.eg> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f52226c;

    public ErrorDelegate() {
        super(R$layout.internal_delegate_error, new ip0.zf(1));
        this.f52226c = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ip0.eg(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_error));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(ip0.eg holder, ip0.dg data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        View itemView = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        or0.b.c(this, data, itemView, false, null, 28);
        ty0.c.b(or0.u.k(holder.f).b0(), data.f163889b, holder.f, null, null, 12);
        TextView textView = holder.f164094g;
        ty0.c.b(or0.u.k(textView).b0(), data.f163890c, holder.f164094g, null, null, 12);
        Context context = textView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        textView.setTextColor(kli.a.s(R$attr.uikit_colorAccent, context));
        textView.setOnClickListener(new ap0.f(this, data, 24));
        textView.setOnTouchListener(new j01.e(new View[]{textView}));
    }
}
