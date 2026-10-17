package jx;

import com.revolut.camerakit.core.errors.CameraKitException;
import dx.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kl.b0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import vkm.q;
import vkm.t1;
import vkm.z1;
import xv.f;
import xv.g;
import xv.p;
import zhm.d0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes16.dex */
public final class d extends ex.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f179029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fn2.c f179030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final eki.e f179031c;
    public final l d;
    public final e e;
    public final kge.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f179032g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final z1 f179033h;
    public static final /* synthetic */ KProperty[] i = {o0.f186429a.j(new h0(d.class, "faceDetectorValue", "getFaceDetectorValue()Lcom/revolut/core/mobile_services/api/mlkit/vision/face/MsFaceDetector;", 0))};

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final dx.b f179028j = new dx.b(new CameraKitException("Detector paused", (Throwable) null, 6), f0.f322471a);

    public d(kge.d faceDetector, LinkedHashSet validators, fn2.c cameraKitFaceDetailsMapper, b0 imageProvider, eki.e coroutineScopeProvider, ex.b imageFormatConverter, l previewMetadata, e faceDataCollector) {
        Intrinsics.checkNotNullParameter(faceDetector, "faceDetector");
        Intrinsics.checkNotNullParameter(validators, "validators");
        Intrinsics.checkNotNullParameter(cameraKitFaceDetailsMapper, "cameraKitFaceDetailsMapper");
        Intrinsics.checkNotNullParameter(imageProvider, "imageProvider");
        Intrinsics.checkNotNullParameter(coroutineScopeProvider, "coroutineScopeProvider");
        Intrinsics.checkNotNullParameter(imageFormatConverter, "imageFormatConverter");
        Intrinsics.checkNotNullParameter(previewMetadata, "previewMetadata");
        Intrinsics.checkNotNullParameter(faceDataCollector, "faceDataCollector");
        this.f179029a = validators;
        this.f179030b = cameraKitFaceDetailsMapper;
        this.f179031c = coroutineScopeProvider;
        this.d = previewMetadata;
        this.e = faceDataCollector;
        this.f = faceDetector;
        this.f179033h = q.b(0, 7, null);
        q.G(q.H(new aug.c(this, (Continuation) null, 6), imageProvider.i()), (CoroutineScope) coroutineScopeProvider.invoke());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(jx.d r12, dx.a r13, xv.m r14, gim.c r15) {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jx.d.d(jx.d, dx.a, xv.m, gim.c):java.lang.Object");
    }

    @Override // xv.h
    public final t1 a() {
        return q.g(this.f179033h);
    }

    @Override // xv.h
    public final Set b() {
        LinkedHashSet linkedHashSet = this.f179029a;
        ArrayList arrayList = new ArrayList(w.t(linkedHashSet, 10));
        Iterator it8 = linkedHashSet.iterator();
        while (it8.hasNext()) {
            arrayList.add(((p) it8.next()).a());
        }
        return d0.i1(arrayList);
    }

    @Override // xv.h
    public final g c() {
        ti0.c cVar = (ti0.c) this.f.j(i[0]);
        if (cVar != null) {
            ch0.b minimumResolution = new ch0.b();
            String modelVersion = cVar.f271397b.f241988b;
            Intrinsics.checkNotNullParameter(minimumResolution, "minimumResolution");
            Intrinsics.checkNotNullParameter(modelVersion, "version");
            if (modelVersion != null) {
                Intrinsics.checkNotNullParameter(modelVersion, "modelVersion");
                return new f(modelVersion);
            }
        }
        return xv.e.f309125a;
    }

    @Override // xv.h
    public final void pause() {
        this.f179032g = true;
    }

    @Override // xv.h
    public final void resume() {
        this.f179032g = false;
    }
}
