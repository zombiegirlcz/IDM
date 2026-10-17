package k5e;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f181475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f181476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f181477c;

    public c() {
        this(null, null, null);
    }

    public static c a(c cVar, Data data, Data data2, Data data3, int i) {
        if ((i & 1) != 0) {
            data = cVar.f181475a;
        }
        if ((i & 2) != 0) {
            data2 = cVar.f181476b;
        }
        if ((i & 4) != 0) {
            data3 = cVar.f181477c;
        }
        cVar.getClass();
        return new c(data, data2, data3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f181475a, cVar.f181475a) && Intrinsics.f(this.f181476b, cVar.f181476b) && Intrinsics.f(this.f181477c, cVar.f181477c);
    }

    public final int hashCode() {
        Data data = this.f181475a;
        int iHashCode = (data == null ? 0 : data.hashCode()) * 31;
        Data data2 = this.f181476b;
        int iHashCode2 = (iHashCode + (data2 == null ? 0 : data2.hashCode())) * 31;
        Data data3 = this.f181477c;
        return iHashCode2 + (data3 != null ? data3.hashCode() : 0);
    }

    public c(Data data, Data data2, Data data3) {
        this.f181475a = data;
        this.f181476b = data2;
        this.f181477c = data3;
    }
}
