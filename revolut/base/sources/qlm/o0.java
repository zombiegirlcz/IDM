package qlm;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

/* JADX INFO: loaded from: classes14.dex */
public final class o0 implements KType {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KType f247686a;

    public o0(KType origin) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        this.f247686a = origin;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == null) {
            return false;
        }
        o0 o0Var = obj2 instanceof o0 ? (o0) obj2 : null;
        KType kType = o0Var != null ? o0Var.f247686a : null;
        KType kType2 = this.f247686a;
        if (!Intrinsics.f(kType2, kType)) {
            return false;
        }
        wim.c f186441a = kType2.getF186441a();
        if (f186441a instanceof KClass) {
            KType kType3 = obj2 instanceof KType ? (KType) obj2 : null;
            wim.c f186441a2 = kType3 != null ? kType3.getF186441a() : null;
            if (f186441a2 != null && (f186441a2 instanceof KClass)) {
                return nim.a.o((KClass) f186441a).equals(nim.a.o((KClass) f186441a2));
            }
        }
        return false;
    }

    @Override // wim.b
    public final List getAnnotations() {
        return this.f247686a.getAnnotations();
    }

    @Override // kotlin.reflect.KType
    /* JADX INFO: renamed from: getArguments */
    public final List getF186442b() {
        return this.f247686a.getF186442b();
    }

    @Override // kotlin.reflect.KType
    /* JADX INFO: renamed from: getClassifier */
    public final wim.c getF186441a() {
        return this.f247686a.getF186441a();
    }

    @Override // kotlin.reflect.KType
    public final boolean h() {
        return this.f247686a.h();
    }

    public final int hashCode() {
        return this.f247686a.hashCode();
    }

    public final String toString() {
        return "KTypeWrapper: " + this.f247686a;
    }
}
