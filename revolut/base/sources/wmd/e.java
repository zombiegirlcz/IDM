package wmd;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f298640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f298641b;

    public e(dj0.d total, Map byCategoryId) {
        Intrinsics.checkNotNullParameter(total, "total");
        Intrinsics.checkNotNullParameter(byCategoryId, "byCategoryId");
        this.f298640a = total;
        this.f298641b = byCategoryId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f298640a.equals(eVar.f298640a) && this.f298641b.equals(eVar.f298641b);
    }

    public final int hashCode() {
        return this.f298641b.hashCode() + (this.f298640a.hashCode() * 31);
    }
}
