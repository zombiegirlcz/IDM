package kotlin.reflect.jvm.internal.impl.builtins.jvm;

import ajm.e;
import cjm.d;
import cjm.f;
import cjm.g;
import cjm.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DeclarationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.DescriptorVisibilities;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.ModalityUtilsKt;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.ValueParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter;
import kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilterKt;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureBuildingUtilsKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.MethodSignatureMappingKt;
import kotlin.reflect.jvm.internal.impl.load.kotlin.SignatureBuildingComponents;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.FqNameUnsafe;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.NameResolverUtilKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import kotlin.reflect.jvm.internal.impl.storage.CacheWithNotNullValues;
import kotlin.reflect.jvm.internal.impl.storage.MemoizedFunctionToNotNull;
import kotlin.reflect.jvm.internal.impl.storage.NotNullLazyValue;
import kotlin.reflect.jvm.internal.impl.storage.StorageKt;
import kotlin.reflect.jvm.internal.impl.storage.StorageManager;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.LazyWrappedType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.utils.DFS;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;
import o7.b;
import org.jetbrains.annotations.NotNull;
import p.a;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes13.dex */
public final class JvmBuiltInsCustomizer implements AdditionalClassPartsProvider, PlatformDependentDeclarationFilter {
    public static final /* synthetic */ KProperty[] i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ModuleDescriptor f186508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JavaToKotlinClassMapper f186509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NotNullLazyValue f186510c;
    public final SimpleType d;
    public final NotNullLazyValue e;
    public final CacheWithNotNullValues f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final NotNullLazyValue f186511g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final MemoizedFunctionToNotNull f186512h;

