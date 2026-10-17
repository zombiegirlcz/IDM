package ajm;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ParameterDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutionKt;
import zim.l0;
import zim.o2;

/* JADX INFO: loaded from: classes14.dex */
public final class e0 implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Method f5607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f5608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f5609c;
    public final ArrayList d;
    public final ArrayList e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.util.ArrayList] */
    public e0(FunctionDescriptor descriptor, l0 container, String constructorDesc, List originalParameters) {
        ?? C;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(constructorDesc, "constructorDesc");
        Intrinsics.checkNotNullParameter(originalParameters, "originalParameters");
        Method methodD = container.d("constructor-impl", constructorDesc);
        Intrinsics.h(methodD);
        this.f5607a = methodD;
        Method methodD2 = container.d("box-impl", kotlin.text.d0.g0(constructorDesc, "V") + ReflectClassUtilKt.getDesc(container.getF186423a()));
        Intrinsics.h(methodD2);
        this.f5608b = methodD2;
        List list = originalParameters;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        while (true) {
            List listC = null;
            if (!it8.hasNext()) {
                break;
            }
            KotlinType type = ((ParameterDescriptor) it8.next()).getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            SimpleType simpleTypeAsSimpleType = TypeSubstitutionKt.asSimpleType(type);
            ArrayList arrayListK = l9.l.k(simpleTypeAsSimpleType);
            if (arrayListK == null) {
                Class clsE = l9.l.E(simpleTypeAsSimpleType);
                if (clsE != null) {
                    listC = zhm.u.c(l9.l.j(clsE, descriptor));
                }
            } else {
                listC = arrayListK;
            }
            arrayList.add(listC);
        }
        this.f5609c = arrayList;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(list, 10));
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                zhm.v.s();
                throw null;
            }
            ClassifierDescriptor classifierDescriptorMo3795getDeclarationDescriptor = ((ParameterDescriptor) obj2).getType().getConstructor().mo3795getDeclarationDescriptor();
            Intrinsics.i(classifierDescriptorMo3795getDeclarationDescriptor, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            ClassDescriptor classDescriptor = (ClassDescriptor) classifierDescriptorMo3795getDeclarationDescriptor;
            List list2 = (List) this.f5609c.get(i);
            if (list2 != null) {
                List list3 = list2;
                C = new ArrayList(zhm.w.t(list3, 10));
                Iterator it9 = list3.iterator();
                while (it9.hasNext()) {
                    C.add(((Method) it9.next()).getReturnType());
                }
            } else {
                Class clsJ = o2.j(classDescriptor);
                Intrinsics.h(clsJ);
                C = zhm.u.c(clsJ);
            }
            arrayList2.add(C);
            i = i2;
        }
        this.d = arrayList2;
        this.e = zhm.w.u(arrayList2);
    }

    @Override // ajm.i
    public final /* bridge */ /* synthetic */ Member b() {
        return null;
    }

    @Override // ajm.i
    public final /* bridge */ boolean c() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.util.ArrayList] */
    @Override // ajm.i
    public final Object call(Object[] args) throws IllegalAccessException, InvocationTargetException {
        ?? C;
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(args, "<this>");
        ArrayList other = this.f5609c;
        Intrinsics.checkNotNullParameter(other, "other");
        int length = args.length;
        ArrayList<Pair> arrayList = new ArrayList(Math.min(zhm.w.t(other, 10), length));
        int i = 0;
        for (Object obj2 : other) {
            if (i >= length) {
                break;
            }
            arrayList.add(new Pair(args[i], obj2));
            i++;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Pair pair : arrayList) {
            Object obj3 = pair.f186385a;
            List list = (List) pair.f186386b;
            if (list != null) {
                List list2 = list;
                C = new ArrayList(zhm.w.t(list2, 10));
                Iterator it8 = list2.iterator();
                while (it8.hasNext()) {
                    C.add(((Method) it8.next()).invoke(obj3, null));
                }
            } else {
                C = zhm.u.c(obj3);
            }
            zhm.a0.x((Iterable) C, arrayList2);
        }
        Object[] array = arrayList2.toArray(new Object[0]);
        this.f5607a.invoke(null, Arrays.copyOf(array, array.length));
        return this.f5608b.invoke(null, Arrays.copyOf(array, array.length));
    }

    @Override // ajm.i
    public final List d() {
        return this.e;
    }

    @Override // ajm.i
    public final Type getReturnType() {
        Class<?> returnType = this.f5608b.getReturnType();
        Intrinsics.checkNotNullExpressionValue(returnType, "getReturnType(...)");
        return returnType;
    }
}
