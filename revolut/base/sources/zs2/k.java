package zs2;

import com.revolut.data.model.Data;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class k implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f324792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f324793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f324794c;
    public final String d;

    public k(Data filteredContacts, String query, List contacts, boolean z) {
        Intrinsics.checkNotNullParameter(contacts, "contacts");
        Intrinsics.checkNotNullParameter(filteredContacts, "filteredContacts");
        Intrinsics.checkNotNullParameter(query, "query");
        this.f324792a = z;
        this.f324793b = contacts;
        this.f324794c = filteredContacts;
        this.d = query;
    }

    public static k a(k kVar, boolean z, List contacts, Data filteredContacts, String query, int i) {
        if ((i & 1) != 0) {
            z = kVar.f324792a;
        }
        if ((i & 2) != 0) {
            contacts = kVar.f324793b;
        }
        if ((i & 4) != 0) {
            filteredContacts = kVar.f324794c;
        }
        if ((i & 8) != 0) {
            query = kVar.d;
        }
        kVar.getClass();
        Intrinsics.checkNotNullParameter(contacts, "contacts");
        Intrinsics.checkNotNullParameter(filteredContacts, "filteredContacts");
        Intrinsics.checkNotNullParameter(query, "query");
        return new k(filteredContacts, query, contacts, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f324792a == kVar.f324792a && Intrinsics.f(this.f324793b, kVar.f324793b) && Intrinsics.f(this.f324794c, kVar.f324794c) && Intrinsics.f(this.d, kVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + kii.e.c(this.f324794c, p.a.d(Boolean.hashCode(this.f324792a) * 31, 31, this.f324793b), 31);
    }
}
