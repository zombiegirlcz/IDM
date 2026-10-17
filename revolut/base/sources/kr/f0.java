package kr;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@mlm.g
public final class f0 {

    @NotNull
    public static final e0 Companion = new e0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f188492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c0 f188493b;

    public /* synthetic */ f0(int i, String str, c0 c0Var) {
        if (3 != (i & 3)) {
            qlm.j1.f(d0.f188476a.getDescriptor(), i, 3);
            throw null;
        }
        this.f188492a = str;
        this.f188493b = c0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj2;
        return Intrinsics.f(this.f188492a, f0Var.f188492a) && Intrinsics.f(this.f188493b, f0Var.f188493b);
    }

    public final int hashCode() {
        return this.f188493b.hashCode() + (this.f188492a.hashCode() * 31);
    }

    public f0(String scanType, c0 metadata) {
        Intrinsics.checkNotNullParameter(scanType, "scanType");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        this.f188492a = scanType;
        this.f188493b = metadata;
    }
}
