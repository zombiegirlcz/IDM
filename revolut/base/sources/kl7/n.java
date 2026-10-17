package kl7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class n {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f185361a;

    public /* synthetic */ n(int i, String str) {
        if (1 == (i & 1)) {
            this.f185361a = str;
        } else {
            qlm.j1.f(l.f185352a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f185361a, ((n) obj2).f185361a);
    }

    public final int hashCode() {
        return this.f185361a.hashCode();
    }
}
