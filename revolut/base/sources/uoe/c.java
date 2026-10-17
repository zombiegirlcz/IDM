package uoe;

import efm.d0;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import q06.k;
import skm.p0;
import sri.m;
import te0.w;
import ue0.e;
import ufm.i;
import uif.d;
import un8.j;
import wp5.y;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements bne.b, k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f281642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cne.a f281643b;

    public c(m navigator, cne.a stampDutyInteractor) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(stampDutyInteractor, "stampDutyInteractor");
        this.f281642a = navigator;
        this.f281643b = stampDutyInteractor;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "pay-stamp-duty");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r12, kotlin.coroutines.Continuation r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof uoe.b
            if (r0 == 0) goto L13
            r0 = r13
            uoe.b r0 = (uoe.b) r0
            int r1 = r0.f281641y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f281641y = r1
            goto L1a
        L13:
            uoe.b r0 = new uoe.b
            gim.c r13 = (gim.c) r13
            r0.<init>(r11, r13)
        L1a:
            java.lang.Object r13 = r0.f281639w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f281641y
            r3 = 1
            r4 = 2
            r9 = 0
            if (r2 == 0) goto L3e
            if (r2 == r3) goto L37
            if (r2 != r4) goto L2f
            com.revolut.feature.tax_residency.api.stamp_duty.models.StampDutyAccount r12 = r0.v
            yhm.o.b(r13)
            goto L8e
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            jf0.c r12 = r0.u
            yhm.o.b(r13)
        L3c:
            r6 = r12
            goto L6f
        L3e:
            yhm.o.b(r13)
            java.util.HashMap r13 = r12.d
            java.lang.String r2 = "walletId"
            java.lang.Object r13 = r13.get(r2)
            java.lang.String r13 = (java.lang.String) r13
            if (r13 == 0) goto Lb8
            java.lang.String r2 = "id"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r2)
            r0.u = r12
            r0.f281641y = r3
            cne.a r2 = r11.f281643b
            yoe.c r2 = (yoe.c) r2
            g48.r0 r2 = r2.f315671c
            w4l.h r3 = w4l.h.f294642c
            wkm.l r2 = k38.c.a(r2, r3, r9, r4)
            ctk.b r3 = new ctk.b
            r5 = 2
            r3.<init>(r2, r13, r5)
            java.lang.Object r13 = vkm.q.x(r3, r0)
            if (r13 != r1) goto L3c
            goto L8c
        L6f:
            r8 = r13
            com.revolut.feature.tax_residency.api.stamp_duty.models.StampDutyAccount r8 = (com.revolut.feature.tax_residency.api.stamp_duty.models.StampDutyAccount) r8
            kotlinx.coroutines.d r12 = skm.p0.f264003c
            twb.b0 r5 = new twb.b0
            r10 = 24
            r7 = r11
            r5.<init>(r6, r7, r8, r9, r10)
            ufm.b r12 = te0.w.o0(r12, r5)
            r0.u = r9
            r0.v = r8
            r0.f281641y = r4
            java.lang.Object r13 = nim.a.b(r12, r0)
            if (r13 != r1) goto L8d
        L8c:
            return r1
        L8d:
            r12 = r8
        L8e:
            dne.c r13 = (dne.c) r13
            boolean r0 = r13 instanceof dne.a
            if (r0 == 0) goto Lb8
            q06.h r0 = new q06.h
            com.revolut.kompot.bridge.navigation.BridgeDestination r1 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            dne.a r13 = (dne.a) r13
            dj0.d r13 = r13.f116289b
            com.revolut.feature.tax_residency.api.stamp_duty.StampDutyDestination$Pay r2 = new com.revolut.feature.tax_residency.api.stamp_duty.StampDutyDestination$Pay
            r2.<init>(r12, r13)
            yhi.b r12 = yhi.b.BOTTOM_DIALOG
            r13 = 0
            r3 = 12
            com.revolut.retail.core.navigation.FeatureCommand r12 = vhi.c.c(r2, r12, r9, r13, r3)
            r1.<init>(r12)
            q06.b r12 = new q06.b
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r13 = ibb.c.f160140a
            r12.<init>(r13, r9)
            r0.<init>(r1, r12)
            return r0
        Lb8:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: uoe.c.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        HashMap map = deeplink.d;
        String id10 = (String) map.get("walletId");
        Continuation continuation = null;
        if (id10 != null) {
            Intrinsics.checkNotNullParameter(id10, "id");
        } else {
            id10 = null;
        }
        if (id10 != null) {
            i iVar = new i(w.o0(p0.f264003c, new j(this, id10, continuation, 2)), new uhl.b(new d(this, deeplink, 7), 29), 0);
            Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
            return e.F(iVar, Boolean.TRUE);
        }
        IllegalStateException illegalStateException = new IllegalStateException("No wallet specified in deeplink uri=" + deeplink.f173629c + ", parameters=" + map);
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
        ufm.b bVarM = d0.m(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }
}
