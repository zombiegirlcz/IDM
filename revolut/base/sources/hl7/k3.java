package hl7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class k3 {

    @NotNull
    public static final j3 Companion = new j3();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f153168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f153169b;

    public /* synthetic */ k3(int i, String str, boolean z) {
        if (3 != (i & 3)) {
            qlm.j1.f(i3.f153143a.getDescriptor(), i, 3);
            throw null;
        }
        this.f153168a = str;
        this.f153169b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k3)) {
            return false;
        }
        k3 k3Var = (k3) obj2;
        return Intrinsics.f(this.f153168a, k3Var.f153168a) && this.f153169b == k3Var.f153169b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f153169b) + (this.f153168a.hashCode() * 31);
    }

    public k3(String type, boolean z) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f153168a = type;
        this.f153169b = z;
    }
}
