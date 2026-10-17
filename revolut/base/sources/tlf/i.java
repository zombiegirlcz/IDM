package tlf;

import klf.h0;
import klf.m1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f272072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m1 f272073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f272074c;
    public final t1j.b d;
    public final jpc.e e;
    public final ryc.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final nhf.a f272075g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final vlf.b f272076h;
    public final m78.i i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final cl3.a f272077j;

    public i(h0 commonDataSource, m1 juniorDataSource, g p2PTransferHeaderMapper, t1j.b customisedVaultsProvider, jpc.e p2pPersonalisationProvider, ryc.a billAccountProvider, nhf.a unitedWalletInteractor, vlf.b commonUiMapper, m78.i proBackgroundIconsProvider, cl3.a contactsInteractor, f descriptionMapper) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        Intrinsics.checkNotNullParameter(p2PTransferHeaderMapper, "p2PTransferHeaderMapper");
        Intrinsics.checkNotNullParameter(customisedVaultsProvider, "customisedVaultsProvider");
        Intrinsics.checkNotNullParameter(p2pPersonalisationProvider, "p2pPersonalisationProvider");
        Intrinsics.checkNotNullParameter(billAccountProvider, "billAccountProvider");
        Intrinsics.checkNotNullParameter(unitedWalletInteractor, "unitedWalletInteractor");
        Intrinsics.checkNotNullParameter(commonUiMapper, "commonUiMapper");
        Intrinsics.checkNotNullParameter(proBackgroundIconsProvider, "proBackgroundIconsProvider");
        Intrinsics.checkNotNullParameter(contactsInteractor, "contactsInteractor");
        Intrinsics.checkNotNullParameter(descriptionMapper, "descriptionMapper");
        this.f272072a = commonDataSource;
        this.f272073b = juniorDataSource;
        this.f272074c = p2PTransferHeaderMapper;
        this.d = customisedVaultsProvider;
        this.e = p2pPersonalisationProvider;
        this.f = billAccountProvider;
        this.f272075g = unitedWalletInteractor;
        this.f272076h = commonUiMapper;
        this.i = proBackgroundIconsProvider;
        this.f272077j = contactsInteractor;
    }
}
