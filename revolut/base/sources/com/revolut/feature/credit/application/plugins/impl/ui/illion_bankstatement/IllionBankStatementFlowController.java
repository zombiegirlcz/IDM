package com.revolut.feature.credit.application.plugins.impl.ui.illion_bankstatement;

import android.content.Intent;
import android.os.Bundle;
import com.revolut.feature.credit.application.plugins.api.models.illion_bankstatements.IllionFlowCallback;
import com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2;
import com.revolut.feature.credit.application.plugins.impl.ui.illion_bankstatement.IllionBankStatementFlowContract$InputData;
import com.revolut.feature.credit.application.plugins.impl.ui.illion_bankstatement.IllionBankStatementFlowController;
import dw3.c1;
import dw3.o3;
import iz1.p;
import jc4.c;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import xki.e;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/illion_bankstatement/IllionBankStatementFlowController;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/core/plugins/PluginFlowControllerV2;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IllionBankStatementFlowController extends PluginFlowControllerV2 {
    public final IllionBankStatementFlowContract$InputData L;
    public final Object M;
    public final Object N;
    public final Object O;

    public IllionBankStatementFlowController(IllionBankStatementFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.L = inputData;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: jc4.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IllionBankStatementFlowController f172702b;

            {
                this.f172702b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (a) ((o3) this.f172702b.N.getValue()).u.get();
                    case 1:
                        IllionBankStatementFlowController illionBankStatementFlowController = this.f172702b;
                        phm.a aVar = (phm.a) ue0.e.j(illionBankStatementFlowController.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        c1 c1Var = ((c1) ((dw3.e) aVar2.b())).m0;
                        IllionBankStatementFlowContract$InputData illionBankStatementFlowContract$InputData = illionBankStatementFlowController.L;
                        illionBankStatementFlowContract$InputData.getClass();
                        return new o3(c1Var, new iq3.a(), illionBankStatementFlowController, illionBankStatementFlowContract$InputData);
                    default:
                        IllionBankStatementFlowController illionBankStatementFlowController2 = this.f172702b;
                        return czi.c.d(0, 6, null, illionBankStatementFlowController2, (a) illionBankStatementFlowController2.M.getValue());
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: jc4.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IllionBankStatementFlowController f172702b;

            {
                this.f172702b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (a) ((o3) this.f172702b.N.getValue()).u.get();
                    case 1:
                        IllionBankStatementFlowController illionBankStatementFlowController = this.f172702b;
                        phm.a aVar = (phm.a) ue0.e.j(illionBankStatementFlowController.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        c1 c1Var = ((c1) ((dw3.e) aVar2.b())).m0;
                        IllionBankStatementFlowContract$InputData illionBankStatementFlowContract$InputData = illionBankStatementFlowController.L;
                        illionBankStatementFlowContract$InputData.getClass();
                        return new o3(c1Var, new iq3.a(), illionBankStatementFlowController, illionBankStatementFlowContract$InputData);
                    default:
                        IllionBankStatementFlowController illionBankStatementFlowController2 = this.f172702b;
                        return czi.c.d(0, 6, null, illionBankStatementFlowController2, (a) illionBankStatementFlowController2.M.getValue());
                }
            }
        });
        final int i3 = 2;
        this.O = w.y0(new Function0(this) { // from class: jc4.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ IllionBankStatementFlowController f172702b;

            {
                this.f172702b = this;
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return (a) ((o3) this.f172702b.N.getValue()).u.get();
                    case 1:
                        IllionBankStatementFlowController illionBankStatementFlowController = this.f172702b;
                        phm.a aVar = (phm.a) ue0.e.j(illionBankStatementFlowController.m2()).a().get(dw3.e.class);
                        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
                        if (aVar2 == null) {
                            throw new IllegalStateException(a0.d.q("Api ", dw3.e.class, " is not found"));
                        }
                        c1 c1Var = ((c1) ((dw3.e) aVar2.b())).m0;
                        IllionBankStatementFlowContract$InputData illionBankStatementFlowContract$InputData = illionBankStatementFlowController.L;
                        illionBankStatementFlowContract$InputData.getClass();
                        return new o3(c1Var, new iq3.a(), illionBankStatementFlowController, illionBankStatementFlowContract$InputData);
                    default:
                        IllionBankStatementFlowController illionBankStatementFlowController2 = this.f172702b;
                        return czi.c.d(0, 6, null, illionBankStatementFlowController2, (a) illionBankStatementFlowController2.M.getValue());
                }
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (o3) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController, qji.c
    public final qji.b R1() {
        return (o3) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final pki.b d() {
        return (jc4.a) this.M.getValue();
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void W2(int i, int i2, Intent intent) {
        Bundle extras;
        Pair pair = new Pair(333, 666);
        Pair pair2 = new Pair(333, 0);
        Pair pair3 = new Pair(Integer.valueOf(i), Integer.valueOf(i2));
        boolean zEquals = pair3.equals(pair);
        ?? r62 = this.M;
        if (!zEquals) {
            if (pair3.equals(pair2)) {
                ((jc4.a) r62.getValue()).getClass();
                return;
            }
            return;
        }
        IllionFlowCallback callback = (intent == null || (extras = intent.getExtras()) == null) ? null : (IllionFlowCallback) extras.getParcelable("EXTRAS_ILLION_FLOW_CALLBACK");
        if (callback == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        b bVar = (b) ((jc4.a) r62.getValue());
        bVar.getClass();
        Intrinsics.checkNotNullParameter(callback, "callback");
        bVar.l2(new p(bVar, callback, null, 23), new c(bVar, 0));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.feature.credit.application.plugins.impl.ui.core.plugins.PluginFlowControllerV2, oki.f
    public final yki.c k() {
        return (yki.c) this.O.getValue();
    }
}
