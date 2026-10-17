package anf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j9l.a f7731b;

    public b(j9l.a moneyCalculator, int i) {
        this.f7730a = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(moneyCalculator, "moneyCalculator");
                this.f7731b = moneyCalculator;
                break;
            case 2:
                Intrinsics.checkNotNullParameter(moneyCalculator, "moneyCalculator");
                this.f7731b = moneyCalculator;
                break;
            default:
                Intrinsics.checkNotNullParameter(moneyCalculator, "moneyCalculator");
                this.f7731b = moneyCalculator;
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:73:0x015d A[PHI: r0
      0x015d: PHI (r0v8 dj0.d) = (r0v7 dj0.d), (r0v10 dj0.d) binds: [B:86:0x0191, B:72:0x015b] A[DONT_GENERATE, DONT_INLINE]] */
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
    public final dj0.d a(java.util.List r10, whf.a r11) {
        /*
            Method dump skipped, instruction units count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: anf.b.a(java.util.List, whf.a):dj0.d");
    }

    public final efm.r b() {
        switch (this.f7730a) {
            case 0:
                efm.r rVarFromCallable = efm.r.fromCallable(new a68.f(3));
                Intrinsics.checkNotNullExpressionValue(rVarFromCallable, "fromCallable(...)");
                return rVarFromCallable;
            case 1:
                efm.r rVarFromCallable2 = efm.r.fromCallable(new a68.f(6));
                Intrinsics.checkNotNullExpressionValue(rVarFromCallable2, "fromCallable(...)");
                return rVarFromCallable2;
            default:
                efm.r rVarFromCallable3 = efm.r.fromCallable(new a68.f(14));
                Intrinsics.checkNotNullExpressionValue(rVarFromCallable3, "fromCallable(...)");
                return rVarFromCallable3;
        }
    }
}
