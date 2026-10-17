package kotlin.reflect.jvm.internal.impl.builtins;

import bjm.b;
import bjm.c;
import bjm.d;
import bjm.e;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.functions.BuiltInFictitiousFunctionClassFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.PackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyGetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertySetterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeAttributesKt;
import kotlin.reflect.jvm.internal.impl.types.TypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.TypeProjectionImpl;
import kotlin.reflect.jvm.internal.impl.types.TypeUtils;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.cbeff.ISO781611;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes13.dex */
public abstract class KotlinBuiltIns {
    public static final Name BUILTINS_MODULE_NAME = Name.special("<built-ins module>");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ModuleDescriptorImpl f186463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NotNullLazyValue f186464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NotNullLazyValue f186465c;
    public final MemoizedFunctionToNotNull d;
    public final StorageManager e;

    public KotlinBuiltIns(StorageManager storageManager) {
        if (storageManager == null) {
            a(0);
            throw null;
        }
        this.e = storageManager;
        this.f186465c = storageManager.createLazyValue(new b(this, 0));
        this.f186464b = storageManager.createLazyValue(new b(this, 1));
        this.d = storageManager.createMemoizedFunction(new c(this, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035 A[FALL_THROUGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(int r23) {
        /*
            Method dump skipped, instruction units count: 2222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.a(int):void");
    }

    public static boolean b(ClassDescriptor classDescriptor, FqNameUnsafe fqNameUnsafe) {
        if (classDescriptor == null) {
            a(103);
            throw null;
        }
        if (fqNameUnsafe != null) {
            return classDescriptor.getName().equals(fqNameUnsafe.shortName()) && fqNameUnsafe.equals(DescriptorUtils.getFqName(classDescriptor));
        }
        a(104);
        throw null;
    }

    public static boolean g(KotlinType kotlinType, FqNameUnsafe fqNameUnsafe) {
        if (kotlinType == null) {
            a(97);
            throw null;
        }
        if (fqNameUnsafe != null) {
            return isTypeConstructorForGivenClass(kotlinType.getConstructor(), fqNameUnsafe);
        }
        a(98);
        throw null;
    }

    public static PrimitiveType getPrimitiveArrayElementType(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            a(92);
            throw null;
        }
        ClassifierDescriptor classifierDescriptorMo3795getDeclarationDescriptor = kotlinType.getConstructor().mo3795getDeclarationDescriptor();
        if (classifierDescriptorMo3795getDeclarationDescriptor == null) {
            return null;
        }
        return getPrimitiveArrayType(classifierDescriptorMo3795getDeclarationDescriptor);
    }

    public static PrimitiveType getPrimitiveArrayType(@NotNull DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            a(77);
            throw null;
        }
        if (StandardNames.FqNames.primitiveArrayTypeShortNames.contains(declarationDescriptor.getName())) {
            return StandardNames.FqNames.arrayClassFqNameToPrimitiveType.get(DescriptorUtils.getFqName(declarationDescriptor));
        }
        return null;
    }

    public static PrimitiveType getPrimitiveType(@NotNull DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            a(76);
            throw null;
        }
        if (StandardNames.FqNames.primitiveTypeShortNames.contains(declarationDescriptor.getName())) {
            return StandardNames.FqNames.fqNameToPrimitiveType.get(DescriptorUtils.getFqName(declarationDescriptor));
        }
        return null;
    }

    public static boolean h(KotlinType kotlinType, FqNameUnsafe fqNameUnsafe) {
        if (kotlinType == null) {
            a(ISO781611.CREATOR_OF_BIOMETRIC_REFERENCE_DATA);
            throw null;
        }
        if (fqNameUnsafe != null) {
            return g(kotlinType, fqNameUnsafe) && !kotlinType.isMarkedNullable();
        }
        a(135);
        throw null;
    }

    public static boolean i(KotlinType kotlinType, FqNameUnsafe fqNameUnsafe) {
        if (kotlinType == null) {
            a(105);
            throw null;
        }
        if (fqNameUnsafe != null) {
            return !kotlinType.isMarkedNullable() && g(kotlinType, fqNameUnsafe);
        }
        a(106);
        throw null;
    }

    public static boolean isAny(@NotNull ClassDescriptor classDescriptor) {
        if (classDescriptor != null) {
            return b(classDescriptor, StandardNames.FqNames.any);
        }
        a(LDSFile.EF_DG12_TAG);
        throw null;
    }

    public static boolean isAnyOrNullableAny(@NotNull KotlinType kotlinType) {
        if (kotlinType != null) {
            return g(kotlinType, StandardNames.FqNames.any);
        }
        a(139);
        throw null;
    }

    public static boolean isArray(@NotNull KotlinType kotlinType) {
        if (kotlinType != null) {
            return g(kotlinType, StandardNames.FqNames.array);
        }
        a(88);
        throw null;
    }

    public static boolean isArrayOrPrimitiveArray(@NotNull ClassDescriptor classDescriptor) {
        if (classDescriptor != null) {
            return b(classDescriptor, StandardNames.FqNames.array) || getPrimitiveArrayType(classDescriptor) != null;
        }
        a(89);
        throw null;
    }

    public static boolean isBoolean(@NotNull KotlinType kotlinType) {
        if (kotlinType != null) {
            return h(kotlinType, StandardNames.FqNames._boolean);
        }
        a(LDSFile.EF_DG14_TAG);
        throw null;
    }

    public static boolean isBuiltIn(@NotNull DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor != null) {
            return DescriptorUtils.getParentOfType(declarationDescriptor, BuiltInsPackageFragment.class, false) != null;
        }
        a(9);
        throw null;
    }

    public static boolean isDefaultBound(@NotNull KotlinType kotlinType) {
        if (kotlinType != null) {
            return isNullableAny(kotlinType);
        }
        a(ModuleDescriptor.MODULE_VERSION);
        throw null;
    }

    public static boolean isDeprecated(@NotNull DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            a(160);
            throw null;
        }
        if (declarationDescriptor.getOriginal().getAnnotations().hasAnnotation(StandardNames.FqNames.deprecated)) {
            return true;
        }
        if (declarationDescriptor instanceof PropertyDescriptor) {
            PropertyDescriptor propertyDescriptor = (PropertyDescriptor) declarationDescriptor;
            boolean zIsVar = propertyDescriptor.isVar();
            PropertyGetterDescriptor getter = propertyDescriptor.getGetter();
            PropertySetterDescriptor setter = propertyDescriptor.getSetter();
            if (getter != null && isDeprecated(getter) && (!zIsVar || (setter != null && isDeprecated(setter)))) {
                return true;
            }
        }
        return false;
    }

    public static boolean isKClass(@NotNull ClassDescriptor classDescriptor) {
        if (classDescriptor != null) {
            return b(classDescriptor, StandardNames.FqNames.kClass);
        }
        a(ISO781611.SMT_DO_DS);
        throw null;
    }

    public static boolean isNothing(@NotNull KotlinType kotlinType) {
        if (kotlinType != null) {
            return isNothingOrNullableNothing(kotlinType) && !TypeUtils.isNullableType(kotlinType);
        }
        a(136);
        throw null;
    }

    public static boolean isNothingOrNullableNothing(@NotNull KotlinType kotlinType) {
        if (kotlinType != null) {
            return g(kotlinType, StandardNames.FqNames.nothing);
        }
        a(138);
        throw null;
    }

    public static boolean isNullableAny(@NotNull KotlinType kotlinType) {
        if (kotlinType != null) {
            return isAnyOrNullableAny(kotlinType) && kotlinType.isMarkedNullable();
        }
        a(140);
        throw null;
    }

    public static boolean isPrimitiveArray(@NotNull KotlinType kotlinType) {
        if (kotlinType != null) {
            ClassifierDescriptor classifierDescriptorMo3795getDeclarationDescriptor = kotlinType.getConstructor().mo3795getDeclarationDescriptor();
            return (classifierDescriptorMo3795getDeclarationDescriptor == null || getPrimitiveArrayType(classifierDescriptorMo3795getDeclarationDescriptor) == null) ? false : true;
        }
        a(91);
        throw null;
    }

    public static boolean isPrimitiveClass(@NotNull ClassDescriptor classDescriptor) {
        if (classDescriptor != null) {
            return getPrimitiveType(classDescriptor) != null;
        }
        a(96);
        throw null;
    }

    public static boolean isPrimitiveType(@NotNull KotlinType kotlinType) {
        if (kotlinType != null) {
            return !kotlinType.isMarkedNullable() && isPrimitiveTypeOrNullablePrimitiveType(kotlinType);
        }
        a(94);
        throw null;
    }

    public static boolean isPrimitiveTypeOrNullablePrimitiveType(@NotNull KotlinType kotlinType) {
        if (kotlinType != null) {
            ClassifierDescriptor classifierDescriptorMo3795getDeclarationDescriptor = kotlinType.getConstructor().mo3795getDeclarationDescriptor();
            return (classifierDescriptorMo3795getDeclarationDescriptor instanceof ClassDescriptor) && isPrimitiveClass((ClassDescriptor) classifierDescriptorMo3795getDeclarationDescriptor);
        }
        a(95);
        throw null;
    }

    public static boolean isSpecialClassWithNoSupertypes(@NotNull ClassDescriptor classDescriptor) {
        if (classDescriptor != null) {
            return b(classDescriptor, StandardNames.FqNames.any) || b(classDescriptor, StandardNames.FqNames.nothing);
        }
        a(107);
        throw null;
    }

    public static boolean isString(KotlinType kotlinType) {
        return kotlinType != null && i(kotlinType, StandardNames.FqNames.string);
    }

    public static boolean isTypeConstructorForGivenClass(@NotNull TypeConstructor typeConstructor, @NotNull FqNameUnsafe fqNameUnsafe) {
        if (typeConstructor == null) {
            a(101);
            throw null;
        }
        if (fqNameUnsafe != null) {
            ClassifierDescriptor classifierDescriptorMo3795getDeclarationDescriptor = typeConstructor.mo3795getDeclarationDescriptor();
            return (classifierDescriptorMo3795getDeclarationDescriptor instanceof ClassDescriptor) && b((ClassDescriptor) classifierDescriptorMo3795getDeclarationDescriptor, fqNameUnsafe);
        }
        a(102);
        throw null;
    }

    public static boolean isUByteArray(@NotNull KotlinType kotlinType) {
        if (kotlinType != null) {
            return h(kotlinType, StandardNames.FqNames.uByteArrayFqName.toUnsafe());
        }
        a(128);
        throw null;
    }

    public static boolean isUIntArray(@NotNull KotlinType kotlinType) {
        if (kotlinType != null) {
            return h(kotlinType, StandardNames.FqNames.uIntArrayFqName.toUnsafe());
        }
        a(130);
        throw null;
    }

    public static boolean isULongArray(@NotNull KotlinType kotlinType) {
        if (kotlinType != null) {
            return h(kotlinType, StandardNames.FqNames.uLongArrayFqName.toUnsafe());
        }
        a(ISO781611.CREATION_DATE_AND_TIME_TAG);
        throw null;
    }

    public static boolean isUShortArray(@NotNull KotlinType kotlinType) {
        if (kotlinType != null) {
            return h(kotlinType, StandardNames.FqNames.uShortArrayFqName.toUnsafe());
        }
        a(129);
        throw null;
    }

    public static boolean isUnderKotlinPackage(@NotNull DeclarationDescriptor declarationDescriptor) {
        if (declarationDescriptor == null) {
            a(10);
            throw null;
        }
        while (declarationDescriptor != null) {
            if (declarationDescriptor instanceof PackageFragmentDescriptor) {
                return ((PackageFragmentDescriptor) declarationDescriptor).getFqName().startsWith(StandardNames.BUILT_INS_PACKAGE_NAME);
            }
            declarationDescriptor = declarationDescriptor.getContainingDeclaration();
        }
        return false;
    }

    public static boolean isUnit(@NotNull KotlinType kotlinType) {
        if (kotlinType != null) {
            return i(kotlinType, StandardNames.FqNames.unit);
        }
        a(142);
        throw null;
    }

    public static boolean isUnsignedArrayType(@NotNull KotlinType kotlinType) {
        if (kotlinType != null) {
            return isUByteArray(kotlinType) || isUShortArray(kotlinType) || isUIntArray(kotlinType) || isULongArray(kotlinType);
        }
        a(132);
        throw null;
    }

    public final void c(boolean z) {
        ModuleDescriptorImpl moduleDescriptorImpl = new ModuleDescriptorImpl(BUILTINS_MODULE_NAME, this.e, this, null);
        this.f186463a = moduleDescriptorImpl;
        moduleDescriptorImpl.initialize(BuiltInsLoader.Companion.getInstance().createPackageFragmentProvider(this.e, this.f186463a, getClassDescriptorFactories(), f(), d(), z));
        ModuleDescriptorImpl moduleDescriptorImpl2 = this.f186463a;
        moduleDescriptorImpl2.setDependencies(moduleDescriptorImpl2);
    }

    public AdditionalClassPartsProvider d() {
        AdditionalClassPartsProvider.None none = AdditionalClassPartsProvider.None.INSTANCE;
        if (none != null) {
            return none;
        }
        a(3);
        throw null;
    }

    public final ClassDescriptor e(String str) {
        if (str == null) {
            a(14);
            throw null;
        }
        ClassDescriptor classDescriptor = (ClassDescriptor) this.d.invoke(Name.identifier(str));
        if (classDescriptor != null) {
            return classDescriptor;
        }
        a(15);
        throw null;
    }

    public PlatformDependentDeclarationFilter f() {
        PlatformDependentDeclarationFilter.NoPlatformDependent noPlatformDependent = PlatformDependentDeclarationFilter.NoPlatformDependent.INSTANCE;
        if (noPlatformDependent != null) {
            return noPlatformDependent;
        }
        a(4);
        throw null;
    }

    @NotNull
    public ClassDescriptor getAny() {
        return e("Any");
    }

    @NotNull
    public SimpleType getAnyType() {
        SimpleType defaultType = getAny().getDefaultType();
        if (defaultType != null) {
            return defaultType;
        }
        a(51);
        throw null;
    }

    @NotNull
    public ClassDescriptor getArray() {
        return e("Array");
    }

    @NotNull
    public KotlinType getArrayElementType(@NotNull KotlinType kotlinType) {
        if (kotlinType == null) {
            a(68);
            throw null;
        }
        KotlinType arrayElementTypeOrNull = getArrayElementTypeOrNull(kotlinType);
        if (arrayElementTypeOrNull != null) {
            return arrayElementTypeOrNull;
        }
        throw new IllegalStateException("not array: " + kotlinType);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0079 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public kotlin.reflect.jvm.internal.impl.types.KotlinType getArrayElementTypeOrNull(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.KotlinType r5) {
        /*
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L81
            boolean r1 = isArray(r5)
            if (r1 == 0) goto L26
            java.util.List r1 = r5.getArguments()
            int r1 = r1.size()
            r2 = 1
            if (r1 == r2) goto L16
            goto L80
        L16:
            java.util.List r5 = r5.getArguments()
            r0 = 0
            java.lang.Object r5 = r5.get(r0)
            kotlin.reflect.jvm.internal.impl.types.TypeProjection r5 = (kotlin.reflect.jvm.internal.impl.types.TypeProjection) r5
            kotlin.reflect.jvm.internal.impl.types.KotlinType r5 = r5.getType()
            return r5
        L26:
            kotlin.reflect.jvm.internal.impl.types.KotlinType r5 = kotlin.reflect.jvm.internal.impl.types.TypeUtils.makeNotNullable(r5)
            kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue r1 = r4.f186464b
            java.lang.Object r1 = r1.invoke()
            bjm.e r1 = (bjm.e) r1
            java.util.HashMap r1 = r1.f16206b
            java.lang.Object r1 = r1.get(r5)
            kotlin.reflect.jvm.internal.impl.types.KotlinType r1 = (kotlin.reflect.jvm.internal.impl.types.KotlinType) r1
            if (r1 == 0) goto L3d
            return r1
        L3d:
            kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor r1 = kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils.getContainingModuleOrNull(r5)
            if (r1 == 0) goto L80
            if (r5 == 0) goto L7a
            kotlin.reflect.jvm.internal.impl.types.TypeConstructor r5 = r5.getConstructor()
            kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor r5 = r5.mo3795getDeclarationDescriptor()
            if (r5 != 0) goto L51
        L4f:
            r5 = r0
            goto L77
        L51:
            kotlin.reflect.jvm.internal.impl.builtins.UnsignedTypes r2 = kotlin.reflect.jvm.internal.impl.builtins.UnsignedTypes.INSTANCE
            kotlin.reflect.jvm.internal.impl.name.Name r3 = r5.getName()
            boolean r3 = r2.isShortNameOfUnsignedArray(r3)
            if (r3 != 0) goto L5e
            goto L4f
        L5e:
            kotlin.reflect.jvm.internal.impl.name.ClassId r5 = kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt.getClassId(r5)
            if (r5 != 0) goto L65
            goto L4f
        L65:
            kotlin.reflect.jvm.internal.impl.name.ClassId r5 = r2.getUnsignedClassIdByArrayClassId(r5)
            if (r5 != 0) goto L6c
            goto L4f
        L6c:
            kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor r5 = kotlin.reflect.jvm.internal.impl.descriptors.FindClassInModuleKt.findClassAcrossModuleDependencies(r1, r5)
            if (r5 != 0) goto L73
            goto L4f
        L73:
            kotlin.reflect.jvm.internal.impl.types.SimpleType r5 = r5.getDefaultType()
        L77:
            if (r5 == 0) goto L80
            return r5
        L7a:
            r5 = 71
            a(r5)
            throw r0
        L80:
            return r0
        L81:
            r5 = 70
            a(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns.getArrayElementTypeOrNull(kotlin.reflect.jvm.internal.impl.types.KotlinType):kotlin.reflect.jvm.internal.impl.types.KotlinType");
    }

    @NotNull
    public SimpleType getArrayType(@NotNull Variance variance, @NotNull KotlinType kotlinType, @NotNull Annotations annotations) {
        if (variance == null) {
            a(78);
            throw null;
        }
        if (kotlinType == null) {
            a(79);
            throw null;
        }
        if (annotations == null) {
            a(80);
            throw null;
        }
        SimpleType simpleTypeSimpleNotNullType = KotlinTypeFactory.simpleNotNullType(TypeAttributesKt.toDefaultAttributes(annotations), getArray(), Collections.singletonList(new TypeProjectionImpl(variance, kotlinType)));
        if (simpleTypeSimpleNotNullType != null) {
            return simpleTypeSimpleNotNullType;
        }
        a(81);
        throw null;
    }

    @NotNull
    public SimpleType getBooleanType() {
        SimpleType primitiveKotlinType = getPrimitiveKotlinType(PrimitiveType.BOOLEAN);
        if (primitiveKotlinType != null) {
            return primitiveKotlinType;
        }
        a(64);
        throw null;
    }

    @NotNull
    public ClassDescriptor getBuiltInClassByFqName(@NotNull FqName fqName) {
        if (fqName == null) {
            a(12);
            throw null;
        }
        ClassDescriptor classDescriptorResolveClassByFqName = DescriptorUtilKt.resolveClassByFqName(getBuiltInsModule(), fqName, NoLookupLocation.FROM_BUILTINS);
        if (classDescriptorResolveClassByFqName != null) {
            return classDescriptorResolveClassByFqName;
        }
        a(13);
        throw null;
    }

    @NotNull
    public ModuleDescriptorImpl getBuiltInsModule() {
        this.f186463a.getClass();
        ModuleDescriptorImpl moduleDescriptorImpl = this.f186463a;
        if (moduleDescriptorImpl != null) {
            return moduleDescriptorImpl;
        }
        a(7);
        throw null;
    }

    @NotNull
    public MemberScope getBuiltInsPackageScope() {
        MemberScope memberScope = getBuiltInsModule().getPackage(StandardNames.BUILT_INS_PACKAGE_FQ_NAME).getMemberScope();
        if (memberScope != null) {
            return memberScope;
        }
        a(11);
        throw null;
    }

    @NotNull
    public SimpleType getByteType() {
        SimpleType primitiveKotlinType = getPrimitiveKotlinType(PrimitiveType.BYTE);
        if (primitiveKotlinType != null) {
            return primitiveKotlinType;
        }
        a(57);
        throw null;
    }

    @NotNull
    public SimpleType getCharType() {
        SimpleType primitiveKotlinType = getPrimitiveKotlinType(PrimitiveType.CHAR);
        if (primitiveKotlinType != null) {
            return primitiveKotlinType;
        }
        a(63);
        throw null;
    }

    public Iterable getClassDescriptorFactories() {
        List listSingletonList = Collections.singletonList(new BuiltInFictitiousFunctionClassFactory(this.e, getBuiltInsModule()));
        if (listSingletonList != null) {
            return listSingletonList;
        }
        a(5);
        throw null;
    }

    @NotNull
    public ClassDescriptor getCollection() {
        ClassDescriptor builtInClassByFqName = getBuiltInClassByFqName(StandardNames.FqNames.collection);
        if (builtInClassByFqName != null) {
            return builtInClassByFqName;
        }
        a(35);
        throw null;
    }

    @NotNull
    public ClassDescriptor getComparable() {
        return e("Comparable");
    }

    @NotNull
    public SimpleType getDefaultBound() {
        SimpleType nullableAnyType = getNullableAnyType();
        if (nullableAnyType != null) {
            return nullableAnyType;
        }
        a(53);
        throw null;
    }

    @NotNull
    public SimpleType getDoubleType() {
        SimpleType primitiveKotlinType = getPrimitiveKotlinType(PrimitiveType.DOUBLE);
        if (primitiveKotlinType != null) {
            return primitiveKotlinType;
        }
        a(62);
        throw null;
    }

    @NotNull
    public SimpleType getFloatType() {
        SimpleType primitiveKotlinType = getPrimitiveKotlinType(PrimitiveType.FLOAT);
        if (primitiveKotlinType != null) {
            return primitiveKotlinType;
        }
        a(61);
        throw null;
    }

    @NotNull
    public ClassDescriptor getFunction(int i) {
        return e(StandardNames.getFunctionName(i));
    }

    @NotNull
    public SimpleType getIntType() {
        SimpleType primitiveKotlinType = getPrimitiveKotlinType(PrimitiveType.INT);
        if (primitiveKotlinType != null) {
            return primitiveKotlinType;
        }
        a(59);
        throw null;
    }

    @NotNull
    public ClassDescriptor getKClass() {
        ClassDescriptor builtInClassByFqName = getBuiltInClassByFqName(StandardNames.FqNames.kClass.toSafe());
        if (builtInClassByFqName != null) {
            return builtInClassByFqName;
        }
        a(21);
        throw null;
    }

    @NotNull
    public SimpleType getLongType() {
        SimpleType primitiveKotlinType = getPrimitiveKotlinType(PrimitiveType.LONG);
        if (primitiveKotlinType != null) {
            return primitiveKotlinType;
        }
        a(60);
        throw null;
    }

    @NotNull
    public ClassDescriptor getNothing() {
        return e("Nothing");
    }

    @NotNull
    public SimpleType getNothingType() {
        SimpleType defaultType = getNothing().getDefaultType();
        if (defaultType != null) {
            return defaultType;
        }
        a(49);
        throw null;
    }

    @NotNull
    public SimpleType getNullableAnyType() {
        SimpleType simpleTypeMakeNullableAsSpecified = getAnyType().makeNullableAsSpecified(true);
        if (simpleTypeMakeNullableAsSpecified != null) {
            return simpleTypeMakeNullableAsSpecified;
        }
        a(52);
        throw null;
    }

    @NotNull
    public SimpleType getNullableNothingType() {
        SimpleType simpleTypeMakeNullableAsSpecified = getNothingType().makeNullableAsSpecified(true);
        if (simpleTypeMakeNullableAsSpecified != null) {
            return simpleTypeMakeNullableAsSpecified;
        }
        a(50);
        throw null;
    }

    @NotNull
    public ClassDescriptor getNumber() {
        return e("Number");
    }

    @NotNull
    public SimpleType getNumberType() {
        SimpleType defaultType = getNumber().getDefaultType();
        if (defaultType != null) {
            return defaultType;
        }
        a(56);
        throw null;
    }

    @NotNull
    public SimpleType getPrimitiveArrayKotlinType(@NotNull PrimitiveType primitiveType) {
        if (primitiveType == null) {
            a(73);
            throw null;
        }
        SimpleType simpleType = (SimpleType) ((e) this.f186464b.invoke()).f16205a.get(primitiveType);
        if (simpleType != null) {
            return simpleType;
        }
        a(74);
        throw null;
    }

    @NotNull
    public SimpleType getPrimitiveKotlinType(@NotNull PrimitiveType primitiveType) {
        if (primitiveType == null) {
            a(54);
            throw null;
        }
        if (primitiveType == null) {
            a(16);
            throw null;
        }
        SimpleType defaultType = e(primitiveType.getTypeName().asString()).getDefaultType();
        if (defaultType != null) {
            return defaultType;
        }
        a(55);
        throw null;
    }

    @NotNull
    public SimpleType getShortType() {
        SimpleType primitiveKotlinType = getPrimitiveKotlinType(PrimitiveType.SHORT);
        if (primitiveKotlinType != null) {
            return primitiveKotlinType;
        }
        a(58);
        throw null;
    }

    @NotNull
    public ClassDescriptor getString() {
        return e("String");
    }

    @NotNull
    public SimpleType getStringType() {
        SimpleType defaultType = getString().getDefaultType();
        if (defaultType != null) {
            return defaultType;
        }
        a(66);
        throw null;
    }

    @NotNull
    public ClassDescriptor getSuspendFunction(int i) {
        ClassDescriptor builtInClassByFqName = getBuiltInClassByFqName(StandardNames.COROUTINES_PACKAGE_FQ_NAME.child(Name.identifier(StandardNames.getSuspendFunctionName(i))));
        if (builtInClassByFqName != null) {
            return builtInClassByFqName;
        }
        a(18);
        throw null;
    }

    @NotNull
    public ClassDescriptor getUnit() {
        return e("Unit");
    }

    @NotNull
    public SimpleType getUnitType() {
        SimpleType defaultType = getUnit().getDefaultType();
        if (defaultType != null) {
            return defaultType;
        }
        a(65);
        throw null;
    }

    public void setBuiltInsModule(@NotNull ModuleDescriptorImpl moduleDescriptorImpl) {
        if (moduleDescriptorImpl == null) {
            a(1);
            throw null;
        }
        this.e.compute(new d(this, moduleDescriptorImpl));
    }

    public static boolean isArrayOrPrimitiveArray(@NotNull KotlinType kotlinType) {
        if (kotlinType != null) {
            return isArray(kotlinType) || isPrimitiveArray(kotlinType);
        }
        a(90);
        throw null;
    }

    @NotNull
    public SimpleType getArrayType(@NotNull Variance variance, @NotNull KotlinType kotlinType) {
        if (variance == null) {
            a(82);
            throw null;
        }
        if (kotlinType != null) {
            SimpleType arrayType = getArrayType(variance, kotlinType, Annotations.Companion.getEMPTY());
            if (arrayType != null) {
                return arrayType;
            }
            a(84);
            throw null;
        }
        a(83);
        throw null;
    }
}
