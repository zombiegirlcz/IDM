package kr;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@mlm.g
public final class o0 {

    @NotNull
    public static final n0 Companion = new n0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f188552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l0 f188553b;

    public /* synthetic */ o0(int i, String str, l0 l0Var) {
        if (3 != (i & 3)) {
            qlm.j1.f(m0.f188528a.getDescriptor(), i, 3);
            throw null;
        }
        this.f188552a = str;
        this.f188553b = l0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj2;
        return Intrinsics.f(this.f188552a, o0Var.f188552a) && Intrinsics.f(this.f188553b, o0Var.f188553b);
    }

    public final int hashCode() {
        return this.f188553b.hashCode() + (this.f188552a.hashCode() * 31);
    }

    public o0(String scanType, l0 metadata) {
        Intrinsics.checkNotNullParameter(scanType, "scanType");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        this.f188552a = scanType;
        this.f188553b = metadata;
    }
}
