package psk;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import nel.n;

/* JADX INFO: loaded from: classes12.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f239500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f239501b;

    public e(n nVar, Data data) {
        this.f239500a = nVar;
        this.f239501b = data;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f239500a, eVar.f239500a) && Intrinsics.f(this.f239501b, eVar.f239501b);
    }

    public final int hashCode() {
        n nVar = this.f239500a;
        int iHashCode = (nVar == null ? 0 : nVar.hashCode()) * 31;
        Data data = this.f239501b;
        return iHashCode + (data != null ? data.hashCode() : 0);
    }
}
