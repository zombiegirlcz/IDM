package aw;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yw.h f10171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LifecycleOwner f10172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bw.g f10173c;
    public final zq.a d;
    public final jpc.e e;
    public final AtomicReference f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final at4.b f10174g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public cw.a f10175h;

    public j0(Context appContext, yw.h settings, LifecycleOwner lifecycleOwner, bw.g deviceInfoProvider, zq.a recordingTargetFactory, jpc.e videoImuArtifactSessionFactory) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(deviceInfoProvider, "deviceInfoProvider");
        Intrinsics.checkNotNullParameter(recordingTargetFactory, "recordingTargetFactory");
        Intrinsics.checkNotNullParameter(videoImuArtifactSessionFactory, "videoImuArtifactSessionFactory");
        this.f10171a = settings;
        this.f10172b = lifecycleOwner;
        this.f10173c = deviceInfoProvider;
        this.d = recordingTargetFactory;
        this.e = videoImuArtifactSessionFactory;
        this.f = new AtomicReference();
        this.f10174g = new at4.b(appContext, this, 10);
    }
}
