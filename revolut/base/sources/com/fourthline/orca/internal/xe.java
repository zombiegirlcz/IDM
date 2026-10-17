package com.fourthline.orca.internal;

import com.fourthline.orca.internal.c81;
import com.fourthline.orca.internal.m80;
import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class xe implements oi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p20 f34959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final mi f34960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v10 f34961c;
    private final fi d;
    private final pe e;
    private final Function0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Lazy f34962g;

    public xe(p20 analytics, mi repository, v10 imageServiceLocator, fi contentProvider, pe dateFormatter, Function0 minPersonAgeFactory) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(imageServiceLocator, "imageServiceLocator");
        Intrinsics.checkNotNullParameter(contentProvider, "contentProvider");
        Intrinsics.checkNotNullParameter(dateFormatter, "dateFormatter");
        Intrinsics.checkNotNullParameter(minPersonAgeFactory, "minPersonAgeFactory");
        this.f34959a = analytics;
        this.f34960b = repository;
        this.f34961c = imageServiceLocator;
        this.d = contentProvider;
        this.e = dateFormatter;
        this.f = minPersonAgeFactory;
        this.f34962g = yhm.j.b(new ht1(this, 2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z10 a(xe xeVar) {
        return xeVar.f34961c.a(r10.E0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final li b(boolean z, li liVar) {
        Intrinsics.checkNotNullParameter(liVar, "<this>");
        boolean z3 = !z;
        return li.a(liVar, null, null, null, null, null, null, ji.a(liVar.n(), null, null, z3, 3, null), liVar.u().a(z3, z), null, 319, null);
    }

    @Override // com.fourthline.orca.internal.oi
    public Function1 c() {
        return new nq1(26);
    }

    @Override // com.fourthline.orca.internal.fr0
    public Function1 d(boolean z) {
        return new rk1(z, 12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ff  */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.fourthline.orca.internal.p20] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v2, types: [com.fourthline.orca.internal.y20] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.fourthline.orca.internal.s20 e(boolean r21) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.xe.e(boolean):com.fourthline.orca.internal.s20");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0111  */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.fourthline.orca.internal.p20] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v4, types: [com.fourthline.orca.internal.y20$c] */
    /* JADX WARN: Type inference failed for: r8v5, types: [com.fourthline.orca.internal.y20] */
    /* JADX WARN: Type inference failed for: r8v7 */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.fourthline.orca.internal.s20 f(boolean r21) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.xe.f(boolean):com.fourthline.orca.internal.s20");
    }

    @Override // com.fourthline.orca.internal.oi
    public Function1 g() {
        return new nq1(28);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final li c(li liVar) {
        Intrinsics.checkNotNullParameter(liVar, "<this>");
        return li.a(liVar, null, s20.a(liVar.q(), null, null, false, l20.f30508b, null, null, null, c81.b.f27406b, null, null, 0, 1655, null), null, null, null, null, null, null, null, 509, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final li d(li liVar) {
        Intrinsics.checkNotNullParameter(liVar, "<this>");
        return li.a(liVar, null, null, s20.a(liVar.s(), null, null, false, l20.f30508b, null, null, null, c81.b.f27406b, null, null, 0, 1655, null), null, null, null, null, null, null, 507, null);
    }

    private final z10 k() {
        return (z10) this.f34962g.getValue();
    }

    @Override // com.fourthline.orca.internal.oi
    public boolean a() {
        return this.f34960b.q() && this.f34960b.o() && this.f34960b.e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f4  */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.fourthline.orca.internal.p20] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v2, types: [com.fourthline.orca.internal.y20] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.fourthline.orca.internal.s20 g(boolean r21) {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.xe.g(boolean):com.fourthline.orca.internal.s20");
    }

    @Override // com.fourthline.orca.internal.j20
    public li getInitialState() {
        c81.a aVar = c81.f27404a;
        return new li(c81.a.a(aVar, R.string.step_document_details_header, 0, 2, null), f(true), g(true), e(true), this.d.c(), (!a() || this.f34960b.h()) ? null : c81.a.a(aVar, R.string.shared_hint_confirm_fields, 0, 2, null), new ji(c81.a.a(aVar, R.string.step_document_details_footer_something_wrong, 0, 2, null), c81.a.a(aVar, R.string.shared_button_retake_photos, 0, 2, null), true), new m80.b(new a9(c81.a.a(aVar, R.string.shared_button_confirm, 0, 2, null), a(), false)), this.f34961c.a(r10.Q0));
    }

    @Override // com.fourthline.orca.internal.oi
    public Function1 i() {
        return new lt1(this, 0);
    }

    @Override // com.fourthline.orca.internal.oi
    public Function1 l() {
        return new lt1(this, 2);
    }

    @Override // com.fourthline.orca.internal.oi
    public Function1 n() {
        return new nq1(27);
    }

    @Override // com.fourthline.orca.internal.oi
    public Function1 t() {
        return new nq1(29);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.fourthline.orca.internal.li a(com.fourthline.orca.internal.xe r18, com.fourthline.orca.internal.li r19) {
        /*
            r0 = r18
            java.lang.String r1 = "<this>"
            r2 = r19
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
            com.fourthline.orca.internal.s20 r1 = r2.o()
            java.lang.String r1 = r1.getText()
            int r1 = r1.length()
            r3 = 0
            if (r1 != 0) goto L29
            com.fourthline.orca.internal.c81$a r1 = com.fourthline.orca.internal.c81.f27404a
            r4 = -2113338641(0xffffffff820902ef, float:-1.0066012E-37)
            com.fourthline.orca.internal.c81$d r1 = r1.b(r4)
            com.fourthline.orca.internal.y20$c r4 = new com.fourthline.orca.internal.y20$c
            r4.<init>()
        L26:
            r12 = r1
            r1 = r4
            goto L6f
        L29:
            com.fourthline.orca.internal.mi r1 = r0.f34960b
            java.util.Date r1 = r1.d()
            if (r1 != 0) goto L40
            com.fourthline.orca.internal.c81$a r1 = com.fourthline.orca.internal.c81.f27404a
            r4 = -2113338662(0xffffffff820902da, float:-1.0065989E-37)
            com.fourthline.orca.internal.c81$d r1 = r1.a(r4)
            com.fourthline.orca.internal.y20$d r4 = new com.fourthline.orca.internal.y20$d
            r4.<init>()
            goto L26
        L40:
            com.fourthline.orca.internal.mi r1 = r0.f34960b
            boolean r1 = r1.e()
            if (r1 != 0) goto L6b
            com.fourthline.orca.internal.c81$a r1 = com.fourthline.orca.internal.c81.f27404a
            kotlin.jvm.functions.Function0 r4 = r0.f
            java.lang.Object r4 = r4.invoke()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String[] r4 = new java.lang.String[]{r4}
            r5 = -2113338672(0xffffffff820902d0, float:-1.0065978E-37)
            com.fourthline.orca.internal.c81$c r1 = r1.a(r5, r4)
            com.fourthline.orca.internal.y20$b$c r4 = new com.fourthline.orca.internal.y20$b$c
            r4.<init>()
            goto L26
        L6b:
            com.fourthline.orca.internal.c81$b r1 = com.fourthline.orca.internal.c81.b.f27406b
            r12 = r1
            r1 = r3
        L6f:
            com.fourthline.orca.internal.s20 r4 = r2.o()
            com.fourthline.orca.internal.c81$b r5 = com.fourthline.orca.internal.c81.b.f27406b
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r12, r5)
            if (r6 == 0) goto L7f
            com.fourthline.orca.internal.l20 r6 = com.fourthline.orca.internal.l20.f30507a
        L7d:
            r8 = r6
            goto L82
        L7f:
            com.fourthline.orca.internal.l20 r6 = com.fourthline.orca.internal.l20.f30509c
            goto L7d
        L82:
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r12, r5)
            if (r5 == 0) goto L8a
        L88:
            r13 = r3
            goto L8f
        L8a:
            com.fourthline.orca.internal.z10 r3 = r0.k()
            goto L88
        L8f:
            r16 = 1655(0x677, float:2.319E-42)
            r17 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r14 = 0
            r15 = 0
            com.fourthline.orca.internal.s20 r6 = com.fourthline.orca.internal.s20.a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            com.fourthline.orca.internal.p20 r3 = r0.f34959a
            r3.b(r6)
            if (r1 == 0) goto Lab
            com.fourthline.orca.internal.p20 r0 = r0.f34959a
            r0.a(r6, r1)
        Lab:
            kotlin.Unit r0 = kotlin.Unit.f186387a
            r12 = 503(0x1f7, float:7.05E-43)
            r13 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            com.fourthline.orca.internal.li r0 = com.fourthline.orca.internal.li.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.xe.a(com.fourthline.orca.internal.xe, com.fourthline.orca.internal.li):com.fourthline.orca.internal.li");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final li b(xe xeVar, li liVar) {
        Intrinsics.checkNotNullParameter(liVar, "<this>");
        return li.a(liVar, null, xeVar.f(false), null, null, null, null, null, null, null, 509, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final li b(String str, li liVar) {
        Intrinsics.checkNotNullParameter(liVar, "<this>");
        return li.a(liVar, null, s20.a(liVar.q(), null, null, false, null, str, null, null, null, null, null, 0, 2031, null), null, null, null, null, null, null, null, 509, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final li b(li liVar) {
        Intrinsics.checkNotNullParameter(liVar, "<this>");
        return li.a(liVar, null, null, null, s20.a(liVar.o(), null, null, false, l20.f30508b, null, null, null, c81.b.f27406b, null, null, 0, 1655, null), null, null, null, null, null, 503, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.fourthline.orca.internal.li c(com.fourthline.orca.internal.xe r18, com.fourthline.orca.internal.li r19) {
        /*
            r0 = r18
            java.lang.String r1 = "<this>"
            r2 = r19
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r1)
            com.fourthline.orca.internal.s20 r1 = r2.s()
            java.lang.String r1 = r1.getText()
            int r1 = r1.length()
            r3 = 0
            if (r1 != 0) goto L29
            com.fourthline.orca.internal.c81$a r1 = com.fourthline.orca.internal.c81.f27404a
            r4 = -2113338638(0xffffffff820902f2, float:-1.0066016E-37)
            com.fourthline.orca.internal.c81$d r1 = r1.b(r4)
            com.fourthline.orca.internal.y20$c r4 = new com.fourthline.orca.internal.y20$c
            r4.<init>()
        L26:
            r12 = r1
            r1 = r4
            goto L5b
        L29:
            com.fourthline.orca.internal.mi r1 = r0.f34960b
            java.util.Date r1 = r1.m()
            r4 = -2113338659(0xffffffff820902dd, float:-1.0065992E-37)
            if (r1 != 0) goto L40
            com.fourthline.orca.internal.c81$a r1 = com.fourthline.orca.internal.c81.f27404a
            com.fourthline.orca.internal.c81$d r1 = r1.a(r4)
            com.fourthline.orca.internal.y20$d r4 = new com.fourthline.orca.internal.y20$d
            r4.<init>()
            goto L26
        L40:
            com.fourthline.orca.internal.mi r1 = r0.f34960b
            boolean r1 = r1.o()
            if (r1 != 0) goto L57
            com.fourthline.orca.internal.c81$a r1 = com.fourthline.orca.internal.c81.f27404a
            r5 = -2113338675(0xffffffff820902cd, float:-1.0065974E-37)
            com.fourthline.orca.internal.c81$d r1 = r1.a(r5, r4)
            com.fourthline.orca.internal.y20$a$a r4 = new com.fourthline.orca.internal.y20$a$a
            r4.<init>()
            goto L26
        L57:
            com.fourthline.orca.internal.c81$b r1 = com.fourthline.orca.internal.c81.b.f27406b
            r12 = r1
            r1 = r3
        L5b:
            com.fourthline.orca.internal.s20 r4 = r2.s()
            com.fourthline.orca.internal.c81$b r5 = com.fourthline.orca.internal.c81.b.f27406b
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r12, r5)
            if (r6 == 0) goto L6b
            com.fourthline.orca.internal.l20 r6 = com.fourthline.orca.internal.l20.f30507a
        L69:
            r8 = r6
            goto L6e
        L6b:
            com.fourthline.orca.internal.l20 r6 = com.fourthline.orca.internal.l20.f30509c
            goto L69
        L6e:
            boolean r5 = kotlin.jvm.internal.Intrinsics.f(r12, r5)
            if (r5 == 0) goto L76
        L74:
            r13 = r3
            goto L7b
        L76:
            com.fourthline.orca.internal.z10 r3 = r0.k()
            goto L74
        L7b:
            r16 = 1655(0x677, float:2.319E-42)
            r17 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r14 = 0
            r15 = 0
            com.fourthline.orca.internal.s20 r5 = com.fourthline.orca.internal.s20.a(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            com.fourthline.orca.internal.p20 r3 = r0.f34959a
            r3.b(r5)
            if (r1 == 0) goto L97
            com.fourthline.orca.internal.p20 r0 = r0.f34959a
            r0.a(r5, r1)
        L97:
            kotlin.Unit r0 = kotlin.Unit.f186387a
            r12 = 507(0x1fb, float:7.1E-43)
            r13 = 0
            r3 = 0
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            com.fourthline.orca.internal.li r0 = com.fourthline.orca.internal.li.a(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.xe.c(com.fourthline.orca.internal.xe, com.fourthline.orca.internal.li):com.fourthline.orca.internal.li");
    }

    @Override // com.fourthline.orca.internal.oi
    public Function1 b(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new zi1(value, 13);
    }

    @Override // com.fourthline.orca.internal.oi
    public Function1 b(boolean z) {
        return new un1(this, z, 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final li a(String str, li liVar) {
        Intrinsics.checkNotNullParameter(liVar, "<this>");
        return li.a(liVar, null, null, null, s20.a(liVar.o(), null, null, false, null, str, null, null, null, null, null, 0, 2031, null), null, null, null, null, null, 503, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final li a(boolean z, li liVar) {
        Intrinsics.checkNotNullParameter(liVar, "<this>");
        return li.a(liVar, null, null, null, null, null, null, null, liVar.u().b(z), null, 383, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final li a(xe xeVar, boolean z, li liVar) {
        Intrinsics.checkNotNullParameter(liVar, "<this>");
        s20 s20VarG = xeVar.g(false);
        gi giVarR = liVar.r();
        return li.a(liVar, null, null, s20VarG, null, giVarR != null ? gi.a(giVarR, null, z, 1, null) : null, null, null, null, null, 491, null);
    }

    @Override // com.fourthline.orca.internal.oi
    public Function1 c(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new zi1(value, 11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final li c(String str, li liVar) {
        Intrinsics.checkNotNullParameter(liVar, "<this>");
        return li.a(liVar, null, null, s20.a(liVar.s(), null, null, false, null, str, null, null, null, null, null, 0, 2031, null), null, null, null, null, null, null, 507, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final li a(li liVar) {
        Intrinsics.checkNotNullParameter(liVar, "<this>");
        return li.a(liVar, null, null, null, null, null, null, null, null, null, 479, null);
    }

    @Override // com.fourthline.orca.internal.oi
    public Function1 c(boolean z) {
        return new rk1(z, 13);
    }

    @Override // com.fourthline.orca.internal.oi
    public Function1 e(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return new zi1(value, 12);
    }

    @Override // com.fourthline.orca.internal.oi
    public Function1 e() {
        return new lt1(this, 1);
    }
}
