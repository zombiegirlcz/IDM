package dtk;

import kotlin.jvm.internal.Intrinsics;
import nel.n;

/* JADX INFO: loaded from: classes12.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final trk.a f117465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f117466b;

    public e(trk.a aVar, n instrument) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        this.f117465a = aVar;
        this.f117466b = instrument;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f117465a == eVar.f117465a && Intrinsics.f(this.f117466b, eVar.f117466b);
    }

    public final int hashCode() {
        trk.a aVar = this.f117465a;
        return this.f117466b.hashCode() + ((aVar == null ? 0 : aVar.hashCode()) * 31);
    }
}
