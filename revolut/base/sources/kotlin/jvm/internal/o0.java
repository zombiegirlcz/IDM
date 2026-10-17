package kotlin.jvm.internal;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import zim.i2;

/* JADX INFO: loaded from: classes13.dex */
public class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p0 f186429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final KClass[] f186430b;

    static {
        p0 p0Var = null;
        try {
            p0Var = (p0) i2.class.newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (p0Var == null) {
            p0Var = new p0();
        }
        f186429a = p0Var;
        f186430b = new KClass[0];
    }

    public static KType a(Class cls) {
        p0 p0Var = f186429a;
        return p0Var.o(p0Var.b(cls), Collections.EMPTY_LIST, true);
    }

    public static KType b(Class cls) {
        p0 p0Var = f186429a;
        return p0Var.o(p0Var.b(cls), Collections.EMPTY_LIST, false);
    }

    public static KType c(Class cls, KTypeProjection kTypeProjection) {
        p0 p0Var = f186429a;
        return p0Var.o(p0Var.b(cls), Collections.singletonList(kTypeProjection), false);
    }

    public static KType d(KTypeProjection kTypeProjection, KTypeProjection kTypeProjection2) {
        p0 p0Var = f186429a;
        return p0Var.o(p0Var.b(Map.class), Arrays.asList(kTypeProjection, kTypeProjection2), false);
    }
}
