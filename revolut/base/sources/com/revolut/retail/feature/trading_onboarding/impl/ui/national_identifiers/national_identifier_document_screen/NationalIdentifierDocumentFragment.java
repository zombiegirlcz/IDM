package com.revolut.retail.feature.trading_onboarding.impl.ui.national_identifiers.national_identifier_document_screen;

import androidx.recyclerview.widget.DefaultItemAnimator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.delegates.ExpandableCellLoadingDelegate;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment;
import d8e.a;
import dt4.p;
import e0l.c;
import e0l.d;
import ihm.b;
import java.util.List;
import jb3.l;
import kotlin.Metadata;
import pri.e;
import prk.o;
import te0.w;
import wpg.g;
import z4l.j;
import zhm.v;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/feature/trading_onboarding/impl/ui/national_identifiers/national_identifier_document_screen/NationalIdentifierDocumentFragment;", "Lcom/revolut/retail/common/ui/activity/builder/fragment/BaseLayoutBuilderFragment;", "Le0l/c;", "Le0l/d;", "Lno/m;", "<init>", "()V", "feature_trading_onboarding_revamp_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NationalIdentifierDocumentFragment extends BaseLayoutBuilderFragment<c, d> implements d {
    public static final /* synthetic */ int j0 = 0;
    public final Object f0 = w.y0(new a(this, 25));
    public final b g0 = j6.a.h("create(...)");

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final j f104219h0 = new j(7, v.k(new InputTextDelegate(new p(this, 18)), new ExpandableCellLoadingDelegate()), false);
    public final List i0 = o.u();

    @Override // com.revolut.retail.common.ui.activity.builder.fragment.BaseLayoutBuilderFragment
    public final ipi.a F() {
        return new ipi.a(this.f104219h0, (DefaultItemAnimator) null, this.i0, BitmapDescriptorFactory.HUE_RED, 10);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.retail.core.mvp.BaseMvpFragment, no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getN() {
        return (AnalyticsProduct) this.f0.getValue();
    }

    @Override // com.revolut.retail.core.mvp.BaseMvpFragment
    public final e z() {
        yzk.a aVar = (yzk.a) ((g0l.a) l.q(this));
        yzk.b bVar = aVar.f318118c;
        yzk.a aVar2 = aVar.d;
        of.a aVar3 = new of.a();
        int i = 22;
        aVar3.f224676a = e4m.b.b(new g(bVar, aVar2, aVar3, 1, i));
        return (c) e4m.b.b(new g(bVar, aVar2, aVar3, 0, i)).get();
    }
}
