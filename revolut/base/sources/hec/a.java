package hec;

import kotlin.jvm.internal.Intrinsics;
import rdc.d;
import yji.n;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final iec.a f151679l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b6c.a f151680m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final d f151681n;

    public a(iec.a flowProvider, b6c.a paymentInitiationInteractor, d paymentStatusDialogFactory) {
        Intrinsics.checkNotNullParameter(flowProvider, "flowProvider");
        Intrinsics.checkNotNullParameter(paymentInitiationInteractor, "paymentInitiationInteractor");
        Intrinsics.checkNotNullParameter(paymentStatusDialogFactory, "paymentStatusDialogFactory");
        this.f151679l = flowProvider;
        this.f151680m = paymentInitiationInteractor;
        this.f151681n = paymentStatusDialogFactory;
    }
}
