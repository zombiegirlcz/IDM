package com.revolut.core.ui_kit.delegates;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.es;
import ip0.hq;
import ip0.hs;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0005\u0007\u0002\u0003\b\tB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/LargeSliderDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lip0/es;", "Lip0/hs;", "<init>", "()V", "Companion", "ip0/fs", "ip0/gs", "a", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LargeSliderDelegate extends BaseRecyclerViewDelegate<es, hs> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ihm.f f52627c;

    public LargeSliderDelegate() {
        super(R$layout.internal_delegate_large_slider, new hq(9));
        this.f52627c = v0.a.d("create(...)");
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new hs(kotlin.jvm.internal.s.r(parent, this.f98535a));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007a  */
    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(ip0.hs r17, ip0.es r18, int r19, java.util.List r20) {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.delegates.LargeSliderDelegate.p(ip0.hs, ip0.es, int, java.util.List):void");
    }
}
