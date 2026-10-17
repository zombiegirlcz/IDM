package com.revolut.feature.selfserve.sot.impl.ui.summary;

import androidx.recyclerview.widget.DefaultItemAnimator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsNoteDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextWarningDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment;
import czc.c;
import czc.d0;
import czc.h;
import ipi.a;
import jb3.l;
import jt0.b;
import kotlin.Metadata;
import pri.e;
import prk.o;
import te0.w;
import z4l.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/selfserve/sot/impl/ui/summary/SummaryFragment;", "Lcom/revolut/retail/common/ui/activity/builder/fragment/BaseLayoutBuilderFragment;", "Lczc/c;", "Lczc/h;", "<init>", "()V", "feature_selfserve_sot_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SummaryFragment extends BaseLayoutBuilderFragment<c, h> implements h {

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final /* synthetic */ int f85951h0 = 0;
    public final Object f0 = w.y0(new d0(0));
    public final Object g0 = w.y0(new d0(1));

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment
    public final a F() {
        koi.c cVar = new koi.c(0);
        cVar.a(new ListSubheaderDelegate());
        cVar.a(new CellDetailsDelegate());
        cVar.a(new PlainTextWarningDelegate());
        cVar.a((RowDelegate) this.g0.getValue());
        cVar.a((CellDetailsNoteDelegate) this.f0.getValue());
        return new a(new j(cVar, false, 14), (DefaultItemAnimator) null, o.u(), BitmapDescriptorFactory.HUE_RED, 10);
    }

    @Override // com.revolut.retail.core.mvp.BaseMvpFragment
    public final e z() {
        ryc.c cVar = (ryc.c) ((ryc.e) l.q(this));
        return (c) ((e4m.e) new b(cVar.f258309c, cVar.d).d).get();
    }
}
