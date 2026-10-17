package zim;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KCallable;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JavaToKotlinClassMap;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.SourceElement;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotated;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.AnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.Annotations;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectAnnotationSource;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectJavaClassFinderKt;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.ReflectKotlinClass;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeModuleData;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeSourceElementFactory;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaAnnotation;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaElement;
import kotlin.reflect.jvm.internal.impl.km.KmClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinaryClass;
import kotlin.reflect.jvm.internal.impl.load.kotlin.KotlinJvmBinarySourceElement;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.BinaryVersion;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.VersionRequirementTable;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.constants.AnnotationValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.EnumValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.ErrorValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.KClassValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.NullValue;
import kotlin.reflect.jvm.internal.impl.resolve.constants.TypedArrayValue;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationComponents;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.DeserializationContext;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.MemberDeserializer;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.TypeProjection;

/* JADX INFO: loaded from: classes13.dex */
public abstract class o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final FqName f322677a = new FqName("kotlin.jvm.JvmStatic");

    public static final u a(Object obj2) {
        u uVar = obj2 instanceof u ? (u) obj2 : null;
        if (uVar != null) {
            return uVar;
        }
        n0 n0VarB = b(obj2);
        return n0VarB != null ? n0VarB : c(obj2);
    }

    public static final n0 b(Object obj2) {
        n0 n0Var = obj2 instanceof n0 ? (n0) obj2 : null;
        if (n0Var != null) {
            return n0Var;
        }
        kotlin.jvm.internal.p pVar = obj2 instanceof kotlin.jvm.internal.p ? (kotlin.jvm.internal.p) obj2 : null;
        KCallable kCallableCompute = pVar != null ? pVar.compute() : null;
        if (kCallableCompute instanceof n0) {
            return (n0) kCallableCompute;
        }
        return null;
    }

    public static final u1 c(Object obj2) {
        u1 u1Var = obj2 instanceof u1 ? (u1) obj2 : null;
        if (u1Var != null) {
            return u1Var;
        }
        kotlin.jvm.internal.k0 k0Var = obj2 instanceof kotlin.jvm.internal.k0 ? (kotlin.jvm.internal.k0) obj2 : null;
        KCallable kCallableCompute = k0Var != null ? k0Var.compute() : null;
        if (kCallableCompute instanceof u1) {
            return (u1) kCallableCompute;
        }
        return null;
    }

    public static final List d(Annotated annotated) {
        Annotation annotationI;
        Intrinsics.checkNotNullParameter(annotated, "<this>");
        Annotations annotations = annotated.getAnnotations();
        ArrayList arrayList = new ArrayList();
        for (AnnotationDescriptor annotationDescriptor : annotations) {
            SourceElement source = annotationDescriptor.getSource();
            if (source instanceof ReflectAnnotationSource) {
                annotationI = ((ReflectAnnotationSource) source).getAnnotation();
            } else if (source instanceof RuntimeSourceElementFactory.RuntimeSourceElement) {
                ReflectJavaElement javaElement = ((RuntimeSourceElementFactory.RuntimeSourceElement) source).getJavaElement();
                ReflectJavaAnnotation reflectJavaAnnotation = javaElement instanceof ReflectJavaAnnotation ? (ReflectJavaAnnotation) javaElement : null;
                annotationI = reflectJavaAnnotation != null ? reflectJavaAnnotation.getAnnotation() : null;
            } else {
                annotationI = i(annotationDescriptor);
            }
            if (annotationI != null) {
                arrayList.add(annotationI);
            }
        }
        return l(arrayList);
    }

    public static final Object e(Type type) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (!(type instanceof Class)) {
            return null;
        }
        Class cls = (Class) type;
        if (!cls.isPrimitive()) {
            return null;
        }
        if (cls.equals(Boolean.TYPE)) {
            return Boolean.FALSE;
        }
        if (cls.equals(Character.TYPE)) {
            return (char) 0;
        }
        if (cls.equals(Byte.TYPE)) {
            return (byte) 0;
        }
        if (cls.equals(Short.TYPE)) {
            return (short) 0;
        }
        if (cls.equals(Integer.TYPE)) {
            return 0;
        }
        if (cls.equals(Float.TYPE)) {
            return Float.valueOf(BitmapDescriptorFactory.HUE_RED);
        }
        if (cls.equals(Long.TYPE)) {
            return 0L;
        }
        if (cls.equals(Double.TYPE)) {
            return Double.valueOf(0.0d);
        }
        if (cls.equals(Void.TYPE)) {
            throw new IllegalStateException("Parameter with void type is illegal");
        }
        throw new UnsupportedOperationException("Unknown primitive: " + type);
    }

    public static final CallableDescriptor f(Class moduleAnchor, GeneratedMessageLite.ExtendableMessage proto, NameResolver nameResolver, TypeTable typeTable, BinaryVersion metadataVersion, Function2 createDescriptor) {
        List<ProtoBuf.TypeParameter> typeParameterList;
        Intrinsics.checkNotNullParameter(moduleAnchor, "moduleAnchor");
        Intrinsics.checkNotNullParameter(proto, "proto");
        Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
        Intrinsics.checkNotNullParameter(typeTable, "typeTable");
        Intrinsics.checkNotNullParameter(metadataVersion, "metadataVersion");
        Intrinsics.checkNotNullParameter(createDescriptor, "createDescriptor");
        RuntimeModuleData runtimeModuleDataA = g2.a(moduleAnchor);
        if (proto instanceof ProtoBuf.Function) {
            typeParameterList = ((ProtoBuf.Function) proto).getTypeParameterList();
        } else {
            if (!(proto instanceof ProtoBuf.Property)) {
                throw new IllegalStateException(("Unsupported message: " + proto).toString());
            }
            typeParameterList = ((ProtoBuf.Property) proto).getTypeParameterList();
        }
        List<ProtoBuf.TypeParameter> list = typeParameterList;
        DeserializationComponents deserialization = runtimeModuleDataA.getDeserialization();
        ModuleDescriptor module = runtimeModuleDataA.getModule();
        VersionRequirementTable empty = VersionRequirementTable.Companion.getEMPTY();
        Intrinsics.h(list);
        return (CallableDescriptor) createDescriptor.invoke(new MemberDeserializer(new DeserializationContext(deserialization, nameResolver, module, typeTable, empty, metadataVersion, null, null, list)), proto);
    }

    public static final boolean g(c2 c2Var) {
        Intrinsics.checkNotNullParameter(c2Var, "<this>");
        wim.c f186441a = c2Var.getF186441a();
        e0 e0Var = f186441a instanceof e0 ? (e0) f186441a : null;
        if (e0Var == null || !e0Var.isValue()) {
            return false;
        }
        KmClass kmClassA = e0Var.A();
        return (kmClassA != null ? kmClassA.getInlineClassUnderlyingType() : null) == null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class h(ClassLoader classLoader, ClassId kotlinClassId, int i) {
        Intrinsics.checkNotNullParameter(classLoader, "<this>");
        Intrinsics.checkNotNullParameter(kotlinClassId, "kotlinClassId");
        ClassId classIdMapKotlinToJava = JavaToKotlinClassMap.INSTANCE.mapKotlinToJava(kotlinClassId.asSingleFqName().toUnsafe());
        if (classIdMapKotlinToJava == null) {
            classIdMapKotlinToJava = kotlinClassId;
        }
        if (!classIdMapKotlinToJava.equals(kotlinClassId)) {
            classLoader = ReflectClassUtilKt.getSafeClassLoader(Unit.class);
        }
        String strAsString = classIdMapKotlinToJava.getPackageFqName().asString();
        String strAsString2 = classIdMapKotlinToJava.getRelativeClassName().asString();
        if (Intrinsics.f(strAsString, "kotlin")) {
            switch (strAsString2.hashCode()) {
                case -901856463:
                    if (strAsString2.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (strAsString2.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (strAsString2.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (strAsString2.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (strAsString2.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (strAsString2.equals("Array")) {
                        return Object[].class;
                    }
                    break;
                case 601811914:
                    if (strAsString2.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (strAsString2.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (strAsString2.equals("LongArray")) {
                        return long[].class;
                    }
                    break;
            }
        }
        StringBuilder sb6 = new StringBuilder();
        if (i > 0) {
            for (int i2 = 0; i2 < i; i2++) {
                sb6.append("[");
            }
            sb6.append("L");
        }
        if (strAsString.length() > 0) {
            sb6.append(strAsString.concat("."));
        }
        sb6.append(kotlin.text.a0.E(strAsString2, CoreConstants.DOT, CoreConstants.DOLLAR));
        if (i > 0) {
            sb6.append(";");
        }
        return ReflectJavaClassFinderKt.tryLoadClass(classLoader, sb6.toString());
    }

    public static final Annotation i(AnnotationDescriptor annotationDescriptor) {
        ClassDescriptor annotationClass = DescriptorUtilsKt.getAnnotationClass(annotationDescriptor);
        Class clsJ = annotationClass != null ? j(annotationClass) : null;
        if (clsJ == null) {
            clsJ = null;
        }
        if (clsJ == null) {
            return null;
        }
        Set<Map.Entry<Name, ConstantValue<?>>> setEntrySet = annotationDescriptor.getAllValueArguments().entrySet();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it8 = setEntrySet.iterator();
        while (it8.hasNext()) {
            Map.Entry entry = (Map.Entry) it8.next();
            Name name = (Name) entry.getKey();
            ConstantValue constantValue = (ConstantValue) entry.getValue();
            ClassLoader classLoader = clsJ.getClassLoader();
            Intrinsics.checkNotNullExpressionValue(classLoader, "getClassLoader(...)");
            Object objK = k(constantValue, classLoader);
            Pair pair = objK != null ? new Pair(name.asString(), objK) : null;
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return (Annotation) kp0.w0.g(clsJ, zhm.r0.t(arrayList));
    }

    public static final Class j(ClassDescriptor classDescriptor) {
        Intrinsics.checkNotNullParameter(classDescriptor, "<this>");
        SourceElement source = classDescriptor.getSource();
        Intrinsics.checkNotNullExpressionValue(source, "getSource(...)");
        if (source instanceof KotlinJvmBinarySourceElement) {
            KotlinJvmBinaryClass binaryClass = ((KotlinJvmBinarySourceElement) source).getBinaryClass();
            Intrinsics.i(binaryClass, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.components.ReflectKotlinClass");
            return ((ReflectKotlinClass) binaryClass).getKlass();
        }
        if (source instanceof RuntimeSourceElementFactory.RuntimeSourceElement) {
            ReflectJavaElement javaElement = ((RuntimeSourceElementFactory.RuntimeSourceElement) source).getJavaElement();
            Intrinsics.i(javaElement, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.structure.ReflectJavaClass");
            return ((ReflectJavaClass) javaElement).getElement();
        }
        ClassId classId = DescriptorUtilsKt.getClassId(classDescriptor);
        if (classId == null) {
            return null;
        }
        return h(ReflectClassUtilKt.getSafeClassLoader(classDescriptor.getClass()), classId, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object k(ConstantValue constantValue, ClassLoader classLoader) {
        KotlinType type;
        Class clsH;
        if (constantValue instanceof AnnotationValue) {
            return i(((AnnotationValue) constantValue).getValue());
        }
        int i = 0;
        if (constantValue instanceof ArrayValue) {
            ArrayValue arrayValue = (ArrayValue) constantValue;
            TypedArrayValue typedArrayValue = arrayValue instanceof TypedArrayValue ? (TypedArrayValue) arrayValue : null;
            if (typedArrayValue != null && (type = typedArrayValue.getType()) != null) {
                List<? extends ConstantValue<?>> value = arrayValue.getValue();
                ArrayList arrayList = new ArrayList(zhm.w.t(value, 10));
                Iterator<T> it8 = value.iterator();
                while (it8.hasNext()) {
                    arrayList.add(k((ConstantValue) it8.next(), classLoader));
                }
                PrimitiveType primitiveArrayElementType = KotlinBuiltIns.getPrimitiveArrayElementType(type);
                switch (primitiveArrayElementType == null ? -1 : n2.f322674a[primitiveArrayElementType.ordinal()]) {
                    case -1:
                        if (!KotlinBuiltIns.isArray(type)) {
                            throw new IllegalStateException(("Not an array type: " + type).toString());
                        }
                        KotlinType type2 = ((TypeProjection) zhm.d0.K0(type.getArguments())).getType();
                        Intrinsics.checkNotNullExpressionValue(type2, "getType(...)");
                        ClassifierDescriptor classifierDescriptorMo3795getDeclarationDescriptor = type2.getConstructor().mo3795getDeclarationDescriptor();
                        ClassDescriptor classDescriptor = classifierDescriptorMo3795getDeclarationDescriptor instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo3795getDeclarationDescriptor : null;
                        if (classDescriptor == null) {
                            throw new IllegalStateException(("Not a class type: " + type2).toString());
                        }
                        if (KotlinBuiltIns.isString(type2)) {
                            int size = arrayValue.getValue().size();
                            String[] strArr = new String[size];
                            while (i < size) {
                                Object obj2 = arrayList.get(i);
                                Intrinsics.i(obj2, "null cannot be cast to non-null type kotlin.String");
                                strArr[i] = obj2;
                                i++;
                            }
                            return strArr;
                        }
                        if (KotlinBuiltIns.isKClass(classDescriptor)) {
                            int size2 = arrayValue.getValue().size();
                            Class[] clsArr = new Class[size2];
                            while (i < size2) {
                                Object obj3 = arrayList.get(i);
                                Intrinsics.i(obj3, "null cannot be cast to non-null type java.lang.Class<*>");
                                clsArr[i] = obj3;
                                i++;
                            }
                            return clsArr;
                        }
                        ClassId classId = DescriptorUtilsKt.getClassId(classDescriptor);
                        if (classId != null && (clsH = h(classLoader, classId, 0)) != null) {
                            Object objNewInstance = Array.newInstance((Class<?>) clsH, arrayValue.getValue().size());
                            Intrinsics.i(objNewInstance, "null cannot be cast to non-null type kotlin.Array<in kotlin.Any?>");
                            Object[] objArr = (Object[]) objNewInstance;
                            int size3 = arrayList.size();
                            while (i < size3) {
                                objArr[i] = arrayList.get(i);
                                i++;
                            }
                            return objArr;
                        }
                        break;
                    case 0:
                    default:
                        throw new NoWhenBranchMatchedException();
                    case 1:
                        int size4 = arrayValue.getValue().size();
                        boolean[] zArr = new boolean[size4];
                        while (i < size4) {
                            Object obj4 = arrayList.get(i);
                            Intrinsics.i(obj4, "null cannot be cast to non-null type kotlin.Boolean");
                            zArr[i] = ((Boolean) obj4).booleanValue();
                            i++;
                        }
                        return zArr;
                    case 2:
                        int size5 = arrayValue.getValue().size();
                        char[] cArr = new char[size5];
                        while (i < size5) {
                            Object obj5 = arrayList.get(i);
                            Intrinsics.i(obj5, "null cannot be cast to non-null type kotlin.Char");
                            cArr[i] = ((Character) obj5).charValue();
                            i++;
                        }
                        return cArr;
                    case 3:
                        int size6 = arrayValue.getValue().size();
                        byte[] bArr = new byte[size6];
                        while (i < size6) {
                            Object obj6 = arrayList.get(i);
                            Intrinsics.i(obj6, "null cannot be cast to non-null type kotlin.Byte");
                            bArr[i] = ((Byte) obj6).byteValue();
                            i++;
                        }
                        return bArr;
                    case 4:
                        int size7 = arrayValue.getValue().size();
                        short[] sArr = new short[size7];
                        while (i < size7) {
                            Object obj7 = arrayList.get(i);
                            Intrinsics.i(obj7, "null cannot be cast to non-null type kotlin.Short");
                            sArr[i] = ((Short) obj7).shortValue();
                            i++;
                        }
                        return sArr;
                    case 5:
                        int size8 = arrayValue.getValue().size();
                        int[] iArr = new int[size8];
                        while (i < size8) {
                            Object obj8 = arrayList.get(i);
                            Intrinsics.i(obj8, "null cannot be cast to non-null type kotlin.Int");
                            iArr[i] = ((Integer) obj8).intValue();
                            i++;
                        }
                        return iArr;
                    case 6:
                        int size9 = arrayValue.getValue().size();
                        float[] fArr = new float[size9];
                        while (i < size9) {
                            Object obj9 = arrayList.get(i);
                            Intrinsics.i(obj9, "null cannot be cast to non-null type kotlin.Float");
                            fArr[i] = ((Float) obj9).floatValue();
                            i++;
                        }
                        return fArr;
                    case 7:
                        int size10 = arrayValue.getValue().size();
                        long[] jArr = new long[size10];
                        while (i < size10) {
                            Object obj10 = arrayList.get(i);
                            Intrinsics.i(obj10, "null cannot be cast to non-null type kotlin.Long");
                            jArr[i] = ((Long) obj10).longValue();
                            i++;
                        }
                        return jArr;
                    case 8:
                        int size11 = arrayValue.getValue().size();
                        double[] dArr = new double[size11];
                        while (i < size11) {
                            Object obj11 = arrayList.get(i);
                            Intrinsics.i(obj11, "null cannot be cast to non-null type kotlin.Double");
                            dArr[i] = ((Double) obj11).doubleValue();
                            i++;
                        }
                        return dArr;
                }
            }
        } else if (constantValue instanceof EnumValue) {
            Pair<? extends ClassId, ? extends Name> value2 = ((EnumValue) constantValue).getValue();
            ClassId classId2 = (ClassId) value2.f186385a;
            Name name = (Name) value2.f186386b;
            Class clsH2 = h(classLoader, classId2, 0);
            if (clsH2 != null) {
                return hb9.b.m(clsH2, name.asString());
            }
        } else {
            if (!(constantValue instanceof KClassValue)) {
                if ((constantValue instanceof ErrorValue) || (constantValue instanceof NullValue)) {
                    return null;
                }
                return constantValue.getValue();
            }
            KClassValue.Value value3 = ((KClassValue) constantValue).getValue();
            if (value3 instanceof KClassValue.Value.NormalClass) {
                KClassValue.Value.NormalClass normalClass = (KClassValue.Value.NormalClass) value3;
                return h(classLoader, normalClass.getClassId(), normalClass.getArrayDimensions());
            }
            if (!(value3 instanceof KClassValue.Value.LocalClass)) {
                throw new NoWhenBranchMatchedException();
            }
            ClassifierDescriptor classifierDescriptorMo3795getDeclarationDescriptor2 = ((KClassValue.Value.LocalClass) value3).getType().getConstructor().mo3795getDeclarationDescriptor();
            ClassDescriptor classDescriptor2 = classifierDescriptorMo3795getDeclarationDescriptor2 instanceof ClassDescriptor ? (ClassDescriptor) classifierDescriptorMo3795getDeclarationDescriptor2 : null;
            if (classDescriptor2 != null) {
                return j(classDescriptor2);
            }
        }
        return null;
    }

    public static final List l(ArrayList arrayList) throws IllegalAccessException, InvocationTargetException {
        List listC;
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        if (!arrayList.isEmpty()) {
            Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                if (nim.a.o(nim.a.l((Annotation) it8.next())).getSimpleName().equals("Container")) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it9 = arrayList.iterator();
                    while (it9.hasNext()) {
                        Annotation annotation = (Annotation) it9.next();
                        Class clsO = nim.a.o(nim.a.l(annotation));
                        if (!clsO.getSimpleName().equals("Container") || clsO.getAnnotation(kotlin.jvm.internal.q0.class) == null) {
                            listC = zhm.u.c(annotation);
                        } else {
                            Object objInvoke = clsO.getDeclaredMethod("value", null).invoke(annotation, null);
                            Intrinsics.i(objInvoke, "null cannot be cast to non-null type kotlin.Array<out kotlin.Annotation>");
                            listC = zhm.p.c((Annotation[]) objInvoke);
                        }
                        zhm.a0.x(listC, arrayList2);
                    }
                    return arrayList2;
                }
            }
        }
        return arrayList;
    }
}
