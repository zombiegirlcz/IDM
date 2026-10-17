package aem;

import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import org.slf4j.Logger;

/* JADX INFO: loaded from: classes23.dex */
public abstract class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final oem.a f3790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final oem.a f3791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy f3792c;
    public static final bem.c d;

    static {
        KType kTypeB;
        KClass kClassB = kotlin.jvm.internal.o0.f186429a.b(Unit.class);
        KType kTypeB2 = null;
        try {
            kTypeB = kotlin.jvm.internal.o0.b(Unit.class);
        } catch (Throwable unused) {
            kTypeB = null;
        }
        f3790a = new oem.a("SkipSaveBody", new tem.a(kClassB, kTypeB));
        KClass kClassB2 = kotlin.jvm.internal.o0.f186429a.b(Unit.class);
        try {
            kTypeB2 = kotlin.jvm.internal.o0.b(Unit.class);
        } catch (Throwable unused2) {
        }
        f3791b = new oem.a("ResponseBodySaved", new tem.a(kClassB2, kTypeB2));
        f3792c = yhm.j.b(new v(0));
        d = a1m.e.n("SaveBody", new d(2));
        a1m.e.m("DoubleReceivePlugin", w.f, new d(3));
    }

    public static final Logger a() {
        return (Logger) f3792c.getValue();
    }

    public static final boolean b(hem.c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        oem.e attributes = cVar.a().getAttributes();
        attributes.getClass();
        oem.a key = f3791b;
        Intrinsics.checkNotNullParameter(key, "key");
        return attributes.c().containsKey(key);
    }
}
