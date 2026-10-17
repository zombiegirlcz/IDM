package tx0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class t4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w4 f275248a;

    public t4(w4 width) {
        u4 height = u4.f275249a;
        Intrinsics.checkNotNullParameter(height, "height");
        Intrinsics.checkNotNullParameter(width, "width");
        this.f275248a = width;
    }

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
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t4)) {
            return false;
        }
        t4 t4Var = (t4) obj2;
        u4 u4Var = u4.f275249a;
        return u4Var.equals(u4Var) && this.f275248a.equals(t4Var.f275248a);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ((this.f275248a.hashCode() + 2119854599) * 31);
    }
}
