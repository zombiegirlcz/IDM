package z2a;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f319045a;

    public i(Data personalisations) {
        Intrinsics.checkNotNullParameter(personalisations, "personalisations");
        this.f319045a = personalisations;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f319045a, ((i) obj2).f319045a);
    }

    public final int hashCode() {
        return this.f319045a.hashCode();
    }
}
