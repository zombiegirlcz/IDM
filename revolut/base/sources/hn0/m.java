package hn0;

import java.time.Clock;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.reflect.KClass;
import lm0.o;
import lm0.p;
import rm0.e0;
import rm0.s;
import rm0.u;
import rm0.v;
import rm0.y;
import wim.z;

/* JADX INFO: loaded from: classes.dex */
public final class m implements od0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f154025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f154026b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rm0.h f154027c;
    public final e0 d;

    public m(ue0.c storage, v cryptoInteractor, rm0.h certificateManager, l guardedValueMapper, e0 securityFeatureToggles) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(cryptoInteractor, "cryptoInteractor");
        Intrinsics.checkNotNullParameter(certificateManager, "certificateManager");
        Intrinsics.checkNotNullParameter(guardedValueMapper, "guardedValueMapper");
        Intrinsics.checkNotNullParameter(securityFeatureToggles, "securityFeatureToggles");
        this.f154025a = storage;
        this.f154026b = cryptoInteractor;
        this.f154027c = certificateManager;
        this.d = securityFeatureToggles;
    }

    public static void e(String str) {
        String str2 = str + " When: " + Clock.systemUTC().instant() + " Thread: " + Thread.currentThread();
    }

    public final boolean a(KClass kClass) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        e("contains(" + kClass + ") started");
        boolean z = ((String) this.f154025a.T2(l.b(kClass), String.class)) != null;
        e("contains(" + kClass + ") ended with " + z);
        return z;
    }

    public final p b(KClass kClass, u uVar) {
        l.a(kClass);
        String value = ((y) this.f154026b).b(d.f154015a, uVar);
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(value, "value");
        p0 p0Var = o0.f186429a;
        if (kClass.equals(p0Var.b(lm0.a.class))) {
            return new lm0.a(value);
        }
        if (kClass.equals(p0Var.b(lm0.b.class))) {
            return new lm0.b(value);
        }
        if (kClass.equals(p0Var.b(lm0.c.class))) {
            return new lm0.c(value);
        }
        if (kClass.equals(p0Var.b(lm0.d.class))) {
            return new lm0.d(value);
        }
        if (kClass.equals(p0Var.b(lm0.e.class))) {
            return new lm0.e(value);
        }
        if (kClass.equals(p0Var.b(lm0.f.class))) {
            return new lm0.f(value);
        }
        if (kClass.equals(p0Var.b(lm0.g.class))) {
            return new lm0.g(value);
        }
        if (kClass.equals(p0Var.b(lm0.h.class))) {
            return new lm0.h(value);
        }
        if (kClass.equals(p0Var.b(lm0.i.class))) {
            return new lm0.i(value);
        }
        if (kClass.equals(p0Var.b(lm0.j.class))) {
            return new lm0.j(value);
        }
        if (kClass.equals(p0Var.b(lm0.k.class))) {
            return new lm0.k(value);
        }
        if (kClass.equals(p0Var.b(lm0.l.class))) {
            return new lm0.l(value);
        }
        if (kClass.equals(p0Var.b(lm0.m.class))) {
            return new lm0.m(value);
        }
        if (kClass.equals(p0Var.b(o.class))) {
            return new o(value);
        }
        if (kClass.equals(p0Var.b(lm0.k.class))) {
            return new lm0.k(value);
        }
        if (kClass.equals(p0Var.b(lm0.n.class))) {
            return new lm0.n(value);
        }
        throw new SecurityException(kClass + " could not be bound");
    }

    public final p c(KClass kClass) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        e("get(" + kClass + ") started");
        p pVarD = d(kClass);
        if (pVarD != null) {
            return pVarD;
        }
        SecurityException securityException = new SecurityException("Value " + kClass + " not found\nStorage has " + this.f154025a.keys() + " keys");
        StringBuilder sb6 = new StringBuilder("get(");
        sb6.append(kClass);
        sb6.append(") ended with ");
        sb6.append(securityException);
        e(sb6.toString());
        throw securityException;
    }

    @Override // od0.e
    public final void clear() {
        e("clear() started");
        this.f154025a.clear();
        ((rm0.b) this.f154027c).clear();
        e("clear() ended");
    }

    public final p d(KClass kClass) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        e("getOrNull(" + kClass + ") started");
        String str = (String) this.f154025a.T2(l.b(kClass), String.class);
        if (str == null) {
            e("getOrNull(" + kClass + ") ended with null");
            return null;
        }
        u.Companion.getClass();
        u uVarA = s.a(str);
        p pVarB = b(kClass, uVarA);
        if (uVarA.c() && this.d.b()) {
            h(pVarB);
        }
        e("getOrNull(" + kClass + ") ended with " + o0.f186429a.b(pVarB.getClass()).m());
        return pVarB;
    }

    public final void g(String id10, p value) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(value, "value");
        Class<?> cls = value.getClass();
        p0 p0Var = o0.f186429a;
        e("put(" + id10 + ", " + p0Var.b(cls).m() + ") started");
        l.a(p0Var.b(value.getClass()));
        u uVarA = v.a(this.f154026b, d.f154015a, value.a());
        this.f154025a.G(uVarA.b(), com.google.android.gms.internal.mlkit_vision_face.a.o(l.b(p0Var.b(value.getClass())), "_", id10), z.d(o0.b(String.class)));
        e("put(" + id10 + ", " + p0Var.b(value.getClass()).m() + ") ended");
    }

    public final void h(p value) {
        Intrinsics.checkNotNullParameter(value, "value");
        Class<?> cls = value.getClass();
        p0 p0Var = o0.f186429a;
        e("put(" + p0Var.b(cls).m() + ") started");
        l.a(p0Var.b(value.getClass()));
        u uVarA = v.a(this.f154026b, d.f154015a, value.a());
        this.f154025a.G(uVarA.b(), l.b(p0Var.b(value.getClass())), z.d(o0.b(String.class)));
        e("put(" + p0Var.b(value.getClass()).m() + ") ended");
    }

    public final void i(KClass kClass) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        e("remove(" + kClass + ") started");
        this.f154025a.I0(l.b(kClass));
        e("remove(" + kClass + ") ended");
    }
}
