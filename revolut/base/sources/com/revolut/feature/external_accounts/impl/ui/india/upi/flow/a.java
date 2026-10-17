package com.revolut.feature.external_accounts.impl.ui.india.upi.flow;

import android.content.Intent;
import android.net.Uri;
import com.revolut.feature.external_accounts.impl.ui.india.upi.flow.UpiTransferFlowContract$Step;
import com.revolut.feature.external_accounts.models.ExternalAccountTopupPayload;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.navigation.action.MainContainerActionData;
import com.revolut.feature.mainscreen.core.api.navigation.action.MainContainerActionId;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import hx7.e;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import qki.d;
import rbh.k;
import rm2.s;
import rm6.b;
import rm6.c;
import sri.m;
import vkm.j2;
import we6.d0;
import yki.i;
import zhm.h0;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements b {
    public final UpiTransferFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final m f72940p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final kg6.a f72941q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final wj0.a f72942r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final gg6.a f72943s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final d f72944t;
    public final i u;

    public a(UpiTransferFlowContract$InputData inputData, m navigator, kg6.a indiaUpiAppInteractor, wj0.a idempotencyKeyHolder, gg6.a indiaPreselectedMethodInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(indiaUpiAppInteractor, "indiaUpiAppInteractor");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(indiaPreselectedMethodInteractor, "indiaPreselectedMethodInteractor");
        this.o = inputData;
        this.f72940p = navigator;
        this.f72941q = indiaUpiAppInteractor;
        this.f72942r = idempotencyKeyHolder;
        this.f72943s = indiaPreselectedMethodInteractor;
        this.f72944t = e.b(this, new UpiTransferFlowContract$State(0));
        this.u = d8l.d.a(this, new rl8.d(this, 2));
    }

    public final void I2(String str, String str2, String str3, boolean z) {
        Continuation continuation = null;
        if (str3 != null) {
            l2(new c(this, str3, continuation, 0), new yi5.b(26));
        }
        if (!z) {
            this.f72940p.c(new FeatureCommand(new MainScreenFeatureConfig.WithAction(s49.a.SINGLE_TOP, new MainContainerActionData(new MainContainerActionId("EXTERNAL_ACCOUNT_TOPUP"), new ExternalAccountTopupPayload.IndiaUpiPayload(str, str2)))));
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(str));
            intent.setPackage(str2);
            C1(new ExternalDestination.ByIntent(intent, null));
            H2(this.f72944t, new s(3));
            Unit unit = Unit.f186387a;
        } catch (Exception e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
        }
    }

    @Override // yki.j
    public final void M0() {
        this.f72942r.a("INDIA_UPI_TRANSFER");
        UpiTransferFlowContract$InputData upiTransferFlowContract$InputData = this.o;
        if (upiTransferFlowContract$InputData.f72936c != null || upiTransferFlowContract$InputData.d == null) {
            h.t2(this, this.u, UpiTransferFlowContract$Step.UpiApplications.f72939a, true, null, false, 12);
        } else {
            l2(new k(this, null, 9), new yi5.b(26));
        }
    }

    @Override // yji.l
    public final void T1(long j2) {
        d dVar = this.f72944t;
        String str = ((UpiTransferFlowContract$State) ((j2) dVar.f22677a).getValue()).f72938b;
        if (!((UpiTransferFlowContract$State) ((j2) dVar.f22677a).getValue()).f72937a || str == null) {
            return;
        }
        H2(dVar, new s(2));
        C2(new d0(str));
    }

    @Override // qki.e
    public final d getState() {
        return this.f72944t;
    }

    @Override // yji.l
    public final boolean o1(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        i iVar = this.u;
        if (iVar.d() != null) {
            return false;
        }
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        iVar.n();
        return false;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.u;
    }
}
