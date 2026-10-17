package dsb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qrb.g f117281a;

    public f(qrb.g tradeInstrumentData) {
        Intrinsics.checkNotNullParameter(tradeInstrumentData, "tradeInstrumentData");
        this.f117281a = tradeInstrumentData;
    }

    @Override // dsb.m
    public final qrb.k a() {
        return this.f117281a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f117281a, ((f) obj2).f117281a);
    }

    public final int hashCode() {
        return this.f117281a.hashCode();
    }
}
