package dkh;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f115519a;

    public a(List convertedCashHoldings) {
        Intrinsics.checkNotNullParameter(convertedCashHoldings, "convertedCashHoldings");
        this.f115519a = convertedCashHoldings;
    }

    @Override // dkh.c
    public final List a() {
        return this.f115519a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f115519a, ((a) obj2).f115519a);
    }

    public final int hashCode() {
        return this.f115519a.hashCode();
    }
}
