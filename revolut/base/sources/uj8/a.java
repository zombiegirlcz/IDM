package uj8;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f280532a;

    public a(Data juniorProfiles) {
        Intrinsics.checkNotNullParameter(juniorProfiles, "juniorProfiles");
        this.f280532a = juniorProfiles;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f280532a, ((a) obj2).f280532a);
    }

    public final int hashCode() {
        return this.f280532a.hashCode();
    }
}
