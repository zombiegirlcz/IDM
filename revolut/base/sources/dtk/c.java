package dtk;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import nel.n;

/* JADX INFO: loaded from: classes12.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final trk.a f117460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final afl.a f117461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f117462c;
    public final n d;

    public c(trk.a assetType, afl.a stats, List statsToShow, n instrument) {
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        Intrinsics.checkNotNullParameter(stats, "stats");
        Intrinsics.checkNotNullParameter(statsToShow, "statsToShow");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        this.f117460a = assetType;
        this.f117461b = stats;
        this.f117462c = statsToShow;
        this.d = instrument;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f117460a == cVar.f117460a && Intrinsics.f(this.f117461b, cVar.f117461b) && Intrinsics.f(this.f117462c, cVar.f117462c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.d((this.f117461b.hashCode() + (this.f117460a.hashCode() * 31)) * 31, 31, this.f117462c);
    }
}
