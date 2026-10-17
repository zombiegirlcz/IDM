package com.fourthline.orca.internal;

import android.app.Activity;
import android.content.Context;
import com.fourthline.core.internal.devicedata.AndroidDataCollectorHelper;
import com.fourthline.core.internal.devicedata.MotionDataCollector;
import com.fourthline.core.internal.devicedata.MotionFrame;
import com.fourthline.orca.internal.ff;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes23.dex */
public final class xd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f34950a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public static final class b implements mc1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ef f34951a;

        public b(ef efVar) {
            this.f34951a = efVar;
        }

        @Override // com.fourthline.orca.internal.mc1
        public JsonElement a() {
            Map mapC;
            ef efVar = this.f34951a;
            LinkedHashMap linkedHashMapP = zhm.r0.p(zhm.r0.p(zhm.r0.p(zhm.r0.p(zhm.r0.p(zhm.r0.p(zhm.r0.p(zhm.r0.p(zhm.r0.p(zhm.r0.p(efVar.d(), efVar.f()), efVar.b()), efVar.k()), efVar.e()), efVar.g()), efVar.m()), efVar.a()), efVar.h()), efVar.o()), efVar.j());
            if (linkedHashMapP.isEmpty() && efVar.i().isEmpty()) {
                return null;
            }
            Json jsonA = s40.a();
            xz serializer = new xz();
            if (efVar.i().isEmpty()) {
                mapC = zhm.r0.g();
            } else {
                Json jsonA2 = s40.a();
                List listI = efVar.i();
                jsonA2.getClass();
                qlm.e serializer2 = new qlm.e(MotionFrame.INSTANCE.serializer());
                Intrinsics.checkNotNullParameter(serializer2, "serializer");
                mapC = zhm.q0.c(new Pair("motionFrames", g4i.a.O(jsonA2, listI, serializer2)));
            }
            LinkedHashMap linkedHashMapP2 = zhm.r0.p(linkedHashMapP, mapC);
            jsonA.getClass();
            Intrinsics.checkNotNullParameter(serializer, "serializer");
            return g4i.a.O(jsonA, linkedHashMapP2, serializer);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long c(r70 r70Var) {
        ff ffVarA = r70Var.a();
        if (ffVarA.getEnabled()) {
            return ffVarA.getUploadTimeoutMs();
        }
        return 0L;
    }

    public final AndroidDataCollectorHelper a(Context context, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        return new AndroidDataCollectorHelper(context, null, null, null, null, null, null, null, null, null, coroutineScope, 1022, null);
    }

    public final boolean d(r70 mainRepository) {
        Intrinsics.checkNotNullParameter(mainRepository, "mainRepository");
        ff ffVarA = mainRepository.a();
        return ffVarA.getEnabled() && ffVarA.getMotion().getEnabled();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ff b(r70 r70Var) {
        return r70Var.a();
    }

    public final ef a() {
        return new ef(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
    }

    public final Function0 a(r70 mainRepository) {
        Intrinsics.checkNotNullParameter(mainRepository, "mainRepository");
        return new wm1(mainRepository, 4);
    }

    public final kf a(Context context, Activity activity, ef deviceDataBundle, AndroidDataCollectorHelper androidDataCollectorHelper) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(deviceDataBundle, "deviceDataBundle");
        Intrinsics.checkNotNullParameter(androidDataCollectorHelper, "androidDataCollectorHelper");
        return new kf(context, activity, androidDataCollectorHelper, deviceDataBundle);
    }

    public final ry0 a(AndroidDataCollectorHelper androidDataCollectorHelper, ef deviceDataBundle, r70 mainRepository, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(androidDataCollectorHelper, "androidDataCollectorHelper");
        Intrinsics.checkNotNullParameter(deviceDataBundle, "deviceDataBundle");
        Intrinsics.checkNotNullParameter(mainRepository, "mainRepository");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        List listI = deviceDataBundle.i();
        Map mapJ = deviceDataBundle.j();
        boolean z = mainRepository instanceof ey;
        MotionDataCollector motionDataCollector = new MotionDataCollector(androidDataCollectorHelper, listI, mapJ, z || (mainRepository instanceof ml) || (mainRepository instanceof q11), 0L, null, 48, null);
        if (z) {
            return new ry0(motionDataCollector, ((ey) mainRepository).g(), coroutineScope);
        }
        if (!(mainRepository instanceof ml) && !(mainRepository instanceof q11)) {
            return (ry0) wz.a("Expected FlatMainRepository for the ReactiveMotionDataCollector", new vp1(motionDataCollector, coroutineScope, 11));
        }
        return new ry0(motionDataCollector, vkm.q.h(vkm.q.c(mainRepository.a())), coroutineScope);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ry0 a(MotionDataCollector motionDataCollector, CoroutineScope coroutineScope) {
        return new ry0(motionDataCollector, vkm.q.h(vkm.q.c(new ff(false, 0L, (ff.e) null, (ff.j) null, (ff.f) null, (ff.g) null, (ff.c) null, (ff.k) null, (ff.h) null, (ff.l) null, (ff.b) null, (ff.i) null, (ff.m) null, 8190, (DefaultConstructorMarker) null))), coroutineScope);
    }

    public final jf a(kf factory, Function0 deviceDataCollectionProvider) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(deviceDataCollectionProvider, "deviceDataCollectionProvider");
        return new jf(factory, deviceDataCollectionProvider);
    }

    public final mc1 a(ef deviceDataBundle) {
        Intrinsics.checkNotNullParameter(deviceDataBundle, "deviceDataBundle");
        return new b(deviceDataBundle);
    }

    public final sb1 a(je dataUploaderWorker, mc1 deviceDataRepository, jf deviceDataCollectorComposite, r70 mainRepository, sg0 analyticsTracker, Function0 deviceDataCollectionConfigProvider, ef deviceDataBundle) {
        Intrinsics.checkNotNullParameter(dataUploaderWorker, "dataUploaderWorker");
        Intrinsics.checkNotNullParameter(deviceDataRepository, "deviceDataRepository");
        Intrinsics.checkNotNullParameter(deviceDataCollectorComposite, "deviceDataCollectorComposite");
        Intrinsics.checkNotNullParameter(mainRepository, "mainRepository");
        Intrinsics.checkNotNullParameter(analyticsTracker, "analyticsTracker");
        Intrinsics.checkNotNullParameter(deviceDataCollectionConfigProvider, "deviceDataCollectionConfigProvider");
        Intrinsics.checkNotNullParameter(deviceDataBundle, "deviceDataBundle");
        return new mb0(dataUploaderWorker, deviceDataCollectorComposite, deviceDataRepository, new wm1(mainRepository, 3), analyticsTracker, deviceDataCollectionConfigProvider, deviceDataBundle);
    }

    public final zw a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new zw(context);
    }
}
