package dsb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qrb.i f117287a;

    public k(qrb.i tradeInstrumentData) {
        Intrinsics.checkNotNullParameter(tradeInstrumentData, "tradeInstrumentData");
        this.f117287a = tradeInstrumentData;
    }

    @Override // dsb.m
    public final qrb.k a() {
        return this.f117287a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f117287a, ((k) obj2).f117287a);
    }

    public final int hashCode() {
        return this.f117287a.hashCode();
    }
}
