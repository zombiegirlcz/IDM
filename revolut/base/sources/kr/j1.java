package kr;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@mlm.g
public final class j1 {

    @NotNull
    public static final i1 Companion = new i1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f188514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g1 f188515b;

    public /* synthetic */ j1(int i, String str, g1 g1Var) {
        if (3 != (i & 3)) {
            qlm.j1.f(h1.f188507a.getDescriptor(), i, 3);
            throw null;
        }
        this.f188514a = str;
        this.f188515b = g1Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj2;
        return Intrinsics.f(this.f188514a, j1Var.f188514a) && Intrinsics.f(this.f188515b, j1Var.f188515b);
    }

    public final int hashCode() {
        return this.f188515b.hashCode() + (this.f188514a.hashCode() * 31);
    }

    public j1(String scanType, g1 extraMetadata) {
        Intrinsics.checkNotNullParameter(scanType, "scanType");
        Intrinsics.checkNotNullParameter(extraMetadata, "extraMetadata");
        this.f188514a = scanType;
        this.f188515b = extraMetadata;
    }
}
