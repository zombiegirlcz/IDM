package kotlin.reflect.jvm.internal.impl.types;

/* JADX INFO: loaded from: classes13.dex */
public final class TypeParameterErasureOptions {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f187808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f187809b;

    public TypeParameterErasureOptions(boolean z, boolean z3) {
        this.f187808a = z;
        this.f187809b = z3;
    }

    public final boolean getIntersectUpperBounds() {
        return this.f187809b;
    }

    public final boolean getLeaveNonTypeParameterTypes() {
        return this.f187808a;
    }
}
