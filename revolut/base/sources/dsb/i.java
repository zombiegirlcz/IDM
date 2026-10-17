package dsb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gsb.l f117284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qrb.k f117285b;

    public i(gsb.l state, qrb.k tradeInstrumentData) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(tradeInstrumentData, "tradeInstrumentData");
        this.f117284a = state;
        this.f117285b = tradeInstrumentData;
    }

    @Override // dsb.m
    public final qrb.k a() {
        return this.f117285b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f117284a, iVar.f117284a) && Intrinsics.f(this.f117285b, iVar.f117285b);
    }

    public final int hashCode() {
        return this.f117285b.hashCode() + (this.f117284a.hashCode() * 31);
    }
}
