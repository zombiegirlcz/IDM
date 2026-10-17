package kotlin.reflect.jvm.internal.impl.km;

import ch.qos.logback.core.CoreConstants;
import j6.a;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;
import yhm.s;
import yhm.u;
import yhm.w;
import yhm.z;

/* JADX INFO: loaded from: classes14.dex */
public abstract class KmAnnotationArgument {

    public static final class AnnotationValue extends KmAnnotationArgument {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final KmAnnotation f186738a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnnotationValue(@NotNull KmAnnotation annotation) {
            super(null);
            Intrinsics.checkNotNullParameter(annotation, "annotation");
            this.f186738a = annotation;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AnnotationValue) && Intrinsics.f(this.f186738a, ((AnnotationValue) obj2).f186738a);
        }

        @NotNull
        public final KmAnnotation getAnnotation() {
            return this.f186738a;
        }

        public int hashCode() {
            return this.f186738a.hashCode();
        }

        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument
        @NotNull
        public String toString() {
            return "AnnotationValue(" + this.f186738a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    public static final class ArrayKClassValue extends KmAnnotationArgument {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f186739a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f186740b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f186741c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ArrayKClassValue(@NotNull String className, int i) {
            super(null);
            Intrinsics.checkNotNullParameter(className, "className");
            this.f186739a = className;
            this.f186740b = i;
            if (i <= 0) {
                throw new IllegalArgumentException("ArrayKClassValue must have at least one dimension. For regular X::class argument, use KClassValue.");
            }
            StringBuilder sb6 = new StringBuilder("ArrayKClassValue(");
            for (int i2 = 0; i2 < i; i2++) {
                sb6.append("kotlin/Array<");
            }
            sb6.append(this.f186739a);
            int i3 = this.f186740b;
            for (int i5 = 0; i5 < i3; i5++) {
                sb6.append(">");
            }
            sb6.append(")");
            this.f186741c = sb6.toString();
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ArrayKClassValue)) {
                return false;
            }
            ArrayKClassValue arrayKClassValue = (ArrayKClassValue) obj2;
            return Intrinsics.f(this.f186739a, arrayKClassValue.f186739a) && this.f186740b == arrayKClassValue.f186740b;
        }

        public final int getArrayDimensionCount() {
            return this.f186740b;
        }

