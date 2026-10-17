package kotlin.jvm.internal;

import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes13.dex */
public abstract class k0 extends h implements KProperty {
    private final boolean syntheticJavaProperty;

    public k0() {
        this.syntheticJavaProperty = false;
    }

    @Override // kotlin.jvm.internal.h
    public KCallable compute() {
        return this.syntheticJavaProperty ? this : super.compute();
    }

    public boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof k0) {
            k0 k0Var = (k0) obj2;
            return getOwner().equals(k0Var.getOwner()) && getName().equals(k0Var.getName()) && getSignature().equals(k0Var.getSignature()) && Intrinsics.f(getBoundReceiver(), k0Var.getBoundReceiver());
        }
        if (obj2 instanceof KProperty) {
            return obj2.equals(compute());
        }
        return false;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    @Override // kotlin.reflect.KProperty
    public boolean isConst() {
        return getReflected().isConst();
    }

    @Override // kotlin.reflect.KProperty
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        KCallable kCallableCompute = compute();
        if (kCallableCompute != this) {
            return kCallableCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // kotlin.jvm.internal.h
    public KProperty getReflected() {
        if (this.syntheticJavaProperty) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        return (KProperty) super.getReflected();
    }

    public k0(Object obj2, Class cls, String str, String str2, int i) {
        super(obj2, cls, str, str2, (i & 1) == 1);
        this.syntheticJavaProperty = (i & 2) == 2;
    }
}
