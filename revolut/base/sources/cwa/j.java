package cwa;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes5.dex */
public final class j implements yva.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ewa.a f109596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fk3.a f109597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ang.f f109598c;
    public final gte.a d;
    public final mh7.c e;
    public final ih7.b f;

    public j(ewa.a repository, fk3.a configurationInteractor, ang.f userInteractor, l80.e dateProvider, gte.a featureToggleInteractor, mh7.c installDataProvider, ih7.b installDataServiceConnector) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(installDataProvider, "installDataProvider");
        Intrinsics.checkNotNullParameter(installDataServiceConnector, "installDataServiceConnector");
        this.f109596a = repository;
        this.f109597b = configurationInteractor;
        this.f109598c = userInteractor;
        this.d = featureToggleInteractor;
        this.e = installDataProvider;
        this.f = installDataServiceConnector;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ef A[Catch: all -> 0x0068, TryCatch #5 {all -> 0x0068, blocks: (B:28:0x0060, B:45:0x00e1, B:47:0x00ef, B:54:0x011f, B:50:0x0117, B:62:0x0143, B:65:0x0149, B:67:0x0170, B:34:0x007b, B:37:0x0092), top: B:105:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01e8  */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v2, types: [java.lang.String, kotlin.jvm.internal.Ref$ObjectRef] */
    /* JADX WARN: Type inference failed for: r2v11, types: [cwa.b] */
    /* JADX WARN: Type inference failed for: r2v14, types: [cwa.b, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2, types: [cwa.b] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v42 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [cwa.b] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v6, types: [cwa.b, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0, types: [mh7.c] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x0149 -> B:66:0x016d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x018e -> B:71:0x0191). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r19, java.lang.String r20, gim.c r21) {
        /*
            Method dump skipped, instruction units count: 552
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cwa.j.a(java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c9, code lost:
    
        if (f(r11, r0) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cwa.j.b(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof cwa.d
            if (r0 == 0) goto L13
            r0 = r7
            cwa.d r0 = (cwa.d) r0
            int r1 = r0.f109581w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f109581w = r1
            goto L18
        L13:
            cwa.d r0 = new cwa.d
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f109581w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L71
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2f:
            yhm.o.b(r7)
            w4l.h r7 = w4l.h.f294642c
            fk3.a r2 = r6.f109597b
            ik3.c r2 = (ik3.c) r2
            e7l.g$a r4 = e7l.g.a.f123406a
            efm.r r7 = r2.l(r4, r7)
            cul.r1 r2 = new cul.r1
            r4 = 15
            r2.<init>(r4)
            r4 = 0
            efm.r r7 = m70.a.g(r7, r4, r2, r3)
            cw7.j r2 = new cw7.j
            r4 = 2
            r2.<init>(r4)
            cu8.u0 r4 = new cu8.u0
            r5 = 8
            r4.<init>(r5, r2)
            efm.r r7 = r7.map(r4)
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            efm.r r7 = r7.onErrorReturnItem(r2)
            java.lang.String r4 = "onErrorReturnItem(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r4)
            r0.f109581w = r3
            clm.a r3 = clm.a.FIRST_OR_DEFAULT
            java.lang.Object r7 = nim.a.g(r7, r3, r2, r0)
            if (r7 != r1) goto L71
            return r1
        L71:
            java.lang.String r0 = "awaitFirstOrDefault(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: cwa.j.c(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b7, code lost:
    
        if (r10 != r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(gim.c r10) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cwa.j.d(gim.c):java.lang.Object");
    }

    public final Object e(String str, awa.a aVar) throws Throwable {
        ewa.e eVar = (ewa.e) this.f109596a;
        eVar.getClass();
        ew1.d dVar = new ew1.d(eVar, str, null, 4);
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, dVar, aVar);
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar2) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar2 ? objJ : Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.String r8, gim.c r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof cwa.i
            if (r0 == 0) goto L13
            r0 = r9
            cwa.i r0 = (cwa.i) r0
            int r1 = r0.f109595y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f109595y = r1
            goto L18
        L13:
            cwa.i r0 = new cwa.i
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f109593w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f109595y
            ewa.a r3 = r7.f109596a
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            yva.f r8 = r0.v
            yhm.o.b(r9)
            return r8
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            java.lang.String r8 = r0.u
            yhm.o.b(r9)
            goto L5a
        L3d:
            yhm.o.b(r9)
            r0.u = r8
            r0.f109595y = r5
            r9 = r3
            ewa.e r9 = (ewa.e) r9
            r9.getClass()
            esa.i r2 = new esa.i
            r2.<init>(r6, r9, r8)
            skm.p0 r9 = skm.p0.f264001a
            elm.f r9 = elm.f.f127540b
            java.lang.Object r9 = skm.e0.J(r9, r2, r0)
            if (r9 != r1) goto L5a
            goto Lab
        L5a:
            yva.f r9 = (yva.f) r9
            r0.u = r6
            r0.v = r9
            r0.f109595y = r4
            boolean r2 = r9 instanceof yva.c
            if (r2 == 0) goto L8e
            r2 = r9
            yva.c r2 = (yva.c) r2
            java.lang.String r2 = r2.f317155a
            com.revolut.feature.referrals.code.data.api.ReferrerDetails r4 = new com.revolut.feature.referrals.code.data.api.ReferrerDetails
            r4.<init>(r2, r8)
            ewa.e r3 = (ewa.e) r3
            r3.getClass()
            ew1.d r8 = new ew1.d
            r2 = 5
            r8.<init>(r3, r4, r6, r2)
            skm.p0 r2 = skm.p0.f264001a
            elm.f r2 = elm.f.f127540b
            java.lang.Object r8 = skm.e0.J(r2, r8, r0)
            if (r8 != r1) goto L86
            goto L88
        L86:
            kotlin.Unit r8 = kotlin.Unit.f186387a
        L88:
            if (r8 != r1) goto L8b
            goto La9
        L8b:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            goto La9
        L8e:
            zhm.h0 r8 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "result : "
            r2.<init>(r3)
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "ReferralCodeInteractorImpl"
            rd0.d.a(r0, r3, r2, r6, r8)
            kotlin.Unit r8 = kotlin.Unit.f186387a
        La9:
            if (r8 != r1) goto Lac
        Lab:
            return r1
        Lac:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: cwa.j.f(java.lang.String, gim.c):java.lang.Object");
    }
}
