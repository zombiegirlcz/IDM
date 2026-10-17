package fqa;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f137227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f137228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f137229c;

    public e(c data, d extra, String str) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(extra, "extra");
        this.f137227a = data;
        this.f137228b = extra;
        this.f137229c = str;
    }

    @Override // fqa.g
    public final c a() {
        return this.f137227a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f137227a, eVar.f137227a) && Intrinsics.f(this.f137228b, eVar.f137228b) && Intrinsics.f(this.f137229c, eVar.f137229c);
    }

    public final int hashCode() {
        int iHashCode = (this.f137228b.hashCode() + (this.f137227a.hashCode() * 31)) * 31;
        String str = this.f137229c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
