package i00;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import xv.p;

/* JADX INFO: loaded from: classes16.dex */
public final class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qw.a f157273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kge.d f157274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f157272c = {o0.f186429a.j(new h0(d.class, "docClassifierValidatorValue", "getDocClassifierValidatorValue()Lcom/revolut/camerakit/vision_framework/DocClassifierValidator;", 0))};

    @NotNull
    private static final a Companion = new a();

    public d(kge.d docClassifierValidator, qw.a imageFormatConverter) {
        Intrinsics.checkNotNullParameter(docClassifierValidator, "docClassifierValidator");
        Intrinsics.checkNotNullParameter(imageFormatConverter, "imageFormatConverter");
        this.f157273a = imageFormatConverter;
        this.f157274b = docClassifierValidator;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // xv.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.util.List r4, kotlin.coroutines.Continuation r5, xv.i r6, xv.m r7) {
        /*
            r3 = this;
            boolean r6 = r5 instanceof i00.b
            if (r6 == 0) goto L13
            r6 = r5
            i00.b r6 = (i00.b) r6
            int r0 = r6.f157270w
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r6.f157270w = r0
            goto L1a
        L13:
            i00.b r6 = new i00.b
            gim.c r5 = (gim.c) r5
            r6.<init>(r3, r5)
        L1a:
            java.lang.Object r5 = r6.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r6.f157270w
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            yhm.o.b(r5)     // Catch: java.lang.Throwable -> L62
            goto L5f
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            yhm.o.b(r5)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r4 = r4.iterator()
        L3a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L49
            java.lang.Object r5 = r4.next()
            boolean r1 = r5 instanceof l00.c
            if (r1 == 0) goto L3a
            goto L4a
        L49:
            r5 = 0
        L4a:
            l00.c r5 = (l00.c) r5
            if (r5 != 0) goto L56
            g00.b r4 = new g00.b
            g00.a r5 = g00.a.NO_FIT_DATA
            r4.<init>(r5)
            return r4
        L56:
            r6.f157270w = r2     // Catch: java.lang.Throwable -> L62
            java.lang.Object r5 = r3.c(r7, r5, r6)     // Catch: java.lang.Throwable -> L62
            if (r5 != r0) goto L5f
            return r0
        L5f:
            xv.q r5 = (xv.q) r5     // Catch: java.lang.Throwable -> L62
            return r5
        L62:
            g00.b r4 = new g00.b
            g00.a r5 = g00.a.GENERAL
            r4.<init>(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: i00.d.b(java.util.List, kotlin.coroutines.Continuation, xv.i, xv.m):java.lang.Object");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(xv.m r12, l00.c r13, gim.c r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1068
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i00.d.c(xv.m, l00.c, gim.c):java.lang.Object");
    }
}
