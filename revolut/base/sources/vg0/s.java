package vg0;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class s implements u {

    @NotNull
    public static final r Companion = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f288714a;

    public s(b0 credential) {
        Intrinsics.checkNotNullParameter(credential, "credential");
        this.f288714a = credential;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s) && Intrinsics.f(this.f288714a, ((s) obj2).f288714a);
    }

    public final int hashCode() {
        return this.f288714a.hashCode();
    }
}
