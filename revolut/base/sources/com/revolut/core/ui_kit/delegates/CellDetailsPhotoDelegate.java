package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0003\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/CellDetailsPhotoDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/w7;", "Lip0/x7;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CellDetailsPhotoDelegate extends BaseRecyclerViewDelegate<ip0.w7, ip0.x7> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f51886c;

    public CellDetailsPhotoDelegate() {
        super(R$layout.internal_delegate_cell_details_photo, new ip0.g4(26));
        this.f51886c = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new ip0.x7(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_cell_details_photo));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(ip0.x7 holder, ip0.w7 data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        View itemView = holder.itemView;
        AppCompatImageView appCompatImageView = holder.f167103h;
        Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
        or0.b.c(this, data, itemView, false, null, 28);
        or0.b.e(this, data.f166940b, holder.f, null, 12);
        TextClause textClause = data.f166941c;
        TextView textView = holder.f167102g;
        or0.b.e(this, textClause, textView, null, 12);
        textView.setVisibility(textClause != null ? 0 : 8);
        yy0.f.e(or0.u.k(appCompatImageView).Q(), data.d, holder.f167103h, null, null, 12);
        appCompatImageView.setOnClickListener(new ap0.f(this, data, 18));
        View itemView2 = holder.itemView;
        Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
        gq0.d[] elements = {hx7.b.f(data.f166940b), textClause != null ? hx7.b.f(textClause) : null};
        Intrinsics.checkNotNullParameter(elements, "elements");
        hx7.b.u(kotlin.collections.d.L(elements), itemView2);
    }
}
