package y54;

import com.revolut.feature.credit.application.plugins.api.models.birth_place.BirthCity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BirthCity f310985a;

    public h(BirthCity city) {
        Intrinsics.checkNotNullParameter(city, "city");
        this.f310985a = city;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f310985a, ((h) obj2).f310985a);
    }

    public final int hashCode() {
        return this.f310985a.hashCode();
    }
}
