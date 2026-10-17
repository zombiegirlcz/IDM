package ajm;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;

/* JADX INFO: loaded from: classes14.dex */
public final class c implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f5594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f5595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f5596c;
    public final List d;
    public final ArrayList e;
    public final ArrayList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f5597g;

    public c(Class jClass, ArrayList parameterNames, a callMode, b origin, List methods) {
        Intrinsics.checkNotNullParameter(jClass, "jClass");
        Intrinsics.checkNotNullParameter(parameterNames, "parameterNames");
        Intrinsics.checkNotNullParameter(callMode, "callMode");
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(methods, "methods");
        this.f5594a = jClass;
        this.f5595b = parameterNames;
        this.f5596c = callMode;
        this.d = methods;
        List list = methods;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(((Method) it8.next()).getGenericReturnType());
        }
        this.e = arrayList;
        List list2 = this.d;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
        Iterator it9 = list2.iterator();
        while (it9.hasNext()) {
            Class<?> returnType = ((Method) it9.next()).getReturnType();
            Intrinsics.h(returnType);
            Class<?> wrapperByPrimitive = ReflectClassUtilKt.getWrapperByPrimitive(returnType);
            if (wrapperByPrimitive != null) {
                returnType = wrapperByPrimitive;
            }
            arrayList2.add(returnType);
        }
        this.f = arrayList2;
        List list3 = this.d;
        ArrayList arrayList3 = new ArrayList(zhm.w.t(list3, 10));
        Iterator it10 = list3.iterator();
        while (it10.hasNext()) {
            arrayList3.add(((Method) it10.next()).getDefaultValue());
        }
        this.f5597g = arrayList3;
        if (this.f5596c == a.POSITIONAL_CALL && origin == b.JAVA && !zhm.d0.A0(this.f5595b, "value").isEmpty()) {
            throw new UnsupportedOperationException("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
        }
    }

    @Override // ajm.i
    public final /* bridge */ /* synthetic */ Member b() {
        return null;
    }

    @Override // ajm.i
    public final /* bridge */ boolean c() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    @Override // ajm.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object call(java.lang.Object[] r18) {
        /*
            Method dump skipped, instruction units count: 361
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ajm.c.call(java.lang.Object[]):java.lang.Object");
    }

    @Override // ajm.i
    public final List d() {
        return this.e;
    }

    @Override // ajm.i
    public final Type getReturnType() {
        return this.f5594a;
    }

    public /* synthetic */ c(Class cls, ArrayList arrayList, a aVar, b bVar) {
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(cls.getDeclaredMethod((String) it8.next(), null));
        }
        this(cls, arrayList, aVar, bVar, arrayList2);
    }
}
