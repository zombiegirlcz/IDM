package kotlin.reflect.jvm.internal.impl.km.jvm;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class JvmFieldSignature extends JvmMemberSignature {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f186837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f186838b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmFieldSignature(@NotNull String name, @NotNull String descriptor) {
        super(null);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.f186837a = name;
        this.f186838b = descriptor;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof JvmFieldSignature)) {
            return false;
        }
        JvmFieldSignature jvmFieldSignature = (JvmFieldSignature) obj2;
        return Intrinsics.f(this.f186837a, jvmFieldSignature.f186837a) && Intrinsics.f(this.f186838b, jvmFieldSignature.f186838b);
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.jvm.JvmMemberSignature
    @NotNull
    public String getDescriptor() {
        return this.f186838b;
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.jvm.JvmMemberSignature
    @NotNull
    public String getName() {
        return this.f186837a;
    }

    public int hashCode() {
        return this.f186838b.hashCode() + (this.f186837a.hashCode() * 31);
    }

    @Override // kotlin.reflect.jvm.internal.impl.km.jvm.JvmMemberSignature
    @NotNull
    public String toString() {
        return getName() + CoreConstants.COLON_CHAR + getDescriptor();
    }
}
