package kotlin.reflect.jvm.internal.impl.builtins;

import bjm.f;
import java.util.Set;
import kotlin.Lazy;
import kotlin.collections.d;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import org.jetbrains.annotations.NotNull;
import vc.s;
import yhm.j;
import yhm.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
public final class PrimitiveType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PrimitiveType[] $VALUES;
    public static final PrimitiveType BOOLEAN;
    public static final PrimitiveType BYTE;
    public static final PrimitiveType CHAR;

    @NotNull
    public static final Companion Companion;
    public static final PrimitiveType DOUBLE;
    public static final PrimitiveType FLOAT;
    public static final PrimitiveType INT;
    public static final PrimitiveType LONG;

    @NotNull
    public static final Set<PrimitiveType> NUMBER_TYPES;
    public static final PrimitiveType SHORT;

    @NotNull
    private final Lazy arrayTypeFqName$delegate;

    @NotNull
    private final Name arrayTypeName;

    @NotNull
    private final Lazy typeFqName$delegate;

    @NotNull
    private final Name typeName;

    /* JADX WARN: Type inference failed for: r0v3, types: [kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType$Companion] */
    static {
        PrimitiveType primitiveType = new PrimitiveType("BOOLEAN", 0, "Boolean");
        BOOLEAN = primitiveType;
        PrimitiveType primitiveType2 = new PrimitiveType("CHAR", 1, "Char");
        CHAR = primitiveType2;
        PrimitiveType primitiveType3 = new PrimitiveType("BYTE", 2, "Byte");
        BYTE = primitiveType3;
        PrimitiveType primitiveType4 = new PrimitiveType("SHORT", 3, "Short");
        SHORT = primitiveType4;
        PrimitiveType primitiveType5 = new PrimitiveType("INT", 4, "Int");
        INT = primitiveType5;
        PrimitiveType primitiveType6 = new PrimitiveType("FLOAT", 5, "Float");
        FLOAT = primitiveType6;
        PrimitiveType primitiveType7 = new PrimitiveType("LONG", 6, "Long");
        LONG = primitiveType7;
        PrimitiveType primitiveType8 = new PrimitiveType("DOUBLE", 7, "Double");
        DOUBLE = primitiveType8;
        PrimitiveType[] primitiveTypeArr = {primitiveType, primitiveType2, primitiveType3, primitiveType4, primitiveType5, primitiveType6, primitiveType7, primitiveType8};
        $VALUES = primitiveTypeArr;
        $ENTRIES = s.n(primitiveTypeArr);
        Companion = new Object(null) { // from class: kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType.Companion
        };
        PrimitiveType[] elements = {primitiveType2, primitiveType3, primitiveType4, primitiveType5, primitiveType6, primitiveType7, primitiveType8};
        Intrinsics.checkNotNullParameter(elements, "elements");
        NUMBER_TYPES = d.y0(elements);
    }

    public PrimitiveType(String str, int i, String str2) {
        Name nameIdentifier = Name.identifier(str2);
        Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
        this.typeName = nameIdentifier;
        Name nameIdentifier2 = Name.identifier(str2.concat("Array"));
        Intrinsics.checkNotNullExpressionValue(nameIdentifier2, "identifier(...)");
        this.arrayTypeName = nameIdentifier2;
        k kVar = k.PUBLICATION;
        this.typeFqName$delegate = j.c(kVar, new f(this, 0));
        this.arrayTypeFqName$delegate = j.c(kVar, new f(this, 1));
    }

    public static FqName a(PrimitiveType primitiveType) {
        return StandardNames.BUILT_INS_PACKAGE_FQ_NAME.child(primitiveType.typeName);
    }

    public static FqName b(PrimitiveType primitiveType) {
        return StandardNames.BUILT_INS_PACKAGE_FQ_NAME.child(primitiveType.arrayTypeName);
    }

    public static PrimitiveType valueOf(String str) {
        return (PrimitiveType) Enum.valueOf(PrimitiveType.class, str);
    }

    public static PrimitiveType[] values() {
        return (PrimitiveType[]) $VALUES.clone();
    }

    @NotNull
    public final FqName getArrayTypeFqName() {
        return (FqName) this.arrayTypeFqName$delegate.getValue();
    }

    @NotNull
    public final Name getArrayTypeName() {
        return this.arrayTypeName;
    }

    @NotNull
    public final FqName getTypeFqName() {
        return (FqName) this.typeFqName$delegate.getValue();
    }

    @NotNull
    public final Name getTypeName() {
        return this.typeName;
    }
}
