package mx;

import androidx.lifecycle.LifecycleCoroutineScope;
import aug.c;
import bi0.f;
import com.revolut.core.mobile_services.api.mlkit.vision.barcode.MsBarcodeDetectorSettings;
import dx.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kl.b0;
import kotlin.Lazy;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import maa.r;
import mll.c0;
import skm.e0;
import skm.p0;
import vkm.q;
import vkm.t1;
import vkm.z1;
import xv.m;
import xv.p;
import yhm.j;
import zhm.w;

/* JADX INFO: loaded from: classes16.dex */
public final class b extends ex.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f209556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineScope f209557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f209558c;
    public final MsBarcodeDetectorSettings d;
    public final Lazy e;
    public final z1 f;

    public b(Set validators, b0 imageProvider, LifecycleCoroutineScope coroutineScope, ex.b imageFormatConverter, f msBarcodeDetectorFactory, MsBarcodeDetectorSettings msBarcodeDetectorSettings) {
        Intrinsics.checkNotNullParameter(validators, "validators");
        Intrinsics.checkNotNullParameter(imageProvider, "imageProvider");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(imageFormatConverter, "imageFormatConverter");
        Intrinsics.checkNotNullParameter(msBarcodeDetectorFactory, "msBarcodeDetectorFactory");
        Intrinsics.checkNotNullParameter(msBarcodeDetectorSettings, "msBarcodeDetectorSettings");
        this.f209556a = validators;
        this.f209557b = coroutineScope;
        this.f209558c = msBarcodeDetectorFactory;
        this.d = msBarcodeDetectorSettings;
        this.e = j.b(new r(this, 22));
        this.f = q.b(0, 7, null);
        q.G(q.H(new c(this, (Continuation) null, 7), imageProvider.i()), coroutineScope);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(mx.b r7, lx.a r8, gim.c r9) {
        /*
            boolean r0 = r9 instanceof mx.a
            if (r0 == 0) goto L13
            r0 = r9
            mx.a r0 = (mx.a) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            mx.a r0 = new mx.a
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f209554x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L48
            if (r2 == r5) goto L42
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            dx.o r7 = r0.f209553w
            com.revolut.camerakit.core.errors.CameraKitException r8 = r0.v
            com.revolut.core.mobile_services.api.mlkit.vision.barcode.MsBarcode r8 = (com.revolut.core.mobile_services.api.mlkit.vision.barcode.MsBarcode) r8
            yhm.o.b(r9)     // Catch: java.lang.Throwable -> Lab
            goto La3
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            com.revolut.camerakit.core.errors.CameraKitException r7 = r0.v
            yhm.o.b(r9)     // Catch: java.lang.Throwable -> Lab
            goto L86
        L42:
            xv.m r8 = r0.u
            yhm.o.b(r9)     // Catch: java.lang.Throwable -> Lab
            goto L69
        L48:
            yhm.o.b(r9)
            ch0.a r9 = r8.f200499a     // Catch: java.lang.Throwable -> Lab
            xv.m r9 = ex.b.a(r9)     // Catch: java.lang.Throwable -> Lab
            kotlin.Lazy r2 = r7.e     // Catch: java.lang.Throwable -> Lab
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> Lab
            bi0.e r2 = (bi0.e) r2     // Catch: java.lang.Throwable -> Lab
            ch0.a r8 = r8.f200499a     // Catch: java.lang.Throwable -> Lab
            r0.u = r9     // Catch: java.lang.Throwable -> Lab
            r0.z = r5     // Catch: java.lang.Throwable -> Lab
            java.lang.Object r8 = r2.d(r8, r0)     // Catch: java.lang.Throwable -> Lab
            if (r8 != r1) goto L66
            goto La1
        L66:
            r6 = r9
            r9 = r8
            r8 = r6
        L69:
            com.revolut.core.mobile_services.api.mlkit.vision.barcode.MsBarcode r9 = (com.revolut.core.mobile_services.api.mlkit.vision.barcode.MsBarcode) r9     // Catch: java.lang.Throwable -> Lab
            r2 = 0
            if (r9 != 0) goto L8e
            com.revolut.camerakit.core.errors.CameraKitException r9 = new com.revolut.camerakit.core.errors.CameraKitException     // Catch: java.lang.Throwable -> Lab
            java.lang.String r3 = "QR code is not detected"
            r5 = 6
            r9.<init>(r3, r2, r5)     // Catch: java.lang.Throwable -> Lab
            r0.u = r2     // Catch: java.lang.Throwable -> Lab
            r0.v = r9     // Catch: java.lang.Throwable -> Lab
            r0.z = r4     // Catch: java.lang.Throwable -> Lab
            java.lang.Object r7 = r7.e(r2, r8, r0)     // Catch: java.lang.Throwable -> Lab
            if (r7 != r1) goto L83
            goto La1
        L83:
            r6 = r9
            r9 = r7
            r7 = r6
        L86:
            java.lang.Iterable r9 = (java.lang.Iterable) r9     // Catch: java.lang.Throwable -> Lab
            dx.p r8 = new dx.p     // Catch: java.lang.Throwable -> Lab
            r8.<init>(r7, r9)     // Catch: java.lang.Throwable -> Lab
            return r8
        L8e:
            dx.o r4 = new dx.o     // Catch: java.lang.Throwable -> Lab
            r4.<init>(r9)     // Catch: java.lang.Throwable -> Lab
            r0.u = r2     // Catch: java.lang.Throwable -> Lab
            r0.v = r2     // Catch: java.lang.Throwable -> Lab
            r0.f209553w = r4     // Catch: java.lang.Throwable -> Lab
            r0.z = r3     // Catch: java.lang.Throwable -> Lab
            java.lang.Object r9 = r7.e(r4, r8, r0)     // Catch: java.lang.Throwable -> Lab
            if (r9 != r1) goto La2
        La1:
            return r1
        La2:
            r7 = r4
        La3:
            java.lang.Iterable r9 = (java.lang.Iterable) r9     // Catch: java.lang.Throwable -> Lab
            dx.q r8 = new dx.q     // Catch: java.lang.Throwable -> Lab
            r8.<init>(r9, r7)     // Catch: java.lang.Throwable -> Lab
            return r8
        Lab:
            r7 = move-exception
            dx.p r8 = new dx.p
            com.revolut.camerakit.core.errors.CameraKitException r9 = new com.revolut.camerakit.core.errors.CameraKitException
            java.lang.String r0 = "QR code detection failed"
            r1 = 4
            r9.<init>(r0, r7, r1)
            zhm.f0 r7 = zhm.f0.f322471a
            r8.<init>(r9, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: mx.b.d(mx.b, lx.a, gim.c):java.lang.Object");
    }

    @Override // xv.h
    public final t1 a() {
        return q.g(this.f);
    }

    public final Object e(o oVar, m mVar, a aVar) {
        Set set = this.f209556a;
        ArrayList arrayList = new ArrayList(w.t(set, 10));
        Iterator it8 = set.iterator();
        while (it8.hasNext()) {
            o oVar2 = oVar;
            m mVar2 = mVar;
            arrayList.add(e0.g(this.f209557b, p0.f264002b, null, new c0((p) it8.next(), oVar2, mVar2, null, 10), 2));
            oVar = oVar2;
            mVar = mVar2;
        }
        Object objH = e0.h(arrayList, aVar);
        return objH == fim.a.COROUTINE_SUSPENDED ? objH : (List) objH;
    }
}
