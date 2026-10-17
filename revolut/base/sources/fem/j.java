package fem;

import kotlin.jvm.internal.o0;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

/* JADX INFO: loaded from: classes23.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final oem.a f134675a;

    static {
        KType kTypeB;
        KClass kClassB = o0.f186429a.b(tem.a.class);
        try {
            kTypeB = o0.b(tem.a.class);
        } catch (Throwable unused) {
            kTypeB = null;
        }
        f134675a = new oem.a("BodyTypeAttributeKey", new tem.a(kClassB, kTypeB));
    }
}
