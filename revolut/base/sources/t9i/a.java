package t9i;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcelable;
import com.revolut.RevolutApplication;
import com.revolut.feature_restricted_access_malware.api.model.MaliciousSoftware;
import com.revolut.feature_restricted_access_malware.impl.destination.MaliciousSoftwarePromptDestination;
import com.revolut.kompot.bridge.impl.rootflow.KompotFlowContract$Configuration;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import in0.h;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import lm.e;
import nri.b;
import skm.e0;
import sri.m;
import voi.i;

/* JADX INFO: loaded from: classes13.dex */
public final class a extends h80.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f269038a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f269039b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile MaliciousSoftware f269040c;
    public final AtomicInteger d;

    public a(e maliciousSoftwareDetector, e navigator, e coroutineScope) {
        Intrinsics.checkNotNullParameter(maliciousSoftwareDetector, "maliciousSoftwareDetector");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f269038a = maliciousSoftwareDetector;
        this.f269039b = navigator;
        this.d = new AtomicInteger(0);
    }

    public final void a(Activity activity, String str) {
        boolean z = false;
        if (activity instanceof b) {
            Parcelable parcelableI0 = ((b) activity).I0();
            if (parcelableI0 instanceof KompotFlowContract$Configuration) {
                z = ((KompotFlowContract$Configuration) parcelableI0).getF98264a() instanceof MaliciousSoftwarePromptDestination;
            }
        }
        if (z) {
            return;
        }
        ((m) this.f269039b.get()).c(new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new MaliciousSoftwarePromptDestination(str), false, (Integer) null, 335577088, 9)));
        activity.finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // h80.a, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        MaliciousSoftware maliciousSoftware = this.f269040c;
        if (maliciousSoftware != null) {
            String str = maliciousSoftware.f97469a;
            h hVar = activity instanceof h ? (h) activity : null;
            if (hVar == null || !hVar.C0()) {
                a(activity, str);
            }
        }
    }

    @Override // h80.a, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (this.d.incrementAndGet() == 1) {
            RevolutApplication.Companion aVar = RevolutApplication.INSTANCE;
            e0.C(i.c(), null, null, new afe.a(this, activity, (Continuation) null, 17), 3);
        }
    }

    @Override // h80.a, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.d.decrementAndGet();
    }
}
