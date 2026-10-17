package com.revolut.core.ui_kit.delegates;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.R$layout;
import com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate;
import ip0.t90;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00052\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0005\u0006\u0002\u0007\b\u0003¨\u0006\t"}, d2 = {"Lcom/revolut/core/ui_kit/delegates/ScrollerBoxDelegate;", "Lcom/revolut/recyclerkit/delegates/BaseRecyclerViewDelegate;", "Lcom/revolut/core/ui_kit/delegates/eg;", "Lcom/revolut/core/ui_kit/delegates/fg;", "", "Companion", "a", "ip0/hc0", "ip0/ec0", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ScrollerBoxDelegate extends BaseRecyclerViewDelegate<eg, fg> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f53277c;
    public final ihm.f d;
    public final ihm.f e;
    public final tw0.u f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollerBoxDelegate(List delegates) {
        super(R$layout.internal_delegate_scroller_box, new t90(19));
        Intrinsics.checkNotNullParameter(delegates, "delegates");
        this.f53277c = delegates;
        this.d = v0.a.d("create(...)");
        this.e = v0.a.d("create(...)");
        this.f = new tw0.u();
    }

    @Override // koi.k
    public final RecyclerView.ViewHolder g(ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return new fg(kotlin.jvm.internal.s.r(parent, R$layout.internal_delegate_scroller_box));
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c3  */
    @Override // com.revolut.recyclerkit.delegates.BaseRecyclerViewDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p(com.revolut.core.ui_kit.delegates.fg r17, final com.revolut.core.ui_kit.delegates.eg r18, int r19, java.util.List r20) {
        /*
            Method dump skipped, instruction units count: 700
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.core.ui_kit.delegates.ScrollerBoxDelegate.p(com.revolut.core.ui_kit.delegates.fg, com.revolut.core.ui_kit.delegates.eg, int, java.util.List):void");
    }
}
