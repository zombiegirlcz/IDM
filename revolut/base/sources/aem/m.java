package aem;

import kotlin.Unit;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes23.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final oem.a f3746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f3747b;

    static {
        KType kTypeB;
        KClass kClassB = kotlin.jvm.internal.o0.f186429a.b(Unit.class);
        try {
            kTypeB = kotlin.jvm.internal.o0.b(Unit.class);
        } catch (Throwable unused) {
            kTypeB = null;
        }
        f3746a = new oem.a("ValidateMark", new tem.a(kClassB, kTypeB));
        f3747b = a1m.e.a("io.ktor.client.plugins.DefaultResponseValidation");
    }
}
