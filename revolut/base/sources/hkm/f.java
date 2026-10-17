package hkm;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.DefinitelyNotNullType;
import kotlin.reflect.jvm.internal.impl.types.StubTypeForBuilderInference;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;
import kotlin.reflect.jvm.internal.impl.types.checker.NullabilityChecker;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes14.dex */
public abstract class f {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f ACCEPT_NULL;
    public static final f NOT_NULL;
    public static final f START;
    public static final f UNKNOWN;

    static {
        f fVar = new f() { // from class: hkm.d
            @Override // hkm.f
            public final f a(UnwrappedType nextType) {
                Intrinsics.checkNotNullParameter(nextType, "nextType");
                return f.b(nextType);
            }
        };
        START = fVar;
        f fVar2 = new f() { // from class: hkm.b
            @Override // hkm.f
            public final f a(UnwrappedType nextType) {
                Intrinsics.checkNotNullParameter(nextType, "nextType");
                return f.b(nextType);
            }
        };
        ACCEPT_NULL = fVar2;
        f fVar3 = new f() { // from class: hkm.e
            @Override // hkm.f
            public final f a(UnwrappedType nextType) {
                Intrinsics.checkNotNullParameter(nextType, "nextType");
                f fVarB = f.b(nextType);
                return fVarB == f.ACCEPT_NULL ? this : fVarB;
            }
        };
        UNKNOWN = fVar3;
        f fVar4 = new f() { // from class: hkm.c
            @Override // hkm.f
            public final f a(UnwrappedType nextType) {
                Intrinsics.checkNotNullParameter(nextType, "nextType");
                return this;
            }
        };
        NOT_NULL = fVar4;
        f[] fVarArr = {fVar, fVar2, fVar3, fVar4};
        $VALUES = fVarArr;
        $ENTRIES = s.n(fVarArr);
    }

    public static f b(UnwrappedType unwrappedType) {
        Intrinsics.checkNotNullParameter(unwrappedType, "<this>");
        if (unwrappedType.isMarkedNullable()) {
            return ACCEPT_NULL;
        }
        if ((unwrappedType instanceof DefinitelyNotNullType) && (((DefinitelyNotNullType) unwrappedType).getOriginal() instanceof StubTypeForBuilderInference)) {
            return NOT_NULL;
        }
        if (!(unwrappedType instanceof StubTypeForBuilderInference) && NullabilityChecker.INSTANCE.isSubtypeOfAny(unwrappedType)) {
            return NOT_NULL;
        }
        return UNKNOWN;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }

    public abstract f a(UnwrappedType unwrappedType);
}
