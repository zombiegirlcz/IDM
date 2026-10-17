package ix;

import androidx.lifecycle.LifecycleCoroutineScope;
import aug.c;
import fx.d;
import java.util.LinkedHashSet;
import kl.b0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vkm.q;
import vkm.t1;
import vkm.z1;

/* JADX INFO: loaded from: classes16.dex */
public final class b extends ex.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f169201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f169202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z1 f169203c;

    public b(LinkedHashSet validators, b0 imageProvider, LifecycleCoroutineScope coroutineScope, ex.b imageFormatConverter, d validatorsRunnerBridge) {
        Intrinsics.checkNotNullParameter(validators, "validators");
        Intrinsics.checkNotNullParameter(imageProvider, "imageProvider");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(imageFormatConverter, "imageFormatConverter");
        Intrinsics.checkNotNullParameter(validatorsRunnerBridge, "validatorsRunnerBridge");
        this.f169201a = validators;
        this.f169202b = validatorsRunnerBridge;
        this.f169203c = q.b(0, 7, null);
        q.G(q.H(new c(this, (Continuation) null, 5), imageProvider.i()), coroutineScope);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(ix.b r5, lx.a r6, gim.c r7) {
        /*
            dx.e r0 = dx.e.f120496a
            boolean r1 = r7 instanceof ix.a
            if (r1 == 0) goto L15
            r1 = r7
            ix.a r1 = (ix.a) r1
            int r2 = r1.f169200w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f169200w = r2
            goto L1a
        L15:
            ix.a r1 = new ix.a
            r1.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f169200w
            r4 = 1
            if (r3 == 0) goto L31
            if (r3 != r4) goto L29
            yhm.o.b(r7)     // Catch: java.lang.Throwable -> L51
            goto L47
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r7)
            ch0.a r6 = r6.f200499a     // Catch: java.lang.Throwable -> L51
            xv.m r6 = ex.b.a(r6)     // Catch: java.lang.Throwable -> L51
            fx.d r7 = r5.f169202b     // Catch: java.lang.Throwable -> L51
            java.util.LinkedHashSet r5 = r5.f169201a     // Catch: java.lang.Throwable -> L51
            r1.f169200w = r4     // Catch: java.lang.Throwable -> L51
            java.lang.Object r7 = r7.a(r0, r6, r5, r1)     // Catch: java.lang.Throwable -> L51
            if (r7 != r2) goto L47
            return r2
        L47:
            java.util.List r7 = (java.util.List) r7     // Catch: java.lang.Throwable -> L51
            dx.g r5 = new dx.g     // Catch: java.lang.Throwable -> L51
            java.lang.Iterable r7 = (java.lang.Iterable) r7     // Catch: java.lang.Throwable -> L51
            r5.<init>(r7)     // Catch: java.lang.Throwable -> L51
            return r5
        L51:
            r5 = move-exception
            dx.f r6 = new dx.f
            com.revolut.camerakit.core.errors.CameraKitException r7 = new com.revolut.camerakit.core.errors.CameraKitException
            java.lang.String r0 = "Document is not detected"
            r1 = 4
            r7.<init>(r0, r5, r1)
            zhm.f0 r5 = zhm.f0.f322471a
            r6.<init>(r7, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ix.b.d(ix.b, lx.a, gim.c):java.lang.Object");
    }

    @Override // xv.h
    public final t1 a() {
        return q.g(this.f169203c);
    }
}
