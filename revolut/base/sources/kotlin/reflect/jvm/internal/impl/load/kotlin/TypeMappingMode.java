package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.google.android.gms.common.ConnectionResult;
import com.onfido.android.sdk.capture.utils.yearclass.YearClass;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class TypeMappingMode {

    @NotNull
    public static final TypeMappingMode CLASS_DECLARATION;

    @NotNull
    public static final Companion Companion = new Companion(null);

    @NotNull
    public static final TypeMappingMode DEFAULT;

    @NotNull
    public static final TypeMappingMode DEFAULT_UAST;

    @NotNull
    public static final TypeMappingMode GENERIC_ARGUMENT;

    @NotNull
    public static final TypeMappingMode GENERIC_ARGUMENT_FOR_SUPER_TYPES_AS_IS;

    @NotNull
    public static final TypeMappingMode GENERIC_ARGUMENT_UAST;

    @NotNull
    public static final TypeMappingMode INVOKE_DYNAMIC_BOOTSTRAP_ARGUMENT;

    @NotNull
    public static final TypeMappingMode RETURN_TYPE_BOXED;

    @NotNull
    public static final TypeMappingMode SUPER_TYPE;

    @NotNull
    public static final TypeMappingMode SUPER_TYPE_AS_IS;

    @NotNull
    public static final TypeMappingMode SUPER_TYPE_KOTLIN_COLLECTIONS_AS_IS;

    @NotNull
    public static final TypeMappingMode VALUE_FOR_ANNOTATION;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f187098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f187099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f187100c;
    public final boolean d;
    public final boolean e;
    public final TypeMappingMode f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f187101g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TypeMappingMode f187102h;
    public final TypeMappingMode i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f187103j;
    public final boolean k;

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Variance.values().length];
            try {
                iArr[Variance.IN_VARIANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Variance.INVARIANT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        boolean z = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z6 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z29 = false;
        TypeMappingMode typeMappingMode = new TypeMappingMode(z, z3, z4, z6, z11, null, false, null, null, z12, z29, 2047, null);
        GENERIC_ARGUMENT = typeMappingMode;
        DefaultConstructorMarker defaultConstructorMarker = null;
        boolean z31 = false;
        boolean z41 = false;
        boolean z49 = false;
        boolean z54 = false;
        TypeMappingMode typeMappingMode2 = null;
        TypeMappingMode typeMappingMode3 = null;
        TypeMappingMode typeMappingMode4 = new TypeMappingMode(z31, z41, z12, z29, z49, null, z54, typeMappingMode2, typeMappingMode3, false, true, 1023, defaultConstructorMarker);
        GENERIC_ARGUMENT_FOR_SUPER_TYPES_AS_IS = typeMappingMode4;
        boolean z74 = false;
        TypeMappingMode typeMappingMode5 = new TypeMappingMode(z31, z41, z12, z29, z49, 0 == true ? 1 : 0, z54, typeMappingMode2, typeMappingMode3, true, z74, 1535, defaultConstructorMarker);
        GENERIC_ARGUMENT_UAST = typeMappingMode5;
        RETURN_TYPE_BOXED = new TypeMappingMode(z31, true, z12, z29, z49, 0 == true ? 1 : 0, z54, typeMappingMode2, typeMappingMode3, false, z74, 2045, defaultConstructorMarker);
        DEFAULT = new TypeMappingMode(z, z3, z4, z6, z11, typeMappingMode, false, null, null, z12, z29, YearClass.CLASS_2012, 0 == true ? 1 : 0);
        DEFAULT_UAST = new TypeMappingMode(false, false, z12, z29, false, typeMappingMode5, z54, typeMappingMode2, typeMappingMode3, true, z74, ConnectionResult.DRIVE_EXTERNAL_STORAGE_REQUIRED, defaultConstructorMarker);
        DefaultConstructorMarker defaultConstructorMarker2 = null;
        boolean z83 = false;
        TypeMappingMode typeMappingMode6 = null;
        TypeMappingMode typeMappingMode7 = null;
        CLASS_DECLARATION = new TypeMappingMode(z, true, z4, z6, z11, typeMappingMode, z83, typeMappingMode6, typeMappingMode7, z12, z29, YearClass.CLASS_2012, defaultConstructorMarker2);
        boolean z89 = false;
        SUPER_TYPE = new TypeMappingMode(z, z89, z4, true, z11, typeMappingMode, z83, typeMappingMode6, typeMappingMode7, z12, z29, 2007, defaultConstructorMarker2);
        boolean z96 = false;
        boolean z100 = false;
        boolean z101 = true;
        boolean z102 = false;
        boolean z103 = false;
        boolean z104 = true;
        SUPER_TYPE_AS_IS = new TypeMappingMode(z96, z100, z12, z101, z102, typeMappingMode4, z54, typeMappingMode2, typeMappingMode3, z103, z104, 983, defaultConstructorMarker);
        SUPER_TYPE_KOTLIN_COLLECTIONS_AS_IS = new TypeMappingMode(z96, z100, z12, z101, z102, typeMappingMode4, z54, typeMappingMode2, typeMappingMode3, z103, z104, 919, defaultConstructorMarker);
        boolean z105 = true;
        boolean z106 = false;
        TypeMappingMode typeMappingMode8 = null;
        boolean z107 = false;
        VALUE_FOR_ANNOTATION = new TypeMappingMode(z, z89, z105, z106, z11, typeMappingMode, false, null, typeMappingMode8, z12, z107, YearClass.CLASS_2008, null);
        INVOKE_DYNAMIC_BOOTSTRAP_ARGUMENT = new TypeMappingMode(true, z105, z106, z11, false, null, true, typeMappingMode8, null, z107, false, 1980, null);
    }

    public TypeMappingMode() {
        this(false, false, false, false, false, null, false, null, null, false, false, 2047, null);
    }

    public final boolean getKotlinCollectionsToJavaCollections() {
        return this.f187101g;
    }

    public final boolean getMapTypeAliases() {
        return this.f187103j;
    }

    public final boolean getNeedInlineClassWrapping() {
        return this.f187099b;
    }

    public final boolean getNeedPrimitiveBoxing() {
        return this.f187098a;
    }

    public final boolean isForAnnotationParameter() {
        return this.f187100c;
    }

    @NotNull
    public final TypeMappingMode toGenericArgumentMode(@NotNull Variance effectiveVariance, boolean z) {
        Intrinsics.checkNotNullParameter(effectiveVariance, "effectiveVariance");
        if (!z || !this.f187100c) {
            int i = WhenMappings.$EnumSwitchMapping$0[effectiveVariance.ordinal()];
            if (i == 1) {
                TypeMappingMode typeMappingMode = this.f187102h;
                if (typeMappingMode != null) {
                    return typeMappingMode;
                }
            } else if (i != 2) {
                TypeMappingMode typeMappingMode2 = this.f;
                if (typeMappingMode2 != null) {
                    return typeMappingMode2;
                }
            } else {
                TypeMappingMode typeMappingMode3 = this.i;
                if (typeMappingMode3 != null) {
                    return typeMappingMode3;
                }
            }
        }
        return this;
    }

    @NotNull
    public final TypeMappingMode wrapInlineClassesMode() {
        return new TypeMappingMode(this.f187098a, true, this.f187100c, this.d, this.e, this.f, this.f187101g, this.f187102h, this.i, this.f187103j, this.k);
    }

    public TypeMappingMode(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, TypeMappingMode typeMappingMode, boolean z12, TypeMappingMode typeMappingMode2, TypeMappingMode typeMappingMode3, boolean z29, boolean z31) {
        this.f187098a = z;
        this.f187099b = z3;
        this.f187100c = z4;
        this.d = z6;
        this.e = z11;
        this.f = typeMappingMode;
        this.f187101g = z12;
        this.f187102h = typeMappingMode2;
        this.i = typeMappingMode3;
        this.f187103j = z29;
        this.k = z31;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TypeMappingMode(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, TypeMappingMode typeMappingMode, boolean z12, TypeMappingMode typeMappingMode2, TypeMappingMode typeMappingMode3, boolean z29, boolean z31, int i, DefaultConstructorMarker defaultConstructorMarker) {
        z = (i & 1) != 0 ? true : z;
        z3 = (i & 2) != 0 ? true : z3;
        z4 = (i & 4) != 0 ? false : z4;
        z6 = (i & 8) != 0 ? false : z6;
        z11 = (i & 16) != 0 ? false : z11;
        typeMappingMode = (i & 32) != 0 ? null : typeMappingMode;
        this(z, z3, z4, z6, z11, typeMappingMode, (i & 64) != 0 ? true : z12, (i & 128) != 0 ? typeMappingMode : typeMappingMode2, (i & 256) != 0 ? typeMappingMode : typeMappingMode3, (i & 512) != 0 ? false : z29, (i & 1024) != 0 ? false : z31);
    }
}
