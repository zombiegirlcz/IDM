package com.revolut.feature.revolutpay.impl.external.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.revolut.feature.revolutpay.impl.external.d;
import gte.a;
import kotlin.Metadata;
import kotlin.coroutines.e;
import kotlin.jvm.internal.Intrinsics;
import p7c.r;
import q7c.x;
import skm.c2;
import skm.e0;
import skm.p0;
import z7c.b;
import zkm.o;
import zm0.c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/revolutpay/impl/external/service/IsReadyToPayService;", "Landroid/app/Service;", "<init>", "()V", "feature_revolut_pay_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IsReadyToPayService extends Service {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x f84462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f84463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zkm.d f84464c;
    public final b d;

    public IsReadyToPayService() {
        c2 c2VarE = e0.e();
        p0 p0Var = p0.f264001a;
        this.f84464c = e0.c(e.d(c2VarE, o.f323119a.e));
        this.d = new b(this);
    }

    public static final a a(IsReadyToPayService isReadyToPayService) {
        phm.a aVar = (phm.a) ue0.e.j(isReadyToPayService).a().get(ite.a.class);
        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
        if (aVar2 != null) {
            return ((ite.a) aVar2.b()).b();
        }
        throw new IllegalStateException(a0.d.q("Api ", ite.a.class, " is not found"));
    }

    public static final c b(IsReadyToPayService isReadyToPayService) {
        phm.a aVar = (phm.a) ue0.e.j(isReadyToPayService).a().get(an0.c.class);
        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
        if (aVar2 != null) {
            return ((an0.c) aVar2.b()).j();
        }
        throw new IllegalStateException(a0.d.q("Api ", an0.c.class, " is not found"));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(com.revolut.feature.revolutpay.impl.external.service.IsReadyToPayService r9, android.os.Bundle r10, java.util.Set r11, gim.c r12) {
        /*
            boolean r0 = r12 instanceof z7c.c
            if (r0 == 0) goto L14
            r0 = r12
            z7c.c r0 = (z7c.c) r0
            int r1 = r0.f319957w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f319957w = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            z7c.c r0 = new z7c.c
            r0.<init>(r9, r12)
            goto L12
        L1a:
            java.lang.Object r12 = r7.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r7.f319957w
            r8 = 1
            if (r1 == 0) goto L31
            if (r1 != r8) goto L29
            yhm.o.b(r12)
            goto L7a
        L29:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L31:
            yhm.o.b(r12)
            if (r10 == 0) goto Lb3
            com.revolut.feature.revolutpay.impl.external.d r12 = r9.f84463b
            java.lang.String r1 = "webPaymentParametersParser"
            r2 = 0
            if (r12 == 0) goto Laf
            java.lang.String r12 = "packageName"
            java.lang.String r5 = com.revolut.feature.revolutpay.impl.external.d.b(r10, r12)
            java.lang.String r12 = "Required value was null."
            if (r5 == 0) goto La9
            com.revolut.feature.revolutpay.impl.external.d r3 = r9.f84463b
            if (r3 == 0) goto La5
            java.lang.String r3 = "paymentRequestOrigin"
            java.lang.String r3 = com.revolut.feature.revolutpay.impl.external.d.b(r10, r3)
            if (r3 == 0) goto L9f
            com.revolut.feature.revolutpay.impl.external.d r4 = r9.f84463b
            if (r4 == 0) goto L9b
            java.lang.String r4 = "topLevelOrigin"
            java.lang.String r4 = com.revolut.feature.revolutpay.impl.external.d.b(r10, r4)
            if (r4 == 0) goto L95
            com.revolut.feature.revolutpay.impl.external.d r6 = r9.f84463b
            if (r6 == 0) goto L91
            java.lang.String r1 = "methodName"
            java.lang.String r10 = com.revolut.feature.revolutpay.impl.external.d.b(r10, r1)
            if (r10 == 0) goto L8b
            q7c.x r1 = r9.f84462a
            if (r1 == 0) goto L85
            r7.f319957w = r8
            r2 = r10
            r6 = r11
            java.lang.Enum r12 = r1.e(r2, r3, r4, r5, r6, r7)
            if (r12 != r0) goto L7a
            return r0
        L7a:
            x7c.a r9 = x7c.a.VERIFIED
            if (r12 != r9) goto L7f
            goto L80
        L7f:
            r8 = 0
        L80:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r8)
            return r9
        L85:
            java.lang.String r9 = "verificationInteractor"
            kotlin.jvm.internal.Intrinsics.r(r9)
            throw r2
        L8b:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r12)
            throw r9
        L91:
            kotlin.jvm.internal.Intrinsics.r(r1)
            throw r2
        L95:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r12)
            throw r9
        L9b:
            kotlin.jvm.internal.Intrinsics.r(r1)
            throw r2
        L9f:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r12)
            throw r9
        La5:
            kotlin.jvm.internal.Intrinsics.r(r1)
            throw r2
        La9:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r12)
            throw r9
        Laf:
            kotlin.jvm.internal.Intrinsics.r(r1)
            throw r2
        Lb3:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Verification will not be valid without checking parameters"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.revolutpay.impl.external.service.IsReadyToPayService.c(com.revolut.feature.revolutpay.impl.external.service.IsReadyToPayService, android.os.Bundle, java.util.Set, gim.c):java.lang.Object");
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.d;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        phm.a aVar = (phm.a) ue0.e.j(this).a().get(r.class);
        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
        if (aVar2 == null) {
            throw new IllegalStateException(a0.d.q("Api ", r.class, " is not found"));
        }
        Object objB = aVar2.b();
        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.feature.revolutpay.impl.external.service.IsReadyToPayServiceInjector");
        r rVar = (r) objB;
        this.f84462a = rVar.g();
        this.f84463b = new d(rVar.i, (kg.o) rVar.F.get());
    }

    @Override // android.app.Service
    public final void onDestroy() {
        e0.k(this.f84464c, null);
        super.onDestroy();
    }
}
