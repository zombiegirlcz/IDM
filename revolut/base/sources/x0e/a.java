package x0e;

import jo3.b;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import wp5.y;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f301574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f301575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DateTime f301576c;

    public a(String id10, b amount, DateTime completedAt) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(completedAt, "completedAt");
        this.f301574a = id10;
        this.f301575b = amount;
        this.f301576c = completedAt;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f301574a, aVar.f301574a) && Intrinsics.f(this.f301575b, aVar.f301575b) && Intrinsics.f(this.f301576c, aVar.f301576c);
    }

    public final int hashCode() {
        return this.f301576c.hashCode() + y.e(this.f301575b, this.f301574a.hashCode() * 31, 31);
    }
}
