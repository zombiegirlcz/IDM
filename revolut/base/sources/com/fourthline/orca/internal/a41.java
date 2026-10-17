package com.fourthline.orca.internal;

import android.content.Context;
import com.fourthline.core.ContextExtensionsKt;
import com.fourthline.core.DeviceMetadata;
import com.fourthline.orca.Orca;
import com.fourthline.orca.internal.je;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import yhm.m;

/* JADX INFO: loaded from: classes23.dex */
public final class a41 {

    public static final class a implements je {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f26703a = new a();

        @Override // com.fourthline.orca.internal.je
        public final Object a(je.a aVar, Continuation continuation) {
            m.Companion companion = yhm.m.INSTANCE;
            return new yhm.m(je.b.f29867a);
        }
    }

    public final gh1 a(Context context, mb.d networkEnvironment, ib0 publicNetworkService, DeviceMetadata deviceMetadata, sg0 tracker, phm.a stubProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(networkEnvironment, "networkEnvironment");
        Intrinsics.checkNotNullParameter(publicNetworkService, "publicNetworkService");
        Intrinsics.checkNotNullParameter(deviceMetadata, "deviceMetadata");
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        Intrinsics.checkNotNullParameter(stubProvider, "stubProvider");
        if (!a1m.e.B(networkEnvironment)) {
            return new rb0(context, q1.a(publicNetworkService, tracker), deviceMetadata);
        }
        Object obj2 = stubProvider.get();
        Intrinsics.h(obj2);
        return (gh1) obj2;
    }

    public final ej b(mb.d networkEnvironment, ib0 onboardingNetworkService, phm.a stubProvider) {
        Intrinsics.checkNotNullParameter(networkEnvironment, "networkEnvironment");
        Intrinsics.checkNotNullParameter(onboardingNetworkService, "onboardingNetworkService");
        Intrinsics.checkNotNullParameter(stubProvider, "stubProvider");
        if (!a1m.e.B(networkEnvironment)) {
            return new ba0(onboardingNetworkService);
        }
        Object obj2 = stubProvider.get();
        Intrinsics.h(obj2);
        return (ej) obj2;
    }

    public final p01 c(mb.d networkEnvironment, ib0 networkService, phm.a stubProvider) {
        Intrinsics.checkNotNullParameter(networkEnvironment, "networkEnvironment");
        Intrinsics.checkNotNullParameter(networkService, "networkService");
        Intrinsics.checkNotNullParameter(stubProvider, "stubProvider");
        if (!a1m.e.B(networkEnvironment)) {
            return new gb0(networkService);
        }
        Object obj2 = stubProvider.get();
        Intrinsics.h(obj2);
        return (p01) obj2;
    }

    public final bf1 a(mb.d networkEnvironment, ib0 onboardingNetworkService, phm.a stubProvider, Orca.a integration, sg0 tracker) {
        Intrinsics.checkNotNullParameter(networkEnvironment, "networkEnvironment");
        Intrinsics.checkNotNullParameter(onboardingNetworkService, "onboardingNetworkService");
        Intrinsics.checkNotNullParameter(stubProvider, "stubProvider");
        Intrinsics.checkNotNullParameter(integration, "integration");
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        if (a1m.e.B(networkEnvironment)) {
            Object obj2 = stubProvider.get();
            Intrinsics.h(obj2);
            return (bf1) obj2;
        }
        return new pb0(onboardingNetworkService, integration, tracker);
    }

    public final r11 a(Context context, mb.d networkEnvironment, t9 cdnUrlDownloadWorker, phm.a stubProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(networkEnvironment, "networkEnvironment");
        Intrinsics.checkNotNullParameter(cdnUrlDownloadWorker, "cdnUrlDownloadWorker");
        Intrinsics.checkNotNullParameter(stubProvider, "stubProvider");
        if (a1m.e.B(networkEnvironment)) {
            Object obj2 = stubProvider.get();
            Intrinsics.h(obj2);
            return (r11) obj2;
        }
        return new hb0(ContextExtensionsKt.getAssetsFourthlineDirectory(context), cdnUrlDownloadWorker);
    }

    public final c6 a(mb.d networkEnvironment, ib0 onboardingNetworkService, phm.a stubProvider) {
        Intrinsics.checkNotNullParameter(networkEnvironment, "networkEnvironment");
        Intrinsics.checkNotNullParameter(onboardingNetworkService, "onboardingNetworkService");
        Intrinsics.checkNotNullParameter(stubProvider, "stubProvider");
        if (a1m.e.B(networkEnvironment)) {
            Object obj2 = stubProvider.get();
            Intrinsics.h(obj2);
            return (c6) obj2;
        }
        return new n90(onboardingNetworkService);
    }

    public final je a(mb.d networkEnvironment, ib0 onboardingNetworkService) {
        Intrinsics.checkNotNullParameter(networkEnvironment, "networkEnvironment");
        Intrinsics.checkNotNullParameter(onboardingNetworkService, "onboardingNetworkService");
        if (a1m.e.B(networkEnvironment)) {
            return a.f26703a;
        }
        return new x90(onboardingNetworkService);
    }
}
