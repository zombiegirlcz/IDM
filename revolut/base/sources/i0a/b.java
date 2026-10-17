package i0a;

import iz9.e;
import kotlin.jvm.internal.Intrinsics;
import qz9.g;
import wl3.u;
import yji.n;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e f157337l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final g f157338m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final u f157339n;
    public final l80.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final hj8.a f157340p;

    public b(e socialPaymentsInteractor, g paymentsChatPreferences, u revolutContactPaymentsSettingsInteractor, l80.e dateProvider, hj8.a juniorProfileInteractor) {
        Intrinsics.checkNotNullParameter(socialPaymentsInteractor, "socialPaymentsInteractor");
        Intrinsics.checkNotNullParameter(paymentsChatPreferences, "paymentsChatPreferences");
        Intrinsics.checkNotNullParameter(revolutContactPaymentsSettingsInteractor, "revolutContactPaymentsSettingsInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        this.f157337l = socialPaymentsInteractor;
        this.f157338m = paymentsChatPreferences;
        this.f157339n = revolutContactPaymentsSettingsInteractor;
        this.o = dateProvider;
        this.f157340p = juniorProfileInteractor;
    }
}
