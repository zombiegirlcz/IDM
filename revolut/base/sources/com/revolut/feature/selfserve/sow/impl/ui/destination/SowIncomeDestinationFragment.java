package com.revolut.feature.selfserve.sow.impl.ui.destination;

import androidx.recyclerview.widget.DefaultItemAnimator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.InputChecklistDelegate;
import com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment;
import ipi.a;
import jb3.l;
import kotlin.Metadata;
import pri.e;
import prk.o;
import te0.w;
import uz8.s;
import uzc.c;
import uzc.d;
import vzc.m;
import z4l.j;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/selfserve/sow/impl/ui/destination/SowIncomeDestinationFragment;", "Lcom/revolut/retail/common/ui/activity/builder/fragment/BaseLayoutBuilderFragment;", "Luzc/c;", "Luzc/d;", "<init>", "()V", "feature_selfserve_sow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SowIncomeDestinationFragment extends BaseLayoutBuilderFragment<c, d> implements d {
    public static final /* synthetic */ int g0 = 0;
    public final Object f0 = w.y0(new s(3));

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment
    public final a F() {
        return new a(new j(7, u.c((InputChecklistDelegate) this.f0.getValue()), false), (DefaultItemAnimator) null, o.u(), BitmapDescriptorFactory.HUE_RED, 10);
    }

    @Override // com.revolut.retail.core.mvp.BaseMvpFragment
    public final e z() {
        vzc.c cVar = (vzc.c) ((m) l.q(this));
        return (c) new vzc.d(cVar.f293467b, cVar.f293468c, 1).f293485c.get();
    }
}
