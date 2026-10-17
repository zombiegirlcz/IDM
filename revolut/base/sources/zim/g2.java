package zim;

import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.RuntimeModuleData;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;

/* JADX INFO: loaded from: classes13.dex */
public abstract class g2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f322637a = new ConcurrentHashMap();

    public static final RuntimeModuleData a(Class cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        ClassLoader safeClassLoader = ReflectClassUtilKt.getSafeClassLoader(cls);
        p2 p2Var = new p2(safeClassLoader);
        ConcurrentHashMap concurrentHashMap = f322637a;
        WeakReference weakReference = (WeakReference) concurrentHashMap.get(p2Var);
        if (weakReference != null) {
            RuntimeModuleData runtimeModuleData = (RuntimeModuleData) weakReference.get();
            if (runtimeModuleData != null) {
                return runtimeModuleData;
            }
            concurrentHashMap.remove(p2Var, weakReference);
        }
        RuntimeModuleData runtimeModuleDataCreate = RuntimeModuleData.Companion.create(safeClassLoader);
        while (true) {
            WeakReference weakReference2 = (WeakReference) concurrentHashMap.putIfAbsent(p2Var, new WeakReference(runtimeModuleDataCreate));
            if (weakReference2 == null) {
                return runtimeModuleDataCreate;
            }
            RuntimeModuleData runtimeModuleData2 = (RuntimeModuleData) weakReference2.get();
            if (runtimeModuleData2 != null) {
                return runtimeModuleData2;
            }
            concurrentHashMap.remove(p2Var, weakReference2);
        }
    }
}
