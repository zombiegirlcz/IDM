package chf;

import java.util.List;
import k71.q;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f24213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f24214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f24215c;

    public e(List incomeSorters, List rates, q transactionsExtraData) {
        Intrinsics.checkNotNullParameter(incomeSorters, "incomeSorters");
        Intrinsics.checkNotNullParameter(transactionsExtraData, "transactionsExtraData");
        Intrinsics.checkNotNullParameter(rates, "rates");
        this.f24213a = incomeSorters;
        this.f24214b = transactionsExtraData;
        this.f24215c = rates;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f24213a, eVar.f24213a) && Intrinsics.f(this.f24214b, eVar.f24214b) && Intrinsics.f(this.f24215c, eVar.f24215c);
    }

    public final int hashCode() {
        return this.f24215c.hashCode() + ((this.f24214b.hashCode() + (this.f24213a.hashCode() * 31)) * 31);
    }
}
