package osd;

import al4.p;
import frd.k;
import jkh.g;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import ppk.f;
import wsg.n;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f229317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f229318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final al4.n f229319c;
    public final f d;
    public final a e;
    public final bm4.a f;

    public e(n walletInteractor, p creditCardProductFeatureTogglesInteractor, al4.n creditCardInteractor, f ratesInteractor, a creditCardNetWorthProductMapper, bm4.a creditCardEntryPointUiInteractor) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(creditCardProductFeatureTogglesInteractor, "creditCardProductFeatureTogglesInteractor");
        Intrinsics.checkNotNullParameter(creditCardInteractor, "creditCardInteractor");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(creditCardNetWorthProductMapper, "creditCardNetWorthProductMapper");
        Intrinsics.checkNotNullParameter(creditCardEntryPointUiInteractor, "creditCardEntryPointUiInteractor");
        this.f229317a = walletInteractor;
        this.f229318b = creditCardProductFeatureTogglesInteractor;
        this.f229319c = creditCardInteractor;
        this.d = ratesInteractor;
        this.e = creditCardNetWorthProductMapper;
        this.f = creditCardEntryPointUiInteractor;
    }

    @Override // frd.k
    public final Flow b() {
        return xam.a.h(new g((Continuation) null, this, 22), ((qx4.f) this.f229318b).j());
    }
}
