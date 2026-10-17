package x54;

import com.revolut.feature.credit.application.plugins.api.models.birth_place.BirthCity;
import kotlin.jvm.internal.Intrinsics;
import s7a.c0;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BirthCity f302910a;

    public a(BirthCity selectedCity) {
        Intrinsics.checkNotNullParameter(selectedCity, "selectedCity");
        this.f302910a = selectedCity;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f302910a, ((a) obj2).f302910a);
    }

    public final int hashCode() {
        return this.f302910a.hashCode();
    }
}
