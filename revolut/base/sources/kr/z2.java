package kr;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@mlm.g
public final class z2 {

    @NotNull
    public static final y2 Companion = new y2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f188616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w2 f188617b;

    public /* synthetic */ z2(int i, String str, w2 w2Var) {
        if (3 != (i & 3)) {
            qlm.j1.f(x2.f188607a.getDescriptor(), i, 3);
            throw null;
        }
        this.f188616a = str;
        this.f188617b = w2Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z2)) {
            return false;
        }
        z2 z2Var = (z2) obj2;
        return Intrinsics.f(this.f188616a, z2Var.f188616a) && Intrinsics.f(this.f188617b, z2Var.f188617b);
    }

    public final int hashCode() {
        return this.f188617b.hashCode() + (this.f188616a.hashCode() * 31);
    }

    public z2(String scanType, w2 extraMetadata) {
        Intrinsics.checkNotNullParameter(scanType, "scanType");
        Intrinsics.checkNotNullParameter(extraMetadata, "extraMetadata");
        this.f188616a = scanType;
        this.f188617b = extraMetadata;
    }
}
