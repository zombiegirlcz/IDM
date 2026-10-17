package grc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jrc.f f145962a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f145963b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f145964c;

    public a() {
        this(0);
    }

    public static a a(a aVar, jrc.f fVar, String pattern, boolean z, int i) {
        if ((i & 1) != 0) {
            fVar = aVar.f145962a;
        }
        if ((i & 2) != 0) {
            pattern = aVar.f145963b;
        }
        if ((i & 4) != 0) {
            z = aVar.f145964c;
        }
        aVar.getClass();
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        return new a(fVar, pattern, z);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f145962a, aVar.f145962a) && Intrinsics.f(this.f145963b, aVar.f145963b) && this.f145964c == aVar.f145964c;
    }

    public final int hashCode() {
        jrc.f fVar = this.f145962a;
        return Boolean.hashCode(this.f145964c) + p.a.c((fVar == null ? 0 : fVar.hashCode()) * 31, 31, this.f145963b);
    }

    public a(jrc.f fVar, String pattern, boolean z) {
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        this.f145962a = fVar;
        this.f145963b = pattern;
        this.f145964c = z;
    }

    public /* synthetic */ a(int i) {
        this(null, "[0000] [0000] [0000] [0000] [000]", false);
    }
}