    /* JADX INFO: loaded from: classes14.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[h.values().length];
            try {
                iArr[h.HIDDEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h.DEPRECATED_LIST_METHODS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[h.NOT_CONSIDERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[h.DROP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[h.VISIBLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        h0 h0Var = new h0(JvmBuiltInsCustomizer.class, "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;", 0);
        p0 p0Var = o0.f186429a;
        i = new KProperty[]{p0Var.j(h0Var), a.y(JvmBuiltInsCustomizer.class, "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;", 0, p0Var), a.y(JvmBuiltInsCustomizer.class, "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;", 0, p0Var)};
    }

    public JvmBuiltInsCustomizer(@NotNull ModuleDescriptor moduleDescriptor, @NotNull StorageManager storageManager, @NotNull Function0<JvmBuiltIns.Settings> settingsComputation) {
        Intrinsics.checkNotNullParameter(moduleDescriptor, "moduleDescriptor");
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(settingsComputation, "settingsComputation");
        this.f186508a = moduleDescriptor;
        this.f186509b = JavaToKotlinClassMapper.INSTANCE;
        this.f186510c = storageManager.createLazyValue(settingsComputation);
        ClassDescriptorImpl classDescriptorImpl = new ClassDescriptorImpl(new JvmBuiltInsCustomizer$createMockJavaIoSerializableType$mockJavaIoPackageFragment$1(moduleDescriptor, new FqName("java.io")), Name.identifier("Serializable"), Modality.ABSTRACT, ClassKind.INTERFACE, u.c(new LazyWrappedType(storageManager, new d(this, 1))), SourceElement.NO_SOURCE, false, storageManager);
        classDescriptorImpl.initialize(MemberScope.Empty.INSTANCE, zhm.h0.f322473a, null);
        SimpleType defaultType = classDescriptorImpl.getDefaultType();
        Intrinsics.checkNotNullExpressionValue(defaultType, "getDefaultType(...)");
        this.d = defaultType;
        this.e = storageManager.createLazyValue(new e(this, storageManager, 3));
        this.f = storageManager.createCacheWithNotNullValues();
        int i2 = 0;
        this.f186511g = storageManager.createLazyValue(new d(this, i2));
        this.f186512h = storageManager.createMemoizedFunction(new cjm.e(this, i2));
    }

    public final LazyJavaClassDescriptor a(ClassDescriptor classDescriptor) {
        ClassId classIdMapKotlinToJava;
        FqName fqNameAsSingleFqName;
        if (KotlinBuiltIns.isAny(classDescriptor) || !KotlinBuiltIns.isUnderKotlinPackage(classDescriptor)) {
            return null;
        }
        FqNameUnsafe fqNameUnsafe = DescriptorUtilsKt.getFqNameUnsafe(classDescriptor);
        if (fqNameUnsafe.isSafe() && (classIdMapKotlinToJava = JavaToKotlinClassMap.INSTANCE.mapKotlinToJava(fqNameUnsafe)) != null && (fqNameAsSingleFqName = classIdMapKotlinToJava.asSingleFqName()) != null) {
            ClassDescriptor classDescriptorResolveClassByFqName = DescriptorUtilKt.resolveClassByFqName(b().getOwnerModuleDescriptor(), fqNameAsSingleFqName, NoLookupLocation.FROM_BUILTINS);
            if (classDescriptorResolveClassByFqName instanceof LazyJavaClassDescriptor) {
                return (LazyJavaClassDescriptor) classDescriptorResolveClassByFqName;
            }
        }
        return null;
    }

    public final JvmBuiltIns.Settings b() {
        return (JvmBuiltIns.Settings) StorageKt.getValue(this.f186510c, this, i[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
    @NotNull
    public Collection<ClassConstructorDescriptor> getConstructors(@NotNull ClassDescriptor classDescriptor) {
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        if (classDescriptor.getKind() != ClassKind.CLASS || !b().isAdditionalBuiltInsFeatureSupported()) {
            return f0.f322471a;
        }
        LazyJavaClassDescriptor lazyJavaClassDescriptorA = a(classDescriptor);
        if (lazyJavaClassDescriptorA == null) {
            return f0.f322471a;
        }
        ClassDescriptor classDescriptorMapJavaToKotlin$default = JavaToKotlinClassMapper.mapJavaToKotlin$default(this.f186509b, DescriptorUtilsKt.getFqNameSafe(lazyJavaClassDescriptorA), cjm.a.Companion.getInstance(), null, 4, null);
        if (classDescriptorMapJavaToKotlin$default == null) {
            return f0.f322471a;
        }
        TypeSubstitutor typeSubstitutorBuildSubstitutor = MappingUtilKt.createMappedTypeParametersSubstitution(classDescriptorMapJavaToKotlin$default, lazyJavaClassDescriptorA).buildSubstitutor();
        List<ClassConstructorDescriptor> constructors = lazyJavaClassDescriptorA.getConstructors();
        ArrayList<ClassConstructorDescriptor> arrayList = new ArrayList();
        for (Object obj2 : constructors) {
            ClassConstructorDescriptor classConstructorDescriptor = (ClassConstructorDescriptor) obj2;
            if (classConstructorDescriptor.getVisibility().isPublicAPI()) {
                Collection<ClassConstructorDescriptor> constructors2 = classDescriptorMapJavaToKotlin$default.getConstructors();
                Intrinsics.checkNotNullExpressionValue(constructors2, "getConstructors(...)");
                Collection<ClassConstructorDescriptor> collection = constructors2;
                if (!(collection instanceof Collection) || !collection.isEmpty()) {
                    for (ClassConstructorDescriptor classConstructorDescriptor2 : collection) {
                        Intrinsics.h(classConstructorDescriptor2);
                        if (OverridingUtil.getBothWaysOverridability(classConstructorDescriptor2, classConstructorDescriptor.substitute(typeSubstitutorBuildSubstitutor)) == OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE) {
                            break;
                        }
                    }
                }
                if (classConstructorDescriptor.getValueParameters().size() == 1) {
                    List<ValueParameterDescriptor> valueParameters = classConstructorDescriptor.getValueParameters();
                    Intrinsics.checkNotNullExpressionValue(valueParameters, "getValueParameters(...)");
                    ClassifierDescriptor classifierDescriptorMo3795getDeclarationDescriptor = ((ValueParameterDescriptor) d0.K0(valueParameters)).getType().getConstructor().mo3795getDeclarationDescriptor();
                    if (Intrinsics.f(classifierDescriptorMo3795getDeclarationDescriptor != null ? DescriptorUtilsKt.getFqNameUnsafe(classifierDescriptorMo3795getDeclarationDescriptor) : null, DescriptorUtilsKt.getFqNameUnsafe(classDescriptor))) {
                    }
                }
                if (!KotlinBuiltIns.isDeprecated(classConstructorDescriptor) && !JvmBuiltInsSignatures.INSTANCE.getHIDDEN_CONSTRUCTOR_SIGNATURES().contains(MethodSignatureBuildingUtilsKt.signature(SignatureBuildingComponents.INSTANCE, lazyJavaClassDescriptorA, MethodSignatureMappingKt.computeJvmDescriptor$default(classConstructorDescriptor, false, false, 3, null)))) {
                    arrayList.add(obj2);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        for (ClassConstructorDescriptor classConstructorDescriptor3 : arrayList) {
            FunctionDescriptor.CopyBuilder<? extends FunctionDescriptor> copyBuilderNewCopyBuilder = classConstructorDescriptor3.newCopyBuilder();
            copyBuilderNewCopyBuilder.setOwner(classDescriptor);
            copyBuilderNewCopyBuilder.setReturnType(classDescriptor.getDefaultType());
            copyBuilderNewCopyBuilder.setPreserveSourceElement();
            copyBuilderNewCopyBuilder.setSubstitution(typeSubstitutorBuildSubstitutor.getSubstitution());
            if (!JvmBuiltInsSignatures.INSTANCE.getVISIBLE_CONSTRUCTOR_SIGNATURES().contains(MethodSignatureBuildingUtilsKt.signature(SignatureBuildingComponents.INSTANCE, lazyJavaClassDescriptorA, MethodSignatureMappingKt.computeJvmDescriptor$default(classConstructorDescriptor3, false, false, 3, null)))) {
                copyBuilderNewCopyBuilder.setAdditionalAnnotations((Annotations) StorageKt.getValue(this.f186511g, this, i[2]));
            }
            FunctionDescriptor functionDescriptorBuild = copyBuilderNewCopyBuilder.build();
            Intrinsics.i(functionDescriptorBuild, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassConstructorDescriptor");
            arrayList2.add((ClassConstructorDescriptor) functionDescriptorBuild);
        }
        return arrayList2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
    @NotNull
    public Collection<SimpleFunctionDescriptor> getFunctions(@NotNull Name name, @NotNull ClassDescriptor classDescriptor) {
        Iterable<SimpleFunctionDescriptor> iterable;
        boolean zBooleanValue;
        boolean z;
        SimpleFunctionDescriptor simpleFunctionDescriptor;
        Annotations annotations;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        boolean zF = Intrinsics.f(name, CloneableClassScope.Companion.getCLONE_NAME());
        KProperty[] kPropertyArr = i;
        if (zF && (classDescriptor instanceof DeserializedClassDescriptor) && KotlinBuiltIns.isArrayOrPrimitiveArray(classDescriptor)) {
            DeserializedClassDescriptor deserializedClassDescriptor = (DeserializedClassDescriptor) classDescriptor;
            List<ProtoBuf.Function> functionList = deserializedClassDescriptor.getClassProto().getFunctionList();
            Intrinsics.checkNotNullExpressionValue(functionList, "getFunctionList(...)");
            List<ProtoBuf.Function> list = functionList;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it8 = list.iterator();
                while (it8.hasNext()) {
                    if (Intrinsics.f(NameResolverUtilKt.getName(deserializedClassDescriptor.getC().getNameResolver(), ((ProtoBuf.Function) it8.next()).getName()), CloneableClassScope.Companion.getCLONE_NAME())) {
                        return f0.f322471a;
                    }
                }
            }
            FunctionDescriptor.CopyBuilder<? extends SimpleFunctionDescriptor> copyBuilderNewCopyBuilder = ((SimpleFunctionDescriptor) d0.J0(((SimpleType) StorageKt.getValue(this.e, this, kPropertyArr[1])).getMemberScope().getContributedFunctions(name, NoLookupLocation.FROM_BUILTINS))).newCopyBuilder();
            copyBuilderNewCopyBuilder.setOwner(deserializedClassDescriptor);
            copyBuilderNewCopyBuilder.setVisibility(DescriptorVisibilities.PUBLIC);
            copyBuilderNewCopyBuilder.setReturnType(deserializedClassDescriptor.getDefaultType());
            copyBuilderNewCopyBuilder.setDispatchReceiverParameter(deserializedClassDescriptor.getThisAsReceiverParameter());
            FunctionDescriptor functionDescriptorBuild = copyBuilderNewCopyBuilder.build();
            Intrinsics.h(functionDescriptorBuild);
            return u.c((SimpleFunctionDescriptor) functionDescriptorBuild);
        }
        if (!b().isAdditionalBuiltInsFeatureSupported()) {
            return f0.f322471a;
        }
        boolean z3 = false;
        f fVar = new f(name, 0);
        LazyJavaClassDescriptor lazyJavaClassDescriptorA = a(classDescriptor);
        int i2 = 4;
        if (lazyJavaClassDescriptorA == null) {
            iterable = f0.f322471a;
        } else {
            FqName fqNameSafe = DescriptorUtilsKt.getFqNameSafe(lazyJavaClassDescriptorA);
            KotlinBuiltIns fallbackBuiltIns$Companion = cjm.a.Companion.getInstance();
            JavaToKotlinClassMapper javaToKotlinClassMapper = this.f186509b;
            Collection<ClassDescriptor> collectionMapPlatformClass = javaToKotlinClassMapper.mapPlatformClass(fqNameSafe, fallbackBuiltIns$Companion);
            ClassDescriptor classDescriptor2 = (ClassDescriptor) d0.n0(collectionMapPlatformClass);
            if (classDescriptor2 == null) {
                iterable = f0.f322471a;
            } else {
                SmartSet.Companion companion = SmartSet.Companion;
                ArrayList arrayList = new ArrayList(w.t(collectionMapPlatformClass, 10));
                Iterator<T> it9 = collectionMapPlatformClass.iterator();
                while (it9.hasNext()) {
                    arrayList.add(DescriptorUtilsKt.getFqNameSafe((ClassDescriptor) it9.next()));
                }
                SmartSet smartSetCreate = companion.create(arrayList);
                boolean zIsMutable = javaToKotlinClassMapper.isMutable(classDescriptor);
                MemberScope unsubstitutedMemberScope = ((ClassDescriptor) this.f.computeIfAbsent(DescriptorUtilsKt.getFqNameSafe(lazyJavaClassDescriptorA), new e(lazyJavaClassDescriptorA, classDescriptor2, i2))).getUnsubstitutedMemberScope();
                Intrinsics.checkNotNullExpressionValue(unsubstitutedMemberScope, "getUnsubstitutedMemberScope(...)");
                Iterable iterable2 = (Iterable) fVar.invoke(unsubstitutedMemberScope);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : iterable2) {
                    SimpleFunctionDescriptor simpleFunctionDescriptor2 = (SimpleFunctionDescriptor) obj2;
                    if (simpleFunctionDescriptor2.getKind() != CallableMemberDescriptor.Kind.DECLARATION || !simpleFunctionDescriptor2.getVisibility().isPublicAPI() || KotlinBuiltIns.isDeprecated(simpleFunctionDescriptor2)) {
                        z = z3;
                        break;
                    }
                    Collection<? extends FunctionDescriptor> overriddenDescriptors = simpleFunctionDescriptor2.getOverriddenDescriptors();
                    Intrinsics.checkNotNullExpressionValue(overriddenDescriptors, "getOverriddenDescriptors(...)");
                    Collection<? extends FunctionDescriptor> collection = overriddenDescriptors;
                    if (!(collection instanceof Collection) || !collection.isEmpty()) {
                        Iterator<T> it10 = collection.iterator();
                        while (it10.hasNext()) {
                            DeclarationDescriptor containingDeclaration = ((FunctionDescriptor) it10.next()).getContainingDeclaration();
                            Intrinsics.checkNotNullExpressionValue(containingDeclaration, "getContainingDeclaration(...)");
                            if (smartSetCreate.contains(DescriptorUtilsKt.getFqNameSafe(containingDeclaration))) {
                                z = z3;
                                break;
                            }
                        }
                    }
                    DeclarationDescriptor containingDeclaration2 = simpleFunctionDescriptor2.getContainingDeclaration();
                    Intrinsics.i(containingDeclaration2, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    if (JvmBuiltInsSignatures.INSTANCE.getMUTABLE_METHOD_SIGNATURES().contains(MethodSignatureBuildingUtilsKt.signature(SignatureBuildingComponents.INSTANCE, (ClassDescriptor) containingDeclaration2, MethodSignatureMappingKt.computeJvmDescriptor$default(simpleFunctionDescriptor2, z3, z3, 3, null))) ^ zIsMutable) {
                        zBooleanValue = true;
                    } else {
                        Boolean boolIfAny = DFS.ifAny(u.c(simpleFunctionDescriptor2), g.f24733a, new cjm.e(this, 1));
                        Intrinsics.checkNotNullExpressionValue(boolIfAny, "ifAny(...)");
                        zBooleanValue = boolIfAny.booleanValue();
                    }
                    z = !zBooleanValue;
                    if (z) {
                        arrayList2.add(obj2);
                    }
                    z3 = false;
                }
                iterable = arrayList2;
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (SimpleFunctionDescriptor simpleFunctionDescriptor3 : iterable) {
            DeclarationDescriptor containingDeclaration3 = simpleFunctionDescriptor3.getContainingDeclaration();
            Intrinsics.i(containingDeclaration3, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            FunctionDescriptor functionDescriptorSubstitute = simpleFunctionDescriptor3.substitute(MappingUtilKt.createMappedTypeParametersSubstitution((ClassDescriptor) containingDeclaration3, classDescriptor).buildSubstitutor());
            Intrinsics.i(functionDescriptorSubstitute, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.SimpleFunctionDescriptor");
            FunctionDescriptor.CopyBuilder<? extends SimpleFunctionDescriptor> copyBuilderNewCopyBuilder2 = ((SimpleFunctionDescriptor) functionDescriptorSubstitute).newCopyBuilder();
            copyBuilderNewCopyBuilder2.setOwner(classDescriptor);
            copyBuilderNewCopyBuilder2.setDispatchReceiverParameter(classDescriptor.getThisAsReceiverParameter());
            copyBuilderNewCopyBuilder2.setPreserveSourceElement();
            DeclarationDescriptor containingDeclaration4 = simpleFunctionDescriptor3.getContainingDeclaration();
            Intrinsics.i(containingDeclaration4, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            final String strComputeJvmDescriptor$default = MethodSignatureMappingKt.computeJvmDescriptor$default(simpleFunctionDescriptor3, false, false, 3, null);
            final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            Object objDfs = DFS.dfs(u.c((ClassDescriptor) containingDeclaration4), new b(this, 14), new DFS.AbstractNodeHandler<ClassDescriptor, h>() { // from class: kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer$getJdkMethodStatus$2
                @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.AbstractNodeHandler, kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
                public boolean beforeChildren(ClassDescriptor javaClassDescriptor) {
                    Intrinsics.checkNotNullParameter(javaClassDescriptor, "javaClassDescriptor");
                    String strSignature = MethodSignatureBuildingUtilsKt.signature(SignatureBuildingComponents.INSTANCE, javaClassDescriptor, strComputeJvmDescriptor$default);
                    JvmBuiltInsSignatures jvmBuiltInsSignatures = JvmBuiltInsSignatures.INSTANCE;
                    boolean zContains = jvmBuiltInsSignatures.getHIDDEN_METHOD_SIGNATURES().contains(strSignature);
                    Ref$ObjectRef ref$ObjectRef2 = ref$ObjectRef;
                    if (zContains) {
                        ref$ObjectRef2.f186409a = h.HIDDEN;
                    } else if (jvmBuiltInsSignatures.getVISIBLE_METHOD_SIGNATURES().contains(strSignature)) {
                        ref$ObjectRef2.f186409a = h.VISIBLE;
                    } else if (jvmBuiltInsSignatures.getDEPRECATED_LIST_METHODS().contains(strSignature)) {
                        ref$ObjectRef2.f186409a = h.DEPRECATED_LIST_METHODS;
                    } else if (jvmBuiltInsSignatures.getDROP_LIST_METHOD_SIGNATURES().contains(strSignature)) {
                        ref$ObjectRef2.f186409a = h.DROP;
                    }
                    return ref$ObjectRef2.f186409a == null;
                }

                @Override // kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler
                public h result() {
                    h hVar = (h) ref$ObjectRef.f186409a;
                    return hVar == null ? h.NOT_CONSIDERED : hVar;
                }
            });
            Intrinsics.checkNotNullExpressionValue(objDfs, "dfs(...)");
            int i3 = WhenMappings.$EnumSwitchMapping$0[((h) objDfs).ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    Name name2 = simpleFunctionDescriptor3.getName();
                    boolean zF2 = Intrinsics.f(name2, JvmBuiltInsCustomizerKt.f186515a);
                    MemoizedFunctionToNotNull memoizedFunctionToNotNull = this.f186512h;
                    if (zF2) {
                        annotations = (Annotations) memoizedFunctionToNotNull.invoke(new Pair(simpleFunctionDescriptor3.getName().asString(), "first"));
                    } else {
                        if (!Intrinsics.f(name2, JvmBuiltInsCustomizerKt.f186516b)) {
                            throw new IllegalStateException(("Unexpected name: " + simpleFunctionDescriptor3.getName()).toString());
                        }
                        annotations = (Annotations) memoizedFunctionToNotNull.invoke(new Pair(simpleFunctionDescriptor3.getName().asString(), "last"));
                    }
                    copyBuilderNewCopyBuilder2.setAdditionalAnnotations(annotations);
                } else if (i3 != 3) {
                    if (i3 != 4) {
                        if (i3 != 5) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Unit unit = Unit.f186387a;
                    }
                    simpleFunctionDescriptor = null;
                } else {
                    copyBuilderNewCopyBuilder2.setAdditionalAnnotations((Annotations) StorageKt.getValue(this.f186511g, this, kPropertyArr[2]));
                }
                FunctionDescriptor functionDescriptorBuild2 = copyBuilderNewCopyBuilder2.build();
                Intrinsics.h(functionDescriptorBuild2);
                simpleFunctionDescriptor = (SimpleFunctionDescriptor) functionDescriptorBuild2;
            } else {
                if (!ModalityUtilsKt.isFinalClass(classDescriptor)) {
                    copyBuilderNewCopyBuilder2.setHiddenForResolutionEverywhereBesideSupercalls();
                    FunctionDescriptor functionDescriptorBuild22 = copyBuilderNewCopyBuilder2.build();
                    Intrinsics.h(functionDescriptorBuild22);
                    simpleFunctionDescriptor = (SimpleFunctionDescriptor) functionDescriptorBuild22;
                }
                simpleFunctionDescriptor = null;
            }
            if (simpleFunctionDescriptor != null) {
                arrayList3.add(simpleFunctionDescriptor);
            }
        }
        return arrayList3;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
    @NotNull
    public Collection<KotlinType> getSupertypes(@NotNull ClassDescriptor classDescriptor) {
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        FqNameUnsafe fqNameUnsafe = DescriptorUtilsKt.getFqNameUnsafe(classDescriptor);
        JvmBuiltInsSignatures jvmBuiltInsSignatures = JvmBuiltInsSignatures.INSTANCE;
        boolean zIsArrayOrPrimitiveArray = jvmBuiltInsSignatures.isArrayOrPrimitiveArray(fqNameUnsafe);
        SimpleType simpleType = this.d;
        return zIsArrayOrPrimitiveArray ? v.k((SimpleType) StorageKt.getValue(this.e, this, i[1]), simpleType) : jvmBuiltInsSignatures.isSerializableInJava(fqNameUnsafe) ? u.c(simpleType) : f0.f322471a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.PlatformDependentDeclarationFilter
    public boolean isFunctionAvailable(@NotNull ClassDescriptor classDescriptor, @NotNull SimpleFunctionDescriptor functionDescriptor) {
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        Intrinsics.checkNotNullParameter(functionDescriptor, "functionDescriptor");
        LazyJavaClassDescriptor lazyJavaClassDescriptorA = a(classDescriptor);
        if (lazyJavaClassDescriptorA == null || !functionDescriptor.getAnnotations().hasAnnotation(PlatformDependentDeclarationFilterKt.getPLATFORM_DEPENDENT_ANNOTATION_FQ_NAME())) {
            return true;
        }
        if (!b().isAdditionalBuiltInsFeatureSupported()) {
            return false;
        }
        String strComputeJvmDescriptor$default = MethodSignatureMappingKt.computeJvmDescriptor$default(functionDescriptor, false, false, 3, null);
        LazyJavaClassMemberScope unsubstitutedMemberScope = lazyJavaClassDescriptorA.getUnsubstitutedMemberScope();
        Name name = functionDescriptor.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        Collection<SimpleFunctionDescriptor> contributedFunctions = unsubstitutedMemberScope.getContributedFunctions(name, NoLookupLocation.FROM_BUILTINS);
        if ((contributedFunctions instanceof Collection) && contributedFunctions.isEmpty()) {
            return false;
        }
        Iterator<T> it8 = contributedFunctions.iterator();
        while (it8.hasNext()) {
            if (Intrinsics.f(MethodSignatureMappingKt.computeJvmDescriptor$default((SimpleFunctionDescriptor) it8.next(), false, false, 3, null), strComputeJvmDescriptor$default)) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.deserialization.AdditionalClassPartsProvider
    @NotNull
    public Set<Name> getFunctionsNames(@NotNull ClassDescriptor classDescriptor) {
        LazyJavaClassMemberScope unsubstitutedMemberScope;
        Set<Name> functionNames;
        Intrinsics.checkNotNullParameter(classDescriptor, "classDescriptor");
        if (!b().isAdditionalBuiltInsFeatureSupported()) {
            return zhm.h0.f322473a;
        }
        LazyJavaClassDescriptor lazyJavaClassDescriptorA = a(classDescriptor);
        return (lazyJavaClassDescriptorA == null || (unsubstitutedMemberScope = lazyJavaClassDescriptorA.getUnsubstitutedMemberScope()) == null || (functionNames = unsubstitutedMemberScope.getFunctionNames()) == null) ? zhm.h0.f322473a : functionNames;
    }
}
