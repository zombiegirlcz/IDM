package com.onfido.android.sdk.capture.internal.service;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class b implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f49961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ VibratorService f49962b;

    public /* synthetic */ b(VibratorService vibratorService, int i) {
        this.f49961a = i;
        this.f49962b = vibratorService;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f49961a) {
            case 0:
                return VibratorService.vibrateForSuccess$lambda$0(this.f49962b);
            default:
                return VibratorService.vibrateForError$lambda$1(this.f49962b);
        }
    }
}
