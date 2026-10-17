package zim;

import ch.qos.logback.core.CoreConstants;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KProperty;
import kotlin.reflect.jvm.internal.impl.SpecialJvmAnnotations;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.StandardNames;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ClassDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.EmptyPackageFragmentDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeModuleData;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.Java16SealedRecordLoader;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.km.Attributes;
import kotlin.reflect.jvm.internal.impl.km.KmClass;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.ProtoBufUtilKt;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedClassDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class e0 extends l0 implements KClass, f0, f2 {

    @NotNull
    public static final x Companion = new x();
    public static final HashSet d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f322627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f322628c;

    static {
        Set<ClassId> special_annotations = SpecialJvmAnnotations.INSTANCE.getSPECIAL_ANNOTATIONS();
        HashSet hashSet = new HashSet();
        Iterator<T> it8 = special_annotations.iterator();
        while (it8.hasNext()) {
            hashSet.add(((ClassId) it8.next()).asSingleFqName().toString());
        }
        d = hashSet;
    }

    public e0(Class jClass) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        this.f322627b = jClass;
        this.f322628c = yhm.j.c(yhm.k.PUBLICATION, new v(this, 0));
    }

    public static ClassDescriptorImpl w(ClassId classId, RuntimeModuleData runtimeModuleData) {
        ClassDescriptorImpl classDescriptorImpl = new ClassDescriptorImpl(new EmptyPackageFragmentDescriptor(runtimeModuleData.getModule(), classId.getPackageFqName()), classId.getShortClassName(), Modality.FINAL, ClassKind.CLASS, zhm.u.c(runtimeModuleData.getModule().getBuiltIns().getAny().getDefaultType()), SourceElement.NO_SOURCE, false, runtimeModuleData.getDeserialization().getStorageManager());
        classDescriptorImpl.initialize(new d0(classDescriptorImpl, runtimeModuleData.getDeserialization().getStorageManager()), zhm.h0.f322473a, null);
        return classDescriptorImpl;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    public final KmClass A() {
        return (KmClass) ((b0) this.f322628c.getValue()).f322591c.getValue();
    }

    public final kotlin.reflect.jvm.internal.impl.km.Modality B() {
        kotlin.reflect.jvm.internal.impl.km.Modality modality;
        KmClass kmClassA = A();
        if (kmClassA != null && (modality = Attributes.getModality(kmClassA)) != null) {
            return modality;
        }
        Class<?> cls = this.f322627b;
        return (cls.isAnnotation() || cls.isEnum()) ? kotlin.reflect.jvm.internal.impl.km.Modality.FINAL : Intrinsics.f(Java16SealedRecordLoader.INSTANCE.loadIsSealed(cls), Boolean.TRUE) ? kotlin.reflect.jvm.internal.impl.km.Modality.SEALED : Modifier.isAbstract(cls.getModifiers()) ? kotlin.reflect.jvm.internal.impl.km.Modality.ABSTRACT : !Modifier.isFinal(cls.getModifiers()) ? kotlin.reflect.jvm.internal.impl.km.Modality.OPEN : kotlin.reflect.jvm.internal.impl.km.Modality.FINAL;
    }

    @Override // kotlin.jvm.internal.j
    /* JADX INFO: renamed from: a */
    public final Class getF186423a() {
        return this.f322627b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.reflect.KClass
    public final String e() {
        h2 h2Var = ((b0) this.f322628c.getValue()).f;
        KProperty kProperty = b0.f322590r[3];
        return (String) h2Var.invoke();
    }

    public final boolean equals(Object obj2) {
        return (obj2 instanceof e0) && nim.a.p(this).equals(nim.a.p((KClass) obj2));
    }

    @Override // zim.l0
    public final Collection g() {
        ClassDescriptor descriptor = getDescriptor();
        if (descriptor.getKind() == ClassKind.INTERFACE || descriptor.getKind() == ClassKind.OBJECT) {
            return zhm.f0.f322471a;
        }
        Collection<ClassConstructorDescriptor> constructors = descriptor.getConstructors();
        Intrinsics.checkNotNullExpressionValue(constructors, "getConstructors(...)");
        return constructors;
    }

    @Override // wim.b
    public final List getAnnotations() {
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.reflect.KClass
    public final List getSupertypes() {
        h2 h2Var = ((b0) this.f322628c.getValue()).f322594j;
        KProperty kProperty = b0.f322590r[7];
        Object objInvoke = h2Var.invoke();
        Intrinsics.checkNotNullExpressionValue(objInvoke, "getValue(...)");
        return (List) objInvoke;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.reflect.KClass
    public final List getTypeParameters() {
        h2 h2Var = ((b0) this.f322628c.getValue()).i;
        KProperty kProperty = b0.f322590r[6];
        Object objInvoke = h2Var.invoke();
        Intrinsics.checkNotNullExpressionValue(objInvoke, "getValue(...)");
        return (List) objInvoke;
    }

    @Override // kotlin.reflect.KClass
    public final int hashCode() {
        return nim.a.p(this).hashCode();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.reflect.KClass
    public final List i() {
        h2 h2Var = ((b0) this.f322628c.getValue()).k;
        KProperty kProperty = b0.f322590r[8];
        Object objInvoke = h2Var.invoke();
        Intrinsics.checkNotNullExpressionValue(objInvoke, "getValue(...)");
        return (List) objInvoke;
    }

    @Override // kotlin.reflect.KClass
    public final boolean isAbstract() {
        return B() == kotlin.reflect.jvm.internal.impl.km.Modality.ABSTRACT;
    }

    @Override // kotlin.reflect.KClass
    public final boolean isInner() {
        KmClass kmClassA = A();
        if (kmClassA != null) {
            return Attributes.isInner(kmClassA);
        }
        Class cls = this.f322627b;
        return (cls.getDeclaringClass() == null || Modifier.isStatic(cls.getModifiers())) ? false : true;
    }

    @Override // kotlin.reflect.KClass
    public final boolean isSealed() {
        return B() == kotlin.reflect.jvm.internal.impl.km.Modality.SEALED;
    }

    @Override // kotlin.reflect.KClass
    public final boolean isValue() {
        KmClass kmClassA = A();
        return kmClassA != null && Attributes.isValue(kmClassA);
    }

    @Override // zim.l0
    public final Collection j(Name name) {
        Intrinsics.checkNotNullParameter(name, "name");
        MemberScope memberScope = getDescriptor().getDefaultType().getMemberScope();
        NoLookupLocation noLookupLocation = NoLookupLocation.FROM_REFLECTION;
        Collection<? extends SimpleFunctionDescriptor> contributedFunctions = memberScope.getContributedFunctions(name, noLookupLocation);
        MemberScope staticScope = getDescriptor().getStaticScope();
        Intrinsics.checkNotNullExpressionValue(staticScope, "getStaticScope(...)");
        return zhm.d0.E0(staticScope.getContributedFunctions(name, noLookupLocation), contributedFunctions);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.reflect.KClass
    public final Object k() {
        return ((b0) this.f322628c.getValue()).f322593h.getValue();
    }

    @Override // kotlin.reflect.KClass
    public final boolean l(Object obj2) {
        Class<?> cls = this.f322627b;
        Integer functionClassArity = ReflectClassUtilKt.getFunctionClassArity(cls);
        if (functionClassArity != null) {
            return kotlin.jvm.internal.u0.g(functionClassArity.intValue(), obj2);
        }
        Class<?> wrapperByPrimitive = ReflectClassUtilKt.getWrapperByPrimitive(cls);
        if (wrapperByPrimitive != null) {
            cls = wrapperByPrimitive;
        }
        return cls.isInstance(obj2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.reflect.KClass
    public final String m() {
        h2 h2Var = ((b0) this.f322628c.getValue()).e;
        KProperty kProperty = b0.f322590r[2];
        return (String) h2Var.invoke();
    }

    @Override // zim.l0
    public final PropertyDescriptor n(int i) {
        Class<?> declaringClass;
        Class cls = this.f322627b;
        if (cls.getSimpleName().equals("DefaultImpls") && (declaringClass = cls.getDeclaringClass()) != null && declaringClass.isInterface()) {
            return ((e0) nim.a.r(declaringClass)).n(i);
        }
        ClassDescriptor descriptor = getDescriptor();
        DeserializedClassDescriptor deserializedClassDescriptor = descriptor instanceof DeserializedClassDescriptor ? (DeserializedClassDescriptor) descriptor : null;
        if (deserializedClassDescriptor != null) {
            ProtoBuf.Class classProto = deserializedClassDescriptor.getClassProto();
            GeneratedMessageLite.GeneratedExtension<ProtoBuf.Class, List<ProtoBuf.Property>> classLocalVariable = JvmProtoBuf.classLocalVariable;
            Intrinsics.checkNotNullExpressionValue(classLocalVariable, "classLocalVariable");
            ProtoBuf.Property property = (ProtoBuf.Property) ProtoBufUtilKt.getExtensionOrNull(classProto, classLocalVariable, i);
            if (property != null) {
                return (PropertyDescriptor) o2.f(this.f322627b, property, deserializedClassDescriptor.getC().getNameResolver(), deserializedClassDescriptor.getC().getTypeTable(), deserializedClassDescriptor.getMetadataVersion(), w.f322715b);
            }
        }
        return null;
    }

    @Override // zim.l0
    public final Collection q(Name name) {
        Intrinsics.checkNotNullParameter(name, "name");
        MemberScope memberScope = getDescriptor().getDefaultType().getMemberScope();
        NoLookupLocation noLookupLocation = NoLookupLocation.FROM_REFLECTION;
        Collection<? extends PropertyDescriptor> contributedVariables = memberScope.getContributedVariables(name, noLookupLocation);
        MemberScope staticScope = getDescriptor().getStaticScope();
        Intrinsics.checkNotNullExpressionValue(staticScope, "getStaticScope(...)");
        return zhm.d0.E0(staticScope.getContributedVariables(name, noLookupLocation), contributedVariables);
    }

    public final String toString() {
        String str;
        StringBuilder sb6 = new StringBuilder("class ");
        ClassId classIdX = x();
        FqName packageFqName = classIdX.getPackageFqName();
        if (packageFqName.isRoot()) {
            str = "";
        } else {
            str = packageFqName.asString() + CoreConstants.DOT;
        }
        sb6.append(str + kotlin.text.a0.E(classIdX.getRelativeClassName().asString(), CoreConstants.DOT, CoreConstants.DOLLAR));
        return sb6.toString();
    }

    public final ClassId x() {
        PrimitiveType primitiveType;
        ClassId classIdMapJavaToKotlin;
        ClassId classId = m2.f322665a;
        Class klass = this.f322627b;
        Intrinsics.checkNotNullParameter(klass, "klass");
        if (klass.isArray()) {
            Class<?> componentType = klass.getComponentType();
            Intrinsics.checkNotNullExpressionValue(componentType, "getComponentType(...)");
            primitiveType = componentType.isPrimitive() ? JvmPrimitiveType.get(componentType.getSimpleName()).getPrimitiveType() : null;
            return primitiveType != null ? new ClassId(StandardNames.BUILT_INS_PACKAGE_FQ_NAME, primitiveType.getArrayTypeName()) : ClassId.Companion.topLevel(StandardNames.FqNames.array.toSafe());
        }
        if (klass.equals(Void.TYPE)) {
            return m2.f322665a;
        }
        primitiveType = klass.isPrimitive() ? JvmPrimitiveType.get(klass.getSimpleName()).getPrimitiveType() : null;
        if (primitiveType != null) {
            return new ClassId(StandardNames.BUILT_INS_PACKAGE_FQ_NAME, primitiveType.getTypeName());
        }
        ClassId classId2 = ReflectClassUtilKt.getClassId(klass);
        return (classId2.isLocal() || (classIdMapJavaToKotlin = JavaToKotlinClassMap.INSTANCE.mapJavaToKotlin(classId2.asSingleFqName())) == null) ? classId2 : classIdMapJavaToKotlin;
    }

    public final kotlin.reflect.jvm.internal.impl.km.ClassKind y() {
        kotlin.reflect.jvm.internal.impl.km.ClassKind kind;
        KmClass kmClassA = A();
        if (kmClassA != null && (kind = Attributes.getKind(kmClassA)) != null) {
            return kind;
        }
        Class cls = this.f322627b;
        return cls.isAnnotation() ? kotlin.reflect.jvm.internal.impl.km.ClassKind.ANNOTATION_CLASS : cls.isInterface() ? kotlin.reflect.jvm.internal.impl.km.ClassKind.INTERFACE : cls.isEnum() ? kotlin.reflect.jvm.internal.impl.km.ClassKind.ENUM_CLASS : cls.getSuperclass().isEnum() ? kotlin.reflect.jvm.internal.impl.km.ClassKind.ENUM_ENTRY : kotlin.reflect.jvm.internal.impl.km.ClassKind.CLASS;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // zim.f0
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public final ClassDescriptor getDescriptor() {
        return ((b0) this.f322628c.getValue()).b();
    }
}
