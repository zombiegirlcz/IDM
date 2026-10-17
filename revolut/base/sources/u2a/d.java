package u2a;

import cli.j;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f276588a;

    public d(Data personalisations) {
        Intrinsics.checkNotNullParameter(personalisations, "personalisations");
        this.f276588a = personalisations;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f276588a, ((d) obj2).f276588a);
    }

    public final int hashCode() {
        return this.f276588a.hashCode();
    }
}
