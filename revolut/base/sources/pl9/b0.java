package pl9;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class b0 {

    @NotNull
    public static final a0 Companion = new a0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f237290a;

    public /* synthetic */ b0(int i, String str) {
        if (1 == (i & 1)) {
            this.f237290a = str;
        } else {
            j1.f(z.f237314a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b0) && Intrinsics.f(this.f237290a, ((b0) obj2).f237290a);
    }

    public final int hashCode() {
        return this.f237290a.hashCode();
    }

    public b0(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f237290a = value;
    }
}
