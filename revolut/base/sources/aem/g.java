package aem;

import kotlin.reflect.KClass;
import kotlin.reflect.KType;

/* JADX INFO: loaded from: classes23.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final oem.a f3719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final oem.a f3720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final bem.c f3721c;

    static {
        KType kTypeB;
        KClass kClassB = kotlin.jvm.internal.o0.f186429a.b(xdm.a.class);
        KType kTypeB2 = null;
        try {
            kTypeB = kotlin.jvm.internal.o0.b(xdm.a.class);
        } catch (Throwable unused) {
            kTypeB = null;
        }
        f3719a = new oem.a("UploadProgressListenerAttributeKey", new tem.a(kClassB, kTypeB));
        KClass kClassB2 = kotlin.jvm.internal.o0.f186429a.b(xdm.a.class);
        try {
            kTypeB2 = kotlin.jvm.internal.o0.b(xdm.a.class);
        } catch (Throwable unused2) {
        }
        f3720b = new oem.a("DownloadProgressListenerAttributeKey", new tem.a(kClassB2, kTypeB2));
        f3721c = a1m.e.n("BodyProgress", new d(0));
    }
}
