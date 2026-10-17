package ad6;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import md6.v;
import zhm.f0;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements h {
    @Override // ad6.h
    public final List a(ld6.g gVar, cd6.b configuration) {
        v product = (v) gVar;
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return f0.f322471a;
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
    @Override // ad6.h
    public final ld6.b b(ld6.g gVar, cd6.b configuration) {
        v product = (v) gVar;
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        configuration.getClass();
        wi0.b bVar = wi0.b.O;
        wi0.b.Companion.getClass();
        if (bVar.equals(bVar)) {
            return ld6.b.REVOLUT_SECURITIES_SINGAPORE;
        }
        return null;
    }
}
