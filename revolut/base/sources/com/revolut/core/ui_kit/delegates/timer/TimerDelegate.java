package com.revolut.core.ui_kit.delegates.timer;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.core.ui_kit.internal.views.TimerView;
import com.revolut.core.ui_kit.internal.views.k;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import e01.a;
import efm.r;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import ms0.z4;
import nmb.v;
import noi.l;
import np0.b;
import np0.c;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u0002\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/timer/TimerDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lnp0/b;", "Lnp0/c;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TimerDelegate extends BaseRecyclerViewDelegate<b, c> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f54791c;
    public final a d;

    public TimerDelegate() {
        super(R$layout.internal_delegate_circular_timer, new v(20));
        this.f54791c = new a();
        this.d = new a();
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new c(s.r(parent, R$layout.internal_delegate_circular_timer));
    }

    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    public final void p(c holder, b data, int i, List payloads) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        super.p(holder, data, i, payloads);
        or0.b.e(this, data.d, holder.f218109g, null, 12);
        TimerView timerView = holder.f;
        timerView.setup(new z4(data.f218107b, data.f218108c));
        k kVar = timerView.f56450j;
        r map = kVar.f57221b.map(new l(2, new np0.a(data, 0)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        this.f54791c.a(map, holder);
        r map2 = kVar.f57220a.map(new l(3, new np0.a(data, 1)));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        this.d.a(map2, holder);
    }
}
