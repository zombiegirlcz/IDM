package com.fourthline.orca.internal;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes23.dex */
public final class g71 implements gh1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f28779a;

    public static final class a extends gim.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f28780a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f28781b;
        int d;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // gim.a
        public final Object invokeSuspend(Object obj2) {
            this.f28781b = obj2;
            this.d |= Integer.MIN_VALUE;
            Object objA = g71.this.a(null, this);
            return objA == fim.a.COROUTINE_SUSPENDED ? objA : new yhm.m(objA);
        }
    }

    public g71(long j2) {
        this.f28779a = j2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // com.fourthline.orca.internal.gh1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(com.fourthline.orca.internal.gh1.a r11, kotlin.coroutines.Continuation r12) {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.g71.a(com.fourthline.orca.internal.gh1$a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public /* synthetic */ g71(long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 1000L : j2);
    }

    private final ig1 a(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != 65527) {
            if (iHashCode != 72347) {
                if (iHashCode == 80063 && str.equals("QES")) {
                    return new ig1("QualifiedElectronicSignature");
                }
            } else if (str.equals("IDV")) {
                return new ig1("IdentityVerification");
            }
        } else if (str.equals("BAV")) {
            return new ig1("BankAccountVerification");
        }
        throw new IllegalStateException(("Don't support " + str + " module").toString());
    }
}
