package wpe;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wi0.b f299229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wi0.b f299230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f299231c;

    public e(wi0.b removedCountryCode, wi0.b addedCountryCode, String str) {
        Intrinsics.checkNotNullParameter(removedCountryCode, "removedCountryCode");
        Intrinsics.checkNotNullParameter(addedCountryCode, "addedCountryCode");
        this.f299229a = removedCountryCode;
        this.f299230b = addedCountryCode;
        this.f299231c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f299229a, eVar.f299229a) && Intrinsics.f(this.f299230b, eVar.f299230b) && Intrinsics.f(this.f299231c, eVar.f299231c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f299229a.f297794a.hashCode() * 31, 31, this.f299230b.f297794a);
        String str = this.f299231c;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
