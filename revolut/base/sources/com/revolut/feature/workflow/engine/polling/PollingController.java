package com.revolut.feature.workflow.engine.polling;

import aii.q;
import cli.o;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.feature.workflow.engine.polling.PollingController;
import com.revolut.feature.workflow.engine.polling.PollingControllerContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import pki.b;
import qth.d;
import qth.g;
import qth.i;
import sth.c;
import xki.e;
import yhm.j;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/workflow/engine/polling/PollingController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Laii/q;", "Ldli/a;", "Lsth/c;", "feature_workflow_engine_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PollingController extends ViewController<q> implements a {
    public final PollingControllerContract$InputData K;
    public final Lazy L;
    public final Lazy M;
    public final int N;
    public final Lazy O;

    public PollingController(PollingControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        final int i = 0;
        this.L = j.b(new Function0(this) { // from class: sth.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PollingController f265596b;

            {
                this.f265596b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        PollingController pollingController = this.f265596b;
                        qji.b bVarU2 = pollingController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.workflow.engine.polling.di.PollingControllerInjector");
                        i iVar = (i) bVarU2;
                        g gVar = iVar.f249151b;
                        i iVar2 = iVar.f249152c;
                        PollingControllerContract$InputData pollingControllerContract$InputData = pollingController.K;
                        pollingControllerContract$InputData.getClass();
                        return new qth.d(gVar, iVar2, pollingControllerContract$InputData);
                    case 1:
                        return (e) ((qth.d) this.f265596b.L.getValue()).f249125b.get();
                    default:
                        PollingController pollingController2 = this.f265596b;
                        return dli.f.a(pollingController2, (e) pollingController2.M.getValue(), u.c(new PromptMarketingContentDelegate()), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.M = j.b(new Function0(this) { // from class: sth.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PollingController f265596b;

            {
                this.f265596b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        PollingController pollingController = this.f265596b;
                        qji.b bVarU2 = pollingController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.workflow.engine.polling.di.PollingControllerInjector");
                        i iVar = (i) bVarU2;
                        g gVar = iVar.f249151b;
                        i iVar2 = iVar.f249152c;
                        PollingControllerContract$InputData pollingControllerContract$InputData = pollingController.K;
                        pollingControllerContract$InputData.getClass();
                        return new qth.d(gVar, iVar2, pollingControllerContract$InputData);
                    case 1:
                        return (e) ((qth.d) this.f265596b.L.getValue()).f249125b.get();
                    default:
                        PollingController pollingController2 = this.f265596b;
                        return dli.f.a(pollingController2, (e) pollingController2.M.getValue(), u.c(new PromptMarketingContentDelegate()), 0, null, null, null, 60);
                }
            }
        });
        this.N = R$layout.screen_prompt;
        final int i3 = 2;
        this.O = j.b(new Function0(this) { // from class: sth.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PollingController f265596b;

            {
                this.f265596b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        PollingController pollingController = this.f265596b;
                        qji.b bVarU2 = pollingController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.workflow.engine.polling.di.PollingControllerInjector");
                        i iVar = (i) bVarU2;
                        g gVar = iVar.f249151b;
                        i iVar2 = iVar.f249152c;
                        PollingControllerContract$InputData pollingControllerContract$InputData = pollingController.K;
                        pollingControllerContract$InputData.getClass();
                        return new qth.d(gVar, iVar2, pollingControllerContract$InputData);
                    case 1:
                        return (e) ((qth.d) this.f265596b.L.getValue()).f249125b.get();
                    default:
                        PollingController pollingController2 = this.f265596b;
                        return dli.f.a(pollingController2, (e) pollingController2.M.getValue(), u.c(new PromptMarketingContentDelegate()), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, cli.q qVar) {
        a.z0((c) oVar);
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (d) this.L.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (sth.e) this.M.getValue();
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getN() {
        return this.N;
    }

    @Override // oki.f
    public final pki.a k() {
        return (dli.c) this.O.getValue();
    }
}
