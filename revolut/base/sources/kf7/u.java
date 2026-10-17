package kf7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes22.dex */
@mlm.g
public final class u {

    @NotNull
    public static final t Companion = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f183312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f183313b;

    public /* synthetic */ u(int i, boolean z) {
        if (1 != (i & 1)) {
            j1.f(s.f183311a.getDescriptor(), i, 1);
            throw null;
        }
        this.f183312a = "";
        this.f183313b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f183312a, uVar.f183312a) && this.f183313b == uVar.f183313b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f183313b) + (this.f183312a.hashCode() * 31);
    }

    public u(String code, boolean z) {
        Intrinsics.checkNotNullParameter(code, "code");
        this.f183312a = code;
        this.f183313b = z;
    }
}
