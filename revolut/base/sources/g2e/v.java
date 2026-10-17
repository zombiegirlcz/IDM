package g2e;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f140035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final co3.a f140036b;

    public v() {
        this(null, null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f140035a, vVar.f140035a) && Intrinsics.f(this.f140036b, vVar.f140036b);
    }

    public final int hashCode() {
        String str = this.f140035a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        co3.a aVar = this.f140036b;
        return iHashCode + (aVar != null ? aVar.hashCode() : 0);
    }

    public v(String str, co3.a aVar) {
        this.f140035a = str;
        this.f140036b = aVar;
    }
}
