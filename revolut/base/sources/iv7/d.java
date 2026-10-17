package iv7;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f168764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f168765b;

    public d(Data user, Data reviewDetails) {
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(reviewDetails, "reviewDetails");
        this.f168764a = user;
        this.f168765b = reviewDetails;
    }

    public static d a(d dVar, Data user, Data reviewDetails, int i) {
        if ((i & 1) != 0) {
            user = dVar.f168764a;
        }
        if ((i & 2) != 0) {
            reviewDetails = dVar.f168765b;
        }
        dVar.getClass();
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(reviewDetails, "reviewDetails");
        return new d(user, reviewDetails);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f168764a, dVar.f168764a) && Intrinsics.f(this.f168765b, dVar.f168765b);
    }

    public final int hashCode() {
        return this.f168765b.hashCode() + (this.f168764a.hashCode() * 31);
    }
}
