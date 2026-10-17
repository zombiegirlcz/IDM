package com.fourthline.orca.internal;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ga0 implements jz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ib0 f28813a;

    public static final class a extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f28814a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f28815b;
        int d;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.f28815b = obj2;
            this.d |= Integer.MIN_VALUE;
            Object objA = ga0.this.a(null, this);
            return objA == fim.a.COROUTINE_SUSPENDED ? objA : new yhm.m(objA);
        }
    }

    public ga0(ib0 networkService) {
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        this.f28813a = networkService;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // com.fourthline.orca.internal.jz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.fourthline.orca.internal.jz.a r18, kotlin.coroutines.Continuation r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            boolean r2 = r1 instanceof com.fourthline.orca.internal.ga0.a
            if (r2 == 0) goto L17
            r2 = r1
            com.fourthline.orca.internal.ga0$a r2 = (com.fourthline.orca.internal.ga0.a) r2
            int r3 = r2.d
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.d = r3
            goto L1c
        L17:
            com.fourthline.orca.internal.ga0$a r2 = new com.fourthline.orca.internal.ga0$a
            r2.<init>(r1)
        L1c:
            java.lang.Object r1 = r2.f28815b
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.d
            r5 = 1
            if (r4 == 0) goto L3b
            if (r4 != r5) goto L33
            java.lang.Object r2 = r2.f28814a
            com.fourthline.orca.internal.jz$a r2 = (com.fourthline.orca.internal.jz.a) r2
            yhm.o.b(r1)
            yhm.m r1 = (yhm.m) r1
            java.lang.Object r1 = r1.f314193a
            goto L7a
        L33:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3b:
            yhm.o.b(r1)
            com.fourthline.orca.internal.ib0 r1 = r0.f28813a
            java.lang.String r4 = r18.b()
            java.lang.String r6 = r18.a()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "/v1/workflows/"
            r7.<init>(r8)
            r7.append(r4)
            java.lang.String r4 = "/flowVariant?variant="
            r7.append(r4)
            r7.append(r6)
            java.lang.String r11 = r7.toString()
            com.fourthline.orca.internal.ab0$b r10 = com.fourthline.orca.internal.ab0.b.f26760b
            com.fourthline.orca.internal.ab0$a r8 = new com.fourthline.orca.internal.ab0$a
            r15 = 56
            r16 = 0
            java.lang.String r9 = "workflow_flow_variant_url"
            r12 = 0
            r13 = 0
            r14 = 0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            r4 = 0
            r2.f28814a = r4
            r2.d = r5
            java.lang.Object r1 = r1.a(r8, r2)
            if (r1 != r3) goto L7a
            return r3
        L7a:
            java.lang.Throwable r2 = yhm.m.a(r1)
            if (r2 != 0) goto L8e
            com.fourthline.orca.internal.eb0 r1 = (com.fourthline.orca.internal.eb0) r1
            boolean r1 = com.fourthline.orca.internal.fb0.f(r1)
            if (r1 == 0) goto L8b
            com.fourthline.orca.internal.kz r1 = com.fourthline.orca.internal.kz.f30445a
            return r1
        L8b:
            com.fourthline.orca.internal.kz r1 = com.fourthline.orca.internal.kz.f30445a
            return r1
        L8e:
            com.fourthline.orca.internal.re1 r1 = com.fourthline.orca.internal.se1.a(r2)
            yhm.n r1 = yhm.o.a(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.ga0.a(com.fourthline.orca.internal.jz$a, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
