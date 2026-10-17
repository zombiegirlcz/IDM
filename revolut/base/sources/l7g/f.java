package l7g;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f192601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f192602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f192603c;

    public f(String departureCityName, String arrivalCityName, List rules) {
        Intrinsics.checkNotNullParameter(departureCityName, "departureCityName");
        Intrinsics.checkNotNullParameter(arrivalCityName, "arrivalCityName");
        Intrinsics.checkNotNullParameter(rules, "rules");
        this.f192601a = departureCityName;
        this.f192602b = arrivalCityName;
        this.f192603c = rules;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f192601a, fVar.f192601a) && Intrinsics.f(this.f192602b, fVar.f192602b) && Intrinsics.f(this.f192603c, fVar.f192603c);
    }

    public final int hashCode() {
        return this.f192603c.hashCode() + p.a.c(this.f192601a.hashCode() * 31, 31, this.f192602b);
    }
}
