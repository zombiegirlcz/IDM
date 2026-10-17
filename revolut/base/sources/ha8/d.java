package ha8;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f150460a;

    public d(Data juniorProfiles) {
        Intrinsics.checkNotNullParameter(juniorProfiles, "juniorProfiles");
        this.f150460a = juniorProfiles;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f150460a, ((d) obj2).f150460a);
    }

    public final int hashCode() {
        return this.f150460a.hashCode();
    }
}
