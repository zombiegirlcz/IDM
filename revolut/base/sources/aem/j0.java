package aem;

import kotlin.reflect.KClass;
import kotlin.reflect.KType;

/* JADX INFO: loaded from: classes23.dex */
public abstract class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final oem.a f3736a;

    static {
        KType kTypeB;
        KClass kClassB = kotlin.jvm.internal.o0.f186429a.b(oem.e.class);
        try {
            kTypeB = kotlin.jvm.internal.o0.b(oem.e.class);
        } catch (Throwable unused) {
            kTypeB = null;
        }
        f3736a = new oem.a("ApplicationPluginRegistry", new tem.a(kClassB, kTypeB));
    }
}
