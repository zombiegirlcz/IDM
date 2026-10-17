package kn6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f186013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f186014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f186015c;

    public e(dj0.d amount, String institutionName, boolean z) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(institutionName, "institutionName");
        this.f186013a = amount;
        this.f186014b = institutionName;
        this.f186015c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f186013a, eVar.f186013a) && Intrinsics.f(this.f186014b, eVar.f186014b) && this.f186015c == eVar.f186015c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f186015c) + p.a.c(this.f186013a.hashCode() * 31, 31, this.f186014b);
    }
}
