package o9k;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final agf.b f223378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ogm.i f223379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v0 f223380c;
    public final x0 d;

    public y(agf.b transactionWorkflowInteractor, ogm.i transactionForAnimationFetcher, v0 transferResultExtension, x0 peerToPeerWorkflowNavigationCommandFactory) {
        Intrinsics.checkNotNullParameter(transactionWorkflowInteractor, "transactionWorkflowInteractor");
        Intrinsics.checkNotNullParameter(transactionForAnimationFetcher, "transactionForAnimationFetcher");
        Intrinsics.checkNotNullParameter(transferResultExtension, "transferResultExtension");
        Intrinsics.checkNotNullParameter(peerToPeerWorkflowNavigationCommandFactory, "peerToPeerWorkflowNavigationCommandFactory");
        this.f223378a = transactionWorkflowInteractor;
        this.f223379b = transactionForAnimationFetcher;
        this.f223380c = transferResultExtension;
        this.d = peerToPeerWorkflowNavigationCommandFactory;
    }
}
