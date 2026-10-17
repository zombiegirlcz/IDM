package auj;

import com.revolut.data.model.Data;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d0j.m f9842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f9843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f9844c;
    public final boolean d;

    public g(d0j.m type, Data challengesData, Map challengeUpdates, boolean z) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(challengesData, "challengesData");
        Intrinsics.checkNotNullParameter(challengeUpdates, "challengeUpdates");
        this.f9842a = type;
        this.f9843b = challengesData;
        this.f9844c = challengeUpdates;
        this.d = z;
    }

    public static g a(g gVar, Data challengesData, Map challengeUpdates, boolean z, int i) {
        d0j.m type = gVar.f9842a;
        if ((i & 8) != 0) {
            z = gVar.d;
        }
        gVar.getClass();
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(challengesData, "challengesData");
        Intrinsics.checkNotNullParameter(challengeUpdates, "challengeUpdates");
        return new g(type, challengesData, challengeUpdates, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f9842a == gVar.f9842a && Intrinsics.f(this.f9843b, gVar.f9843b) && Intrinsics.f(this.f9844c, gVar.f9844c) && this.d == gVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + p.a.e(kii.e.c(this.f9843b, this.f9842a.hashCode() * 31, 31), 31, this.f9844c);
    }
}
