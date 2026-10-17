package ydm;

import aem.z0;
import java.util.Map;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import zhm.y0;

/* JADX INFO: loaded from: classes23.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final oem.a f312720a;

    static {
        KType kTypeD;
        p0 p0Var = o0.f186429a;
        KClass kClassB = p0Var.b(Map.class);
        try {
            KTypeProjection.INSTANCE.getClass();
            kTypeD = p0Var.d(o0.d(KTypeProjection.Companion.a(o0.c(e.class, KTypeProjection.f186454c)), KTypeProjection.Companion.a(o0.b(Object.class))));
        } catch (Throwable unused) {
            kTypeD = null;
        }
        f312720a = new oem.a("EngineCapabilities", new tem.a(kClassB, kTypeD));
        y0.b(z0.f3801a);
    }
}
