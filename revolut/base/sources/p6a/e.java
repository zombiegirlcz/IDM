package p6a;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f233236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f233237b;

    public e(Data searchResult, String searchQuery) {
        Intrinsics.checkNotNullParameter(searchResult, "searchResult");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        this.f233236a = searchResult;
        this.f233237b = searchQuery;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f233236a, eVar.f233236a) && Intrinsics.f(this.f233237b, eVar.f233237b);
    }

    public final int hashCode() {
        return this.f233237b.hashCode() + (this.f233236a.hashCode() * 31);
    }
}
