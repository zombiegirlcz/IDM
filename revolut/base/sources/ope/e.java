package ope;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f227590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wi0.b f227591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f227592c;

    public e(wi0.b removedCountryCode, wi0.b addedCountryCode, String str) {
        Intrinsics.checkNotNullParameter(removedCountryCode, "removedCountryCode");
        Intrinsics.checkNotNullParameter(addedCountryCode, "addedCountryCode");
        this.f227590a = removedCountryCode;
        this.f227591b = addedCountryCode;
        this.f227592c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f227590a, eVar.f227590a) && Intrinsics.f(this.f227591b, eVar.f227591b) && Intrinsics.f(this.f227592c, eVar.f227592c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f227590a.f297794a.hashCode() * 31, 31, this.f227591b.f297794a);
        String str = this.f227592c;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
