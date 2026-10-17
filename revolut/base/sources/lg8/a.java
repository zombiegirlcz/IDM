package lg8;

import com.revolut.feature.junior_graduation.api.model.PersonalisedGraduationData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PersonalisedGraduationData f195083a;

    public a(PersonalisedGraduationData personalisationData) {
        Intrinsics.checkNotNullParameter(personalisationData, "personalisationData");
        this.f195083a = personalisationData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f195083a, ((a) obj2).f195083a);
    }

    public final int hashCode() {
        return this.f195083a.hashCode();
    }
}
