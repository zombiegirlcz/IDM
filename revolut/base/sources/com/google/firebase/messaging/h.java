package com.google.firebase.messaging;

import androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class h implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49502a;

    public /* synthetic */ h(int i) {
        this.f49502a = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f49502a) {
            case 0:
                runnable.run();
                break;
            default:
                PlaybackVideoGraphWrapper.lambda$static$0(runnable);
                break;
        }
    }
}
