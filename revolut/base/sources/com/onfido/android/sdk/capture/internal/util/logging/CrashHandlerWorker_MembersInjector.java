package com.onfido.android.sdk.capture.internal.util.logging;

import com.onfido.android.sdk.capture.internal.analytics.inhouse.trackers.FlowTracker;
import com.onfido.dagger.MembersInjector;
import com.onfido.javax.inject.Provider;

/* JADX INFO: loaded from: classes17.dex */
public final class CrashHandlerWorker_MembersInjector implements MembersInjector {
    private final Provider flowTrackerProvider;
    private final Provider remoteLoggerTreeProvider;

    public CrashHandlerWorker_MembersInjector(Provider provider, Provider provider2) {
        this.remoteLoggerTreeProvider = provider;
        this.flowTrackerProvider = provider2;
    }

    public static MembersInjector create(Provider provider, Provider provider2) {
        return new CrashHandlerWorker_MembersInjector(provider, provider2);
    }

    public static void injectFlowTracker(CrashHandlerWorker crashHandlerWorker, FlowTracker flowTracker) {
        crashHandlerWorker.flowTracker = flowTracker;
    }

    public static void injectRemoteLoggerTree(CrashHandlerWorker crashHandlerWorker, RemoteLoggerTree remoteLoggerTree) {
        crashHandlerWorker.remoteLoggerTree = remoteLoggerTree;
    }

    public void injectMembers(CrashHandlerWorker crashHandlerWorker) {
        injectRemoteLoggerTree(crashHandlerWorker, (RemoteLoggerTree) this.remoteLoggerTreeProvider.get());
        injectFlowTracker(crashHandlerWorker, (FlowTracker) this.flowTrackerProvider.get());
    }
}
