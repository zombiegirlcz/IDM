package yq5;

import cli.g;
import cli.y;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.send.confirmation.remaining_limit.CryptoSendRemainingLimitControllerContract$Input;
import kotlin.jvm.internal.Intrinsics;
import oki.h;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends h implements b {
    public final se5.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f315988p;

    public c(d stateMapper, CryptoSendRemainingLimitControllerContract$Input input, se5.a cryptoFaqKeysProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(cryptoFaqKeysProvider, "cryptoFaqKeysProvider");
        this.o = cryptoFaqKeysProvider;
        this.f315988p = mra.d.b(this, new a(input.f71331a), stateMapper, null, false, 12);
    }

    @Override // cli.z
    public final g getState() {
        return this.f315988p;
    }
}
