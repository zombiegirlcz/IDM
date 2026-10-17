package s0h;

import kotlin.jvm.internal.Intrinsics;
import zel.f;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f258958a;

    public a(f screenerInstrumentGroup) {
        Intrinsics.checkNotNullParameter(screenerInstrumentGroup, "screenerInstrumentGroup");
        this.f258958a = screenerInstrumentGroup;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f258958a == ((a) obj2).f258958a;
    }

    public final int hashCode() {
        return this.f258958a.hashCode();
    }
}
