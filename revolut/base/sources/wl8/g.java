package wl8;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f298446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f298447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f298448c;
    public final zm3.f d;
    public final zm3.f e;

    public g(String searchQuery, Data suggestedContacts, Data searchContacts, zm3.f fVar, zm3.f fVar2) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(suggestedContacts, "suggestedContacts");
        Intrinsics.checkNotNullParameter(searchContacts, "searchContacts");
        this.f298446a = searchQuery;
        this.f298447b = suggestedContacts;
        this.f298448c = searchContacts;
        this.d = fVar;
        this.e = fVar2;
    }

    public static g a(g gVar, String str, Data data, Data data2, zm3.f fVar, zm3.f fVar2, int i) {
        if ((i & 1) != 0) {
            str = gVar.f298446a;
        }
        String searchQuery = str;
        if ((i & 2) != 0) {
            data = gVar.f298447b;
        }
        Data suggestedContacts = data;
        if ((i & 4) != 0) {
            data2 = gVar.f298448c;
        }
        Data searchContacts = data2;
        if ((i & 8) != 0) {
            fVar = gVar.d;
        }
        zm3.f fVar3 = fVar;
        if ((i & 16) != 0) {
            fVar2 = gVar.e;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(suggestedContacts, "suggestedContacts");
        Intrinsics.checkNotNullParameter(searchContacts, "searchContacts");
        return new g(searchQuery, suggestedContacts, searchContacts, fVar3, fVar2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f298446a, gVar.f298446a) && Intrinsics.f(this.f298447b, gVar.f298447b) && Intrinsics.f(this.f298448c, gVar.f298448c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e);
    }

    public final int hashCode() {
        int iC = kii.e.c(this.f298448c, kii.e.c(this.f298447b, this.f298446a.hashCode() * 31, 31), 31);
        zm3.f fVar = this.d;
        int iHashCode = (iC + (fVar == null ? 0 : fVar.hashCode())) * 31;
        zm3.f fVar2 = this.e;
        return iHashCode + (fVar2 != null ? fVar2.hashCode() : 0);
    }
}
