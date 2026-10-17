package aem;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

/* JADX INFO: loaded from: classes23.dex */
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f3731b = new b(6);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final oem.a f3732c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f3733a;

    static {
        KType kTypeB;
        KClass kClassB = kotlin.jvm.internal.o0.f186429a.b(i.class);
        try {
            kTypeB = kotlin.jvm.internal.o0.b(i.class);
        } catch (Throwable unused) {
            kTypeB = null;
        }
        f3732c = new oem.a("DefaultRequest", new tem.a(kClassB, kTypeB));
    }

    public i(Function1 function1) {
        this.f3733a = function1;
    }
}
