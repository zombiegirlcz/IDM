package com.revolut.feature.apm.breb.impl.flow.area;

import com.revolut.feature.apm.breb.api.navigation.BrebNavigation$InputData;
import com.revolut.feature.apm.breb.api.navigation.BrebNavigation$StartType;
import com.revolut.feature.apm.breb.impl.flow.area.BrebAreaFlowContract$Step;
import com.revolut.feature.apm.core.ui.api.navigation.ApmAliasRegistrationMode;
import com.revolut.kompot.navigable.flow.FlowStep;
import d8l.d;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import pv1.b;
import pv1.e;
import rv1.z;
import uv1.m;
import yki.i;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends h implements b {

    @NotNull
    public static final e Companion = new e();
    public final BrebNavigation$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final wj0.a f61740p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.revolut.feature.apm.core.ui.api.navigation.a f61741q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final z f61742r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final bv1.a f61743s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i f61744t;

    public a(BrebNavigation$InputData inputData, wj0.a idempotencyKeyHolder, com.revolut.feature.apm.core.ui.api.navigation.a registrationExtension, z qrHandler, bv1.a navigationProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(registrationExtension, "registrationExtension");
        Intrinsics.checkNotNullParameter(qrHandler, "qrHandler");
        Intrinsics.checkNotNullParameter(navigationProvider, "navigationProvider");
        this.o = inputData;
        this.f61740p = idempotencyKeyHolder;
        this.f61741q = registrationExtension;
        this.f61742r = qrHandler;
        this.f61743s = navigationProvider;
        this.f61744t = d.a(this, new pu4.d(this, 3));
    }

    @Override // yji.l
    public final void I1() {
        this.f61740p.a("IDEMPOTENCY_TAG_CHECK_ALIAS_AVAILABILITY");
    }

    @Override // yki.j
    public final void M0() {
        FlowStep qrRequest;
        FlowStep newAlias;
        BrebNavigation$StartType brebNavigation$StartType = this.o.f61697a;
        if (Intrinsics.f(brebNavigation$StartType, BrebNavigation$StartType.Area.f61698a)) {
            newAlias = new BrebAreaFlowContract$Step.Area(null);
        } else if (Intrinsics.f(brebNavigation$StartType, BrebNavigation$StartType.BlockExtension.f61699a)) {
            newAlias = new BrebAreaFlowContract$Step.Area(m.BLOCK_EXTENSION);
        } else if (Intrinsics.f(brebNavigation$StartType, BrebNavigation$StartType.RecipientList.f61704a)) {
            newAlias = BrebAreaFlowContract$Step.NewContact.f61730a;
        } else {
            if (!Intrinsics.f(brebNavigation$StartType, BrebNavigation$StartType.NewAlias.f61700a)) {
                if (!(brebNavigation$StartType instanceof BrebNavigation$StartType.QrRequest)) {
                    throw new NoWhenBranchMatchedException();
                }
                BrebNavigation$StartType.QrRequest qrRequest2 = (BrebNavigation$StartType.QrRequest) brebNavigation$StartType;
                qrRequest = new BrebAreaFlowContract$Step.QrRequest(qrRequest2.f61701a, qrRequest2.f61703c, qrRequest2.f61702b);
                h.t2(this, this.f61744t, qrRequest, false, null, false, 12);
            }
            newAlias = new BrebAreaFlowContract$Step.NewAlias(ApmAliasRegistrationMode.Add.f62240b, new BrebAreaFlowContract$Step.Area(null));
        }
        qrRequest = newAlias;
        h.t2(this, this.f61744t, qrRequest, false, null, false, 12);
    }

    @Override // yji.l
    public final void O1() {
        s1();
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f61744t;
    }
}
