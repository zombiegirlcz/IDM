package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import d9.t0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaType;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes14.dex */
public final class ReflectJavaRecordComponent extends ReflectJavaMember implements JavaRecordComponent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f186721a;

    public ReflectJavaRecordComponent(@NotNull Object recordComponent) {
        Intrinsics.checkNotNullParameter(recordComponent, "recordComponent");
        this.f186721a = recordComponent;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaMember
    @NotNull
    public Member getMember() throws IllegalAccessException, InvocationTargetException {
        Object recordComponent = this.f186721a;
        Intrinsics.checkNotNullParameter(recordComponent, "recordComponent");
        Java16RecordComponentsLoader$Cache java16RecordComponentsLoader$Cache = t0.f112318a;
        Method method = null;
        if (java16RecordComponentsLoader$Cache == null) {
            Class<?> cls = recordComponent.getClass();
            try {
                java16RecordComponentsLoader$Cache = new Java16RecordComponentsLoader$Cache(cls.getMethod("getType", null), cls.getMethod("getAccessor", null));
            } catch (NoSuchMethodException unused) {
                java16RecordComponentsLoader$Cache = new Java16RecordComponentsLoader$Cache(null, null);
            }
            t0.f112318a = java16RecordComponentsLoader$Cache;
        }
        Method getAccessor = java16RecordComponentsLoader$Cache.getGetAccessor();
        if (getAccessor != null) {
            Object objInvoke = getAccessor.invoke(recordComponent, null);
            Intrinsics.i(objInvoke, "null cannot be cast to non-null type java.lang.reflect.Method");
            method = (Method) objInvoke;
        }
        if (method != null) {
            return method;
        }
        throw new NoSuchMethodError("Can't find `getAccessor` method");
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent
    @NotNull
    public JavaType getType() throws IllegalAccessException, InvocationTargetException {
        Object recordComponent = this.f186721a;
        Intrinsics.checkNotNullParameter(recordComponent, "recordComponent");
        Java16RecordComponentsLoader$Cache java16RecordComponentsLoader$Cache = t0.f112318a;
        Class cls = null;
        if (java16RecordComponentsLoader$Cache == null) {
            Class<?> cls2 = recordComponent.getClass();
            try {
                java16RecordComponentsLoader$Cache = new Java16RecordComponentsLoader$Cache(cls2.getMethod("getType", null), cls2.getMethod("getAccessor", null));
            } catch (NoSuchMethodException unused) {
                java16RecordComponentsLoader$Cache = new Java16RecordComponentsLoader$Cache(null, null);
            }
            t0.f112318a = java16RecordComponentsLoader$Cache;
        }
        Method getType = java16RecordComponentsLoader$Cache.getGetType();
        if (getType != null) {
            Object objInvoke = getType.invoke(recordComponent, null);
            Intrinsics.i(objInvoke, "null cannot be cast to non-null type java.lang.Class<*>");
            cls = (Class) objInvoke;
        }
        if (cls != null) {
            return new ReflectJavaClassifierType(cls);
        }
        throw new NoSuchMethodError("Can't find `getType` method");
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaRecordComponent
    public boolean isVararg() {
        return false;
    }
}
