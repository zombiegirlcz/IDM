package rv1;

import com.revolut.feature.apm.core.models.alias.AliasType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class r implements zu1.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vw1.b f257672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fv1.e f257673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wj0.a f257674c;

    public r(vw1.b aliasRepository, fv1.e brebRepository, wj0.a idempotencyKeyHolder) {
        Intrinsics.checkNotNullParameter(aliasRepository, "aliasRepository");
        Intrinsics.checkNotNullParameter(brebRepository, "brebRepository");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        this.f257672a = aliasRepository;
        this.f257673b = brebRepository;
        this.f257674c = idempotencyKeyHolder;
    }

    public static int d(AliasType aliasType) {
        if (Intrinsics.f(aliasType, AliasType.ALPHANUMERIC.f61892b)) {
            return 1;
        }
        if (Intrinsics.f(aliasType, AliasType.TAX_NUMBER.f61897b) || Intrinsics.f(aliasType, AliasType.DOCUMENT_ID.f61893b)) {
            return 2;
        }
        if (Intrinsics.f(aliasType, AliasType.PHONE.f61895b)) {
            return 3;
        }
        if (Intrinsics.f(aliasType, AliasType.EMAIL.f61894b) || Intrinsics.f(aliasType, AliasType.REVTAG_EMAIL.f61896b)) {
            return 4;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.feature.apm.core.models.alias.Alias r8, java.lang.String r9, gim.c r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof rv1.c
            if (r0 == 0) goto L13
            r0 = r10
            rv1.c r0 = (rv1.c) r0
            int r1 = r0.f257644y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f257644y = r1
            goto L18
        L13:
            rv1.c r0 = new rv1.c
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f257642w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f257644y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r10)
            return r10
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L32:
            rv1.r r8 = r0.v
            com.revolut.feature.apm.core.models.alias.Alias r9 = r0.u
            yhm.o.b(r10)
            goto L63
        L3a:
            yhm.o.b(r10)
            java.lang.String r10 = "IDEMPOTENCY_TAG_REGISTER_ALIAS"
            wj0.a r2 = r7.f257674c
            r2.a(r10)
            zz1.i r10 = new zz1.i
            com.revolut.feature.apm.core.models.alias.RegisterAlias$Alias r2 = new com.revolut.feature.apm.core.models.alias.RegisterAlias$Alias
            com.revolut.feature.apm.core.models.alias.AliasType r5 = r8.f61878a
            java.lang.String r6 = r8.f61879b
            r2.<init>(r5, r6)
            r10.<init>(r2, r9)
            r0.u = r8
            r0.v = r7
            r0.f257644y = r4
            vw1.b r9 = r7.f257672a
            java.lang.Object r10 = vw1.b.a(r9, r10, r0)
            if (r10 != r1) goto L61
            goto L78
        L61:
            r9 = r8
            r8 = r7
        L63:
            zz1.f r10 = (zz1.f) r10
            rv1.d r2 = new rv1.d
            r4 = 0
            r5 = 0
            r2.<init>(r7, r9, r5, r4)
            r0.u = r5
            r0.v = r5
            r0.f257644y = r3
            java.lang.Object r8 = r8.g(r10, r2, r0)
            if (r8 != r1) goto L79
        L78:
            return r1
        L79:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: rv1.r.a(com.revolut.feature.apm.core.models.alias.Alias, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.revolut.feature.apm.core.models.alias.Alias r6, com.revolut.feature.apm.core.models.alias.Alias r7, java.lang.String r8, gim.c r9) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r9 instanceof rv1.e
            if (r0 == 0) goto L13
            r0 = r9
            rv1.e r0 = (rv1.e) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            rv1.e r0 = new rv1.e
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.f257648x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r9)
            return r9
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.String r8 = r0.f257647w
            com.revolut.feature.apm.core.models.alias.Alias r7 = r0.v
            com.revolut.feature.apm.core.models.alias.Alias r6 = r0.u
            yhm.o.b(r9)
            goto L4e
        L3c:
            yhm.o.b(r9)
            r0.u = r6
            r0.v = r7
            r0.f257647w = r8
            r0.z = r4
            java.lang.Object r9 = r5.a(r7, r8, r0)
            if (r9 != r1) goto L4e
            goto L63
        L4e:
            zz1.e r9 = (zz1.e) r9
            zz1.e r2 = zz1.e.FAILED
            if (r9 == r2) goto L65
            r9 = 0
            r0.u = r9
            r0.v = r9
            r0.f257647w = r9
            r0.z = r3
            java.lang.Object r6 = r5.l(r6, r7, r8, r0)
            if (r6 != r1) goto L64
        L63:
            return r1
        L64:
            return r6
        L65:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: rv1.r.b(com.revolut.feature.apm.core.models.alias.Alias, com.revolut.feature.apm.core.models.alias.Alias, java.lang.String, gim.c):java.lang.Object");
    }

    public final t38.e c() {
        return new t38.e(vw1.b.c(this.f257672a), 24, new exe.j(new a44.c(ue0.e.R(this.f257673b.f138309a, "BREB_MAIN_ALIAS_KEY", wim.z.d(o0.b(iv1.a.class))), 2), 4), new pfk.q(this, null, 24));
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
    
        if (r10 != r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x006b -> B:27:0x006e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Enum e(zz1.f r9, gim.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof rv1.f
            if (r0 == 0) goto L13
            r0 = r10
            rv1.f r0 = (rv1.f) r0
            int r1 = r0.f257652y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f257652y = r1
            goto L18
        L13:
            rv1.f r0 = new rv1.f
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f257650w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f257652y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            int r9 = r0.v
            java.lang.String r2 = r0.u
            yhm.o.b(r10)
            goto L6e
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L36:
            int r9 = r0.v
            java.lang.String r2 = r0.u
            yhm.o.b(r10)
            goto L5d
        L3e:
            yhm.o.b(r10)
            java.lang.String r10 = r9.f326483a
            zz1.e r9 = r9.f326484b
            r2 = 5
        L46:
            zz1.e r5 = zz1.e.COMPLETED
            if (r9 == r5) goto L79
            if (r2 <= 0) goto L79
            r0.u = r10
            r0.v = r2
            r0.f257652y = r4
            r5 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r9 = skm.k0.b(r5, r0)
            if (r9 != r1) goto L5b
            goto L6d
        L5b:
            r9 = r2
            r2 = r10
        L5d:
            r0.u = r2
            r0.v = r9
            r0.f257652y = r3
            vw1.b r10 = r8.f257672a
            uy1.j r10 = (uy1.j) r10
            java.lang.Object r10 = r10.h(r2, r0)
            if (r10 != r1) goto L6e
        L6d:
            return r1
        L6e:
            zz1.f r10 = (zz1.f) r10
            zz1.e r10 = r10.f326484b
            int r9 = r9 + (-1)
            r7 = r2
            r2 = r9
            r9 = r10
            r10 = r7
            goto L46
        L79:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: rv1.r.e(zz1.f, gim.c):java.lang.Enum");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(com.revolut.feature.apm.core.models.alias.Alias r8, gim.c r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof rv1.g
            if (r0 == 0) goto L13
            r0 = r9
            rv1.g r0 = (rv1.g) r0
            int r1 = r0.f257654x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f257654x = r1
            goto L18
        L13:
            rv1.g r0 = new rv1.g
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f257654x
            r3 = 0
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L3a
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            yhm.o.b(r9)
            return r9
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            rv1.r r8 = r0.u
            yhm.o.b(r9)
            goto L60
        L3a:
            yhm.o.b(r9)
            java.lang.String r9 = "IDEMPOTENCY_TAG_FREEZE_ALIAS"
            wj0.a r2 = r7.f257674c
            r2.a(r9)
            r0.u = r7
            r0.f257654x = r5
            vw1.b r9 = r7.f257672a
            uy1.j r9 = (uy1.j) r9
            r9.getClass()
            uy1.h r2 = new uy1.h
            r2.<init>(r9, r8, r6, r3)
            skm.p0 r8 = skm.p0.f264001a
            elm.f r8 = elm.f.f127540b
            java.lang.Object r9 = skm.e0.J(r8, r2, r0)
            if (r9 != r1) goto L5f
            goto L71
        L5f:
            r8 = r7
        L60:
            zz1.f r9 = (zz1.f) r9
            rv1.h r2 = new rv1.h
            r2.<init>(r7, r6, r3)
            r0.u = r6
            r0.f257654x = r4
            java.lang.Object r8 = r8.g(r9, r2, r0)
            if (r8 != r1) goto L72
        L71:
            return r1
        L72:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: rv1.r.f(com.revolut.feature.apm.core.models.alias.Alias, gim.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(zz1.f r6, kotlin.jvm.functions.Function1 r7, gim.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof rv1.i
            if (r0 == 0) goto L13
            r0 = r8
            rv1.i r0 = (rv1.i) r0
            int r1 = r0.f257658y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f257658y = r1
            goto L18
        L13:
            rv1.i r0 = new rv1.i
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f257656w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f257658y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r6 = r0.v
            yhm.o.b(r8)
            return r6
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            gim.i r6 = r0.u
            r7 = r6
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
            yhm.o.b(r8)
            goto L4e
        L3d:
            yhm.o.b(r8)
            r8 = r7
            gim.i r8 = (gim.i) r8
            r0.u = r8
            r0.f257658y = r4
            java.lang.Enum r8 = r5.e(r6, r0)
            if (r8 != r1) goto L4e
            goto L68
        L4e:
            r6 = r8
            zz1.e r6 = (zz1.e) r6
            int[] r2 = rv1.b.f257641a
            int r6 = r6.ordinal()
            r6 = r2[r6]
            if (r6 != r4) goto L6a
            r6 = 0
            r0.u = r6
            r0.v = r8
            r0.f257658y = r3
            java.lang.Object r6 = r7.invoke(r0)
            if (r6 != r1) goto L69
        L68:
            return r1
        L69:
            return r8
        L6a:
            int r6 = jli.h.f175850a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: rv1.r.g(zz1.f, kotlin.jvm.functions.Function1, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable h(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof rv1.j
            if (r0 == 0) goto L13
            r0 = r5
            rv1.j r0 = (rv1.j) r0
            int r1 = r0.f257659w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f257659w = r1
            goto L18
        L13:
            rv1.j r0 = new rv1.j
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f257659w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L3f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            r0.f257659w = r3
            vw1.b r5 = r4.f257672a
            uy1.j r5 = (uy1.j) r5
            java.lang.Object r5 = r5.g(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L4a:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L65
            java.lang.Object r1 = r5.next()
            r2 = r1
            com.revolut.feature.apm.core.models.alias.Alias r2 = (com.revolut.feature.apm.core.models.alias.Alias) r2
            com.revolut.feature.apm.core.models.alias.AliasStatus r2 = r2.f61880c
            com.revolut.feature.apm.core.models.alias.AliasStatus$AVAILABLE r3 = com.revolut.feature.apm.core.models.alias.AliasStatus.AVAILABLE.f61886b
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r2, r3)
            if (r2 == 0) goto L4a
            r0.add(r1)
            goto L4a
        L65:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rv1.r.h(gim.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(gim.c r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof rv1.k
            if (r0 == 0) goto L13
            r0 = r10
            rv1.k r0 = (rv1.k) r0
            int r1 = r0.f257660w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f257660w = r1
            goto L18
        L13:
            rv1.k r0 = new rv1.k
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f257660w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r10)
            goto L47
        L28:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L30:
            yhm.o.b(r10)
            vw1.b r10 = r9.f257672a
            vkm.d r10 = vw1.b.c(r10)
            r2 = 3
            jhi.b r10 = mo3.a.g(r10, r4, r4, r2)
            r0.f257660w = r3
            java.lang.Object r10 = vkm.q.x(r10, r0)
            if (r10 != r1) goto L47
            return r1
        L47:
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r10 = r10.iterator()
        L52:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L6d
            java.lang.Object r1 = r10.next()
            r2 = r1
            com.revolut.feature.apm.core.models.alias.Alias r2 = (com.revolut.feature.apm.core.models.alias.Alias) r2
            com.revolut.feature.apm.core.models.alias.AliasAttributes r2 = r2.d
            java.lang.Boolean r2 = r2.f61882b
            boolean r2 = pd.b.j(r2)
            if (r2 == 0) goto L52
            r0.add(r1)
            goto L52
        L6d:
            java.util.Iterator r10 = r0.iterator()
            boolean r0 = r10.hasNext()
            if (r0 != 0) goto L78
            return r4
        L78:
            java.lang.Object r0 = r10.next()
            boolean r1 = r10.hasNext()
            if (r1 != 0) goto L83
            return r0
        L83:
            r1 = r0
            com.revolut.feature.apm.core.models.alias.Alias r1 = (com.revolut.feature.apm.core.models.alias.Alias) r1
            com.revolut.feature.apm.core.models.alias.AliasAttributes r1 = r1.d
            java.time.LocalDate r1 = r1.f61883c
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r1 == 0) goto L96
            long r4 = oc.c.F(r1)
            goto L97
        L96:
            r4 = r2
        L97:
            java.lang.Object r1 = r10.next()
            r6 = r1
            com.revolut.feature.apm.core.models.alias.Alias r6 = (com.revolut.feature.apm.core.models.alias.Alias) r6
            com.revolut.feature.apm.core.models.alias.AliasAttributes r6 = r6.d
            java.time.LocalDate r6 = r6.f61883c
            if (r6 == 0) goto La9
            long r6 = oc.c.F(r6)
            goto Laa
        La9:
            r6 = r2
        Laa:
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto Lb0
            r0 = r1
            r4 = r6
        Lb0:
            boolean r1 = r10.hasNext()
            if (r1 != 0) goto L97
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rv1.r.i(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(com.revolut.feature.apm.core.models.alias.Alias r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof rv1.l
            if (r0 == 0) goto L13
            r0 = r8
            rv1.l r0 = (rv1.l) r0
            int r1 = r0.f257662x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f257662x = r1
            goto L18
        L13:
            rv1.l r0 = new rv1.l
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f257662x
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L39
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r8)
            return r8
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            rv1.r r7 = r0.u
            yhm.o.b(r8)
            goto L5f
        L39:
            yhm.o.b(r8)
            java.lang.String r8 = "IDEMPOTENCY_TAG_UNFREEZE_ALIAS"
            wj0.a r2 = r6.f257674c
            r2.a(r8)
            r0.u = r6
            r0.f257662x = r4
            vw1.b r8 = r6.f257672a
            uy1.j r8 = (uy1.j) r8
            r8.getClass()
            uy1.h r2 = new uy1.h
            r2.<init>(r8, r7, r5, r4)
            skm.p0 r7 = skm.p0.f264001a
            elm.f r7 = elm.f.f127540b
            java.lang.Object r8 = skm.e0.J(r7, r2, r0)
            if (r8 != r1) goto L5e
            goto L70
        L5e:
            r7 = r6
        L5f:
            zz1.f r8 = (zz1.f) r8
            rv1.h r2 = new rv1.h
            r2.<init>(r6, r5, r4)
            r0.u = r5
            r0.f257662x = r3
            java.lang.Object r7 = r7.g(r8, r2, r0)
            if (r7 != r1) goto L71
        L70:
            return r1
        L71:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: rv1.r.j(com.revolut.feature.apm.core.models.alias.Alias, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(com.revolut.feature.apm.core.models.alias.Alias r12, gim.c r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof rv1.m
            if (r0 == 0) goto L13
            r0 = r13
            rv1.m r0 = (rv1.m) r0
            int r1 = r0.f257664x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f257664x = r1
            goto L18
        L13:
            rv1.m r0 = new rv1.m
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f257664x
            r3 = 2
            r4 = 1
            r8 = 0
            if (r2 == 0) goto L39
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r13)
            return r13
        L2b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L33:
            rv1.r r12 = r0.u
            yhm.o.b(r13)
            goto L63
        L39:
            yhm.o.b(r13)
            java.lang.String r13 = "IDEMPOTENCY_TAG_DELETE_ALIAS"
            wj0.a r2 = r11.f257674c
            r2.a(r13)
            r0.u = r11
            r0.f257664x = r4
            vw1.b r13 = r11.f257672a
            r6 = r13
            uy1.j r6 = (uy1.j) r6
            r6.getClass()
            uvf.b r5 = new uvf.b
            r10 = 1
            r9 = r8
            r7 = r12
            r5.<init>(r6, r7, r8, r9, r10)
            skm.p0 r12 = skm.p0.f264001a
            elm.f r12 = elm.f.f127540b
            java.lang.Object r13 = skm.e0.J(r12, r5, r0)
            if (r13 != r1) goto L62
            goto L74
        L62:
            r12 = r11
        L63:
            zz1.f r13 = (zz1.f) r13
            rv1.h r2 = new rv1.h
            r2.<init>(r11, r8, r3)
            r0.u = r8
            r0.f257664x = r3
            java.lang.Object r12 = r12.g(r13, r2, r0)
            if (r12 != r1) goto L75
        L74:
            return r1
        L75:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: rv1.r.k(com.revolut.feature.apm.core.models.alias.Alias, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(com.revolut.feature.apm.core.models.alias.Alias r14, com.revolut.feature.apm.core.models.alias.Alias r15, java.lang.String r16, gim.c r17) throws java.lang.Throwable {
        /*
            r13 = this;
            r0 = r17
            boolean r1 = r0 instanceof rv1.n
            if (r1 == 0) goto L15
            r1 = r0
            rv1.n r1 = (rv1.n) r1
            int r2 = r1.f257667y
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f257667y = r2
            goto L1a
        L15:
            rv1.n r1 = new rv1.n
            r1.<init>(r13, r0)
        L1a:
            java.lang.Object r0 = r1.f257665w
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f257667y
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L3c
            if (r3 == r5) goto L34
            if (r3 != r4) goto L2c
            yhm.o.b(r0)
            return r0
        L2c:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L34:
            rv1.r r14 = r1.v
            com.revolut.feature.apm.core.models.alias.Alias r15 = r1.u
            yhm.o.b(r0)
            goto L6c
        L3c:
            yhm.o.b(r0)
            java.lang.String r0 = "IDEMPOTENCY_TAG_REPLACE_ALIAS"
            wj0.a r3 = r13.f257674c
            r3.a(r0)
            r1.u = r15
            r1.v = r13
            r1.f257667y = r5
            vw1.b r0 = r13.f257672a
            r7 = r0
            uy1.j r7 = (uy1.j) r7
            r7.getClass()
            sxe.g r6 = new sxe.g
            r11 = 0
            r12 = 13
            r8 = r14
            r9 = r15
            r10 = r16
            r6.<init>(r7, r8, r9, r10, r11, r12)
            skm.p0 r14 = skm.p0.f264001a
            elm.f r14 = elm.f.f127540b
            java.lang.Object r0 = skm.e0.J(r14, r6, r1)
            if (r0 != r2) goto L6b
            goto L80
        L6b:
            r14 = r13
        L6c:
            zz1.f r0 = (zz1.f) r0
            rv1.d r3 = new rv1.d
            r6 = 0
            r3.<init>(r13, r15, r6, r5)
            r1.u = r6
            r1.v = r6
            r1.f257667y = r4
            java.lang.Object r14 = r14.g(r0, r3, r1)
            if (r14 != r2) goto L81
        L80:
            return r2
        L81:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: rv1.r.l(com.revolut.feature.apm.core.models.alias.Alias, com.revolut.feature.apm.core.models.alias.Alias, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006e, code lost:
    
        if (((uy1.j) r8).k(r9, r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(com.revolut.feature.apm.core.models.alias.Alias r7, zz1.j r8, gim.c r9) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r9 instanceof rv1.q
            if (r0 == 0) goto L13
            r0 = r9
            rv1.q r0 = (rv1.q) r0
            int r1 = r0.f257671w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f257671w = r1
            goto L18
        L13:
            rv1.q r0 = new rv1.q
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f257671w
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L37
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r9)
            goto L71
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            yhm.o.b(r9)
            return r9
        L37:
            yhm.o.b(r9)
            zz1.k r9 = new zz1.k
            com.revolut.feature.apm.core.models.alias.AliasType r2 = r7.f61878a
            java.lang.String r7 = r7.f61879b
            r9.<init>(r2, r7, r8)
            od0.a r7 = od0.a.f224253a
            boolean r7 = od0.a.e()
            vw1.b r8 = r6.f257672a
            if (r7 == 0) goto L66
            r0.f257671w = r4
            uy1.j r8 = (uy1.j) r8
            r8.getClass()
            uxe.l r7 = new uxe.l
            r9 = 3
            r7.<init>(r8, r5, r9)
            skm.p0 r8 = skm.p0.f264001a
            elm.f r8 = elm.f.f127540b
            java.lang.Object r7 = skm.e0.J(r8, r7, r0)
            if (r7 != r1) goto L65
            goto L70
        L65:
            return r7
        L66:
            r0.f257671w = r3
            uy1.j r8 = (uy1.j) r8
            java.lang.Object r7 = r8.k(r9, r0)
            if (r7 != r1) goto L71
        L70:
            return r1
        L71:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: rv1.r.m(com.revolut.feature.apm.core.models.alias.Alias, zz1.j, gim.c):java.lang.Object");
    }
}
