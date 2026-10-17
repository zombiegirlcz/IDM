package j3b;

import com.revolut.data.model.Data;
import java.time.Instant;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Instant f170996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f170997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f170998c;

    public a(Instant instant, Data data, List list) {
        this.f170996a = instant;
        this.f170997b = data;
        this.f170998c = list;
    }

    public static a a(a aVar, Data data, List list, int i) {
        Instant instant = aVar.f170996a;
        if ((i & 2) != 0) {
            data = aVar.f170997b;
        }
        if ((i & 4) != 0) {
            list = aVar.f170998c;
        }
        aVar.getClass();
        return new a(instant, data, list);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f170996a, aVar.f170996a) && Intrinsics.f(this.f170997b, aVar.f170997b) && Intrinsics.f(this.f170998c, aVar.f170998c);
    }

    public final int hashCode() {
        Instant instant = this.f170996a;
        int iHashCode = (instant == null ? 0 : instant.hashCode()) * 31;
        Data data = this.f170997b;
        int iHashCode2 = (iHashCode + (data == null ? 0 : data.hashCode())) * 31;
        List list = this.f170998c;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }
}
