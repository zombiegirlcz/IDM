package m1c;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f201354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f201355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f201356c;

    public e(d type, String str, Integer num) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f201354a = type;
        this.f201355b = str;
        this.f201356c = num;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f201354a == eVar.f201354a && Intrinsics.f(this.f201355b, eVar.f201355b) && Intrinsics.f(this.f201356c, eVar.f201356c);
    }

    public final int hashCode() {
        int iHashCode = this.f201354a.hashCode() * 31;
        String str = this.f201355b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.f201356c;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }
}
