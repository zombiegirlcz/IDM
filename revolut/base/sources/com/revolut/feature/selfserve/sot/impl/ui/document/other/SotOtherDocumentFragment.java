package com.revolut.feature.selfserve.sot.impl.ui.document.other;

import androidx.recyclerview.widget.DefaultItemAnimator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment;
import jb3.l;
import kotlin.Metadata;
import pri.e;
import ryc.c;
import te0.w;
import ty.a;
import tyc.o;
import tyc.s;
import z4l.j;
import zhm.u;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/selfserve/sot/impl/ui/document/other/SotOtherDocumentFragment;", "Lcom/revolut/retail/common/ui/activity/builder/fragment/BaseLayoutBuilderFragment;", "Ltyc/s;", "Ltyc/o;", "<init>", "()V", "feature_selfserve_sot_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SotOtherDocumentFragment extends BaseLayoutBuilderFragment<s, o> implements o {
    public static final /* synthetic */ int g0 = 0;
    public final Object f0 = w.y0(new a(9));

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment
    public final ipi.a F() {
        return new ipi.a(new j(7, u.c((InputTextDelegate) this.f0.getValue()), false), (DefaultItemAnimator) null, prk.o.u(), BitmapDescriptorFactory.HUE_RED, 10);
    }

    @Override // com.revolut.retail.core.mvp.BaseMvpFragment
    public final e z() {
        c cVar = (c) ((ryc.e) l.q(this));
        return (s) ((e4m.e) new kbb.c(cVar.f258309c, cVar.d).d).get();
    }
}
