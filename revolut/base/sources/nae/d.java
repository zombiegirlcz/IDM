package nae;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import tof.v6;
import tof.y6;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();
    public static final List f = u.c(y6.CARD_PAYMENT);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final List f213861g = v.k(v6.PENDING, v6.COMPLETED);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wsg.n f213862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xua.a f213863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pae.b f213864c;
    public final kgm.i d;
    public final whf.b e;

    public d(wsg.n walletInteractor, xua.a recurringPaymentInteractor, pae.b state, kgm.i searchTransformer, whf.b transactionsContentProvider) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(recurringPaymentInteractor, "recurringPaymentInteractor");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(searchTransformer, "searchTransformer");
        Intrinsics.checkNotNullParameter(transactionsContentProvider, "transactionsContentProvider");
        this.f213862a = walletInteractor;
        this.f213863b = recurringPaymentInteractor;
        this.f213864c = state;
        this.d = searchTransformer;
        this.e = transactionsContentProvider;
    }
}
