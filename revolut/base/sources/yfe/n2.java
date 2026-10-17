package yfe;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class n2 implements o2 {

    @NotNull
    public static final m2 Companion = new m2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f313286a;

    public /* synthetic */ n2(int i, String str) {
        if (1 == (i & 1)) {
            this.f313286a = str;
        } else {
            qlm.j1.f(l2.f313282a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n2) && Intrinsics.f(this.f313286a, ((n2) obj2).f313286a);
    }

    public final int hashCode() {
        return this.f313286a.hashCode();
    }

    public n2(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f313286a = value;
    }
}
