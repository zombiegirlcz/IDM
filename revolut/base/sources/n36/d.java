package n36;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f211881a;

    public /* synthetic */ d(int i, String str) {
        if (1 == (i & 1)) {
            this.f211881a = str;
        } else {
            j1.f(b.f211880a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f211881a, ((d) obj2).f211881a);
    }

    public final int hashCode() {
        return this.f211881a.hashCode();
    }

    public d(String currencyCode) {
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        this.f211881a = currencyCode;
    }
}
