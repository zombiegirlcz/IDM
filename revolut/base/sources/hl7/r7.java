package hl7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class r7 {

    @NotNull
    public static final q7 Companion = new q7();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153291a;

    public /* synthetic */ r7(int i, String str) {
        if (1 == (i & 1)) {
            this.f153291a = str;
        } else {
            qlm.j1.f(p7.f153256a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof r7) && Intrinsics.f(this.f153291a, ((r7) obj2).f153291a);
    }

    public final int hashCode() {
        return this.f153291a.hashCode();
    }
}
