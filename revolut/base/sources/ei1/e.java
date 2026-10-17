package ei1;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f126344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f126345b;

    public e(Data data, String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.f126344a = data;
        this.f126345b = query;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f126344a, eVar.f126344a) && Intrinsics.f(this.f126345b, eVar.f126345b);
    }

    public final int hashCode() {
        Data data = this.f126344a;
        return this.f126345b.hashCode() + ((data == null ? 0 : data.hashCode()) * 31);
    }
}
