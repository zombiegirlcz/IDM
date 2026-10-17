package c59;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21476a;

    public /* synthetic */ d(int i, String str) {
        if (1 == (i & 1)) {
            this.f21476a = str;
        } else {
            j1.f(b.f21475a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f21476a, ((d) obj2).f21476a);
    }

    public final int hashCode() {
        return this.f21476a.hashCode();
    }

    public d(String mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f21476a = mode;
    }
}
