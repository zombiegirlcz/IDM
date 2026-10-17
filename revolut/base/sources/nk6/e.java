package nk6;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f216657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f216658b;

    public e(Data banks, String searchQuery) {
        Intrinsics.checkNotNullParameter(banks, "banks");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        this.f216657a = banks;
        this.f216658b = searchQuery;
    }

    public static e a(e eVar, Data banks, String searchQuery, int i) {
        if ((i & 1) != 0) {
            banks = eVar.f216657a;
        }
        if ((i & 2) != 0) {
            searchQuery = eVar.f216658b;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(banks, "banks");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        return new e(banks, searchQuery);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f216657a, eVar.f216657a) && Intrinsics.f(this.f216658b, eVar.f216658b);
    }

    public final int hashCode() {
        return this.f216658b.hashCode() + (this.f216657a.hashCode() * 31);
    }
}
