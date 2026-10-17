package cz5;

import bz5.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f110159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f110160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f110161c;

    public a(String firstCurrencyCode, String secondCurrencyCode, d type) {
        Intrinsics.checkNotNullParameter(firstCurrencyCode, "firstCurrencyCode");
        Intrinsics.checkNotNullParameter(secondCurrencyCode, "secondCurrencyCode");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f110159a = firstCurrencyCode;
        this.f110160b = secondCurrencyCode;
        this.f110161c = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f110159a, aVar.f110159a) && Intrinsics.f(this.f110160b, aVar.f110160b) && this.f110161c == aVar.f110161c;
    }

    public final int hashCode() {
        return this.f110161c.hashCode() + p.a.c(this.f110159a.hashCode() * 31, 31, this.f110160b);
    }
}
