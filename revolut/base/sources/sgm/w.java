package sgm;

import java.util.Collection;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
public final class w extends ahm.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f263229b;

    public w(x xVar) {
        this.f263229b = xVar;
    }

    @Override // fgm.l
    public final void onComplete() {
        this.f263229b.onComplete();
    }

    @Override // fgm.l
    public final void onError(Throwable th10) {
        this.f263229b.onError(th10);
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
    @Override // fgm.l
    public final void onNext(Object obj2) {
        x xVar = this.f263229b;
        xVar.getClass();
        try {
            Object obj3 = xVar.f.get();
            Objects.requireNonNull(obj3, "The buffer supplied is null");
            Collection collection = (Collection) obj3;
            synchronized (xVar) {
                try {
                    Object obj4 = xVar.f263266j;
                    if (obj4 == null) {
                        return;
                    }
                    xVar.f263266j = collection;
                    xVar.k(obj4, xVar);
                } catch (Throwable th10) {
                    throw th10;
                }
            }
        } catch (Throwable th11) {
            ce9.m.F(th11);
            xVar.dispose();
            xVar.f215262b.onError(th11);
        }
    }
}
