package kr;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@mlm.g
public final class t2 {

    @NotNull
    public static final s2 Companion = new s2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f188584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e2 f188585b;

    public /* synthetic */ t2(int i, String str, e2 e2Var) {
        if (3 != (i & 3)) {
            qlm.j1.f(r2.f188570a.getDescriptor(), i, 3);
            throw null;
        }
        this.f188584a = str;
        this.f188585b = e2Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t2)) {
            return false;
        }
        t2 t2Var = (t2) obj2;
        return Intrinsics.f(this.f188584a, t2Var.f188584a) && Intrinsics.f(this.f188585b, t2Var.f188585b);
    }

    public final int hashCode() {
        return this.f188585b.hashCode() + (this.f188584a.hashCode() * 31);
    }

    public t2(String scanType, e2 extraMetadata) {
        Intrinsics.checkNotNullParameter(scanType, "scanType");
        Intrinsics.checkNotNullParameter(extraMetadata, "extraMetadata");
        this.f188584a = scanType;
        this.f188585b = extraMetadata;
    }
}
