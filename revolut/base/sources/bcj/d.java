package bcj;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f14453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wk5.a f14454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f14455c;

    public d() {
        this(0);
    }

    public static d a(d dVar, xi0.b bVar, wk5.a aVar, Data cryptoDepositAddressData, int i) {
        if ((i & 1) != 0) {
            bVar = dVar.f14453a;
        }
        if ((i & 2) != 0) {
            aVar = dVar.f14454b;
        }
        if ((i & 4) != 0) {
            cryptoDepositAddressData = dVar.f14455c;
        }
        dVar.getClass();
        Intrinsics.checkNotNullParameter(cryptoDepositAddressData, "cryptoDepositAddressData");
        return new d(bVar, aVar, cryptoDepositAddressData);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f14453a, dVar.f14453a) && this.f14454b == dVar.f14454b && Intrinsics.f(this.f14455c, dVar.f14455c);
    }

    public final int hashCode() {
        xi0.b bVar = this.f14453a;
        int iHashCode = (bVar == null ? 0 : bVar.hashCode()) * 31;
        wk5.a aVar = this.f14454b;
        return this.f14455c.hashCode() + ((iHashCode + (aVar != null ? aVar.hashCode() : 0)) * 31);
    }

    public d(xi0.b bVar, wk5.a aVar, Data cryptoDepositAddressData) {
        Intrinsics.checkNotNullParameter(cryptoDepositAddressData, "cryptoDepositAddressData");
        this.f14453a = bVar;
        this.f14454b = aVar;
        this.f14455c = cryptoDepositAddressData;
    }

    public /* synthetic */ d(int i) {
        this(null, null, new Data(null, null, true, 3, null));
    }
}
