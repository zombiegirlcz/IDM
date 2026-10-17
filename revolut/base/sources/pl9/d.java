package pl9;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f237291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f237292b;

    public /* synthetic */ d(int i, String str, p pVar) {
        if (1 != (i & 1)) {
            j1.f(b.f237289a.getDescriptor(), i, 1);
            throw null;
        }
        this.f237291a = str;
        if ((i & 2) == 0) {
            this.f237292b = null;
        } else {
            this.f237292b = pVar;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f237291a, dVar.f237291a) && Intrinsics.f(this.f237292b, dVar.f237292b);
    }

    public final int hashCode() {
        int iHashCode = this.f237291a.hashCode() * 31;
        p pVar = this.f237292b;
        return iHashCode + (pVar == null ? 0 : pVar.hashCode());
    }
}
