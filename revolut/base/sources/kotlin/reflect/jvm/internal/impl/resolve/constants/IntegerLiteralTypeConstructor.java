package kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributes;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;
import yhm.j;
import zhm.d0;
import zhm.f0;
import zim.h0;

/* JADX INFO: loaded from: classes14.dex */
public final class IntegerLiteralTypeConstructor implements TypeConstructor {

    @NotNull
    public static final Companion Companion = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f187586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ModuleDescriptor f187587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f187588c;
    public final SimpleType d = KotlinTypeFactory.integerLiteralType(TypeAttributes.Companion.getEmpty(), this, false);
    public final Lazy e = j.b(new h0(this, 7));

    public static final class Companion {

        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.COMMON_SUPER_TYPE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.INTERSECTION_TYPE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v19, types: [kotlin.reflect.jvm.internal.impl.types.SimpleType] */
        /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v3 */
        /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.reflect.jvm.internal.impl.types.KotlinType, kotlin.reflect.jvm.internal.impl.types.SimpleType] */
        /* JADX WARN: Type inference failed for: r1v6 */
        /* JADX WARN: Type inference failed for: r1v7 */
        public final SimpleType findIntersectionType(@NotNull Collection<? extends SimpleType> types) {
            Set setH0;
            Intrinsics.checkNotNullParameter(types, "types");
            a aVar = a.INTERSECTION_TYPE;
            if (types.isEmpty()) {
                return null;
            }
            Iterator it8 = types.iterator();
            if (!it8.hasNext()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            ?? next = it8.next();
            while (it8.hasNext()) {
                SimpleType simpleType = (SimpleType) it8.next();
                next = (SimpleType) next;
                IntegerLiteralTypeConstructor.Companion.getClass();
                if (next != 0 && simpleType != null) {
                    TypeConstructor constructor = next.getConstructor();
                    TypeConstructor constructor2 = simpleType.getConstructor();
                    boolean z = constructor instanceof IntegerLiteralTypeConstructor;
                    if (z && (constructor2 instanceof IntegerLiteralTypeConstructor)) {
                        IntegerLiteralTypeConstructor integerLiteralTypeConstructor = (IntegerLiteralTypeConstructor) constructor;
                        IntegerLiteralTypeConstructor integerLiteralTypeConstructor2 = (IntegerLiteralTypeConstructor) constructor2;
                        int i = WhenMappings.$EnumSwitchMapping$0[aVar.ordinal()];
                        if (i == 1) {
                            setH0 = d0.h0(integerLiteralTypeConstructor.getPossibleTypes(), integerLiteralTypeConstructor2.getPossibleTypes());
                        } else {
                            if (i != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            setH0 = d0.j1(integerLiteralTypeConstructor.getPossibleTypes(), integerLiteralTypeConstructor2.getPossibleTypes());
                        }
                        next = KotlinTypeFactory.integerLiteralType(TypeAttributes.Companion.getEmpty(), new IntegerLiteralTypeConstructor(integerLiteralTypeConstructor.f187586a, integerLiteralTypeConstructor.f187587b, setH0, null), false);
                    } else if (z) {
                        if (!((IntegerLiteralTypeConstructor) constructor).getPossibleTypes().contains(simpleType)) {
                            simpleType = null;
                        }
                        next = simpleType;
                    } else if (!(constructor2 instanceof IntegerLiteralTypeConstructor) || !((IntegerLiteralTypeConstructor) constructor2).getPossibleTypes().contains(next)) {
                    }
                }
                next = 0;
            }
            return (SimpleType) next;
        }
    }

    public IntegerLiteralTypeConstructor(long j2, ModuleDescriptor moduleDescriptor, Set set, DefaultConstructorMarker defaultConstructorMarker) {
        this.f187586a = j2;
        this.f187587b = moduleDescriptor;
        this.f187588c = set;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    public KotlinBuiltIns getBuiltIns() {
        return this.f187587b.getBuiltIns();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    /* JADX INFO: renamed from: getDeclarationDescriptor */
    public ClassifierDescriptor mo3795getDeclarationDescriptor() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    public List<TypeParameterDescriptor> getParameters() {
        return f0.f322471a;
    }

    @NotNull
    public final Set<KotlinType> getPossibleTypes() {
        return this.f187588c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    public Collection<KotlinType> getSupertypes() {
        return (List) this.e.getValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    public boolean isDenotable() {
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.TypeConstructor
    @NotNull
    public TypeConstructor refine(@NotNull KotlinTypeRefiner kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @NotNull
    public String toString() {
        StringBuilder sb6 = new StringBuilder("IntegerLiteralType");
        sb6.append("[" + d0.k0(this.f187588c, ",", null, null, 0, zjm.a.f322878a, 30) + ']');
        return sb6.toString();
    }
}
