package zim;

import ch.qos.logback.core.CoreConstants;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.jvm.internal.impl.builtins.CompanionObjectMapping;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.TypeParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.Java16SealedRecordLoader;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.km.Attributes;
import kotlin.reflect.jvm.internal.impl.km.ClassKind;
import kotlin.reflect.jvm.internal.impl.km.KmClass;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.utils.CollectionsKt;

/* JADX INFO: loaded from: classes14.dex */
public final class z implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f322728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0 f322729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e0 f322730c;

    public /* synthetic */ z(b0 b0Var, e0 e0Var, int i) {
        this.f322728a = i;
        this.f322729b = b0Var;
        this.f322730c = e0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v6, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [zhm.f0] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws IllegalAccessException, NoSuchFieldException, InvocationTargetException {
        Object arrayList;
        ArrayList arrayList2;
        Field declaredField;
        switch (this.f322728a) {
            case 0:
                Class<?> cls = this.f322730c.f322627b;
                ClassLoader safeClassLoader = ReflectClassUtilKt.getSafeClassLoader(cls);
                KmClass kmClass = (KmClass) this.f322729b.f322591c.getValue();
                ArrayList arrayList3 = null;
                if (kmClass != null) {
                    List<String> sealedSubclasses = kmClass.getSealedSubclasses();
                    arrayList = new ArrayList();
                    for (String name : sealedSubclasses) {
                        Intrinsics.checkNotNullParameter(safeClassLoader, "<this>");
                        Intrinsics.checkNotNullParameter(name, "name");
                        Class clsH = o2.h(safeClassLoader, g4i.a.t(name), 0);
                        KClass kClassR = clsH != null ? nim.a.r(clsH) : null;
                        if (kClassR != null) {
                            arrayList.add(kClassR);
                        }
                    }
                } else {
                    Java16SealedRecordLoader java16SealedRecordLoader = Java16SealedRecordLoader.INSTANCE;
                    if (Intrinsics.f(java16SealedRecordLoader.loadIsSealed(cls), Boolean.TRUE)) {
                        Class<?>[] clsArrLoadGetPermittedSubclasses = java16SealedRecordLoader.loadGetPermittedSubclasses(cls);
                        if (clsArrLoadGetPermittedSubclasses != null) {
                            arrayList3 = new ArrayList(clsArrLoadGetPermittedSubclasses.length);
                            for (Class<?> cls2 : clsArrLoadGetPermittedSubclasses) {
                                arrayList3.add(nim.a.r(cls2));
                            }
                        }
                        arrayList = arrayList3 == null ? zhm.f0.f322471a : arrayList3;
                    } else {
                        arrayList = zhm.f0.f322471a;
                    }
                }
                Intrinsics.i(arrayList, "null cannot be cast to non-null type kotlin.collections.List<kotlin.reflect.KClass<out T of kotlin.reflect.jvm.internal.KClassImpl>>");
                return arrayList;
            case 1:
                Class cls3 = this.f322730c.f322627b;
                KmClass kmClass2 = (KmClass) this.f322729b.f322591c.getValue();
                if (kmClass2 != null) {
                    ClassId classIdT = g4i.a.t(kmClass2.getName());
                    ClassLoader safeClassLoader2 = ReflectClassUtilKt.getSafeClassLoader(cls3);
                    List<String> nestedClasses = kmClass2.getNestedClasses();
                    arrayList2 = new ArrayList();
                    Iterator<T> it8 = nestedClasses.iterator();
                    while (it8.hasNext()) {
                        Name nameIdentifier = Name.identifier((String) it8.next());
                        Intrinsics.checkNotNullExpressionValue(nameIdentifier, "identifier(...)");
                        Class clsH2 = o2.h(safeClassLoader2, classIdT.createNestedClassId(nameIdentifier), 0);
                        KClass kClassR2 = clsH2 != null ? nim.a.r(clsH2) : null;
                        if (kClassR2 != null) {
                            arrayList2.add(kClassR2);
                        }
                    }
                } else {
                    Class<?>[] declaredClasses = cls3.getDeclaredClasses();
                    Intrinsics.checkNotNullExpressionValue(declaredClasses, "getDeclaredClasses(...)");
                    arrayList2 = new ArrayList();
                    for (Class<?> cls4 : declaredClasses) {
                        Intrinsics.h(cls4);
                        arrayList2.add(nim.a.r(cls4));
                    }
                }
                return arrayList2;
            case 2:
                Class cls5 = this.f322730c.f322627b;
                KmClass kmClass3 = (KmClass) this.f322729b.f322591c.getValue();
                if (kmClass3 == null) {
                    return null;
                }
                if (Attributes.getKind(kmClass3) != ClassKind.OBJECT && Attributes.getKind(kmClass3) != ClassKind.COMPANION_OBJECT) {
                    return null;
                }
                if (Attributes.getKind(kmClass3) != ClassKind.COMPANION_OBJECT || zhm.d0.T(CompanionObjectMapping.INSTANCE.getClassIds(), g4i.a.t(kmClass3.getName()).getOuterClassId())) {
                    declaredField = cls5.getDeclaredField("INSTANCE");
                } else {
                    Class<?> enclosingClass = cls5.getEnclosingClass();
                    String name2 = kmClass3.getName();
                    Intrinsics.checkNotNullParameter(name2, "<this>");
                    if (kotlin.text.a0.H(name2, ".", false)) {
                        throw new IllegalArgumentException("Local class is not supported: ".concat(name2).toString());
                    }
                    String strW0 = kotlin.text.d0.w0('/', name2, name2);
                    declaredField = enclosingClass.getDeclaredField(kotlin.text.d0.w0(CoreConstants.DOT, strW0, strW0));
                }
                Object obj2 = declaredField.get(null);
                Intrinsics.i(obj2, "null cannot be cast to non-null type T of kotlin.reflect.jvm.internal.KClassImpl");
                return obj2;
            case 3:
                List<TypeParameterDescriptor> declaredTypeParameters = this.f322729b.b().getDeclaredTypeParameters();
                Intrinsics.checkNotNullExpressionValue(declaredTypeParameters, "getDeclaredTypeParameters(...)");
                List<TypeParameterDescriptor> list = declaredTypeParameters;
                ArrayList arrayList4 = new ArrayList(zhm.w.t(list, 10));
                for (TypeParameterDescriptor typeParameterDescriptor : list) {
                    Intrinsics.h(typeParameterDescriptor);
                    arrayList4.add(new e2(this.f322730c, typeParameterDescriptor));
                }
                return arrayList4;
            default:
                b0 b0Var = this.f322729b;
                Collection<KotlinType> supertypes = b0Var.b().getTypeConstructor().getSupertypes();
                Intrinsics.checkNotNullExpressionValue(supertypes, "getSupertypes(...)");
                ArrayList arrayList5 = new ArrayList(supertypes.size());
                for (KotlinType kotlinType : supertypes) {
                    Intrinsics.h(kotlinType);
                    arrayList5.add(new c2(kotlinType, new ckm.c(kotlinType, 2, b0Var, this.f322730c)));
                }
                if (!KotlinBuiltIns.isSpecialClassWithNoSupertypes(b0Var.b())) {
                    if (arrayList5.isEmpty()) {
                        SimpleType anyType = DescriptorUtilsKt.getBuiltIns(b0Var.b()).getAnyType();
                        Intrinsics.checkNotNullExpressionValue(anyType, "getAnyType(...)");
                        arrayList5.add(new c2(anyType, a0.f322584a));
                    } else {
                        Iterator it9 = arrayList5.iterator();
                        while (it9.hasNext()) {
                            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind kind = DescriptorUtils.getClassDescriptorForType(((c2) it9.next()).f322615a).getKind();
                            Intrinsics.checkNotNullExpressionValue(kind, "getKind(...)");
                            if (kind == kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.INTERFACE || kind == kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ANNOTATION_CLASS) {
                            }
                        }
                        SimpleType anyType2 = DescriptorUtilsKt.getBuiltIns(b0Var.b()).getAnyType();
                        Intrinsics.checkNotNullExpressionValue(anyType2, "getAnyType(...)");
                        arrayList5.add(new c2(anyType2, a0.f322584a));
                    }
                }
                return CollectionsKt.compact(arrayList5);
        }
    }

    public z(e0 e0Var, b0 b0Var) {
        this.f322728a = 0;
        this.f322730c = e0Var;
        this.f322729b = b0Var;
    }
}
