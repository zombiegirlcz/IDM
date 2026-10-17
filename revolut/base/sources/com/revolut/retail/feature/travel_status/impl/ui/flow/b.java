package com.revolut.retail.feature.travel_status.impl.ui.flow;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.travel_status.impl.R$string;
import com.revolut.retail.feature.travel_status.impl.ui.flow.TravelStatusFlowContract$Step;
import gim.c;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import nii.y0;
import nii.z;
import oki.h;
import vfg.p;
import vkm.q;
import yki.i;
import z1l.d;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends h implements c2l.b {
    public final TravelStatusFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p f104311p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d f104312q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f104313r;

    public b(TravelStatusFlowContract$InputData inputData, p plansInteractor, d partnerInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(plansInteractor, "plansInteractor");
        Intrinsics.checkNotNullParameter(partnerInteractor, "partnerInteractor");
        this.o = inputData;
        this.f104311p = plansInteractor;
        this.f104312q = partnerInteractor;
        this.f104313r = d8l.d.a(this, new bwd.a(this, 12));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.retail.feature.travel_status.impl.ui.flow.b r6, java.lang.String r7, gim.c r8) {
        /*
            boolean r0 = r8 instanceof c2l.e
            if (r0 == 0) goto L13
            r0 = r8
            c2l.e r0 = (c2l.e) r0
            int r1 = r0.f20829w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f20829w = r1
            goto L18
        L13:
            c2l.e r0 = new c2l.e
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f20829w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r8)
            goto L58
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            yhm.o.b(r8)     // Catch: java.lang.Throwable -> L36
            goto L58
        L36:
            r7 = move-exception
            goto L4b
        L38:
            yhm.o.b(r8)
            c2l.f r8 = new c2l.f     // Catch: java.lang.Throwable -> L36
            r2 = 0
            r5 = 0
            r8.<init>(r6, r7, r5, r2)     // Catch: java.lang.Throwable -> L36
            r0.f20829w = r4     // Catch: java.lang.Throwable -> L36
            java.lang.Object r6 = r6.p2(r0, r8)     // Catch: java.lang.Throwable -> L36
            if (r6 != r1) goto L58
            goto L5a
        L4b:
            boolean r8 = r7 instanceof java.util.concurrent.CancellationException
            if (r8 != 0) goto L5b
            r0.f20829w = r3
            java.lang.Object r6 = r6.L2(r7, r0)
            if (r6 != r1) goto L58
            goto L5a
        L58:
            kotlin.Unit r1 = kotlin.Unit.f186387a
        L5a:
            return r1
        L5b:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.travel_status.impl.ui.flow.b.I2(com.revolut.retail.feature.travel_status.impl.ui.flow.b, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r24v0, types: [com.revolut.retail.feature.travel_status.impl.ui.flow.b, yji.l] */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r8v1, types: [tji.l] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.retail.feature.travel_status.impl.ui.flow.b r24, java.lang.String r25, gim.c r26) {
        /*
            r1 = r24
            r0 = r26
            boolean r2 = r0 instanceof c2l.h
            if (r2 == 0) goto L17
            r2 = r0
            c2l.h r2 = (c2l.h) r2
            int r3 = r2.f20833w
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f20833w = r3
            goto L1c
        L17:
            c2l.h r2 = new c2l.h
            r2.<init>(r1, r0)
        L1c:
            java.lang.Object r0 = r2.u
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.f20833w
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            if (r4 == 0) goto L45
            if (r4 == r7) goto L41
            if (r4 == r6) goto L3b
            if (r4 != r5) goto L33
            yhm.o.b(r0)
            goto Lad
        L33:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3b:
            yhm.o.b(r0)     // Catch: java.lang.Throwable -> L3f
            goto L9d
        L3f:
            r0 = move-exception
            goto La0
        L41:
            yhm.o.b(r0)     // Catch: java.lang.Throwable -> L3f
            goto L59
        L45:
            yhm.o.b(r0)
            c2l.f r0 = new c2l.f     // Catch: java.lang.Throwable -> L3f
            r4 = 1
            r9 = r25
            r0.<init>(r1, r9, r8, r4)     // Catch: java.lang.Throwable -> L3f
            r2.f20833w = r7     // Catch: java.lang.Throwable -> L3f
            java.lang.Object r0 = r1.p2(r2, r0)     // Catch: java.lang.Throwable -> L3f
            if (r0 != r3) goto L59
            goto Laf
        L59:
            a2l.a r0 = (a2l.a) r0     // Catch: java.lang.Throwable -> L3f
            if (r0 == 0) goto L8e
            java.lang.String r10 = r0.f892a     // Catch: java.lang.Throwable -> L3f
            if (r10 == 0) goto L8e
            nii.y0 r0 = new nii.y0     // Catch: java.lang.Throwable -> L3f
            com.revolut.core.ui_kit.models.TextClause r9 = new com.revolut.core.ui_kit.models.TextClause     // Catch: java.lang.Throwable -> L3f
            r15 = 0
            r16 = 126(0x7e, float:1.77E-43)
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> L3f
            nii.h0 r21 = nii.h0.NONE     // Catch: java.lang.Throwable -> L3f
            nii.u1$b r16 = nii.u1.b.f216225a     // Catch: java.lang.Throwable -> L3f
            nii.j0 r11 = new nii.j0     // Catch: java.lang.Throwable -> L3f
            r22 = 0
            r23 = 3054(0xbee, float:4.28E-42)
            r13 = 0
            r14 = 0
            r15 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r12 = r9
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)     // Catch: java.lang.Throwable -> L3f
            r4 = 0
            r7 = 5
            r0.<init>(r8, r11, r4, r7)     // Catch: java.lang.Throwable -> L3f
            r8 = r0
        L8e:
            if (r8 == 0) goto Lad
            kotlinx.coroutines.flow.Flow r0 = r1.X1(r8)     // Catch: java.lang.Throwable -> L3f
            r2.f20833w = r6     // Catch: java.lang.Throwable -> L3f
            java.lang.Object r0 = vkm.q.x(r0, r2)     // Catch: java.lang.Throwable -> L3f
            if (r0 != r3) goto L9d
            goto Laf
        L9d:
            nii.n1 r0 = (nii.n1) r0     // Catch: java.lang.Throwable -> L3f
            goto Lad
        La0:
            boolean r4 = r0 instanceof java.util.concurrent.CancellationException
            if (r4 != 0) goto Lb0
            r2.f20833w = r5
            java.lang.Object r0 = r1.L2(r0, r2)
            if (r0 != r3) goto Lad
            goto Laf
        Lad:
            kotlin.Unit r3 = kotlin.Unit.f186387a
        Laf:
            return r3
        Lb0:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.travel_status.impl.ui.flow.b.J2(com.revolut.retail.feature.travel_status.impl.ui.flow.b, java.lang.String, gim.c):java.lang.Object");
    }

    public final void K2() {
        String str = this.o.f104302a;
        h.t2(this, this.f104313r, (str == null || d0.W(str)) ? TravelStatusFlowContract$Step.Overview.f104305a : new TravelStatusFlowContract$Step.Partner(str), false, null, false, 12);
    }

    public final Object L2(Throwable th10, c cVar) {
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, th10, h0Var);
        Object objX = q.x(X1(new y0(null, new z(new TextLocalisedClause(R$string.travel_status_partner_validate_error_title, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 5)), cVar);
        return objX == fim.a.COROUTINE_SUSPENDED ? objX : Unit.f186387a;
    }

    @Override // yki.j
    public final void M0() {
        l2(new bv4.h(this, null, 6), new c2l.c(this, 0));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f104313r;
    }
}
