package qe1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f245050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f245051b;

    public e(String name, String rateString) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(rateString, "rateString");
        this.f245050a = name;
        this.f245051b = rateString;
    }

    public static e a(e eVar, String name, String rateString, int i) {
        if ((i & 1) != 0) {
            name = eVar.f245050a;
        }
        if ((i & 2) != 0) {
            rateString = eVar.f245051b;
        }
        eVar.getClass();
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(rateString, "rateString");
        return new e(name, rateString);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f245050a, eVar.f245050a) && Intrinsics.f(this.f245051b, eVar.f245051b);
    }

    public final int hashCode() {
        return this.f245051b.hashCode() + (this.f245050a.hashCode() * 31);
    }
}
