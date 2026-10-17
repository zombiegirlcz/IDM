package hrf;

import com.revolut.feature.transfer.models.quotes.TransferQuoteSplit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nrf.c f154811a;

    public b(nrf.c transferQuote) {
        Intrinsics.checkNotNullParameter(transferQuote, "transferQuote");
        this.f154811a = transferQuote;
    }

    @Override // hrf.c
    public final String a() {
        return this.f154811a.i;
    }

    @Override // hrf.c
    public final dj0.d b() {
        return this.f154811a.f218628l;
    }

    @Override // hrf.c
    public final dj0.d c() {
        return this.f154811a.e.f218633a;
    }

    @Override // hrf.c
    public final TransferQuoteSplit d() {
        return this.f154811a.f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f154811a, ((b) obj2).f154811a);
    }

    public final int hashCode() {
        return this.f154811a.hashCode();
    }
}
