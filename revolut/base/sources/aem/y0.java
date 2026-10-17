package aem;

import java.util.ArrayList;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

/* JADX INFO: loaded from: classes23.dex */
public final class y0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f3798b = new b(8);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final oem.a f3799c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f3800a = new ArrayList();

    static {
        KType kTypeB;
        KClass kClassB = kotlin.jvm.internal.o0.f186429a.b(y0.class);
        try {
            kTypeB = kotlin.jvm.internal.o0.b(y0.class);
        } catch (Throwable unused) {
            kTypeB = null;
        }
        f3799c = new oem.a("HttpSend", new tem.a(kClassB, kTypeB));
    }
}
