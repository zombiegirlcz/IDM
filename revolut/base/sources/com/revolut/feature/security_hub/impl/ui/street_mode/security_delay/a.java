package com.revolut.feature.security_hub.impl.ui.street_mode.security_delay;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.security_hub.api.models.SecurityDelayInfo;
import com.revolut.feature.security_hub.api.navigation.SecurityDelayInputData;
import com.revolut.feature.security_hub.api.navigation.SecurityDelayType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import l80.f;
import oki.h;
import s56.d0;
import tna.p;
import tp8.l;
import tsk.j;
import tvc.e;
import tvc.g;
import ufm.d;
import vkm.j2;
import vkm.v1;
import w39.b;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends h implements e {
    public final SecurityDelayInputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f85676p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final buc.a f85677q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d f85678r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final l80.e f85679s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f85680t;
    public final com.revolut.kompot.navigable.vc.modal.a u;

    public a(n stateMapper, SecurityDelayInputData inputData, b locationInteractor, buc.a locationPermissionControllerProvider, d securityDelayInteractor, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(locationInteractor, "locationInteractor");
        Intrinsics.checkNotNullParameter(locationPermissionControllerProvider, "locationPermissionControllerProvider");
        Intrinsics.checkNotNullParameter(securityDelayInteractor, "securityDelayInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.o = inputData;
        this.f85676p = locationInteractor;
        this.f85677q = locationPermissionControllerProvider;
        this.f85678r = securityDelayInteractor;
        this.f85679s = dateProvider;
        this.f85680t = mra.d.b(this, new tvc.d(inputData.f85457a, false, new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.u = hx7.e.a(this, new l(this, 11));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.security_hub.impl.ui.street_mode.security_delay.a r4, java.lang.String r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof tvc.h
            if (r0 == 0) goto L13
            r0 = r6
            tvc.h r0 = (tvc.h) r0
            int r1 = r0.f274752w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f274752w = r1
            goto L18
        L13:
            tvc.h r0 = new tvc.h
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f274752w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L3d
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r6)
            ufm.d r6 = r4.f85678r
            r0.f274752w = r3
            java.lang.Object r5 = r6.b(r5, r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            rtc.c r5 = rtc.c.f257222a
            r4.C2(r5)
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.security_hub.impl.ui.street_mode.security_delay.a.I2(com.revolut.feature.security_hub.impl.ui.street_mode.security_delay.a, java.lang.String, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        v1 v1Var;
        Continuation continuation = null;
        l2(new g(this, continuation, 0), new yi5.b(26));
        SecurityDelayType securityDelayType = this.o.f85457a;
        boolean z = securityDelayType instanceof SecurityDelayType.WealthProtection;
        d dVar = this.f85678r;
        if (z) {
            dVar.getClass();
            v1Var = new v1(new wh3.h(dVar, (Continuation) null, 5));
        } else {
            if (!(securityDelayType instanceof SecurityDelayType.Transaction)) {
                throw new NoWhenBranchMatchedException();
            }
            String transactionId = ((SecurityDelayType.Transaction) securityDelayType).f85458a;
            dVar.getClass();
            Intrinsics.checkNotNullParameter(transactionId, "transactionId");
            v1Var = new v1(new d0(dVar, transactionId, continuation, 23));
        }
        yji.l.a1(this, v1Var, null, null, new p(this, continuation, 18), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.u;
    }

    @Override // yji.l
    public final void T1(long j2) {
        y yVar = this.f85680t;
        SecurityDelayInfo securityDelayInfo = (SecurityDelayInfo) ((tvc.d) ((j2) yVar.f22677a).getValue()).f274747c.getContent();
        if (!(securityDelayInfo instanceof SecurityDelayInfo.InProgress) || ((f) this.f85679s).b().toEpochMilli() < ((SecurityDelayInfo.InProgress) securityDelayInfo).f85414c) {
            return;
        }
        H2(yVar, new j(14));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f85680t;
    }
}
