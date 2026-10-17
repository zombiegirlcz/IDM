package com.revolut.retail.feature.pod_nominees.impl.edit;

import com.revolut.retail.feature.pod_nominees.impl.edit.a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import lr.l;
import m2f.b0;
import mek.g;
import mek.o;
import nii.e;
import vkm.q;
import vkm.t1;
import vkm.z1;

/* JADX INFO: loaded from: classes11.dex */
public final class d extends o {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final PodNomineeEditScreenContract$InputData f102603l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final lek.b f102604m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final qek.a f102605n;
    public final z1 o;

    public d(PodNomineeEditScreenContract$InputData inputData, lek.b podNomineesInteractor, qek.a dialogMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(podNomineesInteractor, "podNomineesInteractor");
        Intrinsics.checkNotNullParameter(dialogMapper, "dialogMapper");
        this.f102603l = inputData;
        this.f102604m = podNomineesInteractor;
        this.f102605n = dialogMapper;
        this.o = q.b(0, 7, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
    
        if (r1.g3((nii.e) r10, r5) == r0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d3(com.revolut.retail.feature.pod_nominees.impl.edit.d r8, mek.g r9, gim.c r10) {
        /*
            r8.getClass()
            boolean r0 = r10 instanceof mek.q
            if (r0 == 0) goto L17
            r0 = r10
            mek.q r0 = (mek.q) r0
            int r1 = r0.f204718w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L17
            int r1 = r1 - r2
            r0.f204718w = r1
        L15:
            r5 = r0
            goto L1d
        L17:
            mek.q r0 = new mek.q
            r0.<init>(r8, r10)
            goto L15
        L1d:
            java.lang.Object r10 = r5.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r5.f204718w
            r7 = 2
            r2 = 1
            if (r1 == 0) goto L3c
            if (r1 == r2) goto L37
            if (r1 != r7) goto L2f
            yhm.o.b(r10)
            goto L63
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            yhm.o.b(r10)
            r1 = r8
            goto L58
        L3c:
            yhm.o.b(r10)
            mek.p r3 = new mek.p
            r10 = 0
            r3.<init>(r8, r10)
            mek.r r4 = new mek.r
            r10 = 1
            r1 = 0
            r4.<init>(r8, r9, r1, r10)
            r5.f204718w = r2
            r2 = 0
            r6 = 3
            r1 = r8
            java.lang.Object r10 = n14.k.R(r1, r2, r3, r4, r5, r6)
            if (r10 != r0) goto L58
            goto L62
        L58:
            nii.e r10 = (nii.e) r10
            r5.f204718w = r7
            java.lang.Object r8 = r1.g3(r10, r5)
            if (r8 != r0) goto L63
        L62:
            return r0
        L63:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.pod_nominees.impl.edit.d.d3(com.revolut.retail.feature.pod_nominees.impl.edit.d, mek.g, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
    
        if (r11.g3((nii.e) r1, r4) == r7) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e3(com.revolut.retail.feature.pod_nominees.impl.edit.d r11, mek.g r12, java.lang.String r13, gim.c r14) {
        /*
            r11.getClass()
            boolean r2 = r14 instanceof mek.t
            if (r2 == 0) goto L17
            r2 = r14
            mek.t r2 = (mek.t) r2
            int r3 = r2.f204724w
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f204724w = r3
        L15:
            r6 = r2
            goto L1d
        L17:
            mek.t r2 = new mek.t
            r2.<init>(r11, r14)
            goto L15
        L1d:
            java.lang.Object r1 = r6.u
            fim.a r7 = fim.a.COROUTINE_SUSPENDED
            int r2 = r6.f204724w
            r8 = 2
            r9 = 1
            if (r2 == 0) goto L3c
            if (r2 == r9) goto L37
            if (r2 != r8) goto L2f
            yhm.o.b(r1)
            goto L6a
        L2f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L37:
            yhm.o.b(r1)
            r4 = r6
            goto L5f
        L3c:
            yhm.o.b(r1)
            mek.p r10 = new mek.p
            r1 = 1
            r10.<init>(r11, r1)
            mek.u r3 = new mek.u
            r5 = 1
            r4 = 0
            r1 = r11
            r2 = r13
            r0 = r3
            r3 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f204724w = r9
            r1 = 0
            r5 = 3
            r3 = r0
            r4 = r6
            r2 = r10
            r0 = r11
            java.lang.Object r1 = n14.k.R(r0, r1, r2, r3, r4, r5)
            if (r1 != r7) goto L5f
            goto L69
        L5f:
            nii.e r1 = (nii.e) r1
            r4.f204724w = r8
            java.lang.Object r0 = r11.g3(r1, r4)
            if (r0 != r7) goto L6a
        L69:
            return r7
        L6a:
            kotlin.Unit r0 = kotlin.Unit.f186387a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.pod_nominees.impl.edit.d.e3(com.revolut.retail.feature.pod_nominees.impl.edit.d, mek.g, java.lang.String, gim.c):java.lang.Object");
    }

    public static final String f3(d dVar, g gVar) {
        dVar.getClass();
        String str = gVar.d.f204705a;
        if (d0.W(str)) {
            return null;
        }
        return str;
    }

    @Override // mek.o
    public final void Z2(g domainState) {
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        T2(new b0(domainState, this, null, 19), new yi5.b(27));
    }

    @Override // mek.o
    public final void b3(g domainState, String podNomineeId) {
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Intrinsics.checkNotNullParameter(podNomineeId, "podNomineeId");
        T2(new l(domainState, this, podNomineeId, (Continuation) null, 17), new yi5.b(27));
    }

    @Override // mek.o
    public final t1 c3() {
        return q.g(this.o);
    }

    public final Object g3(e eVar, gim.c cVar) throws Throwable {
        if (eVar instanceof nii.c) {
            return Unit.f186387a;
        }
        if (!(eVar instanceof nii.d)) {
            throw new NoWhenBranchMatchedException();
        }
        Object objEmit = this.o.emit(a.b.f102596a, cVar);
        return objEmit == fim.a.COROUTINE_SUSPENDED ? objEmit : Unit.f186387a;
    }
}
