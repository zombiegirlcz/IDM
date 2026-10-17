package sui;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f265777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f265778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f265779c;

    public h(Data config, Data terminals, Data revPointsAccountStatus) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(terminals, "terminals");
        Intrinsics.checkNotNullParameter(revPointsAccountStatus, "revPointsAccountStatus");
        this.f265777a = config;
        this.f265778b = terminals;
        this.f265779c = revPointsAccountStatus;
    }

    public static h a(h hVar, Data config, Data terminals, Data revPointsAccountStatus, int i) {
        if ((i & 1) != 0) {
            config = hVar.f265777a;
        }
        if ((i & 2) != 0) {
            terminals = hVar.f265778b;
        }
        if ((i & 4) != 0) {
            revPointsAccountStatus = hVar.f265779c;
        }
        hVar.getClass();
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(terminals, "terminals");
        Intrinsics.checkNotNullParameter(revPointsAccountStatus, "revPointsAccountStatus");
        return new h(config, terminals, revPointsAccountStatus);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f265777a, hVar.f265777a) && Intrinsics.f(this.f265778b, hVar.f265778b) && Intrinsics.f(this.f265779c, hVar.f265779c);
    }

    public final int hashCode() {
        return this.f265779c.hashCode() + kii.e.c(this.f265778b, this.f265777a.hashCode() * 31, 31);
    }
}
