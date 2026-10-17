package fem;

import kotlin.jvm.internal.o0;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

/* JADX INFO: loaded from: classes23.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final oem.a f134664a;

    static {
        KType kTypeB;
        KClass kClassB = o0.f186429a.b(k.class);
        try {
            kTypeB = o0.b(k.class);
        } catch (Throwable unused) {
            kTypeB = null;
        }
        f134664a = new oem.a("ResponseAdapterAttributeKey", new tem.a(kClassB, kTypeB));
    }
}
