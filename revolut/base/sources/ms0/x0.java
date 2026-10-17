package ms0;

import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.ProgressStepHorizontalV2Delegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class x0 implements z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v0 f208481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v0 f208482b;

    public x0(v0 v0Var, v0 v0Var2) {
        Color.Solid dotColor = ProgressStepHorizontalV2Delegate.d;
        Color.Solid highlightedDotColor = ProgressStepHorizontalV2Delegate.e;
        Intrinsics.checkNotNullParameter(dotColor, "dotColor");
        Intrinsics.checkNotNullParameter(highlightedDotColor, "highlightedDotColor");
        this.f208481a = v0Var;
        this.f208482b = v0Var2;
    }

    @Override // ms0.z0
    public final v0 a() {
        return this.f208481a;
    }

    @Override // ms0.z0
    public final v0 b() {
        return this.f208482b;
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
        if (!(obj2 instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj2;
        Color.Solid solid = ProgressStepHorizontalV2Delegate.d;
        if (!solid.equals(solid)) {
            return false;
        }
        Color.Solid solid2 = ProgressStepHorizontalV2Delegate.e;
        return solid2.equals(solid2) && Intrinsics.f(this.f208481a, x0Var.f208481a) && Intrinsics.f(this.f208482b, x0Var.f208482b);
    }

    public final int hashCode() {
        int iB = j6.a.b(ProgressStepHorizontalV2Delegate.e.f51464b, Integer.hashCode(ProgressStepHorizontalV2Delegate.d.f51464b) * 31, 31);
        v0 v0Var = this.f208481a;
        int iHashCode = (iB + (v0Var == null ? 0 : v0Var.hashCode())) * 31;
        v0 v0Var2 = this.f208482b;
        return iHashCode + (v0Var2 != null ? v0Var2.hashCode() : 0);
    }
}
