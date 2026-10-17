package p01;

/* JADX INFO: loaded from: classes20.dex */
public final class z implements k01.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jid.z f231464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f231465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k01.m f231466c;

    public z(jid.z zVar, a0 a0Var, k01.h hVar) {
        this.f231464a = zVar;
        this.f231465b = a0Var;
        this.f231466c = hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Type inference failed for: r1v2, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
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
    @Override // k01.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            p01.a0 r2 = r0.f231465b
            p01.x r3 = r2.d
            boolean r4 = r1 instanceof p01.y
            if (r4 == 0) goto L1b
            r4 = r1
            p01.y r4 = (p01.y) r4
            int r5 = r4.f231463x
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L1b
            int r5 = r5 - r6
            r4.f231463x = r5
            goto L20
        L1b:
            p01.y r4 = new p01.y
            r4.<init>(r0, r1)
        L20:
            java.lang.Object r1 = r4.v
            fim.a r5 = fim.a.COROUTINE_SUSPENDED
            int r6 = r4.f231463x
            r7 = 0
            r8 = 1
            jid.z r9 = r0.f231464a
            if (r6 == 0) goto L3c
            if (r6 != r8) goto L34
            android.text.SpannableStringBuilder r4 = r4.u
            yhm.o.b(r1)
            goto L59
        L34:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3c:
            yhm.o.b(r1)
            java.lang.Object r1 = r2.f231407a
            android.text.SpannableStringBuilder r1 = r9.s(r1)
            k01.m r6 = r0.f231466c
            if (r6 == 0) goto L5e
            r4.u = r1
            r4.f231463x = r8
            java.lang.Object r4 = r6.a(r4)
            if (r4 != r5) goto L54
            return r5
        L54:
            r16 = r4
            r4 = r1
            r1 = r16
        L59:
            androidx.glance.BitmapImageProvider r1 = (androidx.glance.BitmapImageProvider) r1
            r12 = r1
            r11 = r4
            goto L60
        L5e:
            r11 = r1
            r12 = r7
        L60:
            com.revolut.core.ui_kit.models.MoneyClause r1 = r2.f231409c
            android.text.SpannableStringBuilder r13 = r9.s(r1)
            boolean r1 = r3 instanceof p01.v
            if (r1 == 0) goto L8f
            p01.p r7 = new p01.p
            r1 = r3
            p01.v r1 = (p01.v) r1
            int r4 = r1.f231458a
            com.revolut.core.ui_kit.models.PercentageClause r1 = r1.f231459b
            android.text.SpannableStringBuilder r1 = r9.s(r1)
            p01.v r3 = (p01.v) r3
            com.revolut.core.ui.models.Color$Solid r3 = r3.f231460c
            java.lang.String r5 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r5)
            java.lang.Object r5 = r9.f174462c
            k01.l r5 = (k01.l) r5
            androidx.appcompat.view.ContextThemeWrapper r5 = r5.f179911a
            int r3 = io0.a.c(r5, r3)
            r7.<init>(r1, r4, r3)
        L8d:
            r14 = r7
            goto La4
        L8f:
            boolean r1 = r3 instanceof p01.w
            if (r1 == 0) goto La1
            p01.q r7 = new p01.q
            p01.w r3 = (p01.w) r3
            com.revolut.core.ui_kit.models.Clause r1 = r3.f231461a
            android.text.SpannableStringBuilder r1 = r9.s(r1)
            r7.<init>(r1)
            goto L8d
        La1:
            if (r3 != 0) goto Lac
            goto L8d
        La4:
            boolean r15 = r2.e
            p01.s r10 = new p01.s
            r10.<init>(r11, r12, r13, r14, r15)
            return r10
        Lac:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p01.z.a(gim.c):java.lang.Object");
    }
}
