package com.fourthline.orca.internal;

import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class la0 implements w70 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f30553c = new a(null);
    public static final int d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u21 f30554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c00 f30555b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f30556a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f30557b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f30558c;
        int e;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) throws NoSuchAlgorithmException, UnrecoverableKeyException, KeyStoreException {
            this.f30558c = obj2;
            this.e |= Integer.MIN_VALUE;
            Object objA = la0.this.a(null, null, this);
            return objA == fim.a.COROUTINE_SUSPENDED ? objA : new yhm.m(objA);
        }
    }

    public la0(u21 signingManager, c00 getChallengeWorker) {
        Intrinsics.checkNotNullParameter(signingManager, "signingManager");
        Intrinsics.checkNotNullParameter(getChallengeWorker, "getChallengeWorker");
        this.f30554a = signingManager;
        this.f30555b = getChallengeWorker;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.fourthline.orca.internal.w70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(byte[] r5, java.lang.String r6, kotlin.coroutines.Continuation r7) throws java.security.NoSuchAlgorithmException, java.security.UnrecoverableKeyException, java.security.KeyStoreException {
        /*
            r4 = this;
            boolean r0 = r7 instanceof com.fourthline.orca.internal.la0.b
            if (r0 == 0) goto L13
            r0 = r7
            com.fourthline.orca.internal.la0$b r0 = (com.fourthline.orca.internal.la0.b) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            com.fourthline.orca.internal.la0$b r0 = new com.fourthline.orca.internal.la0$b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f30558c
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r5 = r0.f30557b
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r5 = r0.f30556a
            byte[] r5 = (byte[]) r5
            yhm.o.b(r7)
            yhm.m r7 = (yhm.m) r7
            java.lang.Object r6 = r7.f314193a
            goto L4f
        L33:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3b:
            yhm.o.b(r7)
            int r7 = r5.length
            com.fourthline.orca.internal.c00 r7 = r4.f30555b
            r0.f30556a = r5
            r2 = 0
            r0.f30557b = r2
            r0.e = r3
            java.lang.Object r6 = r7.a(r6, r0)
            if (r6 != r1) goto L4f
            return r1
        L4f:
            java.lang.Throwable r7 = yhm.m.a(r6)
            if (r7 != 0) goto L8c
            com.fourthline.orca.internal.y9 r6 = (com.fourthline.orca.internal.y9) r6
            r6.getNonce()
            java.lang.Thread r7 = java.lang.Thread.currentThread()
            r7.getName()
            com.fourthline.orca.internal.u21 r7 = r4.f30554a     // Catch: com.fourthline.orca.internal.u21.b -> L84
            java.lang.String r0 = r6.getCreationUtcDateTime()     // Catch: com.fourthline.orca.internal.u21.b -> L84
            java.lang.String r1 = r6.getNonce()     // Catch: com.fourthline.orca.internal.u21.b -> L84
            byte[] r5 = r7.a(r5, r0, r1)     // Catch: com.fourthline.orca.internal.u21.b -> L84
            int r7 = r5.length
            com.fourthline.orca.internal.v70 r7 = new com.fourthline.orca.internal.v70
            r0 = 2
            java.lang.String r5 = android.util.Base64.encodeToString(r5, r0)
            java.lang.String r0 = "encodeToString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)
            java.lang.String r6 = r6.getNonce()
            r7.<init>(r5, r6)
            return r7
        L84:
            r5 = move-exception
            yhm.m$a r6 = yhm.m.INSTANCE
            yhm.n r5 = yhm.o.a(r5)
            return r5
        L8c:
            yhm.n r5 = yhm.o.a(r7)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.la0.a(byte[], java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
