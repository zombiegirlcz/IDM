package xx9;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f309420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f309421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f309422c;
    public final LinkedHashMap d;
    public final LinkedHashMap e;
    public final LinkedHashMap f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinkedHashMap f309423g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LinkedHashMap f309424h;
    public final LinkedHashMap i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinkedHashMap f309425j;

    public h(LinkedHashMap localContacts, LinkedHashMap remoteContacts, LinkedHashMap virtualContacts, LinkedHashMap beneficiaries, LinkedHashMap cryptoAddresses, LinkedHashMap charities, LinkedHashMap cardOwnersMap, LinkedHashMap groupsMap, LinkedHashMap apmContactsMap, LinkedHashMap counterpartiesMap) {
        Intrinsics.checkNotNullParameter(localContacts, "localContacts");
        Intrinsics.checkNotNullParameter(remoteContacts, "remoteContacts");
        Intrinsics.checkNotNullParameter(virtualContacts, "virtualContacts");
        Intrinsics.checkNotNullParameter(beneficiaries, "beneficiaries");
        Intrinsics.checkNotNullParameter(cryptoAddresses, "cryptoAddresses");
        Intrinsics.checkNotNullParameter(charities, "charities");
        Intrinsics.checkNotNullParameter(cardOwnersMap, "cardOwnersMap");
        Intrinsics.checkNotNullParameter(groupsMap, "groupsMap");
        Intrinsics.checkNotNullParameter(apmContactsMap, "apmContactsMap");
        Intrinsics.checkNotNullParameter(counterpartiesMap, "counterpartiesMap");
        this.f309420a = localContacts;
        this.f309421b = remoteContacts;
        this.f309422c = virtualContacts;
        this.d = beneficiaries;
        this.e = cryptoAddresses;
        this.f = charities;
        this.f309423g = cardOwnersMap;
        this.f309424h = groupsMap;
        this.i = apmContactsMap;
        this.f309425j = counterpartiesMap;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f309420a.equals(hVar.f309420a) && this.f309421b.equals(hVar.f309421b) && this.f309422c.equals(hVar.f309422c) && this.d.equals(hVar.d) && this.e.equals(hVar.e) && this.f.equals(hVar.f) && this.f309423g.equals(hVar.f309423g) && this.f309424h.equals(hVar.f309424h) && this.i.equals(hVar.i) && this.f309425j.equals(hVar.f309425j);
    }

    public final int hashCode() {
        return this.f309425j.hashCode() + r6.b.e(this.i, r6.b.e(this.f309424h, r6.b.e(this.f309423g, r6.b.e(this.f, r6.b.e(this.e, r6.b.e(this.d, r6.b.e(this.f309422c, r6.b.e(this.f309421b, this.f309420a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
