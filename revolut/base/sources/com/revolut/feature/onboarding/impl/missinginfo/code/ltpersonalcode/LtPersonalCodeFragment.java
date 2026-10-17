package com.revolut.feature.onboarding.impl.missinginfo.code.ltpersonalcode;

import ca9.c;
import ca9.d;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.onboarding.impl.missinginfo.inputfield.MissingFieldFragment;
import frl.a;
import grl.k9;
import jb3.l;
import kotlin.Metadata;
import pri.e;
import t70.g;
import vc.s;
import ypi.i;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/onboarding/impl/missinginfo/code/ltpersonalcode/LtPersonalCodeFragment;", "Lcom/revolut/feature/onboarding/impl/missinginfo/inputfield/MissingFieldFragment;", "<init>", "()V", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LtPersonalCodeFragment extends MissingFieldFragment {

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final AnalyticsProduct.Retail f78298h0;

    public LtPersonalCodeFragment() {
        AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
        k9 k9Var = a.i;
        this.f78298h0 = com.google.android.gms.internal.mlkit_vision_face.a.g(companion, k9Var, k9Var);
    }

    @Override // com.revolut.retail.core.mvp.BaseMvpFragment, no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getQ() {
        return this.f78298h0;
    }

    @Override // com.revolut.retail.core.mvp.BaseMvpFragment
    public final e z() {
        c cVar = (c) ((ca9.e) l.q(this));
        d dVar = cVar.f22543b;
        g gVarO = dVar.f22560b.o();
        s.j(gVarO);
        return new aa9.c(gVarO, (aa9.a) dVar.k.get(), (i) cVar.f22550n.get());
    }
}
