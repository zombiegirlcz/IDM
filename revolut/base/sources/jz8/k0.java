package jz8;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class k0 {

    @NotNull
    public static final j0 Companion = new j0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f179635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f179636b;

    public /* synthetic */ k0(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(i0.f179633a.getDescriptor(), i, 3);
            throw null;
        }
        this.f179635a = str;
        this.f179636b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj2;
        return Intrinsics.f(this.f179635a, k0Var.f179635a) && Intrinsics.f(this.f179636b, k0Var.f179636b);
    }

    public final int hashCode() {
        return this.f179636b.hashCode() + (this.f179635a.hashCode() * 31);
    }

    public k0(String id10, String text) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(text, "text");
        this.f179635a = id10;
        this.f179636b = text;
    }
}
