package p0d;

import akg.n;
import k0d.f;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import om4.t3;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTimeConstants;
import te8.y;
import w4l.k;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    @NotNull
    private static final b Companion = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f231507c;
    public static final long d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f231508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f231509b;

    static {
        b.Companion companion = kotlin.time.b.INSTANCE;
        pkm.e eVar = pkm.e.MILLISECONDS;
        f231507c = kotlin.time.c.g(DateTimeConstants.MILLIS_PER_MINUTE, eVar);
        d = kotlin.time.c.g(500, eVar);
    }

    public e(f invitationRepository, y juniorPollingInteractor) {
        Intrinsics.checkNotNullParameter(invitationRepository, "invitationRepository");
        Intrinsics.checkNotNullParameter(juniorPollingInteractor, "juniorPollingInteractor");
        this.f231508a = invitationRepository;
        this.f231509b = juniorPollingInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r8, java.lang.String r9, gim.c r10) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r10 instanceof p0d.c
            if (r0 == 0) goto L13
            r0 = r10
            p0d.c r0 = (p0d.c) r0
            int r1 = r0.f231505x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f231505x = r1
            goto L18
        L13:
            p0d.c r0 = new p0d.c
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f231505x
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L39
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r10)
            return r10
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            java.lang.String r8 = r0.u
            yhm.o.b(r10)
            goto L58
        L39:
            yhm.o.b(r10)
            r0.u = r8
            r0.f231505x = r4
            skm.p0 r10 = skm.p0.f264001a
            elm.f r10 = elm.f.f127540b
            k0d.e r2 = new k0d.e
            r4 = 0
            k0d.f r6 = r7.f231508a
            r2.<init>(r6, r9, r5, r4)
            java.lang.Object r9 = skm.e0.J(r10, r2, r0)
            if (r9 != r1) goto L53
            goto L55
        L53:
            kotlin.Unit r9 = kotlin.Unit.f186387a
        L55:
            if (r9 != r1) goto L58
            goto L62
        L58:
            r0.u = r5
            r0.f231505x = r3
            java.lang.Object r8 = r7.b(r8, r0)
            if (r8 != r1) goto L63
        L62:
            return r1
        L63:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p0d.e.a(java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r9, gim.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof p0d.d
            if (r0 == 0) goto L14
            r0 = r10
            p0d.d r0 = (p0d.d) r0
            int r1 = r0.f231506w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f231506w = r1
        L12:
            r5 = r0
            goto L1a
        L14:
            p0d.d r0 = new p0d.d
            r0.<init>(r8, r10)
            goto L12
        L1a:
            java.lang.Object r10 = r5.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r5.f231506w
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            yhm.o.b(r10)
            goto L53
        L29:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L31:
            yhm.o.b(r10)
            r10 = r2
            pe8.e r2 = new pe8.e
            long r3 = p0d.e.f231507c
            long r6 = p0d.e.d
            r2.<init>(r3, r6)
            ol8.e r3 = new ol8.e
            r1 = 11
            r4 = 0
            r3.<init>(r8, r9, r4, r1)
            r5.f231506w = r10
            te8.y r1 = r8.f231509b
            r6 = 12
            java.lang.Object r10 = te8.y.c(r1, r2, r3, r4, r5, r6)
            if (r10 != r0) goto L53
            return r0
        L53:
            pe8.j r10 = (pe8.j) r10
            boolean r9 = r10 instanceof pe8.i
            if (r9 == 0) goto L60
            pe8.i r10 = (pe8.i) r10
            java.lang.Object r9 = r10.f235343a
            java.lang.String r9 = (java.lang.String) r9
            return r9
        L60:
            boolean r9 = r10 instanceof pe8.h
            if (r9 == 0) goto L72
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            pe8.h r10 = (pe8.h) r10
            java.lang.Exception r10 = r10.getException()
            java.lang.String r0 = "Workflow id is null"
            r9.<init>(r0, r10)
            throw r9
        L72:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p0d.e.b(java.lang.String, gim.c):java.lang.Object");
    }

    public final n c(String teenUserId, k loadingStrategy) {
        Intrinsics.checkNotNullParameter(teenUserId, "teenUserId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(teenUserId, "teenUserId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(this.f231508a.d.b(teenUserId, loadingStrategy), new t3(teenUserId, 15));
    }
}
