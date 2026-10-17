package vha;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class l extends yji.n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final rea.m f289401l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final hr6.l f289402m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final j60.a f289403n;

    public l(rea.m pocketDetailsInteractor, hr6.l freelancerCommandFactory, j60.a bottomDialogExtension) {
        Intrinsics.checkNotNullParameter(pocketDetailsInteractor, "pocketDetailsInteractor");
        Intrinsics.checkNotNullParameter(freelancerCommandFactory, "freelancerCommandFactory");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        this.f289401l = pocketDetailsInteractor;
        this.f289402m = freelancerCommandFactory;
        this.f289403n = bottomDialogExtension;
    }
}
