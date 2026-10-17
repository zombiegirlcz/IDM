package mqa;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes13.dex */
@mlm.g
public final class o {

    @NotNull
    public static final n Companion = new n(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f207933a;

    public /* synthetic */ o(int i, String str) {
        if (1 == (i & 1)) {
            this.f207933a = str;
        } else {
            j1.f(m.f207932a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f207933a, ((o) obj2).f207933a);
    }

    public final int hashCode() {
        return this.f207933a.hashCode();
    }

    public o(String pan) {
        Intrinsics.checkNotNullParameter(pan, "pan");
        this.f207933a = pan;
    }
}
