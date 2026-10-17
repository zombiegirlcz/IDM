package s7h;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes9.dex */
@mlm.g
public final class e {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f260826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f260827b;

    public /* synthetic */ e(int i, String str, k kVar) {
        if (3 != (i & 3)) {
            j1.f(c.f260825a.getDescriptor(), i, 3);
            throw null;
        }
        this.f260826a = str;
        this.f260827b = kVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f260826a, eVar.f260826a) && Intrinsics.f(this.f260827b, eVar.f260827b);
    }

    public final int hashCode() {
        return this.f260827b.f260832a.hashCode() + (this.f260826a.hashCode() * 31);
    }

    public e(String instrument, k locked) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(locked, "locked");
        this.f260826a = instrument;
        this.f260827b = locked;
    }
}
