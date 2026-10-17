package gdd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f143157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j f143158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f143159c;

    public e(String individualId, j token, String str) {
        Intrinsics.checkNotNullParameter(individualId, "individualId");
        Intrinsics.checkNotNullParameter(token, "token");
        this.f143157a = individualId;
        this.f143158b = token;
        this.f143159c = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f143157a, eVar.f143157a) && Intrinsics.f(this.f143158b, eVar.f143158b) && Intrinsics.f(this.f143159c, eVar.f143159c);
    }

    @Override // gdd.g
    public final j getToken() {
        return this.f143158b;
    }

    public final int hashCode() {
        int iHashCode = (this.f143158b.hashCode() + (this.f143157a.hashCode() * 31)) * 31;
        String str = this.f143159c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
