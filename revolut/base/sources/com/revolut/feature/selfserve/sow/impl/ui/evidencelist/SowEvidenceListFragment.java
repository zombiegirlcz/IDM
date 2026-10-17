package com.revolut.feature.selfserve.sow.impl.ui.evidencelist;

import androidx.recyclerview.widget.DefaultItemAnimator;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment;
import ipi.a;
import jb3.l;
import koi.c;
import kotlin.Metadata;
import pri.e;
import prk.o;
import te0.w;
import vzc.b;
import vzc.g;
import vzc.m;
import yui.d;
import yzc.i;
import yzc.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/selfserve/sow/impl/ui/evidencelist/SowEvidenceListFragment;", "Lcom/revolut/retail/common/ui/activity/builder/fragment/BaseLayoutBuilderFragment;", "Lyzc/i;", "Lyzc/j;", "<init>", "()V", "feature_selfserve_sow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SowEvidenceListFragment extends BaseLayoutBuilderFragment<i, j> implements j {
    public static final /* synthetic */ int g0 = 0;
    public final Object f0 = w.y0(new d(17));

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment
    public final a F() {
        c cVar = new c(0);
        cVar.a(new ListSubheaderDelegate());
        cVar.a(new RowLoadingDelegate());
        cVar.a(new PlainTextDelegate());
        cVar.a((RowDelegate) this.f0.getValue());
        return new a(new z4l.j(cVar, false, 14), (DefaultItemAnimator) null, o.u(), 88.0f, 2);
    }

    @Override // com.revolut.retail.core.mvp.BaseMvpFragment
    public final e z() {
        vzc.c cVar = (vzc.c) ((m) l.q(this));
        b bVar = cVar.f293467b;
        vzc.c cVar2 = cVar.f293468c;
        g gVar = new g();
        int i = 22;
        gVar.f293492a = e4m.b.b(new r7d.w(bVar, cVar2, gVar, 2, i));
        gVar.f293493b = e4m.b.b(new r7d.w(bVar, cVar2, gVar, 1, i));
        gVar.f293494c = e4m.b.b(new r7d.w(bVar, cVar2, gVar, 3, i));
        gVar.d = e4m.b.b(new r7d.w(bVar, cVar2, gVar, 5, i));
        gVar.e = e4m.b.b(new r7d.w(bVar, cVar2, gVar, 4, i));
        return (i) e4m.b.b(new r7d.w(bVar, cVar2, gVar, 0, i)).get();
    }
}
