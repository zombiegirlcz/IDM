package skm;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: classes14.dex */
public abstract class h2 {
    public static final Object a(f2 f2Var, Function2 function2) {
        e0.w(f2Var, new t0(k0.d(f2Var.d.getContext()).j(f2Var.e, f2Var, f2Var.f263953c), 0));
        return com.bumptech.glide.d.B(f2Var, false, f2Var, function2);
    }

    public static final Object b(long j2, Function2 function2, Continuation frame) {
        if (j2 <= 0) {
            throw new TimeoutCancellationException("Timed out immediately", null);
        }
        Object objA = a(new f2(j2, frame), function2);
        if (objA == fim.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return objA;
    }

    public static final Object c(long j2, Function2 function2, gim.c cVar) {
        return b(k0.e(j2), function2, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0069 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(long r6, kotlin.jvm.functions.Function2 r8, kotlin.coroutines.Continuation r9) {
        /*
            boolean r0 = r9 instanceof skm.g2
            if (r0 == 0) goto L13
            r0 = r9
            skm.g2 r0 = (skm.g2) r0
            int r1 = r0.f263980w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f263980w = r1
            goto L18
        L13:
            skm.g2 r0 = new skm.g2
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f263980w
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            kotlin.jvm.internal.Ref$ObjectRef r6 = r0.u
            yhm.o.b(r9)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L29
            return r9
        L29:
            r7 = move-exception
            goto L63
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            yhm.o.b(r9)
            r4 = 0
            int r9 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r9 > 0) goto L3d
            goto L69
        L3d:
            kotlin.jvm.internal.Ref$ObjectRef r9 = new kotlin.jvm.internal.Ref$ObjectRef
            r9.<init>()
            r0.u = r9     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L61
            r0.f263980w = r3     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L61
            skm.f2 r2 = new skm.f2     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L61
            r2.<init>(r6, r0)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L61
            r9.f186409a = r2     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L61
            java.lang.Object r6 = a(r2, r8)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L61
            if (r6 != r1) goto L5d
            java.lang.String r7 = "frame"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r7)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L59
            goto L5d
        L59:
            r6 = move-exception
            r7 = r6
        L5b:
            r6 = r9
            goto L63
        L5d:
            if (r6 != r1) goto L60
            return r1
        L60:
            return r6
        L61:
            r7 = move-exception
            goto L5b
        L63:
            kotlinx.coroutines.Job r8 = r7.f187931a
            java.lang.Object r6 = r6.f186409a
            if (r8 != r6) goto L6b
        L69:
            r6 = 0
            return r6
        L6b:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: skm.h2.d(long, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final Object e(long j2, Function2 function2, Continuation continuation) {
        return d(k0.e(j2), function2, continuation);
    }
}
