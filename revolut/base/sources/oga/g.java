package oga;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f225071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f225072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f225073c;

    public g(f nudge, String key, boolean z) {
        Intrinsics.checkNotNullParameter(nudge, "nudge");
        Intrinsics.checkNotNullParameter(key, "key");
        this.f225071a = nudge;
        this.f225072b = key;
        this.f225073c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f225071a, gVar.f225071a) && Intrinsics.f(this.f225072b, gVar.f225072b) && this.f225073c == gVar.f225073c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f225073c) + p.a.c(this.f225071a.hashCode() * 31, 31, this.f225072b);
    }
}
