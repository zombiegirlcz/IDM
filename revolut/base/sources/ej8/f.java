package ej8;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f126779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f126780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f126781c;

    public f(dj0.d customAmount, String note) {
        Intrinsics.checkNotNullParameter(customAmount, "customAmount");
        Intrinsics.checkNotNullParameter(note, "note");
        this.f126779a = customAmount;
        this.f126780b = note;
        this.f126781c = yhm.j.b(new e58.e(this, 12));
    }

    public static f a(f fVar, dj0.d customAmount, String note, int i) {
        if ((i & 1) != 0) {
            customAmount = fVar.f126779a;
        }
        if ((i & 2) != 0) {
            note = fVar.f126780b;
        }
        fVar.getClass();
        Intrinsics.checkNotNullParameter(customAmount, "customAmount");
        Intrinsics.checkNotNullParameter(note, "note");
        return new f(customAmount, note);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f126779a, fVar.f126779a) && Intrinsics.f(this.f126780b, fVar.f126780b);
    }

    public final int hashCode() {
        return this.f126780b.hashCode() + (this.f126779a.hashCode() * 31);
    }
}
