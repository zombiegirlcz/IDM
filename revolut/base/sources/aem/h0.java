package aem;

import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes23.dex */
public abstract class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f3728a = a1m.e.a("io.ktor.client.plugins.HttpCallValidator");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final bem.c f3729b = a1m.e.m("HttpResponseValidator", z.f, new d(4));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final oem.a f3730c;

    static {
        KType kTypeB;
        KClass kClassB = kotlin.jvm.internal.o0.f186429a.b(Boolean.class);
        try {
            kTypeB = kotlin.jvm.internal.o0.b(Boolean.TYPE);
        } catch (Throwable unused) {
            kTypeB = null;
        }
        f3730c = new oem.a("ExpectSuccessAttributeKey", new tem.a(kClassB, kTypeB));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kotlin.Unit a(java.util.List r4, java.lang.Throwable r5, fem.b r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof aem.e0
            if (r0 == 0) goto L13
            r0 = r7
            aem.e0 r0 = (aem.e0) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            aem.e0 r0 = new aem.e0
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r0 = r0.v
            if (r0 == 0) goto L34
            r4 = 1
            if (r0 == r4) goto L26
            r4 = 2
            if (r0 != r4) goto L2a
        L26:
            yhm.o.b(r7)
            goto L32
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            r4 = 0
            goto L5c
        L34:
            yhm.o.b(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "Processing exception "
            r7.<init>(r0)
            r7.append(r5)
            java.lang.String r5 = " for request "
            r7.append(r5)
            kem.q0 r5 = r6.getUrl()
            r7.append(r5)
            java.lang.String r5 = r7.toString()
            org.slf4j.Logger r6 = aem.h0.f3728a
            r6.trace(r5)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L5c:
            boolean r5 = r4.hasNext()
            if (r5 != 0) goto L65
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        L65:
            java.lang.Object r4 = r4.next()
            if (r4 != 0) goto L71
            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
            r4.<init>()
            throw r4
        L71:
            java.lang.ClassCastException r4 = new java.lang.ClassCastException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: aem.h0.a(java.util.List, java.lang.Throwable, fem.b, gim.c):kotlin.Unit");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(java.util.List r5, hem.c r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof aem.f0
            if (r0 == 0) goto L13
            r0 = r7
            aem.f0 r0 = (aem.f0) r0
            int r1 = r0.f3716y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3716y = r1
            goto L18
        L13:
            aem.f0 r0 = new aem.f0
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f3715x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f3716y
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            int r5 = r0.f3714w
            java.util.Iterator r6 = r0.v
            java.lang.Object r2 = r0.u
            hem.c r2 = (hem.c) r2
            yhm.o.b(r7)
            r7 = r2
            goto L65
        L30:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L38:
            yhm.o.b(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r2 = "Validating response for request "
            r7.<init>(r2)
            wdm.f r2 = r6.a()
            fem.b r2 = r2.c()
            kem.q0 r2 = r2.getUrl()
            r7.append(r2)
            java.lang.String r7 = r7.toString()
            org.slf4j.Logger r2 = aem.h0.f3728a
            r2.trace(r7)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
            r7 = 0
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
        L65:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L80
            java.lang.Object r2 = r6.next()
            kotlin.jvm.functions.Function2 r2 = (kotlin.jvm.functions.Function2) r2
            r0.u = r7
            r0.v = r6
            r0.f3714w = r5
            r0.f3716y = r3
            java.lang.Object r2 = r2.invoke(r7, r0)
            if (r2 != r1) goto L65
            return r1
        L80:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: aem.h0.b(java.util.List, hem.c, gim.c):java.lang.Object");
    }
}
