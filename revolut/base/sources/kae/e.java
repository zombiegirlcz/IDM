package kae;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f182470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f182471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ibd.h f182472c;

    public e(String originalLabel, String latestLabel, ibd.h type) {
        Intrinsics.checkNotNullParameter(originalLabel, "originalLabel");
        Intrinsics.checkNotNullParameter(latestLabel, "latestLabel");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f182470a = originalLabel;
        this.f182471b = latestLabel;
        this.f182472c = type;
    }

    public static e a(e eVar, String originalLabel, String latestLabel, int i) {
        if ((i & 1) != 0) {
            originalLabel = eVar.f182470a;
        }
        ibd.h type = eVar.f182472c;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(originalLabel, "originalLabel");
        Intrinsics.checkNotNullParameter(latestLabel, "latestLabel");
        Intrinsics.checkNotNullParameter(type, "type");
        return new e(originalLabel, latestLabel, type);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f182470a, eVar.f182470a) && Intrinsics.f(this.f182471b, eVar.f182471b) && this.f182472c == eVar.f182472c;
    }

    public final int hashCode() {
        return this.f182472c.hashCode() + p.a.c(this.f182470a.hashCode() * 31, 31, this.f182471b);
    }
}
