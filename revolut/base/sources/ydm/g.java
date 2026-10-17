package ydm;

import kotlin.jvm.internal.o0;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import skm.b0;

/* JADX INFO: loaded from: classes23.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b0 f312721a = new b0("call-context");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final oem.a f312722b;

    static {
        KType kTypeC;
        KClass kClassB = o0.f186429a.b(vdm.e.class);
        try {
            KTypeProjection.INSTANCE.getClass();
            kTypeC = o0.c(vdm.e.class, KTypeProjection.f186454c);
        } catch (Throwable unused) {
            kTypeC = null;
        }
        f312722b = new oem.a("client-config", new tem.a(kClassB, kTypeC));
    }
}
