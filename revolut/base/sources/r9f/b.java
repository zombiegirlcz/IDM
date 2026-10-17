package r9f;

import com.revolut.feature.trading.transfer.investments.api.domain.model.TransferBroker;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferBroker f252599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f252600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f252601c;

    public b(TransferBroker transferBroker, String accountId, Set hiddenInstruments) {
        Intrinsics.checkNotNullParameter(transferBroker, "transferBroker");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(hiddenInstruments, "hiddenInstruments");
        this.f252599a = transferBroker;
        this.f252600b = accountId;
        this.f252601c = hiddenInstruments;
    }

    public final String b() {
        return this.f252600b;
    }

    public final Set c() {
        return this.f252601c;
    }

    public final TransferBroker d() {
        return this.f252599a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f252599a, bVar.f252599a) && Intrinsics.f(this.f252600b, bVar.f252600b) && Intrinsics.f(this.f252601c, bVar.f252601c);
    }

    public final int hashCode() {
        return this.f252601c.hashCode() + p.a.c(this.f252599a.hashCode() * 31, 31, this.f252600b);
    }
}
