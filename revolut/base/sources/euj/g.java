package euj;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f129620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f129621b;

    public g() {
        this(0);
    }

    public static g a(g gVar, Data challengeDetails, int i) {
        if ((i & 1) != 0) {
            challengeDetails = gVar.f129620a;
        }
        boolean z = (i & 2) != 0 ? gVar.f129621b : true;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(challengeDetails, "challengeDetails");
        return new g(challengeDetails, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f129620a, gVar.f129620a) && this.f129621b == gVar.f129621b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f129621b) + (this.f129620a.hashCode() * 31);
    }

    public g(Data challengeDetails, boolean z) {
        Intrinsics.checkNotNullParameter(challengeDetails, "challengeDetails");
        this.f129620a = challengeDetails;
        this.f129621b = z;
    }

    public /* synthetic */ g(int i) {
        this(new Data(null, null, true, 3, null), false);
    }
}
