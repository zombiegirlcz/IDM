package com.revolut.feature_retail_user_declarations.employer.flow;

import com.revolut.feature_retail_user_declarations.employer.EmployerInputData;
import com.revolut.feature_retail_user_declarations.employer.flow.EmployerFlow;
import com.revolut.kompot.navigable.vc.ViewController;
import ibi.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import oai.i0;
import oai.n;
import qji.b;
import te0.w;
import ue0.e;
import yki.f;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature_retail_user_declarations/employer/flow/EmployerFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lhbi/a;", "Lyki/f;", "Lkji/f;", "feature_retail_user_declarations_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class EmployerFlow extends ViewController<hbi.a> implements f, kji.f {
    public final EmployerInputData K;
    public final Object L;
    public final Object M;
    public final Object N;

    public EmployerFlow(EmployerInputData input) {
        Intrinsics.checkNotNullParameter(input, "input");
        this.K = input;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: ibi.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EmployerFlow f160183b;

            {
                this.f160183b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        EmployerFlow employerFlow = this.f160183b;
                        phm.a aVar = (phm.a) e.j(employerFlow.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                        }
                        i0 i0Var = ((i0) aVar2.b()).f223710r;
                        EmployerInputData employerInputData = employerFlow.K;
                        employerInputData.getClass();
                        return new n(i0Var, employerInputData);
                    case 1:
                        return (c) ((n) this.f160183b.L.getValue()).d.get();
                    default:
                        EmployerFlow employerFlow2 = this.f160183b;
                        return czi.c.d(0, 6, null, employerFlow2, (c) employerFlow2.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.M = w.y0(new Function0(this) { // from class: ibi.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EmployerFlow f160183b;

            {
                this.f160183b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        EmployerFlow employerFlow = this.f160183b;
                        phm.a aVar = (phm.a) e.j(employerFlow.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                        }
                        i0 i0Var = ((i0) aVar2.b()).f223710r;
                        EmployerInputData employerInputData = employerFlow.K;
                        employerInputData.getClass();
                        return new n(i0Var, employerInputData);
                    case 1:
                        return (c) ((n) this.f160183b.L.getValue()).d.get();
                    default:
                        EmployerFlow employerFlow2 = this.f160183b;
                        return czi.c.d(0, 6, null, employerFlow2, (c) employerFlow2.M.getValue());
                }
            }
        });
        final int i3 = 2;
        this.N = w.y0(new Function0(this) { // from class: ibi.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ EmployerFlow f160183b;

            {
                this.f160183b = this;
            }

            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        EmployerFlow employerFlow = this.f160183b;
                        phm.a aVar = (phm.a) e.j(employerFlow.m2()).a().get(i0.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", i0.class, " is not found"));
                        }
                        i0 i0Var = ((i0) aVar2.b()).f223710r;
                        EmployerInputData employerInputData = employerFlow.K;
                        employerInputData.getClass();
                        return new n(i0Var, employerInputData);
                    case 1:
                        return (c) ((n) this.f160183b.L.getValue()).d.get();
                    default:
                        EmployerFlow employerFlow2 = this.f160183b;
                        return czi.c.d(0, 6, null, employerFlow2, (c) employerFlow2.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (n) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final b R1() {
        return (n) this.L.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b h3() {
        return (c) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final yki.c k() {
        return (yki.c) this.N.getValue();
    }
}
