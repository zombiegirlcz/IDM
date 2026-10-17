package com.revolut.feature.selfserve.sot.impl.ui.description;

import androidx.recyclerview.widget.DefaultItemAnimator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment;
import ipi.a;
import jb3.l;
import kotlin.Metadata;
import pri.e;
import prk.o;
import qu1.d;
import qyc.b;
import qyc.c;
import r6e.m;
import te0.w;
import z4l.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/selfserve/sot/impl/ui/description/AddDescriptionFragment;", "Lcom/revolut/retail/common/ui/activity/builder/fragment/BaseLayoutBuilderFragment;", "Lqyc/b;", "Lqyc/c;", "<init>", "()V", "feature_selfserve_sot_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AddDescriptionFragment extends BaseLayoutBuilderFragment<b, c> implements c {
    public static final /* synthetic */ int g0 = 0;
    public final Object f0 = w.y0(new d(23));

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment
    public final a F() {
        koi.c cVar = new koi.c(0);
        cVar.a((InputTextDelegate) this.f0.getValue());
        return new a(new j(cVar, false, 14), (DefaultItemAnimator) null, o.u(), BitmapDescriptorFactory.HUE_RED, 10);
    }

    @Override // com.revolut.retail.core.mvp.BaseMvpFragment
    public final e z() {
        ryc.c cVar = (ryc.c) ((ryc.e) l.q(this));
        ryc.b bVar = cVar.f258309c;
        ryc.c cVar2 = cVar.d;
        ryc.a aVar = new ryc.a();
        aVar.f258289a = cVar2;
        aVar.f258290b = e4m.b.b(new m(bVar, aVar, 12));
        return (b) ((e4m.e) aVar.f258290b).get();
    }
}
