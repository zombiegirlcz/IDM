package kotlin.reflect.jvm.internal.impl.km.jvm;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class JvmMethodSignature extends JvmMemberSignature {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f186839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f186840b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmMethodSignature(@NotNull String name, @NotNull String descriptor) {
        super(null);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f186839a = name;
        this.f186840b = descriptor;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof JvmMethodSignature)) {
            return false;
        }
        JvmMethodSignature jvmMethodSignature = (JvmMethodSignature) obj2;
        return Intrinsics.f(this.f186839a, jvmMethodSignature.f186839a) && Intrinsics.f(this.f186840b, jvmMethodSignature.f186840b);
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.jvm.JvmMemberSignature
    @NotNull
    public String getDescriptor() {
        return this.f186840b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.jvm.JvmMemberSignature
    @NotNull
    public String getName() {
        return this.f186839a;
    }

    public int hashCode() {
        return this.f186840b.hashCode() + (this.f186839a.hashCode() * 31);
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.jvm.JvmMemberSignature
    @NotNull
    public String toString() {
        return getName() + getDescriptor();
    }
}
