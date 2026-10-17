package com.fourthline.orca.internal;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class ie0 implements lz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lz f29560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function0 f29561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f29562c;

    public static final class a extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f29563a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f29564b;
        int d;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.f29564b = obj2;
            this.d |= Integer.MIN_VALUE;
            Object objA = ie0.this.a(null, this);
            return objA == fim.a.COROUTINE_SUSPENDED ? objA : new yhm.m(objA);
        }
    }

    public ie0(lz delegate, Function0 skipPersonFlowUseCase, int i) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(skipPersonFlowUseCase, "skipPersonFlowUseCase");
        this.f29560a = delegate;
        this.f29561b = skipPersonFlowUseCase;
        this.f29562c = i;
    }

    private final boolean a(lz lzVar) {
        return lzVar instanceof wc1;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.lz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.fourthline.orca.internal.lz.a r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.fourthline.orca.internal.ie0.a
            if (r0 == 0) goto L13
            r0 = r6
            com.fourthline.orca.internal.ie0$a r0 = (com.fourthline.orca.internal.ie0.a) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            com.fourthline.orca.internal.ie0$a r0 = new com.fourthline.orca.internal.ie0$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f29564b
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r5 = r0.f29563a
            com.fourthline.orca.internal.lz$a r5 = (com.fourthline.orca.internal.lz.a) r5
            yhm.o.b(r6)
            yhm.m r6 = (yhm.m) r6
            java.lang.Object r5 = r6.f314193a
            return r5
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L37:
            yhm.o.b(r6)
            com.fourthline.orca.internal.lz r6 = r4.f29560a
            boolean r6 = r4.a(r6)
            if (r6 != 0) goto L66
            kotlin.jvm.functions.Function0 r6 = r4.f29561b
            java.lang.Object r6 = r6.invoke()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L66
            com.fourthline.orca.internal.lz$c$c r5 = new com.fourthline.orca.internal.lz$c$c
            com.fourthline.orca.internal.dk0 r6 = new com.fourthline.orca.internal.dk0
            int r0 = r4.f29562c
            r6.<init>(r0)
            java.lang.String r0 = "person"
            r5.<init>(r0, r6)
            yhm.m$a r6 = yhm.m.INSTANCE
            com.fourthline.orca.internal.lz$b r6 = new com.fourthline.orca.internal.lz$b
            r6.<init>(r5)
            return r6
        L66:
            com.fourthline.orca.internal.lz r6 = r4.f29560a
            r2 = 0
            r0.f29563a = r2
            r0.d = r3
            java.lang.Object r5 = r6.a(r5, r0)
            if (r5 != r1) goto L74
            return r1
        L74:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.ie0.a(com.fourthline.orca.internal.lz$a, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
