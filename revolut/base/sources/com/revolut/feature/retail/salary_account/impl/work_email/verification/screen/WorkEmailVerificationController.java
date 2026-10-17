package com.revolut.feature.retail.salary_account.impl.work_email.verification.screen;

import android.view.View;
import cli.o;
import cli.q;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.feature.retail.salary_account.impl.work_email.verification.screen.WorkEmailVerificationController;
import com.revolut.feature.retail.salary_account.impl.work_email.verification.screen.WorkEmailVerificationControllerContract$InputData;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.ViewController;
import dli.a;
import dli.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mib.f;
import mib.g;
import mib.k;
import pki.b;
import te0.w;
import wfb.r;
import wfb.t;
import xki.e;
import zhm.u;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/retail/salary_account/impl/work_email/verification/screen/WorkEmailVerificationController;", "Lcom/revolut/kompot/navigable/vc/ViewController;", "Lmib/f;", "Ldli/a;", "Lmib/g;", "feature_retail_salary_account_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WorkEmailVerificationController extends ViewController<f> implements a {
    public final WorkEmailVerificationControllerContract$InputData K;
    public final int L;
    public final Object M;
    public final Object N;
    public final PromptMarketingContentDelegate O;
    public final Object P;

    public WorkEmailVerificationController(WorkEmailVerificationControllerContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.K = inputData;
        this.L = R$layout.screen_prompt;
        final int i = 0;
        this.M = w.y0(new Function0(this) { // from class: mib.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WorkEmailVerificationController f205635b;

            {
                this.f205635b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return (k) ((t) this.f205635b.N.getValue()).f297079b.get();
                    case 1:
                        WorkEmailVerificationController workEmailVerificationController = this.f205635b;
                        qji.b bVarU2 = workEmailVerificationController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.retail.salary_account.impl.work_email.verification.di.WorkEmailVerificationControllerComponent.Injector");
                        r rVar = (r) bVarU2;
                        wfb.i iVar = rVar.f297074b;
                        r rVar2 = rVar.f297075c;
                        WorkEmailVerificationControllerContract$InputData workEmailVerificationControllerContract$InputData = workEmailVerificationController.K;
                        workEmailVerificationControllerContract$InputData.getClass();
                        return new t(iVar, rVar2, workEmailVerificationControllerContract$InputData);
                    default:
                        WorkEmailVerificationController workEmailVerificationController2 = this.f205635b;
                        return dli.f.a(workEmailVerificationController2, (k) workEmailVerificationController2.M.getValue(), u.c(workEmailVerificationController2.O), 0, null, null, null, 60);
                }
            }
        });
        final int i2 = 1;
        this.N = w.y0(new Function0(this) { // from class: mib.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WorkEmailVerificationController f205635b;

            {
                this.f205635b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return (k) ((t) this.f205635b.N.getValue()).f297079b.get();
                    case 1:
                        WorkEmailVerificationController workEmailVerificationController = this.f205635b;
                        qji.b bVarU2 = workEmailVerificationController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.retail.salary_account.impl.work_email.verification.di.WorkEmailVerificationControllerComponent.Injector");
                        r rVar = (r) bVarU2;
                        wfb.i iVar = rVar.f297074b;
                        r rVar2 = rVar.f297075c;
                        WorkEmailVerificationControllerContract$InputData workEmailVerificationControllerContract$InputData = workEmailVerificationController.K;
                        workEmailVerificationControllerContract$InputData.getClass();
                        return new t(iVar, rVar2, workEmailVerificationControllerContract$InputData);
                    default:
                        WorkEmailVerificationController workEmailVerificationController2 = this.f205635b;
                        return dli.f.a(workEmailVerificationController2, (k) workEmailVerificationController2.M.getValue(), u.c(workEmailVerificationController2.O), 0, null, null, null, 60);
                }
            }
        });
        this.O = new PromptMarketingContentDelegate();
        final int i3 = 2;
        this.P = w.y0(new Function0(this) { // from class: mib.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ WorkEmailVerificationController f205635b;

            {
                this.f205635b = this;
            }

            /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i3) {
                    case 0:
                        return (k) ((t) this.f205635b.N.getValue()).f297079b.get();
                    case 1:
                        WorkEmailVerificationController workEmailVerificationController = this.f205635b;
                        qji.b bVarU2 = workEmailVerificationController.U2();
                        Intrinsics.i(bVarU2, "null cannot be cast to non-null type com.revolut.feature.retail.salary_account.impl.work_email.verification.di.WorkEmailVerificationControllerComponent.Injector");
                        r rVar = (r) bVarU2;
                        wfb.i iVar = rVar.f297074b;
                        r rVar2 = rVar.f297075c;
                        WorkEmailVerificationControllerContract$InputData workEmailVerificationControllerContract$InputData = workEmailVerificationController.K;
                        workEmailVerificationControllerContract$InputData.getClass();
                        return new t(iVar, rVar2, workEmailVerificationControllerContract$InputData);
                    default:
                        WorkEmailVerificationController workEmailVerificationController2 = this.f205635b;
                        return dli.f.a(workEmailVerificationController2, (k) workEmailVerificationController2.M.getValue(), u.c(workEmailVerificationController2.O), 0, null, null, null, 60);
                }
            }
        });
    }

    @Override // cli.w
    public final /* bridge */ void B(o oVar, q qVar) {
        a.z0((g) oVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: Q2 */
    public final e R1() {
        return (t) this.N.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return (k) this.M.getValue();
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(this.O.f53079c), new mib.b(this, null), 3);
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.L;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // oki.f
    public final pki.a k() {
        return (c) this.P.getValue();
    }
}
