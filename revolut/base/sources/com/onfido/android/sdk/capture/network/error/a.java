package com.onfido.android.sdk.capture.network.error;

import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.CompletableTransformer;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.core.SingleTransformer;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class a implements CompletableTransformer, SingleTransformer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ErrorHandler f49977a;

    public /* synthetic */ a(ErrorHandler errorHandler) {
        this.f49977a = errorHandler;
    }

    @Override // io.reactivex.rxjava3.core.SingleTransformer
    public SingleSource a(Single single) {
        return ErrorHandler.handleError$lambda$0(this.f49977a, single);
    }

    @Override // io.reactivex.rxjava3.core.CompletableTransformer
    public CompletableSource b(Completable completable) {
        return ErrorHandler.handleError$lambda$1(this.f49977a, completable);
    }
}
