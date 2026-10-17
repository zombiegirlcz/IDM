package oga;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f225065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f225066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f225067c;

    public e(String label, String deeplink, d dVar) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f225065a = label;
        this.f225066b = deeplink;
        this.f225067c = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f225065a, eVar.f225065a) && Intrinsics.f(this.f225066b, eVar.f225066b) && this.f225067c == eVar.f225067c;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f225065a.hashCode() * 31, 31, this.f225066b);
        d dVar = this.f225067c;
        return iC + (dVar == null ? 0 : dVar.hashCode());
    }
}
