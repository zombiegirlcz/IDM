package lbj;

import com.revolut.data.database.models.transaction.CryptoCounterpartyEmbeddedEntity;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f193690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f193691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f193692c;
    public final List d;
    public final c e;
    public final CryptoCounterpartyEmbeddedEntity f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f193693g;

    public b(String groupId, String str, e eVar, List list, c cVar, CryptoCounterpartyEmbeddedEntity cryptoCounterpartyEmbeddedEntity, a aVar) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        this.f193690a = groupId;
        this.f193691b = str;
        this.f193692c = eVar;
        this.d = list;
        this.e = cVar;
        this.f = cryptoCounterpartyEmbeddedEntity;
        this.f193693g = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f193690a, bVar.f193690a) && Intrinsics.f(this.f193691b, bVar.f193691b) && Intrinsics.f(this.f193692c, bVar.f193692c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f) && Intrinsics.f(this.f193693g, bVar.f193693g);
    }

    public final int hashCode() {
        int iHashCode = this.f193690a.hashCode() * 31;
        String str = this.f193691b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        e eVar = this.f193692c;
        int iHashCode3 = (iHashCode2 + (eVar == null ? 0 : eVar.hashCode())) * 31;
        List list = this.d;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        c cVar = this.e;
        int iHashCode5 = (iHashCode4 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        CryptoCounterpartyEmbeddedEntity cryptoCounterpartyEmbeddedEntity = this.f;
        int iHashCode6 = (iHashCode5 + (cryptoCounterpartyEmbeddedEntity == null ? 0 : cryptoCounterpartyEmbeddedEntity.hashCode())) * 31;
        a aVar = this.f193693g;
        return iHashCode6 + (aVar != null ? aVar.hashCode() : 0);
    }
}
