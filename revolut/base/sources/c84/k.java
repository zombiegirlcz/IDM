package c84;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final as3.b f22094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final as3.a f22095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final as3.c f22096c;

    public k(as3.b filter, as3.a aVar, as3.c payload) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(payload, "payload");
        this.f22094a = filter;
        this.f22095b = aVar;
        this.f22096c = payload;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f22094a, kVar.f22094a) && Intrinsics.f(this.f22095b, kVar.f22095b) && Intrinsics.f(this.f22096c, kVar.f22096c);
    }

    public final int hashCode() {
        int iHashCode = this.f22094a.hashCode() * 31;
        as3.a aVar = this.f22095b;
        return this.f22096c.hashCode() + ((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31);
    }
}
