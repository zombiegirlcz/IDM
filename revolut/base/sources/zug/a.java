package zug;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f325452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f325453b;

    public a() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f325452a == aVar.f325452a && Intrinsics.f(this.f325453b, aVar.f325453b);
    }

    public final int hashCode() {
        int iHashCode = this.f325452a.hashCode() * 31;
        Data data = this.f325453b;
        return iHashCode + (data == null ? 0 : data.hashCode());
    }

    public a(c selectedTab, Data data) {
        Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
        this.f325452a = selectedTab;
        this.f325453b = data;
    }

    public /* synthetic */ a(int i) {
        this(c.CASH, null);
    }
}
