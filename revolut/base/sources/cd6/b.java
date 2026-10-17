package cd6;

import h30.l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f23194c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f23195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ld6.b f23196b;

    static {
        wi0.b.Companion.getClass();
        xi0.b.Companion.getClass();
        f23194c = new b(xi0.b.F, ld6.b.REVOLUT_BANK_COLOMBIA);
    }

    public b(xi0.b baseCurrency, ld6.b baseLegalEntity) {
        wi0.b country = wi0.b.O;
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Intrinsics.checkNotNullParameter(baseLegalEntity, "baseLegalEntity");
        this.f23195a = baseCurrency;
        this.f23196b = baseLegalEntity;
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
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        wi0.b bVar2 = wi0.b.O;
        return bVar2.equals(bVar2) && Intrinsics.f(this.f23195a, bVar.f23195a) && this.f23196b == bVar.f23196b;
    }

    public final int hashCode() {
        wi0.a aVar = wi0.b.Companion;
        return this.f23196b.hashCode() + l.j(this.f23195a, 66836, 31);
    }
}
