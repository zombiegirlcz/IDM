package ii4;

import com.revolut.feature.credit.application.plugins.api.models.config.SpinnerConfiguration;
import com.revolut.feature.credit.application.plugins.api.models.config.WaitingPopupScreenConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class z implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final li4.a f161572a;

    public z(li4.a spinnerPollingFactoryProvider) {
        Intrinsics.checkNotNullParameter(spinnerPollingFactoryProvider, "spinnerPollingFactoryProvider");
        this.f161572a = spinnerPollingFactoryProvider;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006b, code lost:
    
        if (r10 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(ii4.z r8, ii4.g0 r9, gim.c r10) {
        /*
            boolean r0 = r10 instanceof ii4.v
            if (r0 == 0) goto L13
            r0 = r10
            ii4.v r0 = (ii4.v) r0
            int r1 = r0.f161562x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f161562x = r1
            goto L18
        L13:
            ii4.v r0 = new ii4.v
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f161562x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L39
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r10)     // Catch: java.lang.Exception -> L78
        L29:
            r3 = r10
            goto L6e
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            ii4.g0 r9 = r0.u
            yhm.o.b(r10)
            goto L60
        L39:
            yhm.o.b(r10)
            li4.a r8 = r8.f161572a
            r0.u = r9
            r0.f161562x = r4
            java.util.Map r8 = r8.f195412a
            ks3.b r10 = r9.f161525b
            ks3.b r2 = ks3.b.BEHAVIORAL_DATA_CAPTURE
            if (r10 != r2) goto L54
            java.lang.Class<li4.e> r10 = li4.e.class
            java.lang.Object r8 = zhm.r0.h(r10, r8)
            li4.b r8 = (li4.b) r8
        L52:
            r10 = r8
            goto L5d
        L54:
            java.lang.Class<li4.d> r10 = li4.d.class
            java.lang.Object r8 = zhm.r0.h(r10, r8)
            li4.b r8 = (li4.b) r8
            goto L52
        L5d:
            if (r10 != r1) goto L60
            goto L6d
        L60:
            li4.b r10 = (li4.b) r10
            r8 = 0
            r0.u = r8     // Catch: java.lang.Exception -> L78
            r0.f161562x = r3     // Catch: java.lang.Exception -> L78
            java.lang.Object r10 = r10.b(r9, r0)     // Catch: java.lang.Exception -> L78
            if (r10 != r1) goto L29
        L6d:
            return r1
        L6e:
            com.revolut.data.model.Data r2 = new com.revolut.data.model.Data     // Catch: java.lang.Exception -> L78
            r5 = 0
            r4 = 0
            r6 = 6
            r7 = 0
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L78
            return r2
        L78:
            r0 = move-exception
            r8 = r0
            r2 = r8
            com.revolut.data.model.Data r0 = new com.revolut.data.model.Data
            r4 = 5
            r5 = 0
            r1 = 0
            r3 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ii4.z.a(ii4.z, ii4.g0, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(ii4.z r22, kotlinx.coroutines.channels.ProducerScope r23, ii4.q r24, hs3.u1 r25, hs3.u1 r26, boolean r27, gim.c r28) {
        /*
            r0 = r24
            r1 = r26
            r2 = r28
            boolean r3 = r2 instanceof ii4.x
            if (r3 == 0) goto L19
            r3 = r2
            ii4.x r3 = (ii4.x) r3
            int r4 = r3.z
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.z = r4
            goto L20
        L19:
            ii4.x r3 = new ii4.x
            r4 = r22
            r3.<init>(r4, r2)
        L20:
            java.lang.Object r2 = r3.f161567x
            fim.a r4 = fim.a.COROUTINE_SUSPENDED
            int r5 = r3.z
            r6 = 1
            if (r5 == 0) goto L3e
            if (r5 != r6) goto L36
            boolean r0 = r3.f161566w
            hs3.u1 r1 = r3.v
            ii4.q r3 = r3.u
            yhm.o.b(r2)
            r5 = r3
            goto L67
        L36:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3e:
            yhm.o.b(r2)
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r25, r26)
            if (r2 != 0) goto La0
            if (r1 != 0) goto L4a
            goto La0
        L4a:
            ii4.k r2 = new ii4.k
            r2.<init>(r1)
            r3.u = r0
            r3.v = r1
            r5 = r27
            r3.f161566w = r5
            r3.z = r6
            r6 = r23
            java.lang.Object r2 = r6.send(r2, r3)
            if (r2 != r4) goto L62
            return r4
        L62:
            r21 = r5
            r5 = r0
            r0 = r21
        L67:
            ii4.r r2 = r5.f161544a
            com.revolut.data.model.Data r3 = r2.f161547a
            ii4.g0 r4 = r2.f161548b
            it3.d r2 = r2.d
            java.lang.String r6 = "applicationData"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r6)
            java.lang.String r6 = "spinnerPayload"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r6)
            ii4.r r6 = new ii4.r
            r6.<init>(r3, r4, r1, r2)
            java.lang.String r2 = "statusResult"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r2)
            r10 = 0
            r12 = 14
            r7 = 0
            r8 = 0
            ii4.q r13 = ii4.q.a(r5, r6, r7, r8, r10, r12)
            if (r0 == 0) goto L9f
            long r0 = r1.f154954b
            r18 = 0
            r20 = 9
            r14 = 0
            r15 = 0
            r16 = r0
            ii4.q r0 = ii4.q.a(r13, r14, r15, r16, r18, r20)
            return r0
        L9f:
            return r13
        La0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ii4.z.b(ii4.z, kotlinx.coroutines.channels.ProducerScope, ii4.q, hs3.u1, hs3.u1, boolean, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable c(it3.d r18, gim.c r19) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ii4.z.c(it3.d, gim.c):java.io.Serializable");
    }

    public final vkm.f d(SpinnerConfiguration.Mode.Limited.TerminationCondition terminationCondition, long j2, int i, long j3, ju3.g screenAfterLastRetryPopupType, WaitingPopupScreenConfig screenAfterLastRetry, g0 payload) {
        Intrinsics.checkNotNullParameter(terminationCondition, "terminationCondition");
        Intrinsics.checkNotNullParameter(screenAfterLastRetryPopupType, "screenAfterLastRetryPopupType");
        Intrinsics.checkNotNullParameter(screenAfterLastRetry, "screenAfterLastRetry");
        Intrinsics.checkNotNullParameter(payload, "payload");
        return vkm.q.m(new y(payload, j3, i, this, j2, terminationCondition, screenAfterLastRetry, screenAfterLastRetryPopupType, null));
    }
}
