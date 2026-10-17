package l89;

import efm.d0;
import kotlin.jvm.internal.Intrinsics;
import l0c.s;
import ufm.i;

/* JADX INFO: loaded from: classes5.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f192813a = new e();

    private e() {
    }

    public static i b(d0 d0Var) {
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        i iVar = new i(d0Var, new l5i.b(13, new s(d0Var, 22)), 2);
        Intrinsics.checkNotNullExpressionValue(iVar, "onErrorResumeNext(...)");
        return iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0063 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.jvm.functions.Function1 r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof l89.d
            if (r0 == 0) goto L13
            r0 = r7
            l89.d r0 = (l89.d) r0
            int r1 = r0.f192812x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f192812x = r1
            goto L18
        L13:
            l89.d r0 = new l89.d
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f192812x
            r3 = 3
            r4 = 1
            if (r2 == 0) goto L49
            if (r2 == r4) goto L41
            r6 = 2
            if (r2 == r6) goto L39
            if (r2 != r3) goto L31
            kotlin.jvm.functions.Function1 r6 = r0.u
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            yhm.o.b(r7)
            return r7
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            kotlin.jvm.functions.Function1 r6 = r0.u
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            yhm.o.b(r7)
            goto L58
        L41:
            kotlin.jvm.functions.Function1 r6 = r0.u
            kotlin.jvm.functions.Function1 r6 = (kotlin.jvm.functions.Function1) r6
            yhm.o.b(r7)     // Catch: com.revolut.feature.onboarding.api.exchange_global_access.ExchangeActivationSuccessException -> L58
            return r7
        L49:
            yhm.o.b(r7)
            r0.u = r6     // Catch: com.revolut.feature.onboarding.api.exchange_global_access.ExchangeActivationSuccessException -> L58
            r0.f192812x = r4     // Catch: com.revolut.feature.onboarding.api.exchange_global_access.ExchangeActivationSuccessException -> L58
            java.lang.Object r6 = r6.invoke(r0)     // Catch: com.revolut.feature.onboarding.api.exchange_global_access.ExchangeActivationSuccessException -> L58
            if (r6 != r1) goto L57
            goto L63
        L57:
            return r6
        L58:
            r7 = 0
            r0.u = r7
            r0.f192812x = r3
            java.lang.Object r6 = r6.invoke(r0)
            if (r6 != r1) goto L64
        L63:
            return r1
        L64:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: l89.e.a(kotlin.jvm.functions.Function1, gim.c):java.lang.Object");
    }
}
