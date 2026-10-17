package vg0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class m0 implements o0 {

    @NotNull
    public static final l0 Companion = new l0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f288709a;

    public m0(b0 credential) {
        Intrinsics.checkNotNullParameter(credential, "credential");
        this.f288709a = credential;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m0) && Intrinsics.f(this.f288709a, ((m0) obj2).f288709a);
    }

    public final int hashCode() {
        return this.f288709a.hashCode();
    }
}
