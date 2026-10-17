package com.bumptech.glide;

import android.content.Context;
import android.content.SharedPreferences;
import com.bumptech.glide.integration.okhttp3.OkHttpGlideModule;
import java.io.Closeable;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.serialization.encoding.Encoder;
import qlm.j1;
import retrofit2.Invocation;
import skm.e0;
import skm.u;
import skm.x;
import ukm.g0;
import zhm.d0;
import zkm.s;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26077a = 7;

    public static void A(AtomicLong atomicLong, long j2) {
        long j3;
        long j5;
        do {
            j3 = atomicLong.get();
            if (j3 == Long.MAX_VALUE) {
                return;
            }
            j5 = j3 - j2;
            if (j5 < 0) {
                mo3.a.m(new IllegalStateException(p.a.m(j5, "More produced than requested: ")));
                j5 = 0;
            }
        } while (!atomicLong.compareAndSet(j3, j5));
    }

    public static final Object B(s sVar, boolean z, s sVar2, Function2 function2) {
        Object uVar;
        Object objV;
        try {
            if (function2 instanceof gim.a) {
                u0.f(2, function2);
                uVar = function2.invoke(sVar2, sVar);
            } else {
                uVar = fim.h.c(function2, sVar2, sVar);
            }
        } catch (DispatchException e) {
            sVar.U(new u(e.getF187929a(), false));
            throw e.getF187929a();
        } catch (Throwable th10) {
            uVar = new u(th10, false);
        }
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (uVar == aVar || (objV = sVar.V(uVar)) == e0.e) {
            return aVar;
        }
        sVar.k0();
        if (!(objV instanceof u)) {
            return e0.I(objV);
        }
        if (!z) {
            Throwable th11 = ((u) objV).f264012a;
            if ((th11 instanceof TimeoutCancellationException) && ((TimeoutCancellationException) th11).f187931a == sVar) {
                if (uVar instanceof u) {
                    throw ((u) uVar).f264012a;
                }
                return uVar;
            }
        }
        throw ((u) objV).f264012a;
    }

    public static void C(Class cls, ReflectiveOperationException reflectiveOperationException) {
        throw new RuntimeException(a0.d.l(cls, "Unable to instantiate GlideModule implementation for "), reflectiveOperationException);
    }

    public static long a(AtomicLong atomicLong, long j2) {
        long j3;
        do {
            j3 = atomicLong.get();
            if (j3 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        } while (!atomicLong.compareAndSet(j3, b(j3, j2)));
        return j3;
    }

    public static long b(long j2, long j3) {
        long j5 = j2 + j3;
        if (j5 < 0) {
            return Long.MAX_VALUE;
        }
        return j5;
    }

    public static final wi0.b c(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        wi0.b.Companion.getClass();
        return wi0.a.a(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(kotlinx.coroutines.channels.ProducerScope r4, kotlin.jvm.functions.Function0 r5, kotlin.coroutines.Continuation r6) {
        /*
            boolean r0 = r6 instanceof ukm.f0
            if (r0 == 0) goto L13
            r0 = r6
            ukm.f0 r0 = (ukm.f0) r0
            int r1 = r0.f280809x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f280809x = r1
            goto L18
        L13:
            ukm.f0 r0 = new ukm.f0
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f280808w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f280809x
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            kotlin.jvm.functions.Function0 r4 = r0.v
            r5 = r4
            kotlin.jvm.functions.Function0 r5 = (kotlin.jvm.functions.Function0) r5
            yhm.o.b(r6)     // Catch: java.lang.Throwable -> L2c
            goto L71
        L2c:
            r4 = move-exception
            goto L77
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L36:
            yhm.o.b(r6)
            kotlin.coroutines.CoroutineContext r6 = r0.getContext()
            skm.g1 r2 = skm.g1.f263979a
            kotlin.coroutines.CoroutineContext$Element r6 = r6.get(r2)
            if (r6 != r4) goto L7b
            r0.u = r4     // Catch: java.lang.Throwable -> L2c
            r6 = r5
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6     // Catch: java.lang.Throwable -> L2c
            r0.v = r6     // Catch: java.lang.Throwable -> L2c
            r0.f280809x = r3     // Catch: java.lang.Throwable -> L2c
            skm.l r6 = new skm.l     // Catch: java.lang.Throwable -> L2c
            kotlin.coroutines.Continuation r2 = fim.h.b(r0)     // Catch: java.lang.Throwable -> L2c
            r6.<init>(r3, r2)     // Catch: java.lang.Throwable -> L2c
            r6.u()     // Catch: java.lang.Throwable -> L2c
            ei0.f r2 = new ei0.f     // Catch: java.lang.Throwable -> L2c
            r3 = 1
            r2.<init>(r6, r3)     // Catch: java.lang.Throwable -> L2c
            r4.invokeOnClose(r2)     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r4 = r6.t()     // Catch: java.lang.Throwable -> L2c
            if (r4 != r1) goto L6e
            java.lang.String r6 = "frame"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r6)     // Catch: java.lang.Throwable -> L2c
        L6e:
            if (r4 != r1) goto L71
            return r1
        L71:
            r5.invoke()
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        L77:
            r5.invoke()
            throw r4
        L7b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "awaitClose() can only be invoked from the producer context"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.d.d(kotlinx.coroutines.channels.ProducerScope, kotlin.jvm.functions.Function0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void e(Closeable closeable, Throwable th10) {
        if (closeable != null) {
            if (th10 == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th11) {
                yhm.f.a(th10, th11);
            }
        }
    }

    public static final mlm.b f(qlm.b bVar, plm.d decoder, String str) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        mlm.b bVarA = bVar.a(decoder, str);
        if (bVarA != null) {
            return bVarA;
        }
        j1.g(str, bVar.c());
        throw null;
    }

    public static final mlm.h g(qlm.b bVar, Encoder encoder, Object value) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        mlm.h hVarB = bVar.b(encoder, value);
        if (hVarB != null) {
            return hVarB;
        }
        j1.h(o0.f186429a.b(value.getClass()), bVar.c());
        throw null;
    }

    public static final Annotation h(ulm.j1 j1Var, Class annotationClass) {
        Method method;
        Intrinsics.checkNotNullParameter(j1Var, "<this>");
        Intrinsics.checkNotNullParameter(annotationClass, "annotationClass");
        Invocation invocation = (Invocation) j1Var.c(Invocation.class);
        if (invocation == null || (method = invocation.method()) == null) {
            return null;
        }
        return method.getAnnotation(annotationClass);
    }

    public static hh.a i() {
        hh.e eVar = (hh.e) ch.h.c().a(hh.e.class);
        eVar.getClass();
        return eVar.a(hh.a.f152194g);
    }

    public static SharedPreferences j(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    public static final boolean k(wi0.b bVar) {
        wi0.b.Companion.getClass();
        return Intrinsics.f(bVar, wi0.b.f297734c);
    }

    public static final boolean l(wi0.b bVar) {
        wi0.b.Companion.getClass();
        return Intrinsics.f(bVar, wi0.b.f297756l);
    }

    public static final boolean m(ulm.j1 j1Var, Class annotationClass) {
        Intrinsics.checkNotNullParameter(j1Var, "<this>");
        Intrinsics.checkNotNullParameter(annotationClass, "annotationClass");
        return h(j1Var, annotationClass) != null;
    }

    public static final boolean n(wi0.b bVar) {
        wi0.b.Companion.getClass();
        return Intrinsics.f(bVar, wi0.b.A);
    }

    public static final boolean o(wi0.b bVar) {
        wi0.b.Companion.getClass();
        return Intrinsics.f(bVar, wi0.b.O);
    }

    public static final boolean p(wi0.b bVar) {
        wi0.b.Companion.getClass();
        return d0.T((Set) wi0.b.H3.getValue(), bVar);
    }

    public static final boolean q(wi0.b bVar) {
        wi0.b.Companion.getClass();
        return Intrinsics.f(bVar, wi0.b.p0);
    }

    public static final boolean r(wi0.b bVar) {
        wi0.b.Companion.getClass();
        return Intrinsics.f(bVar, wi0.b.M0);
    }

    public static final boolean s(wi0.b bVar) {
        wi0.b.Companion.getClass();
        return Intrinsics.f(bVar, wi0.b.O0);
    }

    public static final boolean t(wi0.b bVar) {
        wi0.b.Companion.getClass();
        return Intrinsics.f(bVar, wi0.b.X0);
    }

    public static final boolean u(wi0.b bVar) {
        wi0.b.Companion.getClass();
        return Intrinsics.f(bVar, wi0.b.Y1);
    }

    public static final boolean v(wi0.b bVar) {
        wi0.b.Companion.getClass();
        return Intrinsics.f(bVar, wi0.b.J2);
    }

    public static final boolean w(wi0.b bVar) {
        wi0.b.Companion.getClass();
        return Intrinsics.f(bVar, wi0.b.n3);
    }

    public static final boolean x(wi0.b bVar) {
        wi0.b.Companion.getClass();
        return Intrinsics.f(bVar, wi0.b.f297770q3);
    }

    public static OkHttpGlideModule y(String str) {
        try {
            Class<?> cls = Class.forName(str);
            try {
                Object objNewInstance = cls.getDeclaredConstructor(null).newInstance(null);
                if (objNewInstance instanceof OkHttpGlideModule) {
                    return (OkHttpGlideModule) objNewInstance;
                }
                throw new RuntimeException(a0.d.m(objNewInstance, "Expected instanceof GlideModule, but found: "));
            } catch (IllegalAccessException e) {
                C(cls, e);
                throw null;
            } catch (InstantiationException e2) {
                C(cls, e2);
                throw null;
            } catch (NoSuchMethodException e4) {
                C(cls, e4);
                throw null;
            } catch (InvocationTargetException e5) {
                C(cls, e5);
                throw null;
            }
        } catch (ClassNotFoundException e6) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e6);
        }
    }

    public static g0 z(CoroutineScope coroutineScope, int i, Function2 function2, int i2) {
        kotlin.coroutines.g gVar = kotlin.coroutines.g.f186406a;
        if ((i2 & 2) != 0) {
            i = 0;
        }
        ukm.f fVar = ukm.f.SUSPEND;
        skm.d0 d0Var = skm.d0.DEFAULT;
        g0 g0Var = new g0(x.b(coroutineScope, gVar), vc.s.a(i, fVar, null, 4), true, true);
        g0Var.j0(d0Var, g0Var, function2);
        return g0Var;
    }

    public int hashCode() {
        switch (this.f26077a) {
            case 7:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public String toString() {
        switch (this.f26077a) {
            case 7:
                String strM = o0.f186429a.b(getClass()).m();
                Intrinsics.h(strM);
                return strM;
            default:
                return super.toString();
        }
    }
}
