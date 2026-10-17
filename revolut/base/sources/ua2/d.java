package ua2;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f278518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f278519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f278520c;

    public d(Data contacts, Data beneficiaries, String searchQuery) {
        Intrinsics.checkNotNullParameter(contacts, "contacts");
        Intrinsics.checkNotNullParameter(beneficiaries, "beneficiaries");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        this.f278518a = contacts;
        this.f278519b = beneficiaries;
        this.f278520c = searchQuery;
    }

    public static d a(d dVar, Data contacts, Data beneficiaries, String searchQuery, int i) {
        if ((i & 1) != 0) {
            contacts = dVar.f278518a;
        }
        if ((i & 2) != 0) {
            beneficiaries = dVar.f278519b;
        }
        if ((i & 4) != 0) {
            searchQuery = dVar.f278520c;
        }
        dVar.getClass();
        Intrinsics.checkNotNullParameter(contacts, "contacts");
        Intrinsics.checkNotNullParameter(beneficiaries, "beneficiaries");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        return new d(contacts, beneficiaries, searchQuery);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f278518a, dVar.f278518a) && Intrinsics.f(this.f278519b, dVar.f278519b) && Intrinsics.f(this.f278520c, dVar.f278520c);
    }

    public final int hashCode() {
        return this.f278520c.hashCode() + kii.e.c(this.f278519b, this.f278518a.hashCode() * 31, 31);
    }
}
