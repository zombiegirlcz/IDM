package ct6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gr6.a f108638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gr6.m f108639b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jr6.m f108640c;
    public final jr6.o d;
    public final cne.a e;
    public final ppg.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final wsg.n f108641g;

    public n(gr6.a freelancerAccountDetailsInteractor, gr6.m freelancerPocketsInteractor, jr6.m freelancerDialogFactory, jr6.o freelancerNaviCommandPermissionWrapper, cne.a stampDutyInteractor, ppg.b vaultsInteractor, wsg.n walletInteractor) {
        Intrinsics.checkNotNullParameter(freelancerAccountDetailsInteractor, "freelancerAccountDetailsInteractor");
        Intrinsics.checkNotNullParameter(freelancerPocketsInteractor, "freelancerPocketsInteractor");
        Intrinsics.checkNotNullParameter(freelancerDialogFactory, "freelancerDialogFactory");
        Intrinsics.checkNotNullParameter(freelancerNaviCommandPermissionWrapper, "freelancerNaviCommandPermissionWrapper");
        Intrinsics.checkNotNullParameter(stampDutyInteractor, "stampDutyInteractor");
        Intrinsics.checkNotNullParameter(vaultsInteractor, "vaultsInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        this.f108638a = freelancerAccountDetailsInteractor;
        this.f108639b = freelancerPocketsInteractor;
        this.f108640c = freelancerDialogFactory;
        this.d = freelancerNaviCommandPermissionWrapper;
        this.e = stampDutyInteractor;
        this.f = vaultsInteractor;
        this.f108641g = walletInteractor;
    }

    public final com.revolut.feature.freelancer.impl.ui.extension.a a(j60.a bottomDialog) {
        Intrinsics.checkNotNullParameter(bottomDialog, "bottomDialog");
        return new com.revolut.feature.freelancer.impl.ui.extension.a(bottomDialog, this.f108638a, this.f108639b, this.f108640c, this.d, this.e, this.f, this.f108641g);
    }
}
