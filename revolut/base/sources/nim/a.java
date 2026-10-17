package nim;

import android.content.Intent;
import android.util.Log;
import clm.b;
import clm.e;
import cxe.u;
import efm.d0;
import efm.f;
import efm.h0;
import efm.k;
import efm.n;
import efm.w;
import fim.h;
import java.lang.annotation.Annotation;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KClass;
import kotlinx.coroutines.flow.Flow;
import mp.r;
import pd.g;
import rd0.c;
import skm.l;
import u70.d;
import ufm.i;
import v1.m;
import v3e.s;

/* JADX INFO: loaded from: classes13.dex */
public abstract class a {
    public static final u A(Flow flow, Function1 block) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        return new u(flow, block, 4);
    }

    public static final boolean B(String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        return (Intrinsics.f(method, "GET") || Intrinsics.f(method, "HEAD")) ? false : true;
    }

    public static final void C(Continuation frame) {
        Intrinsics.checkNotNullParameter(frame, "frame");
    }

    public static final Pair D(Object obj2, Object obj3) {
        return new Pair(obj2, obj3);
    }

    public static final int E(c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<this>");
        switch (d.f277710a[cVar.ordinal()]) {
            case 1:
                return 3;
            case 2:
                return 2;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
            case 6:
                return 6;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void F(android.content.Intent r5, java.util.Map r6) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 0
            if (r6 == 0) goto L46
            java.util.Set r6 = r6.entrySet()
            if (r6 == 0) goto L46
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = zhm.w.t(r6, r2)
            r1.<init>(r2)
            java.util.Iterator r6 = r6.iterator()
        L1f:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L3c
            java.lang.Object r2 = r6.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Object r2 = r2.getValue()
            kotlin.Pair r4 = new kotlin.Pair
            r4.<init>(r3, r2)
            r1.add(r4)
            goto L1f
        L3c:
            kotlin.Pair[] r6 = new kotlin.Pair[r0]
            java.lang.Object[] r6 = r1.toArray(r6)
            kotlin.Pair[] r6 = (kotlin.Pair[]) r6
            if (r6 != 0) goto L48
        L46:
            kotlin.Pair[] r6 = new kotlin.Pair[r0]
        L48:
            int r0 = r6.length
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r0)
            kotlin.Pair[] r6 = (kotlin.Pair[]) r6
            android.os.Bundle r6 = androidx.core.os.BundleKt.bundleOf(r6)
            r5.putExtras(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: nim.a.F(android.content.Intent, java.util.Map):void");
    }

    public static final void G(Intent intent, String str) {
        Intrinsics.checkNotNullParameter(intent, "<this>");
        if (str != null) {
            intent.setType(str);
        }
    }

    public static final Object a(f fVar, Continuation frame) {
        l lVar = new l(1, h.b(frame));
        lVar.u();
        fVar.d(new b(lVar));
        Object objT = lVar.t();
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objT == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objT == aVar ? objT : Unit.f186387a;
    }

    public static final Object b(h0 h0Var, Continuation frame) {
        l lVar = new l(1, h.b(frame));
        lVar.u();
        ((d0) h0Var).q(new r(lVar, 5));
        Object objT = lVar.t();
        if (objT == fim.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objT;
    }

    public static final Object c(w wVar, Continuation continuation) {
        return g(wVar, clm.a.FIRST, null, continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(efm.r r4, kotlin.jvm.functions.Function0 r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof clm.c
            if (r0 == 0) goto L13
            r0 = r6
            clm.c r0 = (clm.c) r0
            int r1 = r0.f25068w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25068w = r1
            goto L18
        L13:
            clm.c r0 = new clm.c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f25068w
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            kotlin.jvm.functions.Function0 r4 = r0.u
            r5 = r4
            kotlin.jvm.functions.Function0 r5 = (kotlin.jvm.functions.Function0) r5
            yhm.o.b(r6)
            goto L48
        L2c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L34:
            yhm.o.b(r6)
            clm.a r6 = clm.a.FIRST_OR_DEFAULT
            r2 = r5
            kotlin.jvm.functions.Function0 r2 = (kotlin.jvm.functions.Function0) r2
            r0.u = r2
            r0.f25068w = r3
            r2 = 0
            java.lang.Object r6 = g(r4, r6, r2, r0)
            if (r6 != r1) goto L48
            return r1
        L48:
            if (r6 != 0) goto L4f
            java.lang.Object r4 = r5.invoke()
            return r4
        L4f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: nim.a.d(efm.r, kotlin.jvm.functions.Function0, gim.c):java.lang.Object");
    }

    public static final Object e(efm.r rVar, Continuation continuation) {
        return g(rVar, clm.a.FIRST_OR_DEFAULT, null, continuation);
    }

    public static final Object f(efm.r rVar, Continuation continuation) {
        return g(rVar, clm.a.LAST, null, continuation);
    }

    public static final Object g(w wVar, clm.a aVar, Object obj2, Continuation frame) {
        l lVar = new l(1, h.b(frame));
        lVar.u();
        wVar.subscribe(new e(lVar, aVar, obj2));
        Object objT = lVar.t();
        if (objT == fim.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objT;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h(efm.k r4, gim.c r5) {
        /*
            boolean r0 = r5 instanceof clm.f
            if (r0 == 0) goto L13
            r0 = r5
            clm.f r0 = (clm.f) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            clm.f r0 = new clm.f
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L3b
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r5)
            r0.v = r3
            java.lang.Object r5 = i(r4, r0)
            if (r5 != r1) goto L3b
            return r1
        L3b:
            if (r5 == 0) goto L3e
            return r5
        L3e:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: nim.a.h(efm.k, gim.c):java.lang.Object");
    }

    public static final Object i(n nVar, Continuation frame) {
        l lVar = new l(1, h.b(frame));
        lVar.u();
        ((k) nVar).i(new yf.c(lVar, 3));
        Object objT = lVar.t();
        if (objT == fim.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objT;
    }

    public static void j(Object obj2, String str, String str2) {
        if (Log.isLoggable("TRuntime.".concat(str), 3)) {
            String.format(str2, obj2);
        }
    }

    public static void k(String str, String str2, Exception exc2) {
        if (Log.isLoggable("TRuntime.".concat(str), 6)) {
        }
    }

    public static final KClass l(Annotation annotation) {
        Intrinsics.checkNotNullParameter(annotation, "<this>");
        Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
        Intrinsics.checkNotNullExpressionValue(clsAnnotationType, "annotationType(...)");
        return r(clsAnnotationType);
    }

    public static final g m() {
        Intrinsics.checkNotNullParameter(pd.c.f235015b, "<this>");
        g gVarC = g.c();
        Intrinsics.checkNotNullExpressionValue(gVarC, "getInstance()");
        return gVarC;
    }

    public static final Class o(KClass kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Class clsA = ((j) kClass).getF186423a();
        Intrinsics.i(clsA, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
        return clsA;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class p(KClass kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Class clsA = ((j) kClass).getF186423a();
        if (clsA.isPrimitive()) {
            String name = clsA.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return clsA;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class q(KClass kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Class clsA = ((j) kClass).getF186423a();
        if (clsA.isPrimitive()) {
            return clsA;
        }
        String name = clsA.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return Integer.TYPE;
                }
                return null;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                return null;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                return null;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                return null;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                return null;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                return null;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                return null;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                return null;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                return null;
            default:
                return null;
        }
    }

    public static final KClass r(Class cls) {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        return o0.f186429a.b(cls);
    }

    public static final boolean t(String method) {
        Intrinsics.checkNotNullParameter(method, "method");
        return Intrinsics.f(method, "POST") || Intrinsics.f(method, "PATCH") || Intrinsics.f(method, "PUT") || Intrinsics.f(method, "DELETE") || Intrinsics.f(method, "MOVE");
    }

    public static final jhi.k u(Function2 block, Flow flow) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        return new jhi.k(flow, block, 0);
    }

    public static final akg.n v(Flow flow, Function1 block) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        return new akg.n(flow, block, 2);
    }

    public static final efm.r w(efm.r rVar, Function1 block) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        efm.r map = rVar.map(new s(new tm.a(1, block), 3));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public static final i x(d0 d0Var, Function1 block) {
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        v4a.i iVar = new v4a.i(12, new m(2, block));
        d0Var.getClass();
        i iVar2 = new i(d0Var, iVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
        return iVar2;
    }

    public static final u y(Flow flow, Function1 block) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        return new u(flow, block, 3);
    }

    public static final efm.r z(efm.r rVar, Function1 block) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        efm.r map = rVar.map(new v4a.i(11, new m(1, block)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public String n() {
        return null;
    }

    public String s() {
        return null;
    }
}
