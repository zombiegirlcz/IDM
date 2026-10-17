package com.fourthline.orca.internal;

import com.fourthline.core.VideoRecording;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class dr implements qd1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function0 f27899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final gj f27900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ke f27901c;

    public dr(Function0 workflowIdProvider, gj dataBundle, ke dataWorkManager) {
        Intrinsics.checkNotNullParameter(workflowIdProvider, "workflowIdProvider");
        Intrinsics.checkNotNullParameter(dataBundle, "dataBundle");
        Intrinsics.checkNotNullParameter(dataWorkManager, "dataWorkManager");
        this.f27899a = workflowIdProvider;
        this.f27900b = dataBundle;
        this.f27901c = dataWorkManager;
    }

    @Override // com.fourthline.orca.internal.qd1
    public void a(VideoRecording videoRecording) {
        Intrinsics.checkNotNullParameter(videoRecording, "videoRecording");
        Pair pairB = hj.b(this.f27900b);
        if (pairB != null) {
            this.f27901c.a(new ur((String) this.f27899a.invoke(), (List) pairB.f186386b));
        }
    }
}
