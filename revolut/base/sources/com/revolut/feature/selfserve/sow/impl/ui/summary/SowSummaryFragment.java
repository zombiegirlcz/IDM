package com.revolut.feature.selfserve.sow.impl.ui.summary;

import androidx.recyclerview.widget.DefaultItemAnimator;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment;
import gx2.a;
import h0d.c;
import h0d.k;
import jb3.l;
import kotlin.Metadata;
import pri.e;
import prk.o;
import te0.w;
import vzc.m;
import z4l.j;
import zhm.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/selfserve/sow/impl/ui/summary/SowSummaryFragment;", "Lcom/revolut/retail/common/ui/activity/builder/fragment/BaseLayoutBuilderFragment;", "Lh0d/c;", "Lh0d/k;", "<init>", "()V", "feature_selfserve_sow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SowSummaryFragment extends BaseLayoutBuilderFragment<c, k> implements k {
    public static final /* synthetic */ int g0 = 0;
    public final Object f0 = w.y0(new a(11));

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment
    public final ipi.a F() {
        return new ipi.a(new j(7, v.k(new RowLoadingDelegate(), (RowDelegate) this.f0.getValue(), new ListSubheaderDelegate(), new CellDetailsNoteDelegate(), new CellDetailsDelegate(), new PlainTextDelegate()), false), (DefaultItemAnimator) null, o.u(), 88.0f, 2);
    }

    @Override // com.revolut.retail.core.mvp.BaseMvpFragment
    public final e z() {
        vzc.c cVar = (vzc.c) ((m) l.q(this));
        return (c) new vzc.e(cVar.f293467b, cVar.f293468c, 2).f293488c.get();
    }
}
