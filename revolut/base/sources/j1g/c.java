package j1g;

import cli.j;
import com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceDatesSelection;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelExperienceDatesSelection f170454a;

    public c() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f170454a, ((c) obj2).f170454a);
    }

    public final int hashCode() {
        return this.f170454a.hashCode();
    }

    public c(TravelExperienceDatesSelection datesSelection) {
        Intrinsics.checkNotNullParameter(datesSelection, "datesSelection");
        this.f170454a = datesSelection;
    }

    public /* synthetic */ c(int i) {
        this(TravelExperienceDatesSelection.NoDatesSelection.f92906a);
    }
}
