package b45;

import com.revolut.core.model.account.AccountId;
import g48.r0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import vkm.q;
import zjh.j;

/* JADX INFO: loaded from: classes21.dex */
public final class h {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f12178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o71.a f12179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ang.f f12180c;
    public final kbb.c d;
    public final wsg.b e;
    public final r0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i90.b f12181g;

    public h(j repository, o71.a beneficiaryRepository, ang.f userInteractor, kbb.c accountDetailsInteractor, wsg.b newWalletsInteractor, r0 jointAccountsInteractor, i90.b uuidUtils) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(beneficiaryRepository, "beneficiaryRepository");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(accountDetailsInteractor, "accountDetailsInteractor");
        Intrinsics.checkNotNullParameter(newWalletsInteractor, "newWalletsInteractor");
        Intrinsics.checkNotNullParameter(jointAccountsInteractor, "jointAccountsInteractor");
        Intrinsics.checkNotNullParameter(uuidUtils, "uuidUtils");
        this.f12178a = repository;
        this.f12179b = beneficiaryRepository;
        this.f12180c = userInteractor;
        this.d = accountDetailsInteractor;
        this.e = newWalletsInteractor;
        this.f = jointAccountsInteractor;
        this.f12181g = uuidUtils;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0072, code lost:
    
        if (r8 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable a(gim.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof b45.b
            if (r0 == 0) goto L13
            r0 = r8
            b45.b r0 = (b45.b) r0
            int r1 = r0.f12165w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12165w = r1
            goto L18
        L13:
            b45.b r0 = new b45.b
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f12165w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r8)
            goto L75
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L32:
            yhm.o.b(r8)
            goto L44
        L36:
            yhm.o.b(r8)
            r0.f12165w = r4
            com.revolut.core.model.account.AccountId$Personal r8 = com.revolut.core.model.account.AccountId.Personal.f51414a
            java.lang.Object r8 = r7.g(r8, r0)
            if (r8 != r1) goto L44
            goto L74
        L44:
            kotlin.Pair r8 = (kotlin.Pair) r8
            java.lang.Object r2 = r8.f186385a
            fo3.c r2 = (fo3.c) r2
            java.lang.Object r8 = r8.f186386b
            java.util.List r8 = (java.util.List) r8
            xi0.b r4 = r2.d
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
        L56:
            boolean r5 = r8.hasNext()
            if (r5 == 0) goto L82
            java.lang.Object r5 = r8.next()
            io3.d r5 = (io3.d) r5
            xi0.b r6 = z92.f.l(r5)
            boolean r6 = r6.equals(r4)
            if (r6 == 0) goto L56
            r0.f12165w = r3
            java.io.Serializable r8 = r7.e(r5, r2, r0)
            if (r8 != r1) goto L75
        L74:
            return r1
        L75:
            x35.d r8 = (x35.d) r8
            if (r8 == 0) goto L7a
            return r8
        L7a:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Required value was null."
            r8.<init>(r0)
            throw r8
        L82:
            java.util.NoSuchElementException r8 = new java.util.NoSuchElementException
            java.lang.String r0 = "Collection contains no element matching the predicate."
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: b45.h.a(gim.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable b(x35.h r10, gim.c r11) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b45.h.b(x35.h, gim.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(fo3.c r8, gim.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof b45.d
            if (r0 == 0) goto L13
            r0 = r9
            b45.d r0 = (b45.d) r0
            int r1 = r0.f12169w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12169w = r1
            goto L18
        L13:
            b45.d r0 = new b45.d
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f12169w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r9)
            goto L49
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2f:
            yhm.o.b(r9)
            g48.r0 r9 = r7.f
            java.lang.String r8 = r8.f136805h
            et6.u1 r8 = r9.f(r8)
            r9 = 3
            r2 = 0
            jhi.b r8 = mo3.a.g(r8, r2, r2, r9)
            r0.f12169w = r3
            java.lang.Object r9 = vkm.q.x(r8, r0)
            if (r9 != r1) goto L49
            return r1
        L49:
            n38.a r9 = (n38.a) r9
            java.util.ArrayList r0 = r9.d
            b0a.j r5 = new b0a.j
            r8 = 11
            r5.<init>(r8)
            r6 = 30
            java.lang.String r1 = " & "
            r2 = 0
            r3 = 0
            r4 = 0
            java.lang.String r8 = zhm.d0.k0(r0, r1, r2, r3, r4, r5, r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: b45.h.c(fo3.c, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x007c, code lost:
    
        if (r8 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable d(com.revolut.core.model.account.AccountId r7, gim.c r8, xi0.b r9) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof b45.e
            if (r0 == 0) goto L13
            r0 = r8
            b45.e r0 = (b45.e) r0
            int r1 = r0.f12171x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12171x = r1
            goto L18
        L13:
            b45.e r0 = new b45.e
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f12171x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r8)
            goto L7f
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            xi0.b r9 = r0.u
            yhm.o.b(r8)
            goto L46
        L38:
            yhm.o.b(r8)
            r0.u = r9
            r0.f12171x = r4
            java.lang.Object r8 = r6.g(r7, r0)
            if (r8 != r1) goto L46
            goto L7e
        L46:
            kotlin.Pair r8 = (kotlin.Pair) r8
            java.lang.Object r7 = r8.f186385a
            fo3.c r7 = (fo3.c) r7
            java.lang.Object r8 = r8.f186386b
            java.util.List r8 = (java.util.List) r8
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
        L56:
            boolean r2 = r8.hasNext()
            r4 = 0
            if (r2 == 0) goto L6f
            java.lang.Object r2 = r8.next()
            r5 = r2
            io3.d r5 = (io3.d) r5
            xi0.b r5 = z92.f.l(r5)
            boolean r5 = r5.equals(r9)
            if (r5 == 0) goto L56
            goto L70
        L6f:
            r2 = r4
        L70:
            io3.d r2 = (io3.d) r2
            if (r2 == 0) goto L82
            r0.u = r4
            r0.f12171x = r3
            java.io.Serializable r8 = r6.e(r2, r7, r0)
            if (r8 != r1) goto L7f
        L7e:
            return r1
        L7f:
            x35.d r8 = (x35.d) r8
            return r8
        L82:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: b45.h.d(com.revolut.core.model.account.AccountId, gim.c, xi0.b):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable e(io3.d r12, fo3.c r13, gim.c r14) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b45.h.e(io3.d, fo3.c, gim.c):java.io.Serializable");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0056, code lost:
    
        if (r10 == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a0, code lost:
    
        if (r10 == r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a2, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00a0 -> B:34:0x00a3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00a6 -> B:36:0x00a7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable f(java.lang.String r9, gim.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof b45.g
            if (r0 == 0) goto L13
            r0 = r10
            b45.g r0 = (b45.g) r0
            int r1 = r0.f12177y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f12177y = r1
            goto L18
        L13:
            b45.g r0 = new b45.g
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f12175w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f12177y
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.util.Iterator r9 = r0.v
            java.lang.String r2 = r0.u
            yhm.o.b(r10)
            goto La3
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            java.lang.String r9 = r0.u
            yhm.o.b(r10)
            goto L59
        L3e:
            yhm.o.b(r10)
            wsg.b r10 = r8.e
            w4l.h r2 = w4l.h.f294642c
            akg.n r10 = r10.b(r2)
            r2 = 3
            jhi.b r10 = mo3.a.g(r10, r5, r5, r2)
            r0.u = r9
            r0.f12177y = r4
            java.lang.Object r10 = vkm.q.x(r10, r0)
            if (r10 != r1) goto L59
            goto La2
        L59:
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
            r2 = r9
            r9 = r10
        L61:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto Laa
            java.lang.Object r10 = r9.next()
            kotlin.Pair r10 = (kotlin.Pair) r10
            java.lang.Object r4 = r10.f186385a
            fo3.c r4 = (fo3.c) r4
            java.lang.Object r10 = r10.f186386b
            java.util.List r10 = (java.util.List) r10
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
        L7b:
            boolean r6 = r10.hasNext()
            if (r6 == 0) goto L91
            java.lang.Object r6 = r10.next()
            r7 = r6
            io3.d r7 = (io3.d) r7
            java.lang.String r7 = r7.f163145a
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r7, r2)
            if (r7 == 0) goto L7b
            goto L92
        L91:
            r6 = r5
        L92:
            io3.d r6 = (io3.d) r6
            if (r6 == 0) goto La6
            r0.u = r2
            r0.v = r9
            r0.f12177y = r3
            java.io.Serializable r10 = r8.e(r6, r4, r0)
            if (r10 != r1) goto La3
        La2:
            return r1
        La3:
            x35.d r10 = (x35.d) r10
            goto La7
        La6:
            r10 = r5
        La7:
            if (r10 == 0) goto L61
            return r10
        Laa:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: b45.h.f(java.lang.String, gim.c):java.io.Serializable");
    }

    public final Object g(AccountId accountId, gim.c cVar) {
        Flow flowE;
        boolean z = accountId instanceof AccountId.Joint;
        w4l.h hVar = w4l.h.f294642c;
        wsg.b bVar = this.e;
        if (z) {
            flowE = bVar.d(((AccountId.Joint) accountId).f51413b, hVar);
        } else {
            if (!(accountId instanceof AccountId.Personal)) {
                throw new NoWhenBranchMatchedException();
            }
            flowE = bVar.e(hVar);
        }
        return q.x(mo3.a.g(flowE, null, null, 3), cVar);
    }
}
