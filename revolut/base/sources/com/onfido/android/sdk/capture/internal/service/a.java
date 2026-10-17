package com.onfido.android.sdk.capture.internal.service;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.CompletableTransformer;
import mx0.a7;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class a implements CompletableTransformer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f49959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f49960b;

    public /* synthetic */ a(a7 a7Var, boolean z) {
        this.f49960b = a7Var;
        this.f49959a = z;
    }

    @Override // io.reactivex.rxjava3.core.CompletableTransformer
    public CompletableSource b(Completable completable) {
        return AnnouncementService.interruptBeforeAnnouncement$lambda$8(this.f49959a, (AnnouncementService) this.f49960b, completable);
    }

    public /* synthetic */ a(boolean z, AnnouncementService announcementService) {
        this.f49959a = z;
        this.f49960b = announcementService;
    }
}
