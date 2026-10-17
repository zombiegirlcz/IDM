package zo5;

import com.google.common.collect.ImmutableSet;
import com.revolut.feature.crypto.withdraw.api.navigation.CryptoFeeBreakdownDialogInput;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f323944a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CryptoFeeBreakdownDialogInput f323945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e4m.e f323946c;

    public r(d dVar, f fVar, CryptoFeeBreakdownDialogInput cryptoFeeBreakdownDialogInput) {
        this.f323945b = cryptoFeeBreakdownDialogInput;
        this.f323946c = e4m.b.b(new vzc.h(dVar, 8, fVar, this));
    }

    @Override // xki.e
    public final Set f() {
        switch (this.f323944a) {
        }
        return ImmutableSet.of();
    }

    @Override // xki.e
    public final Set g() {
        switch (this.f323944a) {
        }
        return ImmutableSet.of();
    }

    public r(d dVar, CryptoFeeBreakdownDialogInput cryptoFeeBreakdownDialogInput) {
        this.f323945b = cryptoFeeBreakdownDialogInput;
        this.f323946c = e4m.b.b(new yf3.d(dVar, this, 17));
    }
}
