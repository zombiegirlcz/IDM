package gok;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f145187a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f145188b;

    public e(String url2, String label) {
        Intrinsics.checkNotNullParameter(url2, "url");
        Intrinsics.checkNotNullParameter(label, "label");
        this.f145187a = url2;
        this.f145188b = label;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f145187a, eVar.f145187a) && Intrinsics.f(this.f145188b, eVar.f145188b);
    }

    public final int hashCode() {
        return this.f145188b.hashCode() + (this.f145187a.hashCode() * 31);
    }
}
