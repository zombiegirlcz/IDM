package com.revolut.feature.topup_screen.impl.mcy;

import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.topup_screen.impl.R$string;
import com.revolut.feature.topup_screen.impl.mcy.McyTopupFlowContract$InputData;
import com.revolut.feature.topup_screen.impl.mcy.McyTopupFlowContract$Step;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import d8l.d;
import e0f.u0;
import fo1.b0;
import fs2.k;
import g0f.m;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import l93.f;
import nii.y0;
import nii.z;
import oki.h;
import org.jetbrains.annotations.NotNull;
import yji.l;
import yki.i;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends h implements g0f.b {

    @NotNull
    public static final g0f.h Companion = new g0f.h();
    public final McyTopupFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final vte.a f91076p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final u0 f91077q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final pye.a f91078r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final gte.a f91079s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final zja.a f91080t;
    public final f u;
    public final u51.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final i f91081w;

    public b(McyTopupFlowContract$InputData inputData, vte.a topUpInteractor, u0 mcyTopupErrorInteractor, pye.a mcyTopUpDialogProvider, gte.a featureToggleInteractor, zja.a productArticleInteractor, f revolutCardsInteractor, u51.a topupMethodsInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(topUpInteractor, "topUpInteractor");
        Intrinsics.checkNotNullParameter(mcyTopupErrorInteractor, "mcyTopupErrorInteractor");
        Intrinsics.checkNotNullParameter(mcyTopUpDialogProvider, "mcyTopUpDialogProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(productArticleInteractor, "productArticleInteractor");
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        Intrinsics.checkNotNullParameter(topupMethodsInteractor, "topupMethodsInteractor");
        this.o = inputData;
        this.f91076p = topUpInteractor;
        this.f91077q = mcyTopupErrorInteractor;
        this.f91078r = mcyTopUpDialogProvider;
        this.f91079s = featureToggleInteractor;
        this.f91080t = productArticleInteractor;
        this.u = revolutCardsInteractor;
        this.v = topupMethodsInteractor;
        this.f91081w = d.a(this, new fv1.a(this, 14));
    }

    public static final void I2(b bVar) {
        bVar.C1(new BridgeDestination(new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(t49.a.f267949a, null, null, 6)))));
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0084, code lost:
    
        if (r4.invoke(r2) == r3) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.feature.topup_screen.impl.mcy.b r23, com.revolut.feature.topup_screen.impl.mcy.a r24, gim.c r25) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.topup_screen.impl.mcy.b.J2(com.revolut.feature.topup_screen.impl.mcy.b, com.revolut.feature.topup_screen.impl.mcy.a, gim.c):java.lang.Object");
    }

    public static McyTopupFlowContract$Step K2(McyTopupFlowContract$InputData mcyTopupFlowContract$InputData) {
        if (mcyTopupFlowContract$InputData instanceof McyTopupFlowContract$InputData.AccountVerification) {
            McyTopupFlowContract$InputData.AccountVerification accountVerification = (McyTopupFlowContract$InputData.AccountVerification) mcyTopupFlowContract$InputData;
            return new McyTopupFlowContract$Step.McyAccountVerification(accountVerification.d, accountVerification.f91046b, accountVerification.f91047c);
        }
        if (!(mcyTopupFlowContract$InputData instanceof McyTopupFlowContract$InputData.TopupSelectCountry)) {
            throw new NoWhenBranchMatchedException();
        }
        McyTopupFlowContract$InputData.TopupSelectCountry topupSelectCountry = (McyTopupFlowContract$InputData.TopupSelectCountry) mcyTopupFlowContract$InputData;
        return new McyTopupFlowContract$Step.IndiaTopupSelectCountry(topupSelectCountry.f91050c, topupSelectCountry.f91049b, topupSelectCountry.d);
    }

    @Override // yki.j
    public final void M0() {
        l2(new b0(this, null, 11), new k(this, 29));
    }

    @Override // yji.l
    public final boolean o1(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        u0 u0Var = this.f91077q;
        u0Var.getClass();
        Intrinsics.checkNotNullParameter(throwable, "error");
        ServerError serverErrorA = u0Var.f121691a.a(throwable);
        if (serverErrorA != null && serverErrorA.f51362a == 1136) {
            l.a1(this, X1(new y0(null, new z(new TextLocalisedClause(R$string.topup_mcy_valid_document_error_title, null, null, 14), new TextLocalisedClause(R$string.topup_mcy_valid_document_error_message, null, null, 14), new TextLocalisedClause(R$string.topup_mcy_valid_document_error_primary_action, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 5)), null, null, new m(this, null, 0), 3);
            return true;
        }
        if (u0Var.a(throwable)) {
            l.a1(this, X1(u0.b()), null, null, new m(this, null, 1), 3);
            return true;
        }
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        return false;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f91081w;
    }
}