        @NotNull
        public final String getClassName() {
            return this.f186739a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f186740b) + (this.f186739a.hashCode() * 31);
        }

        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument
        @NotNull
        public String toString() {
            return this.f186741c;
        }
    }

    public static final class ArrayValue extends KmAnnotationArgument {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f186742a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ArrayValue(@NotNull List<? extends KmAnnotationArgument> elements) {
            super(null);
            Intrinsics.checkNotNullParameter(elements, "elements");
            this.f186742a = elements;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ArrayValue) && Intrinsics.f(this.f186742a, ((ArrayValue) obj2).f186742a);
        }

        @NotNull
        public final List<KmAnnotationArgument> getElements() {
            return this.f186742a;
        }

        public int hashCode() {
            return this.f186742a.hashCode();
        }

        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument
        @NotNull
        public String toString() {
            return b.p(CoreConstants.RIGHT_PARENTHESIS_CHAR, this.f186742a, new StringBuilder("ArrayValue("));
        }
    }

    public static final class BooleanValue extends LiteralValue<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f186743a;

        public BooleanValue(boolean z) {
            super(null);
            this.f186743a = z;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BooleanValue) && this.f186743a == ((BooleanValue) obj2).f186743a;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue
        @NotNull
        public Boolean getValue() {
            return Boolean.valueOf(this.f186743a);
        }

        public int hashCode() {
            return Boolean.hashCode(this.f186743a);
        }
    }

    public static final class ByteValue extends LiteralValue<Byte> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte f186744a;

        public ByteValue(byte b4) {
            super(null);
            this.f186744a = b4;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ByteValue) && this.f186744a == ((ByteValue) obj2).f186744a;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue
        @NotNull
        public Byte getValue() {
            return Byte.valueOf(this.f186744a);
        }

        public int hashCode() {
            return Byte.hashCode(this.f186744a);
        }
    }

    public static final class CharValue extends LiteralValue<Character> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final char f186745a;

        public CharValue(char c2) {
            super(null);
            this.f186745a = c2;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CharValue) && this.f186745a == ((CharValue) obj2).f186745a;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue
        @NotNull
        public Character getValue() {
            return Character.valueOf(this.f186745a);
        }

        public int hashCode() {
            return Character.hashCode(this.f186745a);
        }
    }

    public static final class DoubleValue extends LiteralValue<Double> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final double f186746a;

        public DoubleValue(double d) {
            super(null);
            this.f186746a = d;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DoubleValue) && Double.compare(this.f186746a, ((DoubleValue) obj2).f186746a) == 0;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue
        @NotNull
        public Double getValue() {
            return Double.valueOf(this.f186746a);
        }

        public int hashCode() {
            return Double.hashCode(this.f186746a);
        }
    }

    public static final class EnumValue extends KmAnnotationArgument {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f186747a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f186748b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EnumValue(@NotNull String enumClassName, @NotNull String enumEntryName) {
            super(null);
            Intrinsics.checkNotNullParameter(enumClassName, "enumClassName");
            Intrinsics.checkNotNullParameter(enumEntryName, "enumEntryName");
            this.f186747a = enumClassName;
            this.f186748b = enumEntryName;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof EnumValue)) {
                return false;
            }
            EnumValue enumValue = (EnumValue) obj2;
            return Intrinsics.f(this.f186747a, enumValue.f186747a) && Intrinsics.f(this.f186748b, enumValue.f186748b);
        }

        @NotNull
        public final String getEnumClassName() {
            return this.f186747a;
        }

        @NotNull
        public final String getEnumEntryName() {
            return this.f186748b;
        }

        public int hashCode() {
            return this.f186748b.hashCode() + (this.f186747a.hashCode() * 31);
        }

        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument
        @NotNull
        public String toString() {
            StringBuilder sb6 = new StringBuilder("EnumValue(");
            sb6.append(this.f186747a);
            sb6.append(CoreConstants.DOT);
            return a.u(sb6, this.f186748b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    public static final class FloatValue extends LiteralValue<Float> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f186749a;

        public FloatValue(float f) {
            super(null);
            this.f186749a = f;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof FloatValue) && Float.compare(this.f186749a, ((FloatValue) obj2).f186749a) == 0;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue
        @NotNull
        public Float getValue() {
            return Float.valueOf(this.f186749a);
        }

        public int hashCode() {
            return Float.hashCode(this.f186749a);
        }
    }

    public static final class IntValue extends LiteralValue<Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f186750a;

        public IntValue(int i) {
            super(null);
            this.f186750a = i;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof IntValue) && this.f186750a == ((IntValue) obj2).f186750a;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue
        @NotNull
        public Integer getValue() {
            return Integer.valueOf(this.f186750a);
        }

        public int hashCode() {
            return Integer.hashCode(this.f186750a);
        }
    }

    public static final class KClassValue extends KmAnnotationArgument {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f186751a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public KClassValue(@NotNull String className) {
            super(null);
            Intrinsics.checkNotNullParameter(className, "className");
            this.f186751a = className;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof KClassValue) && Intrinsics.f(this.f186751a, ((KClassValue) obj2).f186751a);
        }

        @NotNull
        public final String getClassName() {
            return this.f186751a;
        }

        public int hashCode() {
            return this.f186751a.hashCode();
        }

        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument
        @NotNull
        public String toString() {
            return a.u(new StringBuilder("KClassValue("), this.f186751a, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    public static abstract class LiteralValue<T> extends KmAnnotationArgument {
        public LiteralValue(DefaultConstructorMarker defaultConstructorMarker) {
            super(null);
        }

        @NotNull
        public abstract T getValue();

        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument
        @NotNull
        public final String toString() {
            String string;
            StringBuilder sb6 = new StringBuilder();
            sb6.append(getClass().getSimpleName());
            sb6.append(CoreConstants.LEFT_PARENTHESIS_CHAR);
            if (this instanceof StringValue) {
                string = "\"" + ((Object) ((StringValue) this).getValue()) + CoreConstants.DOUBLE_QUOTE_CHAR;
            } else {
                string = getValue().toString();
            }
            return a.u(sb6, string, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    public static final class LongValue extends LiteralValue<Long> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f186752a;

        public LongValue(long j2) {
            super(null);
            this.f186752a = j2;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof LongValue) && this.f186752a == ((LongValue) obj2).f186752a;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue
        @NotNull
        public Long getValue() {
            return Long.valueOf(this.f186752a);
        }

        public int hashCode() {
            return Long.hashCode(this.f186752a);
        }
    }

    public static final class ShortValue extends LiteralValue<Short> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final short f186753a;

        public ShortValue(short s2) {
            super(null);
            this.f186753a = s2;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ShortValue) && this.f186753a == ((ShortValue) obj2).f186753a;
        }

        public int hashCode() {
            return Short.hashCode(this.f186753a);
        }

        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue
        @NotNull
        public Short getValue() {
            return Short.valueOf(this.f186753a);
        }
    }

    public static final class StringValue extends LiteralValue<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f186754a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StringValue(@NotNull String value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.f186754a = value;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof StringValue) && Intrinsics.f(this.f186754a, ((StringValue) obj2).f186754a);
        }

        public int hashCode() {
            return this.f186754a.hashCode();
        }

        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue
        @NotNull
        public String getValue() {
            return this.f186754a;
        }
    }

    public static final class UByteValue extends LiteralValue<s> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte f186755a;

        public UByteValue(byte b4, DefaultConstructorMarker defaultConstructorMarker) {
            super(null);
            this.f186755a = b4;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof UByteValue) && this.f186755a == ((UByteValue) obj2).f186755a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue
        public /* synthetic */ s getValue() {
            return new s(m3789getValuew2LRezQ());
        }

        /* JADX INFO: renamed from: getValue-w2LRezQ, reason: not valid java name */
        public byte m3789getValuew2LRezQ() {
            return this.f186755a;
        }

        public int hashCode() {
            s.Companion aVar = s.INSTANCE;
            return Byte.hashCode(this.f186755a);
        }
    }

    public static final class UIntValue extends LiteralValue<u> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f186756a;

        public UIntValue(int i, DefaultConstructorMarker defaultConstructorMarker) {
            super(null);
            this.f186756a = i;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof UIntValue) && this.f186756a == ((UIntValue) obj2).f186756a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue
        public /* synthetic */ u getValue() {
            return new u(m3790getValuepVg5ArA());
        }

        /* JADX INFO: renamed from: getValue-pVg5ArA, reason: not valid java name */
        public int m3790getValuepVg5ArA() {
            return this.f186756a;
        }

        public int hashCode() {
            u.Companion aVar = u.INSTANCE;
            return Integer.hashCode(this.f186756a);
        }
    }

    public static final class ULongValue extends LiteralValue<w> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f186757a;

        public ULongValue(long j2, DefaultConstructorMarker defaultConstructorMarker) {
            super(null);
            this.f186757a = j2;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ULongValue) && this.f186757a == ((ULongValue) obj2).f186757a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue
        public /* synthetic */ w getValue() {
            return new w(m3791getValuesVKNKU());
        }

        /* JADX INFO: renamed from: getValue-s-VKNKU, reason: not valid java name */
        public long m3791getValuesVKNKU() {
            return this.f186757a;
        }

        public int hashCode() {
            w.Companion companion = w.INSTANCE;
            return Long.hashCode(this.f186757a);
        }
    }

    public static final class UShortValue extends LiteralValue<z> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final short f186758a;

        public UShortValue(short s2, DefaultConstructorMarker defaultConstructorMarker) {
            super(null);
            this.f186758a = s2;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof UShortValue) && this.f186758a == ((UShortValue) obj2).f186758a;
        }

        @Override // kotlin.reflect.jvm.internal.impl.km.KmAnnotationArgument.LiteralValue
        public /* synthetic */ z getValue() {
            return new z(m3792getValueMh2AYeg());
        }

        /* JADX INFO: renamed from: getValue-Mh2AYeg, reason: not valid java name */
        public short m3792getValueMh2AYeg() {
            return this.f186758a;
        }

        public int hashCode() {
            z.Companion aVar = z.INSTANCE;
            return Short.hashCode(this.f186758a);
        }
    }

    public KmAnnotationArgument(DefaultConstructorMarker defaultConstructorMarker) {
    }

    @NotNull
    public abstract String toString();
}
