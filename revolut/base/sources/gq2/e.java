package gq2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f145521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f145522b;

    public e(String termsId, String url2) {
        Intrinsics.checkNotNullParameter(termsId, "termsId");
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f145521a = termsId;
        this.f145522b = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f145521a, eVar.f145521a) && Intrinsics.f(this.f145522b, eVar.f145522b);
    }

    public final int hashCode() {
        return this.f145522b.hashCode() + (this.f145521a.hashCode() * 31);
    }

    @Override // gq2.g
    public final String q0() {
        return this.f145521a;
    }
}
