package com.revolut.feature.onboarding.impl.language_change.flow;

import a0.d;
import aii.q;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.onboarding.impl.language_change.flow.LanguageChangeFlow;
import com.revolut.feature.onboarding.impl.language_change.flow.LanguageChangeFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import czi.c;
import grl.k9;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import no.m;
import qji.b;
import ta9.l;
import te0.w;
import ue0.e;
import yki.f;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/onboarding/impl/language_change/flow/LanguageChangeFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Lyki/f;", "Lno/m;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LanguageChangeFlow extends ViewController<q> implements f, m {
    public final LanguageChangeFlowContract$InputData K;
    public final AnalyticsProduct.Retail L;
    public final Object M;
    public final Object N;
    public final Object O;

    public LanguageChangeFlow(LanguageChangeFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        k9 k9Var = k9.Onboarding;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        this.L = com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var);
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: x99.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LanguageChangeFlow f303648b;

            {
                this.f303648b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        LanguageChangeFlow languageChangeFlow = this.f303648b;
                        return c.d(0, 6, null, languageChangeFlow, (b) languageChangeFlow.O.getValue());
                    case 1:
                        LanguageChangeFlow languageChangeFlow2 = this.f303648b;
                        phm.a aVar = (phm.a) e.j(languageChangeFlow2.m2()).a().get(ta9.m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", ta9.m.class, " is not found"));
                        }
                        ta9.m mVar = ((ta9.m) aVar2.b()).O;
                        LanguageChangeFlowContract$InputData languageChangeFlowContract$InputData = languageChangeFlow2.K;
                        languageChangeFlowContract$InputData.getClass();
                        return new l(mVar, languageChangeFlowContract$InputData);
                    default:
                        return (b) ((l) this.f303648b.N.getValue()).f269235b.get();
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: x99.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LanguageChangeFlow f303648b;

            {
                this.f303648b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        LanguageChangeFlow languageChangeFlow = this.f303648b;
                        return c.d(0, 6, null, languageChangeFlow, (b) languageChangeFlow.O.getValue());
                    case 1:
                        LanguageChangeFlow languageChangeFlow2 = this.f303648b;
                        phm.a aVar = (phm.a) e.j(languageChangeFlow2.m2()).a().get(ta9.m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", ta9.m.class, " is not found"));
                        }
                        ta9.m mVar = ((ta9.m) aVar2.b()).O;
                        LanguageChangeFlowContract$InputData languageChangeFlowContract$InputData = languageChangeFlow2.K;
                        languageChangeFlowContract$InputData.getClass();
                        return new l(mVar, languageChangeFlowContract$InputData);
                    default:
                        return (b) ((l) this.f303648b.N.getValue()).f269235b.get();
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: x99.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LanguageChangeFlow f303648b;

            {
                this.f303648b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        LanguageChangeFlow languageChangeFlow = this.f303648b;
                        return c.d(0, 6, null, languageChangeFlow, (b) languageChangeFlow.O.getValue());
                    case 1:
                        LanguageChangeFlow languageChangeFlow2 = this.f303648b;
                        phm.a aVar = (phm.a) e.j(languageChangeFlow2.m2()).a().get(ta9.m.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", ta9.m.class, " is not found"));
                        }
                        ta9.m mVar = ((ta9.m) aVar2.b()).O;
                        LanguageChangeFlowContract$InputData languageChangeFlowContract$InputData = languageChangeFlow2.K;
                        languageChangeFlowContract$InputData.getClass();
                        return new l(mVar, languageChangeFlowContract$InputData);
                    default:
                        return (b) ((l) this.f303648b.N.getValue()).f269235b.get();
                }
            }
        });
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getU() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (l) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (l) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (x99.b) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.M.getValue();
    }
}
