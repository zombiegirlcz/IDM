package h4g;

import b4g.u;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f149360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qd0.b f149361b;

    public e(u repository, qd0.b languageProvider) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        this.f149360a = repository;
        this.f149361b = languageProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r6, gim.c r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof h4g.c
            if (r0 == 0) goto L13
            r0 = r7
            h4g.c r0 = (h4g.c) r0
            int r1 = r0.f149356w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f149356w = r1
            goto L18
        L13:
            h4g.c r0 = new h4g.c
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f149356w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L5f
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            r0.f149356w = r3
            b4g.u r7 = r5.f149360a
            r7.getClass()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "flight_document_"
            r2.<init>(r3)
            r2.append(r6)
            java.lang.String r6 = ".pdf"
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            a26.q r2 = new a26.q
            r3 = 0
            r4 = 16
            r2.<init>(r7, r6, r3, r4)
            skm.p0 r6 = skm.p0.f264001a
            elm.f r6 = elm.f.f127540b
            java.lang.Object r7 = skm.e0.J(r6, r2, r0)
            if (r7 != r1) goto L5f
            return r1
        L5f:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r6 = r7.booleanValue()
            n7g.b r7 = new n7g.b
            r7.<init>(r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: h4g.e.a(java.lang.String, gim.c):java.lang.Object");
    }
}
