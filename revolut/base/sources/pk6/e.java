package pk6;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f236927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f236928b;

    public e(Data institution, String query) {
        Intrinsics.checkNotNullParameter(institution, "institution");
        Intrinsics.checkNotNullParameter(query, "query");
        this.f236927a = institution;
        this.f236928b = query;
    }

    public static e a(e eVar, Data institution, String query, int i) {
        if ((i & 1) != 0) {
            institution = eVar.f236927a;
        }
        if ((i & 2) != 0) {
            query = eVar.f236928b;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(institution, "institution");
        Intrinsics.checkNotNullParameter(query, "query");
        return new e(institution, query);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f236927a, eVar.f236927a) && Intrinsics.f(this.f236928b, eVar.f236928b);
    }

    public final int hashCode() {
        return this.f236928b.hashCode() + (this.f236927a.hashCode() * 31);
    }
}
