package r7c;

import dj0.d;
import ip0.v7;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f252080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f252081b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f252082c;
    public final String d;
    public final d e;
    public final LocalDate f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f252083g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d6c.c f252084h;

    public a(String id10, c type, b state, String title, d amount, LocalDate nextDate, boolean z, d6c.c receiverInfo) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(nextDate, "nextDate");
        Intrinsics.checkNotNullParameter(receiverInfo, "receiverInfo");
        this.f252080a = id10;
        this.f252081b = type;
        this.f252082c = state;
        this.d = title;
        this.e = amount;
        this.f = nextDate;
        this.f252083g = z;
        this.f252084h = receiverInfo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f252080a, aVar.f252080a) && this.f252081b == aVar.f252081b && this.f252082c == aVar.f252082c && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && this.f252083g == aVar.f252083g && Intrinsics.f(this.f252084h, aVar.f252084h);
    }

    public final int hashCode() {
        return this.f252084h.hashCode() + j6.a.c(y.a(v7.c(p.a.c((this.f252082c.hashCode() + ((this.f252081b.hashCode() + (this.f252080a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.f252083g);
    }
}
