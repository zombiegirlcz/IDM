package com.revolut.feature_retail_user_declarations.credit_consent.flow;

import com.revolut.feature_retail_user_declarations.credit_consent.CreditConsentInputData;
import com.revolut.feature_retail_user_declarations.credit_consent.CreditConsentOutputData;
import com.revolut.feature_retail_user_declarations.credit_consent.flow.CreditConsentFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import oai.g;
import oai.i0;
import qji.b;
import te0.w;
import xki.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/credit_consent/flow/CreditConsentFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature_retail_user_declarations/credit_consent/CreditConsentOutputData;", "Lyki/f;", "Lkji/f;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CreditConsentFlow extends ViewController<CreditConsentOutputData> implements f, kji.f {
    public final CreditConsentInputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public CreditConsentFlow(CreditConsentInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: lai.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditConsentFlow f193402b;

            {
                this.f193402b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        CreditConsentFlow creditConsentFlow = this.f193402b;
                        phm.a aVar = (phm.a) ue0.e.j(creditConsentFlow.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                        }
                        i0 i0Var = ((i0) aVar2.b()).f223710r;
                        CreditConsentInputData creditConsentInputData = creditConsentFlow.K;
                        creditConsentInputData.getClass();
                        return new g(i0Var, creditConsentInputData);
                    case 1:
                        return (b) ((g) this.f193402b.L.getValue()).e.get();
                    default:
                        CreditConsentFlow creditConsentFlow2 = this.f193402b;
                        return czi.c.d(0, 6, null, creditConsentFlow2, (b) creditConsentFlow2.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: lai.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditConsentFlow f193402b;

            {
                this.f193402b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        CreditConsentFlow creditConsentFlow = this.f193402b;
                        phm.a aVar = (phm.a) ue0.e.j(creditConsentFlow.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                        }
                        i0 i0Var = ((i0) aVar2.b()).f223710r;
                        CreditConsentInputData creditConsentInputData = creditConsentFlow.K;
                        creditConsentInputData.getClass();
                        return new g(i0Var, creditConsentInputData);
                    case 1:
                        return (b) ((g) this.f193402b.L.getValue()).e.get();
                    default:
                        CreditConsentFlow creditConsentFlow2 = this.f193402b;
                        return czi.c.d(0, 6, null, creditConsentFlow2, (b) creditConsentFlow2.M.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: lai.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ CreditConsentFlow f193402b;

            {
                this.f193402b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        CreditConsentFlow creditConsentFlow = this.f193402b;
                        phm.a aVar = (phm.a) ue0.e.j(creditConsentFlow.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                        }
                        i0 i0Var = ((i0) aVar2.b()).f223710r;
                        CreditConsentInputData creditConsentInputData = creditConsentFlow.K;
                        creditConsentInputData.getClass();
                        return new g(i0Var, creditConsentInputData);
                    case 1:
                        return (b) ((g) this.f193402b.L.getValue()).e.get();
                    default:
                        CreditConsentFlow creditConsentFlow2 = this.f193402b;
                        return czi.c.d(0, 6, null, creditConsentFlow2, (b) creditConsentFlow2.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (g) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (g) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (lai.b) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.N.getValue();
    }
}
