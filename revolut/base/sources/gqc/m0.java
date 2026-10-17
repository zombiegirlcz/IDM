package gqc;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class m0 {

    @NotNull
    public static final l0 Companion = new l0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f145654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f145655b;

    public /* synthetic */ m0(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(k0.f145649a.getDescriptor(), i, 3);
            throw null;
        }
        this.f145654a = str;
        this.f145655b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj2;
        return Intrinsics.f(this.f145654a, m0Var.f145654a) && Intrinsics.f(this.f145655b, m0Var.f145655b);
    }

    public final int hashCode() {
        return this.f145655b.hashCode() + (this.f145654a.hashCode() * 31);
    }

    public m0(String type, String value) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f145654a = type;
        this.f145655b = value;
    }
}
