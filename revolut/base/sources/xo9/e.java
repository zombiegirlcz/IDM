package xo9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f307742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f307743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f307744c;
    public final d d;

    public e(Integer num, Integer num2, c cVar, d type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f307742a = num;
        this.f307743b = num2;
        this.f307744c = cVar;
        this.d = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f307742a, eVar.f307742a) && Intrinsics.f(this.f307743b, eVar.f307743b) && Intrinsics.f(this.f307744c, eVar.f307744c) && this.d == eVar.d;
    }

    public final int hashCode() {
        Integer num = this.f307742a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f307743b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        c cVar = this.f307744c;
        return this.d.hashCode() + ((iHashCode2 + (cVar != null ? cVar.hashCode() : 0)) * 31);
    }
}
