package v73;

import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class j extends yji.n implements a {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final l93.b f286538l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final wg1.b f286539m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final li0.a f286540n;
    public final li0.d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ang.f f286541p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final wsg.n f286542q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final li0.b f286543r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final gte.a f286544s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ViewController f286545t;
    public final v60.i u;
    public final v60.i v;

    public j(l93.b cardsInteractor, wg1.b tapAndPayInteractor, li0.a pushTokenizerRequestBuilderFactory, li0.d userAddressBuilderFactory, ang.f userInteractor, wsg.n walletInteractor, li0.b tapAndPayClient, gte.a featureToggleInteractor, ViewController screen) {
        Intrinsics.checkNotNullParameter(cardsInteractor, "cardsInteractor");
        Intrinsics.checkNotNullParameter(tapAndPayInteractor, "tapAndPayInteractor");
        Intrinsics.checkNotNullParameter(pushTokenizerRequestBuilderFactory, "pushTokenizerRequestBuilderFactory");
        Intrinsics.checkNotNullParameter(userAddressBuilderFactory, "userAddressBuilderFactory");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(tapAndPayClient, "tapAndPayClient");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(screen, "screen");
        this.f286538l = cardsInteractor;
        this.f286539m = tapAndPayInteractor;
        this.f286540n = pushTokenizerRequestBuilderFactory;
        this.o = userAddressBuilderFactory;
        this.f286541p = userInteractor;
        this.f286542q = walletInteractor;
        this.f286543r = tapAndPayClient;
        this.f286544s = featureToggleInteractor;
        this.f286545t = screen;
        this.u = new v60.i();
        this.v = new v60.i();
    }
}
