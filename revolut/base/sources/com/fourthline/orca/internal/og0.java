package com.fourthline.orca.internal;

import android.content.res.TypedArray;
import android.media.MediaMetadataRetriever;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class og0 implements fh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zq0 f31661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function0 f31662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f31663c;

    public og0(zq0 resultRepository, Function0 finishOrcaActivity) {
        Intrinsics.checkNotNullParameter(resultRepository, "resultRepository");
        Intrinsics.checkNotNullParameter(finishOrcaActivity, "finishOrcaActivity");
        this.f31661a = resultRepository;
        this.f31662b = finishOrcaActivity;
        this.f31663c = new ArrayList();
    }

    @Override // com.fourthline.orca.internal.fh0
    public void a(Object obj2) throws Exception {
        boolean zIsTerminated;
        List<AutoCloseable> list = this.f31663c;
        for (AutoCloseable autoCloseable : list) {
            if (autoCloseable instanceof AutoCloseable) {
                autoCloseable.close();
            } else if (autoCloseable instanceof ExecutorService) {
                ExecutorService executorService = (ExecutorService) autoCloseable;
                if (executorService != ForkJoinPool.commonPool() && !(zIsTerminated = executorService.isTerminated())) {
                    executorService.shutdown();
                    boolean z = false;
                    while (!zIsTerminated) {
                        try {
                            zIsTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                        } catch (InterruptedException unused) {
                            if (!z) {
                                executorService.shutdownNow();
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                }
            } else if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
            } else {
                if (!(autoCloseable instanceof MediaMetadataRetriever)) {
                    throw new IllegalArgumentException();
                }
                ((MediaMetadataRetriever) autoCloseable).release();
            }
        }
        list.clear();
        this.f31662b.invoke();
        this.f31661a.a(obj2);
        s1.b();
    }

    @Override // com.fourthline.orca.internal.fh0
    public void a(AutoCloseable objectToClose) {
        Intrinsics.checkNotNullParameter(objectToClose, "objectToClose");
        this.f31663c.add(objectToClose);
    }
}
