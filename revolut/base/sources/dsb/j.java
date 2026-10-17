package dsb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qrb.h f117286a;

    public j(qrb.h tradeInstrumentData) {
        Intrinsics.checkNotNullParameter(tradeInstrumentData, "tradeInstrumentData");
        this.f117286a = tradeInstrumentData;
    }

    @Override // dsb.m
    public final qrb.k a() {
        return this.f117286a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f117286a, ((j) obj2).f117286a);
    }

    public final int hashCode() {
        return this.f117286a.hashCode();
    }
}
