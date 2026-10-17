package kr;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@mlm.g
public final class b2 {

    @NotNull
    public static final a2 Companion = new a2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f188462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y1 f188463b;

    public /* synthetic */ b2(int i, String str, y1 y1Var) {
        if (3 != (i & 3)) {
            qlm.j1.f(z1.f188615a.getDescriptor(), i, 3);
            throw null;
        }
        this.f188462a = str;
        this.f188463b = y1Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b2)) {
            return false;
        }
        b2 b2Var = (b2) obj2;
        return Intrinsics.f(this.f188462a, b2Var.f188462a) && Intrinsics.f(this.f188463b, b2Var.f188463b);
    }

    public final int hashCode() {
        return this.f188463b.hashCode() + (this.f188462a.hashCode() * 31);
    }

    public b2(String scanType, y1 metadata) {
        Intrinsics.checkNotNullParameter(scanType, "scanType");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        this.f188462a = scanType;
        this.f188463b = metadata;
    }
}
