package zim;

import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.PropertyDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.renderer.DescriptorRenderer;
import kotlin.reflect.jvm.internal.impl.renderer.RenderingUtilsKt;

/* JADX INFO: loaded from: classes14.dex */
public final class c implements Function1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f322603b = new c(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f322604c = new c(1);
    public static final c d = new c(2);
    public static final c e = new c(3);
    public static final c f = new c(4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f322605g = new c(5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final c f322606h = new c(6);
    public static final c i = new c(7);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final c f322607j = new c(8);
    public static final c k = new c(9);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final c f322608l = new c(10);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final c f322609m = new c(11);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final c f322610n = new c(12);
    public static final c o = new c(13);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f322611a;

    public /* synthetic */ c(int i2) {
        this.f322611a = i2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f322611a) {
            case 0:
                Class it8 = (Class) obj2;
                e eVar = d.f322618a;
                Intrinsics.checkNotNullParameter(it8, "it");
                return new e0(it8);
            case 1:
                Class it9 = (Class) obj2;
                e eVar2 = d.f322618a;
                Intrinsics.checkNotNullParameter(it9, "it");
                return new a1(it9);
            case 2:
                Class it10 = (Class) obj2;
                e eVar3 = d.f322618a;
                Intrinsics.checkNotNullParameter(it10, "it");
                e0 e0VarA = d.a(it10);
                zhm.f0 f0Var = zhm.f0.f322471a;
                return xim.b.a(e0VarA, f0Var, false, f0Var);
            case 3:
                Class it11 = (Class) obj2;
                e eVar4 = d.f322618a;
                Intrinsics.checkNotNullParameter(it11, "it");
                e0 e0VarA2 = d.a(it11);
                zhm.f0 f0Var2 = zhm.f0.f322471a;
                return xim.b.a(e0VarA2, f0Var2, true, f0Var2);
            case 4:
                e eVar5 = d.f322618a;
                Intrinsics.checkNotNullParameter((Class) obj2, "it");
                return new ConcurrentHashMap();
            case 5:
                Class<?> returnType = ((Method) obj2).getReturnType();
                Intrinsics.checkNotNullExpressionValue(returnType, "getReturnType(...)");
                return ReflectClassUtilKt.getDesc(returnType);
            case 6:
                Class cls = (Class) obj2;
                Intrinsics.h(cls);
                return ReflectClassUtilKt.getDesc(cls);
            case 7:
                PropertyDescriptor descriptor = (PropertyDescriptor) obj2;
                g0 g0Var = l0.Companion;
                Intrinsics.checkNotNullParameter(descriptor, "descriptor");
                return DescriptorRenderer.DEBUG_TEXT.render(descriptor) + " | " + m2.b(descriptor).b();
            case 8:
                FunctionDescriptor descriptor2 = (FunctionDescriptor) obj2;
                g0 g0Var2 = l0.Companion;
                Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
                return DescriptorRenderer.DEBUG_TEXT.render(descriptor2) + " | " + m2.c(descriptor2).b();
            case 9:
                wim.m parameter = (wim.m) obj2;
                Intrinsics.checkNotNullParameter(parameter, "parameter");
                StringBuilder sb6 = new StringBuilder();
                d1 d1Var = (d1) parameter;
                String name = d1Var.getName();
                if (name == null) {
                    name = "_";
                }
                sb6.append(name);
                sb6.append(": ");
                sb6.append(d1Var.d());
                return sb6.toString();
            case 10:
                wim.m it12 = (wim.m) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                return l2.g(((d1) it12).d());
            case 11:
                wim.m it13 = (wim.m) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                return l2.g(((d1) it13).d());
            case 12:
                Name it14 = (Name) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                return RenderingUtilsKt.render(it14);
            default:
                Class cls2 = (Class) obj2;
                Intrinsics.h(cls2);
                return ReflectClassUtilKt.getDesc(cls2);
        }
    }
}
