package com.fourthline.vision.internal;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class be implements x1, d2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Function2 f36021a;

    public static final class a extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f36022a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f36023b;
        int d;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(@NotNull Object obj2) {
            this.f36023b = obj2;
            this.d |= Integer.MIN_VALUE;
            return be.this.consume((Unit) null, (Continuation<? super Unit>) this);
        }
    }

    @Override // com.fourthline.vision.internal.x1
    public /* bridge */ /* synthetic */ Object consume(Object obj2, Continuation continuation) {
        return consume((Unit) obj2, (Continuation<? super Unit>) continuation);
    }

    /* JADX INFO: renamed from: get, reason: collision with other method in class */
    public void m3657get() {
    }

    @Override // com.fourthline.vision.internal.d2
    public void subscribe(Function2<? super Unit, ? super Continuation<? super Unit>, ? extends Object> function2) {
        this.f36021a = function2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object consume(@org.jetbrains.annotations.NotNull kotlin.Unit r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r6) throws com.fourthline.vision.internal.ra.a {
        /*
            r4 = this;
            boolean r5 = r6 instanceof com.fourthline.vision.internal.be.a
            if (r5 == 0) goto L13
            r5 = r6
            com.fourthline.vision.internal.be$a r5 = (com.fourthline.vision.internal.be.a) r5
            int r0 = r5.d
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r5.d = r0
            goto L18
        L13:
            com.fourthline.vision.internal.be$a r5 = new com.fourthline.vision.internal.be$a
            r5.<init>(r6)
        L18:
            java.lang.Object r6 = r5.f36023b
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r5.d
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2b
            java.lang.Object r5 = r5.f36022a
            kotlin.Unit r5 = (kotlin.Unit) r5
            yhm.o.b(r6)
            goto L48
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            yhm.o.b(r6)
            kotlin.jvm.functions.Function2 r6 = r4.f36021a
            r1 = 0
            if (r6 == 0) goto L4b
            kotlin.Unit r3 = kotlin.Unit.f186387a
            r5.f36022a = r1
            r5.d = r2
            java.lang.Object r5 = r6.invoke(r3, r5)
            if (r5 != r0) goto L48
            return r0
        L48:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L4b:
            com.fourthline.vision.internal.ra$a r5 = new com.fourthline.vision.internal.ra$a
            com.fourthline.vision.internal.pa r6 = com.fourthline.vision.internal.pa.k
            r0 = 2
            r5.<init>(r6, r1, r0, r1)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.vision.internal.be.consume(kotlin.Unit, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.fourthline.vision.internal.d2
    public /* bridge */ /* synthetic */ Object get() {
        m3657get();
        return Unit.f186387a;
    }
}
