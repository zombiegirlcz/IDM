package mf5;

import com.revolut.feature.crypto.exchange.fees.api.model.CryptoExchangeFeesDialogMode;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CryptoExchangeFeesDialogMode f204904a;

    public a(CryptoExchangeFeesDialogMode mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f204904a = mode;
    }

    public final CryptoExchangeFeesDialogMode b() {
        return this.f204904a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f204904a == ((a) obj2).f204904a;
    }

    public final int hashCode() {
        return this.f204904a.hashCode();
    }
}
