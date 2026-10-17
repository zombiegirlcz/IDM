package yk5;

import com.revolut.feature.crypto.remittance.models.CounterpartyRequiredFields;
import com.revolut.feature.crypto.remittance.models.CryptoAddressCounterparty;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f314566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f314567b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f314568c;
    public final List d;
    public final b e;
    public final CryptoAddressCounterparty f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CounterpartyRequiredFields f314569g;

    public a(String groupId, e state, d dVar, List returnReasons, b bVar, CryptoAddressCounterparty cryptoAddressCounterparty, CounterpartyRequiredFields counterpartyRequiredFields) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(returnReasons, "returnReasons");
        this.f314566a = groupId;
        this.f314567b = state;
        this.f314568c = dVar;
        this.d = returnReasons;
        this.e = bVar;
        this.f = cryptoAddressCounterparty;
        this.f314569g = counterpartyRequiredFields;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f314566a, aVar.f314566a) && this.f314567b == aVar.f314567b && Intrinsics.f(this.f314568c, aVar.f314568c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f314569g, aVar.f314569g);
    }

    public final int hashCode() {
        int iHashCode = (this.f314567b.hashCode() + (this.f314566a.hashCode() * 31)) * 31;
        d dVar = this.f314568c;
        int iD = p.a.d((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.d);
        b bVar = this.e;
        int iHashCode2 = (iD + (bVar == null ? 0 : bVar.hashCode())) * 31;
        CryptoAddressCounterparty cryptoAddressCounterparty = this.f;
        int iHashCode3 = (iHashCode2 + (cryptoAddressCounterparty == null ? 0 : cryptoAddressCounterparty.hashCode())) * 31;
        CounterpartyRequiredFields counterpartyRequiredFields = this.f314569g;
        return iHashCode3 + (counterpartyRequiredFields != null ? counterpartyRequiredFields.hashCode() : 0);
    }
}
