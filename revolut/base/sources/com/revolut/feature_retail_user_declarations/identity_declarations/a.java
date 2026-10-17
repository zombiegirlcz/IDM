package com.revolut.feature_retail_user_declarations.identity_declarations;

import com.revolut.kompot.navigable.flow.FlowStep;
import ivh.c;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import obi.e;
import oki.h;
import org.jetbrains.annotations.NotNull;
import qki.d;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends h implements obi.b {

    @NotNull
    public static final e Companion = new e();
    public final IdentityDeclarationsFlowInputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final jvh.a f97689p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b f97690q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c f97691r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d f97692s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final List f97693t;
    public final yki.a u;

    public a(IdentityDeclarationsFlowInputData inputData, jvh.a workflowInteractor, b resultMapper, c errorHandlerExtension) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(workflowInteractor, "workflowInteractor");
        Intrinsics.checkNotNullParameter(resultMapper, "resultMapper");
        Intrinsics.checkNotNullParameter(errorHandlerExtension, "errorHandlerExtension");
        this.o = inputData;
        this.f97689p = workflowInteractor;
        this.f97690q = resultMapper;
        this.f97691r = errorHandlerExtension;
        this.f97692s = hx7.e.b(this, new IdentityDeclarationsFlowContract$State(0));
        List list = inputData.f97671c;
        this.f97693t = list;
        this.u = cp5.d.a(this, (FlowStep) list.get(0), f0.f322471a, new oa4.c(this, 6));
    }

    public final rbl.a I2(IdentityDeclarationsStep identityDeclarationsStep) {
        if (this.f97693t.indexOf(identityDeclarationsStep) > 0) {
            return rbl.a.BACK;
        }
        IdentityDeclarationsFlowInputData identityDeclarationsFlowInputData = this.o;
        return identityDeclarationsFlowInputData.e ? rbl.a.CLOSE : identityDeclarationsFlowInputData.f.f105563a ? rbl.a.BACK : rbl.a.NONE;
    }

    public final void J2(IdentityDeclarationsStep step, IdentityDeclarationsFlowContract$StepResult result) {
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(result, "result");
        c.c3(this.f97691r, "IdentityDeclarationsFlow", new mh1.d(this, result, step, null, 25), null, null, 28);
    }

    @Override // qki.e
    public final d getState() {
        return this.f97692s;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.u;
    }
}
