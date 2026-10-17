package l1;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f191341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f191342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f191343c;
    public final /* synthetic */ Object d;

    public /* synthetic */ e(Object obj2, Object obj3, boolean z, int i) {
        this.f191341a = i;
        this.f191343c = obj2;
        this.d = obj3;
        this.f191342b = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0745  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0753 A[PHI: r1
      0x0753: PHI (r1v25 java.lang.String) = (r1v24 java.lang.String), (r1v28 java.lang.String) binds: [B:237:0x0717, B:250:0x0743] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r2v103, types: [java.lang.Object, java.util.Map] */
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
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 2152
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l1.e.invoke(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ e(Object obj2, boolean z, Object obj3, int i) {
        this.f191341a = i;
        this.f191343c = obj2;
        this.f191342b = z;
        this.d = obj3;
    }

    public /* synthetic */ e(boolean z, Object obj2, Object obj3, int i) {
        this.f191341a = i;
        this.f191342b = z;
        this.f191343c = obj2;
        this.d = obj3;
    }
}
