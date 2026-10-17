package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public abstract class JvmMemberSignature {

    public static final class Field extends JvmMemberSignature {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f187450a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f187451b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Field(@NotNull String name, @NotNull String desc) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(desc, "desc");
            this.f187450a = name;
            this.f187451b = desc;
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature
        @NotNull
        public String asString() {
            return getName() + CoreConstants.COLON_CHAR + getDesc();
        }

        @NotNull
        public final String component1() {
            return this.f187450a;
        }

        @NotNull
        public final String component2() {
            return this.f187451b;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Field)) {
                return false;
            }
            Field field = (Field) obj2;
            return Intrinsics.f(this.f187450a, field.f187450a) && Intrinsics.f(this.f187451b, field.f187451b);
        }

        @NotNull
        public String getDesc() {
            return this.f187451b;
        }

        @NotNull
        public String getName() {
            return this.f187450a;
        }

        public int hashCode() {
            return this.f187451b.hashCode() + (this.f187450a.hashCode() * 31);
        }
    }

    public static final class Method extends JvmMemberSignature {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f187452a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f187453b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Method(@NotNull String name, @NotNull String desc) {
            super(null);
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(desc, "desc");
            this.f187452a = name;
            this.f187453b = desc;
        }

        public static /* synthetic */ Method copy$default(Method method, String str, String str2, int i, Object obj2) {
            if ((i & 1) != 0) {
                str = method.f187452a;
            }
            if ((i & 2) != 0) {
                str2 = method.f187453b;
            }
            return method.copy(str, str2);
        }

        @Override // kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMemberSignature
        @NotNull
        public String asString() {
            return getName() + getDesc();
        }

        @NotNull
        public final Method copy(@NotNull String name, @NotNull String desc) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(desc, "desc");
            return new Method(name, desc);
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Method)) {
                return false;
            }
            Method method = (Method) obj2;
            return Intrinsics.f(this.f187452a, method.f187452a) && Intrinsics.f(this.f187453b, method.f187453b);
        }

        @NotNull
        public String getDesc() {
            return this.f187453b;
        }

        @NotNull
        public String getName() {
            return this.f187452a;
        }

        public int hashCode() {
            return this.f187453b.hashCode() + (this.f187452a.hashCode() * 31);
        }
    }

    public JvmMemberSignature(DefaultConstructorMarker defaultConstructorMarker) {
    }

    @NotNull
    public abstract String asString();

    @NotNull
    public final String toString() {
        return asString();
    }
}
