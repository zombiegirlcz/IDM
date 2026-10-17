package deb;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f113357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wi0.b f113358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f113359c;

    public j(int i, Data number, wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(number, "number");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        this.f113357a = number;
        this.f113358b = countryCode;
        this.f113359c = i;
    }

    public static j a(int i, Data number, wi0.b countryCode) {
        Intrinsics.checkNotNullParameter(number, "number");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        return new j(i, number, countryCode);
    }

    public static /* synthetic */ j b(j jVar, Data data) {
        wi0.b bVar = jVar.f113358b;
        int i = jVar.f113359c;
        jVar.getClass();
        return a(i, data, bVar);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f113357a, jVar.f113357a) && Intrinsics.f(this.f113358b, jVar.f113358b) && this.f113359c == jVar.f113359c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f113359c) + p.a.c(this.f113357a.hashCode() * 31, 31, this.f113358b.f297794a);
    }
}
