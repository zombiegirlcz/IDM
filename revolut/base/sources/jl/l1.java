package jl;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@mlm.g
public final class l1 {

    @NotNull
    public static final k1 Companion = new k1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f175554a;

    public /* synthetic */ l1(int i, boolean z) {
        if (1 == (i & 1)) {
            this.f175554a = z;
        } else {
            qlm.j1.f(j1.f175545a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l1) && this.f175554a == ((l1) obj2).f175554a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f175554a);
    }

    public final String toString() {
        return "SelfieTaskConfig(showIntro=" + this.f175554a + ")";
    }
}
