package com.revolut.feature.selfserve.sow.impl.ui.amount;

import androidx.recyclerview.widget.DefaultItemAnimator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.AmountEditDelegate;
import com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment;
import frl.a;
import grl.k9;
import jb3.l;
import kotlin.Metadata;
import pri.e;
import prk.o;
import pzc.c;
import pzc.k;
import te0.w;
import vzc.d;
import vzc.m;
import z4l.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/selfserve/sow/impl/ui/amount/SowAmountFragment;", "Lcom/revolut/retail/common/ui/activity/builder/fragment/BaseLayoutBuilderFragment;", "Lpzc/k;", "Lpzc/c;", "<init>", "()V", "feature_selfserve_sow_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SowAmountFragment extends BaseLayoutBuilderFragment<k, c> implements c {

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final /* synthetic */ int f85960h0 = 0;
    public final AnalyticsProduct.Retail f0;
    public final Object g0;

    public SowAmountFragment() {
        AnalyticsProduct.Companion aVar = AnalyticsProduct.INSTANCE;
        k9 k9Var = a.f137496c;
        this.f0 = com.google.android.gms.internal.mlkit_vision_face.a.g(aVar, k9Var, k9Var);
        this.g0 = w.y0(new pni.a(20));
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment
    public final ipi.a F() {
        koi.c cVar = new koi.c(0);
        cVar.a((AmountEditDelegate) this.g0.getValue());
        return new ipi.a(new j(cVar, false, 14), (DefaultItemAnimator) null, o.u(), BitmapDescriptorFactory.HUE_RED, 10);
    }

    @Override // com.revolut.retail.core.mvp.BaseMvpFragment, no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getL() {
        return this.f0;
    }

    @Override // com.revolut.retail.core.mvp.BaseMvpFragment
    public final e z() {
        vzc.c cVar = (vzc.c) ((m) l.q(this));
        return (k) new d(cVar.f293467b, cVar.f293468c, 0).f293485c.get();
    }
}
