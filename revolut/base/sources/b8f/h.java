package b8f;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class h implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f13231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f13232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f13233c;

    public h(Data templateIntro, Data riskMetrics, boolean z) {
        Intrinsics.checkNotNullParameter(templateIntro, "templateIntro");
        Intrinsics.checkNotNullParameter(riskMetrics, "riskMetrics");
        this.f13231a = templateIntro;
        this.f13232b = riskMetrics;
        this.f13233c = z;
    }

    public static h a(h hVar, Data templateIntro, Data riskMetrics, int i) {
        if ((i & 1) != 0) {
            templateIntro = hVar.f13231a;
        }
        if ((i & 2) != 0) {
            riskMetrics = hVar.f13232b;
        }
        boolean z = (i & 4) != 0 ? hVar.f13233c : true;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(templateIntro, "templateIntro");
        Intrinsics.checkNotNullParameter(riskMetrics, "riskMetrics");
        return new h(templateIntro, riskMetrics, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f13231a, hVar.f13231a) && Intrinsics.f(this.f13232b, hVar.f13232b) && this.f13233c == hVar.f13233c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f13233c) + kii.e.c(this.f13232b, this.f13231a.hashCode() * 31, 31);
    }
}
