package ny3;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f220627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f220628b;

    public e(String text, d dVar) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f220627a = text;
        this.f220628b = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f220627a, eVar.f220627a) && Intrinsics.f(this.f220628b, eVar.f220628b);
    }

    public final int hashCode() {
        int iHashCode = this.f220627a.hashCode() * 31;
        d dVar = this.f220628b;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }
}
