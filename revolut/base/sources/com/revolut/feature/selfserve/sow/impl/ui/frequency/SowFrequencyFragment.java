package com.revolut.feature.selfserve.sow.impl.ui.frequency;

import androidx.recyclerview.widget.DefaultItemAnimator;
import aw1.a;
import b0d.d;
import b0d.e;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.RowLoadingDelegate;
import com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment;
import jb3.l;
import koi.c;
import kotlin.Metadata;
import prk.o;
import te0.w;
import vzc.b;
import vzc.h;
import vzc.m;
import z4l.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/selfserve/sow/impl/ui/frequency/SowFrequencyFragment;", "Lcom/revolut/retail/common/ui/activity/builder/fragment/BaseLayoutBuilderFragment;", "Lb0d/d;", "Lb0d/e;", "<init>", "()V", "feature_selfserve_sow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SowFrequencyFragment extends BaseLayoutBuilderFragment<d, e> implements e {
    public static final /* synthetic */ int g0 = 0;
    public final Object f0 = w.y0(new a(18));

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment
    public final ipi.a F() {
        c cVar = new c(0);
        cVar.a(new ListSubheaderDelegate());
        cVar.a(new RowLoadingDelegate());
        cVar.a((InputChecklistDelegate) this.f0.getValue());
        return new ipi.a(new j(cVar, false, 14), (DefaultItemAnimator) null, o.u(), BitmapDescriptorFactory.HUE_RED, 10);
    }

    @Override // com.revolut.retail.core.mvp.BaseMvpFragment
    public final pri.e z() {
        vzc.c cVar = (vzc.c) ((m) l.q(this));
        b bVar = cVar.f293467b;
        vzc.c cVar2 = cVar.f293468c;
        ryc.a aVar = new ryc.a();
        aVar.f258289a = cVar2;
        aVar.f258290b = e4m.b.b(new h(bVar, 0, cVar2, aVar));
        return (d) ((e4m.e) aVar.f258290b).get();
    }
}
