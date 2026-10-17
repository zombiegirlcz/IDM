package tfm;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes13.dex */
public final class l3 extends efm.r {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final efm.c0 f270609g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f270610h;
    public final long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final TimeUnit f270611j;

    public l3(long j2, long j3, TimeUnit timeUnit, efm.c0 c0Var) {
        this.f270610h = j2;
        this.i = j3;
        this.f270611j = timeUnit;
        this.f270609g = c0Var;
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
    @Override // efm.r
    public final void subscribeActual(efm.y yVar) {
        k3 k3Var = new k3(yVar);
        yVar.onSubscribe(k3Var);
        efm.c0 c0Var = this.f270609g;
        boolean z = c0Var instanceof wfm.a0;
        TimeUnit timeUnit = this.f270611j;
        if (!z) {
            k3Var.a(c0Var.e(k3Var, this.f270610h, this.i, timeUnit));
            return;
        }
        wfm.z zVar = new wfm.z();
        k3Var.a(zVar);
        zVar.c(k3Var, this.f270610h, this.i, timeUnit);
    }
}
