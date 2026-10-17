package o2e;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f221613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f221614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f221615c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f221616g;

    public f(String banner, String rate, String description, String availability, String instructions, String instructionPrefix, String str) {
        Intrinsics.checkNotNullParameter(banner, "banner");
        Intrinsics.checkNotNullParameter(rate, "rate");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(availability, "availability");
        Intrinsics.checkNotNullParameter(instructions, "instructions");
        Intrinsics.checkNotNullParameter(instructionPrefix, "instructionPrefix");
        this.f221613a = banner;
        this.f221614b = rate;
        this.f221615c = description;
        this.d = availability;
        this.e = instructions;
        this.f = instructionPrefix;
        this.f221616g = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f221613a, fVar.f221613a) && Intrinsics.f(this.f221614b, fVar.f221614b) && Intrinsics.f(this.f221615c, fVar.f221615c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e) && Intrinsics.f(this.f, fVar.f) && Intrinsics.f(this.f221616g, fVar.f221616g);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(this.f221613a.hashCode() * 31, 31, this.f221614b), 31, this.f221615c), 31, this.d), 31, this.e), 31, this.f);
        String str = this.f221616g;
        return iC + (str == null ? 0 : str.hashCode());
    }
}
