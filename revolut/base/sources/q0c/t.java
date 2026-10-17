package q0c;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lk0.e f241248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k71.q f241249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f241250c;

    public t(lk0.e page, k71.q transactionsExtraData, List months) {
        Intrinsics.checkNotNullParameter(page, "page");
        Intrinsics.checkNotNullParameter(transactionsExtraData, "transactionsExtraData");
        Intrinsics.checkNotNullParameter(months, "months");
        this.f241248a = page;
        this.f241249b = transactionsExtraData;
        this.f241250c = months;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f241248a, tVar.f241248a) && Intrinsics.f(this.f241249b, tVar.f241249b) && Intrinsics.f(this.f241250c, tVar.f241250c);
    }

    public final int hashCode() {
        return this.f241250c.hashCode() + ((this.f241249b.hashCode() + (this.f241248a.hashCode() * 31)) * 31);
    }
}
