package kotlin.reflect.jvm.internal.impl.load.kotlin;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public abstract class JvmType {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Primitive f187089a = new Primitive(JvmPrimitiveType.BOOLEAN);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Primitive f187090b = new Primitive(JvmPrimitiveType.CHAR);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Primitive f187091c = new Primitive(JvmPrimitiveType.BYTE);
    public static final Primitive d = new Primitive(JvmPrimitiveType.SHORT);
    public static final Primitive e = new Primitive(JvmPrimitiveType.INT);
    public static final Primitive f = new Primitive(JvmPrimitiveType.FLOAT);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Primitive f187092g = new Primitive(JvmPrimitiveType.LONG);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Primitive f187093h = new Primitive(JvmPrimitiveType.DOUBLE);

    public static final class Array extends JvmType {
        public final JvmType i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Array(@NotNull JvmType elementType) {
            super(null);
            Intrinsics.checkNotNullParameter(elementType, "elementType");
            this.i = elementType;
        }

        @NotNull
        public final JvmType getElementType() {
            return this.i;
        }
    }

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public final Primitive getBOOLEAN$descriptors_jvm() {
            return JvmType.f187089a;
        }

        @NotNull
        public final Primitive getBYTE$descriptors_jvm() {
            return JvmType.f187091c;
        }

        @NotNull
        public final Primitive getCHAR$descriptors_jvm() {
            return JvmType.f187090b;
        }

        @NotNull
        public final Primitive getDOUBLE$descriptors_jvm() {
            return JvmType.f187093h;
        }

        @NotNull
        public final Primitive getFLOAT$descriptors_jvm() {
            return JvmType.f;
        }

        @NotNull
        public final Primitive getINT$descriptors_jvm() {
            return JvmType.e;
        }

        @NotNull
        public final Primitive getLONG$descriptors_jvm() {
            return JvmType.f187092g;
        }

        @NotNull
        public final Primitive getSHORT$descriptors_jvm() {
            return JvmType.d;
        }
    }

    public static final class Object extends JvmType {
        public final String i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Object(@NotNull String internalName) {
            super(null);
            Intrinsics.checkNotNullParameter(internalName, "internalName");
            this.i = internalName;
        }

        @NotNull
        public final String getInternalName() {
            return this.i;
        }
    }

    public static final class Primitive extends JvmType {
        public final JvmPrimitiveType i;

        public Primitive(JvmPrimitiveType jvmPrimitiveType) {
            super(null);
            this.i = jvmPrimitiveType;
        }

        public final JvmPrimitiveType getJvmPrimitiveType() {
            return this.i;
        }
    }

    public JvmType(DefaultConstructorMarker defaultConstructorMarker) {
    }

    @NotNull
    public String toString() {
        return a.b(this);
    }
}
