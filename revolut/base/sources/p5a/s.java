package p5a;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class s {

    @NotNull
    public static final n Companion = new n();
    public static final List d = v.k(d3a.a.REVOLUT, d3a.a.REVTAG, d3a.a.ACCOUNTS, d3a.a.CARDS, d3a.a.VIRTUAL_CONTACTS, d3a.a.DEVICE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h30.q f233091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d3a.b f233092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vq8.a f233093c;

    public s(h30.q transferScreenProvider, d3a.b paymentsSearchInteractor, vq8.a juniorIncludingModeProvider) {
        Intrinsics.checkNotNullParameter(transferScreenProvider, "transferScreenProvider");
        Intrinsics.checkNotNullParameter(paymentsSearchInteractor, "paymentsSearchInteractor");
        Intrinsics.checkNotNullParameter(juniorIncludingModeProvider, "juniorIncludingModeProvider");
        this.f233091a = transferScreenProvider;
        this.f233092b = paymentsSearchInteractor;
        this.f233093c = juniorIncludingModeProvider;
    }

    public static gz9.g e(jq9.k kVar) {
        if (kVar instanceof jq9.m) {
            f5j.a aVar = ((jq9.m) kVar).f177508b;
            return new gz9.d(aVar, new gz9.b(kVar), n61.j.d(aVar));
        }
        if (kVar instanceof jq9.n) {
            jq9.n nVar = (jq9.n) kVar;
            return new gz9.e(nVar.f177510b, new gz9.b(kVar), nVar.a());
        }
        if (kVar instanceof jq9.p) {
            zm3.a aVar2 = ((jq9.p) kVar).f177514b;
            return new gz9.f(aVar2, new gz9.b(kVar), hx7.q.v(aVar2));
        }
        if ((kVar instanceof jq9.o) || (kVar instanceof jq9.r) || (kVar instanceof jq9.l) || (kVar instanceof jq9.q) || (kVar instanceof jq9.s)) {
            throw new IllegalStateException("Should have been filtered out on getSupportedRecentRecipients level");
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof p5a.o
            if (r0 == 0) goto L13
            r0 = r7
            p5a.o r0 = (p5a.o) r0
            int r1 = r0.f233085x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f233085x = r1
            goto L18
        L13:
            p5a.o r0 = new p5a.o
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f233085x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r6 = r0.u
            yhm.o.b(r7)
            goto L3f
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            yhm.o.b(r7)
            r0.u = r6
            r0.f233085x = r3
            java.lang.Object r7 = r5.c(r0)
            if (r7 != r1) goto L3f
            return r1
        L3f:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L45:
            boolean r0 = r7.hasNext()
            r1 = 0
            if (r0 == 0) goto L7c
            java.lang.Object r0 = r7.next()
            r2 = r0
            jq9.t r2 = (jq9.t) r2
            java.lang.String r4 = r2.a()
            boolean r4 = kotlin.text.d0.J(r4, r6, r3)
            if (r4 != 0) goto L7b
            boolean r4 = r2 instanceof jq9.y
            if (r4 == 0) goto L45
            jq9.y r2 = (jq9.y) r2
            zm3.a r2 = r2.f177526a
            boolean r4 = r2 instanceof zm3.l
            if (r4 == 0) goto L6c
            zm3.l r2 = (zm3.l) r2
            goto L6d
        L6c:
            r2 = r1
        L6d:
            if (r2 == 0) goto L73
            java.lang.String r1 = r2.getCode()
        L73:
            if (r1 == 0) goto L45
            boolean r1 = kotlin.text.d0.J(r1, r6, r3)
            if (r1 != r3) goto L45
        L7b:
            return r0
        L7c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p5a.s.a(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r10, gim.c r11) {
        /*
            Method dump skipped, instruction units count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p5a.s.b(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof p5a.q
            if (r0 == 0) goto L13
            r0 = r7
            p5a.q r0 = (p5a.q) r0
            int r1 = r0.f233089w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f233089w = r1
            goto L18
        L13:
            p5a.q r0 = new p5a.q
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f233089w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)     // Catch: java.lang.Throwable -> L28
            goto L65
        L28:
            r7 = move-exception
            goto L6a
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L32:
            yhm.o.b(r7)
            yhm.m$a r7 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L28
            d3a.b r7 = r6.f233092b     // Catch: java.lang.Throwable -> L28
            java.util.List r2 = p5a.s.d     // Catch: java.lang.Throwable -> L28
            vq8.a r5 = r6.f233093c     // Catch: java.lang.Throwable -> L28
            jq9.a r5 = r5.a()     // Catch: java.lang.Throwable -> L28
            u3a.n r7 = (u3a.n) r7     // Catch: java.lang.Throwable -> L28
            efm.r r7 = r7.d(r4, r2, r5)     // Catch: java.lang.Throwable -> L28
            p5a.m r2 = new p5a.m     // Catch: java.lang.Throwable -> L28
            r5 = 0
            r2.<init>(r6, r5)     // Catch: java.lang.Throwable -> L28
            efm.r r7 = nim.a.w(r7, r2)     // Catch: java.lang.Throwable -> L28
            p4a.g r2 = new p4a.g     // Catch: java.lang.Throwable -> L28
            r5 = 8
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L28
            efm.r r7 = m70.a.g(r7, r4, r2, r3)     // Catch: java.lang.Throwable -> L28
            r0.f233089w = r3     // Catch: java.lang.Throwable -> L28
            java.lang.Object r7 = nim.a.e(r7, r0)     // Catch: java.lang.Throwable -> L28
            if (r7 != r1) goto L65
            return r1
        L65:
            java.util.List r7 = (java.util.List) r7     // Catch: java.lang.Throwable -> L28
            yhm.m$a r0 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L28
            goto L70
        L6a:
            yhm.m$a r0 = yhm.m.INSTANCE
            yhm.n r7 = yhm.o.a(r7)
        L70:
            boolean r0 = r7 instanceof yhm.n
            if (r0 == 0) goto L75
            goto L76
        L75:
            r4 = r7
        L76:
            java.util.List r4 = (java.util.List) r4
            if (r4 != 0) goto L7c
            zhm.f0 r4 = zhm.f0.f322471a
        L7c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p5a.s.c(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable d(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof p5a.r
            if (r0 == 0) goto L13
            r0 = r5
            p5a.r r0 = (p5a.r) r0
            int r1 = r0.f233090w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f233090w = r1
            goto L18
        L13:
            p5a.r r0 = new p5a.r
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f233090w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L49
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            h30.q r5 = r4.f233091a
            efm.r r5 = r5.J0(r3)
            efm.r r5 = zi0.c.J(r5)
            vkm.d r5 = rd0.e.b(r5)
            r0.f233090w = r3
            java.lang.Object r5 = vkm.q.z(r5, r0)
            if (r5 != r1) goto L49
            return r1
        L49:
            com.revolut.data.model.Data r5 = (com.revolut.data.model.Data) r5
            if (r5 == 0) goto Lbd
            java.lang.Object r5 = r5.getContent()
            java.util.List r5 = (java.util.List) r5
            if (r5 == 0) goto Lbd
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L60:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto Lbc
            java.lang.Object r1 = r5.next()
            r2 = r1
            jq9.k r2 = (jq9.k) r2
            boolean r3 = r2 instanceof jq9.p
            if (r3 == 0) goto L94
            jq9.p r2 = (jq9.p) r2
            zm3.a r2 = r2.f177514b
            boolean r3 = r2 instanceof zm3.l
            if (r3 == 0) goto L7a
            goto Lb8
        L7a:
            boolean r3 = r2 instanceof zm3.e
            if (r3 == 0) goto L7f
            goto L60
        L7f:
            boolean r3 = r2 instanceof zm3.n
            if (r3 == 0) goto L84
            goto L60
        L84:
            boolean r3 = r2 instanceof zm3.f
            if (r3 == 0) goto L89
            goto Lb8
        L89:
            boolean r2 = r2 instanceof zm3.o
            if (r2 == 0) goto L8e
            goto Lb8
        L8e:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L94:
            boolean r3 = r2 instanceof jq9.m
            if (r3 != 0) goto Lb8
            boolean r3 = r2 instanceof jq9.n
            if (r3 == 0) goto L9d
            goto Lb8
        L9d:
            boolean r1 = r2 instanceof jq9.r
            if (r1 != 0) goto L60
            boolean r1 = r2 instanceof jq9.s
            if (r1 != 0) goto L60
            boolean r1 = r2 instanceof jq9.o
            if (r1 != 0) goto L60
            boolean r1 = r2 instanceof jq9.l
            if (r1 != 0) goto L60
            boolean r1 = r2 instanceof jq9.q
            if (r1 == 0) goto Lb2
            goto L60
        Lb2:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        Lb8:
            r0.add(r1)
            goto L60
        Lbc:
            return r0
        Lbd:
            zhm.f0 r5 = zhm.f0.f322471a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p5a.s.d(gim.c):java.io.Serializable");
    }
}
