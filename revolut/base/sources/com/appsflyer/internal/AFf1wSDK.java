package com.appsflyer.internal;

import java.util.TimerTask;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1wSDK extends TimerTask {
    private final Thread values;

    public AFf1wSDK(Thread thread) {
        this.values = thread;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.values.interrupt();
    }
}
