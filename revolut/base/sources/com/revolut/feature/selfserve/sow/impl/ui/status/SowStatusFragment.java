package com.revolut.feature.selfserve.sow.impl.ui.status;

import androidx.recyclerview.widget.DefaultItemAnimator;
import com.revolut.core.ui_kit.delegates.ErrorDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment;
import fp3.a;
import fyh.k;
import g0d.d;
import g0d.e;
import jb3.l;
import koi.c;
import kotlin.Metadata;
import prk.o;
import te0.w;
import vzc.m;
import z4l.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/selfserve/sow/impl/ui/status/SowStatusFragment;", "Lcom/revolut/retail/common/ui/activity/builder/fragment/BaseLayoutBuilderFragment;", "Lg0d/d;", "Lg0d/e;", "<init>", "()V", "feature_selfserve_sow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SowStatusFragment extends BaseLayoutBuilderFragment<d, e> implements e {
    public static final /* synthetic */ int j0 = 0;
    public final Object f0 = w.y0(new k(20));
    public final Object g0 = w.y0(new a(this, 12));

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final Object f85968h0 = w.y0(new k(21));
    public final Object i0 = w.y0(new k(22));

    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment
    public final ipi.a F() {
        c cVar = new c(0);
        cVar.a(new PlainTextWarningDelegate());
        cVar.a(new RowLoadingDelegate());
        cVar.a((ListSubheaderDelegate) this.i0.getValue());
        cVar.a((ErrorDelegate) this.f85968h0.getValue());
        cVar.a((RowDelegate) this.f0.getValue());
        cVar.a((SwipeToActionDelegate) this.g0.getValue());
        return new ipi.a(new j(cVar, false, 14), (DefaultItemAnimator) null, o.u(), 88.0f, 2);
    }

    @Override // com.revolut.retail.core.mvp.BaseMvpFragment
    public final pri.e z() {
        vzc.c cVar = (vzc.c) ((m) l.q(this));
        return (d) new vzc.d(cVar.f293467b, cVar.f293468c, 2).f293485c.get();
    }
}
