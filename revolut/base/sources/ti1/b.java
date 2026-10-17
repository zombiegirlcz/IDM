package ti1;

import cli.j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f271398a;

    public b(a selectedOption) {
        Intrinsics.checkNotNullParameter(selectedOption, "selectedOption");
        this.f271398a = selectedOption;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f271398a == ((b) obj2).f271398a;
    }

    public final int hashCode() {
        return this.f271398a.hashCode();
    }
}
