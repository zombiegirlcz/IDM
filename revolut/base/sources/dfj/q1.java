package dfj;

import com.revolut.data.model.Data;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortOutCredentials;
import com.revolut.retail.feature.esim.impl.interactors.EsimPortingAuthorizationFailedException;
import java.time.Clock;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class q1 {

    @NotNull
    public static final j1 Companion = new j1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nfj.j0 f114074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nfj.a2 f114075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clock f114076c;

    public q1(nfj.j0 esimPhoneNumberPortingRepository, nfj.a2 subscriptionsRepository, Clock clock) {
        Intrinsics.checkNotNullParameter(esimPhoneNumberPortingRepository, "esimPhoneNumberPortingRepository");
        Intrinsics.checkNotNullParameter(subscriptionsRepository, "subscriptionsRepository");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.f114074a = esimPhoneNumberPortingRepository;
        this.f114075b = subscriptionsRepository;
        this.f114076c = clock;
    }

    public static final boolean a(q1 q1Var, EsimPhoneNumberPortOutCredentials esimPhoneNumberPortOutCredentials, Set set) {
        q1Var.getClass();
        if (esimPhoneNumberPortOutCredentials == null) {
            return false;
        }
        Set set2 = set;
        if (!(set2 instanceof Collection) || !set2.isEmpty()) {
            Iterator it8 = set2.iterator();
            while (it8.hasNext()) {
                int i = k1.f114016a[((pfj.c) it8.next()).ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (esimPhoneNumberPortOutCredentials.f100330b == null) {
                        return false;
                    }
                } else if (esimPhoneNumberPortOutCredentials.f100329a == null) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(dfj.q1 r13, java.lang.String r14, java.lang.String r15, long r16, long r18, int r20, gim.c r21) {
        /*
            r0 = r21
            r13.getClass()
            boolean r1 = r0 instanceof dfj.m1
            if (r1 == 0) goto L18
            r1 = r0
            dfj.m1 r1 = (dfj.m1) r1
            int r2 = r1.f114040x
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L18
            int r2 = r2 - r3
            r1.f114040x = r2
            goto L1d
        L18:
            dfj.m1 r1 = new dfj.m1
            r1.<init>(r13, r0)
        L1d:
            java.lang.Object r0 = r1.v
            fim.a r11 = fim.a.COROUTINE_SUSPENDED
            int r2 = r1.f114040x
            r12 = 1
            if (r2 == 0) goto L36
            if (r2 != r12) goto L2e
            kotlin.jvm.internal.Ref$ObjectRef r1 = r1.u
            yhm.o.b(r0)
            goto L55
        L2e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L36:
            kotlin.jvm.internal.Ref$ObjectRef r5 = p.a.w(r0)
            dfj.o1 r2 = new dfj.o1
            r10 = 0
            r7 = r13
            r8 = r14
            r9 = r15
            r3 = r16
            r6 = r20
            r2.<init>(r3, r5, r6, r7, r8, r9, r10)
            r1.u = r5
            r1.f114040x = r12
            r3 = r18
            java.lang.Object r0 = skm.h2.e(r3, r2, r1)
            if (r0 != r11) goto L54
            return r11
        L54:
            r1 = r5
        L55:
            pfj.i r0 = (pfj.i) r0
            if (r0 != 0) goto L5d
            java.lang.Object r0 = r1.f186409a
            pfj.i r0 = (pfj.i) r0
        L5d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: dfj.q1.b(dfj.q1, java.lang.String, java.lang.String, long, long, int, gim.c):java.lang.Object");
    }

    public static final Data c(q1 q1Var, pfj.i iVar) {
        q1Var.getClass();
        return iVar == null ? new Data(null, new IllegalStateException("Porting authorization polling timed out"), false, 5, null) : iVar.f235615a.f235605b == pfj.j.FAILED ? new Data(null, new EsimPortingAuthorizationFailedException(iVar), false, 5, null) : new Data(iVar, null, false, 6, null);
    }

    public static final g2 d(q1 q1Var, pfj.i iVar, int i) {
        q1Var.getClass();
        if (iVar == null) {
            return new h2(null);
        }
        pfj.d dVar = iVar.f235615a;
        pfj.j jVar = dVar.f235605b;
        return jVar == pfj.j.COMPLETED ? new c2(iVar) : jVar == pfj.j.FAILED ? new e2(iVar) : (jVar != pfj.j.AWAITING_INPUT || dVar.e <= i) ? new h2(iVar) : new f2(iVar);
    }
}
