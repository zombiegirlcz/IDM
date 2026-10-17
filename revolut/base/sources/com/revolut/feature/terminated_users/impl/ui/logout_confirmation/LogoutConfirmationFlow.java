package com.revolut.feature.terminated_users.impl.ui.logout_confirmation;

import a0.d;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.terminated_users.impl.ui.logout_confirmation.LogoutConfirmationFlow;
import com.revolut.feature.terminated_users.impl.ui.logout_confirmation.LogoutConfirmationFlowContract$InputData;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import no.m;
import te0.w;
import ue0.e;
import yki.c;
import yki.f;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/terminated_users/impl/ui/logout_confirmation/LogoutConfirmationFlow;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lcom/revolut/feature/terminated_users/impl/ui/logout_confirmation/a;", "Lyki/f;", "Lno/m;", "feature_terminated_users_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LogoutConfirmationFlow extends ViewController<a> implements f, m {
    public final LogoutConfirmationFlowContract$InputData K;
    public final Object L;
    public final AnalyticsProduct M;
    public final Object N;
    public final Object O;

    public LogoutConfirmationFlow(LogoutConfirmationFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = w.y0(new Function0(this) { // from class: hre.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LogoutConfirmationFlow f154809b;

            {
                this.f154809b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        LogoutConfirmationFlow logoutConfirmationFlow = this.f154809b;
                        return czi.c.d(0, 6, null, logoutConfirmationFlow, (b) logoutConfirmationFlow.O.getValue());
                    case 1:
                        LogoutConfirmationFlow logoutConfirmationFlow2 = this.f154809b;
                        phm.a aVar = (phm.a) e.j(logoutConfirmationFlow2.m2()).a().get(bre.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", bre.a.class, " is not found"));
                        }
                        ere.c cVar = ((ere.c) aVar2.b()).f128652c;
                        LogoutConfirmationFlowContract$InputData logoutConfirmationFlowContract$InputData = logoutConfirmationFlow2.K;
                        logoutConfirmationFlowContract$InputData.getClass();
                        return new ere.a(cVar, logoutConfirmationFlowContract$InputData);
                    default:
                        return (b) ((ere.a) this.f154809b.N.getValue()).f128647b.get();
                }
            }
        });
        this.M = inputData.f;
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: hre.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LogoutConfirmationFlow f154809b;

            {
                this.f154809b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        LogoutConfirmationFlow logoutConfirmationFlow = this.f154809b;
                        return czi.c.d(0, 6, null, logoutConfirmationFlow, (b) logoutConfirmationFlow.O.getValue());
                    case 1:
                        LogoutConfirmationFlow logoutConfirmationFlow2 = this.f154809b;
                        phm.a aVar = (phm.a) e.j(logoutConfirmationFlow2.m2()).a().get(bre.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", bre.a.class, " is not found"));
                        }
                        ere.c cVar = ((ere.c) aVar2.b()).f128652c;
                        LogoutConfirmationFlowContract$InputData logoutConfirmationFlowContract$InputData = logoutConfirmationFlow2.K;
                        logoutConfirmationFlowContract$InputData.getClass();
                        return new ere.a(cVar, logoutConfirmationFlowContract$InputData);
                    default:
                        return (b) ((ere.a) this.f154809b.N.getValue()).f128647b.get();
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: hre.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ LogoutConfirmationFlow f154809b;

            {
                this.f154809b = this;
            }

            /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        LogoutConfirmationFlow logoutConfirmationFlow = this.f154809b;
                        return czi.c.d(0, 6, null, logoutConfirmationFlow, (b) logoutConfirmationFlow.O.getValue());
                    case 1:
                        LogoutConfirmationFlow logoutConfirmationFlow2 = this.f154809b;
                        phm.a aVar = (phm.a) e.j(logoutConfirmationFlow2.m2()).a().get(bre.a.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(d.q("Api ", bre.a.class, " is not found"));
                        }
                        ere.c cVar = ((ere.c) aVar2.b()).f128652c;
                        LogoutConfirmationFlowContract$InputData logoutConfirmationFlowContract$InputData = logoutConfirmationFlow2.K;
                        logoutConfirmationFlowContract$InputData.getClass();
                        return new ere.a(cVar, logoutConfirmationFlowContract$InputData);
                    default:
                        return (b) ((ere.a) this.f154809b.N.getValue()).f128647b.get();
                }
            }
        });
    }

    @Override // no.m
    /* JADX INFO: renamed from: P, reason: from getter */
    public final AnalyticsProduct getM() {
        return this.M;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final xki.e R1() {
        return (ere.a) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (ere.a) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final pki.b R2() {
        return (hre.b) this.O.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final c k() {
        return (c) this.L.getValue();
    }
}
