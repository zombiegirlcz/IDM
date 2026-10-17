package com.revolut.core.ui_kit.delegates;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.i10;
import ip0.j10;
import ip0.k10;
import ip0.l10;
import ip0.m10;
import ip0.tz;
import ip0.ws;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0006\u0003\u0002B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/PlaceholderRowDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/k10;", "Lip0/m10;", "<init>", "()V", "ip0/l10", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PlaceholderRowDelegate extends BaseRecyclerViewDelegate<k10, m10> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f52924c;
    public final ihm.f d;

    public PlaceholderRowDelegate() {
        super(R$layout.internal_delegate_placeholder_row, new tz(12));
        this.f52924c = v0.a.d("create(...)");
        this.d = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new m10(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_placeholder_row));
    }

    public final void p(k10 k10Var, m10 m10Var) {
        c8g.a aVar = k10Var.f164937c;
        if (aVar instanceof i10) {
            or0.b.e(this, null, m10Var.f165301h, null, 12);
            or0.b.f(this, null, m10Var.i);
        } else {
            if (!(aVar instanceof j10)) {
                throw new NoWhenBranchMatchedException();
            }
            j10 j10Var = (j10) aVar;
            or0.b.e(this, j10Var.f164778b, m10Var.f165301h, null, 12);
            or0.b.f(this, j10Var.f164779c, m10Var.i);
        }
        m10Var.f165300g.setMovementMethod(k10Var.e() ? null : ix0.c0.f169220a);
        if (k10Var.e()) {
            m10Var.itemView.setOnClickListener(new ws(this, k10Var, 8));
            m10Var.itemView.setClickable(true);
        } else {
            m10Var.itemView.setOnClickListener(null);
            m10Var.itemView.setClickable(false);
        }
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void p(m10 holder, k10 data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        TextView textView = holder.f165300g;
        ImageView imageView = holder.f;
        if (payloads.isEmpty()) {
            or0.b.f(this, data.f164936b, imageView);
            or0.b.e(this, data.f164937c.u(), textView, new i4g.g(1, this.d, ihm.f.class, "onNext", "onNext(Ljava/lang/Object;)V", 0, 26), 8);
            p(data, holder);
            View itemView = holder.itemView;
            Intrinsics.checkNotNullExpressionValue(itemView, "itemView");
            or0.b.c(this, data, itemView, data.e(), null, 24);
            return;
        }
        for (l10 l10Var : zhm.c0.N(payloads, l10.class)) {
            if (l10Var.f165109a) {
                or0.b.f(this, data.f164936b, imageView);
            }
            if (l10Var.f165110b) {
                or0.b.e(this, data.f164937c.u(), textView, new i4g.g(1, this.d, ihm.f.class, "onNext", "onNext(Ljava/lang/Object;)V", 0, 25), 8);
            }
            if (l10Var.f165111c) {
                p(data, holder);
            }
            if (l10Var.d) {
                View itemView2 = holder.itemView;
                Intrinsics.checkNotNullExpressionValue(itemView2, "itemView");
                or0.b.c(this, data, itemView2, data.e(), null, 24);
            }
        }
    }
}
